# iWin-Specific FMEA Template

## Scoring
Use 1–10 for:
- **S** severity
- **O** occurrence
- **D** detectability
- **RPN = S × O × D**

## Failure mechanisms to seed
- slat string open-circuit
- bypass diode short / open
- feedthrough insulation degradation
- intermittent conductor at moving interface
- actuator stall / misposition
- sensor drift or loss
- seal degradation / moisture ingress
- connector corrosion at frame exit
- electronics overtemperature
- glazing replacement causing electrical downtime

## Table
| Item / function | Failure mode | Local effect | System effect | Possible cause | Current controls | Detection method | S | O | D | RPN | Recommended action | Service action |
|---|---|---|---|---|---|---|---:|---:|---:|---:|---|---|
| Slat substring conduction | Open circuit | Lost substring contribution | Reduced yield / mismatch | Interconnect fatigue, cracked cell, solder bond | TBD | IV signature, string current anomaly |  |  |  |  |  |  |
| Bypass path | Diode short | Permanent bypass of substring | Yield loss, altered IV curve | Overstress, surge, thermal cycling | TBD | Curve-trace, thermal camera, power deficit |  |  |  |  |  |  |
| Bypass path | Diode open | Hot-spot risk under shading | Elevated local temperature / reliability risk | Thermal overstress, assembly defect | TBD | Thermal abnormality, IV signature |  |  |  |  |  |  |
| Frame feedthrough | Insulation degradation | Leakage / intermittent fault | Safety risk, outage | Moisture, UV/chemical aging, thermal cycling | TBD | Insulation test, fault alarm |  |  |  |  |  |  |
| Motion wiring / actuator link | Conductor fatigue | Intermittent motion or PV path fault | Random outage / nuisance alarms | Repeated slat motion, bend radius violation | TBD | Motion fault log, continuity test |  |  |  |  |  |  |
| Seal line | Seal degradation | Moisture ingress / contamination | Long-term optical/electrical failure | Process defect, differential expansion | TBD | Visual inspection, humidity indicator, performance drift |  |  |  |  |  |  |
| Temperature control | Overtemperature | Efficiency drop | Accelerated aging | Enclosed heat, dark absorptive surfaces | TBD | Temperature sensor or inferred model |  |  |  |  |  |  |

## Detection strategy note
For inaccessible façade hardware, favor faults that can be localized by:
- electrical signature
- actuator state / timeout
- thermal anomaly
- zone / façade mapping
- maintenance history correlation
