# Corrected imagegen prompt: Series DCO vs parallel MI

Create a corrected 16:9 engineering infographic. The key requirement is that raw PV from multiple iWin blinds must never appear visually merged before independent MPPT.

Title: **iWin PV Blinds: Series DCO vs Parallel Microinverter**

Subtitle: **One blind module is the controllable PV unit. No slat-level electronics.**

Style: clean decision-grade engineering handout; white background; dark charcoal text; green DC/PV accents; blue AC accents; orange warning accents; crisp vector-like raster; simple icons; 8 px radius max; no decorative gradients; no logos; no watermarks; no pseudo-text. Keep all text legible.

## Upper topology comparison

Use two side-by-side lanes.

### A. Series DCO / DC optimizer string

Draw **Blind A**, **Blind B**, **Blind N** on the left. Each blind label: **45 Vmp, 330-500 W target**. Show internal PV strings/substrings inside each blind.

Critical wiring rule: draw **three separate green DC harnesses**:

- Blind A connects only to **DCO / optimizer A**.
- Blind B connects only to **DCO / optimizer B**.
- Blind N connects only to **DCO / optimizer N**.

Do not draw a shared raw PV bus before DCO. Do not join blind outputs before DCO blocks. Add label: **separate PV DC harness per blind, no pre-MPPT merging**.

Add dashed boundary: **moving interface: protected PV DC only**.

Put all DCO / optimizer blocks on the fixed / service zone side. Label: **1 independent MPPT per blind**.

After the DCO blocks only, connect outputs in series. Label: **DC string: 12-14 blinds typical**.

Connect to **String/facade inverter MPPT -> Building AC**.

Add tags:

- **12 blinds = 540 Vmp**
- **14 blinds = 630 Vmp**
- **14 x 68 Vcold = 952 V**
- Orange warning: **15 x 68 Vcold = 1020 V: avoid in 1000 V class**

### B. Parallel MI / AC branch

Draw **Blind A**, **Blind B**, **Blind N**. Each blind label: **~40-45 Vmp, hundreds W required**. Show internal PV strings/substrings.

Critical wiring rule: draw **three separate green DC harnesses**:

- Blind A connects only to **MI input A**.
- Blind B connects only to **MI input B**.
- Blind N connects only to **MI input N**.

Do not merge raw PV before MI input. Add label: **1 independent MPPT input per blind required**.

Add dashed boundary: **moving interface: protected PV DC only**.

Put MI input blocks or microinverters on the fixed / service zone side. After MI conversion, draw blue AC outputs in parallel to **AC branch / trunk cable -> AC combiner / switchboard -> Building AC interface**.

Add tags:

- **230 Vac 1-phase or 400 Vac 3-phase system context, 50 Hz EU grid profile**
- Orange warning: **AC branch wiring + grid-code commissioning enter the facade design**

## Middle callouts

1. **DCO stands out technically when optimizer is fixed/serviceable and one MPPT is used per blind.**
2. **MI is mature and grid-certified, but AC facade wiring and per-blind inverter service burden are higher.**
3. **Do not merge differently shaded blinds before independent MPPT.**

## Bottom comparison table

Create a clean table:

| Criterion | Series DCO / optimizer string | Parallel MI / AC branch |
|---|---|---|
| Topology | Blind -> DCO/optimizer -> series DC string -> inverter | Blind -> MI / MI input -> parallel AC branch |
| MPPT granularity | Good if 1 MPPT per blind | Good if 1 independent MPPT input per blind |
| Moving interface | Protected PV DC only; optimizer fixed | Protected PV DC only if MI fixed; AC starts after MI |
| Shading | Strong; no raw PV merge before MPPT | Strong only with independent MPPT inputs |
| Thermal / service | Lower power electronics at blind; central inverter service | DC/AC converter per blind/input; facade service burden |
| Safety / code | DC string, RSD/optimizer rules, inverter compatibility | AC branch, anti-islanding, grid profile, AC protection |
| Per-blind electronics price | EUR 35-61 gross commodity optimizer anchors | EUR 53/input best case dual MI; EUR 101+ single-input MI; Enphase IQ8 EUR 143-196 before tax/shipping |
| Shared / accessory cost | Central inverter, gateway/RSD, DC protection, service box | Gateway/DTU, AC trunk/drop cables, combiner, branch protection |
| Current verdict | Lead off-the-shelf architecture | Backup / benchmark if measured module fits MI input window |

Footer: **Evidence basis: iWin Firecrawl topology matrix + price evidence, accessed 2026-05-26. Values are pre-design targets, not final certified plant data.**
