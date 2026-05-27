# PVplant iWin-Type BIPV Knowledge Base v2

## Purpose

This file stores the **shared canonical data, assumptions, derived values, contradictions, voltage-domain rules, and architecture hypothesis definitions** for both the WebGPT/ChatGPT BIPV Assistant and the PVplant/Codex research workflow.

`AGENTS.md` should remain behavior-oriented. Numeric values and technical state belong here.

This is a pre-design hypothesis store, not a final PV plant design, compliance file, procurement baseline, or vendor-approved datasheet.


---

## 0. Project research goal and scope

Project-research goal:

```text
Use known/project-defined parameters, reasonable defaults, and controlled assumptions
to develop and compare justifiable architecture hypotheses for iWin blind projects,
especially for a Lugano office façade case with ~60 m² per floor and 3–5 floors.
```

This knowledge base supports a **defensible, high-evidence pre-design basis** for selecting the most suitable power-system architecture family. It is not intended to freeze a certified plant design.

Practical output target:

- single high-evidence report / knowledge base;
- qualitative + approximate quantitative dimensioning;
- H1–H4 comparison;
- explicit split between reliable facts, assumptions, direct consequences, secondary indicators, and vendor-data gaps;
- decision path toward a suitable DMPPT architecture without pretending final design closure.

Critical correction:

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

Required project formulas:

```text
Voc,max = Nseries × Voc,unit,STC × [1 + |βVoc| × (25°C - Tcell,min)]

Isc,max = Nparallel × Isc,unit,STC × (Gmax / 1000 W/m²) × [1 + αIsc × (Tcell - 25°C)]
```

Current status: **formula available; final values blocked** until vendor/product data and architecture grouping are closed.

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
| A-ELE-05 | Target module/window operating voltage | `Vmp,module ≈ 30 V` | Project-defined architecture constraint | Treat as operating voltage, not absolute maximum voltage |
| A-GEO-01 | Nominal window/shutter/module size | 1.5 m × 2 m | Project-defined geometry input | Assumed width × height unless stated otherwise |
| A-GEO-02 | Max window/shutter/module size | 1.5 m × 3 m | Project-defined geometry input | Assumed width × height unless stated otherwise |
| A-GEO-03 | Slat/cell segment | 1.5 cm × 35 cm | Project-defined geometry input | Ambiguous whether 1.5 cm is slat height, PV strip height, or segment dimension |
| A-GEO-04 | Cells per slat segment | 2 | Project-defined input | Assumed series for the 1.2 V segment calculation |
| A-GEO-05 | Corrected slat density default | 60–70 slats/m | Project-defined corrected default | Supersedes prior `~82 slats/m` unless pitch is justified |

---

# 6. Slat-density correction and conflict register

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

# 7. Direct derived values from primary electrical assumptions

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

# 8. Window/floor/building derived values using 60–160 W/m²

## 8.1 Window-level power and current

| Window size | Area | Power @60 W/m² | Power @160 W/m² | Current @30 V, low | Current @30 V, high | Status |
|---|---:|---:|---:|---:|---:|---|
| 1.5 × 2 m | 3.0 m² | 180 W | 480 W | 6 A | 16 A | Direct derived from scenario band |
| 1.5 × 3 m | 4.5 m² | 270 W | 720 W | 9 A | 24 A | Direct derived from scenario band |

## 8.2 Floor/building capacity

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

# 9. Secondary indicators

| ID | Indicator | Derived from | Architecture implication |
|---|---|---|---|
| SI01 | Low-voltage / moderate-to-high-current window source | 30 Vmp + 180–720 W/window | Current, feedthrough, connector, and voltage-drop issues are first-order |
| SI02 | Raw 30 V floor bus penalty | 3.6–9.6 kWp/floor at 30 V = 120–320 A | Reject raw 30 V floor aggregation except demos or very short protected bus segments |
| SI03 | MPPT granularity is valuable | dynamic slat shading + product-proximate bypass evidence | H1/H2/H3/H4 remain valid contenders; direct stringing is weak without vendor proof |
| SI04 | Zone definition matters | floor/facade heterogeneity | Group only by persistent shading/control homogeneity, not by convenience alone |
| SI05 | Service boundary is architecture-defining | inaccessible façade hardware | Electronics location and replacement strategy can overturn electrical preference |
| SI06 | Temperature coefficients are not hypothesis blockers | concept-stage qualitative ranking | Still required before final `Voc,max`, `Isc.max`, component ratings, and sign-off |

---

# 10. Active architecture hypotheses

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

Watch: one DC/DC converter per window, electronics placement, thermal access, replacement boundary.

## H2 — per-zone DC/DC MPPT + floor-level multi-MPPT inverter

```text
windows grouped by shading/control homogeneity
→ zonal protected DC grouping
→ zonal DC/DC DMPPT or optimizer stage
→ floor-level multi-MPPT inverter
→ building AC interface
```

Use when: repeated façade zones behave similarly and reduced electronics count matters.

Watch: zone definitions, loss of granularity, one zone issue affecting multiple windows.

## H3 — per-window DC/AC microinverter

```text
PV slats/internal strings
→ one 30 Vmp window-level DC generator
→ per-window low-voltage-input DC/AC microinverter
→ floor-level AC branch collection
→ building AC interface
```

Use when: per-window independence, AC modularity, and fault isolation dominate.

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

Watch: LV DC combiner protection, coarser mismatch isolation, zone fault affecting multiple windows, and whether a suitable multi-input low-voltage DC/AC product exists.


---

# 11. Voltage-domain rule: 30 V module voltage is not optimizer output

## 11.1 Canonical correction

```text
Vmp,module/window ≈ 30 V = PV generator operating voltage at MPP / PCE input domain.
Voc,module/window ≈ 37.5 V for the 50S branch = PV-side open-circuit estimate.
Vout,optimizer ≠ 30 V by default.
Vout,optimizer is user/project-defined and architecture-dependent.
```

The DC/DC optimizer has two voltage domains:

```text
PV-side input: chosen to track the PV module/window MPP near 30 V
Converter output: chosen by downstream bus/string/PCE requirements
```

Do not penalize DC/DC optimizer architectures as if they must aggregate a floor at 30 V. Floor-level raw 30 V collection is unattractive; the point of the converter is to decouple PV-side MPPT from downstream voltage/current requirements.

## 11.2 Preliminary study bands

| Branch | Provisional voltage target | Status | Reason |
|---|---:|---|---|
| Parallel common DC bus after per-window converters | 120–150 Vdc first study band | Engineering inference | Reduces floor current while keeping 30 V → bus ratio near 4–5. |
| Parallel high-voltage DC bus | 240–380 Vdc only behind high-gain/isolated topology gates | Engineering inference / gated | Better current, but 8×–12.7× step-up from 30 V is nontrivial per window. |
| Series optimizer string | 380–600 Vdc total string voltage | Engineering inference | Keeps string current lower; per-window optimizer output varies with power and string current. |
| Per-window microinverter | Vendor/PCE-defined internal DC link | Vendor-data required | Startup, MPPT, ripple, thermal, safety/certification dominate. |
| Per-zone DC/AC microinverter | Vendor/PCE-defined internal DC link and multi-input rules | Vendor-data required | Zone grouping changes input current, protection, and mismatch behavior. |

## 11.3 Series optimizer relation

```text
Vout_i = Pwindow_i / Istring
Vstring = Σ Vout_i
M_i = Vout_i / Vmp_source
```

The relevant target is total string/DC-link voltage and acceptable per-converter ratio, not equal 30 V output per module.

## 11.4 Consequence for H1–H4

| Hypothesis | 30 V means | Downstream voltage means |
|---|---|---|
| H1 per-window DC/DC | PV input / MPPT target | chosen DC bus or inverter input voltage |
| H2 per-zone DC/DC | source-side MPPT domain | chosen zonal DC-link / floor inverter window |
| H3 per-window DC/AC | PV input to microinverter | internal DC link is vendor/topology-defined |
| H4 per-zone DC/AC | grouped low-voltage PV input domain | internal multi-input/DC-link design is architecture-defined |


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

---

# 14. Current provisional architecture posture

Current status:

```text
Hypothesis work: allowed
Provisional ranking: allowed if marked conditional
Final architecture preference: blocked
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
