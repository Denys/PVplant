# Commissioning and Acceptance Template — iWin-Type BIPV v2

## Purpose

This is a **mini handover pack skeleton** for an iWin-type façade subsystem.

Use it to prevent the common failure mode where the system is mechanically installed but electrically, logically, and diagnostically under-defined.

---

## Document package

| Document | Required? | Notes |
|---|---|---|
| Approved section / assembly drawing | Yes | Must show feedthrough and replacement boundary |
| Single-line diagram | Yes | Must match installed grouping |
| Unit ID map | Yes | Visible, durable, and unambiguous |
| Cable and connector schedule | Yes | Include mating control and route |
| Control I/O list | Yes | Sensors, actuator feedback, override points |
| Assumption register | Yes | Open items still visible at handover |
| FMEA action list | Yes | Especially `S >= 9` items |
| Maintenance and replacement note | Yes | Who can replace what |
| Event / alarm list | Yes | Required for diagnostics |
| Commissioning records | Yes | Store measured values and sign-off |

---

## Pre-energization checks

| Check | Method | Pass criterion | Record value / note | Done |
|---|---|---|---|---|
| Drawing revision matches installed hardware | Visual / document review | No mismatch |  |  |
| Unit labeling complete | Visual check | Every unit identifiable |  |  |
| Connector mating verified | Visual / traceability | Correct family and complete mating |  |  |
| Polarity verified | Electrical check | Correct polarity at defined points |  |  |
| Intended isolation boundary verified | Functional check | Unit/group can be safely isolated as intended |  |  |
| Cable routing verified | Visual check | No obvious abrasion / crush / bend-radius issue |  |  |
| Sensor list verified | Functional check | All required sensors visible to controller/BMS |  |  |

---

## Energization and electrical checks

| Check | Method | Pass criterion | Record value / note | Done |
|---|---|---|---|---|
| Open-circuit voltage check | Measured vs expected | Within engineering tolerance |  |  |
| Short-circuit or equivalent current check (when appropriate and safe) | Measured vs expected | Within engineering tolerance |  |  |
| PCE input window compatibility check | Compare measured/expected to PCE limits | Compatible across intended states |  |  |
| Alarm-free initial energization | Functional check | No critical alarms |  |  |
| Telemetry availability | SCADA / logger / controller check | Required signals present |  |  |

---

## Control-function checks

| Check | Method | Pass criterion | Record value / note | Done |
|---|---|---|---|---|
| Slat-angle command response | Functional test | Commanded and actual angles agree within project tolerance |  |  |
| Occupancy or schedule override | Functional test | Override behavior matches spec |  |  |
| Glare / daylight control response | Functional test or simulation-based script | State change follows defined logic |  |  |
| Fail-safe on sensor loss | Inject fault / simulate fault | System enters defined fallback state |  |  |
| Fail-safe on communication loss | Inject fault / simulate fault | System enters defined fallback state |  |  |
| Fail-safe on power interruption / recovery | Functional test | Recovery sequence controlled and logged |  |  |

---

## Thermal and diagnostic baseline

| Check | Method | Pass criterion | Record value / note | Done |
|---|---|---|---|---|
| Baseline temperature capture | Sensors or controlled measurement | Values recorded at defined operating state |  |  |
| Hot-spot / anomaly scan if required | Thermography | No unexplained thermal anomaly |  |  |
| Event log verification | Controller / logger review | Events timestamped and intelligible |  |  |
| Fault localization drill | Simulated fault | Team can locate fault to intended boundary |  |  |

---

## Handover decision

### Ready for operational release?
- [ ] Yes
- [ ] No

### Blocking issues
1.
2.
3.

### Conditional-release notes
-

### Sign-off
- Engineering:
- Controls:
- Electrical:
- Façade / envelope:
- Owner / operator:
