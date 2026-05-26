# BIPV Presentation Deck Missing-Information Questionnaire

## Purpose

Use this questionnaire to close the missing information identified in:

- [BIPV_Presentation_Deck_Audit.md](./BIPV_Presentation_Deck_Audit.md)
- [BIPV_Presentation_Deck_Primary_Source_Reevaluation.md](./BIPV_Presentation_Deck_Primary_Source_Reevaluation.md)

This is not a marketing questionnaire. It is a closure document for turning deck claims into auditable engineering evidence.

## Completion rules

- Answer for the exact offered build, not a related rooftop or lab variant.
- If a value is unknown, write `Unknown`, not a guess.
- If a question is not applicable, write `N/A` and justify it in one sentence.
- For every numerical answer, include units.
- For every substantive answer, cite the evidence source:
  - datasheet
  - drawing
  - test report
  - qualification report
  - standard clause
  - simulation
  - calculation note
  - procedure
- If the answer depends on project assumptions, state the assumption explicitly.
- If the answer is based on a future design intent rather than a released product, mark it `Concept only`.

## Suggested response status

Use one of:

- `Provided`
- `Partly provided`
- `Unknown`
- `N/A`
- `Concept only`

## Section A - Knockout items

These items block architecture ranking if they are not answered.

| ID | Question | Why it is needed | Expected evidence | Hint on how to compile | Response status | Response / source |
| --- | --- | --- | --- | --- | --- | --- |
| KO-01 | What is the exact product identity and revision of the offered iWin build? | Prevents mixing claims from different variants. | Product datasheet, revision history, model code. | Use the commercial part number and the engineering revision actually proposed for this project. |  |  |
| KO-02 | What is the electrical single-line architecture of the offered build? | Needed to evaluate topology, shutdown, and protection. | Single-line diagram. | Provide one diagram for normal operation and one for shutdown / maintenance isolation if different. |  |  |
| KO-03 | What are the unit electrical ratings: `Pmax`, `Voc`, `Vmp`, `Isc`, `Imp`? | Hard gate for `Voc,max`, `Isc,max`, and MPPT fit. | Unit datasheet. | If there are multiple louver or module sizes, provide one row per size. |  |  |
| KO-04 | What are the temperature coefficients: `betaVoc`, `alphaIsc`, and `gammaPmax`? | Needed for low-temperature and high-irradiance envelope checks. | Datasheet or qualification report. | Do not provide only a generic cell-family value unless you explicitly state it is not product-specific. |  |  |
| KO-05 | What is the series / parallel grouping at the offered build level? | Needed to compute maximum voltage and current. | Single-line, wiring schedule, design note. | State grouping at louver, panel, string, floor, and building level if applicable. |  |  |
| KO-06 | What is the disconnect / isolation boundary? | Blocks safety-state definition and maintenance procedure. | Single-line, operating procedure, safety note. | Identify what can be isolated by floor, facade bay, maintenance zone, and fire-service command. |  |  |
| KO-07 | What connector family, cable class, and feedthrough concept are used? | Blocks reliability, fire, and maintenance assessment. | Cable schedule, connector datasheet, assembly drawing. | Name the exact connector series, cable construction, bend radius, and movement class if known. |  |  |
| KO-08 | What is the replacement boundary? | Blocks serviceability and lifecycle-cost assessment. | Maintenance manual, exploded view, replacement procedure. | State whether replacement is at electronics, louver cassette, glazing unit, mullion service bay, or another level. |  |  |
| KO-09 | What is the qualification basis for the exact offered build? | Blocks any claim of readiness or durability. | Qualification matrix, test report list. | Distinguish tests performed on the exact build from tests inherited from related products. |  |  |

## Section B - Electrical envelope and topology

| ID | Question | Why it is needed | Expected evidence | Hint on how to compile | Response status | Response / source |
| --- | --- | --- | --- | --- | --- | --- |
| EE-01 | What is the active PV area per louver / module and per floor? | Needed to reconcile kWp density claims with actual geometry. | Datasheet, GA drawing. | Distinguish gross visible area from active cell area. |  |  |
| EE-02 | What is the cell count, substring partitioning, and bypass-diode topology? | Blocks shade-loss and hot-spot assessment. | Electrical schematic, cell layout drawing. | A sketch is acceptable if no full drawing exists yet, but mark it `Concept only`. |  |  |
| EE-03 | What inverter, optimizer, or microinverter product candidates are intended? | Needed to test MPPT windows and thermal fit. | Candidate BOM, datasheets. | List exact part numbers, not only vendor names. |  |  |
| EE-04 | What is the MPPT input window and allowable start voltage for each candidate PCE? | Blocks topology compatibility check. | PCE datasheet. | Include minimum start voltage, operating MPPT range, and absolute maximum input voltage. |  |  |
| EE-05 | What is the maximum intended voltage per accessible or concealed zone in each operating state? | Needed to test safety claims. | Single-line, safety state table. | Answer separately for normal generation, inverter off, grid loss, fire response, and maintenance lockout. |  |  |
| EE-06 | What is the grounding / bonding / insulation monitoring concept? | Needed for fault handling and code path. | Safety design note, schematic. | State whether the array is floating, referenced, monitored, or uses another scheme. |  |  |
| EE-07 | What surge-protection and lightning-protection concept is assumed? | Needed because facade routing can change SPD zoning. | Protection concept note, single-line. | State Type 1 / Type 2 assumptions and where the boundaries are. |  |  |

## Section C - Safety, shutdown, and code path

| ID | Question | Why it is needed | Expected evidence | Hint on how to compile | Response status | Response / source |
| --- | --- | --- | --- | --- | --- | --- |
| SF-01 | What code / standards path is being claimed: Swiss, IEC, EN, local fire authority, or other? | Prevents generic compliance language. | Compliance note, code matrix. | Cite exact standard or authority names, not only "IEC compliant". |  |  |
| SF-02 | What happens electrically when the inverter is off, grid is lost, or fire-service shutdown is initiated? | Blocks firefighter and maintenance safety claims. | State table, shutdown procedure, single-line. | Provide the residual energized parts and expected maximum voltage in each state. |  |  |
| SF-03 | What is the time-to-safe-state after shutdown command? | Needed to evaluate intervention logic. | Test report, procedure, design target. | If measured data is not available, state whether the value is design target only. |  |  |
| SF-04 | Is arc-fault detection used, and if so on what basis? | Blocks claims that the architecture is inherently safe. | Product datasheet, listing, test basis. | Name the detection method, covered fault types, and any known false-positive constraints. |  |  |
| SF-05 | What evidence supports any claim that a segmented low-voltage bus is safe or arc-limited? | Directly addresses a major unsupported deck claim. | Calculation note, standard reference, test report. | Do not answer with a slogan such as "below 120 V is safe"; provide the actual reasoning path. |  |  |
| SF-06 | What are the defined intervention roles in each state? | Needed for commissioning and maintenance boundaries. | Procedure, O&M manual. | Distinguish installer, commissioning engineer, maintenance technician, and fire-service access. |  |  |

## Section D - Thermal and environmental qualification

| ID | Question | Why it is needed | Expected evidence | Hint on how to compile | Response status | Response / source |
| --- | --- | --- | --- | --- | --- | --- |
| TH-01 | What is the assumed or measured thermal mission profile in the facade cavity / glazing / louver stack? | Blocks thermal survivability claims. | Thermal simulation, test data, measured field data. | State ambient conditions, solar loading, ventilation assumptions, and electronics location. |  |  |
| TH-02 | What are the maximum allowed operating temperatures for the PV assembly and edge electronics? | Needed to assess derating and qualification margin. | Datasheet, qualification report. | Provide continuous operating limits and any short-duration limits separately. |  |  |
| TH-03 | What derating behavior applies to the chosen MLPE or converter candidate? | Blocks performance and architecture comparison. | PCE datasheet, thermal report. | Include both ambient-based and enclosure-temperature-based derating if both exist. |  |  |
| TH-04 | What evidence supports the claim that one architecture is thermally more robust than another? | Directly addresses optimizer-versus-microinverter overstatement. | Comparative test, vendor report, design note. | If the answer is only a general design belief, mark it `Concept only`. |  |  |
| TH-05 | What condensation, sealing, and moisture-exposure assumptions apply? | Needed for real facade reliability. | IP rating data, environmental test report, assembly drawing. | Include drain paths, seal concept, and any humidity or freeze-thaw qualification. |  |  |

## Section E - Mechanical integration, moving interfaces, and serviceability

| ID | Question | Why it is needed | Expected evidence | Hint on how to compile | Response status | Response / source |
| --- | --- | --- | --- | --- | --- | --- |
| MS-01 | What is the louver movement range, duty cycle, and actuator topology? | Needed for mismatch, cable-flex, and fail-safe analysis. | Control description, mechanical drawing. | State angle range, parking state, update cadence, and whether movement is synchronized or zoned. |  |  |
| MS-02 | How are moving conductors routed and strain-relieved? | Blocks reliability assessment. | Assembly drawing, cable routing sketch. | Include bend radius, flex zone, fixation points, and number of expected cycles if available. |  |  |
| MS-03 | What is the service access path to the PV element and electronics? | Needed to assess downtime and replacement burden. | Service drawing, maintenance note. | State whether access is from interior, exterior, scaffold, lift, or mullion service zone. |  |  |
| MS-04 | What is the expected field-replaceable unit and expected replacement time? | Needed for lifecycle and maintainability claims. | Maintenance procedure, service estimate. | Give both the physical unit replaced and the estimated crew / time requirement. |  |  |
| MS-05 | What packaging dimensions and cooling clearances are required for each MLPE candidate? | Blocks optimizer-versus-microinverter fit claims. | Product datasheet, layout sketch. | Include depth, width, height, and minimum free-air or mounting-clearance requirements. |  |  |

## Section F - Controls, diagnostics, and data visibility

| ID | Question | Why it is needed | Expected evidence | Hint on how to compile | Response status | Response / source |
| --- | --- | --- | --- | --- | --- | --- |
| CD-01 | What sensors and feedback signals are used for louver control and safety logic? | Needed for state modeling and fail-safe analysis. | I/O list, control narrative. | Include irradiance, wind, position, current, temperature, fault, and communications inputs if used. |  |  |
| CD-02 | What telemetry is available at module, louver, string, floor, and building level? | Needed to test the diagnostic value claim of DMPPT. | Interface specification, platform screenshot, protocol map. | State update rate, retained history, and whether values are read-only or alarm-capable. |  |  |
| CD-03 | What alarms / fault codes exist and how are they exposed? | Needed for maintenance and commissioning. | Alarm list, protocol map. | Identify whether alarms are local only, cloud only, BMS-visible, or all three. |  |  |
| CD-04 | What communications interfaces are actually supported? | Addresses unsupported deck claims about KNX / Modbus. | Interface datasheet, protocol list. | Name exact protocols, object list availability, and gateway requirements. |  |  |
| CD-05 | What is the defined fail-safe state for sensor loss, actuator failure, communications failure, and power loss? | Needed for comfort, electrical, and thermal consequence mapping. | Control narrative, FMEA, state table. | Answer separately for each failure class rather than one generic "safe mode". |  |  |

## Section G - Performance, PR, yield, and economics

| ID | Question | Why it is needed | Expected evidence | Hint on how to compile | Response status | Response / source |
| --- | --- | --- | --- | --- | --- | --- |
| PE-01 | How is `PR` defined for this product concept? | Blocks use of the `>74% PR` claim. | Calculation note, methodology note. | State numerator, denominator, excluded losses, and boundary of measurement. |  |  |
| PE-02 | What irradiance source, weather data set, and orientation assumptions are used for yield claims? | Needed to audit yield and ROI. | Simulation file, calculation note. | State location, dataset source, facade azimuth, and louver-state assumptions. |  |  |
| PE-03 | What loss stack is assumed: optical, thermal, mismatch, conversion, availability? | Needed to close PR and yield claims. | Calculation note, simulation output. | Provide each loss component separately rather than only final PR. |  |  |
| PE-04 | What CapEx, O&M, replacement, tariff, degradation, and discount-rate assumptions are used for LCOE / NPV claims? | Blocks any financial comparison. | Financial model, spreadsheet, memo. | Provide the full assumption table and identify which values are project-specific versus generic placeholders. |  |  |
| PE-05 | What evidence supports the claim that recovered yield outweighs hardware premium? | Directly addresses the ROI deck claim. | Comparative simulation, case study, business case. | Include the baseline architecture and the assumed failure / replacement penalty of added electronics. |  |  |

## Section H - Project-specific deployment context

| ID | Question | Why it is needed | Expected evidence | Hint on how to compile | Response status | Response / source |
| --- | --- | --- | --- | --- | --- | --- |
| PJ-01 | What is the intended project type: new build, retrofit, pilot, or research demonstrator? | Needed to interpret permitting and evidence depth. | Project brief, proposal. | If more than one applies, state which one governs the offered design basis. |  |  |
| PJ-02 | What is the intended facade geometry and segmentation for the target deployment? | Needed to connect product claims to a real case. | GA drawing, facade layout, concept sketch. | State floors, facade bays, azimuths, and the proposed electrical segmentation logic. |  |  |
| PJ-03 | What authority or stakeholder approvals are assumed before energization and handover? | Needed because several deck claims imply approval readiness. | Approval matrix, project execution note. | Distinguish authority approval, product declaration, commissioning release, and owner acceptance. |  |  |
| PJ-04 | What documents will be available at commissioning? | Needed to test whether the concept is handover-ready. | Commissioning checklist, document register. | Include single-line, cable schedule, unit ID map, alarm list, maintenance note, and commissioning records. |  |  |

## Final compiler checklist

Before considering the questionnaire complete, verify that:

- every knockout item `KO-01` to `KO-09` is answered
- every numerical answer has units
- every answer cites an evidence source
- concept claims are marked `Concept only`
- unknowns are left visible and not replaced by narrative filler
- no answer relies only on a presentation deck if a datasheet or drawing should exist

## Minimum deliverables package expected back

- product datasheet for the exact offered build
- electrical single-line
- cell / substring / bypass layout
- cable / connector / feedthrough definition
- shutdown-state definition
- thermal or derating evidence
- maintenance / replacement definition
- controls / telemetry interface specification
- PR / yield / economics assumptions sheet
- qualification-basis matrix
