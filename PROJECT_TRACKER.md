# Project Tracker

Last updated: 2026-05-26

## Workstreams

| Workstream | Status | Unlocks | Next Action |
|---|---|---|---|
| Agent infrastructure | Active | Future Codex sessions start from PVplant-specific instructions, state, and memory | Use scoped support-file validation; broad v0.2 audit is only a coarse signal in this repo |
| PVplant source inventory | Active | Repo claims can be tied to inspected docs, reports, standards, and data | Keep `NotebookLM/Sources/UPLOAD_MANIFEST.md`, source inventories, and evidence IDs synchronized |
| iWin topology matrix | Active | A4/A1/A2/A3 comparisons stay traceable and reversible | Update `Daily/2026-05-26_iwin_topology_decision_matrix/decision_matrix.md` only from source-backed changes |
| Electrical envelope and calculations | Blocked | Voc/Isc/current aggregation and MPPT-fit claims become checkable | Populate blind-module `Voc,cold`, `Vmp`, `Isc,max`, `Imp`, and `Pmp` |
| Standards and compliance framing | Active | Standards claims remain separated from sign-off | Resolve target code region, rapid shutdown, isolation, protection, and service boundary before readiness claims |
| FMEA and commissioning logic | Active | Reliability and acceptance work stays measurable | Use `03_iWin_FMEA_Template.md` and `07_Commissioning_and_Acceptance_Template.md` with evidence-backed limits |
| Vendor-data closure | Blocked | Architecture decisions do not outrun missing vendor evidence | Send/track `08_Vendor_Technical_Questionnaire.md`, response matrix, rubric, drawings, and qualification evidence |
| Price evidence | Active | Cost discussion stays separate from topology correctness | Keep normalized price table current and avoid cost-only architecture selection |
| NotebookLM source pack | Active | Research conversations start from the same source hierarchy | Load project context, topology synthesis, required scraped sources, literature, and PV/DMPPT books before optional decks |
| Inter-chat memory | Active | Durable decisions and unresolved conflicts survive split sessions | Keep `.memory/` hubs and daily notes current |

## Decision Log

| Date | Decision | Rationale | Link |
|---|---|---|---|
| 2026-05-26 | Preserve `AGENTS.md` as the root PVplant instruction base | It already defines the research-oriented BIPV/iWin operating model | `AGENTS.md` |
| 2026-05-26 | Deploy v0.2.0 agent infrastructure around the existing AGENTS file | Creates support state without rewriting the root instruction surface | `.memory/daily/2026-05-26.md` |
| 2026-05-26 | Treat A4 as the current working architecture preference, not a final down-select | The decision matrix ranks A4 highest but marks hard-gate data as unresolved | `Daily/2026-05-26_iwin_topology_decision_matrix/decision_matrix.md` |
| 2026-05-26 | Treat one blind module as the practical controllable PV unit | The topology synthesis rejects slat-level commercial electronics as near-term practical granularity | `Daily/2026-05-21_iwin_pv_blinds_firecrawl_topology_synthesis/report.md` |
| 2026-05-26 | Keep price evidence separate from architecture validity | Optimizer price anchors are lower, but topology selection still depends on electrical, thermal, service, code, and vendor evidence | `Daily/2026-05-26_iwin_price_evidence/price_evidence_report.md` |

## Blockers

- Project-specific automated validation commands beyond documentation/audit checks are not yet fully inventoried.
- Final architecture down-select remains blocked by blind-module electrical envelope, shade matrix, internal PV stringing, moving harness/feedthrough data, thermal envelope, target code region, service boundary, vendor datasheets, drawings, qualification evidence, and commissioning procedures.
- Vendor ranking remains blocked until questionnaire responses and response-matrix evidence are populated.

## Safe To Start Now

- Reading local docs and config.
- Running documentation/audit verification for agent infrastructure.
- Recording current iWin/BIPV decisions and evidence in `.memory/`.
- Creating draft research notes under `docs/research/` before promoting conclusions.
- Extending the source inventory with exact path, source type, claim, and evidence class.
- Comparing A4/A1/A2/A3 only as conditional hypotheses.
