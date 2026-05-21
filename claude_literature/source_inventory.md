# BIPV/iWin Literature Source Inventory

Scope: `C:\Users\Denys\Documents\Projects\PVplant\claude_literature`

Stage: inventory and proposed one-paper-at-a-time processing order only. No paper content has been analyzed beyond file metadata and light first-page/header signals needed to classify source type.

Taxonomy to preserve in later stages: `Verified public fact`, `Standards-backed framing`, `Public clue`, `Engineering inference`, `Vendor-data required`.

Architecture/vendor ranking is blocked until electrical-envelope and shutdown/service-boundary inputs are populated.

| source_id | filename | type | likely relevance | expected risk of bias | recommended processing order |
|---|---|---|---|---|---|
| SRC-RAVYTS-2019-BIPV-MLC-REQ | Review on Building-Integrated Photovoltaics Electrical System Requirements and Module-Integrated Converter Recommendations.pdf | Appears peer-reviewed review paper; standards-adjacent requirements/recommendations paper, not a standard | Highest direct fit for BIPV electrical-system requirements, module-integrated converter requirements, LVDC/AC architecture framing, fault tolerance, and safety/serviceability boundaries | Low to moderate: academic review/recommendation framing, but not itself a normative standard; converter recommendations still require project-specific validation | 1 |
| SRC-RAMOS-PAJA-2025-BIPV-POWER-MGMT | Building Integrated Photovoltaic Systems -- Characteristics and Power Management.pdf | Appears peer-reviewed review paper | Broad current technical background for BIPV power management, MPPT/DMPPT granularity, partial shading, DC buses, and cross-coupling issues | Low to moderate: broad review can over-generalize across BIPV forms; transfer to moving PV blinds must remain explicit | 2 |
| SRC-EUM-2024-POWER-OPTIMIZER-SHADE | Effects of Power Optimizer Application in a Building-Integrated Photovoltaic System According to Shade Conditions.pdf | Appears peer-reviewed experimental article / case-study | Direct BIPV optimizer evidence under shade conditions; likely useful for MLPE granularity, mismatch recovery, monitoring, and optimizer limits | Moderate: specific test setup, module format, and optimizer assumptions may not transfer to iWin without electrical-envelope/vendor data | 3 |
| SRC-IKKURTI-2015-MICROINVERTER-REVIEW | A comprehensive techno-economic review of microinverters.pdf | Appears peer-reviewed review paper | Microinverter topology, BIPV inverter economics, reliability/lifetime, product-spec background, and market framing | Moderate: older 2015 market/product data is likely stale; technical topology framing may remain useful but product/economic claims need dated treatment | 4 |
| SRC-ACCELERATE-2026-OPTIMIZER-MICROINVERTER-SCREENSHOT | accelerate-solar.com-Power Optimizer vs Microinverter Which Is Better in   Accelerate Solar-fpscreenshot.pdf | Vendor/web article screenshot; image-only PDF from text-extraction check | Public clue only for installer/vendor-style optimizer-vs-microinverter framing and common decision language | High: commercial/web framing, no peer-review signal, likely simplified; must not steer technical conclusions | 5 |
| CTRL-PIPELINE-PROMPTS-2026 | _Prompts for use of evidence to report pipeline - skill.md | Local workflow/control markdown, not a literature evidence source | Useful as process memory for the one-paper workflow and taxonomy preservation | Not applicable as evidence; risk is process anchoring if treated as a source | Exclude from paper queue |

