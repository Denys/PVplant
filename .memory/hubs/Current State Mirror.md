---
type: hub
role: state-snapshot
created: 2026-05-26
updated: 2026-05-26
snapshot_at: 2026-05-26T22:56:57
staleness_threshold_hours: 72
---

# Current State Mirror

## Project State

- Project: `PVplant`
- Root instruction base: `AGENTS.md`, preserved during deployment.
- Agent infrastructure deployed: 2026-05-26 with `agent-infrastructure-deployer` v0.2.0.
- Support docs specialized around PV/BIPV pre-design research for iWin-type glazing-integrated photovoltaic venetian-blind systems.
- Support docs filled from current local evidence on 2026-05-26.
- Automated validation commands beyond documentation/audit checks still need inventory.

## Architecture State

- Current working preference: A4, per-blind DC optimizer with facade-level inverter, scored 45/60 in the local decision matrix.
- Current second path: A1, distributed MPPT/DC optimization to DC bus or central inverter, scored 41/60.
- Fallback path: A2, microinverter to AC branch, scored 36/60 and dependent on module electrical envelope, AC equipment placement, serviceability, and code fit.
- Weaker path: A3, low-voltage shared MPPT, scored 33/60 because shared MPPT across moving, independently shaded blind modules weakens distributed-control value.
- Final architecture, TRS, vendor ranking, and readiness claims remain blocked.

## Current Hard Gates

- Blind-module `Voc,cold`, `Vmp`, `Isc,max`, `Imp`, and `Pmp`.
- Shade matrix and internal PV stringing.
- Moving harness, connector, feedthrough, isolation, replacement, and service boundary.
- Electronics placement and thermal envelope.
- Target code region, rapid shutdown, and protection concept.
- Vendor datasheets, drawings, qualification evidence, procedures, and acceptance limits.

## Active Structure

- Root guidance: `AGENTS.md`
- Current state: `CHECKPOINT.md`
- Workstreams: `PROJECT_TRACKER.md`
- Durable memory: `.memory/`
- Plans: `docs/plans/`
- Research: `docs/research/`
- Maintenance: `maintenance/`

## Source Load Order

1. `AGENTS.md`, `CHECKPOINT.md`, `PROJECT_TRACKER.md`, and `.memory/`.
2. `BIPV_Codex_Edition/companion/README_v3_iWin_Project_Companion.md` plus companion templates.
3. `Daily/2026-05-26_iwin_topology_decision_matrix/decision_matrix.md`.
4. `Daily/2026-05-21_iwin_pv_blinds_firecrawl_topology_synthesis/` reports and source inventories.
5. `Daily/2026-05-26_iwin_price_evidence/`.
6. `NotebookLM/Sources/UPLOAD_MANIFEST.md` and required source folders.
