# iWin TS4-A-O topology infographic prompt

Use case: infographic-diagram
Asset type: engineering infographic for PV/BIPV architecture review
Primary request: Create a crisp, detailed technical infographic titled exactly: "iWin PV Blind Topology with TS4-A-O Optimizers". Show a per-window/blind-module DC optimizer architecture, not slat-level electronics.
Style/medium: clean technical vector-like raster infographic, white background, dark charcoal text, green PV accents, blue DC bus accents, orange warning accents. Professional engineering report style, not marketing. Landscape 16:9.
Composition/framing: left-to-right power-flow diagram across the top half; bottom half split into four compact data panels. Use simple icons: window blind module, fixed headbox/service zone, black optimizer box, DC string, string inverter, AC grid/building panel. Use arrows and labels. Keep all text horizontal, crisp, and legible.

Top power-flow diagram text and labels, render verbatim where possible:
1. "1 blind module = whole PV blind in one window/opening"
2. "PV blind internal strings/substrings"
3. "short fixed-frame/headbox DC harness"
4. "TS4-A-O mounted in fixed serviceable frame/headbox"
5. "TS4 outputs in SERIES"
6. "DC string: 10-14 blind modules"
7. "String inverter MPPT"
8. "Building AC interface"
9. callout near optimizer: "No slat-level electronics"
10. callout near optimizer output: "Output voltage is NOT set; TS4 output is variable and string-inverter controlled"

Bottom panel A title: "Target iWin PV Module Output"
Panel A values:
- "Pmp normal target: 330-500 W"
- "One-TS4 upper design: 550-600 W"
- "720 W case: split into 2 x 360 W sections"
- "Vmp target: 45 V nominal (42-48 V ok)"
- "Voc STC: 55-60 V"
- "Voc cold design: <75 V, absolute <80 V"
- "Imp target: <13.5 A"
- "Isc target: <15-18 A"

Bottom panel B title: "TS4-A-O Compatibility Envelope"
Panel B values:
- "Input Vmp range: 12-80 V current datasheet"
- "Older sheet shown: 16-80 V"
- "Max input voltage: 80 V"
- "Input current: 16 A Imp / 22 A Isc current datasheet"
- "Older sheet shown: 15 A Imp / 20 A Isc"
- "Max output current: 15 A"
- "Max output power: 725 W current datasheet"
- "Max system voltage: 1000/1500 V"
- "Rapid shutdown: <30 s"

Bottom panel C title: "String-Level Voltage Example"
Panel C values:
- "Vmp module = 45 V"
- "10 blinds/string -> 450 Vmp"
- "12 blinds/string -> 540 Vmp"
- "14 blinds/string -> 630 Vmp"
- "Example Voc cold = 67.6 V/module"
- "12 modules -> 811 V"
- "14 modules -> 946 V"
- "15 modules -> 1014 V: over 1000 V class"

Bottom panel D title: "Architecture Rules"
Panel D values:
- "Optimizer per blind module, not per slat"
- "Keep TS4 on fixed serviceable side of moving interface"
- "Do not put high-cycle movement through optimizer body"
- "Per-blind MPPT preserves modular shading mitigation"
- "Group blinds in series only after independent optimization"
- "Need final vendor closure: Voc/cold, Isc, thermal, cable, connector, feedthrough"

Visual constraints: Use engineering symbols and neat rounded rectangles with 8 px radius max. Avoid decorative blobs, gradients, marketing hero styling, logos, watermark, random pseudo-text, lorem ipsum, tiny illegible footnotes, and 3D effects. Leave enough whitespace. Make the values the main focus. Ensure the diagram clearly shows that the TS4-A-O is a variable-output optimizer in a series DC string feeding a string inverter.
