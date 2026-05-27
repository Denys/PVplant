# PVplant — Codex Source Map v2
## iWin-type BIPV research repository · 2026-05-27

## Purpose
This file tells Codex where to look before making claims, where to write new evidence, and what belongs in each artifact. It complements root `AGENTS.md`.

## Root behavior file
| File | Role | Notes |
|---|---|---|
| `AGENTS.md` | Root behavior, task routing, evidence discipline | Use `PVplant_AGENTS_v3_Codex.md` content as replacement |

## Canonical knowledge / state files
| File | Role | Update when |
|---|---|---|
| `PVplant_iWin_BIPV_Knowledge_v2.md` | Canonical reliable-first facts, assumptions, direct values, derived indicators, H1–H4, voltage-domain rules | Any data, assumption, architecture, or calculation changes |
| `output_voltage_decision_schematic.md` | Voltage-domain correction and DC-link study bands | Any optimizer/microinverter/DC-link report references 30 V or bus voltage |
| `05_Assumption_Register.md` | Open assumptions and closure rules | Any unresolved decision-relevant assumption appears |
| `06_Standards_and_Design_Envelope.md` | Standards/design-envelope gates | Any architecture score, final preference, PCE/protection/isolation discussion |

## Active working docs
| File | Role |
|---|---|
| `01_Reading_Tracker.md` | Source extraction and decision impact log |
| `02_Weekly_Checklist.md` | Optional cadence/checklist |
| `03_iWin_FMEA_Template.md` | Electrical/control/glazing/service FMEA |
| `04_Capstone_Design_Memo_Template.md` | Report/memo skeleton |
| `07_Commissioning_and_Acceptance_Template.md` | Handover and measurable acceptance logic |
| `08_Vendor_Technical_Questionnaire.md` | Vendor closure request |
| `09_Vendor_Response_Matrix.tsv` | Structured response capture |
| `10_Vendor_Evaluation_Rubric.md` | Knockout gates/scoring |
| `11_Vendor_Data_Request_Cover_Note.md` | Controlled outbound note |
| `12_Vendor_Response_Workbook.xlsx` | Vendor scoring workbook |

## Context / literature / prior work
| File | Role | Caveat |
|---|---|---|
| `README_v2_iWin_Project_Companion.md` | Domain companion, public anchors, Pareto lessons | Good for framing; not vendor closure |
| `Building-Integrated Photovoltaics -- A Technical Guidebook - 2025 -Nuria Martín Chivelet.pdf` | BIPV guidebook context, design process, O&M | Cite page/section when used |
| `Norms and Pass Conditions.md` | Standard-by-standard explanatory notes | Verify current editions before new legal/standards claims |
| `BIPV Module Integrated Architecture Comparison.md` | Architecture report background | Extract assumptions; do not auto-adopt conclusions |
| `iWin BIPV Roadmap.md` | Roadmap and research direction | Use for sequencing |
| `Deck Analysis and Research.md` | Audit of prior decks | Use to avoid reintroducing unsupported claims |
| `Project research status.md` | Continuity snapshot | Treat as prior-state evidence, not closure |
| `Research_Prompt_Lugano_iWin_Office_Facade.md` | Deep research prompt | Useful for external research runs |
| `UPE_v4.1_Hybrid_Runtime_Framework.md` | Full UPE manual | Use only for serious framework/workflow tasks |
| `UPE_v4.1_KERNEL.md` | Generic UPE kernel reference | Do not replace BIPV role with generic UPE role |
| `BIPV_Project_References_UPE_v4_1.md` | Deployment/reference map | Use for source hygiene and ballast review |

## Reliability order for claims
1. Closed by vendor evidence / closed project decision
2. Verified public fact
3. Product-proximate technical evidence
4. Standards-backed framing
5. Project scenario inputs
6. Project-defined assumptions
7. Direct derived values
8. Secondary derived indicators
9. Contextual literature
10. Stale/conflicting values
11. General model knowledge

## Recommended repo update sequence
1. Add/inspect source in `01_Reading_Tracker.md`.
2. Update assumptions in `05_Assumption_Register.md`.
3. Update `PVplant_iWin_BIPV_Knowledge_v2.md`.
4. Update `06_Standards_and_Design_Envelope.md` for envelope/standards gates.
5. Update FMEA, commissioning, and vendor docs if risks/acceptance/closure change.
6. Update reports/prompts.
7. Update `AGENTS.md` only when behavior/routing changes.

## Ballast policy
Archive or demote: old prompt packs as active instructions, superseded standards, patch notes after decisions are absorbed, persuasive decks with unsupported claims, and calculation-demo placeholders that could be mistaken for baseline values.
