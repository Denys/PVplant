---
type: hub
role: bootstrap
created: 2026-05-26
updated: 2026-05-26
---

# Agent Context Bootstrap and Memory Layer

## Active Focus

`PVplant` has specialized Codex agent infrastructure anchored by the existing root `AGENTS.md`. The workspace is a research-oriented, decision-grade PV/BIPV pre-design environment focused on iWin-type glazing-integrated photovoltaic venetian-blind systems.

## Current Decisions

1. Use `AGENTS.md` as the preserved root PVplant instruction layer.
2. Use `.memory/` for durable inter-chat memory, source-state recovery, evidence tracking, and conflict logging.
3. Use `CHECKPOINT.md` and `PROJECT_TRACKER.md` for current state, workstreams, blockers, and safe next actions.
4. Treat iWin/BIPV architecture conclusions as hypotheses until vendor-data closure supports them.
5. Treat A4 as the current working topology preference only under the unresolved hard gates recorded in `CHECKPOINT.md`.

## Active Evidence Sources

- `BIPV_Codex_Edition/companion/README_v3_iWin_Project_Companion.md`
- `BIPV_Codex_Edition/companion/03_iWin_FMEA_Template.md`
- `BIPV_Codex_Edition/companion/06_Standards_and_Design_Envelope.md`
- `BIPV_Codex_Edition/companion/07_Commissioning_and_Acceptance_Template.md`
- `BIPV_Codex_Edition/companion/08_Vendor_Technical_Questionnaire.md`
- `Daily/2026-05-21_iwin_pv_blinds_firecrawl_topology_synthesis/report.md`
- `Daily/2026-05-21_iwin_pv_blinds_firecrawl_topology_synthesis/source_inventory.csv`
- `Daily/2026-05-26_iwin_topology_decision_matrix/decision_matrix.md`
- `Daily/2026-05-26_iwin_price_evidence/price_evidence_report.md`
- `NotebookLM/Sources/UPLOAD_MANIFEST.md`

## Recent State Deltas

- [[daily/2026-05-26]] - v0.2.0 agent infrastructure deployed and specialized around the existing PVplant `AGENTS.md`.
- [[daily/2026-05-26]] - generated support files filled from available local iWin/BIPV evidence.

## Next Session Priorities

1. Read `AGENTS.md`, `CHECKPOINT.md`, and `PROJECT_TRACKER.md` before making repo claims.
2. Keep source-grounded facts, engineering inferences, project-defined assumptions, and vendor-data-required items separate.
3. Record architecture, standards, FMEA, commissioning, and vendor-data decisions in `.memory/daily/`.
4. Before architecture recommendations, check the decision matrix plus the open hard gates in `Validation and Open Items`.
