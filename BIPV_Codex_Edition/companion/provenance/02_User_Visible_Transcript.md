# User-Visible Transcript — iWin Branch Export

## Turn 1 — User
```text
create project companion for:
Specialized roadmap for iWin-type products
What changes versus generic BIPV

For generic BIPV, the first lessons are usually façade orientation, shading, strings, and standards.
For iWin-type products, the highest-value lessons shift to window-stack physics + dynamic shading + electrical mismatch inside a glazing-integrated moving element. That shift is justified by the product architecture itself and by recent SUPSI-linked work on a dynamic, vertically oriented BIPV shading device, where slat/string electrical design measurably affected both temperature and yield. In that 2024 study, an “optimized” slat design with one bypass diode per string outperformed a “standard” design where two strings shared one bypass diode, achieving more than 20% energy gain in spring and summer while also lowering module temperature.

The six Pareto lessons for iWin
1. Treat it as an electro-optical-thermal window subsystem

Do not model it as “just PV on a façade.” It is simultaneously:

an insulating glazing unit component,
a solar-shading device,
a daylight/glare control element,
and a PV generator.
2. Blind angle / control strategy matters almost as much as PV efficiency

Because the product is fundamentally a photovoltaic venetian blind, performance depends on how you schedule shading state against sun angle, glare, cooling load, and power generation. This is a design inference from the product function claims and the dynamic-shading research context; it is the correct first-order learning target for this architecture.

3. Thermal behavior inside/around the glazing unit is first-order

BIPV standards and guidebook work emphasize that BIPV must be treated as both a building product and a building-integrated PV system, and current high-temperature qualification guidance exists specifically because some PV deployments run outside the temperature envelope assumed in base qualification. For iWin-type systems, that risk is structurally important because PV is embedded in a glazing/shading assembly rather than freely rear-ventilated like a rooftop module.

4. String partitioning and bypass design are not details

The 2024 dynamic BIPV shading paper is the strongest public clue here: electrical subdivision at the slat/string level changed both temperature and yield materially. For iWin-type products, mismatch learning is therefore not optional.

5. Frame/feedthrough/seal reliability is a core design topic

Once PV and shading are enclosed in an insulating window, wiring exits, moving interfaces, sealing, and long-term environmental robustness become central. This is an engineering inference from the public architecture and from the fact that IEC 63092 splits requirements between BIPV modules as building products and BIPV systems integrated into buildings.

6. Design serviceability and commissioning from day 1

Even if the sealed environment reduces dirt/weather exposure, commissioning and documentation remain essential, and inaccessible façade-integrated hardware always raises replacement/diagnostics stakes. IEC 62446-1 is the baseline framework for documentation, inspection, and commissioning tests. The “almost no maintenance” wording on the iWin site should be treated as a vendor claim, not as permission to defer access strategy.

Architecture sketch to keep in mind
Solar radiation
      ↓
[Outer glass pane]
      ↓
[Sealed glazing cavity / insulating unit]
      ↓
[PV venetian blind slats]
      ├─ optical function: shading / glare / daylight modulation
      ├─ electrical function: PV generation
      └─ thermal effect: absorbs + redistributes solar load
      ↓
[Inner glass pane]
      ↓
Indoor space

Electrical path:
PV slats → string partition / bypass network → frame feedthrough → local DC wiring / MLPE / inverter path

Control path:
sun / glare / temperature / occupancy logic → slat-angle command → optical + electrical operating point
12-week iWin-focused self-study roadmap
Phase 1 — Understand the product as a building element
Week 1 — Product decomposition

Goal: reduce the iWin concept to functions and interfaces.

Study:

official iWin product description
SUPSI description of the spin-off / research context
BIPV guidebook overview sections on BIPV as a multifunctional building product/system.

Deliverable:

one functional block diagram with:
glazing role
shading role
PV role
wiring path
control path
likely failure interfaces
Week 2 — Window-stack and façade integration basics

Goal: understand where iWin sits in the envelope stack.

Focus questions:

Is the PV blind in the main IGU cavity or a dedicated chamber?
Where do electrical feedthroughs cross the frame?
What thermal path exists from slat to ambient vs to room?
What is replaceable independently: glazing unit, blind subassembly, electronics, actuator?

Deliverable:

one section view with assumptions clearly marked:
Exterior | glass | sealed cavity | PV blind | glass | interior
Phase 2 — Solar, optical, and control behavior
Week 3 — Solar geometry for vertical windows

Goal: master irradiance on vertical glazing and why seasonal behavior is non-intuitive.

Tasks:

compute sun path for one south façade and one east/west façade
map direct sun incidence on slats by season
identify when slats are power-producing vs mostly shading elements

Deliverable:

monthly irradiance + incidence-angle plots for one façade orientation
Week 4 — Daylight, glare, and shading-control logic

Goal: learn the non-electrical value proposition.

Because iWin explicitly sells light control, solar control, and glare protection in addition to PV generation, you need a control strategy that balances:

daylight admission
glare suppression
summer overheating reduction
PV production.

Deliverable:

a state table like this:
Condition	Slat strategy	Primary objective
low winter sun	partial open	daylight + useful gain
summer high sun	more closed	glare + cooling-load reduction
strong direct sun with tolerable glare	energy-biased angle	maximize PV while controlling discomfort
Week 5 — Dynamic control co-design

Goal: stop thinking of “shading control” and “PV design” as separate.

Model three simple control policies:

comfort-first
yield-first
hybrid weighted policy

Deliverable:

one page comparing expected trade-offs in:
kWh
glare risk
solar heat gain
occupant acceptance
Phase 3 — Electrical behavior specific to PV slats
Week 6 — Slat/string partitioning and mismatch

Goal: understand how partial shading propagates electrically.

Use the 2024 SUPSI-linked paper as the anchor lesson: string-level partitioning plus bypass allocation materially changes yield and temperature.

Tasks:

model a slat/module with:
Case A: two strings share one bypass diode
Case B: one bypass diode per string
apply edge shading and neighboring-slat shading cases

Deliverable:

simplified I–V / P–V sketches and a note explaining why the optimized case can outperform strongly under seasonal shading
Week 7 — System architecture after the window

Goal: decide what happens electrically after the iWin element.

You do not need the final answer yet, but you do need to compare:

direct stringing of multiple window units
string + optimizers
microinverters / AC module-like partitioning

This is an engineering design exercise; the public iWin site does not specify the downstream power-electronics architecture. Keep assumptions explicit.

Deliverable:

one comparison table:
Architecture	Pros	Cons	Best fit
string only	high simplicity	mismatch-sensitive	uniform façades
optimizer-based	better mismatch handling	more parts	mixed shading
microinverter-like	max modularity	cost / outdoor electronics issues	fragmented systems
Week 8 — Monitoring and diagnostics

Goal: define how you would know the system is healthy.

IEC 62446-1 makes documentation and commissioning non-optional for grid-connected PV systems. For iWin-type products, add façade-specific observability:

unit ID map
slat/zone map
feedthrough location
access route
alarm classes.

Deliverable:

a monitoring point list:
string current/voltage
unit-level temperature if available
irradiation reference
actuator status
fault/event log
Phase 4 — Thermal, reliability, and deployment realism
Week 9 — Thermal model of the glazing-integrated PV blind

Goal: estimate whether temperature is likely to dominate efficiency/lifetime.

Relevant current standards context:

IEC 63092-1 / -2 frame BIPV as both building product and integrated system.
IEC TS 63126:2025 adds testing guidance for PV deployed under higher module temperature than the base qualification envelope.

Tasks:

build a first-order thermal resistance / energy-balance model
compare:
open ventilated external shading intuition
sealed or semi-enclosed glazing-integrated intuition

Deliverable:

Qsolar absorbed = Qto exterior + Qto interior + Qstored
Tslat rises until balance is reached
ηPV(T) falls as T rises
Week 10 — Reliability and failure modes

Goal: build the real risk picture.

Make an FMEA for:

slat string open-circuit
bypass diode failure
feedthrough failure
seal degradation
actuator/control failure
connector corrosion at frame exits
sensor failure
glazing replacement logistics

Deliverable:

FMEA table with severity / detectability / service action
Week 11 — Commissioning, documentation, and maintainability

Goal: translate concept into deployable project discipline.

Anchor this week on IEC 62446-1 documentation/commissioning logic. Also keep the public iWin claim of low maintenance in the correct box: useful design intent, but not an operations proof.

Deliverable:

mini commissioning pack:
single-line
façade unit map
labeling scheme
startup checklist
basic acceptance-test checklist
Week 12 — Capstone: one iWin façade concept

Goal: integrate everything into one engineering memo.

Choose one:

south office façade
west façade with glare-critical occupancy
retrofit of highly glazed multi-story building

Public iWin positioning explicitly highlights highly glazed buildings and retrofit/new-build suitability, so those are the most faithful capstone contexts.

Deliverable:

5–8 page design memo containing:
façade geometry and climate assumption
shading/control concept
electrical partitioning concept
thermal risk note
monitoring/access concept
top 5 unknowns that require vendor data
Best toolchain for this specialization
Core
Ladybug Tools for sun-path / façade irradiance / parametric geometry
Honeybee / EnergyPlus for daylight + cooling-load consequences of shading control
Python or MATLAB for custom mismatch and bypass-topology studies
CAD section drawings for frame/feedthrough/service concept
Optional
THERM / finite-element thermal modeling for frame/edge thermal bridges
PVsyst / PV*SOL only for high-level yield sanity checks, because standard PV tools can be weak at representing dynamic glazing-integrated slat systems without simplifications

That last point is an engineering inference from the geometry/control complexity and from the broader IEA observation that BIPV design often exceeds the natural scope of standard energy-yield tools.

What to read first
Must-read, in this order
iWin product page — to lock the actual concept before abstract study.
SUPSI innovative envelope / ISAAC pages — to place iWin in the research and BIPV context.
2024 Solar RRL paper abstract on the dynamic BIPV shading system — because it directly reveals which electrical detail mattered in practice.
IEC 63092-1 / 63092-2 summaries — to frame the module/system split correctly.
IEC 62446-1 summary — to keep commissioning/documentation in the loop.
IEC TS 63126:2025 summary — because heat is likely to be a first-order concern here.
The shortest “80/20” syllabus for iWin

If you only study five things, make them these:

Window-stack thermal behavior
blind-angle control logic
slat/string mismatch and bypass topology
frame feedthrough + sealing + serviceability
commissioning/monitoring architecture

That is the highest-yield specialization because it matches both the public product concept and the most revealing public performance result tied to this research line.

If useful, next I can turn this into a project folder pack with:

a reading tracker,
a weekly checklist,
an iWin-specific FMEA template,
and a capstone design memo template.
```

## Turn 2 — User
```text
add
## 20% time / 80% material bibliography matrix

This section was provided by the user but later explicitly cancelled with the single-word instruction: "ignore".
```

## Turn 3 — User
```text
ignore
```

## Turn 4 — Assistant
```text
Created the initial iWin project companion pack with:
- README / main companion
- Reading tracker
- Weekly checklist
- iWin-specific FMEA template
- Capstone design memo template
- Assumption register
- ZIP pack

Also explicitly excluded the later '20% time / 80% material bibliography matrix' addition after the user said 'ignore'.
```

## Turn 5 — User
```text
review with pro
```

## Turn 6 — Assistant
```text
Professional engineering review verdict:
- Good v0.7 scoping pack.
- Strong as research / architecture-orientation.
- Weak-to-moderate as pre-design / TRS-grade engineering pack.
Main review points:
- Keep structure.
- Strengthen electrical standards stack around IEC 62548-1 and related component/qualification standards.
- Add numeric design-envelope variables and calculations (Voc,max, Isc,max, MPPT window, protection, connector/cable class, replacement boundary).
- Soften thermal wording: treat temperature as a first-order unknown/qualification driver, not a demonstrated product failure.
- Add explicit control objective function and fail-safe states.
- Upgrade FMEA with severity gates and service-level fields.
- Correct public clue: iWin publicly states thin-film PV solar cells.
- Add a dedicated standards/design-envelope file as the highest-value next patch.
```

## Turn 7 — User
```text
proceed
```

## Turn 8 — Assistant
```text
Created v2 pack with:
- standards and design envelope file
- commissioning and acceptance template
- upgraded FMEA
- corrected assumption register
- weekly roadmap corrected to start first-pass FMEA earlier
- standards backbone centered on IEC 62548-1, keeping IEC 63092-1/-2 and IEC 62446-1 in role
- public anchor that iWin uses thin-film PV solar cells and the Solar RRL result (>20% spring/summer gain, lower temperature for one-bypass-diode-per-string design)
```

## Turn 9 — User
```text
proceed
```

## Turn 10 — Assistant
```text
Created v3 pack with:
- vendor technical questionnaire
- vendor response matrix TSV
- vendor response workbook XLSX
- vendor evaluation rubric
- vendor data-request cover note

v3 adds a vendor data acquisition + review layer with 58 structured questions, 34 Priority A / knockout items, and mapping from vendor answers to open assumptions and design-envelope rows.
```

## Turn 11 — User
```text
i want to export information from this chat without information loss to unite with other chat branches
```

## Notes
- Tool execution details are omitted.
- Internal reasoning is omitted.
- User-facing artifact filenames and outcomes are preserved in the exported bundle.
