# Arch1 ultimate infographic source-copy analysis

Date: 2026-05-28

## Source copies inspected

| Source copy | Path | Strong parts to reuse | Weak parts to avoid |
|---|---|---|---|
| WebGPT H1 copy | `Daily/H1 iWin PV Blind Topology H1 with TS4-A-O Optimizers.png` | Best topology clarity for multiple blind modules A/B/N; clear moving-interface boundary; fixed serviceable headbox zone; explicit one optimizer / one MPPT per blind; strong rule strip; good bottom disclaimer. | Slightly crowded; title repeats H1 twice; too much small text; some panel density is high. |
| Codex h1 copy | `Daily/h1_iwin_ts4_topology_infographic CODEX.png` | Cleaner numbered flow; better visual icons; strong 4-panel value structure; good legend; clear values for target module output, TS4 envelope, string voltage, and architecture rules. | Less explicit A/B/N multi-blind parallel-to-series transition; less clear moving/fixed boundary than WebGPT copy; uses a single-module visual at the start. |

## Combined design choice

The ultimate Arch1 infographic should use:

- WebGPT's multi-blind A/B/N system structure.
- WebGPT's moving-interface and fixed-service-zone boundary.
- Codex's four compact value panels.
- Codex's numbered left-to-right flow.
- WebGPT's explicit "one optimizer / one MPPT per blind" rule.
- Codex's clean legend and warning treatment.

## Must preserve

```text
1 blind module = whole PV blind in one window/opening
No slat-level electronics
Moving interface carries protected PV DC only
Optimizer mounted on fixed serviceable side
One optimizer / one MPPT per blind module
TS4 outputs connected in series
Output voltage is not set manually
String voltage is managed by inverter MPPT
10-14 blind modules per DC string typical
Do not merge differently shaded blinds before independent optimization
```

## Values to show

```text
Pmp normal target: 330-500 W
One optimizer upper design: 550-600 W
720 W case: split into 2 x 360 W sections
Vmp target: 45 V nominal, 42-48 V acceptable
Voc STC: 55-60 V
Voc cold design: <75 V, absolute <80 V
Imp target: <13.5 A
Isc target: <15-18 A

TS4-A-O envelope:
Input Vmp: 12-80 V current datasheet
Older sheet: 16-80 V
Max input voltage: 80 V
Input current: 16 A Imp / 22 A Isc current datasheet
Older sheet: 15 A Imp / 20 A Isc
Max output current: 15 A
Max output power: 725 W current datasheet
Max system voltage: 1000/1500 V
Rapid shutdown: <30 s

String example:
45 Vmp module
10 blinds/string -> 450 Vmp
12 blinds/string -> 540 Vmp
14 blinds/string -> 630 Vmp
Voc cold example: 67.6 V/module
12 modules -> 811 V
14 modules -> 946 V
15 modules -> 1014 V: over 1000 V class
```

## Naming note

The two source images call this H1. In the latest dashboard taxonomy this same topology is also called **H4/A4 per-blind optimizer string**. The generated infographic should use **Arch1** in the title to match the user's current naming and avoid further H-number drift.
