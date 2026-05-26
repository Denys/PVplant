# Action Log

Date: 2026-05-26

- Used Firecrawl status check: CLI authenticated, `.firecrawl` present, credits available.
- Ran Firecrawl searches for Enphase accessories/gateway, APsystems accessories/prices, Hoymiles accessories/prices, NEP BDM/BDG pricing, APsystems EZ1, and APsystems DS3.
- Scraped high-value price pages into `.firecrawl/2026-05-26-price-evidence/`.
- Downloaded ECB daily reference XML to normalize USD and CAD prices into EUR.
- Created `raw_price_table.csv`, `normalized_cost_table.csv`, and `price_evidence_report.md`.
- Did not use NotebookLM; this was a live price-evidence refresh rather than persistent-source upload.
