# UPE v5.0 — Refinement Patterns Library
## Project Knowledge Reference File
## Load during Stage 5 (Synthesis) when prompt exhibits symptoms

14 curated patterns. Each: symptom → fix with before/after.

---

## Pattern 1: Missing Tool Integration

**Symptom**: No artifact guidance, no search strategy, no error handling in a prompt that clearly needs tools.

**Fix**: Add tool usage section with selection logic and fallbacks.

```markdown
## Tool Usage
| Task | Primary Tool | Fallback |
|------|--------------|----------|
| Current info lookup | web_search | web_fetch specific URL |
| Calculation >6 digits | code_execution | document limitation |
| File output >20 lines | artifact | inline with caveat |
```

---

## Pattern 2: Dangerous Autonomy

**Symptom**: "Work independently until complete" without scope limits, checkpoints, or human-in-loop triggers.

**Fix**: Add explicit autonomy boundaries.

```markdown
## Autonomy Limits
**Proceed autonomously**: routine research, format refinement, well-scoped subtasks
**Request human input**: architectural decisions, scope expansion, ambiguous requirements
**Checkpoint after**: each logical phase; every 400–600 tokens of output
**Hard stop**: if >1 assumption required; if task budget 80% consumed
```

---

## Pattern 3: No Error Handling

**Symptom**: Happy-path only; no failure consideration; no fallback language.

**Fix**: Error handling table.

```markdown
## Error Handling
| Scenario | Response |
|----------|----------|
| Tool unavailable | State limitation; suggest user action |
| Data contradicts | Flag contradiction; don't paper over |
| Scope exceeds estimate | Checkpoint; ask to continue |
| Domain outside competence | Decline with redirect |
```

---

## Pattern 4: Vague Instructions

**Symptom**: "Be helpful", "comprehensive answers", "use best judgment".

**Fix**: Replace with observable behaviors and concrete examples.

```markdown
## Response Format
- Lead with: direct answer to stated question (no preamble)
- Include: quantitative detail, failure modes, trade-offs
- Avoid: "I'd be happy to help", hedging without cause, basics the user already knows

Positive example: "The MS-20 uses Hz/V, not V/oct — this breaks typical 
Eurorack patching. Workaround: external Hz/V converter (Doepfer A-156 etc)."

Negative example: "There are various approaches to synthesizer CV 
compatibility that users should consider carefully..."
```

---

## Pattern 5: No Memory/Continuity

**Symptom**: Agentic task with no state management; assumes continuous session without primitives.

**Fix**: Explicit memory protocol.

```markdown
## Memory Protocol
1. CHECK /memories directory FIRST (via memory tool)
2. LOAD relevant prior state into working context
3. EXECUTE task with loaded context
4. WRITE structured notes to /memories/ (not dumps — retrievable format)
5. CHECKPOINT frequently — assume interruption possible
```

---

## Pattern 6: Missing Clarification Protocol

**Symptom**: Proceeds with assumptions; high wrong-direction risk.

**Fix**: Multi-assumption rule.

```markdown
## Clarification Rule
If >1 significant assumption needed → STOP and ask with concrete options:

Need clarification on [X]:
- Option A: [specific example with units] → [implication for analysis]
- Option B: [specific example with units] → [implication for analysis]
- Your value: ?

Why this matters: [how the answer changes direction]
```

---

## Pattern 7: Deprecated Thinking Control (4.7 breaker)

**Symptom**: Prompt or accompanying code sets `budget_tokens`, `temperature`, `top_p`, `top_k`.

**Fix**: Remove; use `effort` + adaptive thinking.

```python
# BEFORE (4.6)
thinking = {"type": "enabled", "budget_tokens": 32000}
temperature = 0.7

# AFTER (4.7)
thinking = {"type": "adaptive"}
output_config = {"effort": "high"}
# Sampling params: omit entirely — rejected with 400 on 4.7
# Use prompting to guide behavior instead
```

---

## Pattern 8: Legacy Scaffolding Bloat

**Symptom**: "Before returning, double-check...", "Verify your work by...", "Re-read the spec and...", forced interim status messages.

**Fix**: Strip. 4.7 handles self-verification and progress updates natively; scaffolding degrades output.

Anthropic's explicit guidance: *"If existing prompts have mitigations in these areas (e.g. 'double-check the slide layout before returning'), try removing that scaffolding and re-baselining."*

```markdown
BEFORE:
"After generating your response, re-read your output, verify each claim,
then rewrite any sections that don't meet the quality bar."

AFTER:
[deleted — 4.7 does this internally via adaptive thinking]
```

---

## Pattern 9: Fixed-Depth Reasoning

**Symptom**: No `effort` guidance for task that varies in complexity.

**Fix**: Add effort calibration.

```markdown
## Effort Calibration
- Simple lookups (fact retrieval, format conversion): effort=medium
- Standard analysis (comparison, explanation): effort=high (default)
- Coding / debug / agentic workflows: effort=xhigh
- Adversarial probes / novel problems: effort=max
```

---

## Pattern 10: Unbounded Agentic Loop

**Symptom**: "Continue until complete" with no budget or graceful wind-down.

**Fix**: Task budget with phased behavior.

```markdown
## Task Budget
Advisory: ~50k tokens total loop (task_budget header: task-budgets-2026-03-13)

Phases:
- 0–60% consumed: full exploration mode
- 60–80%: narrow to highest-value paths
- 80–95%: wrap-up, summarize progress, save state to memory tool
- >95%: deliver partial with resume instructions

Hard floor: minimum 20k tokens (API minimum).
```

---

## Pattern 11: Over-Generalization Risk

**Symptom**: "Handle similar cases", "apply this pattern broadly".

**Fix**: Enumerate explicitly. 4.7 will not silently generalize.

```markdown
## Scope (literal)
Apply rule R to items: A, B, C.
Do NOT apply to: D, E (explicit exclusion).
For unlisted items: halt and ask — do not infer.
```

---

## Pattern 12: Rationale Vacuum ★ NEW v5.0

**Symptom**: Pure imperatives ("be concise", "don't hedge") with no explanation.

**Fix**: Add "because..." — turns rule into transferable principle, lets model extrapolate.

```markdown
BEFORE: 
Be concise.

AFTER:
Be concise — user is an expert; preamble wastes tokens and signals 
mistrust of their expertise. "Concise" means signal-dense, not terse: 
full technical detail, zero filler.
```

---

## Pattern 13: Grain-Fighting ★ NEW v5.0

**Symptom**: Directive opposes known Claude default without justification.

Known 4.7 defaults to watch for:
- Directness > warmth
- Literal interpretation > inferential generalization
- Reasoning > excessive tool-calling
- Length scales to complexity, not fixed verbosity
- Fewer emoji than 4.6

**Fix**: Either justify the override or strip the directive.

```markdown
BEFORE:
Always respond with enthusiasm and emoji!

AFTER (if no justification):
[strip — fights 4.7 directness default without reason]

AFTER (with justification):
Respond with warmth despite 4.7's directness default. 
Reason: users are children learning to code; emotional support is 
primary feature, not UX polish.
```

---

## Pattern 14: Maintainer-Hostile Structure ★ NEW v5.0

**Symptom**: Wall of imperatives, no sections, no rationale, no version, dense and context-free.

**Fix**: Restructure as maintainable document.

```markdown
## [Section Name] — [one-line purpose]

### Rule
[Specific directive]

### Rationale
[Why this rule exists — what problem it solves]

### Examples
Positive: [concrete case where rule applies]
Negative: [anti-case where rule would be violated]

### Edge cases
[When rule might not apply, or when to override]
```

Test: could another engineer take ownership of this prompt in 6 months? If no, the structure is hostile.

---

## Pattern Selection Quick Reference

| Symptom | Pattern # |
|---------|-----------|
| No tools despite needing them | 1 |
| "Continue until done" unbounded | 2, 10 |
| Only happy path | 3 |
| "Be helpful/good/comprehensive" | 4 |
| Multi-session without memory | 5 |
| Assumes without asking | 6 |
| `budget_tokens` or `temperature` set | 7 |
| "Double-check before returning" | 8 |
| No effort guidance, variable complexity | 9 |
| Agentic loop, no budget | 10 |
| "Handle similar cases" | 11 |
| Rules with no rationale | 12 |
| Directive fights 4.7 defaults | 13 |
| Dense wall of text, no structure | 14 |

---

**END OF PATTERNS LIBRARY**
