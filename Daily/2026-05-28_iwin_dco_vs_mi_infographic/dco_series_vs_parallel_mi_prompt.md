# Imagegen prompt: Series DCO vs parallel MI for iWin PV blinds

Use case: infographic-diagram

Asset type: 16:9 technical comparison infographic for iWin PV blind architecture review.

Primary request:

Create a detailed 16:9 engineering infographic comparing **Series DCO / DC optimizer string** versus **Parallel MI / microinverter AC branch** for iWin PV blind modules.

Title:

**iWin PV Blinds: Series DCO vs Parallel Microinverter**

Subtitle:

**One blind module is the controllable PV unit. No slat-level electronics.**

Style:

Clean decision-grade engineering handout, white background, dark charcoal text, green DC accents, blue AC accents, orange warning accents. Crisp vector-like raster. Simple icons. 8 px radius max. No decorative gradients, no logos, no watermarks, no pseudo-text. Keep all text legible.

## Upper half: architecture / topology visual comparison

Use two side-by-side lanes with mirrored structure.

### Left lane: Series DCO / optimizer string

Header: **A. Series DCO / DC optimizer string**

Draw three PV blind modules labeled **Blind A**, **Blind B**, **Blind N**.

Each blind label: **45 Vmp, 330-500 W target**.

Inside each blind show internal PV strings/substrings, then a short protected DC harness to the fixed service zone.

Add a dashed boundary: **moving interface: protected PV DC only**.

On fixed side show one block per blind:

- **DCO / optimizer A**
- **DCO / optimizer B**
- **DCO / optimizer N**

Label: **1 independent MPPT per blind**.

Connect DCO outputs in series into:

**DC string: 12-14 blinds typical**

Then connect to:

**String/facade inverter MPPT -> building AC**

Add numeric tag:

**12 blinds = 540 Vmp; 14 blinds = 630 Vmp; 14 x 68 Vcold = 952 V**

Add warning tag:

**15 x 68 Vcold = 1020 V: avoid in 1000 V class**

### Right lane: Parallel MI / AC branch

Header: **B. Parallel MI / AC branch**

Draw three PV blind modules labeled **Blind A**, **Blind B**, **Blind N**.

Each blind label: **~40-45 Vmp, hundreds W required**.

Inside each blind show internal PV strings/substrings, then a short DC harness to fixed service zone.

Add dashed boundary: **moving interface: protected PV DC only**.

On fixed side show one microinverter or one independent MI input per blind:

- **MI input A**
- **MI input B**
- **MI input N**

Label: **1 independent MPPT input per blind required**.

Connect outputs in parallel to:

**AC branch / trunk cable -> AC combiner / switchboard**

Add numeric tag:

**230 Vac 1-phase or 400 Vac 3-phase system context, 50 Hz EU grid profile**

Add warning tag:

**AC branch wiring + grid-code commissioning enter the facade design**

## Middle strip: main comparison conclusion

Use compact callouts:

- **DCO stands out technically when optimizer is fixed/serviceable and one MPPT is used per blind**
- **MI is mature and grid-certified, but AC facade wiring and per-blind inverter service burden are higher**
- **Do not merge differently shaded blinds before independent MPPT**

## Bottom half: comparative table

Create a clean comparative table with 3 columns:

**Criterion** | **Series DCO / optimizer string** | **Parallel MI / AC branch**

Rows:

1. **Topology**
   - DCO: Blind -> DCO/optimizer -> series DC string -> inverter
   - MI: Blind -> MI / MI input -> parallel AC branch

2. **MPPT granularity**
   - DCO: Good if 1 MPPT per blind
   - MI: Good if 1 independent MPPT input per blind

3. **Moving interface**
   - DCO: Protected PV DC only; optimizer fixed
   - MI: Protected PV DC only if MI fixed; AC starts after MI

4. **Shading**
   - DCO: Strong; no raw PV merge before MPPT
   - MI: Strong only with independent MPPT inputs

5. **Thermal / service**
   - DCO: Lower power electronics at blind; central inverter service
   - MI: DC/AC converter per blind/input; facade service burden

6. **Safety / code**
   - DCO: DC string, RSD/optimizer rules, inverter compatibility
   - MI: AC branch, anti-islanding, grid profile, AC protection

7. **Per-blind electronics price**
   - DCO: EUR 35-61 gross commodity optimizer anchors
   - MI: EUR 53/input best case dual MI; EUR 101+ single-input MI; Enphase IQ8 EUR 143-196 before tax/shipping

8. **Shared / accessory cost**
   - DCO: Central inverter, gateway/RSD, DC protection, service box
   - MI: Gateway/DTU, AC trunk/drop cables, combiner, branch protection

9. **Current verdict**
   - DCO: Lead off-the-shelf architecture
   - MI: Backup / benchmark if measured module fits MI input window

## Footer

Add compact footer:

**Evidence basis: iWin Firecrawl topology matrix + price evidence, accessed 2026-05-26. Values are pre-design targets, not final certified plant data.**

Use no unsupported claims. Mark orange warnings clearly. Make the diagram readable at slide resolution.
