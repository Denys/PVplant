# UPE v5.0 — User Operation Guide

*How to actually drive the framework. Read this once. Refer back when confused.*

---

## 1. Deployment Architecture

Three files. Know where each goes.

| File | Location | Purpose | Loaded when? |
|------|----------|---------|--------------|
| `UPE_v5.0_core.md` | Claude Project → System Prompt | The framework itself | Every turn |
| `UPE_v5.0_report_formats.md` | Claude Project → Knowledge | Report templates + examples | Every turn (Project Knowledge is unconditional) |
| `UPE_v5.0_patterns.md` | Claude Project → Knowledge | 14 refinement patterns | Every turn |
| `UPE_v5.0_user_guide.md` | This file — personal docs | Your operating manual | Never loaded — you read it |

Rationale: core fits under the 4,000-token attention-degradation ceiling (≈3,750 tokens on 4.7 tokenizer). Templates and patterns live in Project Knowledge — accessible but don't burden core attention during criteria evaluation.

---

## 2. Mode Selection — Decision Tree

```
Is there an existing prior version to compare?
├── YES → Mode: Differential (A = baseline, B = candidate)
└── NO  → Continue
          │
          Is prompt <100 words or a single-shot classifier?
          ├── YES → Don't use UPE. A/B test with eval data.
          └── NO  → Continue
                    │
                    Is this a migration from 4.6 → 4.7?
                    ├── YES → Mode: Standard + flag "migration context"
                    └── NO  → Mode: Standard
```

**Edge cases**:
- Evaluating UPE itself → Standard, accept circularity note
- Evaluating someone else's prompt (no deployment context) → Standard, accept 30% confidence hit
- Evaluating a prompt that *generates* prompts (meta-prompt, DPP-style) → Standard, pay extra attention to Section 9

---

## 3. How to Invoke — Template

Bad invocation (UPE can't calibrate):
```
evaluate this prompt:
[paste]
```

Good invocation (UPE has deployment context, can apply refusal conditions and N/A correctly):
```
Mode: Standard

Context:
- Target platform: Claude Opus 4.7 via Claude Project
- Purpose: [specific use case — e.g., "analog synth IC selection assistant"]
- Users: [audience — e.g., "me, one other electronics engineer"]
- Known constraints: [e.g., "must fit 4,000-token core, reference library in Project Knowledge"]
- Prior version: [v2.0 / none]

Prompt to evaluate:
---
[paste]
---
```

For **Differential Mode**:
```
Mode: Differential

Context: [same structure]

Prompt A (baseline, v2.0):
---
[paste]
---

Prompt B (candidate, v2.1):
---
[paste]
---

Known changes in B: [brief changelog if available — helps Stage 6 edit-to-impact trace]
```

---

## 4. How to Read Outputs — Reading Order

Not top-to-bottom. Use this order:

**4a. First: Section 9 — "Where This Evaluation May Be Wrong"**

This is where honest information lives. If it reads generic, it is imitation — push back explicitly:

> "Redo Section 9 with specificity to THIS prompt — name which scores are most likely wrong, what evidence would change them, and any unusual features of this prompt that stress the framework."

Don't accept boilerplate here. The framework's value depends on it.

**4b. Second: Section 0 — Applicability Assessment**

How many criteria actually applied? If the denominator is small (<15), the total score is weakly informative. If many criteria were N/A, check the justifications are real, not lazy.

**4c. Third: Adaptive Control section**

For 4.7 deployments, this is where most legacy-prompt gaps live. Check effort calibration, task budget, scaffolding minimalism first.

**4d. Fourth: Gaps section**

Critical before Strengths. UPE tends to optimistic-bias on strengths; gaps are more actionable.

**4e. Last: Total score**

Read the breakdown, not the headline. A 38/42-applicable with 3 behavioral hypotheses is more meaningful than a 41/46 with 8 forced scores.

---

## 5. Criterion Tag Interpretation

Every criterion is tagged:

| Tag | Meaning | How to treat the score |
|-----|---------|------------------------|
| **[S]** Structural | Assessable from text | Trust the score (within reason) |
| **[B]** Behavioral | Hypothesis requiring execution | Treat as prediction. Generate test case. |
| **[E]** Empirical | Requires eval data | Not a score. A question for your eval suite. |

A prompt with 30 strong `[S]` scores and no validation of the `[B]` hypotheses is still a hypothesis in production. Don't confuse structural correctness with performance.

---

## 6. What to Do with the Empirical Handoff Bundle (Section 10)

This is the most-likely-to-be-ignored output. Ignoring it defeats v5.0's purpose.

**Minimum actions**:
1. Copy the generated test cases to `[prompt_name]_eval.jsonl` alongside the refined prompt
2. Run them against the refined prompt (Anthropic Console Eval Tool, or local harness)
3. Record pass/fail per case
4. Re-run on every subsequent revision — this is your regression suite

**For your existing personas**: SYNTHEX, AnaLog, KNOXUS, Daisy Expert, Aurora Mail, PRISM, DPP — each should have an accompanying `_eval.jsonl`. If they don't, Stage 7 output is pointing at the gap.

**Anti-pattern**: accepting a refined prompt without running its eval bundle, then claiming the refinement was good because the UPE score went up.

---

## 7. When to Override UPE

UPE is fallible. Override conditions:

| Situation | Override |
|-----------|----------|
| Short specific prompt outperforms "framework-correct" version in your testing | Keep the short one, document why |
| Criterion fires (⚠ or ❌) but is irrelevant to your actual use case | Mark N/A with justification, don't fix |
| UPE recommends adding structure that makes the prompt less maintainable | Your maintainability judgment wins |
| Production eval data contradicts UPE score | Eval data wins. Always. |
| UPE activates a pathway that feels wrong for the domain | Note disagreement, proceed with your judgment, review later |

**Log overrides**. Over time, systematic disagreements between UPE and your judgment reveal framework calibration issues worth fixing in v5.1.

---

## 8. Version Hygiene

For every prompt you maintain (SYNTHEX, AnaLog, etc.):

```
[persona]_v[N.N].md              — the prompt itself
[persona]_v[N.N]_UPE_report.md   — UPE evaluation at time of release
[persona]_v[N.N]_eval.jsonl      — test cases from Empirical Handoff
[persona]_v[N.N]_changelog.md    — what changed from v[N.N-1], why
```

**On every revision**:
1. Run Differential Mode (old vs. new)
2. Re-run the eval suite
3. Log any regressions in changelog
4. Update UPE report
5. Extend eval suite if new capabilities were added

**Retire a prompt when**:
- Platform context drifted (e.g., moved to new Claude generation)
- UPE v-new flags multiple legacy patterns in it
- Eval suite fails systematically (not just one case)

---

## 9. Meta-Reflexive Hygiene (yours, not UPE's)

UPE is only as honest as you force it to be. Defensive habits:

- **Reject boilerplate Section 9.** If it reads the same across two different evaluations, it's imitation. Push back.
- **Track your prediction hit-rate.** Did 90%+ UPE scores correlate with production success? If not, UPE is mis-calibrated for your domain.
- **Watch for score-chasing.** If you're editing prompts to raise UPE scores rather than solve real problems, the framework has captured you. Refocus on production performance.
- **Periodically score UPE itself.** Run UPE on UPE every 3–6 months. This is v5.0's own circularity test.

---

## 10. Common User Errors

| Error | Consequence | Fix |
|-------|-------------|-----|
| Skipping context block in invocation | 30% confidence hit, wrong N/A calls | Use the invocation template |
| Reading score top-down, stopping at total | Miss Section 9 and [B]-tag caveats | Read order: 9 → 0 → Adaptive → Gaps → Total |
| Ignoring Empirical Handoff bundle | v5.0 reduces to v4.0 | Save bundle, run eval, keep as regression |
| Accepting generic Section 9 | Meta-reflexive theater | Push back: "be specific to this prompt" |
| Running Standard Mode when Differential is needed | Miss regressions | Use Differential on every revision |
| Not logging UPE overrides | Lose calibration signal | Keep a disagreement log |
| Treating [B] hypotheses as measurements | False confidence in production | Generate test cases for every [B] that matters |

---

## 11. Escalation Paths

When UPE isn't the right tool:

| Situation | Go to |
|-----------|-------|
| Need actual performance numbers | Anthropic Console Eval Tool |
| Prompt injection resistance | Dedicated red-team harness |
| Short prompt A/B testing | Statistical A/B infrastructure |
| Domain safety-critical (medical, legal) | Expert review + UPE (not UPE alone) |
| Cross-model portability testing | Run eval suite across models |
| Production monitoring | Logging + eval sampling, not UPE |

UPE is structural pre-flight, not production telemetry.

---

## 12. Contributing Back

If you find:
- A systematic UPE mis-calibration in your domain
- A criterion that never fires in practice across 10+ evaluations
- A pattern that should be in the patterns library but isn't
- A refusal condition that's missing

Log it. Roll it into v5.1 / v6.0 as evidence-based, not speculative, changes.

---

**END OF USER GUIDE**
