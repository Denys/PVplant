# Vendor Evaluation Rubric — iWin-Type BIPV v3

## Purpose

This rubric turns vendor responses into a **decision-grade screening result** instead of an unstructured pile of PDFs.

## Knockout gates

A vendor should be treated as **not yet technically viable** if any of the following are missing or materially weak:

- current product revision and delta versus pilot/public references
- section drawing with cavity/chamber, actuator, feedthrough, and replaceable boundaries
- actual unit electrical datasheet with temperature coefficients
- internal subdivision and bypass topology
- allowed aggregation rules and isolation boundary
- earthing / insulation / leakage-fault concept
- connector, cable, and feedthrough definition
- controls architecture with fail-safe states
- thermal evidence and qualification basis for the offered build
- replacement procedure and recommissioning steps
- commissioning package with measurable acceptance limits

## Scoring scale

| Score | Meaning |
|---:|---|
| 0 | No response or unusable response |
| 1 | Pure marketing language; no technical evidence |
| 2 | Partial technical answer but key gaps remain |
| 3 | Adequate answer with limited evidence or residual ambiguity |
| 4 | Good answer with direct evidence and usable constraints |
| 5 | Strong answer with revision-controlled evidence and low residual ambiguity |

## Fields to score per question

- **Completeness** — did the vendor answer the actual question?
- **Evidence quality** — is there a datasheet, drawing, report, or procedure behind the statement?
- **Technical adequacy** — does the content support the intended architecture and risk posture?
- **Residual risk** — score 0–5 where **higher = worse**; use this as a penalty.

## Suggested weighted score

Use the workbook formula:

```text
Weighted Score = Weight × MAX(0, AVERAGE(Completeness, Evidence, Adequacy) - 0.5 × ResidualRisk)
```

Default weight mapping:
- Priority A → 5
- Priority B → 3

## Review outputs required after each vendor round

- all knockout items still open
- all rows scoring below 3.0 on technical adequacy
- all rows with residual risk ≥ 4
- all closure items with no contractual evidence
- all items that still block `Voc,max`, `Isc,max`, control fail-safe definition, or replacement boundary

## Decision labels

| Label | Meaning |
|---|---|
| Proceed | Technically credible for continued architecture work |
| Proceed with conditions | Viable, but only if named closure items are contractually resolved |
| Hold | Too many material gaps for a fair comparison |
| Reject for now | Knockout item missing or evidence quality unacceptable |