# Source Discovery Notes

Date: 2026-05-21  
Scope: useful source buckets after three Firecrawl research passes.

## Required Sources

Tigo TS4-A-O datasheet and installation manual are required because they define the closest generic optimizer evidence set: 12-80 V input range, 725 W rating, 22 A Isc, IP68, TAP/CCA/RSS communication and rapid-shutdown behavior, and installation assumptions.

SolarEdge S1400 datasheet is required not because it is likely to fit iWin directly, but because it documents proprietary optimizer string constraints and 1 V SafeDC behavior. It is a strong cautionary source against assuming every optimizer is a generic independent DC/DC channel.

Huawei MERC technical, configuration, and cable manuals are required because they give a complete example of module optimizer electrical specs plus system rules. The "no extension cable between optimizer input and PV module" rule is especially relevant to moving-blind mechanical boundaries.

APsystems EZ1 datasheet and user manual are required because the final manual scrape is now present and it covers the two-input balcony-style topology, app/gateway behavior, DC cable length, expansion limits, plug-in/grid limits, and intended installation scope.

Enphase IQ8 datasheet and manual are required because they provide strong official North American certification and installation evidence: UL/IEEE/Rule 21, rapid shutdown listing, IQ Cable, IQ Gateway, grid profiles, no under-load disconnection, and thermal/service constraints.

Hoymiles HMS-300..500-1T and NEP BDM-300 official docs are required because they are lower-power microinverter anchors closer to possible blind-module power than mainstream residential micros.

IEC 62548-1, IEC 62109-1/-2/-3, IEC 62116, and UL 1741 are required as standards boundary sources. IEC 62109-3 is especially important if electronics become mechanically/electrically integrated into the blind module.

MDPI Buildings 2024 BIPV/facade optimizer papers are required as BIPV-specific shading evidence. They support module-level power optimization under facade/elevation shading, but they do not resolve product certification or moving-blind mechanics.

## Useful Sources

Deye SUN-XL02 datasheet and product page are useful because they provide a compact optimizer example with 12-80 V MPPT, 80 V max input, IP68, and concentrator-dependent shutdown for the B variant.

TSUN GEN3 6-in-1 is useful as a zone-level microinverter packaging example with six independent MPPTs. It is too large for a blind module, but the architecture pattern is relevant.

Analog/Maxim solar cell optimizer and TI TIDA-010949 are useful for the custom electronics branch. They are not product candidates, but they show technical patterns if blind-module voltage/power is below commercial MLPE windows.

Distributor pages from ONSA Plus, Signature Solar, 7Sun, Offgridtec, SolarV, and Self2Solar are useful for price anchors. Treat them as volatile observations, not stable BOM data.

IEA PVPS Task 15 BIPV design/modelling report is useful for modelling context, BIPV granularity, vertical/external BIPV limitations, and next-paper discovery.

## Skip Or Background Only

Ampt string optimizers should be skipped for iWin architecture selection because the products are source-circuit/string-level kW to tens-of-kW optimizers for large PV plants. Keep as background for DC/DC collection concepts only.

Generic solar marketing blogs should remain skipped unless they contain unique current pricing, installation photos, or product manual links not found elsewhere.

Residential rooftop-only optimizer/microinverter articles should be skipped unless they expose a datasheet, certification listing, price, or string rule that transfers to small BIPV modules.

## High-Value Next Queries

`dynamic BIPV shading module MPPT power electronics`

`PV venetian blind electrical topology microinverter optimizer`

`adaptive solar facade photovoltaic DC DC converter MPPT`

`Hoymiles HMS-600 HMS-800 2T datasheet independent MPPT`

`certified 250 W microinverter MPPT 16 60 V`

`IEC 62109-3 module integrated equipment power optimizer microinverter`

`UL 1741 AC module photovoltaic blind BIPV`

`movable photovoltaic facade wiring harness durability`

`BIPV louver photovoltaic connector cable cycle life`
