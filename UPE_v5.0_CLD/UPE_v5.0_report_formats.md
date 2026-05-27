# UPE v5.0 — Report Formats
## Project Knowledge Reference File
## Load during Stages 5–6 (Synthesis, Delivery)

---

## Standard Mode Report Template

```markdown
# Prompt Evaluation: [Title]
Target platform: Claude Opus 4.7 | Mode: Standard | Date: [YYYY-MM-DD]

## 0. Applicability Assessment
- Applicable criteria: N / 46
- N/A criteria (with justification):
  - #[X]: [reason not applicable]
  - [etc.]
- Refusal check: [passed | condition-triggered: X]

## 1. Prompt Breakdown
Purpose: [one line]
Structure: [architecture — monolithic / modular / with reference files]
Intended outcomes: [what success looks like]
Deprecated 4.6-era patterns detected: [list or "none"]

## 2. Criteria Assessment

Format per criterion:
| # | Criterion | Tag | Score | Confidence | Justification |
|---|-----------|-----|-------|------------|---------------|

Scores: ✔ (pass) / ⚠ (partial) / ❌ (fail) / N/A (with reason)

### Core Alignment (1-3)
[Table]

### Fundamental Quality (4-13)
[Table]

### Advanced Capabilities (14-19)
[Table]

### Technical Integration (20-25)
[Table]

### Tool-Specific (26-30)
[Table]

### Agentic & Persistence (31-36)
[Table]

### Adaptive Control (37-41)
[Table]

### Prompt-as-Document (42-44)
[Table]

### Grain Alignment (45-46)
[Table]

## 3. Adaptive Control Assessment (4.7-specific)
| Dimension | ✔/⚠/❌ | Assessment |
|-----------|--------|------------|
| Effort level specified | | |
| Task budget declared (if agentic) | | |
| Adaptive thinking steered | | |
| Legacy scaffolding removed | | |
| Instructions sufficiently literal | | |

## 4. Strengths
- [Specific, not generic]

## 5. Identified Gaps
### Critical (blocks effectiveness)
- [item]

### Tool Integration
- [item]

### Adaptive Control
- [item]

### Prompt-as-Document / Grain
- [item]

## 6. Pathway Activation Log
| Tier | Pathway | Trigger | Resolution |
|------|---------|---------|------------|
| T1 | | | |
| T2 | | | |

## 7. Refined Prompt
```
[Full refined prompt in code block]
```

## 8. Effectiveness Score

| Category | Baseline Applicable | Refined | Δ | Confidence |
|----------|---------------------|---------|---|------------|
| Core (1-3)              | /3   | /3   |  | H |
| Fundamental (4-13)      | /10  | /10  |  | M-H |
| Advanced (14-19)        | /6   | /6   |  | M |
| Technical (20-25)       | /6   | /6   |  | H |
| Tool-Specific (26-30)   | /5   | /5   |  | H |
| Agentic (31-36)         | /6   | /6   |  | H |
| Adaptive Ctrl (37-41)   | /5   | /5   |  | H |
| Prompt-as-Doc (42-44)   | /3   | /3   |  | H |
| Grain (45-46)           | /2   | /2   |  | M |
| **TOTAL applicable**    | /N   | /N   |  |   |

Behavioral hypotheses: [list [B]-tagged scores — these are predictions]
Empirical unknowns: [list [E]-tagged items — need eval data]

## 9. Where This Evaluation May Be Wrong ★ REQUIRED

Must be SPECIFIC to THIS prompt. Self-check: would this read identically for a different prompt? If yes, rewrite.

- [Specific concern #1 — which score is most likely wrong, what evidence I lack]
- [Specific concern #2]
- [Specific concern #3]
- [Any unusual features of THIS prompt that stress-test the framework]

## 10. Empirical Handoff Bundle

### Test Cases (5–10)
```jsonl
{"input": "[test input]", "expected": "[behavior spec]", "targets_criteria": [4, 10, 37]}
{"input": "...", "expected": "...", "targets_criteria": [...]}
```

### Rubric
How to score test results against the 46-criterion framework:
- Pass criterion #N if: [specific observable behavior]
- Partial if: [degraded behavior pattern]
- Fail if: [anti-pattern observed]

### Regression Criteria
[B]-tagged hypotheses that need re-validation if prompt changes:
- #5 Accuracy Potential: [what test]
- #13 Robustness: [what test]
- [etc.]
```

---

## Differential Mode Report Template

```markdown
# Differential Evaluation: [Title A] → [Title B]
Target platform: Claude Opus 4.7 | Mode: Differential | Date: [YYYY-MM-DD]

## 0. Comparison Setup
- Prompt A (baseline): [version/name]
- Prompt B (candidate): [version/name]
- Known changes: [changelog if provided]
- Common applicability: N criteria applicable to both
- Divergent applicability: [criteria applicable to one but not the other]

## 1. Criterion-by-Criterion Delta

| # | Criterion | Tag | A Score | B Score | Δ | Within Noise? |
|---|-----------|-----|---------|---------|---|---------------|
| 1 | Model Capability | [S] | ✔ | ✔ | 0 | — |
| ... | | | | | | |

Δ legend: ↑ improved, ↓ regressed, = same, N→✓ added coverage, ✓→N removed coverage

## 2. Regression Flags
Critical: criteria that DROPPED from A to B
- [item + why it matters]

## 3. Edit-to-Impact Trace (best-effort)
| Likely Edit | Affected Criteria | Effect |
|-------------|-------------------|--------|
| [inferred change] | [#s] | [↑/↓/neutral] |

## 4. Philosophical Coherence Check
Did B drift from A's intent?
- Original purpose (A): [inferred or stated]
- Current purpose (B): [inferred or stated]
- Drift assessment: [aligned | minor drift | significant drift]

## 5. Pareto Analysis
What B traded for what:
- Gained: [criteria improved]
- Lost: [criteria regressed]
- Worth it? [judgment + rationale]

## 6. Noise Assessment
Deltas within confidence bands (likely not real improvements):
- [list — these Δs could be measurement noise]

Deltas likely real:
- [list]

## 7. Recommendation
Choice: **KEEP B** | **REVERT TO A** | **CHERRY-PICK**

If CHERRY-PICK: specific elements from B to retain, rest discard.

Rationale: [2-3 sentences]

## 8. Where This Evaluation May Be Wrong
- [Specific to the comparison — e.g., "my edit-to-impact trace assumes X but could be Y"]
- [Unusual features of this version pair]

## 9. Empirical Handoff
Both A and B should be run against the same eval suite. Test cases generated for A apply to B unless new capabilities were added.

If B added capabilities:
```jsonl
{"input": "[new test]", "expected": "[behavior]", "targets_criteria": [...]}
```
```

---

## Verifier Mode Report Template

```markdown
# Verifier Pass: [Prompt Title]
Target platform: Claude Opus 4.7 | Sub-mode: Neutral | Adversarial | Targeted | Date: [YYYY-MM-DD]

## 0. Verifier Posture Check
- Read refined prompt fresh: [yes — confirmed not referencing generator rationale]
- Generator context deliberately dropped: [yes]
- Adversarial intensity: [low / medium / high depending on sub-mode]

## 1. Fresh-Eyes Read
What does THIS prompt claim to do, inferred from its text alone?
- Purpose: [re-derived, not copied from Standard report]
- Scope: [re-derived]
- Target user: [re-derived]

Note any MISMATCH between what the prompt claims and what a fresh reader would understand.

## 2. Score Delta from Generator

Only list criteria where Verifier DISAGREES with the Standard-mode Generator scoring.

| # | Criterion | Gen Score | Verifier Score | Δ | Why Differs |
|---|-----------|-----------|----------------|---|-------------|
| [#] | [name] | [✔/⚠/❌] | [✔/⚠/❌] | [↑/↓/=] | [specific reason rooted in prompt text] |

If fewer than 3 disagreements:
> **Verifier substantially agrees with Generator.**
> Disagreements are within noise; no meaningful delta.

Do not manufacture disagreement.

## 3. Flaws the Generator Missed or Rationalized ★ PRIMARY OUTPUT

Ranked by severity:

### High Severity
- [Specific flaw — what it is, where in the prompt (line/section), why it matters, proposed fix]

### Medium Severity  
- [Same format]

### Low Severity / Nitpicks
- [Same format]

If no flaws at current severity level: state explicitly. Do not pad.

## 4. Where the Generator Got It Right
Non-trivial choices that withstand scrutiny:
- [Specific choice + why it's correct despite plausible alternatives]

Keep this brief — Verifier's job is finding flaws, not validating.

## 5. Where This Verifier Pass May Be Wrong

Meta-reflexive for the verifier itself:
- [Specific — "I may be over-critical on #X because I lack domain context Y"]
- [Specific — "My fresh-eyes read may have missed Z that the generator legitimately assumed"]
- [Any bias in my verification — adversarial mode may over-reach]

## 6. Recommendation

Choose one:
- **ACCEPT**: Refined prompt ships as-is. Verifier found no significant issues.
- **ACCEPT WITH PATCHES**: Ship after applying these specific edits: [list]
- **REJECT**: Return to generator for rework on: [specific items requiring full regeneration]

Rationale: [2-3 sentences]
```

---

## Verifier Mode — Specificity Checklist

Before submitting any verifier report:

| Check | Pass Criterion |
|-------|----------------|
| Section 1 re-derived from text, not copied | No phrases lifted verbatim from Standard report |
| Section 2 disagreements are real | Each Δ has a text-grounded reason, not preference |
| Section 3 flaws are actionable | Each has a location reference and proposed fix |
| Section 5 is specific to THIS verification | Rewrite test: would it apply to a different prompt? |
| "Substantially agrees" used when appropriate | Not manufacturing disagreement for show |
| Recommendation aligns with findings | ACCEPT when flaws are low-severity; REJECT only when high-severity unfixable |

---

## Example: Good vs. Bad Verifier Output

### ❌ Bad (imitation — mirrors generator)
```
## 2. Score Delta
[Lists all 42 criteria with Gen score repeated as Verifier score]

## 3. Flaws
- The prompt could be clearer
- Some sections could use more detail
- Overall structure is acceptable

## 6. Recommendation
ACCEPT
```
**Why bad**: no real re-evaluation; generic flaws; no delta where there should be (impossible for 42 criteria to match exactly on independent eval); flaws are vague.

### ✓ Good (functional)
```
## 2. Score Delta from Generator
| # | Criterion | Gen | Ver | Δ | Why |
|---|-----------|-----|-----|---|-----|
| 37 | Effort Calibration | ✔ | ⚠ | ↓ | Generator credited the prompt for mentioning "effort=high" but this is in a comment, not an actionable directive for the user deploying the prompt. Fresh read: unclear who sets effort. |
| 44 | Maintainer Readability | ✔ | ✔ | = | Confirmed on independent read. |

(2 disagreements total; substantially agrees.)

## 3. Flaws the Generator Missed

### High
- Lines 23-28 define tool fallbacks but never specify what to do if the fallback also fails. Generator scored #28 Tool Error Handling as ✔ but the chain terminates in silence. Fix: add terminal "if all tools fail: state limitation, ask user to provide manually."

### Medium
- The prompt says "use memory tool for cross-session state" but doesn't specify read-before-write pattern. Generator caught the overall memory integration but missed the read-first discipline.

## 6. Recommendation
ACCEPT WITH PATCHES — 1 high-severity fix (terminal error case), 1 medium-severity fix (memory read-first).
```
**Why good**: specific line references; real disagreements with reasoning; actionable fixes; appropriate recommendation tier.

---

Before submitting any report, Section 9 must pass ALL of these:

| Check | Pass Criterion |
|-------|----------------|
| Names a specific score number | Contains "#N" reference |
| Names what evidence would change it | Contains "would need X to verify" |
| Identifies unusual features | References specific content of THIS prompt |
| Would not apply to a different prompt | Rewrite test: substitute another prompt — does it still make sense? |
| Avoids boilerplate phrases | No: "scores are approximate", "YMMV", "framework has limitations" |

If any check fails, regenerate Section 9.

---

## Example: Good vs. Bad Section 9

### ❌ Bad (imitation)
```
## 9. Where This Evaluation May Be Wrong
- UPE scoring is approximate
- Framework has known limitations  
- Your mileage may vary with specific deployments
- Scores should be validated empirically
```
**Why bad**: identical content would apply to any prompt. Generic disclaimers. No specificity.

### ✓ Good (functional)
```
## 9. Where This Evaluation May Be Wrong

- I scored #29 Search Strategy Effectiveness at ⚠ [B], but this prompt's 
  search usage is embedded in a DSP domain I don't fully understand. The ⚠
  may be over-conservative; a domain expert might rate it ✔. Would need 
  5 actual synthesizer-DSP queries logged to verify.

- #42 Rationale Density scored ✔, but the rationales are terse and may 
  not transfer to a new maintainer who lacks the author's context. A fresh 
  engineer reading this in 6 months could disagree with my ✔.

- This prompt references "Daisy Seed" and "SSI2164" without definition. I 
  treated this as appropriate (#41 Literal Discipline: ✔) because expert 
  users need no definition, but if the actual user base is broader, the 
  score flips to ⚠.

- Behavioral hypotheses #5, #11, #17 all scored optimistically. I have no 
  execution data. If these prove wrong in testing, the overall score 
  drops from 38/42 to potentially 32/42.
```
**Why good**: each bullet specific to this prompt; each names which score could flip and what evidence would change it.

---

## Empirical Handoff — Test Case Generation Guide

Target: 5–10 test cases per prompt.

### Test Case Sources

1. **Per criterion [B]-hypothesis**: each behavioral criterion becomes at least one test case
2. **Per stated capability**: every claim in the prompt ("can do X") becomes a test
3. **Per edge case mentioned**: anything noted as "handle edge cases" becomes a specific edge case
4. **Adversarial probes**: 1–2 tests that try to break stated rules
5. **Domain-specific**: tests that exercise the prompt's claimed domain expertise

### Test Case Format

```jsonl
{
  "id": "tc_001",
  "input": "[user turn]",
  "expected_behavior": {
    "must": ["behavior 1", "behavior 2"],
    "must_not": ["anti-pattern 1"],
    "should": ["nice-to-have behavior"]
  },
  "targets_criteria": [4, 10, 37],
  "category": "structural|behavioral|edge_case|adversarial|domain"
}
```

### Rubric

How to grade test runs:
- **Pass**: all `must` behaviors observed, no `must_not` behaviors
- **Partial**: most `must` observed, minor issues
- **Fail**: missing `must` behaviors or exhibiting `must_not`
- **Ambiguous**: unclear whether behaviors occurred — mark for human review

---

**END OF REPORT FORMATS**
