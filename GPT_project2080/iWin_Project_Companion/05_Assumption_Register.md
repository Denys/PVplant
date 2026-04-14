# Assumption Register — iWin-Type BIPV

## Rule
Every unresolved but decision-relevant assumption goes here. Do not let assumptions stay hidden inside prose.

| ID | Assumption | Why needed | Evidence status | Impact if wrong | Owner / source needed | Closed? |
|---|---|---|---|---|---|---|
| A01 | PV blind sits in main IGU cavity | Section model and thermal path | Unknown | Could invalidate thermal / service concept | Vendor section drawing | No |
| A02 | Electrical feedthrough is through frame edge | Wiring and seal-risk model | Inference | Could invalidate FMEA and service route | Vendor integration drawing | No |
| A03 | Slat motion is motorized per unit, not centralized | Controls / reliability model | Unknown | Changes architecture and maintenance assumptions | Vendor controls documentation | No |
| A04 | One unit can be electrically isolated without replacing full façade string | Serviceability model | Unknown | Major commissioning and downtime impact | Vendor electrical architecture | No |
| A05 | Local temperature sensing is available or can be added | Diagnostics concept | Unknown | Changes thermal monitoring strategy | Vendor / system architect | No |

## Assumption closure note
For each closed assumption, record:
- who confirmed it
- by what document or drawing
- on what date
- whether the closure is contractual or only informational
