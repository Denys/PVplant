# H2-PDO Architecture Infographic Prompt

Generated: 2026-05-28

```text
Use case: infographic-diagram
Asset type: project research infographic, 16:9 landscape, high-resolution raster
Primary request: Create a corrected crisp engineering infographic titled "H2-PDO iWin PV Blind Parallel DCO Architecture".

Critical accuracy requirement: in all node-loading examples, calculate common DC node current as Ibus = total output power / Vbus. Do not use PV input current for node current. Correct examples: 4 x 400 W at 58 V -> Ibus = 1600 W / 58 V = 27.6 A, OK under 32 A. 5 x 350 W at 58 V -> Ibus = 1750 W / 58 V = 30.2 A, OK under 32 A. 5 x 400 W at 58 V -> Ibus = 2000 W / 58 V = 34.5 A, warning exceeds 32 A.

Overall composition: white background, clean technical vector-like raster, dark charcoal text, green PV/DC-input side, teal DCO blocks, blue common DC bus, gray fixed service zone, orange warning markers. Use a structured top schematic plus four bottom panels. Avoid logos, marketing styling, decorative gradients, pseudo-text, illegible filler, or electronics drawn on slats.

Top schematic flow, left to right:
Blind module A, whole window blind: "38-40 Vmp, 300-400 W"
Blind module B, whole window blind: "38-40 Vmp, 300-400 W"
Optional split section for high-power blind: "720 W -> 2 x 360 W"
-> short protected PV DC harnesses
-> vertical boundary line labeled "MOVING INTERFACE: protected PV DC only"
-> fixed service zone labeled "fixed frame / headbox / facade service box"
-> DCO A: "independent MPPT, buck-boost / boost"
-> DCO B: "independent MPPT"
-> DCO C: "independent MPPT for split section"
-> parallel protected common DC node labeled "48-60 V DC node, 3-4 DCO typical"
-> node combiner / fuse / disconnect / reverse-current blocking / current limit
-> shared downstream DC/DC or certified inverter front-end
-> building AC interface.

Connection rules callouts near schematic:
"No slat-level electronics"
"No raw PV merge before MPPT"
"One MPPT per blind or split section"
"DCO fixed and serviceable"
"No AC across moving blind interface"

Bottom panel A title: "Target iWin H2-PDO PV Output"
Include concise values:
"Design center: 400 W/blind at 40 Vmp"
"Product band: 300-400 W/blind"
"High-power blind: split 720 W into 2 x 360 W"
"Vmp target: 38-40 V"
"Voc STC: about 47.5-50 V"
"Voc cold target: <58 V"
"Imp target: <=10.5 A"
"Isc max target: <=14-15 A"

Bottom panel B title: "Candidate Device Fit"
Use a simple table-like panel:
"Elecdan 450 W buck-boost: 12-60 V in, 1-60 V out, IP67, price/cert missing"
"Infineon REF_4SBB: 400 W, 15-60 V MPPT, 60 V max, 15 A, reference design"
"TI TIDA-010949: 600 W, 15-80 V, 18 A, reference design"
"Genasun GVB-8-WP: 350 W, 8 A, Vmp max 43 V, IP68, USD 170-195, limited"
"Lensun boost MPPT: USD 79 price clue, not decision-grade"

Bottom panel C title: "Voltage / Current Checks"
Show equations and values exactly:
"PV input at 40 Vmp: 400 W / 40 V = Imp 10.0 A"
"Isc STC = 11.5 A; Isc max = 14.1 A"
"450 W / 40 V -> Imp 11.25 A; Isc max 15.8 A WARNING"
"40 Vmp -> Voc STC 50 V -> Voc cold -10 C = 55.2 V"
"Node bus current: Ibus = total W / Vbus"
"58 V node, 32 A cap: 4 x 400 W = 1600 W -> 27.6 A OK"
"58 V node, 32 A cap: 5 x 350 W = 1750 W -> 30.2 A OK"
"58 V node, 32 A cap: 5 x 400 W = 2000 W -> 34.5 A WARNING"

Bottom panel D title: "Commercial Gate"
Include:
"H2-PDO is competitive only if DCO channel <= EUR 45-65/blind"
"Node protection + enclosure <= EUR 10-20/blind"
"Shared downstream converter <= EUR 20-40/blind"
"Closed data needed: certificates, bus fault behavior, reverse current, shutdown, thermal, service path"

Visual constraints: no slat-level electronics, no AC on moving side, clearly show moving/fixed boundary, clearly show independent MPPT boundary before parallel DC node, show DC collection not AC branch, include key values with units, use warnings for current limits, keep all text compact and readable, no pseudo-text.
```
