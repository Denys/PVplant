# iWin-Specific FMEA Template — v2

## Purpose

This FMEA is for a **glazing-integrated moving PV blind subsystem**.

It must cover:
- electrical faults
- control/actuation faults
- glazing/seal/interface faults
- diagnostics/service failures
- replacement and downtime consequences

---

## Scoring

Use 1–10 for:
- **S** = severity
- **O** = occurrence
- **D** = detectability

Then calculate:

```text
RPN = S × O × D
```

### Mandatory action gates
Action is mandatory when any of the following is true:
- `S >= 9`
- fault can create loss of electrical isolation
- fault can create fire / overheating / hot-spot risk
- fault is latent and not directly observable
- fault can trap the system in an unsafe or damaging mechanical state

**Do not let a moderate RPN hide a high-severity failure.**

---

## Additional fields that must be carried

In addition to standard FMEA fields, record:
- **observable or latent**
- **immediate safe state**
- **verification test**
- **replacement level**
- **downtime class**
- **building-impact class**
- **owner / due date**

---

## Seed failure mechanisms

### Electrical
- slat substring open-circuit
- bypass diode short
- bypass diode open
- partial loss of isolation at frame feedthrough
- intermittent conductor at moving interface
- connector mis-mating or disconnection
- local electronics overtemperature
- wrong polarity after replacement

### Control / actuation
- commanded angle ≠ actual angle
- actuator stall
- actuator rising current / degraded torque margin
- position feedback loss
- local controller hang / reboot loop
- false glare override
- loss of communications to a healthy unit

### Envelope / glazing / service
- seal degradation / moisture ingress
- contamination inside cavity
- glass replacement causing electrical misconnections
- inaccessible fault requiring oversized replacement boundary
- frame condensation route affecting electrical interfaces

---

## Table

| Item / function | Failure mode | Local effect | End effect on system / building | Possible cause | Observable or latent? | Immediate safe state | Current controls | Detection method | Verification test | S | O | D | RPN | Severity gate? | Replacement level | Downtime class | Building-impact class | Recommended action | Owner | Due | Service action |
|---|---|---|---|---|---|---|---|---|---|---:|---:|---:|---:|---|---|---|---|---|---|---|---|
| Slat substring conduction | Open circuit | Lost substring contribution | Yield loss, mismatch, potential false diagnosis | Interconnect fatigue, cracked cell, bond defect |  |  |  | I–V signature, current anomaly | Curve-trace or equivalent check |  |  |  |  |  | Slat / cassette / full unit |  |  |  |  |  |  |
| Bypass path | Diode short | Permanent bypass of substring | Yield loss, altered curve shape | Overstress, surge, thermal cycling |  |  |  | IV/PV anomaly, thermography | Component or substring verification |  |  |  |  |  | Slat / cassette / full unit |  |  |  |  |  |  |
| Bypass path | Diode open | No controlled bypass under shading | Local heating, reliability risk | Thermal overstress, assembly defect |  |  |  | Thermal anomaly, IV signature | Thermography + electrical test |  |  |  |  |  | Slat / cassette / full unit |  |  |  |  |  |  |
| Frame feedthrough | Partial loss of isolation | Leakage / intermittent electrical fault | Safety risk, nuisance shutdown, possible downtime | Moisture, tracking, thermal cycling, manufacturing defect |  |  |  | Insulation monitoring, fault alarm | Insulation-resistance / isolation test |  |  |  |  |  | Feedthrough / full unit |  |  |  |  |  |  |
| Motion conductor | Fatigue / intermittent open | Random loss of motion or PV continuity | Intermittent outage and hard-to-diagnose faults | Bend-radius violation, repeated motion |  |  |  | Continuity trend, actuator fault log | Motion-cycle test + continuity test |  |  |  |  |  | Harness / cassette / full unit |  |  |  |  |  |  |
| Actuation | Commanded angle ≠ actual angle | Wrong shading state | Glare event, heat-gain penalty, yield drift | Slippage, feedback fault, controller bug |  |  |  | Position mismatch alarm | Functional angle test |  |  |  |  |  | Actuator / controller / cassette |  |  |  |  |  |  |
| Actuation | Stall / degraded torque | Motion stops or slows | Persistent wrong state, accelerated wear | Friction rise, obstruction, low voltage |  |  |  | Current rise, timeout | Stall test / load test |  |  |  |  |  | Actuator / cassette |  |  |  |  |  |  |
| Sensors / controls | False glare override | Unnecessary closing or oscillation | Occupant complaint, lost generation | Sensor drift, threshold error, firmware bug |  |  |  | Event log, occupant reports, state history | Override logic test |  |  |  |  |  | Sensor / controller |  |  |  |  |  |  |
| Local electronics | Overtemperature | Parameter drift or shutdown | Repeated faults, shortened life | Confined heat, poor thermal path |  |  |  | Temperature alarm or inferred model | Heat-run / soak test |  |  |  |  |  | Electronics module / full unit |  |  |  |  |  |  |
| Seal line / cavity | Moisture ingress | Optical contamination, corrosion risk | Long-term performance and reliability loss | Seal defect, differential expansion, edge damage |  |  |  | Visual check, humidity indicator, performance drift | Inspection + humidity evidence |  |  |  |  |  | IGU / full unit |  |  |  |  |  |  |
| Service / replacement | Wrong reconnection after replacement | Miswired or unmonitored subsystem | Safety risk, false alarms, delayed faults | Poor labeling, weak procedures |  |  |  | Commissioning failure, event anomaly | Acceptance checklist |  |  |  |  |  | Local wiring / full unit |  |  |  |  |  |  |

---

## House rules for replacement level

Use one of:
- **L1** — sensor / controller / wiring accessory
- **L2** — actuator or local electronics module
- **L3** — blind cassette / moving subassembly
- **L4** — complete insulated glazing unit
- **L5** — façade section or architectural intervention

---

## Downtime class

Use one of:
- **D1** — no occupant impact / deferred repair possible
- **D2** — functional loss but building remains acceptable
- **D3** — occupant discomfort or building operation penalty
- **D4** — safety or major operational impact / immediate intervention

---

## Building-impact class

Use one of:
- **B1** — energy only
- **B2** — comfort/daylight/glare only
- **B3** — energy + comfort
- **B4** — electrical safety / fire / building-envelope integrity

---

## Minimum outputs after every FMEA session

- top 5 mandatory actions
- all `S >= 9` items
- all latent faults
- all faults requiring replacement level `L4` or `L5`
- all faults that cannot be localized by existing telemetry
