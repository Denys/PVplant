# PVplant iWin-Type BIPV Knowledge Base v2

## Purpose

This file stores the **data, assumptions, derived values, contradictions, and architecture hypothesis definitions** for the PVplant/iWin-type BIPV research workflow.

`AGENTS.md` should remain behavior-oriented. Numeric values, voltage-domain definitions, architecture state, contradictions, and derived indicators belong here.

This is a pre-design hypothesis store, not a final PV plant design, compliance file, procurement baseline, or vendor-approved datasheet.

---

## Guiding research logic

The project-research goal is not to design a precise final PV plant. The goal is to build a defensible, high-evidence pre-design basis for selecting the most suitable power-system architecture family for iWin-type BIPV PV venetian blinds.

Controlled research chain:

```text
known iWin/project primitives
-> derive electrical/system consequences
-> compare H1/H2/H3/H4
-> identify the most plausible architecture baseline
-> document assumptions and blockers
-> close later with vendor data, standards review, and commissioning evidence
```

Primary scope:

```text
Use known/project-defined parameters, reasonable defaults, and controlled assumptions
to develop and compare justifiable architecture hypotheses for iWin blind projects,
especially for a Lugano office facade case with ~60 m2 per floor and 3-5 floors.
```

Practical output target:

| Output | Required handling |
|---|---|
| Single high-evidence report / knowledge base | Keep as the central decision artifact |
| Qualitative + approximate quantitative dimensioning | Allowed at hypothesis stage when assumptions are explicit |
| H1-H4 architecture hypotheses | Refine, compare, and mark uncertainty boundaries |
| Evidence separation | Distinguish reliable public/project facts, primary assumptions, direct consequences, secondary indicators, and vendor-data gaps |
| DMPPT architecture direction | Build a decision path toward the most suitable family without pretending it is final certified plant design |

Key correction:

```text
Missing exact vendor data does not block architecture hypothesis development.
It blocks final closure, procurement, compliance sign-off, and precise design freeze.
```

---

## Reliability order used in this file

Values are ordered from most reliable to least reliable:

1. **Closed / verified public facts** — official public sources or project-closed facts.
2. **Product-proximate technical evidence** — peer-reviewed or pilot-adjacent evidence relevant to the product family.
3. **Standards-backed framing** — standards/guidance scope, checklists, and required design-envelope logic.
4. **Project scenario inputs** — user/project-defined use case values.
5. **Project-defined primary assumptions** — explicit modeling branch values selected for this study.
6. **Direct derived values** — algebraic results from the primary inputs.
7. **Secondary indicators** — architectural implications derived from the direct values.
8. **Stale/conflicting values** — retained for traceability; do not use as baseline unless resolved.
9. **Vendor-data-required gaps** — cannot be closed without datasheet, drawing, procedure, or qualification evidence.

---

# 1. Most reliable: closed / verified public facts

| ID | Statement | Value / content | Evidence status | Source / note | Design use |
|---|---|---:|---|---|---|
| F01 | Product family | iWin-type photovoltaic venetian blind integrated inside insulating double-glazed window | Verified public fact / closed project fact | `05_Assumption_Register.md` A01; `README_v2_iWin_Project_Companion.md` | Defines system family and section boundary |
| F02 | Functional claim | PV generation + solar/light control + glare protection | Verified public fact / closed project fact | `05_Assumption_Register.md` A02; `README_v2_iWin_Project_Companion.md` | Makes control objective multi-domain, not only kWh |
| F03 | System framing | Electro-optical-thermal-mechanical-control-service façade subsystem | Closed project framing | `README_v2_iWin_Project_Companion.md`, `Project research status.md` | Prevents generic façade-PV simplification |
| F04 | Thin-film wording exists publicly | Thin-film PV is a public clue, not a closed design fact | Public clue | `05_Assumption_Register.md` A03 | Do not use as final technology basis without vendor closure |
| F05 | Service skepticism | “Almost no maintenance” does not remove replacement/inspection design need | Engineering inference | `05_Assumption_Register.md` A10 | Keep commissioning and replacement boundary explicit |

---

# 2. Product-proximate technical evidence

| ID | Statement / value | Evidence status | Source / note | Design implication |
|---|---|---|---|---|
| P01 | One bypass diode per string outperformed two strings sharing one bypass diode | Product-proximate technical evidence | 2024 SUPSI/Solar RRL line, captured in `README_v2_iWin_Project_Companion.md` and `01_Reading_Tracker.md` R03 | Treat substring/bypass partitioning as first-order |
| P02 | Reported gain was >20% during spring/summer under the cited pilot context | Product-proximate technical evidence | same as P01 | Supports mismatch-aware DMPPT research, not final topology closure |
| P03 | Optimized topology also reported lower module temperatures | Product-proximate technical evidence | same as P01 | Electrical partitioning may affect thermal stress |
| P04 | Pilot did not observe extreme temperature/humidity at the actual building | Product-proximate technical evidence | `README_v2_iWin_Project_Companion.md` | Do not overclaim public overheating failure |

---

# 3. Standards-backed framing and active check logic

| ID | Reference / rule | Status | Stored implication |
|---|---|---|---|
| S01 | IEC 63092-1:2020 | Standards-backed framing | BIPV module as building product |
| S02 | IEC 63092-2:2020 | Standards-backed framing | BIPV system integrated into building |
| S03 | IEC 62548-1:2023 + A1:2025 | Standards-backed framing | PV array design backbone: DC wiring, protection, switching, earthing, voltage/current envelope |
| S04 | IEC 62446-1/-2 and IEC TS 62446-3 | Standards-backed framing | Commissioning, O&M, thermographic inspection logic |
| S05 | IEC 62109-3:2020 | Standards-backed framing | Electronics combined with PV elements; relevant for integrated DC/DC or DC/AC stages |
| S06 | IEC 62790 / IEC 62852 / IEC 62930 | Standards-backed framing | Junction/feedthrough, PV DC connectors, PV DC cables |
| S07 | IEC 61730-1/-2, IEC 61215-1/-2 | Standards-backed framing | Module safety and design qualification basis |
| S08 | IEC 61853-1/-2 | Standards-backed framing | Performance vs irradiance/temperature and incidence-angle characterization |
| S09 | IEC TS 63126:2025 | Standards-backed framing | High-temperature deployment path if base envelope is exceeded |
| S10 | IEA PVPS Task 15 BIPV Guidebook 2025 | Contextual / standards-backed guidance | BIPV decision process, performance, O&M, envelope integration |

Required project formulas, stored here canonically so AGENTS does not duplicate equations:

```text
Voc,max = Nseries × Voc,unit,STC × [1 + |βVoc| × (25°C - Tcell,min)]

Isc,max = Nparallel × Isc,unit,STC × (Gmax / 1000 W/m²) × [1 + αIsc × (Tcell - 25°C)]
```

Variable note: for maximum-current envelope, set `Tcell` to the governing current-case temperature, normally `Tcell,max` or the explicitly defined design case.

Current status: **formula available; final values blocked** until vendor/product data, temperature coefficients, irradiance assumption, and architecture grouping are closed.

---

# 4. Project scenario inputs

| ID | Parameter | Value | Status | Notes |
|---|---|---:|---|---|
| SC01 | Location | Lugano, Switzerland | Project scenario input | Use for climate/permitting studies |
| SC02 | Building type | Office façade | Project scenario input | Occupancy/glare relevance high |
| SC03 | Active blind area per floor | 60 m²/floor | Project scenario input | Treat each floor as candidate boundary, not automatic electrical field |
| SC04 | Floors | 3–5 | Project scenario input | Total active area 180–300 m² |
| SC05 | Total active area | 180 / 240 / 300 m² | Direct derived from SC03/SC04 | For 3 / 4 / 5 floors |
| SC06 | Power-density working range | 60–160 W/m² | Project scenario input / modeling band | Use as current baseline instead of older per-unit ambiguity |
| SC07 | Orientation baseline | south or south-west vertical façade | Project-defined scenario assumption | East/west is harsher glare/control variant |

---

# 5. Project-defined primary electrical and geometry assumptions

These are **not vendor data**. Use only for hypothesis-stage dimensioning.

| ID | Parameter | Current value | Status | Notes |
|---|---|---:|---|---|
| A-ELE-01 | Cell material branch | monocrystalline silicon | Project-defined assumption | Modeling branch; public thin-film clue remains unresolved |
| A-ELE-02 | Cell `Vmp` | 0.6 V | Project-defined assumption | Primitive voltage |
| A-ELE-03 | Cell `Imp` | 0.35 A | Project-defined assumption | Primitive current |
| A-ELE-04 | `Voc/Vmp` approximation | 1.25 | Project-defined assumption | Gives `Voc ≈ Vmp + 25%` |
| A-ELE-05 | Target module/window operating voltage | `Vmp,module ≈ 30 V` | Project-defined architecture constraint | PV-side source/input domain; not optimizer output voltage |
| A-ELE-06 | PV-side `Voc,STC` branch | `≈37.5 V` for 50S | Direct/project-derived source estimate | PV-side open-circuit estimate, not downstream DC-link voltage |
| A-ELE-07 | DC/DC optimizer output voltage | User/project-defined | Architecture design variable | Selected from downstream bus/string/PCE/rating/loss/cost/thermal constraints |
| A-GEO-01 | Nominal window/shutter/module size | 1.5 m × 2 m | Project-defined geometry input | Assumed width × height unless stated otherwise |
| A-GEO-02 | Max window/shutter/module size | 1.5 m × 3 m | Project-defined geometry input | Assumed width × height unless stated otherwise |
| A-GEO-03 | Slat/cell segment | 1.5 cm × 35 cm | Project-defined geometry input | Ambiguous whether 1.5 cm is slat height, PV strip height, or segment dimension |
| A-GEO-04 | Cells per slat segment | 2 | Project-defined input | Assumed series for the 1.2 V segment calculation |
| A-GEO-05 | Corrected slat density default | 60–70 slats/m | Project-defined corrected default | Supersedes prior `~82 slats/m` unless pitch is justified |

---

# 6. Voltage-domain rule: 30 V source is not optimizer output

This section is a hard semantic rule for all H1-H4 work.

```text
Vmp,module/window ≈ 30 V
= PV blind/window source-side operating voltage
= MPPT input-domain design point for a DC/DC optimizer or microinverter
≠ DC optimizer output voltage
≠ final DC-link voltage by default
```

Correct domain split:

```text
PV blind/window source
Vmp ≈ 30 V, Voc,STC ≈ 37.5 V
        ↓
PCE PV-side input / MPPT domain
tracks source MPP
        ↓
DC/DC or DC/AC power stage
conversion ratio selected by architecture
        ↓
output / DC link / AC branch
architecture-defined or vendor-defined
```

| Domain | Meaning | Current status | Do not confuse with |
|---|---|---|---|
| PV-side `Vmp ≈ 30 V` | Window/module generator operating voltage at MPP | Project-defined source assumption | Optimizer output voltage |
| PV-side `Voc,STC ≈ 37.5 V` | Open-circuit source estimate for 50S branch | Direct derived source value | PCE output/DC-link voltage |
| DC/DC optimizer input | MPPT domain around the PV source | Selected to include PV source operating range | DC/DC output |
| DC/DC optimizer output | Downstream DC bus/string contribution | User/project-defined architecture variable | 30 V source value |
| Microinverter DC link | Internal PCE high-voltage link | Vendor/topology-defined | External 30 V source value |
| AC branch output | AC collection domain | Architecture/PCE/grid defined | PV-side source voltage |

## 6.1 Current provisional output-voltage study bands

These are **engineering study bands**, not final compliant voltage classes.

| Branch | Provisional output / link target | Evidence status | Why it is useful |
|---|---:|---|---|
| Parallel common DC bus from per-window converters | `120-150 Vdc` | Engineering inference / project-defined study band | Cuts floor current versus raw 30 V while keeping boost ratio near `4-5` |
| Parallel high-voltage DC bus | `240-380 Vdc` | Conditional engineering inference | Lower floor current, but high conversion ratio from 30 V source |
| Series optimizer string | `380-600 Vdc` total string voltage | Conditional engineering inference | Keeps string current low; each optimizer output varies with `Vout_i = P_i/Istring` |
| Per-window microinverter | No external optimizer output | Vendor-data required | DC link is internal to the inverter/PCE |
| Per-zone DC/AC microinverter | No fixed external DC-link target | Vendor-data required | Multi-input or combiner stage and internal DC link are topology/vendor defined |

Invalid inference to reject:

```text
PV source Vmp ≈ 30 V → optimizer output must be 30 V
```

Correct formulation:

```text
PV source Vmp ≈ 30 V → PCE input/MPPT domain must include this source voltage.
PCE output voltage is selected separately from downstream architecture constraints.
```

---

# 7. Slat-density correction and conflict register

## 6.1 Corrected reasoning

If `1.5 cm` is the slat pitch or effective vertical allocation per slat:

```text
Nslats_per_m = 100 cm/m / 1.5 cm ≈ 66.7 slats/m
```

Practical default after allowing tolerances, clearances, overlap interpretation, and manufacturing variation:

```text
Nslats_per_m,default = 60–70 slats/m
```

## 6.2 Sensitivity table

| Pitch / vertical allocation | Slats per metre | Status |
|---:|---:|---|
| 12.2 mm | ~82/m | Required pitch if old 82/m value is true |
| 14.0 mm | ~71.4/m | Near upper edge of corrected band |
| 15.0 mm | ~66.7/m | Direct consequence of 1.5 cm pitch |
| 16.0 mm | ~62.5/m | Practical lower/mid band |
| 16.7 mm | ~60/m | Lower edge of corrected band |

## 6.3 Stale/conflicting value

| ID | Old value | Current status | Why |
|---|---:|---|---|
| C-SLAT-01 | `~82 slats per 1 m shutter height` | Stale / conflicting | Inconsistent with 1.5 cm pitch because 82/m implies ~12.2 mm pitch. Keep only as historical value until vendor/measured geometry resolves it. |

## 6.4 Downstream consequence

Do **not** use prior geometry-derived cell counts or string counts that depended on `82 slats/m` as baseline. Recalculate from corrected pitch/slat count once the interpretation of `1.5 cm × 35 cm` is fixed.

For current hypothesis work:

```text
1 m height: ~60–70 slats
2 m height: ~120–140 slats
3 m height: ~180–210 slats
```

Assumption: the second dimension of `1.5 m × 2 m` / `1.5 m × 3 m` is height.

---

# 8. Direct derived values from primary electrical assumptions

| ID | Derived value | Calculation | Result | Status |
|---|---|---|---:|---|
| D01 | Cell power | `0.6 V × 0.35 A` | 0.21 W | Direct derived |
| D02 | Two-cell segment `Vmp` | `2 × 0.6 V` | 1.2 V | Direct derived if cells are series |
| D03 | Two-cell segment power | `1.2 V × 0.35 A` | 0.42 W | Direct derived if series segment |
| D04 | Cells in series for 30 Vmp | `30 V / 0.6 V` | 50 cells | Direct derived |
| D05 | Segments in series for 30 Vmp | `50 cells / 2 cells/segment` | 25 segments | Direct derived if 2-cell segment series |
| D06 | 50S `Voc,STC` | `30 V × 1.25` | 37.5 V | Direct derived |
| D07 | One 50S string power | `30 V × 0.35 A` | 10.5 W | Direct derived |
| D08 | `Voc,cell` approximation | `0.6 V × 1.25` | 0.75 V | Direct derived |

---

# 9. Window/floor/building derived values using 60–160 W/m²

## 9.1 Window-level power and current

| Window size | Area | Power @60 W/m² | Power @160 W/m² | Current @30 V, low | Current @30 V, high | Status |
|---|---:|---:|---:|---:|---:|---|
| 1.5 × 2 m | 3.0 m² | 180 W | 480 W | 6 A | 16 A | Direct derived from scenario band |
| 1.5 × 3 m | 4.5 m² | 270 W | 720 W | 9 A | 24 A | Direct derived from scenario band |

## 9.2 Floor/building capacity

| Scope | Area | Power @60 W/m² | Power @160 W/m² | Raw current @30 V, low | Raw current @30 V, high |
|---|---:|---:|---:|---:|---:|
| 1 floor | 60 m² | 3.6 kWp | 9.6 kWp | 120 A | 320 A |
| 3 floors | 180 m² | 10.8 kWp | 28.8 kWp | — | — |
| 4 floors | 240 m² | 14.4 kWp | 38.4 kWp | — | — |
| 5 floors | 300 m² | 18.0 kWp | 48.0 kWp | — | — |

Derived implication:

```text
Raw 30 V floor-level aggregation is unattractive because one floor implies ~120–320 A.
```

---

# 10. Secondary indicators

| ID | Indicator | Derived from | Architecture implication |
|---|---|---|---|
| SI01 | Low-voltage / moderate-to-high-current window source | 30 Vmp + 180–720 W/window | Current, feedthrough, connector, and voltage-drop issues are first-order |
| SI02 | Raw 30 V floor bus penalty | 3.6–9.6 kWp/floor at 30 V = 120–320 A | Reject raw 30 V floor aggregation except demos or very short protected bus segments |
| SI03 | MPPT granularity is valuable | dynamic slat shading + product-proximate bypass evidence | H1/H2/H3/H4 remain valid contenders; direct stringing is weak without vendor proof |
| SI04 | Zone definition matters | floor/facade heterogeneity | Group only by persistent shading/control homogeneity, not by convenience alone |
| SI05 | Service boundary is architecture-defining | inaccessible façade hardware | Electronics location and replacement strategy can overturn electrical preference |
| SI06 | Temperature coefficients are not hypothesis blockers | concept-stage qualitative ranking | Still required before final `Voc,max`, `Isc,max`, component ratings, and sign-off |
| SI07 | DC/DC output voltage is independent from source `Vmp` | voltage-domain rule | H1/H2 must choose output/DC-link from downstream constraints, not copy 30 V source value |

---

# 11. Active architecture hypotheses

## H1 — per-window DC/DC MPPT + floor-level aggregation

```text
PV slats/internal strings
→ protected internal string groups
→ one 30 Vmp window-level DC generator
→ per-window DC/DC MPPT
→ floor-level higher-voltage DC bus or multi-MPPT inverter
→ building AC interface
```

Use when: window-to-window shading/control variation is high and window-level diagnostics/fault isolation are valuable.

Voltage-domain note: `30 Vmp` is the DC/DC input/MPPT domain. The DC/DC output may be a selected DC bus, string contribution, or inverter input voltage.

Watch: one DC/DC converter per window, electronics placement, thermal access, output-voltage choice, replacement boundary.

## H2 — per-zone DC/DC MPPT + floor-level multi-MPPT inverter

```text
windows grouped by shading/control homogeneity
→ zonal protected DC grouping
→ zonal DC/DC DMPPT or optimizer stage
→ floor-level multi-MPPT inverter
→ building AC interface
```

Use when: repeated façade zones behave similarly and reduced electronics count matters.

Voltage-domain note: grouped window sources remain low-voltage PV inputs; zonal DC/DC output voltage is architecture-defined.

Watch: zone definitions, LV grouping/protection, output-voltage choice, loss of granularity, one zone issue affecting multiple windows.

## H3 — per-window DC/AC microinverter

```text
PV slats/internal strings
→ one 30 Vmp window-level DC generator
→ per-window low-voltage-input DC/AC microinverter
→ floor-level AC branch collection
→ building AC interface
```

Use when: per-window independence, AC modularity, and fault isolation dominate.

Voltage-domain note: `30 Vmp` is the microinverter PV input domain; internal DC link and ripple management are vendor/topology-defined.

Watch: low-voltage/high-current input, higher converter count, thermal placement, service access.

## H4 — per-zone DC/AC microinverter for multiple windows

```text
windows grouped by shading/control homogeneity
→ protected LV DC combiner or multi-input zone stage
→ zone-level DC/AC microinverter
→ floor-level AC branch collection
→ building AC interface
```

Use when: zone-level AC conversion could reduce electronics count versus H3 while preserving AC-side modularity.

Voltage-domain note: multiple 30 V-class PV inputs feed a protected LV combiner or multi-input stage; the internal DC link is PCE/topology-defined.

Watch: LV DC combiner protection, coarser mismatch isolation, zone fault affecting multiple windows, and whether a suitable multi-input low-voltage DC/AC product exists.

---

# 12. Stale / superseded values and ambiguous branches

| ID | Value / branch | Status | Reason / action |
|---|---|---|---|
| OLD-01 | `~82 slats/m` | Superseded by 60–70/m default | Conflicts with 1.5 cm pitch; retain only as historical note |
| OLD-02 | Geometry-derived 28 strings / 295 W for 1.5 × 2 m based on old 82/m branch | Do not use as current baseline | Recalculate only after corrected slat/segment grid is fixed |
| OLD-03 | Geometry-derived 42 strings / 443 W for 1.5 × 3 m based on old 82/m branch | Do not use as current baseline | Recalculate only after corrected slat/segment grid is fixed |
| OLD-04 | 60–160 W per blind/unit wording | Ambiguous / weaker branch | Current cleaner baseline is 60–160 W/m² unless user explicitly wants per-unit branch |
| OLD-05 | 200 Wdc representative unit | Calculation-demo placeholder | Keep only for examples, not baseline architecture data |
| OLD-06 | 45 V / 36 V unit Voc/Vmp placeholder | Calculation-demo placeholder | Superseded by 30 Vmp branch unless intentionally comparing generic modules |
| OLD-07 | `30 V optimizer output` | Invalid inference | `30 V` is PV-side source/MPPT input-domain voltage, not DC/DC output voltage |

---

# 13. Vendor-data-required closure items

These block final down-select, TRS baseline, procurement, compliance sign-off, and vendor ranking.

| ID | Missing item | Why it matters | Related workflow |
|---|---|---|---|
| VDR-01 | Product revision and delta vs public/pilot references | Prevents mixing old pilot evidence with current offer | Vendor DOC-01/02 |
| VDR-02 | Section drawing with cavity/chamber, actuator, feedthrough, replaceable boundaries | Defines thermal path, service boundary, reliability risks | ARC-01/02/03 |
| VDR-03 | Actual electrical datasheet: Pmax, Voc, Vmp, Isc, Imp, βVoc, αIsc | Required for `Voc,max`, `Isc,max`, PCE compatibility | ELE-01 |
| VDR-04 | Actual PV technology/stack | Closes thin-film vs monocrystalline branch | ELE-02 |
| VDR-05 | Slat count, active slats, internal subdivision, string/sub-string map | Required for mismatch model and slat-density closure | ELE-03 |
| VDR-06 | Bypass topology and diode allocation | Central to thermal/yield behavior | ELE-04 |
| VDR-07 | Representative IV/PV curves under irradiance, temperature, angle, and partial shading | Needed for MPPT and DMPPT ranking | ELE-05 |
| VDR-08 | Allowed series/parallel aggregation and required downstream architecture | Determines H1/H2/H3/H4 viability | ELE-06/07 |
| VDR-09 | Earthing, insulation, leakage, isolation, disconnect concept | Safety and commissioning baseline | ELE-08+ |
| VDR-10 | Connector, cable, feedthrough definitions | Current, routing, mating, thermal reliability | ELE-10/11/12 |
| VDR-11 | Controls architecture and fail-safe states | Glare/yield/thermal/diagnostics interaction | CTL section |
| VDR-12 | Thermal evidence and qualification basis | May overturn electronics placement preference | THM section |
| VDR-13 | Replacement and recommissioning procedure | Defines serviceability and downtime | REL/COM section |
| VDR-14 | Commissioning package with measurable acceptance limits | Required for handover and field verification | COM section |
| VDR-15 | PCE input range, output/DC-link voltage range, conversion ratio, current limit, and topology | Required to compare H1/H2/H3/H4 without confusing source voltage with converter output | PCE/vendor closure |

---

# 14. Current provisional architecture posture

Current status:

```text
Hypothesis work: allowed
Provisional ranking: allowed if marked conditional
Most plausible architecture baseline: allowed if evidence-tagged and assumptions-bound
Final certified plant design freeze: blocked
TRS baseline: blocked
Vendor ranking: blocked
Compliance sign-off: blocked
```

Current qualitative expectation:

| Hypothesis | Current qualitative role | Why |
|---|---|---|
| H1 | Strong baseline | Best window-level granularity; manages 30 V source locally |
| H2 | Strong reduced-electronics alternative | Good when zones are truly homogeneous |
| H3 | Valid high-independence AC option | Best independence, highest electronics count |
| H4 | New compromise contender | Lower converter count than H3; AC collection; coarser mismatch isolation |

Voltage-domain consequence: H1/H2 are no longer penalized as if DC/DC outputs must remain at 30 V. Their output voltage is a chosen architecture variable.

What could overturn this:

- product requires a specific downstream architecture;
- available PCEs cannot handle low-voltage/high-current input;
- electronics thermal placement is not serviceable;
- zone homogeneity is poor;
- connector/feedthrough/cable current limits are weaker than assumed;
- vendor bypass topology already solves most mismatch locally;
- warranty excludes non-approved PCE architectures.

---

# 15. Next update hooks

When new evidence arrives, update in this order:

1. Add source to `01_Reading_Tracker.md`.
2. Add or close assumptions in `05_Assumption_Register.md`.
3. Update this knowledge file.
4. Update `06_Standards_and_Design_Envelope.md` if it affects electrical, thermal, safety, or commissioning gates.
5. Update `03_iWin_FMEA_Template.md` if it creates or closes a failure mode.
6. Update `07_Commissioning_and_Acceptance_Template.md` if it changes measurable acceptance logic.
7. Update `04_Capstone_Design_Memo_Template.md` when conclusions become memo-ready.
