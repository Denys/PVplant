# Action Log

Date: 2026-05-21  
Folder: `C:\Users\Denys\Documents\Projects\PVplant\Daily\2026-05-21_iwin_pv_blinds_firecrawl_topology_synthesis`

## Actions Completed

1. Used `think` to define the synthesis boundary before writing reports.
2. Used the local Firecrawl cache rather than starting a new search pass.
3. Treated the three Firecrawl research tracks as separate evidence streams: source discovery, optimizer deep dive, microinverter deep dive.
4. Created a Daily synthesis folder.
5. Created `source_inventory.csv` with source type, topology relevance, evidence type, iWin relevance, limitations, and required/useful/skip bucket.
6. Created `evidence_index.csv` with extracted claims, claim type, topology topic, relevance, and follow-up.
7. Created `report.md` as the main synthesis and kept it explicitly non-ranking.
8. Created `optimizer_deep_dive.md` and `microinverter_deep_dive.md` as focused extraction notes.
9. Created `source_discovery_notes.md` with required/useful/skip buckets and next queries.

## Interpretation Choices

Slat-level electronics were excluded as a current architecture option. The working unit is one blind module, meaning the whole PV blind in one window/opening.

Multi-blind "zone" electronics were allowed only where each blind module retains one independent MPPT channel. Shared single-MPPT grouping was marked as a shading-mitigation compromise.

Commercial optimizer and microinverter products were treated as electrical-envelope and installation-boundary evidence, not direct endorsements for iWin.

## Open Follow-Ups

1. Measure or model iWin blind-module `Voc,max`, `Vmp`, `Isc,max`, `Imp`, and `Pmp`.
2. Define the moving boundary: which conductors cross it, allowed voltage/current, cycle life, bend radius, IP rating, and serviceability.
3. Decide whether electronics can be fixed in the headbox/frame rather than moving with the slats.
4. Scrape formal Hoymiles 2T datasheet to resolve independent-MPPT contradiction.
5. Search specifically for BIPV blind/louver electrical prototypes and moving PV facade harness standards.
6. Pull full standards clauses or certification lab guidance for IEC 62109-3, IEC 62548-1, UL 1741, and target-market grid code.
