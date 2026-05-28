# H4 optimizer topology infographic prompt

Use case: infographic-diagram
Asset type: engineering infographic for PV/BIPV architecture review
Primary request: Create a crisp 16:9 technical infographic titled exactly: "H4 iWin PV Blind Optimizer Topology". Show a per-blind DC optimizer architecture with a facade/string inverter. The unit is one whole blind module in one window/opening, not one slat.

Style/medium: clean vector-like raster infographic, white background, dark charcoal text, green PV/DC side accents, blue AC side accents, orange warning accents. Professional engineering report style, not marketing. Landscape 16:9.

Composition/framing: top half is a left-to-right schematic power-flow diagram. Bottom half has four compact value panels. Use simple engineering icons: three PV blind window modules, short DC harnesses, fixed headbox/service zone, optimizer boxes, series DC string, facade/string inverter, building AC panel/grid. Keep text horizontal, high contrast, and legible.

Top power-flow diagram labels, render verbatim where possible:
1. "Blind module A: 45 Vmp, 330-500 W"
2. "Blind module B: 45 Vmp, 330-500 W"
3. "Blind module N: 12-14 per string"
4. "short protected DC harness"
5. "moving side: PV DC only"
6. "fixed per-blind optimizer"
7. "one optimizer / one MPPT per blind"
8. "optimizer outputs in SERIES"
9. "DC string: 12-14 blinds"
10. "facade/string inverter MPPT"
11. "230/400 Vac 50 Hz building AC"

Important callouts:
- "No slat-level electronics"
- "No optimizer on moving slats"
- "Do not merge shaded blinds before optimization"
- "Optimizer output voltage is NOT set manually"
- "String voltage emerges from series optimizers + inverter MPPT"

Bottom panel A title: "Target iWin H4 PV Output"
Panel A values:
- "Design center: 400-500 W per blind"
- "Product band: 330-500 W/blind"
- "Upper one-optimizer band: 550-600 W"
- "720 W case: split into 2 x 360 W sections"
- "Vmp STC: 45 V nominal"
- "Acceptable Vmp: 42-48 V"
- "Voc STC: 55-60 V"
- "Voc cold target: <68 V"
- "Absolute input ceiling: <80 V"
- "Imp normal target: 9-12 A"
- "Isc normal target: <=14 A"

Bottom panel B title: "Optimizer Device Fit"
Panel B values:
- "Tigo TS4-A-O: 725 W, 12-80 Vmp, 16 A Imp / 22 A Isc"
- "Tigo: IP68, -40 to 70 C, MC4/EVO2, <30 s RSD"
- "Deye SUN-XL02-A/B: 700 W, 12-80 V, 15 A input, IP68"
- "SolarEdge / Huawei: ecosystem benchmarks, not generic"
- "Monitoring/RSD: TAP + CCA or PLC RSS, vendor/code dependent"

Bottom panel C title: "Voltage / Current Check at 45 Vmp"
Panel C values:
- "330 W -> Imp 7.33 A, Isc about 8.43 A"
- "412.5 W -> Imp 9.17 A, Isc about 10.54 A"
- "480 W -> Imp 10.67 A, Isc about 12.27 A"
- "495 W -> Imp 11.00 A, Isc about 12.65 A"
- "600 W -> Imp 13.33 A, Isc about 15.33 A: margin check"
- "720 W -> Imp 16.00 A, Isc about 18.40 A: split"
- "Voc cold: 62.2 V at -10 C"
- "Voc cold: 63.8 V at -20 C"
- "Voc cold: 65.5 V at -30 C"

Bottom panel D title: "String / Cost Rules"
Panel D values:
- "12 blinds/string -> 540 Vmp"
- "14 blinds/string -> 630 Vmp"
- "Use 68 V Voc cold for conservative string check"
- "14 blinds -> 952 V cold"
- "15 blinds -> 1020 V: avoid in 1000 V class"
- "Tigo TS4-A-O: EUR 39.36 incl. VAT visible"
- "Deye SUN-XL02-B: EUR 42.15 visible"
- "50 x Tigo TS4-A-O -> EUR 1,968 hardware"

Bottom small footer text:
- "H4 = distributed DC/DC optimization + centralized DC/AC conversion"
- "Set the PV input envelope, not a fixed optimizer output voltage"
- "Vendor closure needed: Voc/cold, Isc, harness, thermal, connector, feedthrough, RSD"

Visual constraints: Do not use logos, decorative blobs, gradients, marketing hero styling, lorem ipsum, pseudo-text, watermark, or 3D effects. Do not put electronics on slats. Make the moving/fixed boundary visually clear. Use arrows to show PV/DC side in green and AC side in blue. Use a dotted high-voltage DC string boundary. Put warning badges only on split-required and 15-blind 1000 V limit statements. Use compact tables or panel rows, not paragraphs. Keep cards to 8 px radius max.
