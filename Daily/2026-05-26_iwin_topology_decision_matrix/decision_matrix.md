# iWin PV Blinds Topology Decision Matrix

Date: 2026-05-26  
Evidence base: `Daily/2026-05-21_iwin_pv_blinds_firecrawl_topology_synthesis` and `.firecrawl` cache  
Scope: conditional decision matrix after the three Firecrawl research passes. This is not a final product architecture decision.

## Executive Summary

The current evidence ranks optimizer-centered architectures ahead of microinverter and shared-MPPT architectures for iWin, but only conditionally. The ranking is not closed until iWin provides measured blind-module electrical data, moving-harness constraints, target grid/code region, and service boundary.

The strongest candidate is **A4: per-blind DC optimizer with facade-level inverter**. It preserves blind-module MPPT granularity, keeps AC conversion out of the moving blind, has real optimizer price anchors, and can place serviceable electronics in the fixed headbox/facade zone. Its blockers are commercial optimizer MPPT voltage floors, vendor cabling limits, DC array/rapid-shutdown design, and lack of vendor approval for moving BIPV blinds.

The second-best scored architecture is **A1: PV blind segments -> DC optimizers/distributed MPPT -> DC bus -> central inverter**. It is close to A4 but less controlled as written because "segments" can drift into too many distributed electronics or into high-voltage string constraints. It remains useful if each blind module or electrical segment has independent MPPT and the optimizer/string topology is deliberately designed.

**A2: microinverter -> AC branch** is mature and well documented, but its small-PV fit is weak unless each blind module is already in the conventional module envelope: roughly 22-45 V MPPT and hundreds of watts for the lower-power products found. AC branch wiring, grid-profile commissioning, and sealed inverter replacement inside a facade are the major penalties.

**A3: low-voltage DC collection -> shared MPPT/inverter** is mechanically attractive but electrically weak if a shared MPPT sees multiple differently shaded moving elements. It should not be used as the main shading-mitigation architecture unless each blind still gets independent tracking before merge. Current evidence for this path is mostly engineering inference, not vendor data.

## Conclusions And Opinion

My current engineering preference is **A4 first, A1 second**, with A2 retained as a backup only if measured iWin blind modules land in microinverter input windows and the AC equipment can sit in a fixed, accessible, code-compliant service zone. I would reject slat-level electronics and any single-MPPT zone collector for now.

The key architecture rule remains: **one controllable PV unit should mean one blind module, not one slat**. A multi-blind device is acceptable only if it has one independent MPPT per blind module.

Score direction: `5 = favorable for iWin`, `1 = unfavorable for iWin`. Scores are conditional and include epistemic status in `score_matrix.csv`.

| Rank | Architecture | Total / 60 | Current read |
| ---: | --- | ---: | --- |
| 1 | A4: per-blind DC optimizer with facade-level inverter | 45 | Best balance of blind-level MPPT, fixed service electronics, and price evidence. |
| 2 | A1: DC optimizers / distributed MPPT -> DC bus -> central inverter | 41 | Strong if MPPT granularity is controlled; more exposed to string and distributed-packaging drift. |
| 3 | A2: microinverter -> AC branch | 36 | Mature and certifiable, but power floor, AC facade wiring, and service burden are hard. |
| 4 | A3: low-voltage DC collection -> shared MPPT/inverter | 33 | Mechanically attractive; shading and vendor evidence are weak unless redesigned as independent MPPT. |

## Source Backbone

| Evidence role | URLs |
| --- | --- |
| Facade/BIPV optimizer shading evidence | [MDPI elevation-type BIPV optimizer study](https://www.mdpi.com/2075-5309/14/1/53); [MDPI facade-BIPV optimizer study](https://www.mdpi.com/2075-5309/14/12/3850) |
| Generic optimizer anchors | [Tigo TS4-A-O](https://www.tigoenergy.com/product/ts4-a-o); [Tigo TS4-A-O datasheet](https://cdn.prod.website-files.com/5fad551d7419c7a0e9e4aba4/68827724d772a21c23ceb55e_002-00216-00%201.1%20Datasheet%20TS4-A-O%20(725W)%2020250709%20-%20EN.pdf); [Tigo TS4-A manual](https://cdn.prod.website-files.com/5fad551d7419c7a0e9e4aba4/698b65573e1e53f5d116c80f_002-00129-00%202.3%20IO%26M%20TS4A%20with%20TAP%20and%20CCA%2020251001%20-%20EN.pdf); [Deye SUN-XL02 datasheet](https://www.deyeinverter.com/deyeinverter/2023/12/21/datasheet_sun-xl02-a_231221_en.pdf) |
| Optimizer ecosystem constraints | [SolarEdge S1400 datasheet](https://minisite.solaredge.com/hubfs/Power%20Optimizer%20S1400_DS-000205-PHL.pdf); [Huawei MERC specs](https://support.huawei.com/enterprise/en/doc/EDOC1100265210-998e36a3/technical-specifications); [Huawei configuration principles](https://support.huawei.com/enterprise/en/doc/EDOC1100265210-9acf6acc/configuration-principles); [Huawei cable connection manual](https://support.huawei.com/enterprise/en/doc/EDOC1100265210-288032bf/connecting-cables) |
| Microinverter anchors | [Enphase IQ8 datasheet](https://enphase.com/download/iq8-and-iq8-microinverters-data-sheet); [Enphase IQ8 manual](https://enphase.com/download/iq8-series-microinverter-installation-and-operation-manual); [APsystems EZ1 datasheet](https://global.apsystems.com/wp-content/uploads/2025/04/4306626202_APsystems-Microinverter-EZ1-M-EZ1-H-For-EMEA-Datasheet_-Rev1.1_2024-12-09-BC01.pdf); [APsystems EZ1 manual](https://global.apsystems.com/wp-content/uploads/2025/04/4306626102_APsystems-Microinverter-EZ1-M-EZ1-H-for-EMEA-User-manual_-Rev1.1_2024-12-09-BC01.pdf); [NEP BDM-300 datasheet](https://northernep.com/wp-content/uploads/2023/10/BDM-300-Datasheet-102623.pdf); [TSUN GEN3 6-in-1 datasheet](https://www.tsun-ess.com/files/datasheetgen3-microinverter-6-in-1-0701.pdf) |
| Pricing anchors | [ONSA Plus Tigo TS4-A-O](https://www.onsaplus.eu/tigo-ts4-a-o/); [Signature Solar Tigo category](https://signaturesolar.com/tigo-energy/); [7Sun optimizers](https://7sun.eu/product-category/optimizers/); [Enphase IQ8 store](https://enphase.com/store/microinverters/iq8-series); [SolarV APsystems EZ1-M](https://solarv.de/apsystems-ez1-m-800w-price); [Offgridtec Hoymiles HMS-500](https://www.offgridtec.com/en/hoymiles-hms-500-1t-microinverter-module-inverter.html) |
| Standards/regulatory framing | [IEC 62548-1](https://webstore.iec.ch/en/publication/64171); [IEC 62109-1](https://webstore.iec.ch/en/publication/6470); [IEC 62109-2](https://webstore.iec.ch/en/publication/6471); [IEC 62109-3](https://webstore.iec.ch/en/publication/27684); [IEC 62116](https://webstore.iec.ch/en/publication/6479); [UL 1741](https://www.shopulstandards.com/ProductDetail.aspx?productId=UL1741); [UL DER testing](https://www.ul.com/services/distributed-energy-resource-testing) |

## Score Matrix

Full per-score evidence, URL, confidence, and blocking missing data are in:

`Daily/2026-05-26_iwin_topology_decision_matrix/score_matrix.csv`

| Criterion | A1 DC optimizer/DC bus | A2 microinverter/AC branch | A3 LVDC shared MPPT | A4 per-blind optimizer/facade inverter |
| --- | ---: | ---: | ---: | ---: |
| Partial shading tolerance | 4 | 4 | 1 | 4 |
| Suitability for small PV elements | 3 | 2 | 4 | 3 |
| Moving-cable/interface feasibility | 3 | 2 | 4 | 4 |
| Shutdown/isolation safety | 4 | 4 | 3 | 4 |
| Thermal packaging | 3 | 2 | 4 | 4 |
| Serviceability/replacement | 3 | 3 | 4 | 4 |
| Monitoring/diagnostics | 4 | 4 | 2 | 4 |
| Installation complexity | 2 | 2 | 3 | 3 |
| Price evidence strength | 4 | 4 | 1 | 4 |
| Expected cost per controllable PV unit | 4 | 2 | 2 | 4 |
| Regulatory/grid complexity | 3 | 2 | 3 | 3 |
| Maturity/availability | 4 | 5 | 2 | 4 |

## Architecture Notes

### A1: DC optimizers / distributed MPPT -> DC bus -> central inverter

Evidence status: mixed verified-source plus standards-backed framing. BIPV/facade optimizer papers support module-level optimization under shade, and commercial optimizers provide real electrical, shutdown, monitoring, and price evidence. Tigo TS4-A-O and Deye SUN-XL02 are the most relevant generic anchors; SolarEdge and Huawei mainly show mature ecosystem behavior and string constraints.

Main blockers: unknown iWin `Vmp/Pmp`, string minimums, rapid-shutdown/gateway dependencies, high-voltage DC array design, and moving-harness compatibility. Huawei's instruction not to use an extension cable between optimizer input and PV module is a specific warning for any moving-boundary concept.

### A2: Microinverter -> AC branch

Evidence status: verified-source evidence is strong for product maturity, grid certification, monitoring, and pricing. Enphase IQ8, APsystems EZ1/DS3, Hoymiles HMS, NEP BDM-300, and TSUN 6-in-1 establish realistic input windows and installation constraints.

Main blockers: microinverter MPPT/start windows and recommended module powers are generally conventional-module scale. AC branch wiring and anti-islanding/grid-profile setup become part of the facade installation. If an MI is used, the plausible boundary is fixed headbox/facade electronics, not moving slats.

### A3: LVDC collection -> shared MPPT/inverter

Evidence status: mostly engineering inference and vendor-data-required. The topology may be mechanically clean because the moving interface can remain low-voltage DC, and shared electronics can be serviceable. It fails the shading objective if multiple moving/partly shaded blind modules are merged before MPPT.

Main blockers: no collected certified product evidence, no price evidence, no confirmed fault-detection strategy, and no proof that a shared MPPT can handle iWin's shade dynamics without losing energy.

### A4: Per-blind DC optimizer with facade-level inverter

Evidence status: optimizer product evidence plus engineering packaging inference. A4 takes the best part of A1, one independent optimizer/MPPT per blind module, and constrains the service boundary so electronics can stay fixed and accessible.

Main blockers: same optimizer electrical-envelope checks as A1, plus vendor approval for mounting/cabling in a facade headbox. It still needs DC array, rapid-shutdown, and integrated-electronics standards review.

## Top 2 Candidate Topologies

1. **A4: per-blind DC optimizer with facade-level inverter**  
   Current best candidate because it preserves blind-module MPPT, avoids AC on moving hardware, has source-backed optimizer price anchors, and allows a realistic service boundary.

2. **A1: DC optimizers/distributed MPPT -> DC bus -> central inverter**  
   Candidate if "segments" are controlled at blind-module or deliberate submodule granularity and string/rapid-shutdown constraints are acceptable. This is weaker than A4 when it allows electronics to scatter into moving or hard-to-service locations.

Conditional backup: **A2 microinverter** becomes competitive only if iWin's measured blind module is a conventional-module-like source, roughly in the 22-45 V MPPT class and hundreds-of-watts range, and AC conversion is fixed/serviceable.

## Rejected Or Weak Topologies

**Slat-level commercial electronics**: rejected. The evidence base supports module/blind-level electronics, not one optimizer or MI per slat.

**A3 as single shared MPPT for multiple blind modules**: weak/rejected for shading mitigation. It can be reconsidered only if it becomes "LVDC collection with one independent MPPT per blind module before merge."

**SolarEdge/Huawei proprietary optimizer ecosystems as standalone blind electronics**: weak as generic products. They may fit a large facade system only if string minimums, inverter compatibility, and module uniformity rules are accepted.

**Microinverter on moving hardware**: weak. MI evidence supports fixed AC wiring and sealed fixed power converters, not repeated-motion AC electronics.

## Hard-Gate Measurements Needed From iWin

| Gate | Required data | Why it decides architecture |
| --- | --- | --- |
| Blind-module electrical envelope | `Voc,cold`, `Vmp`, `Isc`, `Imp`, `Pmp` across temperature, irradiance, louver angle | Decides optimizer and MI input-window fit. |
| Shade matrix | Energy/current-voltage curves for self-shading, adjacent-object shading, and partial slat occlusion | Decides whether one blind-level MPPT is enough or substring MPPT is needed. |
| Internal PV stringing | Number of cells/substrings/slats, bypass elements, series/parallel plan | Decides voltage floor and mismatch behavior. |
| Moving harness | Length, bend radius, cycle life, connector/IP target, allowed voltage/current | Decides whether electronics can be fixed and how PV leads cross motion. |
| Thermal envelope | Headbox/facade air temperature, solar gain, airflow, mounting surface temperature | Decides optimizer/MI derating and service life. |
| Safety/code region | EU/US/other, plug-in vs hardwired, building facade class, rapid shutdown need | Decides IEC/UL/grid-code route. |
| Service model | Per-blind replaceable unit vs per-zone service box vs central inverter only | Decides acceptable device count and mounting location. |
| Cost target | EUR/blind, EUR/W, and replacement labor target | Decides whether off-the-shelf MLPE cost is tolerable. |

## Supplier/Product Shortlist

| Bucket | Products | Why shortlist |
| --- | --- | --- |
| Generic optimizer anchor | Tigo TS4-A-O | Best generic off-the-shelf optimizer evidence; 12-80 V input range; source-backed price and monitoring/RSD infrastructure. |
| Compact optimizer follow-up | Deye SUN-XL02-A/B | Compact body, 12-80 V MPPT, low price anchor; concentrator/RSD behavior needs deeper validation. |
| Ecosystem optimizer benchmark | SolarEdge S-series/S1400; Huawei MERC-1100/1300W-P | Useful for SafeDC/string rules and mature optimizer behavior; not generic standalone blind modules. |
| Custom optimizer reference | TI TIDA-010949; Analog/Maxim cell-string optimizer brief | Relevant if commercial MLPE does not fit voltage/power or if substring MPPT becomes necessary. |
| Microinverter benchmark | Enphase IQ8 family | Strong grid/certification/manual evidence and price anchor; likely high power/voltage floor. |
| Low-cost dual-input MI | APsystems EZ1 / DS3 | Two independent MPPT inputs and good price evidence for EZ1; facade warranty/use scope must be checked. |
| Lower-power MI | Hoymiles HMS-300..500-1T; NEP BDM-300 | Lower power anchors; still conventional module envelope. |
| Zone MI package | TSUN GEN3 6-in-1 | Six MPPT inputs in one unit; useful packaging analogy for fixed facade service zones. |

## Next Firecrawl Searches

1. `Deye SUN-XL02 optimizer installation manual rapid shutdown concentrator inverter compatibility`
2. `Tigo TS4-A-O BIPV facade installation manual extension cable optimizer input`
3. `certified low power microinverter 100 W 200 W MPPT 16 60 V datasheet`
4. `PV venetian blind MPPT DC DC converter paper`
5. `BIPV dynamic shading movable facade photovoltaic wiring harness standard`
6. `Hoymiles HMS 2T datasheet independent MPPT inputs formal PDF`
7. `IEC 62109-3 module integrated electronics optimizer microinverter BIPV guidance`
8. `UL BIPV AC module microinverter integrated facade certification`
