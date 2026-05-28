# H3 microinverter topology infographic prompt

Use case: infographic-diagram
Asset type: engineering infographic for PV/BIPV architecture review
Primary request: Create a crisp 16:9 technical infographic titled exactly: "H3 iWin PV Blind Microinverter Topology". Show a microinverter-based distributed AC architecture for iWin PV blinds. The unit is one whole blind module in one window/opening, not one slat.

Style/medium: clean vector-like raster infographic, white background, dark charcoal text, green PV/DC side accents, blue AC side accents, orange warning accents. Professional engineering report style, not marketing. Landscape 16:9.

Composition/framing: top half is a left-to-right schematic power-flow diagram. Bottom half has four compact value panels. Use simple engineering icons: two PV blind window modules, short DC harnesses, fixed headbox/service zone, dual-input microinverter box, AC branch cable, AC junction/combiner, building AC panel/grid. Keep text horizontal, high contrast, and legible.

Top power-flow diagram labels, render verbatim where possible:
1. "Blind module A: 40 Vmp, 300-480 W"
2. "Blind module B: 40 Vmp, 300-480 W"
3. "short protected DC harness"
4. "moving side: low-voltage DC only"
5. "fixed dual-input microinverter"
6. "Input 1 MPPT = blind A"
7. "Input 2 MPPT = blind B"
8. "230 Vac 50 Hz fixed AC branch"
9. "AC junction / combiner / protection"
10. "building AC interface"

Important callouts:
- "No slat-level electronics"
- "No AC across moving blind interface"
- "One independent MPPT input per blind"
- "Do not merge differently shaded blinds before MPPT"
- "PV blind sets DC envelope; AC voltage follows certified grid product"

Bottom panel A title: "Target iWin H3 PV Output"
Panel A values:
- "Design center: 400 W per blind"
- "Product band: 300-480 W/blind"
- "Upper edge: 500 W with current check"
- "600-720 W case: split into 2 sections"
- "Vmp STC: 40 V nominal"
- "Acceptable Vmp: 38-42 V"
- "Voc STC: about 50 V"
- "Voc cold target: <58 V"
- "Absolute input ceiling: <60 V"
- "Imp target: 10-12 A"
- "Isc target: <=14 A"

Bottom panel B title: "Candidate Device Fit"
Panel B values:
- "APsystems EZ1/DS3: 2 independent MPPTs, 28-45 V MPPT, max 60 V"
- "Hoymiles HMS-500-1T: one MI per blind, 300-500 VA class"
- "NEP BDM-300: lower-power benchmark, 22-55 V MPPT, 14 A"
- "TSUN GEN3 6-in-1: zone box pattern, 6 MPPTs"
- "Enphase IQ8: certification benchmark, less clean for high-current EMEA H3"

Bottom panel C title: "Voltage / Current Check at 40 Vmp"
Panel C values:
- "330 W -> Imp 8.25 A, Isc about 9.5 A"
- "412.5 W -> Imp 10.3 A, Isc about 11.9 A"
- "480 W -> Imp 12.0 A, Isc about 13.8 A"
- "495 W -> Imp 12.4 A, Isc about 14.2 A"
- "600 W -> Imp 15.0 A: split/check"
- "720 W -> Imp 18.0 A: split required"
- "Voc cold: 55.2 V at -10 C"
- "Voc cold: 56.8 V at -20 C"
- "Voc cold: 58.2 V at -30 C"

Bottom panel D title: "AC Branch And Rules"
Panel D values:
- "AC output class: 230 Vac, 50 Hz"
- "2 x 400 W blinds -> about 800 Wdc"
- "800 VA MI current -> about 3.5 Aac"
- "50 blinds at 400 W -> 20 kWdc"
- "50 blinds -> 25 dual-input MIs"
- "Fixed serviceable electronics only"
- "Grid profile / certification required"
- "Need phase balance, protection, service isolation"

Visual constraints: Do not use logos, decorative blobs, gradients, marketing hero styling, lorem ipsum, pseudo-text, watermark, or 3D effects. Do not put electronics on slats. Make the moving/fixed boundary visually clear. Use arrows to show DC side in green and AC side in blue. Put warning badges only on split-required and no-AC-on-moving-interface statements. Use compact tables or panel rows, not paragraphs. Keep cards to 8 px radius max.
