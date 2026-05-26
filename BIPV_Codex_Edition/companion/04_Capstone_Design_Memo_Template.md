# Capstone Design Memo Template — iWin-Type Façade Concept v2

## 1. Scenario

- Project type:
- Climate / location:
- Façade orientation:
- Occupancy sensitivity to glare:
- Retrofit or new build:
- Why this scenario is representative:

---

## 2. Authoritative sources and versions

List only sources actually used.

| Source | Revision / date | Why authoritative here | Where used in memo |
|---|---|---|---|
|  |  |  |  |

---

## 3. What is fixed vs assumed vs still unknown

### Verified public facts
-

### Public clues
-

### Engineering assumptions
-

### Vendor data still required
-

---

## 4. Envelope / section concept

- IGU / cavity assumption:
- Slat position assumption:
- Feedthrough path assumption:
- Replaceable-unit boundary:
- Blind cassette / actuator service boundary:

```text
Exterior | glass | cavity / chamber | PV blind | glass | interior
```

### Section issues to close
- thermal path to exterior:
- thermal path to interior:
- moving-interface path:
- frame-edge electrical route:
- seal / moisture risk zone:

---

## 5. Compliance and standards matrix

| Issue | Governing reference(s) | Design implication | Evidence available? | Open action |
|---|---|---|---|---|
| BIPV module as building product |  |  |  |  |
| BIPV system in building |  |  |  |  |
| Array design / protection / disconnect |  |  |  |  |
| Module qualification / safety |  |  |  |  |
| High-temperature deployment |  |  |  |  |
| Integrated electronics |  |  |  |  |
| Connector / cable / feedthrough |  |  |  |  |
| Commissioning / maintenance |  |  |  |  |

---

## 6. Solar / optical control concept

### Objective hierarchy
- Primary:
- Secondary:
- Tertiary:

### Proposed objective function
```text
J = wE·Egen - wG·GlareRisk - wQ·SolarGainToZone - wT·max(0, Tslat - Tlim)
```

### Sensors and state inputs
- irradiance:
- glare / daylight:
- slat angle feedback:
- temperature:
- occupancy:
- schedule / override:
- fault state:

### Operating states

| Condition | Slat strategy | Primary objective | Electrical consequence | Comfort consequence | Thermal consequence |
|---|---|---|---|---|---|
|  |  |  |  |  |  |

### Fallback and fail-safe
- loss of sensor:
- loss of actuator feedback:
- loss of communications:
- loss of power:
- manual override rule:

---

## 7. Electrical concept

### Public clue / vendor unknown note
- public clue on PV technology:
- unknown rated values still needed:

### Substring / bypass concept
- slat substring count:
- bypass allocation:
- rationale:

### Façade aggregation concept
- unit grouping:
- series count:
- parallel count:
- local power electronics concept:
- PCE placement:

### Required first-pass calculations

```text
Voc,max = Nseries × Voc,unit,STC × [1 + |βVoc| × (25°C - Tcell,min)]

Isc,max = Nparallel × Isc,unit,STC × (Gmax / 1000 W/m²) × [1 + αIsc × (Tcell - 25°C)]
```

### Calculation inputs
- `Voc,unit,STC`:
- `Isc,unit,STC`:
- `βVoc`:
- `αIsc`:
- `Tcell,min`:
- `Gmax`:
- `Nseries`:
- `Nparallel`:

### Design-envelope results
- `Voc,max`:
- `Isc,max`:
- MPPT voltage window needed:
- maximum aggregation rule:
- isolation / disconnect boundary:
- reverse-current protection concept:
- connector family:
- cable class / route:
- monitoring points:

### Architecture comparison

| Option | Pros | Cons | Best-fit condition | Blocking unknowns |
|---|---|---|---|---|
| Direct stringing |  |  |  |  |
| Optimizer-based |  |  |  |  |
| Modular / AC-like partitioning |  |  |  |  |

---

## 8. Thermal risk note

### First-order balance
```text
Qsolar,absorbed = Qto,exterior + Qto,interior + Qstored
ηPV(T) decreases as T increases
```

### Dominant heat sources
-

### Dominant sinks
-

### Thermal bottlenecks
-

### Guardbands / triggers
- slat temperature limit:
- high-temperature qualification trigger:
- required measurements or model refinements:

---

## 9. Monitoring / diagnostics concept

### Maps
- unit ID map:
- string or group map:
- feedthrough map:
- access route:

### Minimum telemetry
- current:
- voltage:
- temperature:
- actuator state:
- angle feedback:
- fault/event log:
- irradiance reference:

### Diagnostics strategy
- what can be localized remotely:
- what requires site visit:
- what requires thermography:
- what requires replacement:

---

## 10. Reliability / service concept

- top interface risks:
- replacement boundary:
- expected L1/L2/L3/L4 interventions:
- required spare strategy:
- commissioning evidence needed before handover:

### FMEA summary
- top `S >= 9` risks:
- top latent faults:
- top faults likely to require `L4` or `L5` replacement:

---

## 11. Commissioning and acceptance criteria

| Test / document | Purpose | Pass criterion | Responsible party | Required before energization? |
|---|---|---|---|---|
| Single-line verified |  |  |  |  |
| Unit labeling verified |  |  |  |  |
| Polarity / continuity / connection checks |  |  |  |  |
| Isolation / electrical safety checks |  |  |  |  |
| Functional slat-angle test |  |  |  |  |
| Control fallback / fail-safe test |  |  |  |  |
| Telemetry / event logging check |  |  |  |  |
| Thermography or temperature baseline (if required) |  |  |  |  |

---

## 12. Top unknowns blocking concept freeze

1.
2.
3.
4.
5.

---

## 13. Recommendation status

- Recommended direction:
- Confidence:
- Conditions to proceed:
- Conditions that force architecture re-open:
