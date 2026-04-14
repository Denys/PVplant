# Weekly Checklist — iWin-Type BIPV Roadmap

## Repeating checklist
- [ ] Define this week's exact question in one line.
- [ ] Separate **verified facts** from **engineering inferences**.
- [ ] Draw one diagram that makes the week's system legible.
- [ ] Identify the dominant 2–4 trade-offs.
- [ ] Identify the dominant 2–4 failure modes.
- [ ] Record the vendor data required to reduce uncertainty.
- [ ] Capture decisions in the assumption register.
- [ ] Update capstone memo skeleton.

---

## Week 1 — Product decomposition
- [ ] Write the four concurrent functions: glazing / shading / PV / controls.
- [ ] Draw a functional block diagram.
- [ ] Mark likely failure interfaces.
- [ ] List what is public fact vs unknown.

## Week 2 — Window-stack and façade integration basics
- [ ] Draw one section view.
- [ ] Mark cavity assumptions.
- [ ] Mark possible feedthrough path.
- [ ] Mark replaceable-unit boundaries.

## Week 3 — Solar geometry for vertical windows
- [ ] Select one south façade and one east or west façade.
- [ ] Plot seasonal sun path / incidence.
- [ ] Mark likely power-favorable vs shading-favorable periods.

## Week 4 — Daylight, glare, and shading-control logic
- [ ] Build a slat-state decision table.
- [ ] Define at least 3 operating states.
- [ ] Identify comfort-driven overrides.

## Week 5 — Dynamic control co-design
- [ ] Define comfort-first policy.
- [ ] Define yield-first policy.
- [ ] Define hybrid weighted policy.
- [ ] Compare kWh / glare / heat-gain trade-offs.

## Week 6 — Slat/string partitioning and mismatch
- [ ] Draw Case A: two strings share one bypass diode.
- [ ] Draw Case B: one bypass diode per string.
- [ ] Sketch I–V / P–V consequences under partial shading.
- [ ] Record thermal implications of current concentration / bypassing.

## Week 7 — System architecture after the window
- [ ] Compare direct stringing, optimizers, and microinverter-like partitioning.
- [ ] Score mismatch tolerance, serviceability, and integration burden.
- [ ] Identify which assumptions dominate architecture choice.

## Week 8 — Monitoring and diagnostics
- [ ] Define unit ID scheme.
- [ ] Define electrical grouping map.
- [ ] Define minimum telemetry.
- [ ] Define required event / fault classes.

## Week 9 — Thermal model
- [ ] Build first-order thermal network.
- [ ] Compare ventilated intuition vs enclosed intuition.
- [ ] Identify missing material / convection data.

## Week 10 — Reliability and failure modes
- [ ] Populate FMEA.
- [ ] Mark inaccessible-failure cases.
- [ ] Add detection method and service action.

## Week 11 — Commissioning, documentation, maintainability
- [ ] Draft single-line.
- [ ] Draft façade unit map.
- [ ] Draft startup checklist.
- [ ] Draft acceptance checks.

## Week 12 — Capstone
- [ ] Freeze scenario and climate assumptions.
- [ ] Summarize control concept.
- [ ] Summarize electrical partitioning.
- [ ] Summarize thermal risks.
- [ ] Summarize monitoring/access concept.
- [ ] List top 5 vendor unknowns.
