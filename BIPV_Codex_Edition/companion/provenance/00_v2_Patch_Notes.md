# iWin-Type Project Companion — v2 Patch Notes

## What changed from v1

This revision upgrades the pack from a **research/scoping companion** to a **pre-design oriented engineering pack**.

### Main upgrades
1. **Standards backbone expanded**
   - Added a dedicated standards/design-envelope file.
   - Elevated `IEC 62548-1` into the core stack alongside `IEC 63092` and `IEC 62446`.
   - Added component and integrated-electronics references: `IEC 62109-3`, `IEC 62790`, `IEC 62852`, `IEC 62930`, `IEC 61730-1/-2`, `IEC 61215-1/-2`, `IEC 61853-1/-2`, `IEC TS 63126`.

2. **Electrical design envelope added**
   - Added mandatory first-pass calculations for:
     - `Voc,max`
     - `Isc,max`
     - MPPT window check
     - substring / bypass partitioning
     - isolation and disconnect boundary
     - connector and cable class
     - replacement boundary

3. **Thermal wording corrected**
   - The pack now treats temperature as a **first-order design unknown / qualification trigger**, not as a publicly proven field failure for the exact product.

4. **FMEA upgraded**
   - Added severity gate.
   - Added safe-state logic, verification test, replacement level, downtime class, and building-impact class.
   - Added failure modes specific to moving PV blinds and glazing-integrated control systems.

5. **Control logic made quantitative**
   - Added a simple multi-objective control function.
   - Added sensor set, update cadence, fault fallback, and fail-safe slat position.

6. **Weekly roadmap hardened**
   - First-pass FMEA begins in **Week 4**, not Week 10.
   - Each week now has numeric or decision-grade outputs.

7. **Public clue corrected**
   - The current iWin product page publicly describes the integration of **thin-film photovoltaic solar cells**.
   - Exact chemistry, stack, interconnect scheme, ratings, and qualification evidence remain vendor-data required.

## Use of this v2 pack

Use this pack for:
- concept structuring
- early architecture comparison
- vendor-question preparation
- pre-design TRS framing
- capstone or internal decision memos

Do **not** use it as final compliance evidence or installation release documentation without:
- product drawings
- electrical ratings
- qualification reports
- project/site-specific code review
- vendor-approved replacement and maintenance procedures
