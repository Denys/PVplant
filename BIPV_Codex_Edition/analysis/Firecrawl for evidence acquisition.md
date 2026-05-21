**Executive Summary**  
Use Firecrawl for **evidence acquisition**, not final topology judgment. For iWin PV blinds, the research should first close the electrical envelope: **Voc,max**, **Isc,max**, power per blind/slat/string, shading granularity, moving-cable boundary, shutdown/isolation state, MPPT voltage window, thermal limits, service replacement unit, and installation geography. Without those, optimizer vs microinverter scoring will look precise but be false precision.

Checkpoint: this is prompt/workflow design, so I’m keeping it as reusable Firecrawl research prompts. The useful route is **firecrawl-search** for discovery, **firecrawl-scrape** for official/vendor pages, **firecrawl-map** for vendor documentation trees, and **firecrawl-deep-research** only after the first source set is scoped.

**Personal Recommendation**  
Run this in two phases:

1. Evidence discovery: gather official/vendor/application-note/pricing sources.
2. Decision matrix: compare optimizer-based DC topology vs microinverter AC topology against iWin-specific constraints.

Do not start with “which topology is best?” Start with “what evidence would make a topology unsuitable?” For moving PV blinds, hard gates are likely voltage/current range, partial shading behavior, moving-interface reliability, safety shutdown/isolation, serviceability, thermal packaging, and cost per controllable PV segment.

---
**Prompt 1: Source Discovery**


Use Firecrawl to research useful sources for distributed PV electrical topologies suitable for iWin PV blinds / BIPV shading devices. 
Goal: 
Find decision-grade sources for comparing: 
1. DC optimizer / module-level DC-DC / distributed MPPT topologies 
2. Microinverter / AC-module topologies 
3. Any small-module or facade/BIPV-specific variants relevant to moving PV blinds 
 
Use Firecrawl search first, then scrape only high-value pages. 

Prioritize: 
- official manufacturer docs 
- datasheets and installation manuals 
- application notes 
- standards/regulatory guidance 
- pricing pages or distributor listings 
- credible engineering papers or technical reports 

Avoid: 
- generic solar marketing blogs unless they contain unique price or topology evidence 
- unsourced claims 
- residential rooftop-only sources that do not translate to small moving BIPV elements 

For each source, return: 
- URL 
- source type: manufacturer / datasheet / application note / standard / distributor / paper / blog 
- topology relevance: optimizer / microinverter / both / background 
- evidence type: design / how-to / pricing / safety / reliability / installation / economics 
- why it matters for iWin PV blinds 
- limitations or missing data 
- recommended bucket: required / useful / skip 

Do not make a topology recommendation yet. End with a short list of search gaps and next queries.

---
**Prompt 2: Optimizer-Based Topology Deep Dive**

Use Firecrawl to research DC optimizer / distributed MPPT topologies for iWin PV blinds.

Context:
The system is a BIPV / PV blind concept where PV elements may be small, partially shaded, movable, and mechanically distributed. The question is whether optimizer-based DC collection is suitable compared with microinverters.

Research tasks:
1. Find official/vendor evidence for small PV optimizers, DC-DC MLPE, substring MPPT, distributed MPPT, and BIPV/facade use.
2. Scrape datasheets, install manuals, application notes, and price/distributor pages where available.
3. Extract design constraints and cost evidence.

Extract these fields:
- product/vendor
- topology: optimizer / DC-DC / distributed MPPT / substring MPPT
- input voltage range
- maximum input voltage
- MPPT voltage range
- maximum input current
- maximum power
- output voltage/current behavior
- minimum module/string requirements
- shutdown/rapid-shutdown/isolation behavior
- communication/monitoring method
- environmental rating
- operating temperature
- physical dimensions
- connector/cabling requirements
- price evidence with source and date
- certifications or grid/safety dependencies
- notes relevant to moving PV blinds

Then produce:
- optimizer topology variants for iWin
- hard blockers
- promising patterns
- price-per-blind or price-per-W assumptions where evidence supports it
- missing information required before architecture ranking
- source table with URLs

---
**Prompt 3: Microinverter Topology Deep Dive**


Use Firecrawl to research microinverter / AC-module topologies for iWin PV blinds.

Context:
Compare microinverter-based distributed AC conversion against DC optimizer / central inverter architectures for small, movable, facade-integrated PV blinds.

Research tasks:
1. Find official/vendor evidence for microinverters, small-module microinverters, AC modules, BIPV/facade integration, and low-power PV AC conversion.
2. Scrape datasheets, install manuals, application notes, grid-connection docs, and pricing pages.
3. Extract design, safety, installation, and cost implications.

Extract these fields:
- product/vendor
- minimum PV module power
- MPPT voltage range
- maximum DC voltage
- maximum DC current
- number of MPPT inputs
- AC output voltage/frequency
- grid code/certification constraints
- islanding/shutdown behavior
- cabling and junction requirements
- monitoring/gateway requirements
- environmental rating
- operating temperature
- physical dimensions
- price evidence with source and date
- installation constraints for facade/moving elements
- service/replacement boundary

Then produce:
- microinverter topology variants for iWin
- hard blockers
- promising patterns
- price-per-blind or price-per-W assumptions where evidence supports it
- AC safety and installation concerns
- missing information required before architecture ranking
- source table with URLs

---
**Prompt 4: Decision Matrix After Evidence Collection**


Using the Firecrawl evidence already collected, compare optimizer-based and microinverter-based distributed topologies for iWin PV blinds.

Do not add unsupported claims. Preserve epistemic status:
- verified from source
- standards-backed framing
- engineering inference
- vendor-data-required
- open assumption

Compare these architectures:
1. PV blind segments -> DC optimizers / distributed MPPT -> DC bus -> central inverter
2. PV blind or small group -> microinverter -> AC branch
3. PV blind segments -> low-voltage DC collection -> shared MPPT/inverter
4. Hybrid: per-blind DC optimizer with facade-level inverter

Score each architecture from 1-5 for:
- partial shading tolerance
- suitability for small PV elements
- moving-cable/interface feasibility
- shutdown/isolation safety
- thermal packaging
- serviceability/replacement
- monitoring/diagnostics
- installation complexity
- price evidence strength
- expected cost per controllable PV unit
- regulatory/grid complexity
- maturity/availability

For every score, include:
- evidence source URL or “inference”
- confidence: high / medium / low
- blocking missing data

End with:
- top 2 candidate topologies
- rejected or weak topologies
- hard-gate measurements needed from iWin
- supplier/product shortlist
- next Firecrawl searches

---

**Prompt 5: Price Evidence Focus**


Use Firecrawl to gather price evidence for distributed PV electronics relevant to iWin PV blinds.

Focus on:
- PV optimizers / DC-DC MLPE
- microinverters
- small PV module electronics
- monitoring gateways
- connector/cabling accessories
- enclosure or junction accessories where tied to topology

Use official pricing only if available; otherwise use distributor/retail listings and clearly label them.

For each price source extract:
- vendor/product
- topology category
- unit price
- currency
- quantity break if shown
- source URL
- date accessed
- region
- whether price includes VAT/tax/shipping
- required companion hardware
- estimated system-level cost impact per blind or per PV segment
- uncertainty notes

Output:
1. raw price table
2. normalized cost table in EUR where possible
3. optimizer vs microinverter cost drivers
4. evidence gaps
5. sources that need manual verification

---
Best first run: use **Prompt 1**, then run **Prompt 2** and **Prompt 3** separately. Only run **Prompt 4** after you have source tables; otherwise the comparison will overfit generic rooftop PV assumptions to a moving BIPV blind problem.
