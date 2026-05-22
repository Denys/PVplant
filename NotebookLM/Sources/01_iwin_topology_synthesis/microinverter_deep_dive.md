# Microinverter / AC-Module Deep Dive

Date: 2026-05-21  
Scope: extracted microinverter-side evidence from the Firecrawl cache. No topology ranking.

## Executive Summary

Microinverters give the cleanest commercial path to grid-certified distributed conversion, but they move AC branch wiring, anti-islanding, gateway/grid-profile setup, thermal constraints, and replacement logistics into the facade system. The useful iWin unit is one independent MPPT input per blind module. A two-, four-, or six-input microinverter can be relevant only if each blind module keeps its own MPPT input.

APsystems EZ1 and Hoymiles/NEP lower-power families are the most relevant small-module evidence; Enphase IQ8 is the strongest certification/manual evidence; TSUN GEN3 6-in-1 is a zone-packaging pattern, not a per-blind device.

## Extracted Product Table

| Product/vendor | Min/recommended module power | MPPT / DC input | AC output | MPPT inputs | Grid/safety behavior | Cabling/monitoring | Env/dimensions | Price evidence | iWin notes |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
| Enphase IQ8/IQ8+ | 235-350 W / 235-440 W common pairings | MPPT 27-37 V / 27-45 V; operating 16-48 V / 16-58 V; max DC 50/60 V; max current 10/12 A; max module Isc 20 A | 240 Vac split-phase, 60 Hz; 240/290 VA max continuous | 1 | CA Rule 21, UL 62109-1, IEEE 1547:2018 / UL1741-SB; rapid shutdown listed when installed per instructions | IQ Cable; IQ Gateway for monitoring/grid profile; no under-load disconnect; no user service | Heatsink may reach 90 C; install under module | IQ8 USD 166.50; IQ8+ USD 189; IQ8A USD 223; IQ8H USD 242 | Strong certification/manual evidence, but likely high MPPT/power floor for small blinds. |
| APsystems EZ1-M/H | 300-730 W+ / 410-760 W+ recommended | MPPT 28-45 V; operating 26-60 V; max DC 60 V; 20 A x2 | 230 Vac, 184-253 V, 50 Hz; 600/799/960 VA depending model | 2 independent | High-frequency galvanic isolation; local plug-in/grid limits; DIY balcony/garden/garage/carport scope | Built-in Wi-Fi/Bluetooth; AP EasyPower App; 5 m cable; Schuko/Betteri variants | IP67; -40 to 65 C; 263x218x36.5/37 mm | SolarV EZ1-M 800 W EUR 111.72 incl. 0% VAT | Best two-input balcony-style evidence; facade warranty/use scope uncertain. |
| APsystems DS3 | 300-550 W+ / 400-660 W+ in APAC manual | MPPT 28-45 V; operating 26-60 V; max DC 60 V; 18/20 A x2 | 230 Vac, 730/880 VA; branch limit 7/6 units on 2.5 mm2 in manual | 2 independent | High-frequency galvanic isolation; no under-load disconnect; RMA replacement | AC bus cable; junction box; encrypted ZigBee; EMA | IP67; -40 to 65 C; 263x218x41.2/42.5 mm | Not extracted | Useful dual-input fixed module evidence, not blind-specific. |
| Hoymiles HMS-300/350/400/450/500-1T | 240-405 W+ to 400-670 W+ depending model | Max DC 60-65 V; max current about 11.5-16 A; distributor source listed 16-60 V operating and 22 V start for HMS-500 | 230 Vac; 300-500 VA family | 1 | EN 50549-1, VDE-AR-N 4105, VFR2019, rapid shutdown compliance claims on page | Sub-1G DTU or Wi-Fi integrated variants with S-Miles Cloud | IP67; -40 to 65 C; HMS-500 distributor size 182x164x30 mm | Offgridtec HMS-500 EUR 101.14 incl. VAT / EUR 84.99 0% VAT; Self2Solar HMS-500 USD 199 | Lower-power MI evidence; still conventional module envelope. |
| Hoymiles HMS-600/700/800/900/1000-2T | Not finalized from scrape | Max DC around 60 V family; formal MPPT count unresolved | 230 Vac class; 600-1000 VA family | Contradictory scrape: independent MPPT text vs table showing 1 MPPT | Grid-code claims need formal datasheet | DTU/S-Miles ecosystem | Not finalized | Not extracted | Do not use until formal datasheet confirms one MPPT per input. |
| NEP BDM-300 | Recommended max module 450 W; min not stated | MPPT 22-55 V; max DC 60 V; max input 14 A | 240 Vac / 60 Hz; 250 W continuous, 300 W peak; 208 Vac 3-phase supported | 1 | Anti-islanding; UL 1741, CSA C22.2 No.107.1, IEC/EN 62109-1/-2, IEEE 1547, VDE-AR-N 4105, AS 4777.2/.3 listed | AC trunk/daisy chain; PLC to BDG-256 gateway; no customer service | NEMA6/IP66/IP67; ambient -40 to 65 C; operating -40 to 85 C | BDM-300 direct price missing; Signature Solar BDM-600X USD 169 and gateway/cables found | Smallest conventional microinverter envelope found. |
| TSUN GEN3 6-in-1 | 400-700 W+ recommended module | Startup 22 V; MPPT 16-60 V; max DC 60 V; max input 18 A; Isc 25 A | 220/230/240 Vac, 50/60 Hz; 2400-3300 W | 6 | Anti-islanding/grid protection implied by MI class; exact certificates need extraction | Wi-Fi/Bluetooth; optional 2xRS485 | IP67; -40 to 65 C; 380x313x49 mm; 7.5-8.2 kg | Price not found | Useful zone-level package if each blind module maps to one input. |

## Microinverter Topology Variants For iWin

Variant M1: one microinverter per blind module. This is simple conceptually but likely expensive and physically/service heavy unless each blind module produces hundreds of watts in the right voltage range.

Variant M2: one multi-input microinverter serving two or more blind modules, with one independent MPPT per blind module. APsystems EZ1/DS3 and TSUN 6-in-1 are evidence anchors. This can preserve shading mitigation if MPPT independence is real.

Variant M3: zone-level AC conversion in a fixed facade service box. Moving blind PV leads remain DC over a short protected harness into a fixed multi-input microinverter. This avoids AC wiring on moving slats but keeps AC in the facade/frame zone.

Variant M4: AC-module blind product. The whole blind module ships/listed as an AC-output PV product. This may map to UL 1741 AC-module concepts and IEC 62109-3 module-integrated equipment, but it is a product-certification path, not a quick component selection.

## Hard Blockers

The first blocker is the module power floor. Enphase starts at 235 W common module pairing; APsystems EZ1/DS3 and TSUN target 300-700 W modules; Hoymiles/NEP lower-power products still expect conventional module voltages and hundreds of watts. If one iWin blind module is materially below these ranges, MI cost/W and operating time become poor.

The second blocker is AC wiring in the facade. Manuals consistently assume AC trunk/bus cable, junction boxes, grounding, no under-load disconnection, and fixed mounting. A moving blind should not carry AC through repetitive motion unless the entire mechanical/electrical safety case is intentionally designed for it.

The third blocker is grid-code dependence. MI products are country/region/grid-profile products. A plug-in balcony-style product may be legal and supportable in one jurisdiction and inappropriate in another.

The fourth blocker is service. Microinverters are sealed units with replacement/RMA procedures, not field-repair electronics. If hidden inside a facade cavity or blind cassette, replacement access becomes part of the architecture.

## Promising Patterns

APsystems EZ1 is the best evidence source for low-cost two-input AC conversion with integrated app monitoring, but its manual scope is balcony/garden/garage/carport and it is not a generic BIPV facade certification.

Hoymiles HMS-500 and NEP BDM-300 are useful low-power anchors if iWin blind modules are around 250-500 W and `Vmp` sits comfortably above 22 V.

TSUN 6-in-1 is worth tracking for zone packaging, not per-blind packaging. The important feature is six MPPTs, not six DC sockets.

## Cost Assumptions Supported By Evidence

Per AC conversion channel retail anchors from the cache are roughly USD 166-242 for Enphase IQ8 family, EUR 111.72 for a two-input APsystems EZ1-M 800 W unit in a 0% VAT listing, EUR 85-101 for Hoymiles HMS-500 depending VAT, and USD 199 for US retail HMS-500. If a two-input microinverter truly gives one independent MPPT per blind module, the raw device price can be divided across two blinds for a first-order hardware anchor, but AC cable, junctions, gateway, protection, labor, and certification are excluded.

## AC Safety And Installation Concerns

AC-module or microinverter topology brings anti-islanding, grid profile, AC branch circuit, protective earth/grounding, junction box, disconnect, and inspection requirements into the facade. That may be acceptable in a fixed headbox/service zone, but it should not be allowed to blur into "simple small electronics" just because each PV blind is small.

The evidence consistently supports fixed mounting and fixed cabling. For moving PV blinds, the more plausible MI boundary is: moving slats produce DC, short flexible DC harness enters fixed cassette/headbox, MI sits fixed and serviceable, AC exits through conventional fixed wiring.

## Missing Before Ranking

Required missing data: blind-module `Vmp` versus time and shade, blind-module `Pmp`, cold `Voc,max`, maximum current, whether one blind can meet 22-28 V MPPT start/tracking thresholds, target grid market, AC installation concept, service access, thermal headbox model, and whether plug-in versus hardwired installation is intended.
