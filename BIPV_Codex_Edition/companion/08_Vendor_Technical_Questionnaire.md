# Vendor Technical Questionnaire — iWin-Type BIPV v3

## Purpose

Use this package to close the **vendor-data-required** items that block architecture down-select, TRS baselining, and compliance-ready pre-design.

This questionnaire is keyed to:
- the open assumptions in `05_Assumption_Register.md`
- the standards/design-envelope rows in `06_Standards_and_Design_Envelope.md`
- the commissioning and service logic in `07_Commissioning_and_Acceptance_Template.md`

## House rules for vendor responses

- Treat every response as **revision-controlled**.
- Do not answer a question with marketing text where a **drawing, datasheet, qualification report, or procedure** is required.
- If a question is not applicable, state **why** and identify the superseding design rule.
- If a value depends on configuration, provide the **valid range** and the parameter that drives it.
- Mark every response as either **contractual** or **informational only**.

## Priority and gating

- **A** = required before credible architecture down-select
- **B** = required before design freeze or procurement
- **Knockout = Y** means the item can block the vendor from serious consideration if unanswered or weakly evidenced

## Sections

- **Document control** — 5 items
- **Architecture and section** — 6 items
- **PV element and ratings** — 14 items
- **Controls and interfaces** — 8 items
- **Thermal and qualification** — 7 items
- **Reliability and service** — 8 items
- **Commissioning and handover** — 6 items
- **Commercial and warranty** — 4 items

## Master table

| ID | Section | Prio | KO | Question | Response format | Evidence requested | Related design rows | Related assumptions |
|---|---|---|---|---|---|---|---|---|
| DOC-01 | Document control | A | Y | Provide the current commercial product datasheet and the full document list that governs the offered revision. | PDF datasheet + document register | Datasheet, document list, revision status, issue dates | S01,S02,S16,S18 | A03 |
| DOC-02 | Document control | A | Y | State whether the offered product revision is identical to the one represented on the public product page and in the pilot-validation literature. If not, list all material differences. | Narrative + delta table | Revision-to-revision change log, superseded part list | S01,S02,S10 | A03,A04 |
| DOC-03 | Document control | B | N | Provide the applicable installation manual, electrical manual, maintenance manual, and troubleshooting guide. | PDF set | Manuals with revision/date | S18,S19 | A07,A10 |
| DOC-04 | Document control | B | N | Name the technical owner for electrical design, façade integration, controls, and warranty decisions. | Contact table | Responsible person, role, email, authority boundary | S18,S19 |  |
| DOC-05 | Document control | B | N | List all third-party components embedded in the offered configuration. | BOM summary table | Manufacturer, part number, function, revision, country of origin | S12,S13,S14,S15 | A09 |
| ARC-01 | Architecture and section | A | Y | Provide a section drawing showing outer lite, cavity/chamber, PV blind location, actuator location, feedthrough route, and replaceable boundaries. | Section drawing | Drawing PDF/DWG with dimensions, callouts, revision/date | S01,S02,S13,S19 | A04,A05,A07 |
| ARC-02 | Architecture and section | A | Y | State whether the PV blind sits in the main IGU cavity or in a dedicated chamber, and quantify cavity/chamber dimensions and gas/fill assumptions. | Structured table | Section dimensions, gas or venting description, spacer concept | S02,S11,S17 | A04 |
| ARC-03 | Architecture and section | A | Y | Define the smallest independently replaceable unit for glazing, blind cassette, actuator, local electronics, and feedthrough hardware. | Boundary table + diagram | Replacement procedure excerpt, service drawing | S19 | A07,A10 |
| ARC-04 | Architecture and section | A | Y | State whether actuation is local per window, per cassette, per mullion group, or centralized across multiple windows. | Architecture note + block diagram | Control architecture drawing, power budget | S12,S19 | A06 |
| ARC-05 | Architecture and section | B | N | List façade integration constraints that materially affect performance or qualification (orientation, mullion depth, cavity spacing, frame material, installation tolerances). | Constraint table | Installation manual extracts, tolerance table | S02,S11,S17 |  |
| ARC-06 | Architecture and section | B | N | Describe drainage, condensation, and moisture-management paths relevant to the blind, feedthrough, and frame interfaces. | Narrative + detail sketch | Detail drawing, seal concept, inspection points | S13,S19 | A05,A10 |
| ELE-01 | PV element and ratings | A | Y | Provide the electrical datasheet for one offered window unit: Pmax, Voc, Vmp, Isc, Imp, temperature coefficients, NOCT or equivalent, maximum system voltage, and polarity conventions. | Datasheet table | Datasheet or qualified test report | S03,S04,S05,S16 | A03 |
| ELE-02 | PV element and ratings | A | Y | State the actual PV technology and stack used in the offered product revision, including chemistry/family, active-area fraction, and any technology-dependent constraints. | Technology declaration | Manufacturer statement, cell/module datasheet, qualification path | S08,S09,S10 | A03 |
| ELE-03 | PV element and ratings | A | Y | Provide the internal electrical subdivision of one unit: number of slats, active slats, substrings/strings per slat or per zone, and the interconnection diagram. | Interconnect drawing + table | Schematic, harness drawing, string map | S03,S04,S16 |  |
| ELE-04 | PV element and ratings | A | Y | Provide the bypass topology and exact allocation: one diode per string, per substring, shared between strings, or another arrangement. | Topology note + schematic | Schematic, part numbers, diode ratings | S03,S04,S09 |  |
| ELE-05 | PV element and ratings | A | Y | Provide representative I–V and P–V curves for the actual product at multiple irradiance and temperature points, including at least one partial-shading or angle-dependent case. | Plots + raw numeric table | Test report, CSV, model basis | S05,S16,S17 |  |
| ELE-06 | PV element and ratings | A | Y | State the allowed series and parallel aggregation limits and the design rule used to derive them. | Aggregation rules table | Application note or electrical manual | S03,S04,S05 |  |
| ELE-07 | PV element and ratings | A | Y | State the required downstream power-conversion architecture: direct stringing, optimizer-based, modular AC, or other. Identify any architectures that are explicitly not allowed. | Architecture note | Design manual extract, supported topologies list | S05,S12 |  |
| ELE-08 | PV element and ratings | A | Y | Define the disconnect and isolation boundary for safe maintenance, fault finding, and unit replacement. | Single-line + service note | Single-line diagram, isolation procedure, lockout note | S06,S18,S19 | A07 |
| ELE-09 | PV element and ratings | A | Y | State the earthing, insulation monitoring, and ground-fault or leakage-fault handling concept expected by the vendor. | Protection concept note | Electrical manual, example single-line, monitoring requirements | S07,S12 |  |
| ELE-10 | PV element and ratings | A | Y | Provide frame-feedthrough details: electrical rating, dielectric path, creepage/clearance basis, strain relief, bend control, and environmental sealing. | Detail drawing + component table | Feedthrough drawing, qualification/test basis, part numbers | S13,S14,S15 | A05,A09 |
| ELE-11 | PV element and ratings | A | Y | Provide the approved DC connector family, mating restrictions, and prohibited connector combinations. | Connector schedule | Part numbers, ratings, installation instructions | S14 | A09 |
| ELE-12 | PV element and ratings | A | Y | Provide the approved cable class, insulation type, temperature rating, voltage rating, minimum bend radius, and route limitations near moving parts or warm frame zones. | Cable schedule | Cable datasheet, route note, installation limits | S15,S19 | A09 |
| ELE-13 | PV element and ratings | B | N | State whether reverse-current protection, string fusing, SPDs, and surge/ESD measures are required or prohibited at the unit or group level. | Protection responsibility matrix | Application note, single-line examples | S06,S07 |  |
| ELE-14 | PV element and ratings | B | N | Provide expected electrical signatures for common faults such as bypass failure, open substring, loss of isolation, or wrong polarity after replacement. | Fault-signature table | Diagnostic guide, event mapping, test data | S18,S19,S20 |  |
| CTL-01 | Controls and interfaces | A | Y | Provide the controls architecture: local controller location, communication protocol(s), power supply requirements, and BMS/SCADA integration boundary. | Block diagram + I/O summary | Controls architecture drawing, protocol spec | S12,S18,S19 | A06 |
| CTL-02 | Controls and interfaces | A | Y | Provide the point list for all measured and commanded signals: slat angle, actuator status, fault state, temperature, irradiance/light, occupancy, and communication health. | Point list table | BMS/controls I/O list, Modbus/BACnet map | S18,S19 | A08 |
| CTL-03 | Controls and interfaces | A | Y | Provide actuator electrical and mechanical data: voltage, current, inrush, torque margin, duty cycle, travel time, angle resolution, and rated lifetime cycles. | Actuator datasheet table | Actuator datasheet, qualification report | S12,S19 | A06 |
| CTL-04 | Controls and interfaces | A | Y | State the angle-feedback method and the guaranteed error between commanded angle and actual angle over life and temperature. | Accuracy specification | Control spec, test report | S18,S19 |  |
| CTL-05 | Controls and interfaces | A | Y | Define fail-safe behavior for loss of sensor, loss of communications, power interruption, controller reboot, and actuator stall. | State table | Functional safety note, controls manual | S18,S19 |  |
| CTL-06 | Controls and interfaces | B | N | Describe manual override, local recovery, and post-fault restart behavior. | Procedure note | Service manual, operator guide | S19 |  |
| CTL-07 | Controls and interfaces | B | N | Provide the alarm/event dictionary with severity classes and timestamp behavior. | Alarm list | Alarm dictionary, sample logs | S18,S19 |  |
| CTL-08 | Controls and interfaces | B | N | Provide firmware-update method, rollback method, and version traceability rules. | Software maintenance note | Firmware management procedure | S19 |  |
| THM-01 | Thermal and qualification | A | Y | Provide measured or modeled temperatures for slat/cell, cavity/chamber air, local electronics, and frame-exit zones under representative summer and winter conditions. | Plots + numeric table | Thermal report, CFD or test report, measurement basis | S11,S16,S17 | A04,A08 |
| THM-02 | Thermal and qualification | A | Y | Provide declared operating limits, derating behavior, and protective thresholds for PV, electronics, and actuators. | Limit table | Datasheet or controls protection note | S11,S12 |  |
| THM-03 | Thermal and qualification | A | Y | Provide the qualification basis for the offered build: IEC 61730, IEC 61215, IEC TS 63126 if applicable, and any technology-specific or in-house tests actually completed. | Qualification matrix | Test reports, certificates, summary matrix | S08,S09,S10,S11 | A03 |
| THM-04 | Thermal and qualification | A | Y | Provide evidence on humidity, condensation, seal durability, and moisture tolerance relevant to the blind chamber and electrical exits. | Environmental test summary | Test report, climatic test matrix, inspection criteria | S13,S19 | A04,A05 |
| THM-05 | Thermal and qualification | B | N | State whether thermography is recommended at factory acceptance, site acceptance, or in maintenance, and define the usable inspection conditions. | Inspection note | Thermography procedure or guidance | S20 |  |
| THM-06 | Thermal and qualification | B | N | Provide any known installation conditions that materially increase temperature or invalidate the standard performance basis. | Constraint note | Application note, exclusions, thermal warnings | S11,S17 |  |
| THM-07 | Thermal and qualification | B | N | Provide building-product fire or smoke related declarations that the façade team must account for, if applicable to the offered assembly. | Declaration set | Certificates, declarations, façade-system notes | S01,S02 |  |
| REL-01 | Reliability and service | A | Y | Provide actuator cycle-life evidence under the actual load/environment envelope of the offered product. | Life-test summary | Qualification report, cycle-test report | S19 |  |
| REL-02 | Reliability and service | A | Y | Provide evidence for cable/harness flex life or motion-fatigue control at all moving electrical interfaces. | Reliability summary | Motion-cycle test, bend-life data, design note | S13,S15,S19 |  |
| REL-03 | Reliability and service | A | Y | Provide feedthrough and seal-interface reliability evidence under temperature cycling, humidity, and service handling. | Reliability summary | Test report, design verification plan, warranty note | S13,S19 | A05 |
| REL-04 | Reliability and service | B | N | Provide field failure modes seen to date and the current corrective-action status for each significant mode. | Failure-mode table | NCR/CAPA summary, anonymized field data | S19 |  |
| REL-05 | Reliability and service | B | N | Provide expected replacement times and special access needs for L1/L2/L3/L4 interventions. | Service table | Service procedure, required tools, labor assumptions | S19 | A07,A10 |
| REL-06 | Reliability and service | A | Y | Provide the actual replacement procedure for a failed unit, including electrical isolation steps, recommissioning checks, and risk of misconnection. | Procedure document | Replacement work instruction, recommissioning checklist | S06,S18,S19 | A07,A10 |
| REL-07 | Reliability and service | B | N | Provide preventive-maintenance intervals, inspection points, consumables, and explicit no-maintenance claims or exclusions. | Maintenance schedule | Maintenance manual, warranty exclusions | S19 | A10 |
| REL-08 | Reliability and service | B | N | Provide the spare-parts strategy and parts availability horizon for actuators, controllers, connectors, and special glass/blind subassemblies. | Spares table | Part list, lead times, obsolescence policy | S19 |  |
| COM-01 | Commissioning and handover | A | Y | Provide the standard commissioning package: single-line, labeling scheme, point list, acceptance tests, and record sheets. | Document set | Commissioning pack, templates, FAT/SAT forms | S18 |  |
| COM-02 | Commissioning and handover | A | Y | State the required pre-energization, energization, and functional tests for first power-up and post-replacement recommissioning. | Test matrix | Commissioning procedure, replacement recommissioning steps | S18,S19 | A07 |
| COM-03 | Commissioning and handover | A | Y | Provide acceptance limits or tolerances for key values: measured Voc, current, angle accuracy, telemetry availability, and temperature baseline. | Tolerance table | Acceptance criteria document | S18,S20 | A08 |
| COM-04 | Commissioning and handover | B | N | Provide the required as-built labels and naming conventions for units, groups, feedthroughs, and control points. | Naming convention table | Labeling standard, sample drawings | S18,S19 |  |
| COM-05 | Commissioning and handover | B | N | Provide a sample event log or SCADA export showing normal operation, alarm behavior, and fault reset behavior. | Sample export | CSV/log export, screenshot, protocol map | S18,S19 |  |
| COM-06 | Commissioning and handover | B | N | State training, witnessing, or vendor attendance requirements for FAT, SAT, first energization, and warranty-preserving maintenance. | Responsibility matrix | Commercial/technical terms, commissioning scope | S18,S19 |  |
| BUS-01 | Commercial and warranty | B | N | Provide warranty terms by subsystem: glass, PV performance, blind mechanics, actuators, electronics, controls software, and connectors/feedthroughs. | Warranty matrix | Warranty document, exclusions, transfer rules | S19 | A10 |
| BUS-02 | Commercial and warranty | B | N | List warranty exclusions triggered by non-approved power electronics, control logic, mounting details, cleaning, or service practices. | Exclusion list | Warranty conditions, approved-use matrix | S05,S19 | A10 |
| BUS-03 | Commercial and warranty | B | N | Provide indicative lead times, minimum order conditions, and any long-lead custom parts relevant to pilot and scale-up deployment. | Commercial table | Offer conditions, supply-chain note | S19 |  |
| BUS-04 | Commercial and warranty | B | N | Provide reference projects or pilot installations relevant to similar façade orientation, climate, and operational profile. | Reference list | Project list, contactability limits, installed dates | S17,S19 |  |

## Review discipline

For internal review, score each returned item on:
- completeness
- evidence quality
- technical adequacy
- residual risk

Use the accompanying workbook for weighted scoring and knockout checks.