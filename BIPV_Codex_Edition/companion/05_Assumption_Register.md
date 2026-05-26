# Assumption Register — iWin-Type BIPV v2

## Rule

Every unresolved but decision-relevant assumption goes here.

Do **not** hide assumptions in prose.
Do **not** promote a **public clue** into a design fact without closure evidence.

---

## Evidence status vocabulary

- **Verified public fact**
- **Public clue**
- **Engineering inference**
- **Vendor-data required**
- **Closed by vendor evidence**
- **Closed by project decision**

---

## Table

| ID | Statement | Why needed | Evidence status | Evidence source / revision | Impact if wrong | Closure method | Confirmed by | Confirmation date | Contractual or informational? | Closed? |
|---|---|---|---|---|---|---|---|---|---|---|
| A01 | The blind is integrated inside an insulating double-glazed window | Defines system family and section boundary | Verified public fact | Current iWin product page | Low; concept family remains valid | Reference only |  |  | Informational | Yes |
| A02 | The product combines PV generation, solar/light control, and glare protection | Defines multi-objective control problem | Verified public fact | Current iWin product page | Medium; would change objective hierarchy | Reference only |  |  | Informational | Yes |
| A03 | Thin-film photovoltaic solar cells are used | Important technology clue for qualification path and modeling assumptions | Public clue | Current iWin product page | High; chemistry and qualification path could change | Vendor datasheet and qualification report |  |  | Contractual preferred | No |
| A04 | The PV blind sits in the main IGU cavity rather than a dedicated chamber | Changes thermal path, service concept, and moisture risk | Vendor-data required | No public drawing | High | Section drawing / assembly drawing |  |  | Contractual preferred | No |
| A05 | Electrical feedthrough exits through the frame edge | Changes FMEA and replacement concept | Engineering inference | Section not publicly disclosed | Medium to high | Integration drawing / service manual |  |  | Contractual preferred | No |
| A06 | Slat motion is motorized locally per unit, not centrally for a group | Changes controls, reliability, and replacement boundary | Vendor-data required | No public architecture disclosure | High | Controls architecture documentation |  |  | Contractual preferred | No |
| A07 | One unit can be electrically isolated without taking down a large façade section | Critical for serviceability and downtime | Vendor-data required | No public single-line | High | Single-line + replacement procedure |  |  | Contractual preferred | No |
| A08 | Temperature sensing is available locally or can be inferred with acceptable error | Needed for thermal diagnostics and control protection | Vendor-data required | No public telemetry list | Medium to high | Controls I/O list / BMS map |  |  | Informational or contractual | No |
| A09 | Approved connector family and cable class exist for the frame-exit environment | Needed for electrical design freeze | Vendor-data required | No public component list | High | BOM + qualification evidence |  |  | Contractual preferred | No |
| A10 | The “almost no maintenance” claim does not remove need for defined replacement and inspection procedures | Needed to prevent under-scoped O&M | Engineering inference | Vendor marketing claim is not service proof | High | Maintenance manual + warranty conditions |  |  | Contractual preferred | No |

---

## Closure rules

An assumption is only closed when all of the following exist:
1. source document or drawing title
2. revision / date
3. who confirmed it
4. whether it is **contractually binding** or only **informational**
5. downstream documents updated to reflect closure

---

## Closure log

| Date | Assumption ID | What changed | Evidence used | Updated documents |
|---|---|---|---|---|
|  |  |  |  |  |
