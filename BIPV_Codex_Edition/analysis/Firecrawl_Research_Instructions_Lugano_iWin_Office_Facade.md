# Firecrawl Research Instructions - Lugano iWin Office Facade

Source prompt: [Research_Prompt_Lugano_iWin_Office_Facade.md](C:/Users/Denys/Documents/Projects/PVplant/BIPV_Codex_Edition/analysis/Research_Prompt_Lugano_iWin_Office_Facade.md)

## Executive Summary

Use Firecrawl as an evidence-acquisition and normalization layer, not as the final design authority. The source prompt is too broad for one unsupervised "research everything" pass because it mixes current Swiss legal verification, product-envelope discovery, architecture comparison, economics, safety states, and reliability. Split it into phased Firecrawl runs and block architecture ranking until the electrical and compliance gates are populated.

Conclusion: run compliance mapping and electrical-envelope discovery first. Optimizer, microinverter, segmented DC bus, and submodule DPP comparisons are only useful after the run has captured `Voc,max`, `Isc,max`, MPPT window, isolation boundary, replacement boundary, moving-conductor assumptions, and thermal mission profile. My suggestion is to treat the first Firecrawl output as a source ledger plus closure register, then promote only reviewed claims into the BIPV project artifacts.

## UPE4 Task Frame

Target surface: Firecrawl deep-research / search-scrape instruction pack for the Lugano iWin office-facade case.

Primary optimization profile: Deployability.

Deployment shape: paste the phase prompts into Firecrawl deep research or run equivalent Firecrawl `search`, `scrape`, `map`, `crawl`, and `parse` operations. Create a local output folder only when saving the first actual Firecrawl result, for example `analysis/firecrawl/lugano-iwin-office-facade/`.

Success condition: Firecrawl returns a source ledger, extraction tables, and unresolved closure items that either populate the Lugano pre-design gates or explicitly mark the blocked decisions.

Explicit assumptions:
- Firecrawl can search and scrape public web pages and public PDFs.
- Paywalled standards may only be identified by exact designation, title, edition/date, and decision question; do not claim clause content unless the text is available.
- External evidence remains candidate evidence until manually reviewed against the BIPV project evidence taxonomy.

## Built-In Falsification Tests

Use these tests against the Firecrawl result before accepting it:

| Test | Failure signal | Required correction |
| --- | --- | --- |
| Legal-currentness test | It cites Swiss, Ticino, Lugano, ESTI, or VKF/AEAI requirements without date, edition, authority, or URL. | Re-run with official-source filtering and record current version/date. |
| Evidence-boundary test | It treats a public clue, vendor marketing page, or unsourced blog as a design fact. | Downgrade the claim to `Public clue` or `Vendor-data required`. |
| Architecture-gate test | It names a preferred topology before `Voc,max`, `Isc,max`, MPPT window, shutdown/isolation, and replacement boundary are populated. | Remove the ranking and mark architecture comparison as blocked. |
| Source-quality test | It gives generic BIPV statements without numbers, standards designations, product limits, or approval implications. | Re-run with extraction schema and source priority constraints. |
| Moving-facade test | It misses moving conductors, feedthroughs, condensation, repetitive bending, service access, or diagnostics. | Run the thermal/reliability phase separately. |
| Price-evidence test | It compares CAPEX without date, currency, quantity, product SKU, and source type. | Move the data to price evidence only; do not use it for final LCOE/NPV. |

## Master Firecrawl Instruction

```text
You are using Firecrawl for evidence acquisition for a decision-grade BIPV pre-design study:

Project: Lugano, Switzerland office facade using iWin-type glazing-integrated photovoltaic venetian blinds / PV shading devices.
Case: 60 m2 active PV blind area per floor; 3, 4, and 5 floor variants; 180, 240, and 300 m2 total active area; assumed public prompt range 60-160 W/m2 Pmax until vendor data closes it.

Your job is not to write the final design memo. Your job is to collect, scrape, and normalize evidence that can later support or block the design work.

Required evidence taxonomy for every non-trivial claim:
- Verified public fact
- Standards-backed framing
- Public clue
- Engineering inference
- Vendor-data required

Non-negotiable guardrails:
- Do not convert public clues into design facts.
- Do not claim compliance approval, procurement readiness, insurability, or bankability.
- Do not rank a preferred architecture until electrical envelope and compliance gates are populated.
- Keep module-level, system-level, electrical-design, commissioning, operation, and maintenance obligations separate.
- Prefer official, vendor, standards-body, utility, authority, peer-reviewed, NREL, IEA-PVPS, MeteoSwiss, or equivalent technical sources.
- Use blogs, media, and SEO pages only as discovery clues, never as closure evidence.
- For every source, record URL, organization, source type, publication or revision date if visible, access date, what it helps decide, numbers extracted, limits, and what it does not prove.
```

## Recommended Firecrawl Operation Pattern

Use this sequence instead of a single broad scrape:

1. `search`: discover candidate authoritative URLs for each phase.
2. `scrape`: scrape only high-value pages and PDFs identified by search.
3. `map`: use only on official domains after a relevant page is found.
4. `crawl`: use bounded crawls for official authority, vendor, or utility pages; avoid broad whole-domain crawls.
5. `parse`: use for downloaded public PDFs where page-aware extraction is needed.
6. `deep-research`: synthesize only after the source ledger exists.

For a thorough run, target 15-25 scraped sources per major phase. For this case, an exhaustive run can reach 50-80 total sources, but only if the source ledger stays deduplicated and source-quality labels are enforced.

## Phase 0 - Swiss, Ticino, Lugano, Fire, Grid, and Product Compliance Map

```text
Firecrawl phase: compliance-source discovery and extraction.

Research the current authoritative legal, normative, permitting, fire-safety,
 grid-connection, and market-placement constraints for an office-building 
 facade in Lugano, Switzerland using facade-integrated photovoltaic venetian 
 blinds / PV shading devices.

Prioritize official sources:
- Fedlex / Swiss federal law and ordinances
- ESTI
- VKF / AEAI
- Cantone Ticino
- City of Lugano
- local DSO / utility interface; verify the responsible DSO instead of assuming it
- Swissolar or other authoritative technical summaries where official legal text is incomplete
- official standards bodies or authoritative standard catalog pages

Search/query seeds:
- Switzerland NIV OIBT SR 734.27 low voltage installations PV facade
- ESTI photovoltaic installation inspection safety certificate Switzerland
- Switzerland NEV electrical products photovoltaic inverter optimizer declaration conformity
- Switzerland BauPG BauPV construction products facade glazing photovoltaic
- VKF AEAI solar systems facade photovoltaic fire protection guidance
- Ticino RUEn Len EN-TI photovoltaic facade building application
- Lugano building permit facade photovoltaic shading device regolamento edilizio
- Lugano photovoltaic grid connection DSO AIL verify
- SN 411000 NIN photovoltaic installation Switzerland latest edition
- IEC 61215 IEC 61730 IEC TS 63126 BIPV facade applicability

Return a compliance matrix with:
authority_or_body, rule_or_standard, exact_title, edition_or_revision_date, URL, source_type, mandatory_vs_good_practice_vs_incentive, facade/PV/shading/glazing scope, decision_affected, project_stage, likely_evidence_required, source_limitations, open_questions.

Do not quote paywalled standard content unless the public source provides it. If paywalled, identify the exact standard and the precise design question it must answer.
```

## Phase 1 - iWin / PV Blind Product and Electrical-Envelope Discovery

```text
Firecrawl phase: product-envelope and vendor-data discovery.

Find public information for iWin-type photovoltaic venetian blinds, PV louvers, glazing-integrated PV blinds, and comparable facade-integrated PV shading products. The goal is to discover what public evidence exists for electrical unit boundaries, power density, voltage/current limits, bypass topology, thermal limits, and moving-interface details.

Prioritize:
- official iWin vendor/company pages, datasheets, brochures, technical PDFs, installation manuals, patents, and certification references
- comparable PV shading / PV louver / BIPV blind vendors with official technical data
- public test reports, academic papers, or standards-adjacent sources that describe PV venetian blind electrical behavior

Search/query seeds:
- iWin photovoltaic venetian blinds datasheet Voc Isc Pmax
- iWin PV blinds glazing integrated photovoltaic shading device technical data
- photovoltaic venetian blind louver module Voc Vmp Isc bypass diode
- BIPV blind facade PV louver power density W/m2 datasheet
- glazing integrated photovoltaic shading system MPPT louver
- PV venetian blind moving cable feedthrough connector datasheet

Extract into an electrical-envelope table:
source_id, product_or_system, active_area_basis, Pmax_W_or_W_per_m2, unit_area_m2, Voc_STC, Vmp_STC, Isc_STC, Imp_STC, temperature_coefficients, bypass_or_substring_layout, recommended_grouping, max_series_or_parallel_limits, MPPT_range, max_system_voltage, operating_temperature_range, IP/enclosure_rating, moving_interface_details, replacement_boundary, certification_claims, evidence_tag, vendor_data_still_required.

If no public vendor data exists for a field, write `Vendor-data required`; do not infer values from generic PV modules unless clearly marked as placeholder engineering inference.
```

## Phase 2 - Claim Re-Evaluation Evidence for Shading, MPPT, DMPPT, Safety, PR, and Economics

```text
Firecrawl phase: technical claim audit evidence.

Collect high-quality public evidence to test these claim families:
1. "5% shaded area can cause 80% total power drop."
2. "Centralized MPPT gets stuck under partial shading" as a universal statement.
3. "Distributed MPPT is mandatory for urban BIPV."
4. "Module-level DMPPT is the BIPV standard."
5. "Per-floor DC bus below 120 V is inherently safe" or too low for serious arc risk.
6. "Microinverters eliminate high-voltage DC risk" as a full safety claim.
7. "Power optimizers are thermally more robust than microinverters" as a general law.
8. "CAPEX is the only DMPPT friction point."
9. ">74% PR is expected" without assumptions.
10. "Superior LCOE / NPV" without disclosed boundary conditions.

Prioritize:
- NREL, IEA-PVPS, Sandia, Fraunhofer, peer-reviewed PV mismatch/MLPE papers
- official safety/fire/electrical guidance
- official manufacturer datasheets only for product-specific limitations

Search/query seeds:
- PV partial shading 5 percent 80 percent power loss bypass diode study
- centralized MPPT local maxima partial shading photovoltaic evidence
- distributed MPPT BIPV urban facade mismatch review
- module level power electronics BIPV reliability thermal optimizer microinverter
- low voltage DC arc photovoltaic 120 V safety standard
- photovoltaic performance ratio facade BIPV assumptions urban shading
- BIPV LCOE NPV facade shading replacement uncertainty

Return a claim re-evaluation matrix:
claim, source_id, source_type, evidence_tag, verdict_supported_conditionally_true_overstated_unsupported_contradicted, exact_condition_where_true, limiting_assumptions, numbers_or_formulas_extracted, what_would_close_the_claim.

Do not produce a final verdict from one source if the claim is broad. Preserve conflicting evidence.
```

## Phase 3 - Architecture Option Evidence and Product-Envelope Comparison

```text
Firecrawl phase: architecture evidence collection, not final ranking.

Collect evidence for these architecture candidates under the Lugano facade case:
- centralized string inverter
- string-level MPPT
- module-level power optimizers with central inverter
- module-level microinverters
- segmented low-voltage DC bus per floor or per zone
- submodule differential power processing as frontier option

Prioritize official product datasheets and installation manuals for:
- MPPT voltage window
- maximum input voltage/current
- maximum string length
- temperature range
- enclosure rating
- shutdown behavior
- monitoring granularity
- protection requirements
- warranty/replacement statements
- installation restrictions relevant to facade cavities or non-rooftop use

Search/query seeds:
- optimizer MPPT input voltage current datasheet photovoltaic facade
- microinverter input voltage current temperature range datasheet BIPV
- module level power electronics rapid shutdown Europe facade PV
- low voltage DC bus photovoltaic facade converter MPPT
- differential power processing PV module submodule BIPV
- PV optimizer operating temperature derating reliability datasheet
- microinverter operating temperature derating facade cavity

Return an architecture evidence table:
architecture, candidate_product_or_reference, source_id, voltage_window, current_limit, MPPT_granularity, max_system_voltage, shutdown/isolation_behavior, thermal_rating, installation_environment_limits, monitoring_granularity, replacement_boundary, service_access_assumption, likely_commissioning_burden, missing_vendor_data, evidence_tag.

Stop before ranking. Mark each architecture as `eligible_for_later_comparison`, `blocked_by_missing_data`, or `likely_eliminated_by_explicit_limit` only when the evidence supports that status.
```

## Phase 4 - Thermal, Moving-Interface, Fire, and Reliability Evidence

```text
Firecrawl phase: thermal and reliability evidence for moving facade PV blinds.

Find evidence for likely thermal and reliability stressors in facade-integrated PV blind systems:
- summer facade cavity temperatures
- winter low-temperature impact on Voc,max
- thermal cycling for edge electronics
- moving conductors and repeated bending
- connector and feedthrough reliability
- condensation and enclosure sealing
- fire propagation in facade cavities
- service access and replacement burden

Prioritize:
- peer-reviewed facade thermal/BIPV studies
- standards-adjacent guidance on PV cable, connectors, outdoor enclosures, and moving equipment
- official fire-safety guidance
- vendor manuals where they state environmental limits or installation prohibitions

Search/query seeds:
- BIPV facade cavity temperature summer photovoltaic blinds
- double skin facade photovoltaic blind cavity temperature reliability
- PV cable repeated bending moving photovoltaic shading device
- facade integrated PV fire cavity cable routing guidance Switzerland
- photovoltaic connector condensation facade cavity reliability
- IEC TS 63126 building integrated photovoltaic thermal stress
- PV module low temperature Voc maximum calculation Switzerland Lugano

Return a reliability register:
issue, source_id, public_evidence, likely_design_impact, affected_architectures, numbers_extracted, evidence_tag, vendor_data_required, test_or_inspection_needed.
```

## Phase 5 - Price, Availability, and Economic Inputs

```text
Firecrawl phase: price evidence only.

Collect price and availability evidence relevant to architecture comparison, but do not calculate final LCOE/NPV unless the boundary conditions are explicit.

Prioritize:
- official list prices where available
- recognized distributor prices
- public tenders or procurement references
- manufacturer statements about warranty and replacement terms

Search/query seeds:
- photovoltaic power optimizer price CHF Europe datasheet
- microinverter price CHF Europe datasheet MPPT input voltage
- BIPV facade PV blind cost m2 vendor
- PV louver photovoltaic shading price m2
- module level power electronics replacement warranty microinverter optimizer

Return a price evidence table:
source_id, product_or_category, SKU_or_model, price, currency, date_accessed, quantity_basis, region, included_scope, excluded_scope, warranty_or_service_terms, comparability_limit, evidence_tag.

Do not compare CAPEX across products unless scope, quantity, currency, and inclusion/exclusion boundaries are comparable.
```

## Required Output Schemas

### Source Ledger

```csv
source_id,url,title,organization,source_type,authority_tier,publication_or_revision_date,access_date,language,firecrawl_operation,topics,decisions_supported,numbers_extracted,source_limitations,evidence_tag,reuse_status
```

### Compliance Matrix

```csv
authority_or_body,rule_or_standard,exact_title,edition_or_revision_date,url,source_type,requirement_type,scope_boundary,decision_affected,project_stage,likely_evidence_required,source_limitations,open_questions
```

### Electrical Envelope Table

```csv
source_id,product_or_system,unit_boundary,active_area_basis,Pmax_W_or_W_per_m2,Voc_STC,Vmp_STC,Isc_STC,Imp_STC,temp_coeff_Voc,temp_coeff_Isc,bypass_or_substring_layout,MPPT_range,max_system_voltage,operating_temperature_range,shutdown_or_isolation_behavior,moving_interface_details,replacement_boundary,evidence_tag,vendor_data_required
```

### Claim Re-Evaluation Matrix

```csv
claim,source_id,source_type,evidence_tag,verdict,condition_where_true,limiting_assumptions,numbers_or_formulas_extracted,what_would_close_the_claim
```

### Architecture Evidence Table

```csv
architecture,candidate_product_or_reference,source_id,voltage_window,current_limit,MPPT_granularity,max_system_voltage,shutdown_or_isolation_behavior,thermal_rating,installation_environment_limits,monitoring_granularity,replacement_boundary,commissioning_burden,missing_vendor_data,eligibility_status,evidence_tag
```

### Vendor-Data Closure Register

```csv
closure_id,missing_value_or_document,blocks_decision,required_from,acceptable_evidence,priority,related_architectures,related_safety_state,notes
```

## Calculation Inputs Firecrawl Should Try to Populate

Firecrawl should find or explicitly fail to find these values:

| Input | Why it matters | If missing |
| --- | --- | --- |
| `Pmax` per louver, blind unit, panel, or m2 | Defines 180/240/300 m2 nameplate range. | Use only the prompt placeholder range 60-160 W/m2 and tag as placeholder. |
| `Voc_STC`, `Vmp_STC`, `Isc_STC`, `Imp_STC` | Enables series/parallel grouping and converter fit. | Architecture ranking remains blocked. |
| `betaVoc`, `alphaIsc` | Enables `Voc,max` and `Isc,max`. | Use generic silicon values only as engineering inference if separately approved. |
| Bypass/substring layout | Determines mismatch behavior and reverse-bias risk. | Shading-loss claims remain conditional. |
| MPPT input windows | Determines feasible grouping. | Do not compare inverter/optimizer/microinverter fit. |
| Shutdown/isolation behavior | Determines fire and maintenance states. | Safety architecture remains open. |
| Operating temperature limits | Determines edge-electronics feasibility. | Thermal comparison remains open. |
| Moving-interface details | Determines cable/feedthrough/service risk. | Reliability and replacement boundary remain open. |
| Certification/qualification claims | Determines product and construction-product evidence path. | Compliance remains an approval question, not a design fact. |

## Stop Rules

Stop a Firecrawl phase and report `blocked` if:
- official sources cannot confirm current legal or normative status;
- the only evidence for a key product field is marketing copy;
- product electrical data lacks voltage/current values;
- architecture comparison would require inventing unit boundaries;
- price evidence lacks date, currency, or scope;
- scraped sources conflict materially and no higher-authority source resolves the conflict.

## Final Firecrawl Deliverable Shape

The Firecrawl result should be a research package, not prose-only synthesis:

1. Source ledger
2. Evidence by tag
3. Compliance matrix
4. Electrical-envelope table
5. Claim re-evaluation matrix
6. Architecture evidence table
7. Thermal/reliability register
8. Price evidence table
9. Vendor-data closure register
10. Blocked decisions and exact missing evidence
11. Suggested next local artifact updates, without editing them automatically

## Governance Decision

This instruction pack belongs in `analysis/` because it is a research-run artifact derived from the Lugano prompt, not an always-on rule. If the project later standardizes Firecrawl use, compress the reusable portions into a skill or companion runbook and leave this file as the Lugano-specific instance.
