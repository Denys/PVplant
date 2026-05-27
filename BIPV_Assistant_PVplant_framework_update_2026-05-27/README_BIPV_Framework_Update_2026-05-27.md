# BIPV Assistant / PVplant Framework Update — 2026-05-27

## Deliverable set
This bundle contains a synchronized WebGPT/ChatGPT Project framework and Codex/PVplant repository framework.

## Files
| File | Destination | Purpose |
|---|---|---|
| `BIPV_Assistant_KERNEL_v3_WebGPT.md` | ChatGPT Project Instructions | Compact BIPV Assistant kernel |
| `BIPV_Assistant_SOURCES_v3_WebGPT.md` | ChatGPT Project source file | Source/reference map and source hygiene |
| `PVplant_AGENTS_v3_Codex.md` | PVplant repo root as `AGENTS.md` | Codex behavior/routing framework |
| `PVplant_iWin_BIPV_Knowledge_v2.md` | PVplant repo root or `/knowledge/` | Canonical shared data/assumptions/H1-H4/voltage rules |
| `PVplant_Codex_Source_Map_v2.md` | PVplant repo root or `/docs/` | Repo-oriented source map |

## Key updates included
- Project goal reframed as high-evidence pre-design architecture selection, not final PV plant design.
- H4 added/normalized as **per-zone DC/AC microinverter for multiple windows**.
- Slat count corrected: 1.5 cm pitch/effective vertical allocation → ~66.7 slats/m; use 60–70/m as current default; demote ~82/m as stale unless vendor geometry supports it.
- 30 V clarified as **PV module/window MPP voltage**, not DC optimizer output.
- DC/DC optimizer output voltage treated as a user/project-defined architecture variable.
- Raw 30 V floor aggregation remains rejected/weak due to floor currents of ~120–320 A at 3.6–9.6 kWp/floor.
- Knowledge moved out of kernels/AGENTS into `PVplant_iWin_BIPV_Knowledge_v2.md`.
- WebGPT and Codex packages share the same evidence taxonomy, H1–H4 definitions, and vendor closure logic.

## Install/use
1. Paste `BIPV_Assistant_KERNEL_v3_WebGPT.md` into the ChatGPT Project Instructions field.
2. Upload or keep `BIPV_Assistant_SOURCES_v3_WebGPT.md` and `PVplant_iWin_BIPV_Knowledge_v2.md` as project sources.
3. Copy `PVplant_AGENTS_v3_Codex.md` to `PVplant/AGENTS.md`.
4. Copy `PVplant_iWin_BIPV_Knowledge_v2.md` into the PVplant repo root or a `knowledge/` folder.
5. Copy `PVplant_Codex_Source_Map_v2.md` into the repo root or `docs/`.

## Status
Updated from available project files and current conversation decisions. No fresh external web verification was performed during this packaging step; current legal/standards/product claims still require official-source verification when used for a current decision.
