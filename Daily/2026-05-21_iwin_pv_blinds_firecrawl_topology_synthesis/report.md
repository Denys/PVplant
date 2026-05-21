# iWin PV Blinds Distributed Topology Synthesis

Date: 2026-05-21  
Evidence base: local Firecrawl scrapes in `C:\Users\Denys\Documents\Projects\PVplant\.firecrawl`  
Scope: synthesize the three Firecrawl research passes into decision-grade evidence for optimizer/DC-DC/distributed MPPT versus microinverter/AC-module topologies. This is not an architecture ranking.

## Executive Summary

The usable design granularity is blind-module level, not slat level. One blind module means the whole movable PV blind in a window opening, for example roughly 1.0x2.5 m to 1.5x3.0 m, including all PV louvers/slats that move together and share the frame/cassette/service boundary. Slat-level electronics should be treated as a rejected lower bound because packaging, wiring flex, service count, sealing, and cost would dominate any shading benefit.

The most relevant commercial products are still module-scale products. Tigo TS4-A-O, SolarEdge S-series/S1400, Huawei MERC, and Deye SUN-XL02 are optimizer/DC-DC MLPE intended for PV modules or strings, not small moving BIPV louvers. Enphase IQ8, APsystems EZ1/DS3, Hoymiles HMS, NEP BDM-300, and TSUN GEN3 are microinverters intended for conventional module voltage/current envelopes and fixed AC wiring. They are useful as electrical-envelope anchors and safety/service evidence, not direct-fit blind-slat components.

The strongest BIPV-specific optimizer evidence is from two MDPI Buildings papers on elevation/facade BIPV under shading. Both support module-level optimization as valuable under partial shading. One study used 171 W elevation-type BIPV modules with a 600 W optimizer, 60 V maximum input, and 8-60 V MPPT range; another facade-BIPV study tested no optimizer, conventional optimizer, and prototype optimizer cases under 10-75% one-module shading and reported large relative improvement at heavy shading. These papers do not settle product suitability for iWin because they do not address moving cables, certification, service replacement, cost, or blind-specific mechanical integration.

Grouping multiple blind modules into one shared MPPT channel would compromise the reason to use distributed electronics. A multi-input device can still be compatible with a modular shading strategy only if each blind module has its own independent MPPT input and the shared unit is just packaging, AC/DC conversion, communications, or gateway infrastructure. If two or more differently shaded/moving blind modules are electrically merged before MPPT, that is a functional downgrade versus both PO and MI modularity.

Commercial microinverters have clearer grid-safety certification paths than custom DC electronics, but they push AC branch wiring, junction boxes, anti-islanding, grid-profile commissioning, and service constraints into the facade/blind envelope. Commercial optimizers keep DC collection but often depend on minimum string length, a central/string inverter ecosystem, rapid-shutdown/gateway devices, and high-voltage DC array design rules. Both families have hard evidence gaps for small, movable PV blinds.

## Conclusions

1. Use blind-module level as the baseline unit for all topology calculations and source extraction. Slat-level electronics should remain excluded unless a future custom cell-string ASIC approach is deliberately explored.

2. A "zone" can be multiple blind modules only if the zone electronics provide one independent MPPT channel per blind module. A shared single MPPT for multiple blind modules should be treated as a shading-mitigation compromise.

3. The immediate decision gates are not topology preference; they are electrical envelope and installation boundary:
   - per-blind `Voc,max`, `Vmp`, `Isc,max`, `Imp`, and `Pmp` under STC and facade operating temperature;
   - expected per-blind partial-shading matrix from louver angle and self-shading;
   - moving-cable path and allowed voltage class across the moving boundary;
   - whether electronics can sit in the fixed headbox/frame rather than on moving louvers;
   - grid region and target certification path;
   - service boundary: per-blind replacement, per-zone replacement, or central service box.

4. Off-the-shelf MLPE evidence supports three non-ranked patterns for later comparison:
   - one optimizer/DC-DC channel per blind module into DC collection;
   - one microinverter MPPT input per blind module into AC collection;
   - one facade/headbox multi-input unit with independent MPPT per blind module.

5. Custom or semi-custom low-voltage DC-DC becomes relevant only if iWin blind-module voltage/power lands below commercial MLPE windows. Analog/Maxim cell-string optimization and TI TIDA-010949 show technically relevant submodule/single-panel MPPT concepts, but they are design references, not certified ready products.

## Personal Engineering Opinion

Do not spend more time on slat-level commercial electronics. The useful comparison is blind-module-level PO versus blind-module-level MI, with a third "custom distributed MPPT in fixed headbox" pattern kept open until measured blind-module electrical data exists. My bias at this stage is to separate "MPPT granularity" from "conversion packaging": first prove one independent MPPT per blind module is electrically sufficient, then decide whether the conversion endpoint should be DC bus, string inverter, or AC branch.

## Working Definitions

`Blind module` means the complete PV blind assembly in one window/opening. All PV louvers/slats inside that module can move, but the module is one serviceable architectural unit.

`Slat level` means one individual louver/slat. This report treats it as rejected for product architecture unless a future custom-integrated PV laminate/junction-box electronics program is started.

`Zone` means multiple blind modules collected into one electrical subsystem. A zone preserves modular shading only if each blind module remains on an independent MPPT channel.

`Independent MPPT input` means separate voltage/current sensing and control for one blind module before its power is merged with other blinds.

## Evidence Base

Firecrawl found decision-grade material in five groups:

| Group | High-value sources | Why it matters |
| --- | --- | --- |
| Optimizer vendors | Tigo TS4-A-O, SolarEdge residential/commercial optimizers, Huawei MERC, Deye SUN-XL02 | Establishes actual input ranges, string dependence, rapid-shutdown behavior, communication/gateway requirements, and packaging. |
| Microinverter vendors | Enphase IQ8, APsystems EZ1/DS3, Hoymiles HMS, NEP BDM-300, TSUN GEN3 | Establishes AC safety, anti-islanding/grid-code dependency, input MPPT windows, branch cabling, service boundary, and realistic device cost. |
| BIPV/facade papers | MDPI Buildings 2024 facade/elevation optimizer studies | Directly supports module-level optimization under facade/BIPV shading, but not moving-blind product readiness. |
| Standards/regulatory | IEC 62548-1, IEC 62109-1/-2/-3, IEC 62116, UL 1741, UL DER testing page | Establishes safety scope for PV arrays, power converters, module-integrated electronics, inverters, anti-islanding, AC modules, and field/grid certification. |
| Custom/reference electronics | Analog/Maxim cell-string optimizer, TI TIDA-010949 600 W GaN optimizer reference design | Useful if commercial MLPE envelopes do not match blind-module voltage/power. |

## Optimizer/DC-DC Findings

Tigo TS4-A-O is the most flexible off-the-shelf optimizer anchor because it is not locked as tightly to a proprietary inverter as SolarEdge/Huawei, and its datasheet gives a wide PV-side range: 725 W maximum output power, 16 A Imp, 22 A Isc, 12-80 V input voltage range, 1000/1500 V maximum system voltage, 99.6% maximum efficiency, IP68, and -40 to 70 C operating range. The installation evidence is just as important: TS4-A-O mounts to a module frame or rail, output leads are strung to neighboring TS4s, and CCA/TAP infrastructure is used for monitoring/rapid shutdown. The manual also says optimization-only TS4-A-O use does not require TAP/CCA, but monitoring/rapid shutdown does; this distinction needs confirmation against the exact code and inverter configuration for iWin.

SolarEdge residential optimizers show panel-level MPPT and SafeDC behavior, but SolarEdge is ecosystem-bound. The commercial S1400 datasheet is decisive: 1400 W rated input, 125 V maximum input, 12.5-105 V MPPT range, 20 A max Isc, 80 V maximum output, 1 V safety output, IP68/NEMA6P, and -40 to 85 C. Its string constraints are a hard architecture issue: minimum string length about 14-15 optimizers depending on inverter, maximum string length 30, up to 60 PV modules where S1400 connects two modules in series. That can work for large facade arrays, but it is not a per-blind standalone product.

Huawei MERC-1100/1300W-P is similarly string/inverter dependent. It has useful electrical range evidence: 125 V max input, 12.5-105 V MPPT, 20 A short-circuit current, 2-80 V output, 22 A max output, and typical 1 V safe output. The configuration manual creates a likely blocker for irregular moving facade modules: parallel strings should have the same module model, quantity, direction, and tilt, and shaded strings are recommended on separate MPPTs. Its cable manual also says not to use extension cable between optimizer input and PV module, which is hostile to a moving-blind boundary unless the optimizer is mounted very close to the PV element in a fixed frame/headbox.

Deye SUN-XL02 is compact and has a low MPPT floor for a commercial optimizer: 700 W max input, 80 V max input, 12-80 V MPPT, 15 A max input current, 17 A max output current, IP68, -40 to 85 C, MC4-compatible cabling, and 105x105x20/22 mm body. The SUN-XL02-B adds PLC communication and rapid-shutdown functionality only with optimizer concentrators. It is useful as evidence that compact module optimizers can be physically small, but it remains a high-voltage string ecosystem component, not a standalone blind controller.

Analog/Maxim and TI matter as "if commercial product fit fails" evidence. Analog/Maxim argues for cell-string-level MPPT at 6-24 cells, replacing bypass diodes and avoiding external boxes/gateways. That is conceptually attractive for a PV blind laminate, but it requires product-level integration. TI TIDA-010949 is a 600 W single-panel optimizer reference design with 15-80 V input, up to 80 V output, 18 A input/output current, 4-switch buck-boost option, PLC and wireless communications, and measured high efficiency. It is a credible design starting point for a custom optimizer but not a certified product.

## Microinverter Findings

Enphase IQ8/IQ8+ is the strongest North American microinverter evidence source. The datasheet gives common module pairings of 235-350 W and 235-440 W, MPPT ranges of 27-37 V and 27-45 V, operating ranges of 16-48 V and 16-58 V, max DC of 50/60 V, max DC input current of 10/12 A, and 240 Vac / 60 Hz output. Its installation manual establishes system constraints that matter for a facade: IQ Cable branch wiring, IQ Gateway for monitoring/grid profile, no under-load disconnect, heatsink can reach 90 C, and the unit is not user-serviceable.

APsystems EZ1 is the most relevant small/balcony-style microinverter in the cache. It has two independent MPPT input channels, 28-45 V MPPT, 26-60 V operating range, 60 V max DC, 20 A per input, 230 Vac / 50 Hz output, IP67, -40 to 65 C, built-in Wi-Fi/Bluetooth, and 263x218x36.5/37 mm body. The manual adds two critical constraints: one EZ1 normally connects two modules, and expansion can put two PV modules per channel for EZ1-M, max four modules total, with DC cable length within 3 m. It is explicitly framed for balcony/garden/garage/carport DIY and not rooftop installation systems. For iWin, it is a strong "headbox/fixed-frame dual input" evidence source, not a moving-slat component.

APsystems DS3 is a dual-module microinverter with independent MPPT channels and encrypted ZigBee. It has 28-45 V MPPT, 26-60 V operating range, 60 V max DC, 18/20 A per input depending model, 730/880 VA AC output, IP67, -40 to 65 C, and branch limits of 7/6 units on 2.5 mm2 branch in the scraped APAC manual. It is useful for multi-blind module packaging only if one independent MPPT channel maps to one blind module.

Hoymiles HMS single-input units are the most relevant lower-power microinverter evidence. HMS-300/350/400/450/500-1T variants cover nominal AC outputs from 300 to 500 VA, with recommended module power ranges starting at 240 W for HMS-300 and 400 W for HMS-500. They support max DC around 60-65 V and max current around 11.5-16 A depending model. Distributor pricing found HMS-500 around EUR 101.14 incl. 19% VAT / EUR 84.99 with 0% VAT in EU and USD 199 in US retail. The 2T evidence is contradictory in the scraped page: it claims independent MPPT/monitoring but the table line showed one MPPT, so the formal datasheet is required before relying on dual-channel independence.

NEP BDM-300 is relevant because its power level is smaller than many mainstream micros: recommended max module 450 W, 22-55 V MPPT, 60 V max DC, 14 A max input, 250 W continuous AC, 300 W peak, 240 Vac / 60 Hz, PLC gateway, and NEMA 6/IP66/IP67. It still requires AC trunk/daisy-chain wiring and a gateway for communication.

TSUN GEN3 6-in-1 is relevant as a zone-level packaging example: 6 DC inputs and 6 MPPTs, 16-60 V MPPT, 60 V max DC, 18 A input current, 25 A short-circuit current, 2400-3300 W AC output, Wi-Fi/Bluetooth, optional RS485, IP67, and 380x313x49 mm. It is too large for one blind module, but it is a useful pattern for one fixed facade box serving up to six blind modules if each blind gets its own MPPT.

## Price Anchors

These are not BOM estimates. They are retail/distributor anchors observed in Firecrawl scrapes on 2026-05-21 and should be treated as volatile.

| Device/source | Price evidence | Approximate interpretation |
| --- | --- | --- |
| Tigo TS4-A-O, ONSA Plus | EUR 32 excl. VAT / EUR 39.36 incl. VAT | Low-cost optimizer per blind-module candidate if electrical and code constraints fit. |
| Tigo TS4-A-O, Signature Solar | USD 55.84 to USD 57.95 | US retail anchor for optimizer-only BOM. |
| Tigo CCA/TAP, Signature Solar | CCA USD 165.13 or USD 151.00 sale; TAP USD 67.77; kit USD 367.03 | Gateway costs matter when monitoring/rapid shutdown is needed. |
| 7Sun optimizer category | Deye SUN-XL02-A EUR 28.20 net / EUR 34.69 gross; Deye concentrator EUR 105.53 net / EUR 129.80 gross; Huawei MERC-1100 EUR 64.95 net / EUR 79.89 gross; Huawei MERC-1300 EUR 77.10 net / EUR 94.83 gross; SolarEdge S440 EUR 39.06-40.34 net; S500 EUR 43.25 net; S650A EUR 49.15 net | Useful European distributor anchors, but many SKUs show 0 stock. |
| Enphase IQ8 store | IQ8 USD 166.50; IQ8+ USD 189.00; IQ8A USD 223; IQ8H USD 242 | Per-input/per-module AC conversion cost is materially higher than optimizer cost before AC branch accessories. |
| APsystems EZ1-M, SolarV | EUR 111.72 incl. 0% VAT for 800 W version | Low-cost two-input microinverter anchor; country/VAT/channel-specific. |
| Hoymiles HMS-500, Offgridtec/Self2Solar | EUR 101.14 incl. 19% VAT / EUR 84.99 0% VAT; USD 199 US retail | Relevant for lower-power per-blind AC conversion if voltage/power fit. |
| NEP, Signature Solar category | BDM-600X USD 169; gateways/cables USD 27 to USD 400 range | BDM-300 direct price was not found; accessory costs are nontrivial. |

## Hard Blockers

Commercial optimizer blockers:

- String minimums and ecosystem lock: SolarEdge and Huawei are not generic per-blind DC/DC modules; they assume compatible inverters, string lengths, and configuration rules.
- MPPT voltage floor: many optimizers start around 12-12.5 V or higher; commercial microinverters often need 16-28 V to operate/track. Actual iWin blind-module `Vmp` decides whether they fit.
- Moving boundary: optimizer input-lead restrictions, MC4 connectors, and standard PV cable assumptions may conflict with movable blind mechanics.
- Rapid shutdown/monitoring infrastructure: CCA/TAP, RSS transmitter, concentrator, gateway, PLC, or vendor cloud may be required depending code path and monitoring needs.
- High-voltage DC array design: once blind modules are strung, IEC 62548-1 array design, DC cable, switching, earthing, protection, and isolation rules become central.

Commercial microinverter blockers:

- AC on facade/moving assembly: AC trunk, branch circuit, junction box, grounding/protective earth, anti-islanding, and inspection requirements move close to the blind system.
- Minimum practical PV module size: Enphase, APsystems, Hoymiles, NEP, and TSUN are designed around hundreds of watts and conventional module voltage ranges.
- Installation manuals assume fixed modules, fixed trunk cable, under-module mounting, and no under-load disconnect.
- Service boundary: microinverters are usually replaced as sealed units; putting many in inaccessible facade/blind locations can create maintenance penalties.
- Regional grid code: UL 1741/IEEE 1547/Rule 21 or EN/VDE grid certifications must match the target market and installed topology.

## Promising Patterns To Carry Forward

Pattern A: one optimizer or DC-DC MPPT channel per blind module into DC collection. This preserves blind-level shading independence and keeps AC conversion central, but it inherits DC string, shutdown, and inverter compatibility constraints.

Pattern B: one microinverter MPPT input per blind module. This simplifies MPPT isolation and grid-certified conversion if the module power/voltage match, but it creates AC branch and service challenges in the facade.

Pattern C: multi-input fixed headbox/facade electronics with one independent MPPT per blind module. Evidence analogs are APsystems EZ1/DS3, Hoymiles 2T if confirmed, and TSUN 6-in-1. The electronics should stay in the fixed frame/headbox, while the moving slats feed a short protected DC harness.

Pattern D: custom low-voltage distributed MPPT. Evidence analogs are Analog/Maxim cell-string optimizers and TI TIDA-010949. This is only justified if commercial MLPE voltage/power/mechanical constraints miss the iWin envelope.

## Missing Information Before Ranking

The topology ranking should wait until these fields exist:

| Field | Why it gates the choice |
| --- | --- |
| Per-blind `Voc,max` at cold temperature | Determines microinverter/optimizer max input voltage margin and cable insulation class. |
| Per-blind `Vmp` range over irradiance, temperature, louver angle | Determines whether commercial MPPT windows are usable. |
| Per-blind `Isc,max`, `Imp`, and current under partial shade | Determines connector, cable, optimizer, and inverter current compatibility. |
| Per-blind `Pmp` and annual energy distribution | Determines cost/W and whether microinverter minimum power ranges are realistic. |
| Segment/slat electrical interconnect plan inside one blind module | Determines whether bypass diodes, substring MPPT, or single blind-level MPPT is enough. |
| Moving harness length, bend radius, cycle life, ingress protection | Decides whether electronics can be on the moving or fixed side. |
| Target market and grid code | Decides UL/IEC/VDE/EN/IEEE certification path and whether plug-in/balcony rules apply. |
| Fire/rapid shutdown strategy | Decides PVRSS, SafeDC, 1 V shutdown, AC disconnect, and inspection requirements. |
| Service boundary | Decides per-blind, per-zone, or central-replaceable electronics. |
| Thermal envelope in headbox/facade | Decides derating, service life, and inverter/optimizer placement. |

## Search Gaps And Next Queries

1. BIPV blind / dynamic shading electrical prototypes: `dynamic BIPV shading module MPPT power electronics`, `PV venetian blind electrical topology`, `adaptive solar facade PV DC DC converter`.
2. Formal Hoymiles dual-input datasheets: `Hoymiles HMS-600 700 800 900 1000 2T datasheet number of MPPT`.
3. Certified low-power grid-tie microinverters below 300 W: `250 W microinverter datasheet MPPT 16 60 V`, `small PV module microinverter 100 W grid tie certified`.
4. BIPV module-integrated electronics standards: `IEC 62109-3 module integrated electronics optimizer microinverter`, `UL BIPV system testing certification module integrated electronics`.
5. Moving cable and facade service constraints: `PV facade movable shading cable harness standard`, `dynamic facade photovoltaic wiring durability`, `BIPV shading louver electrical connector`.
6. Distributor pricing for SolarEdge/Huawei/Deye/Tigo with stock status in EU and US, separated by optimizer, gateway/concentrator, and required inverter ecosystem.
