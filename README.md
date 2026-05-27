# PVplant

PVplant is a Codex research workspace for decision-grade PV/BIPV pre-design work, currently focused on iWin-type glazing-integrated photovoltaic venetian-blind systems.

Use this repository for:

- source-grounded technical synthesis;
- architecture hypothesis refinement;
- electrical-envelope calculations;
- standards and compliance framing;
- thermal, reliability, and FMEA review;
- commissioning and diagnostics logic;
- vendor-data closure.

Do not treat this as a generic solar explainer. Start from the repo instructions and current evidence.

## Current Repo Map

- `AGENTS.md` is the preserved root instruction base.
- `BIPV_Codex_Edition/` contains the BIPV assistant package, companion files, and deck-audit analysis.
- `BIPV_Codex_Edition/companion/` contains the iWin project companion, assumption register, standards/design-envelope notes, FMEA, commissioning template, and vendor-response package.
- `Daily/2026-05-21_iwin_pv_blinds_firecrawl_topology_synthesis/` contains topology synthesis, source inventory, optimizer and microinverter deep dives.
- `Daily/2026-05-26_iwin_topology_decision_matrix/` contains the current conditional topology ranking and score matrix.
- `Daily/2026-05-26_iwin_price_evidence/` contains normalized price evidence and the cost report.
- `NotebookLM/Sources/UPLOAD_MANIFEST.md` defines the NotebookLM BIPV_Brain source-pack load order.
- `.memory/`, `CHECKPOINT.md`, and `PROJECT_TRACKER.md` are the generated agent-support state.

## Current Evidence Snapshot

- The companion v3 pack frames iWin as a sealed glazing-integrated PV venetian-blind pre-design problem with vendor closure, FMEA, commissioning, standards, and design-envelope files.
- The topology synthesis rejects slat-level commercial electronics as the near-term working granularity and treats one blind module as the controllable PV unit.
- The decision matrix currently ranks A4, per-blind DC optimizer with facade-level inverter, highest at 45/60, followed by A1 at 41/60, A2 at 36/60, and A3 at 33/60. This is conditional, not a final architecture down-select.
- The price report shows optimizer hardware has lower visible per-controllable-unit price anchors than microinverters, but cost alone does not select the architecture.
- The NotebookLM manifest keeps presentation decks below direct datasheets, standards, papers, books, evidence indexes, and local project context.

## Hard Gates

Do not present the topology ranking as final until these are populated or explicitly bounded:

- blind-module `Voc,cold`, `Vmp`, `Isc,max`, `Imp`, and `Pmp`;
- shade matrix and internal PV stringing;
- moving harness, connector, feedthrough, isolation, and replacement boundary;
- electronics placement and thermal envelope;
- target code region, rapid-shutdown approach, protection concept, and service model;
- vendor datasheets, drawings, qualification evidence, acceptance limits, and procedures.

## First Files To Read

1. `AGENTS.md` - root PVplant operating rules and source authority.
2. `CHECKPOINT.md` - current verified state.
3. `PROJECT_TRACKER.md` - active workstreams, blockers, and next actions.
4. `.memory/hubs/Agent Context Bootstrap and Memory Layer.md` - durable inter-chat memory bootstrap.
5. `.memory/hubs/Current State Mirror.md` - short current-state snapshot.
6. `.memory/hubs/Evidence Index.md` - evidence registry.
7. `CHANGELOG.md` - dated infrastructure and project-support changes.
8. `BIPV_Codex_Edition/companion/README_v3_iWin_Project_Companion.md` - current companion overview.
9. `Daily/2026-05-26_iwin_topology_decision_matrix/decision_matrix.md` - current conditional topology matrix.
10. `NotebookLM/Sources/UPLOAD_MANIFEST.md` - research-source load order.

## Agent Infrastructure

- `.memory/` stores durable project memory and evidence state.
- `docs/plans/` stores plans and resumable work plans.
- `docs/research/` stores research templates and evidence notes.
- `maintenance/` stores repeatable validation and upkeep routines.
- `experiments/inter-chat-memory/` stores memory workflow experiments.

## Verification Baseline

For documentation-only agent infrastructure checks:

```powershell
rg --files --hidden
rg "PVplant|iWin|BIPV|agent|memory|vendor-data|commissioning" . --hidden
```

If `rg` is unavailable:

```powershell
Get-ChildItem -Recurse -Force -File | Select-Object -ExpandProperty FullName
Select-String -Path AGENTS.md,README.md,CHECKPOINT.md,PROJECT_TRACKER.md,CHANGELOG.md,INTER_CHAT_MEMORY.md -Pattern "PVplant|iWin|BIPV|agent|memory"
```
