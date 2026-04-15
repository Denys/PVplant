# BIPV Presentation Deck Audit

## Objective / decision

Review the five presentation decks as pre-design engineering material for iWin-type glazing-integrated PV shading devices, verify what is technically correct, identify what is overstated or unsupported, define the missing information blocking design-grade conclusions, and produce a detailed research prompt for the next research pass.

## Scope and method

- Decks reviewed:
  - `1_BIPV_Shading_Mitigation.pdf`
  - `2_The_Granularity_Paradigm.pdf`
  - `3_BIPV_Safety_Architecture.pdf`
  - `4_Active_Envelope_Engineering.pdf`
  - `BIPV_SD_Architectures_ACvsDC_Comparison.pdf`
- Working basis:
  - Local deck text extraction from the supplied PDF files
  - Local repo guidance in `AGENTS.md`, `README.md`, and `.agents/skills/bipv-predesign-assistant/SKILL.md`
  - Public technical sources used only to verify claims or frame standards and safety issues
- Evidence taxonomy used throughout:
  - `Verified public fact`
  - `Standards-backed framing`
  - `Public clue`
  - `Engineering inference`
  - `Vendor-data required`

## Source limitations

- The companion documents referenced by `AGENTS.md` are not present in this workspace. That means this review cannot update the intended assumption register, standards matrix, FMEA, or commissioning pack directly.
- The decks themselves contain very few explicit citations. Many statements are directionally plausible but not traceable as written.
- No architecture ranking is justified yet. Across all five decks, the hard-gate electrical-envelope inputs are still missing:
  - `Voc,max`
  - `Isc,max`
  - MPPT window requirement
  - disconnect / isolation boundary
  - protection concept
  - connector family
  - cable class
  - replacement boundary

## Consolidated verdict

| Deck | Overall verdict | What is solid | What is not yet design-grade |
| --- | --- | --- | --- |
| `1_BIPV_Shading_Mitigation` | Directionally correct, rhetorically overstated | Series-string shading physics, reverse bias, bypass-diode limits, need for granularity | Universalized loss and temperature claims, weak citation discipline, architecture claims outrun envelope definition |
| `2_The_Granularity_Paradigm` | Strong conceptual case for DMPPT | Partial-shading mismatch, multi-peak P-V curves, monitoring granularity benefits | Blanket statements about centralized MPPT failure, ROI, and "optimal" architecture are not closed |
| `3_BIPV_Safety_Architecture` | Raises the right first-order hazards | Persistent PV generation under light, DC arc/fire concern, need for arc detection and segmentation | Safety/compliance language is too absolute; 120 V and "safe intervention" claims are unsupported as written |
| `4_Active_Envelope_Engineering` | Good system narrative, weak quantification | BIPV is both building product and generator; vertical thermal/shading issues are real | PR, NPV, LCOE, and "only friction is CAPEX" claims are unsupported without project data |
| `BIPV_SD_Architectures_ACvsDC_Comparison` | Useful comparison framework, premature conclusion | Microinverter vs optimizer trade space is real; thermal and form-factor constraints matter | Blanket optimizer preference and several thermal/electrical claims need vendor and product evidence |

## Evidence by tag

- `Verified public fact`
  - Partial shading can have a disproportionate effect on string power production; NREL reports that in one tested configuration, a shadow could reduce power by more than 30 times its physical size.
  - Partial shading creates multi-peak P-V characteristics, and conventional local MPPT methods can miss the global maximum under those conditions.
  - Bypass diodes reduce hot-spot risk but do not eliminate excessive local dissipation in all mismatch cases.
  - PV arc and ground faults are serious fire-hazard mechanisms, and specialized arc-fault detection methods exist because ordinary overcurrent protection is not sufficient.
  - Thermal cycling is a major reliability stressor for PV inverters and other power electronics.
  - Large electrolytic capacitors are a known weak link in many single-phase DC-AC converter designs.

- `Standards-backed framing`
  - BIPV products need different thermal and safety framing than open-rack PV because integration into multi-layer building assemblies changes heat rejection and can expose products to non-conventional shading and limited cooling.
  - Existing mainstream PV qualification standards do not fully cover BIPV shading tolerance and overheating concerns; recent IEA-PVPS work explicitly calls this out and links BIPV thermal classification to IEC TS 63126.
  - Electrical safety cannot be reduced to one voltage slogan. Official safety guidance treats even lower-voltage sources as hazardous if they can deliver meaningful current.

- `Public clue`
  - Conventional string systems often operate at hundreds of volts DC, including 600-1000 Vdc classes, but the exact value is system-specific.
  - MLPE adoption is high in some markets, but that does not make module-level DMPPT "the BIPV standard."
  - Microinverters may face packaging and heat-rejection challenges in tight facade cavities, but this depends on product packaging, mission profile, and mounting.

- `Engineering inference`
  - For moving, variably shaded PV louvers, module-level or submodule-level control granularity is more defensible than classic centralized string MPPT.
  - Safety architecture for this class of product likely needs segmentation, explicit shutdown behavior, and strong service boundaries rather than a single topology choice.
  - Thermal qualification and serviceability are likely to be as decisive as shade-recovery performance in architecture selection.

- `Vendor-data required`
  - Any claim about the offered iWin build using per-floor DC buses, a specific voltage cap, integrated arc-fault technology, KNX or Modbus exposure, slim cavity fit, safe replacement procedure, or "insurable" architecture.
  - Any numeric claim for PR, LCOE, NPV, yield gain, operating temperature, or lifetime for the actual facade build.
  - Any statement about bypass partitioning, cable flex life, feedthrough design, enclosure rating, connector family, or replacement boundary.

## Numbers, clauses, or source pages used

- Deline 2009, NREL / PVSC:
  - Partial shading can cause a power reduction "over 30 times" the shadow's physical size in one tested configuration.
- Deline 2012, NREL shading testbed:
  - Microinverter trial result versus string inverter in one testbed:
    - `3.7%` gain under light shading
    - `7.8%` gain under moderate shading
    - `12.3%` gain under heavy shading
- Deline et al. 2017:
  - Distributed power electronics can extend effective system lifespan by roughly `5-10 years` in modeled cases, but converter reliability must be counted.
- IEA-PVPS T15-24:2024:
  - BIPV operating temperatures under non-conventional shading and limited cooling are a specific testing need.
  - Existing IEC 61215 / IEC 61730 coverage is not sufficient for BIPV shading tolerance and overheating issues.
  - Thermal classification is explicitly linked to IEC TS 63126 for elevated-temperature BIPV conditions.
- NIOSH electrical-safety guide:
  - `Below 1 mA`: generally not perceptible
  - `1 mA`: faint tingle
  - `5 mA`: slight shock; average person can let go
  - `6-25 mA` women / `9-30 mA` men: let-go range
  - `50-150 mA`: severe shock; death possible
  - Another official safety guide notes that sources at `30 V` or more with short-circuit capability of `2.5 mA` or more are hazardous.
- NREL inverter reliability assessment:
  - Power electronics were cited as `8%-12%` of lifetime PV cost in the report's framing.
  - Thermal cycling is treated as a prominent inverter stressor.

## Deck 1 - Shading Mitigation

### Objective / decision

Determine whether the deck correctly explains why urban and facade-integrated PV is vulnerable to partial shading and whether its argument for distributed MPPT is technically justified.

### Claim review

| Claim | Status | Evidence tag | Audit note |
| --- | --- | --- | --- |
| Slides 2-4: facade shading is dynamic and unlike open-field rooftop exposure | Supported | `Engineering inference` plus `Standards-backed framing` | Correct directionally. The deck is right that urban facade shading is persistent and dynamic, but it should cite an actual shading or irradiance study rather than rely on visuals alone. |
| Slide 3: a tiny shaded area can cause an 80% total power collapse | Conditionally supported | `Verified public fact` plus `Engineering inference` | Disproportionate loss is real, but `5% = 80%` is not a universal law. NREL shows shadow effects can be much larger than shadow area in some string configurations, but the exact loss depends on geometry, substringing, diode layout, and operating point. |
| Slides 4-7: shaded cells can go into reverse bias and create hot spots | Supported | `Verified public fact` | Correct. This is core PV mismatch physics. |
| Slide 7: hot-spot temperatures rapidly spike to `150 C+` and create facade fire risk | Conditional / overstated | `Public clue` | Very high local temperatures are plausible and have been observed in literature, but `150 C+` should be stated as a possible observed range, not a guaranteed outcome. The facade fire-risk statement also depends on encapsulants, cavity design, combustibles, and fault duration. |
| Slides 8-9: bypass diodes prevent catastrophic hot spots but sacrifice substring voltage and can fail under stress | Supported with nuance | `Verified public fact` | Correct overall. The deck should add that bypass diodes reduce but do not fully eliminate hot-spotting under all mismatch patterns. |
| Slides 10-11: centralized MPPT gets trapped at false local peaks under partial shading | Conditionally supported | `Verified public fact` | Correct for conventional local trackers such as simple P&O or INC. Overstated if read as applying to all modern global MPPT-capable inverters. |
| Slides 13-15: module-level DMPPT isolates shading to one facade element | Supported in principle | `Engineering inference` | Directionally correct. It still needs to be conditioned on actual electrical topology, shared buses, and shutdown behavior. |
| Slide 15: submodule or cell-level MPPT eliminates partial-shading mismatch entirely | Overstated | `Public clue` / `Engineering inference` | Submodule architectures can outperform module-level control, but "entirely" is too strong and the claim is not closed for real products. |
| Slide 17: BIPV requires a distributed nervous system of DMPPT | Conditional | `Engineering inference` | Reasonable thesis for the use case, but not yet a design fact until the electrical envelope and service boundary are defined. |

### Assumptions and vendor-data-required items

- Cell count, substring partitioning, and bypass topology per louver or glazing element
- Actual shade patterns:
  - horizontal
  - diagonal
  - narrow-edge
  - moving building-shadow transitions
- Candidate MPPT granularity:
  - array
  - string
  - module
  - submodule
- Maximum allowed hot-spot temperature, thermal guardband, and qualification basis
- Actual slat / louver operating states and their electrical consequence

### Checks / calculations performed

- Physics check: series-current bottleneck, reverse-bias risk, and multi-peak P-V behavior are consistent with public literature.
- Envelope check: no `Voc,max`, `Isc,max`, or MPPT-window data are present, so no architecture scoring calculation is possible.

### Risks, contradictions, and what could overturn the recommendation

- The deck sometimes treats dramatic worst cases as normal cases.
- It argues for DMPPT without defining the actual louver electrical grouping.
- A future product-level design could reduce mismatch through substring layout or differential power processing, which would change the granularity recommendation.

### Next artifact updates needed

- Add a shaded-pattern matrix by louver geometry
- Add a bypass-topology sketch
- Add explicit distinction between:
  - module-level DMPPT
  - submodule differential processing
  - global MPPT algorithms in centralized hardware

## Deck 2 - The Granularity Paradigm

### Objective / decision

Evaluate whether the deck makes a defensible technical case that DMPPT is materially better than centralized MPPT in shaded BIPV environments.

### Claim review

| Claim | Status | Evidence tag | Audit note |
| --- | --- | --- | --- |
| Slide 2: STC assumes uniform irradiance, 25 C cell temperature, and fixed spectrum | Supported | `Verified public fact` | Correct. |
| Slide 3: field conditions introduce dynamic occlusion, soiling, thermal variation, and module scatter | Supported | `Verified public fact` / `Engineering inference` | Correct. |
| Slides 4-7: mismatch causes multi-peak P-V curves and conventional MPPT can strand energy | Supported with nuance | `Verified public fact` | Correct for conventional local trackers. The deck should acknowledge that global MPPT methods exist. |
| Slide 8: DMPPT shifts from array generalization to node-level isolation | Supported in principle | `Engineering inference` | Correct as architecture framing. |
| Slide 9: module-level DMPPT is the commercially viable sweet spot | Conditional | `Engineering inference` | Plausible but not universally proven. It depends on thermal environment, form factor, reliability, serviceability, and cost. |
| Slides 11-12: microinverters and optimizers are the two main MLPE contenders | Supported | `Verified public fact` | Correct framing, though the deck omits submodule differential processing and AC-module variants. |
| Slide 13: DMPPT turns a black box into a transparent mesh with pinpoint diagnostics | Supported with scope limit | `Engineering inference` | Generally true if the chosen product actually exposes module-level telemetry and fault codes. Not all products do so in building-automation-friendly form. |
| Slide 15: the recovered yield vastly outpaces the hardware premium over life | Unsupported as written | `Vendor-data required` | This needs a real financial model with irradiance, shading, failure rate, O&M, discount rate, and electricity-value assumptions. |

### Assumptions and vendor-data-required items

- Measured annual shading profile for the actual facade
- Electrical grouping of louvers into strings, sectors, or AC branches
- MLPE product candidates and their:
  - efficiency maps
  - derating curves
  - telemetry outputs
  - failure modes
  - replacement method
- Diagnostics requirements:
  - BMS integration
  - commissioning screens
  - alarm classes

### Checks / calculations performed

- Literature check: public sources support the existence of multi-peak P-V curves and the limitations of local MPPT under partial shading.
- Benchmark check: public NREL shading tests support some yield gain from MLPE under shading, but not a universal ROI law.

### Risks, contradictions, and what could overturn the recommendation

- The deck treats economics as settled before architecture inputs are settled.
- It does not model the reliability penalty or replacement burden of more electronics at the edge.
- If shading is mostly predictable, coarse, and low-severity, the economic benefit of module-level electronics could narrow materially.

### Next artifact updates needed

- Add a real shade-weighting methodology
- Add a monitoring and diagnostics requirements table
- Add a converter-failure sensitivity analysis before any ROI curve is presented

## Deck 3 - Safety Architecture

### Objective / decision

Determine whether the deck correctly identifies the dominant electrical safety issues for facade-integrated PV and whether its three-pillar mitigation logic is technically and normatively defensible.

### Claim review

| Claim | Status | Evidence tag | Audit note |
| --- | --- | --- | --- |
| Slides 2-4: integrating PV into the building skin changes the risk profile and DC arcs persist more readily than AC arcs | Supported | `Verified public fact` / `Standards-backed framing` | Correct directionally. Official safety guidance explicitly notes that DC arcs are more persistent than AC arcs. |
| Slide 3: traditional string architectures route hazardous high-voltage DC loops through cavities | Conditionally supported | `Public clue` | Common in many string-PV systems, but the exact voltage class is system-specific and should not be stated as universal. |
| Slide 5: standard fuses often fail to trip during series arcs in PV arrays | Supported in principle | `Verified public fact` | Correct overall. Specialized arc-fault detection exists precisely because ordinary overcurrent protection is insufficient for many arc signatures. |
| Slides 6-7: cavities and chimney effects can amplify a local electrical fault into a larger facade fire problem | Supported as risk framing | `Standards-backed framing` / `Engineering inference` | Reasonable and important. It still needs project-specific combustibility and cavity testing to become a design fact. |
| Slide 7: firefighters cannot simply switch off a solar facade because illuminated panels keep generating | Supported | `Verified public fact` | Correct. |
| Slide 7: the facade presents a lethal shock hazard at currents `>2 mA` | Incorrect framing | `Verified public fact` | Official safety guidance does not support `>2 mA` as the right universal threshold here. Typical perception starts around `1 mA`, average let-go is around `5 mA`, and the serious let-go range is much higher. The deck should avoid this number entirely unless tied to a specific standard/test method. |
| Slides 9-10: MLPE fundamentally limits facade high-voltage exposure | Conditional | `Engineering inference` | Stronger for microinverters than for optimizers. Still not enough without the actual bus architecture and shutdown behavior. |
| Slides 11-12: `DC bus per floor` with voltage capped below `120 V` is inherently safe and too low to sustain a catastrophic arc | Unsupported | `Vendor-data required` / `Potentially misleading` | No public source reviewed here closes that claim. Official safety guidance still treats much lower-voltage sources as hazardous under the right current conditions. This slide needs redesign and explicit standards references if retained at all. |
| Slide 11: microinverters pass firefighter safety by AC-level safety; optimizers pass through rapid shutdown | Overstated | `Public clue` / `Vendor-data required` | Product listing, jurisdiction, and actual system wiring determine shutdown compliance. The blanket pass/fail framing is too coarse. |
| Slide 13: intelligent arc-fault detection based on high-frequency plasma signatures is required | Supported in principle | `Verified public fact` / `Vendor-data required` | Arc detection using high-frequency signatures is a credible approach, but the specific implementation and effectiveness are product-specific. |
| Slides 14-15: the three-pillar approach makes the architecture safe, insurable, and scalable | Unsupported as written | `Vendor-data required` | "Safe" and especially "insurable" are contractual and compliance claims. They cannot be awarded by concept slides. |

### Assumptions and vendor-data-required items

- Jurisdiction and applicable code path:
  - NEC
  - IEC
  - EN
  - local fire authority rules
- Disconnect and isolation boundary
- Shutdown initiation method, residual voltage profile, and time to safe state
- Arc-fault detector standard / listing / false-positive behavior
- Grounding, bonding, insulation-monitoring, and leakage-current strategy
- Fire-service operating procedure and access zones
- Cable routing in moving and fixed portions of the facade

### Checks / calculations performed

- Safety-threshold check: the `>2 mA` claim is not supported by official current-effect guidance reviewed here.
- Hazard-threshold check: an official safety guide still treats `30 V` and `2.5 mA` short-circuit capability as hazardous, so `120 V per floor` cannot be treated as self-proving safety.

### Risks, contradictions, and what could overturn the recommendation

- The deck correctly elevates safety to first-order importance, but then overcompresses safety into a few simplified slogans.
- It uses compliance-adjacent language without enough normative evidence.
- A well-documented listed architecture could still justify a segmented DC solution, but the present deck does not prove it.

### Next artifact updates needed

- Replace the current-threshold language with code- and standard-based framing
- Add a shutdown-state table with:
  - energized state
  - inverter-off state
  - power-loss state
  - fire-service state
  - maintenance lockout state
- Add explicit unknowns for cable class, connectors, feedthroughs, and moving-conductor protection

## Deck 4 - Active Envelope Engineering

### Objective / decision

Test whether the deck's integrated architectural, performance, safety, and economics narrative is technically sound enough for pre-design decision making.

### Claim review

| Claim | Status | Evidence tag | Audit note |
| --- | --- | --- | --- |
| Slide 2: BIPV is a dual-mandate asset that must satisfy both building and electrical requirements | Supported | `Standards-backed framing` | Correct and consistent with the IEA-PVPS standardization report. |
| Slides 3-4: vertical facade conditions differ sharply from rooftop conditions and standard assumptions do not transfer cleanly | Supported | `Standards-backed framing` / `Engineering inference` | Correct. |
| Slide 5: severe shading can choke a series string and create reverse-bias heating | Supported with nuance | `Verified public fact` | Correct. The exact `80%` magnitude remains configuration-dependent. |
| Slides 6-10: centralized string architecture fails safety and yield needs in the vertical environment | Overstated | `Engineering inference` | Centralized architecture is clearly disadvantaged in this use case, but "fails" is too absolute without the actual electrical envelope and mitigation options. |
| Slide 9: a bus-per-floor DMPPT architecture ensures inherent compliance with IEC/NEC audits and total safe intervention | Unsupported | `Vendor-data required` | This claim is much stronger than the evidence reviewed here supports. |
| Slide 10: CAPEX is the only real friction point for DMPPT | Incorrect / incomplete | `Engineering inference` | Thermal reliability, wiring complexity, maintenance, controls, EMC, enclosure volume, and service access are also major friction points. |
| Slides 12-14: DMPPT unlocks `>74% PR`, superior LCOE, and strongly positive NPV | Unsupported | `Vendor-data required` | None of these economics claims are traceable without explicit assumptions and calculations. |
| Slide 15: DMPPT provides native KNX / Modbus interoperability and pinpoint fault detection | Conditional | `Public clue` / `Vendor-data required` | Some systems can integrate well, but the statement is too broad without named products and protocol mappings. |
| Slide 16: DMPPT is not an upgrade but a prerequisite for safe and profitable active facades | Conditional | `Engineering inference` | Plausible as a thesis for this particular class of moving PV blind, but not a closed design fact yet. |

### Assumptions and vendor-data-required items

- PR definition, baseline, and loss stack
- LCOE and NPV model inputs:
  - CapEx
  - O&M
  - replacement events
  - failure rates
  - discount rate
  - tariff / self-consumption value
  - degradation rate
- BMS architecture and protocol exposure
- Prefabricated harness strategy and installation sequence
- Thermal mission profile behind the glazing / louver / cavity stack
- Acoustic, EMC, and control latency constraints

### Checks / calculations performed

- Gate check: no defensible economics model can be run from the deck because no input assumptions are disclosed.
- Qualification check: the deck raises thermal reliability but does not define operating temperature limits or qualification method.

### Risks, contradictions, and what could overturn the recommendation

- The deck is strongest as a framing document and weakest where it becomes numerical.
- It compresses performance, safety, controls, and economics into a single directional argument, which hides unresolved assumptions.
- If thermal limits, maintenance burden, or electronics replacement costs are worse than assumed, the financial case can change substantially.

### Next artifact updates needed

- Add an explicit PR and LCOE equation sheet
- Add all economic assumptions in one place
- Split architectural value claims from electrical safety claims from financial claims

## Deck 5 - AC vs DC Architecture Comparison

### Objective / decision

Evaluate whether the deck fairly compares microinverters and power optimizers for BIPV shading-device use and whether its implied architecture preference is justified.

### Claim review

| Claim | Status | Evidence tag | Audit note |
| --- | --- | --- | --- |
| Slides 3-5: partial shading breaks series behavior and motivates module-level DMPPT | Supported | `Verified public fact` / `Engineering inference` | Correct. |
| Slide 6: microinverters eliminate high-voltage DC strings because AC outputs are paralleled to the building AC bus | Supported with nuance | `Verified public fact` | Correct at system level, but the deck should still acknowledge remaining AC hazard and local module DC. |
| Slide 7: optimizers regulate module output independently while using a central DC-AC stage | Supported | `Verified public fact` | Correct as generic optimizer framing. |
| Slide 8: optimizer architecture maintains high-voltage DC within the building facade; microinverters avoid it | Conditional | `Public clue` | Often true, but not universal. Some optimizer systems have low-voltage or shutdown states that materially change the risk picture. |
| Slide 9: microinverters are weakened by large electrolytic capacitors, whereas optimizers are solid-state resilient | Overstated | `Verified public fact` plus `Vendor-data required` | The capacitor-reliability concern in single-phase DC-AC conversion is real, but the deck turns a design tendency into a blanket product verdict. It also assumes optimizers avoid similar weak links without product proof. |
| Slide 10: optimizers fit mullions and hidden cavities far better than microinverters | Vendor-data required | `Vendor-data required` | This is a packaging claim, not a public fact. It needs real dimensions, cooling surfaces, cable bend radii, and installation drawings. |
| Slides 11-12: submodule or differential processing is the deeper frontier for complex moving shadow lines | Supported as frontier framing | `Engineering inference` / `Public clue` | Fair as a research direction, not as a procurement-ready conclusion. |
| Slide 13: optimizers are ideal in double-skin facades and dynamic sun-tracking systems; microinverters are overkill or thermally weak | Overstated | `Engineering inference` | The comparison matrix is useful, but too absolute. |
| Slide 15: optimizers offer the ideal balance and should be preferred for complex facades | Premature | `Engineering inference` / `Vendor-data required` | The preference may prove right, but not before electrical envelope, thermal mission profile, maintenance strategy, and product data are closed. |

### Assumptions and vendor-data-required items

- Candidate microinverter and optimizer product list
- Dimensions, mounting clearances, ingress ratings, and heat-sink requirements
- Per-louver power and current window
- Allowed AC branch current and conductor routing
- Optimizer string voltage strategy in all operating states
- Replacement boundary:
  - device only
  - louver cassette
  - glazing unit
  - mullion service bay
- Moving-cable / feedthrough life and minimum bend radius

### Checks / calculations performed

- Reliability framing check: public sources support the importance of thermal cycling and capacitor reliability in power electronics, but not a universal architecture winner.
- Architecture gate check: no `Voc,max`, `Isc,max`, or bus-voltage plan is disclosed, so the AC-vs-DC comparison cannot be closed quantitatively.

### Risks, contradictions, and what could overturn the recommendation

- The deck probably gets the direction of the trade space right, but not the certainty level.
- If a microinverter product exists with acceptable cavity fit, temperature derating, and service access, the optimizer preference weakens.
- If the optimizer architecture requires problematic facade DC routing or difficult emergency shutdown, the preference can reverse.

### Next artifact updates needed

- Replace the qualitative architecture matrix with a scored decision matrix tied to actual product data
- Add thermal, volume, and replacement-boundary rows
- Add AC branch versus DC segmented-bus single-line sketches

## Missing information and closure items

### Cross-deck missing information

| Topic | Why it blocks design-grade conclusions | Closure needed |
| --- | --- | --- |
| Electrical envelope | No architecture can be ranked without it | `Voc`, `Vmp`, `Isc`, `Imp`, temperature coefficients, series/parallel grouping, MPPT input window |
| Bypass and granularity topology | Shade behavior depends on it | Cell-string layout, bypass diode map, converter granularity |
| Shutdown and isolation boundary | Safety claims depend on it | Single-line diagrams for normal, fault, fire, and maintenance states |
| Thermal mission profile | Reliability and packaging claims depend on it | Simulated or measured temperatures, gradients, airflow assumptions, derating limits |
| Moving electrical interfaces | Not addressed in the decks, but first-order for PV blinds | Cable class, flex life, feedthrough detail, strain relief, replacement method |
| Serviceability | Electronics count only matters when replacement is defined | Field replaceable unit, access method, downtime class |
| Diagnostics and controls | DMPPT value depends on usable data | Telemetry points, alarm schema, protocol mapping, sensor set, fail-safe logic |
| Economics | Current claims are not auditable | CapEx, O&M, replacement, tariff, degradation, availability, discount rate assumptions |

### Specific closure items that should be requested from a vendor or internal design lead

- Offered module or louver electrical datasheet
- Thermal derating data for any MLPE in enclosed or semi-enclosed facade conditions
- Arc-fault, shutdown, and safety listing documentation
- Connector and cable family data, including movement qualification
- Installation and replacement drawings
- Telemetry and controls interface specification
- Product qualification basis for the exact offered build, not a related rooftop variant

## Checks / calculations performed

- Checked each deck against the repo's hard-gate rule set:
  - result: no deck provides the minimum electrical-envelope inputs needed for architecture scoring
- Checked whether each deck distinguishes:
  - module-level obligation
  - system-level obligation
  - electrical-design obligation
  - commissioning obligation
  - maintenance obligation
  - result: all decks blur these levels to some degree
- Checked whether each deck exposes assumptions explicitly:
  - result: no deck is assumption-clean; several claims hide unknowns inside declarative prose
- No numeric envelope calculation was performed because the required inputs are absent

## Risks, contradictions, and what could overturn the recommendation

- The shared thesis across the five decks is stronger than the proof level inside the decks themselves.
- The decks consistently point toward finer-granularity power processing, but they do not yet close the actual decision between:
  - microinverters
  - optimizers
  - segmented low-voltage DC buses
  - submodule differential processing
- The biggest hidden overturn risks are:
  - higher-than-assumed cavity temperatures
  - poor service access
  - unsafe or complex moving cable interfaces
  - shutdown / isolation behavior that does not match the safety narrative
  - economics that deteriorate once replacement and maintenance are priced honestly

## Next artifact updates needed

- When the companion pack is available, update:
  - `01_Reading_Tracker.md`
  - `05_Assumption_Register.md`
  - `06_Standards_and_Design_Envelope.md`
  - `03_iWin_FMEA_Template.md`
  - `07_Commissioning_and_Acceptance_Template.md`
  - `04_Capstone_Design_Memo_Template.md`
- Immediate recommended outputs before any architecture ranking:
  - electrical-envelope worksheet
  - topology comparison sheet
  - thermal-risk worksheet
  - moving-interface FMEA slice
  - shutdown-state and commissioning checklist draft

## Detailed research prompt

```text
You are a decision-grade BIPV pre-design research analyst working on iWin-type glazing-integrated photovoltaic venetian-blind / shading-device systems.

Your task is to audit and extend the research behind these five presentation decks:

1. C:/Users/Denys/Documents/Projects/PVplant/Presentations/1_BIPV_Shading_Mitigation.pdf
2. C:/Users/Denys/Documents/Projects/PVplant/Presentations/2_The_Granularity_Paradigm.pdf
3. C:/Users/Denys/Documents/Projects/PVplant/Presentations/3_BIPV_Safety_Architecture.pdf
4. C:/Users/Denys/Documents/Projects/PVplant/Presentations/4_Active_Envelope_Engineering.pdf
5. C:/Users/Denys/Documents/Projects/PVplant/Presentations/BIPV_SD_Architectures_ACvsDC_Comparison.pdf

Use the following evidence taxonomy for every non-trivial claim:
- Verified public fact
- Standards-backed framing
- Public clue
- Engineering inference
- Vendor-data required

Hard rules:
- Do not convert a public clue into a design fact.
- Do not hide unresolved assumptions inside prose.
- Do not rank a preferred architecture until the electrical envelope is defined.
- Before architecture scoring, explicitly define or mark missing:
  - Voc,max
  - Isc,max
  - MPPT window requirement
  - disconnect / isolation boundary
  - protection concept
  - connector family
  - cable class
  - replacement boundary
- Treat temperature, mismatch, bypass topology, feedthroughs, moving conductors, diagnostics, and replacement boundary as first-order issues.
- Distinguish module-level, system-level, electrical-design, commissioning, and maintenance obligations.

Primary research questions:
1. Which claims in the decks are verified, which are only conditionally true, and which are unsupported?
2. For moving and variably shaded PV louvers, what evidence actually supports module-level DMPPT versus centralized MPPT?
3. Under what conditions does module-level DMPPT materially outperform centralized architectures, and by how much?
4. What are the most defensible electrical topologies for:
   - microinverters
   - DC power optimizers
   - segmented low-voltage DC buses
   - submodule differential power processing
5. What safety architecture is required for facade-integrated moving PV devices:
   - shutdown behavior
   - isolation boundary
   - arc-fault detection
   - fire-service interaction
   - grounding / bonding / insulation monitoring
6. What thermal evidence exists for BIPV products under non-conventional shading and limited cooling?
7. What reliability evidence exists for:
   - power electronics in enclosed facade conditions
   - electrolytic capacitor stress
   - moving conductors
   - connectors
   - feedthroughs
   - cavity moisture / condensation exposure
8. What data is still vendor-specific and must be requested before any recommendation is presented as design-grade?

Required research method:
- Prefer primary sources:
  - NREL
  - IEA-PVPS
  - official code / standards summaries
  - peer-reviewed PV and power-electronics literature
  - official vendor datasheets and qualification reports where available
- Record for each source:
  - what decision it helps
  - what numbers it provides
  - what it does not prove
  - any contradictions or caveats
- Do not use marketing language as evidence.

Required outputs:
1. Deck-by-deck claim matrix with columns:
   - deck
   - slide or section
   - claim
   - evidence tag
   - status (supported / conditional / overstated / unsupported)
   - why
   - blocking unknowns
2. Extracted numbers and clauses table
3. Missing-information register
4. Vendor-data request list tied to exact closure items
5. Preliminary architecture decision matrix, but only after explicitly showing which electrical-envelope inputs are still missing
6. Thermal-risk note for BIPV shading devices with limited cooling
7. Safety-architecture note that distinguishes:
   - energized state
   - inverter-off state
   - fire-service state
   - maintenance lockout state
8. A final recommendation section that states:
   - what is currently defensible
   - what remains conditional
   - what could overturn the conclusion

Specific issues that must be tested carefully:
- The "5% = 80%" shading narrative
- Claims that centralized MPPT always gets trapped
- Claims that module-level DMPPT is the BIPV standard
- Claims that a per-floor bus below 120 V is inherently safe or arc-proof
- Claims that microinverters eliminate electrical risk
- Claims that optimizers are always thermally superior
- Claims of >74% PR, superior LCOE, superior NPV, or "only CAPEX friction"
- Claims that any architecture is already safe, insurable, scalable, or procurement-ready

Expected output structure:
1. Objective / decision
2. Evidence by tag
3. Numbers, clauses, or source pages used
4. Assumptions and vendor-data-required items
5. Checks / calculations performed
6. Risks, contradictions, and what could overturn the result
7. Next artifact updates needed

If data is missing, stop pretending it exists. Name the exact missing item and state why it blocks the recommendation.
```

## Public sources referenced in this audit

- Christopher Deline, "Partially Shaded Operation of a Grid-Tied PV System," PVSC 2009, NREL record and DOI: https://research-hub.nrel.gov/en/publications/partially-shaded-operation-of-a-grid-tied-pv-system-2/ and https://doi.org/10.1109/PVSC.2009.5411246
- Christopher Deline, "Photovoltaic Shading Testbed for Module-Level Power Electronics," NREL 2012: https://research-hub.nrel.gov/en/publications/photovoltaic-shading-testbed-for-module-level-power-electronics/ and https://doi.org/10.2172/1045715
- Christopher Deline et al., "Impact of Distributed Power Electronics on the Lifetime and Reliability of PV Systems," 2017: https://research-hub.nrel.gov/en/publications/impact-of-distributed-power-electronics-on-the-lifetime-and-relia-2/ and https://doi.org/10.1002/pip.2893
- Christopher Deline et al., "Mitigation of Hot-Spots in Photovoltaic Systems Using Distributed Power Electronics," 2018: https://research-hub.nrel.gov/en/publications/mitigation-of-hot-spots-in-photovoltaic-systems-using-distributed-2/ and https://doi.org/10.3390/en11040726
- IEA-PVPS Task 15, "Advancing BIPV Standardization: Addressing Regulatory Gaps and Performance Challenges," 2024: https://iea-pvps.org/wp-content/uploads/2024/12/IEA-PVPS-T15-24-2024-REPORT-BIPV-Standardization.pdf
- Peter McNutt, William Sekulic, Gary Dreifuerst, "Solar/Photovoltaic DC Systems: Information for Electrical Workers and Firefighters," 2020: https://research-hub.nrel.gov/en/publications/solarphotovoltaic-dc-systems-information-for-electrical-workers-a-2/ and https://doi.org/10.1109/MIAS.2019.2943649
- NIOSH, "Electrical Safety. Safety and Health for Electrical Trades. Student Manual," 2009: https://www.cdc.gov/niosh/docs/2009-113/pdfs/2009-113.pdf
- Jinia Roy, Gab-Su Seo, Akanksha Singh, "Highly Reliable Multi-Port Smart Inverter Modules for PV-Based Energy Systems," 2019: https://research-hub.nrel.gov/en/publications/highly-reliable-multi-port-smart-inverter-modules-for-pv-based-en-3/ and https://doi.org/10.1109/PVSC40753.2019.8981381
- Adarsh Nagarajan et al., "Photovoltaic Inverter Reliability Assessment," NREL report: https://research-hub.nrel.gov/en/publications/photovoltaic-inverter-reliability-assessment
- Faiza Belhachat and Cherif Larbes, "A review of global maximum power point tracking techniques of photovoltaic system under partial shading conditions," 2018: https://www.sciencedirect.com/science/article/pii/S1364032118303149 and https://doi.org/10.1016/j.rser.2018.04.094
