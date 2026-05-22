# NotebookLM BIPV_Brain Source Pack

Created: 2026-05-22  
Destination: `C:\Users\Denys\Documents\Projects\PVplant\NotebookLM\Sources`

## Load Order

1. `00_project_context`
   - Start here. This gives NotebookLM the project rules, current blockers, durable BIPV_Brain state, and research instructions.

2. `01_iwin_topology_synthesis`
   - Current synthesized evidence package from the iWin PV blinds topology research.

3. `02_firecrawl_scraped_sources\required`
   - Required scraped source evidence from manufacturer, datasheet, manual, standards, and BIPV topology sources.

4. `03_literature_pdfs\required_and_useful`
   - Local BIPV/iWin literature corpus. Load these before optional public clues.

5. `04_pv_dmppt_books\required`
   - Core PV/BIPV topology books and standard references: Xiao 2017, Chivelet 2025, IEC 62548, and Photovoltaic Systems Technology 2024.

6. `04_pv_dmppt_books\useful`
   - Supplemental MPPT/modeling/practical-system references.

## Optional / Noisy Sources

Load these only if BIPV_Brain still needs broader context after the required set:

- `02_firecrawl_scraped_sources\useful`
- `03_literature_pdfs\public_clue_optional`
- `04_pv_dmppt_books\secondary_optional`
- `05_presentation_decks_optional`

The presentation decks and public-clue screenshot are useful for reconstructing project claims, but they should not outrank direct datasheets, standards, papers, or the evidence indexes.

## Copy Logs

- `99_copy_logs\copied_sources.csv` lists every copied file with source and destination.
- `99_copy_logs\missing_sources.csv` should remain empty. It was empty at creation.

## Boundaries

Architecture ranking remains blocked until the blind-module electrical envelope, shutdown/isolation state, moving-cable boundary, thermal envelope, target code region, rapid-shutdown approach, and service boundary are populated.
