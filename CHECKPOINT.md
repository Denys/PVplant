# Checkpoint

Last updated: 2026-05-26

## Current State

- Project: PVplant
- Root instruction base: `AGENTS.md`, preserved during deployment.
- Agent infrastructure deployed: 2026-05-26 with `agent-infrastructure-deployer` v0.2.0.
- Deployment mode: preserve existing files, then specialize generated support docs around the PVplant/iWin research role.
- Primary domain: PV/BIPV pre-design research for iWin-type glazing-integrated photovoltaic venetian-blind systems.
- Generated support files are now filled from local repo evidence: companion pack, daily topology synthesis, decision matrix, price evidence, and NotebookLM source-pack manifest.

## Active Focus

Maintain a durable agent-support layer for PVplant so future sessions can recover source authority, current state, architecture hypotheses, vendor-data gaps, validation evidence, and next actions without relying on chat history.

## Evidence Snapshot

- `BIPV_Codex_Edition/companion/README_v3_iWin_Project_Companion.md` is the current companion overview for the iWin pre-design package and vendor-closure layer.
- `Daily/2026-05-21_iwin_pv_blinds_firecrawl_topology_synthesis/report.md` treats blind-module level, not slat level, as the practical near-term controllable PV granularity.
- `Daily/2026-05-26_iwin_topology_decision_matrix/decision_matrix.md` currently ranks A4 highest, then A1, A2, and A3, while keeping the ranking blocked by missing hard-gate data.
- `Daily/2026-05-26_iwin_price_evidence/price_evidence_report.md` records lower visible optimizer price anchors than microinverter anchors, but does not make cost a topology decision by itself.
- `NotebookLM/Sources/UPLOAD_MANIFEST.md` defines required source-pack load order and keeps presentation decks below direct technical evidence.

## Architecture State

- Current working preference: A4, per-blind DC optimizer with facade-level inverter.
- Current second path: A1, distributed MPPT/DC optimization feeding a DC bus or central inverter.
- A2, microinverter to AC branch, remains a fallback only if module electrical envelope, safety region, serviceability, and AC-equipment fit support it.
- A3, low-voltage shared MPPT, is weaker because shared MPPT across moving, independently shaded blind modules risks losing the distributed-control benefit.
- No final preferred architecture, TRS, or vendor ranking is closed yet.

## Active Blockers

- Blind-module `Voc,cold`, `Vmp`, `Isc,max`, `Imp`, and `Pmp` are not closed in the generated support layer.
- Shade matrix, internal stringing, moving harness, feedthrough, connector, replacement boundary, and thermal envelope remain hard gates.
- Target code region, rapid shutdown, protection/isolation concept, and service boundary remain unresolved for decision-grade recommendations.
- Vendor datasheets, drawings, qualification evidence, procedures, and acceptance limits still need closure.

## Verified During Bootstrap

- The v0.2.0 global `agent-infrastructure-deployer` copy was restored from the staged v0.2.0 source.
- The deployer dry-run preserved `AGENTS.md` and planned only support-file creation.
- The real deployment preserved `AGENTS.md`, created the support docs, and created the `.memory/` vault structure.
- Generated support files were specialized around the existing PVplant `AGENTS.md` role.
- Support files were filled with available local evidence on 2026-05-26.

## Open Items

- Inventory project-specific validation commands beyond documentation checks.
- Decide whether `.memory/`, `docs/plans/`, `docs/research/`, `maintenance/`, and `experiments/` should be committed with the repository.
- Keep active BIPV/iWin workstreams, evidence IDs, and blocker state reflected in `PROJECT_TRACKER.md` and `.memory/`.
- Populate the missing electrical, thermal, code, service, and vendor-data gates before treating architecture scores as final.

## Next Safe Actions

1. Run scoped support-file validation after each support-doc update; the broad v0.2 audit can false-positive on pre-existing PDFs, docx, plugin JS, and git pack files in this repo.
2. Record new architecture, standards, FMEA, commissioning, and vendor-data decisions in `.memory/daily/`.
3. Use `docs/research/pvplant-iwin-research-template.md` for new research notes.
4. Update the decision matrix only with source-backed changes or explicit project assumptions.
