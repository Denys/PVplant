# Standards and Design Envelope — iWin-Type BIPV v2

## Purpose

This file is the bridge between:
- concept study
- standards framing
- first-pass engineering calculations
- commissioning and maintenance planning

**Rule:** no preferred architecture, no TRS baseline, and no vendor comparison without this table being populated.

---

## Publicly checked standards stack for this pack revision

These are the publication identities used for this pack revision:

| Topic | Reference used in this pack | Why it matters |
|---|---|---|
| BIPV module requirements | `IEC 63092-1:2020` | BIPV modules used as building products |
| BIPV system requirements | `IEC 63092-2:2020` | BIPV systems integrated into buildings |
| PV array design | `IEC 62548-1:2023 + A1:2025` | DC array wiring, protection, switching, earthing, design safety |
| Commissioning / inspection | `IEC 62446-1:2016 + A1:2018` | Documentation, commissioning tests, inspection |
| Maintenance | `IEC 62446-2:2020` | Preventive and corrective maintenance |
| Thermographic inspection | `IEC TS 62446-3:2017` | Outdoor thermography of PV modules/plants |
| Electronics combined with PV elements | `IEC 62109-3:2020` | PV-adjacent integrated electronics safety |
| Junction boxes / PV interface boxes | `IEC 62790:2020` | Junction/feedthrough safety requirements and tests |
| PV DC connectors | `IEC 62852:2014 + A1:2020` | Connector suitability and limits |
| PV DC cables | `IEC 62930:2017` | Cable suitability at the DC side |
| Module construction safety | `IEC 61730-1:2023` | Module construction requirements |
| Module safety testing | `IEC 61730-2:2023` | Module safety testing requirements |
| Module design qualification | `IEC 61215-1:2021`, `IEC 61215-2:2021` | Baseline module qualification |
| Performance characterization | `IEC 61853-1:2011`, `IEC 61853-2:2016` | Performance vs irradiance/temperature and incidence-angle effects |
| High-temperature deployment | `IEC TS 63126:2025` | Additional testing when deployment exceeds base temperature envelope |
| Implementation guidance | `IEA PVPS Task 15 BIPV Guidebook (2025)` | Practical BIPV implementation and examples |

**Project rule:** before design freeze, verify whether project QA, certifier, or local authority requires newer editions or regional adoptions.

---

## Design-envelope matrix

Populate this table for the chosen architecture.

| Function / issue | Governing reference(s) | Required input data | Check / calculation | Acceptance criterion | Current evidence | Owner | Status |
|---|---|---|---|---|---|---|---|
| BIPV module as building product | IEC 63092-1 | Module construction, mounting intent, building role | Confirm module-level obligations | Module role is correctly classified |  |  | Open |
| BIPV system in building | IEC 63092-2 | System layout, mounting, façade integration | Confirm system-level obligations | System role is correctly classified |  |  | Open |
| Array voltage envelope | IEC 62548-1 | `Voc,unit,STC`, `βVoc`, `Nseries`, `Tcell,min` | `Voc,max` | Within PCE and component ratings |  |  | Open |
| Array current envelope | IEC 62548-1 | `Isc,unit,STC`, `αIsc`, `Nparallel`, `Gmax` | `Isc,max` | Within cable, connector, and protective-device limits |  |  | Open |
| MPPT compatibility | IEC 62548-1 | PCE input window, operating voltage range | Voltage window check | Operates within MPPT range across states |  |  | Open |
| Disconnect / isolation boundary | IEC 62548-1 | Single-line, access concept | Boundary and safe-state definition | Unit/group can be isolated as intended |  |  | Open |
| Earthing / insulation monitoring | IEC 62548-1 | Earthing concept, insulation strategy | Safety concept review | Safety strategy explicitly defined |  |  | Open |
| Module construction safety | IEC 61730-1 | Module construction data | Construction review | Safety basis identified |  |  | Open |
| Module safety testing | IEC 61730-2 | Qualification evidence | Test-basis review | Relevant test basis identified |  |  | Open |
| Module design qualification | IEC 61215-1/-2 | Qualification reports, technology basis | Qualification-basis review | Relevant qualification path identified |  |  | Open |
| High-temperature deployment trigger | IEC 61730-1, IEC TS 63126 | T98th or equivalent operating-temperature evidence | Trigger review | High-temp path invoked if needed |  |  | Open |
| Integrated electronics near PV | IEC 62109-3 | Electronics location, assembly concept | Integration safety review | Product boundary and safety basis defined |  |  | Open |
| Junction / feedthrough interface | IEC 62790 | Feedthrough/junction design | Component suitability review | Interface component path defined |  |  | Open |
| Connector suitability | IEC 62852 | Connector family, voltage/current rating | Rating and mating control review | Connector class and mating rule defined |  |  | Open |
| Cable suitability | IEC 62930 | Cable type, route, temperature environment | Cable class review | Cable choice compatible with DC side and route |  |  | Open |
| Performance parameter basis | IEC 61853-1 | Irradiance/temperature response data | Performance parameter review | Model basis identified |  |  | Open |
| Incidence-angle / operating-temp basis | IEC 61853-2 | Angle-of-incidence and operating-temperature characterization | Modeling review | Vertical/slat energy model has basis |  |  | Open |
| Commissioning docs and tests | IEC 62446-1 | Handover doc set, test plan | Commissioning checklist review | Handover package defined |  |  | Open |
| Maintenance logic | IEC 62446-2 | O&M scope, access route | Maintenance review | Preventive/corrective logic defined |  |  | Open |
| Thermal inspection | IEC TS 62446-3 | IR inspection need, access, conditions | Inspection strategy review | Thermography decision documented |  |  | Open |

---

## Minimum calculation set

Do these calculations before any architecture scoring.

### 1. Maximum open-circuit voltage
```text
Voc,max = Nseries × Voc,unit,STC × [1 + |βVoc| × (25°C - Tcell,min)]
```

### 2. Maximum short-circuit current
```text
Isc,max = Nparallel × Isc,unit,STC × (Gmax / 1000 W/m²) × [1 + αIsc × (Tcell - 25°C)]
```

### 3. Minimum architecture fields
- unit rated power
- unit `Voc`, `Vmp`, `Isc`, `Imp`
- temperature coefficients
- series/parallel grouping
- bypass partitioning
- inverter/PCE window
- disconnect concept
- protection concept
- connector family
- cable class
- replacement boundary

---

## Thermal qualification trigger

Public IEC framing to remember:
- `IEC 61730-1:2023` applies to terrestrial PV modules suitable for long-term operation in open-air climates with **98th percentile module operating temperatures of 70°C or less**.
- `IEC TS 63126:2025` adds testing guidance for deployments beyond that base envelope.

Use this logic:
1. determine whether the chosen deployment is still credibly within the base operating-temperature envelope assumed by module qualification;
2. if not, open a formal **high-temperature qualification** review;
3. do not hide the issue by calling it “special operation” or “building integration effect.”

---

## Minimum evidence package before architecture down-select

### Required
- section drawing
- source-tagged assumptions
- single-line concept
- `Voc,max` and `Isc,max`
- control objective and fail-safe
- first-pass thermal note
- FMEA top actions
- commissioning evidence list

### Recommended
- thermography plan
- replacement boundary sketch
- event/alarm dictionary
- vendor data-request sheet

---

## Notes

- `IEC 62446` is a **handover / maintenance** family, not a substitute for array design.
- `IEC 62548` is the electrical-design backbone that keeps the architecture comparison honest.
- For thin-film implementations, the qualification path must be tied to the **actual chemistry and construction**, not to a generic “thin-film” label.
