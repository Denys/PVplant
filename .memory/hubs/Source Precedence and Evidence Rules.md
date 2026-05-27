---
type: hub
role: policy
created: 2026-05-26
updated: 2026-05-26
---

# Source Precedence and Evidence Rules

## Precedence Ranking

1. Direct local verification from the current PVplant checkout.
2. Explicit user instruction in the active session.
3. Root `AGENTS.md`, then nearest applicable project instruction file.
4. Current local status files: `CHECKPOINT.md`, `PROJECT_TRACKER.md`, `.memory/`, and `CHANGELOG.md`.
5. Companion and current research files under `BIPV_Codex_Edition/companion/` and `Daily/`.
6. NotebookLM source-pack manifest and required source folders.
7. Official product documentation, datasheets, standards, manuals, and papers.
8. Historical plans, presentation decks, and project examples.
9. Generic web or forum material.
10. LLM output without source evidence.

## Evidence Classes

- **Verified local fact**: observed directly in the current checkout.
- **Verified public fact**: tied to official source, paper, standard, datasheet, or manual.
- **Standards-backed framing**: based on standard scope or clause, but not a compliance sign-off.
- **Product-proximate technical evidence**: from commercial MLPE datasheets, manuals, or price sources.
- **Engineering inference**: reasoned from evidence and stated assumptions.
- **Project-defined assumption**: declared by project docs or user direction.
- **Vendor-data required**: cannot be closed without vendor datasheet, drawing, qualification evidence, procedure, or acceptance limit.

LLM output is never standalone factual evidence.
