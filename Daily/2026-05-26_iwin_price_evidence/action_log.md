# Action Log

Date: 2026-05-26

- Used `think` as a decision checkpoint.
- Used Firecrawl status check, then Firecrawl search for accessory/gateway price gaps.
- Scraped high-value pages for Enphase accessories, APsystems accessories, Hoymiles accessories/DTU, NEP BDM/BDG, and Tigo accessory price anchors.
- Used existing Firecrawl cache for previously collected Tigo, Deye, Huawei, SolarEdge, Enphase, APsystems, Hoymiles, and NEP price sources.
- Used ECB daily reference rates for USD/CAD to EUR normalization because Firecrawl's XML scrape did not expose the numeric rates.
- Created `raw_price_table.csv`, `normalized_cost_table.csv`, and `price_evidence_report.md`.
