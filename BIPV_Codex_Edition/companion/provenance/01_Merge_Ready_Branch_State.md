# Branch Export — Merge-Ready Canonical State

## Goal

Preserve this branch with minimal loss so it can be merged into other chat branches.

This export contains:
- the generated artifact trees from v1, v2, and v3
- a user-visible transcript of this branch
- a manifest with checksums
- a merge-ready canonical state summary
- a paste-in sync prompt for another chat branch

## Recommended canonical state

Adopt **v3** as the current canonical engineering pack for this branch.

Why:
1. v1 established the iWin-specific roadmap and templates.
2. v2 added the missing pre-design engineering backbone.
3. v3 added vendor-closure machinery needed to close open assumptions and design-envelope rows.

## Final branch deliverables

### v1
- main companion
- reading tracker
- weekly checklist
- FMEA template
- capstone memo template
- assumption register

### v2
- standards and design envelope
- commissioning and acceptance template
- upgraded FMEA
- corrected assumptions
- earlier FMEA timing
- stronger electrical standards stack

### v3
- vendor technical questionnaire
- vendor response matrix TSV
- vendor response workbook XLSX
- vendor evaluation rubric
- vendor data-request cover note

## Explicit branch decisions

### Included
- iWin-specific shift from generic BIPV to window-stack + control + mismatch + service interfaces
- standards/design-envelope framing
- vendor-closure workflow

### Explicitly excluded
- The later **20% time / 80% material bibliography matrix** addition was provided by the user and then explicitly cancelled with **"ignore"**. It is not part of the canonical pack.

## High-value technical positions preserved in this branch

1. Treat iWin-type products as **electro-optical-thermal window subsystems**, not generic façade PV.
2. **Slat-angle control** is near first-order importance because the product is a PV venetian blind, not just a fixed PV surface.
3. **Slat/string partitioning and bypass topology** are central, not implementation details.
4. **Frame/feedthrough/seal/service interfaces** dominate risk and maintainability.
5. **Commissioning, monitoring, and replacement boundaries** must be designed from day 1.
6. `IEC 62548-1` is the electrical design spine; `IEC 63092-1/-2` frame BIPV module/system obligations; `IEC 62446-1` handles commissioning/inspection/handover logic.

## Key public clues / anchors recorded in this branch

- iWin is publicly framed as a photovoltaic venetian-blind shading device integrated inside an insulating double-glazed window.
- iWin publicly indicates **thin-film photovoltaic solar cells**.
- The SUPSI-linked Solar RRL 2024 result is treated as the strongest public electrical-performance clue: **one bypass diode per string** outperformed the shared-diode configuration and lowered temperature in the reported pilot context.
- Thermal risk is treated as a **first-order design unknown / qualification driver**, not as a proven field failure of the exact product.

## Open items carried forward

These remain open unless closed by vendor evidence or project decision:
- exact cavity / chamber cross-section
- feedthrough construction and route
- replaceable-unit boundaries
- actual unit electrical datasheet and temperature coefficients
- internal bypass/subdivision topology for offered revision
- aggregation rules per unit / façade string
- controls fail-safe states and telemetry map
- qualification basis for the exact product revision
- service procedures and recommissioning steps
- warranty exclusions and spares horizon

## Best merge strategy into another chat branch

Use all three layers together:
1. **Raw platform export** from ChatGPT Settings → Data Controls → Export Data.
2. **This branch bundle** for direct artifact reuse and fast branch synchronization.
3. **The paste-in sync prompt** below to rehydrate another branch with the canonical state.

## Paste-in sync prompt

```text
Use the attached branch export bundle as authoritative for the iWin branch.

Canonical state:
- Adopt v3 of the iWin project companion as current baseline.
- Keep v2 as the engineering-backbone delta reference.
- Keep v1 only as historical origin.

Important exclusions:
- Ignore the "20% time / 80% material bibliography matrix" section; it was explicitly cancelled by the user.

What this branch already decided:
- Focus on iWin-type products as electro-optical-thermal window subsystems.
- Treat slat-angle control, slat/string mismatch, bypass topology, feedthrough/seal reliability, and commissioning/serviceability as the highest-yield topics.
- Use IEC 62548-1 as the PV electrical design backbone, with IEC 63092-1/-2 and IEC 62446-1 in supporting roles.
- Preserve the v3 vendor questionnaire/rubric/workbook as the preferred closure path for open assumptions.

Required handling:
- Do not restate generic BIPV basics unless they materially affect the iWin-specific architecture.
- Do not reintroduce the ignored bibliography matrix.
- Keep assumption status explicit: verified public fact vs public clue vs engineering inference vs vendor-data required.

Primary artifacts to inspect first:
- iwin_project_companion_v3/README_iWin_Project_Companion.md
- iwin_project_companion_v2/06_Standards_and_Design_Envelope.md
- iwin_project_companion_v3/08_Vendor_Technical_Questionnaire.md
- iwin_project_companion_v3/10_Vendor_Evaluation_Rubric.md
- iwin_project_companion_v2/05_Assumption_Register.md
```

## Inventory summary

- Total exported files: 25
- Extension counts: {".md": 20, ".zip": 3, ".tsv": 1, ".xlsx": 1}

See `03_Artifact_Manifest.json` for per-file checksums and sizes.
