# Arch1 ultimate infographic prompt

Create a 16:9 engineering infographic for:

**Arch1 iWin PV Blind Optimizer String Topology**

Subtitle:

**Per-blind TS4-A-O / DC optimizer -> series DC string -> facade/string inverter**

Use a crisp vector-like raster style for a technical handout: white background, dark charcoal text, green PV/DC accents, blue inverter/AC accents, orange warning accents. Keep all text legible. Use simple engineering icons and compact panels. Use 8 px radius or less. No decorative blobs, no gradients, no logos, no watermarks, no pseudo-text. Do not draw the Tigo logo; label optimizer blocks generically as **TS4-A-O**.

## Main topology diagram

Top half, left to right:

1. Three repeated PV blind modules labeled **Blind module A**, **Blind module B**, **Blind module N**. Each blind is one complete window blind module, not one slat. Each module label: **45 Vmp, 330-500 W**.
2. Show internal PV strings / substring groups inside each blind.
3. Show a short protected DC harness leaving each blind toward the frame/headbox.
4. Add a strong vertical dashed boundary labeled:

   **MOVING INTERFACE: protected PV DC only**

5. On the fixed serviceable side of that boundary, show one optimizer per blind:

   **TS4-A-O A**
   **TS4-A-O B**
   **TS4-A-O N**

   Add label: **one optimizer / one MPPT per blind module**.
6. Connect the optimizer outputs in series into a DC string labeled:

   **DC string: 12-14 blind modules typical**

7. Feed the series string to **String inverter MPPT**.
8. Feed inverter output to **Building AC interface / switchboard**.

## Rule strip

Add a horizontal callout row below the main flow with compact check/warning symbols:

- **No slat-level electronics**
- **Optimizer per blind module, not per slat**
- **Keep optimizer on fixed serviceable side**
- **No high-cycle movement through optimizer body**
- **Per-blind MPPT preserves shading mitigation**
- **Group in series only after independent optimization**

## Bottom four panels

Panel A title: **Target iWin PV Module Output**

- **Pmp normal:** 330-500 W
- **Design center:** 400-500 W
- **One-optimizer upper:** 550-600 W
- **720 W case:** split into 2 x 360 W sections
- **Vmp STC:** 45 V nominal
- **Acceptable Vmp:** 42-48 V
- **Voc STC:** 55-60 V
- **Voc cold target:** <68 V
- **Absolute input ceiling:** <80 V
- **Imp normal:** 9-12 A
- **Isc normal:** <=14 A

Panel B title: **TS4-A-O / Optimizer Envelope**

- **Input Vmp:** 12-80 V current datasheet
- **Older sheet shown:** 16-80 V
- **Max input voltage:** 80 V
- **Input current:** 16 A Imp / 22 A Isc
- **Older sheet:** 15 A Imp / 20 A Isc
- **Max output current:** 15 A
- **Max output power:** 725 W current datasheet
- **Max system voltage:** 1000/1500 V
- **Rapid shutdown:** <30 s

Panel C title: **String Voltage Example**

- **12 blinds/string:** 540 Vmp
- **14 blinds/string:** 630 Vmp
- **Voc cold design:** 68 V/module
- **12 modules:** 816 V
- **14 modules:** 952 V
- **15 modules:** 1020 V: avoid in 1000 V class

Panel D title: **Architecture Rules / Vendor Closure**

- **Optimizer output voltage is NOT set manually**
- **Output varies with string current and inverter MPPT**
- **Use fixed headbox/facade service zone**
- **No raw PV merge before independent optimization**
- **Vendor closure:** Voc/cold, Isc, thermal, cable, connector, feedthrough, rapid shutdown

## Footer / legend

Add a compact footer legend:

- green = PV/DC blind side
- blue = DC collection and inverter side
- orange = design limit / warning
- Values are pre-design targets, not certified final plant data.

Make the composition feel like a decision-grade engineering handout, not a marketing slide.
