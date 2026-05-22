# Detailed Research Prompt - Lugano Office Facade iWin Re-Evaluation

```text
You are a decision-grade BIPV pre-design research analyst. Your task is to re-evaluate overstated or unfounded claims from prior iWin / BIPV shading-device presentation decks and then push the work into a practical engineering domain using a concrete office-building facade case in Lugano, Switzerland.

Your role is not to repeat conceptual BIPV narratives. Your role is to produce a technically defensible pre-design research output that distinguishes verified facts, standards-backed framing, engineering inference, and vendor-data gaps.

Project context
- Application: office building facade
- Location: Lugano, Switzerland
- System type: iWin-type glazing-integrated photovoltaic venetian blinds / PV shading devices
- Practical sizing case:
  - 60 m2 of iWin PV blinds per floor
  - building range: 3 to 5 floors
  - total active blind area range: 180 to 300 m2
  - 1m2 of blinds generates from 60 to 160W of Pmax
- Treat each floor as an electrically meaningful boundary candidate; do not assume it is the correct boundary until tested.

Primary objective
Produce a research-grade reassessment of the architecture, safety, performance, thermal, reliability, and dimensioning logic for this Lugano office-facade use case, with explicit attention to which claims from the earlier decks are valid, overstated, unsupported, or still vendor-data-dependent.

Mandatory evidence taxonomy
For every non-trivial claim, classify it as one of:
- Verified public fact
- Standards-backed framing
- Public clue
- Engineering inference
- Vendor-data required

Non-negotiable rules
- Do not convert a public clue into a design fact.
- Do not hide assumptions inside prose.
- Do not claim compliance sign-off, procurement readiness, or insurability from concept-level evidence.
- Do not rank a preferred architecture until the electrical envelope is defined or explicitly marked missing.
- Keep module-level, system-level, electrical-design, commissioning, and maintenance obligations separate.
- Treat the following as first-order issues, not appendices:
  - partial shading and mismatch
  - bypass topology
  - thermal behavior in facade cavities
  - moving conductors and feedthroughs
  - shutdown / isolation boundary
  - diagnostics and fault localization
  - replacement boundary
  - service access

Part 0 - Normative and legislative constraints
Before any technical recommendation, build a Swiss compliance and approval map for this Lugano case.

Required legal and normative workstream
Identify the latest applicable versions, scope boundaries, and project implications of the following constraint buckets:

1. Swiss federal electrical-installation legislation and supervision
- Electricity Act and implementing ordinances as applicable
- Low-voltage installation regime:
  - Ordinance on Low-Voltage Installations (NIV / OIBT; SR 734.27)
  - scope up to 1000 V AC / 1500 V DC
  - installation authorization, inspection, initial verification, periodic inspection, safety certificate, and responsible parties
- ESTI supervisory role for installations and products
- Low-voltage electrical product market requirements:
  - NEV and Swiss product-conformity obligations where applicable

2. Swiss construction-product and market-placement legislation
- Construction Products Act / Bauproduktegesetz (BauPG)
- Construction Products Ordinance / Bauprodukteverordnung (BauPV)
- Determine what must be proven if the iWin assembly is treated as:
  - facade product
  - glazing-related construction product
  - shading-device product
  - PV electrical product
  - integrated building product with multiple regulatory interfaces

3. Swiss fire-safety framework
- VKF / AEAI fire-protection requirements and latest solar-system guidance
- Determine facade-specific implications, not just rooftop PV rules
- Identify what the fire guidance means for:
  - DC cable routing
  - building entry
  - shafts and escape routes
  - cavity fire propagation
  - firefighter intervention
  - shutdown / isolator expectations
  - combustible and non-combustible layer assumptions

4. Swiss technical norms and recognized rules of technology
- Identify the currently applicable recognized technical rules for:
  - low-voltage electrical installation practice in Switzerland
  - PV module qualification and safety
  - BIPV-specific testing or gaps
  - facade / external-wall / glazing integration
  - surge protection, grounding, bonding, and lightning protection
  - EMC / controls where relevant
  - moving or motorized shading-system obligations where relevant
- Verify the status and relevance of, at minimum:
  - NIN / SN 411000
  - IEC 61215
  - IEC 61730
  - IEC TS 63126
  - any BIPV-specific product or facade standards that apply or are commonly used in Switzerland
- Do not assume a cited standard is sufficient just because it exists; say exactly what it covers and what it does not cover.

5. Cantonal Ticino energy and building constraints
- Check current Ticino energy-law and regulation requirements relevant to facade PV and building renovations / new works
- Include:
  - Len / RUEn implementation context
  - MoPEC-linked energy requirements where relevant
  - EN-TI / energy-file obligations accompanying building applications
  - cantonal incentive and remuneration frameworks that may affect economics but not technical compliance
- Distinguish:
  - mandatory legal requirements
  - optional incentive conditions
  - economic assumptions

6. Municipal Lugano planning and permitting constraints
- Verify municipal building-permit requirements for facade-mounted PV blinds / technical installations
- Check whether architectural, urban-planning, landscape, or heritage review is likely to apply
- Identify whether the concept may trigger additional scrutiny because it alters the facade expression, moving facade behavior, or visible building envelope

7. Grid-connection and operational-legislation constraints
- Identify the Swiss and local utility / DSO interface issues that affect:
  - connection approval
  - protection
  - metering
  - self-consumption structures
  - local energy communities or equivalent participation
  - export remuneration assumptions
- Separate technical interconnection constraints from revenue assumptions.

Mandatory compliance outputs
Produce:
- a regulatory map listing each authority / rule set / standard
- the decision it affects
- whether it is mandatory, recognized-good-practice, or incentive-related
- the document or evidence likely required for approval
- the project stage at which it matters:
  - concept
  - permit
  - procurement
  - installation
  - commissioning
  - operation

Compliance guardrails
- Use official or authoritative sources first:
  - Swiss federal authorities
  - ESTI
  - VKF / AEAI
  - Cantone Ticino
  - City of Lugano
  - official standards bodies or authoritative summaries
- If a rule is paywalled, identify the exact designation, title, latest verified edition date, and the specific question it must answer.
- Clearly distinguish:
  - law / ordinance
  - fire-protection guidance
  - recognized technical rule
  - market-access / declaration requirement
  - building-permit procedure
  - incentive rule
- Do not present legislative or normative requirements from memory if the latest version cannot be verified.

Part A - Re-evaluate overstated or unfounded claims
Audit the following claim families and determine, for each one, whether it is:
- supported
- conditionally true
- overstated
- unsupported
- contradicted

Claims that must be re-evaluated explicitly
1. "A mere 5% shaded area can cause an 80% total power drop."
2. "Centralized MPPT gets stuck under partial shading" as a universal statement.
3. "Distributed MPPT is mandatory for urban BIPV" stated without envelope conditions.
4. "Module-level DMPPT is the BIPV standard."
5. "A per-floor DC bus below 120 V is inherently safe" or too low to sustain a serious arc.
6. "Microinverters eliminate high-voltage DC risk" as a full safety claim.
7. "Power optimizers are thermally more robust than microinverters" as a general law.
8. "CAPEX is the only friction point" for DMPPT adoption.
9. ">74% PR is expected" without showing assumptions.
10. "Superior LCOE / NPV" without disclosed boundary conditions.
11. "The architecture is safe, insurable, scalable" based on conceptual mitigation pillars alone.

For every audited claim, provide:
- original claim
- evidence tag
- verdict
- why
- what would be needed to close it fully

Part B - Deep dive practical domain: Lugano office-facade system dimensioning
Use the Lugano case to move from abstract architecture discussion into practical pre-dimensioning.

Case definition
- Office building in Lugano, Switzerland
- 3, 4, and 5 floor variants
- 60 m2 of active iWin PV blind area per floor
- Analyze the system as three scenarios:
  - 180 m2 total
  - 240 m2 total
  - 300 m2 total

Required practical dimensioning workflow
1. Define the minimum missing inputs needed to size the system credibly.
2. Build a bounded set of practical assumptions if vendor data is unavailable.
3. Show which assumptions are placeholders and which are public-evidence-backed.
4. Calculate first-pass system size ranges, not fake precision.
5. Compare architecture options using the same Lugano case.

Minimum dimensioning inputs that must be defined or flagged missing
- PV active-area power density assumptions for iWin blinds
- unit / louver rated power
- unit Voc, Vmp, Isc, Imp
- temperature coefficients
- cell / substring / bypass layout
- louver count or module count per floor
- orientation and facade azimuth assumptions
- tilt / louver operational state assumptions
- irradiance source and weather dataset for Lugano
- cell temperature model or thermal assumption
- shading patterns:
  - self-shading
  - adjacent-building shading
  - overhang / side-fin shading
  - seasonal low-sun effects
  - dynamic louver-angle induced mismatch
- electrical grouping assumptions:
  - per louver
  - per panel
  - per string
  - per floor
- inverter / converter MPPT input windows
- target AC or DC collection topology
- cable routing assumptions
- replacement boundary

Required first-pass calculations
For each 3-floor, 4-floor, and 5-floor scenario:
1. Total active area
2. Installed DC nameplate range using a low / mid / high realistic power-density range
3. Number of blind elements or electrical units implied by the assumed module size
4. Per-floor DC capacity
5. Building-total DC capacity
6. Candidate series / parallel grouping concepts
7. Voc,max checks under low-temperature conditions
8. Isc,max checks under high-irradiance conditions
9. MPPT window fit checks for candidate architectures
10. First-pass AC output range using realistic derating assumptions
11. Rough annual yield range for Lugano facade use, with explicit uncertainty bands
12. Performance ratio structure:
   - optical losses
   - temperature losses
   - mismatch / shading losses
   - conversion losses
   - availability / maintenance assumptions

Use this formula framing when inputs exist
Voc,max = Nseries x Voc,unit,STC x [1 + |betaVoc| x (25 C - Tcell,min)]

Isc,max = Nparallel x Isc,unit,STC x (Gmax / 1000 W/m2) x [1 + alphaIsc x (Tcell - 25 C)]

If inputs do not exist, do not fabricate them. State the exact missing value and which architecture decision it blocks.

Part C - Architecture comparison under the Lugano case
Evaluate at minimum:
1. Centralized string inverter architecture
2. String-level MPPT architecture
3. Module-level power optimizers with central inverter
4. Module-level microinverters
5. Segmented low-voltage DC bus per floor or per zone
6. Submodule differential power processing, if relevant as a frontier option

For each architecture, assess:
- regulatory fit in Switzerland / Ticino / Lugano
- electrical envelope
- shading tolerance
- impact of dynamic louver operation
- thermal burden at the edge
- maintainability
- monitoring granularity
- moving-cable implications
- emergency shutdown implications
- likely commissioning burden
- likely replacement burden
- what vendor data is needed to make the option real

Do not allow qualitative statements like "best" or "ideal" unless supported by the same criteria across all contenders.

Part D - Safety architecture for the Lugano office use case
Research and define the practical safety questions for this case:
- What is the correct isolation boundary?
- Should the system be segmented by floor, facade bay, orientation, or maintenance zone?
- What remains energized under daylight if:
  - the inverter is off
  - grid is lost
  - fire-service shutdown is initiated
  - one floor is isolated for maintenance
- What are the implications of Swiss / European electrical and fire-safety framing for facade-integrated PV?
- What are the implications of moving electrical parts in occupied-building envelopes?
- Which legislative or normative constraints force or materially favor one segmentation strategy over another?
- Which authority would likely require what evidence before approval, energization, or handover?

Required safety output
Produce a state table for:
- normal generation
- standby
- grid loss
- fire response
- maintenance lockout
- actuator failure
- communications failure

For each state define:
- energized components
- maximum expected voltage in accessible or concealed zones
- who may intervene
- required diagnostics
- residual hazards

Part E - Thermal and reliability deep dive
The Lugano case must include a practical thermal and reliability review, not generic statements.

Investigate:
- likely summer cavity temperatures in facade-integrated blind assemblies
- winter low-temperature effects on Voc,max
- thermal cycling severity for edge electronics
- whether microinverters, optimizers, or segmented converters are more exposed in this geometry
- reliability implications of:
  - moving conductors
  - connectors in moving assemblies
  - repetitive bending
  - condensation
  - enclosure sealing
  - inaccessible edge electronics

For each reliability concern, classify whether it is:
- publicly supported
- plausible engineering inference
- vendor-data required

Part F - Practical deliverables required
Return the research in this order:
1. Objective / decision
2. Evidence by tag
3. Lugano office-facade case definition
4. Re-evaluation of overstated claims
5. Practical dimensioning assumptions
6. Calculations performed
7. Normative and legislative constraints map
8. Architecture comparison table
9. Safety state table
10. Thermal and reliability findings
11. Missing information / vendor-data-required register
12. What can currently be said with confidence
13. What remains conditional
14. What could overturn the provisional recommendation
15. Next artifact updates needed

Required tables
At minimum include:
- claim re-evaluation matrix
- assumptions register
- normative / legislative constraints matrix
- electrical-envelope table
- architecture comparison matrix
- safety state table
- vendor-data closure table

Source requirements
- Prefer primary and authoritative sources:
  - NREL
  - IEA-PVPS
  - Swiss federal authorities and ordinances
  - ESTI
  - VKF / AEAI
  - Cantone Ticino
  - City of Lugano
  - IEC / CENELEC / Swiss code summaries or official guidance
  - peer-reviewed PV and MLPE literature
  - MeteoSwiss or equivalent authoritative climate / solar data sources
  - official vendor datasheets and qualification reports
- For each source, state:
  - what it helps decide
  - what numbers it provides
  - what it does not prove

Specific practical questions that must be answered
1. For 60 m2 per floor in Lugano, what is the realistic DC nameplate range for iWin blinds?
2. Does 3-5 floors push the system toward:
   - AC collection
   - optimizer-based DC collection
   - segmented low-voltage DC collection
3. What floor-level segmentation makes sense for maintenance and emergency isolation?
4. What are the likely worst-case thermal states for edge power electronics in this facade geometry?
5. What assumptions dominate uncertainty the most:
   - PV power density
   - shading profile
   - louver operating schedule
   - thermal environment
   - MLPE failure / replacement burden
6. Which architecture remains most defensible after practical dimensioning rather than conceptual storytelling?
7. Which legal or normative constraints could eliminate an otherwise attractive topology?
8. Which approvals, inspections, declarations, and handover documents are likely required in Switzerland / Ticino / Lugano for this exact use case?

Guardrails
- Do not use a single deterministic estimate where a range is more honest.
- Do not claim bankability, insurability, or compliance approval from this exercise.
- Do not bury unknowns.
- If a conclusion depends on vendor confirmation, say so plainly.

Final expected outcome
The final answer should not be a marketing narrative. It should be a practical research-grade pre-design note that:
- corrects overstated claims,
- translates the problem into a real Lugano office-facade sizing exercise,
- identifies the most important architecture and safety decision points,
- and leaves a clean list of vendor-data closure items before further design progression.
```
