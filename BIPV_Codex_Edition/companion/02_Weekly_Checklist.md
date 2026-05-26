# Weekly Checklist — iWin-Type BIPV v2

## Repeating checklist

- [ ] Define this week’s exact engineering question in one line.
- [ ] Separate **verified public facts**, **public clues**, **engineering inferences**, and **vendor-data required**.
- [ ] Draw one diagram that makes the subsystem legible.
- [ ] Extract at least **3 decision-relevant numbers or limits**.
- [ ] Update the **standards/design-envelope** matrix.
- [ ] Update the **assumption register**.
- [ ] Update the **capstone memo skeleton**.
- [ ] Update the **FMEA** if any new interface or failure mode appears.

---

## Week 1 — Product decomposition

### Required outputs
- [ ] Functional block diagram
- [ ] Public-fact inventory
- [ ] Interface map: optical / thermal / electrical / control / service

### Numeric / decision outputs
- [ ] Capture at least 5 public concept facts
- [ ] Capture at least 5 true unknowns
- [ ] Mark 3 highest-risk interfaces

### Gate
- [ ] No hidden assumptions remain inside prose

---

## Week 2 — Window-stack and façade integration basics

### Required outputs
- [ ] One section view
- [ ] Replaceable-boundary sketch
- [ ] Feedthrough-path sketch

### Numeric / decision outputs
- [ ] List 2–4 candidate replaceable-unit boundaries
- [ ] List 2–4 candidate feedthrough locations
- [ ] List dominant heat path assumptions for each section option

### Gate
- [ ] Section assumptions are visible and tagged

---

## Week 3 — Solar geometry for vertical windows

### Required outputs
- [ ] South façade incidence/irradiance plots
- [ ] East or west façade incidence/irradiance plots

### Numeric / decision outputs
- [ ] Monthly or seasonal incidence-angle ranges
- [ ] Time windows of likely direct-sun dominance
- [ ] Periods where the blind behaves more like a shading element than an energy element

### Gate
- [ ] Orientation-specific operating periods identified

---

## Week 4 — Daylight, glare, and state logic

### Required outputs
- [ ] Slat-state decision table
- [ ] Quantified comfort variables
- [ ] First-pass FMEA seed

### Numeric / decision outputs
- [ ] Define at least one glare metric or glare proxy
- [ ] Define at least one daylight target or range
- [ ] Define fail-safe slat position
- [ ] Start FMEA with top 10 failure modes

### Gate
- [ ] Control is no longer narrative-only

---

## Week 5 — Dynamic control co-design

### Required outputs
- [ ] Comfort-first policy
- [ ] Yield-first policy
- [ ] Hybrid policy
- [ ] Override hierarchy

### Numeric / decision outputs
- [ ] Write objective function and weights
- [ ] Define sensor set and update cadence
- [ ] Define fallback on loss of sensor / actuator feedback
- [ ] Compare kWh / glare / heat-gain / occupant-impact qualitatively or quantitatively

### Gate
- [ ] Fail-safe and fallback behaviors defined

---

## Week 6 — Slat/string partitioning and mismatch

### Required outputs
- [ ] Case A: two strings share one bypass diode
- [ ] Case B: one bypass diode per string
- [ ] I–V / P–V sketches
- [ ] Thermal consequence note

### Numeric / decision outputs
- [ ] Count substrings and bypass devices per slat hypothesis
- [ ] Define shading scenarios: edge shade, neighboring slat shade, floor-to-floor shade
- [ ] Note which case localizes mismatch better

### Gate
- [ ] Partitioning choice is evidence-backed, not aesthetic

---

## Week 7 — System architecture after the window

### Required outputs
- [ ] Architecture comparison table
- [ ] Electrical-envelope placeholders
- [ ] Single-line concept for each candidate

### Numeric / decision outputs
- [ ] Placeholder `Voc,max`
- [ ] Placeholder `Isc,max`
- [ ] MPPT window requirement
- [ ] Isolation / disconnect boundary
- [ ] Connector and cable class hypothesis

### Gate
- [ ] No architecture may be preferred without electrical-envelope fields filled

---

## Week 8 — Monitoring and diagnostics

### Required outputs
- [ ] Unit ID scheme
- [ ] Grouping map
- [ ] Telemetry list
- [ ] Alarm/event list

### Numeric / decision outputs
- [ ] Logging cadence by signal
- [ ] Minimum retained fault history
- [ ] Temperature-sensing or inference requirement
- [ ] Actuator state feedback requirement

### Gate
- [ ] A plausible fault localization route exists

---

## Week 9 — Thermal model

### Required outputs
- [ ] First-order thermal network
- [ ] Temperature guardband logic
- [ ] High-temperature review trigger note

### Numeric / decision outputs
- [ ] Dominant thermal resistances or paths
- [ ] Candidate worst-case operating state
- [ ] Preliminary slat temperature limit or guardband
- [ ] Explicit missing thermal properties

### Gate
- [ ] Thermal concern is linked to qualification path, not generic worry

---

## Week 10 — Reliability and failure modes

### Required outputs
- [ ] Re-rated FMEA
- [ ] Action list
- [ ] Replacement boundary map

### Numeric / decision outputs
- [ ] Severity gate check
- [ ] Top 5 actions by risk
- [ ] MTTR assumption by replacement level
- [ ] Downtime class by failure mode

### Gate
- [ ] Any `S >= 9` item has an action owner

---

## Week 11 — Commissioning, documentation, and maintainability

### Required outputs
- [ ] Draft single-line
- [ ] Façade unit map
- [ ] Startup checklist
- [ ] Acceptance checklist

### Numeric / decision outputs
- [ ] Required commissioning measurements
- [ ] Required document set
- [ ] Pass/fail criteria for first energization and control verification
- [ ] Thermography / inspection need

### Gate
- [ ] Handover evidence structure exists

---

## Week 12 — Capstone

### Required outputs
- [ ] Calculation-backed concept memo
- [ ] Compliance matrix
- [ ] Vendor-question list

### Numeric / decision outputs
- [ ] Scenario and climate assumptions frozen
- [ ] Electrical envelope summarized
- [ ] Top thermal and service risks summarized
- [ ] Top 5 unknowns blocking concept freeze summarized

### Gate
- [ ] Recommendation is conditioned by explicit unknowns, not hidden optimism
