# Notebook source synthesis for dashboard v2

Date: 2026-05-28

Scope: three NotebookLM-derived PDF decks supplied by the user for comparison against the Firecrawl/vendor evidence base.

## Source handling

| Source | Path | Pages | Extraction result | Dashboard use |
|---|---:|---:|---|---|
| NOTEBOOK_BIPV_Electrical_Architectures | `../NOTEBOOK_BIPV_Electrical_Architectures.pdf` | 11 | Image-based PDF; `pdftotext -layout` produced no usable text. Rendered to page PNGs and contact sheet. | Conceptual five-topology comparison; strong emphasis on Parallel DCO as verdict. |
| NOTEBOOK2_BIPV_Electrical_Architectures | `../NOTEBOOK2_BIPV_Electrical_Architectures.pdf` | 10 | Image-based PDF; rendered to page PNGs and contact sheet. | Cleaner cost spectrum and diagnostic matrix; recommends Parallel DCO / PDO as optimal future architecture. |
| PVBRAIN_BIPV_Power_Topologies | `../PVBRAIN_BIPV_Power_Topologies.pdf` | 11 | Image-based PDF; rendered to page PNGs and contact sheet. | More neutral verdict: Parallel MI for maximum safety/yield; Per-zone MI as pragmatic lower device-count branch. |

Rendered evidence is in:

```text
source_extracts/pdf_pages/
```

## Cross-notebook consensus

1. **Granular MPPT is the core design variable.** All three notebook decks agree that BIPV facade shading makes centralized/string-only tracking weak.
2. **Do not merge differently shaded PV modules before independent MPPT.** Parallel DCO and Parallel MI only preserve shading mitigation if each blind/module has its own optimizer or MI input before aggregation.
3. **Zone architectures reduce device count but sacrifice mismatch isolation.** Zone DCO and zone MI become attractive only when windows in a zone share orientation, shading, and control behavior.
4. **Microinverters move safety/grid complexity to the AC side.** The notebooks consistently mark MI as strong for DC arc/HV-DC reduction and module independence, but high in device cost and exposed electronics count.
5. **Power-device price order is qualitative, not a vendor quote.** Across notebooks: DCO per zone lowest; Series DCO low-to-medium; Parallel DCO medium; Per-zone MI medium-high/high; Parallel MI highest.

## Disagreement to preserve

| Evidence lens | Lead architecture | Reason |
|---|---|---|
| Firecrawl/vendor/price evidence | Series DCO / off-the-shelf optimizer string | Commercial optimizer anchors exist now, with real datasheets, installation manuals, RSD/monitoring ecosystems, and EUR 35-61 commodity optimizer price anchors. |
| NOTEBOOK + NOTEBOOK2 conceptual BIPV decks | Parallel DCO / PDO | Conceptual best fit for native BIPV because it gives independent MPPT, parallel LVDC-style aggregation, and central DC/AC conversion. The unresolved issue is product availability/certification. |
| PVBRAIN conceptual deck | Parallel MI for safety/yield; Per-zone MI as pragmatic branch | Gives maximum module independence and removes HV DC bus risk, but it is high-cost and adds AC branch/grid-code burden in the facade. |

## Dashboard decision rule

Use a two-tier conclusion:

```text
Near-term off-the-shelf lead: Series DCO / optimizer string.
Longer-term native-BIPV custom lead: Parallel DCO / PDO, if certified per-blind DCO channels exist or can be developed.
Microinverter branch: benchmark/backup for highest independence or safety framing, not current cost lead.
```

## Taxonomy used in dashboard v2

| v2 name | Meaning |
|---|---|
| Series DCO | Per-blind optimizer/DCO with outputs connected in series to a string/facade inverter. Maps to the TS4/H4/Arch1 optimizer-string branch. |
| Parallel DCO | Per-blind parallel-output DCO/PDO into a protected common DC node, then shared downstream converter/inverter. |
| DCO per zone | Zone-level optimizer/DC-DC stage shared by multiple similar blinds/windows. |
| Parallel MI | Per-blind microinverter or one independent MI input per blind, outputs in parallel AC branch. |
| Per-zone MI | Multi-input or zone microinverter serving a group of blinds/windows, output to AC branch. |

## Final dashboard conclusion

The dashboard should recommend **Series DCO / optimizer string** as the most suitable current architecture for iWin PV blinds because it is the strongest commercially evidenced path. It should show **Parallel DCO/PDO** as the best native-BIPV custom target if iWin can source or develop a certified 300-500 W per-blind DCO channel. It should show **Parallel MI** as technically mature but price/service/AC-facade heavy, and **zone variants** as lower-device-count compromises.
