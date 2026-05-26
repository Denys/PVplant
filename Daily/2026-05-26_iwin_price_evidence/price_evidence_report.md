# iWin PV Blinds Price Evidence Focus

Date accessed: 2026-05-26  
Evidence method: Firecrawl search first, then targeted scrapes of high-value price/accessory pages.  
Exchange-rate normalization: ECB daily reference rates for 2026-05-26: `1 EUR = 1.1634 USD`, `1 EUR = 1.6069 CAD`. URL: https://www.ecb.europa.eu/stats/eurofxref/eurofxref-daily.xml

## Executive Summary

Optimizer/DC-DC MLPE has the stronger raw per-blind price evidence. Current scraped anchors put generic or near-generic optimizers roughly in the **28-65 EUR net** class in EU distributor data, with Tigo retail anchors around **40-50 EUR normalized** from US listings. Required monitoring/rapid-shutdown hardware is shared and material: Tigo CCA/TAP kit anchors were **287-315 EUR normalized**, Deye concentrator was **105.53 EUR net**, and rapid-shutdown transmitters ranged from **38.66 EUR net** to **144.74 EUR normalized** depending source/SKU.

Microinverter unit prices are broader. Low-cost balcony/small-module anchors are competitive only when one device serves multiple independent MPPT inputs: APsystems EZ1-M was **111.72 EUR** for a two-input unit, or **55.86 EUR per input** if one blind maps to one independent input. Single-input MI anchors were higher: Hoymiles HMS-500 at **84.99-101.14 EUR**, Enphase IQ8 at **143.12 EUR normalized**, and NEP BDM-300 at **156.20 EUR normalized** with CAD currency inferred.

The microinverter cost driver is not only the inverter. AC trunk/drop cables, end caps, gateways, junction/combiner hardware, and local grid-interface accessories can dominate small arrays. Enphase is the clearest example: official IQ cable drops were **15.47-18.05 EUR normalized**, gateway PCB proxies were **360.58-412.58 EUR**, and a distributor IQ Gateway was **598.25 EUR normalized**.

## Conclusions And Opinion

For iWin cost modeling, use **per blind module**, not slat, as the controllable PV unit. Optimizer hardware should be modeled as:

`optimizer_per_blind + shared_gateway_or_RSD / N + DC cabling/protection + central inverter share`

Microinverter hardware should be modeled as:

`MI_channel_per_blind + AC_drop/connectors/end_caps + shared_gateway/combiner / N + AC branch protection/labor`

My current cost opinion is unchanged from the topology matrix: **optimizer-based A4/A1 has the better early cost shape** unless measured blind modules strongly favor a two-input or multi-input microinverter with one independent MPPT per blind and a clean fixed-headbox AC installation.

## Raw Price Table

Full raw table: `raw_price_table.csv`.

| Item | Category | Raw price | Source |
| --- | --- | ---: | --- |
| Tigo TS4-A-O | Optimizer | EUR 32.00 excl VAT / EUR 39.36 incl VAT | https://www.onsaplus.eu/tigo-ts4-a-o/ |
| Tigo TS4-A-O | Optimizer | USD 47.00 to USD 57.95 across US listings | https://www.currentconnected.com/product/tigo-ts4-a-o-optimizer-rapid-shutdown-module/ ; https://signaturesolar.com/tigo-energy/ |
| Deye SUN-XL02-A | Optimizer | EUR 28.20 net / EUR 34.69 gross | https://7sun.eu/product-category/optimizers/ |
| Deye SUN-XL02-B | Optimizer | EUR 34.14 net / EUR 41.99 gross | https://7sun.eu/product-category/optimizers/ |
| Huawei MERC-1100/1300 | Optimizer | EUR 64.95-77.10 net | https://7sun.eu/product-category/optimizers/ |
| SolarEdge S-series | Optimizer | EUR 39.06 net for S440; gross range EUR 43.41-60.45 across listed SKUs | https://7sun.eu/product-category/optimizers/ |
| Deye SUN-XL20-B concentrator | Gateway/RSD | EUR 105.53 net / EUR 129.80 gross | https://7sun.eu/product-category/optimizers/ |
| Tigo CCA/TAP kit | Gateway/enclosure | USD 334.09 to USD 367.03 | https://www.currentconnected.com/product/tigo-ts4-a-o-optimizer-rapid-shutdown-module/ ; https://signaturesolar.com/tigo-energy/ |
| APsystems EZ1-M 800W | 2-input microinverter | EUR 111.72 incl 0% VAT | https://solarv.de/apsystems-ez1-m-800w-price |
| Hoymiles HMS-500-1T | Single-input microinverter | EUR 84.99 0% VAT / EUR 101.14 incl 19% VAT | https://www.offgridtec.com/en/hoymiles-hms-500-1t-microinverter-module-inverter.html |
| Enphase IQ8/IQ8+ | Microinverter | USD 166.50 / USD 189.00 official store | https://enphase.com/store/microinverters/iq8-series |
| NEP BDM-300-D | Small microinverter | CAD 250.99 inferred | https://unpluggedpowersystems.ca/product/inverters/inv-grid-tied/inv-grid-tied-nep/nep-bdm-d-300-microinverter/ |
| APsystems ECU-R | Gateway | USD 269.98 | https://shopsolarkits.com/collections/ap-systems |
| Hoymiles DTU-Pro-S WiFi | Gateway | EUR 128.33 0% VAT / EUR 152.71 incl 19% VAT; US listing USD 236.00 | https://www.offgridtec.com/en/brands/hoymiles/accessories.html ; https://www.solar-electric.com/hoymiles-dtu-pro-s-wifi-communication-gateway.html |
| NEP BDG-256 gateway | Gateway | USD 279.00; related kits USD 176-400 | https://iqelectro.com/products/bdg-256-nep-gateway-for-bdm-300-microinverter ; https://signaturesolar.com/shop-all/grid-tie/micro-inverters/nep/ |
| Enphase IQ cable drop | AC cabling | USD 18.00-21.00 official store | https://enphase.com/store/accessories |
| Hoymiles HMS 5 m connection cable | AC cabling | EUR 9.84 0% VAT / EUR 11.71 incl 19% VAT | https://www.offgridtec.com/en/brands/hoymiles/accessories.html |
| APsystems trunk cable 2 m / 4 m | AC cabling | USD 29.99 / USD 39.98 | https://shopsolarkits.com/collections/ap-systems |
| NEP home-run cable | AC cabling | USD 27.00 | https://signaturesolar.com/shop-all/grid-tie/micro-inverters/nep/ |

## Normalized Cost Table

Full normalized table: `normalized_cost_table.csv`.

| Cost item | Normalized EUR | Interpretation |
| --- | ---: | --- |
| Deye SUN-XL02-A | 28.20 net | Lowest optimizer anchor, but no communication/RSD path from A variant. |
| Tigo TS4-A-O | 32.00 net EU; 40.40-49.81 US normalized | Practical generic optimizer anchor per blind module. |
| SolarEdge S440 | 39.06 net | Useful optimizer benchmark only inside SolarEdge ecosystem. |
| Huawei MERC-1100 | 64.95 net | Higher optimizer anchor; Huawei ecosystem constraints. |
| Deye concentrator | 105.53 net shared | Add `105.53 / N` EUR per blind before cabling/labor. |
| Tigo CCA/TAP kit | 287.17-315.48 shared | Add roughly `287-315 / N` EUR per blind for shared monitoring/RSD kit. |
| APsystems EZ1-M | 111.72 per unit; 55.86 per independent input | Strong MI cost anchor if two independent MPPT inputs map to two blinds. |
| Hoymiles HMS-500 | 84.99-101.14 | Single-input MI per blind before cable/DTU. |
| Enphase IQ8 | 143.12 | Official-store single-input MI anchor before IQ cable/gateway/branch hardware. |
| NEP BDM-300-D | 156.20 | Small MI anchor; CAD inferred. |
| APsystems ECU-R | 232.06 shared | Shared gateway cost for APsystems systems without integrated Wi-Fi. |
| Hoymiles DTU-Pro-S | 128.33-152.71 EU; 202.85 US normalized | Shared gateway cost; region/SKU dependent. |
| NEP BDG-256 gateway | 239.81; kit range 151.28-343.82 | Shared monitoring/configuration cost. |
| Enphase IQ Gateway / Combiner anchors | 598.25 gateway; 1762.08 combiner | Large fixed cost; only acceptable when shared across many blinds. |
| MI AC drops/connectors | 3-35 EUR typical for small connectors/cables; Enphase Q-CONN kit 110.88 | Repeated layout-driven cost driver. |

## Optimizer Vs Microinverter Cost Drivers

Optimizer cost drivers:

- Per-blind optimizer price is the main repeated item: current evidence supports roughly **28-65 EUR net** for EU optimizer SKUs and **40-50 EUR normalized** for Tigo US retail anchors.
- Gateway/RSD is shared, not per blind, but not optional if monitoring, rapid shutdown, or vendor commissioning requires it.
- Ecosystem lock can dominate apparent cheap hardware. SolarEdge/Huawei optimizer prices do not mean generic DC/DC modules; their inverter/string rules are part of system cost.
- DC cabling/protection and central inverter share are missing from this price pass and must be added before installed EUR/blind.

Microinverter cost drivers:

- One-input MI hardware is usually higher than optimizer hardware: **85-156 EUR** for lower-cost Hoymiles/NEP anchors and **143-208 EUR** for Enphase IQ8 family anchors.
- Multi-input MIs can look cheap per blind only if each input is independently tracked. APsystems EZ1 is the cleanest current example because prior evidence confirms two independent MPPTs.
- AC accessories are repeated: trunk/drop cables, end caps, home-run cables, connectors, and branch components.
- Gateway/combiner costs can be large at low blind counts. Enphase and NEP gateway/combiner anchors show why small systems can be penalized.
- Region-specific grid hardware and electrician/inspection labor are not captured in device prices.

## Evidence Gaps

| Gap | Why it matters |
| --- | --- |
| OEM/bulk pricing | Retail/distributor prices may overstate production economics and understate minimum-order constraints. |
| Shipping/tax/import duties | Most US and Canadian listings do not include final tax/shipping; EU 0% VAT listings are conditional. |
| Exact gateway capacity | Per-blind shared gateway cost needs confirmed device count, radio/PLC range, and facade geometry. |
| Formal Hoymiles 2T/4T MPPT independence | Per-input cost division is invalid until independent MPPT count is confirmed. |
| Central inverter and DC protection cost | Optimizer topology needs inverter, disconnect, protection, cabling, and enclosure cost to become installed EUR/blind. |
| AC branch labor/enclosures | MI topology needs junction boxes, protective earth, breakers, inspection, and facade service access cost. |
| Moving harness price | No price source yet for qualified repeated-motion PV harness/feedthrough suitable for blinds. |
| BIPV/facade certified enclosures | Generic IP boxes are not enough; facade/fire/service classification may change enclosure cost. |

## Sources Needing Manual Verification

| Source | Manual check |
| --- | --- |
| https://7sun.eu/product-category/optimizers/ | Many optimizer SKUs show 0 pcs stock and login/quote flow. Verify actual purchasability and B2B terms. |
| https://www.onsaplus.eu/tigo-ts4-a-o/ | Verify VAT country, shipping, stock, and whether listed price is still current at order. |
| https://invertersrus.com/product/tigo-ts4-a-o/ | Variant price range needs manual product selection for exact single/10-pack/20-pack unit prices. |
| https://solarv.de/apsystems-ez1-m-800w-price | 0% VAT and balcony scope may not transfer to BIPV facade use. |
| https://www.offgridtec.com/en/hoymiles-hms-500-1t-microinverter-module-inverter.html | 0% VAT applies only to eligible German private installations; verify B2B/export price. |
| https://unpluggedpowersystems.ca/product/inverters/inv-grid-tied/inv-grid-tied-nep/nep-bdm-d-300-microinverter/ | Currency inferred as CAD; verify stock and tax/shipping. |
| https://enphase.com/store/accessories | Some accessories are replacement parts or kits, not complete required systems; verify BOM mapping. |
| https://www.solarpanelstore.com/collections/enphase-accessories | Distributor Enphase gateway/combiner prices may not match current Enphase architecture. |
| https://shopsolarkits.com/collections/ap-systems | APsystems cable/gateway listings are for specific legacy/current families; verify DS3/EZ1 compatibility. |

## Next Price Searches

1. `Tigo TS4-A-O bulk price pallet distributor Europe`
2. `Deye SUN-XL02-B installation manual concentrator maximum optimizers`
3. `APsystems DS3 ECU-R trunk cable price Europe`
4. `Hoymiles HMS-1000-2T datasheet independent MPPT price distributor`
5. `certified 200W microinverter price BDM-250 BDM-300 Europe`
6. `PV flexible moving cable rated photovoltaic repeated bending price`
7. `BIPV facade junction box PV optimizer enclosure price IP65 fire rated`

