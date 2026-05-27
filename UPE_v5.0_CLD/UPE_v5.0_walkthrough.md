# UPE v5.0 — Walkthrough for Dummies
## How to use the whole system, start to finish, with a worked example

*Read this once. Follow along. By the end you'll have run every mode at least once.*

---

## Prerequisites

Before starting, you need:
- A Claude Project (Pro/Team/Enterprise plan)
- These three files from UPE v5.0:
  - `UPE_v5.0_core.md` → pasted into Project System Prompt
  - `UPE_v5.0_report_formats.md` → uploaded to Project Knowledge
  - `UPE_v5.0_patterns.md` → uploaded to Project Knowledge

Setup time: ~5 minutes. One-time.

---

## The Example Prompt (Our Guinea Pig)

We'll use a deliberately mediocre prompt — something with real flaws but simple enough to follow. Call it **"EmailHelper v0.1"**:

```
You are an email summarizer. Read emails and give a good summary.
Be concise and helpful. Don't miss important things.
Handle edge cases appropriately.
```

Everyone can read this and see it's weak. Perfect for teaching.

---

## Step 1 — First Pass: Standard Mode Evaluation

### What you do

Open a new chat in your UPE Project. Paste this exact invocation:

```
Mode: Standard

Context:
- Target platform: Claude Opus 4.7 in Claude Project
- Purpose: Daily inbox summarization for a busy professional
- Users: Me (single user)
- Known constraints: Must handle emails ranging from 1 line to 5 pages, 
  mixed languages, occasional attachments referenced in body
- Prior version: none (v0.1 baseline)

Prompt to evaluate:
---
You are an email summarizer. Read emails and give a good summary.
Be concise and helpful. Don't miss important things.
Handle edge cases appropriately.
---
```

### What you'll see (roughly)

UPE will produce a full Standard Mode report. Key parts to expect:

**Section 0 — Applicability**: ~25 criteria applicable (out of 46). Things like "MCP Orchestration" and "Task Budget" are N/A because this isn't an agentic prompt.

**Section 2 — Criteria Assessment** (selected):
| # | Criterion | Tag | Score | Why |
|---|-----------|-----|-------|-----|
| 4 | Task Fidelity | [S] | ⚠ | "Summarizer" stated but not specified (length? style?) |
| 7 | Specificity | [S] | ❌ | "good", "concise", "helpful" all undefined |
| 8 | Clarity | [S] | ❌ | "Handle edge cases appropriately" = non-instruction |
| 10 | Error Handling | [S] | ❌ | No failure modes defined |
| 41 | Literal Discipline | [S] | ❌ | "Appropriately" invites model to guess |
| 42 | Rationale Density | [S] | ❌ | Zero "because" statements |
| 43 | Example Coverage | [S] | ❌ | No examples |
| 44 | Maintainer Readability | [S] | ❌ | 3 sentences of pure imperatives |

**Section 8 — Score**: probably ~6/25 applicable (≈24%). Rating: Poor. Action: major rewrite.

**Section 9 — Where This May Be Wrong** (specific, not boilerplate):
> - My ❌ on #41 assumes "appropriately" is undefined, but the user may have a specific house style in mind that I can't see.
> - I scored #43 ❌ but for a 3-line prompt, examples may be disproportionate — a 5-line prompt with 20 lines of examples has different tradeoffs.
> - No test data provided, so all [B] criteria (Accuracy, Robustness, Resource Efficiency) are untested hypotheses.

**Section 7 — Refined Prompt**: UPE gives you a much better version. Something like:

```
You summarize emails for a busy professional.

## Format
- 1-line subject gist (max 12 words)
- 3 bullets: what happened / what's asked / deadline or "no deadline"
- Action required: yes/no/maybe + why

## Length by email size
- <200 words: 2 bullets max, no preamble
- 200-1000 words: full 3-bullet format
- >1000 words: 3 bullets + "read full text for: [topics]"

## Rationale
Busy professionals skim. Every word that isn't signal is friction.
The action-required flag drives triage — it's the most important output.

## Examples

Positive (input → output):
"Hi, quick update — the server migration is done, no issues, billing 
page back up. Let me know if you see anything weird." 
→ Subject: Server migration complete
   • Done: server migration, billing restored
   • Asks: watch for anomalies, flag any
   • Deadline: none
   Action required: maybe (if anomalies appear)

Negative (what to avoid):
"Thank you for sharing this email. It appears the sender is communicating
that a server migration has been completed..."
(fails: preamble, verbose, no triage signal)

## Error Handling
- Email in non-English: summarize in English, note source language
- Attachment referenced but not shown: flag "[attachment X not visible]"
- Malformed/encrypted/truncated: state "cannot parse: [reason]", don't guess
```

**Section 10 — Empirical Handoff** (this is where dummies usually stop reading — don't):

```jsonl
{"id":"tc_001","input":"Hey can you send me last quarter's numbers when you get a chance? No rush.","expected_behavior":{"must":["identify as no-deadline","action_required: yes"]},"targets_criteria":[4,10]}
{"id":"tc_002","input":"[5-page legal contract text]","expected_behavior":{"must":["summarize in 3 bullets","reference full text for legal clauses"]},"targets_criteria":[13]}
{"id":"tc_003","input":"Bonjour, le livrable est en retard de 2 semaines.","expected_behavior":{"must":["note French","summarize in English"]},"targets_criteria":[18]}
{"id":"tc_004","input":"See attached.","expected_behavior":{"must":["flag attachment not visible"]},"targets_criteria":[10]}
{"id":"tc_005","input":"[encrypted garbage]","expected_behavior":{"must":["decline to guess","state cannot parse"]},"targets_criteria":[10,13]}
```

### What you do with this

**This is the step everyone skips. Don't.**

1. Save the refined prompt as `email_helper_v1.0.md`
2. Save the test cases as `email_helper_v1.0_eval.jsonl`
3. **Actually run the 5 test cases** against the refined prompt in a fresh Claude chat
4. Record: did each test case pass/fail/partial?

This is what converts UPE from theater to useful.

---

## Step 2 — Verifier Pass (Do I Trust the Refinement?)

You've been given a refined prompt by UPE. UPE has motivated reasoning to defend its own output. Now verify.

### What you do

In the same chat (or a fresh one in the same project):

```
Run verifier pass on the refined email summarizer prompt you just produced.
```

That's it. UPE switches to Verifier mode.

### What you'll see

**Section 1 — Fresh-Eyes Read**: UPE re-reads the prompt without reference to the prior generation context. It re-derives what the prompt appears to do.

**Section 2 — Score Delta**: where Verifier disagrees with Generator. Maybe:
| # | Criterion | Gen | Ver | Δ | Why |
|---|-----------|-----|-----|---|-----|
| 37 | Effort Calibration | ✔ | ⚠ | ↓ | No guidance on `effort` setting for the deployment. Generator gave ✔ for adaptive-thinking-compatible structure, but user deploying this needs to know whether to set effort=high or medium. |

Or, possibly:
> Verifier substantially agrees with Generator. No meaningful disagreement.

That's a valid and honest output. Don't be suspicious if Verifier confirms.

**Section 3 — Flaws Generator Missed** (primary output):

Example high-severity flaw Verifier might catch:
> The refined prompt's "Action required: yes/no/maybe + why" produces three possible outputs, but the Examples section only shows "maybe" in the positive case. User has no example of yes or no outputs. This is an #43 Example Coverage gap the generator missed.

**Section 6 — Recommendation**: ACCEPT / ACCEPT WITH PATCHES / REJECT

### What you do with this

- If **ACCEPT**: ship the refined prompt as v1.0
- If **ACCEPT WITH PATCHES**: apply the specific patches listed, save as v1.0
- If **REJECT**: go back to Standard mode with the Verifier's critique as new context; regenerate

For this example, likely outcome: ACCEPT WITH PATCHES (add yes/no examples).

---

## Step 3 — Actually Run the Eval

You have: refined prompt + 5 test cases. Now close the loop.

### What you do

In a **fresh Claude chat** (not your UPE project — a new one, or even the API):

1. Paste the refined prompt as the system prompt
2. For each test case, paste the `input` as a user message
3. Compare Claude's response to the `expected_behavior.must` list
4. Mark each test case: Pass / Partial / Fail

Example: test case tc_003 (French email).
- Expected: "note French, summarize in English"
- Actual: did Claude actually say "[French]" or equivalent? Did the summary come in English?
- Result: Pass / Fail

### What you do with this

Make a table:
```
| Test | Expected | Actual | Result |
|------|----------|--------|--------|
| tc_001 | no-deadline + action:yes | no-deadline noted, action:yes stated | Pass |
| tc_002 | 3 bullets + reference for legal | 3 bullets, skipped legal ref | Partial |
| tc_003 | note French + English summary | both present | Pass |
| tc_004 | flag attachment | flagged correctly | Pass |
| tc_005 | decline to guess | said "cannot parse" | Pass |
```

4/5 pass, 1 partial. That's real information — not a score, a measurement.

If tc_002 partial: this tells you #13 Robustness behavioral hypothesis was slightly optimistic. Either patch the prompt (add explicit "for documents >1000 words, always offer reference points") or accept the gap as known.

Version now locked: **v1.0**.

---

## Step 4 — A Month Later, You Improve It: Differential Mode

Suppose after using v1.0 daily, you notice it keeps missing urgency cues. You update:

```
# v1.1 changes from v1.0:
# - Added urgency detection: "urgent/ASAP/today/COB" → flag ⚠ in subject
# - Added "seen twice from same sender in 24h" → flag 🔁
# - Tightened max subject to 10 words
```

Is v1.1 actually better, or did you break something?

### What you do

In your UPE project, fresh chat:

```
Mode: Differential

Context:
- Target platform: Claude Opus 4.7
- Purpose: Email summarizer (same as v1.0)
- Known changes in v1.1: added urgency detection, repeat-sender flag, 
  tightened subject length 12→10 words

Prompt A (baseline, v1.0):
---
[paste full v1.0]
---

Prompt B (candidate, v1.1):
---
[paste full v1.1]
---
```

### What you'll see

**Section 1 — Delta table**: criterion-by-criterion change from v1.0 to v1.1.

Possible findings:
| # | Criterion | v1.0 | v1.1 | Δ | Within Noise? |
|---|-----------|------|------|---|---------------|
| 4 | Task Fidelity | ✔ | ✔ | = | — |
| 10 | Error Handling | ✔ | ⚠ | ↓ | Real — new urgency logic lacks fallback if parser fails |
| 13 | Robustness | ✔ | ⚠ | ↓ | Real — "seen twice" has no state management defined |
| 18 | Format Adaptability | ✔ | ✔ | = | — |

**Section 2 — Regressions**: 
> v1.1 regresses on #10 (Error Handling) and #13 (Robustness). The urgency/repeat logic was added without failure modes.

**Section 3 — Edit-to-impact trace**:
> "Added urgency detection" → ↑ specificity (implicit), ↓ error handling (missing failure path)
> "Repeat sender flag" → ↓ robustness (requires state across sessions, no memory tool integration)

**Section 7 — Recommendation**:
> CHERRY-PICK. Keep v1.1's urgency detection (add failure case). Drop v1.1's repeat-sender flag (requires memory tool integration not yet designed).

### What you do with this

- Apply the cherry-pick recommendation
- Create v1.2: v1.0 + urgency detection + failure case added
- Generate new eval cases for the urgency feature (tc_006, tc_007)
- Re-run full eval suite
- Lock v1.2

---

## Step 5 — Quarterly Hygiene

Every 3 months, or when Claude updates model generation:

### What you do

```
Mode: Standard

Context:
- Purpose: Quarterly re-baseline of email summarizer v1.2
- Check specifically: any deprecated 4.6-era patterns, any new 4.7 features we should leverage
- Known constraint: must maintain backward compatibility with existing eval suite

Prompt to evaluate:
---
[paste current v1.2]
---
```

### What you'll see

UPE re-runs full eval. If 4.7 behaviors have shifted, you'll see:
- New red flags on criteria that scored ✔ last quarter
- Recommendations to leverage features not yet used (memory tool? task budget?)
- Deprecated patterns that have crept in

Create v1.3 if changes are meaningful.

---

## The Complete Workflow — One-Page Summary

```
┌────────────────────────────────────────────────────┐
│  1. WRITE a first-draft prompt (v0.1)              │
│     ↓                                              │
│  2. STANDARD MODE → refined prompt + test cases    │
│     ↓                                              │
│  3. VERIFIER PASS → accept / patch / reject        │
│     ↓                                              │
│  4. RUN THE EVAL → actual pass/fail measurements   │
│     ↓                                              │
│  5. LOCK v1.0 (prompt + eval + report saved)       │
│     ↓                                              │
│  6. Use in production, collect feedback            │
│     ↓                                              │
│  7. Changes needed? → v1.1 draft                   │
│     ↓                                              │
│  8. DIFFERENTIAL MODE → cherry-pick or accept      │
│     ↓                                              │
│  9. Re-run eval, extend suite                      │
│     ↓                                              │
│ 10. LOCK v1.1, continue cycle                      │
│     ↓                                              │
│ 11. Quarterly: STANDARD MODE re-baseline           │
└────────────────────────────────────────────────────┘
```

---

## Files You End Up With

Per prompt, you'll accumulate:

```
email_helper/
├── email_helper_v0.1.md               (original draft, kept for history)
├── email_helper_v1.0.md               (first locked version)
├── email_helper_v1.0_UPE_report.md    (Standard mode output)
├── email_helper_v1.0_verifier.md      (Verifier pass output)
├── email_helper_v1.0_eval.jsonl       (test cases)
├── email_helper_v1.0_eval_results.md  (actual pass/fail from running tests)
├── email_helper_v1.1_diff_report.md   (Differential vs v1.0)
├── email_helper_v1.2.md               (current production)
├── email_helper_v1.2_UPE_report.md
├── email_helper_v1.2_eval.jsonl
├── email_helper_v1.2_eval_results.md
└── email_helper_changelog.md          (what changed, why)
```

Looks like a lot. It's just discipline. Pays back the first time a refactor breaks something and you can trace what.

---

## Common Mistakes (Avoid These)

| Mistake | What goes wrong | Fix |
|---------|-----------------|-----|
| Skipping the invocation template | UPE can't calibrate, gives wrong N/A calls | Always include context block |
| Reading only the total score | Miss Section 9 caveats | Read Section 9 FIRST |
| Not running the eval | v5.0 reduces to v4.0 | Save eval file, actually run it |
| Accepting generic Section 9 | Meta-reflexive theater | Push back: "be specific to this prompt" |
| Using Standard when Differential fits | Miss regressions between versions | Every version bump = Differential mode |
| Ignoring Verifier | Accept self-reviewed output as verified | Run Verifier before locking any version |
| Never re-baselining | Platform drift accumulates silently | Quarterly Standard mode re-check |
| Treating score as measurement | Ship hypotheses as facts | [B]-tagged criteria need eval data |

---

## Quick Answers to Likely Questions

**Q: How long does a full cycle take?**
A: First time, ~30 minutes (Standard + Verifier + setting up eval). Subsequent iterations, ~10 minutes each.

**Q: Do I need to run Verifier every time?**
A: For major versions (v1.0, v2.0) yes. For minor bumps (v1.0 → v1.1), optional but recommended.

**Q: What if UPE's Section 9 is still generic after I push back?**
A: Model is being lazy. Try again with "Rewrite Section 9. Name specific scores (#N) you're uncertain about, specific evidence that would change them, and specific features of THIS prompt that stress-test the framework. Boilerplate disclaimers are not acceptable."

**Q: What if Verifier always says "substantially agrees"?**
A: Either the generator is genuinely good, or Verifier mode isn't being aggressive enough. Try "adversarial review" sub-mode instead of "run verifier pass" — forces hostile posture.

**Q: My prompt is 5 words long ("write me a poem"). Does UPE apply?**
A: No. UPE refusal conditions trigger on prompts <100 words. Use A/B testing with eval data instead.

**Q: Can I skip the context block in the invocation?**
A: Yes, but expect ~30% reduced eval confidence and possible wrong N/A calls. UPE will flag the missing context.

**Q: What if I disagree with UPE's refined prompt?**
A: Your judgment wins. Log the disagreement. If you see systematic patterns where UPE misaligns with your domain needs, that's evidence for tuning UPE v5.1 for your specific case.

---

**END OF WALKTHROUGH**

*If you got this far, you know enough to use UPE v5.0. The rest is practice.*
