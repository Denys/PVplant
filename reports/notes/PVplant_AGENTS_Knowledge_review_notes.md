# Review Notes — AGENTS + iWin BIPV Knowledge File

## Review scope

Reviewed:

- uploaded `AGENTS.md`
- uploaded `PVplant_iWin_BIPV_Knowledge_v1.md`
- current project logic from the conversation
- `output_voltage_decision_schematic.md` voltage-domain correction

## Main findings

| Area | Finding | Action in updated files |
|---|---|---|
| Project goal | Correct target is pre-design architecture hypothesis basis, not precise PV plant design. | Added explicit project-goal boundary in AGENTS and preserved guiding logic in knowledge file. |
| AGENTS style | Uploaded AGENTS was behavior-oriented but too old: no H4, no knowledge-file routing, no voltage-domain rule, no slat correction. | Created `AGENTS_reviewed_v3.md` as behavior-oriented root file. |
| Knowledge-file role | Existing knowledge file already had strong reliability ordering, H1-H4, slat correction, and stale-value handling. | Preserved structure and upgraded to v2. |
| H4 | H4 should be included as per-zone DC/AC microinverter for multiple windows. | Added/kept H4 and added voltage-domain note. |
| Slats per metre | `~82 slats/m` conflicts with 1.5 cm pitch. | Kept `60-70 slats/m` default and marked `82/m` as stale unless 12.2 mm pitch is proven. |
| Voltage domain | `30 V` is PV module/window source-side Vmp, not DC/DC optimizer output. | Added hard AGENTS rule and canonical knowledge-file section. |
| DC/DC output voltage | Optimizer output is user/project-defined based on downstream bus/string/PCE constraints. | Added PCE output/DC-link as vendor/design closure item. |
| Formulas | Full `Voc,max` and `Isc,max` equations should not be duplicated everywhere. | AGENTS only names mandatory checks; knowledge file stores canonical formulas. |
| `Isc,max` variable | Generic `Tcell` can be ambiguous. | Added note: for max-current envelope, set `Tcell` to the governing current-case temperature, normally `Tcell,max` or explicitly defined case. |

## Recommended repo placement

```text
PVplant/AGENTS.md                                  <- use AGENTS_reviewed_v3.md
PVplant/PVplant_iWin_BIPV_Knowledge.md             <- use PVplant_iWin_BIPV_Knowledge_v2_reviewed.md
PVplant/reports/notes/PVplant_AGENTS_Knowledge_review_notes.md  <- optional
```

## Key semantic patch

```text
30 V = PV-side module/window Vmp and PCE input/MPPT-domain design point.
30 V ≠ DC/DC optimizer output voltage.
DC/DC output voltage / DC-link / series contribution is a separate architecture variable.
```

## Key geometry patch

```text
If effective pitch = 1.5 cm:
100 cm / 1.5 cm = 66.7 slats/m.
Use 60-70 slats/m as the current practical default.
Treat ~82 slats/m as stale unless pitch ≈12.2 mm or geometry justifies it.
```

## Remaining open items

- Exact slat pitch / active slat count requires vendor drawing or measured geometry.
- Exact internal string/sub-string map requires vendor electrical layout.
- PCE input/output ranges and topology are still open for H1/H2/H3/H4.
- `Voc,max` and `Isc,max` remain formula-ready but not final until product ratings, grouping, temperature coefficients, and environment cases are closed.
