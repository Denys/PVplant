# BIPV_Brain

Rolling archive for session summaries, decisions, learnings, unresolved questions, and next-work anchors for the iWin / BIPV pre-design effort.

## Purpose

Use this file as the project memory for:
- session-by-session summaries
- decisions taken or explicitly deferred
- stable technical learnings worth carrying forward
- unresolved assumptions and open threads
- links to the latest durable artifacts

## Operating Rules

- Do not convert a public clue into a design fact.
- Keep evidence tagged mentally as:
  - `Verified public fact`
  - `Standards-backed framing`
  - `Public clue`
  - `Engineering inference`
  - `Vendor-data required`
- Do not rank architecture options before the electrical envelope is defined.
- Keep module-level, system-level, electrical-design, commissioning, and maintenance obligations separate.
- Treat temperature, mismatch, bypass topology, moving conductors, feedthroughs, diagnostics, and replacement boundary as first-order issues.

## Current Position

### Working conclusion

The current project direction favors finer-granularity power processing over classic centralized string MPPT for iWin-type moving PV blinds, but no preferred architecture is closed yet.

### Why no architecture is closed yet

The following hard-gate inputs are still missing or not yet verified:
- `Voc,max`
- `Isc,max`
- MPPT window requirement
- disconnect / isolation boundary
- protection concept
- connector family
- cable class
- replacement boundary
- thermal mission profile
- moving-interface definition

## Durable Artifacts

- Deck audit: [analysis/BIPV_Presentation_Deck_Audit.md](C:/Users/Denys/Documents/Projects/PVplant/BIPV_Codex_Edition/analysis/BIPV_Presentation_Deck_Audit.md)
- Primary-source reevaluation: [analysis/BIPV_Presentation_Deck_Primary_Source_Reevaluation.md](C:/Users/Denys/Documents/Projects/PVplant/BIPV_Codex_Edition/analysis/BIPV_Presentation_Deck_Primary_Source_Reevaluation.md)
- Missing-information graph: [analysis/BIPV_Presentation_Deck_Missing_Information_Map.md](C:/Users/Denys/Documents/Projects/PVplant/BIPV_Codex_Edition/analysis/BIPV_Presentation_Deck_Missing_Information_Map.md)
- Lugano research prompt: [analysis/Research_Prompt_Lugano_iWin_Office_Facade.md](C:/Users/Denys/Documents/Projects/PVplant/BIPV_Codex_Edition/analysis/Research_Prompt_Lugano_iWin_Office_Facade.md)
- Firecrawl research instructions: [analysis/Firecrawl_Research_Instructions_Lugano_iWin_Office_Facade.md](C:/Users/Denys/Documents/Projects/PVplant/BIPV_Codex_Edition/analysis/Firecrawl_Research_Instructions_Lugano_iWin_Office_Facade.md)
- iWin distributed topology synthesis: [../Daily/2026-05-21_iwin_pv_blinds_firecrawl_topology_synthesis/report.md](C:/Users/Denys/Documents/Projects/PVplant/Daily/2026-05-21_iwin_pv_blinds_firecrawl_topology_synthesis/report.md)
- iWin topology source inventory: [../Daily/2026-05-21_iwin_pv_blinds_firecrawl_topology_synthesis/source_inventory.csv](C:/Users/Denys/Documents/Projects/PVplant/Daily/2026-05-21_iwin_pv_blinds_firecrawl_topology_synthesis/source_inventory.csv)
- iWin topology evidence index: [../Daily/2026-05-21_iwin_pv_blinds_firecrawl_topology_synthesis/evidence_index.csv](C:/Users/Denys/Documents/Projects/PVplant/Daily/2026-05-21_iwin_pv_blinds_firecrawl_topology_synthesis/evidence_index.csv)
- iWin optimizer deep dive: [../Daily/2026-05-21_iwin_pv_blinds_firecrawl_topology_synthesis/optimizer_deep_dive.md](C:/Users/Denys/Documents/Projects/PVplant/Daily/2026-05-21_iwin_pv_blinds_firecrawl_topology_synthesis/optimizer_deep_dive.md)
- iWin microinverter deep dive: [../Daily/2026-05-21_iwin_pv_blinds_firecrawl_topology_synthesis/microinverter_deep_dive.md](C:/Users/Denys/Documents/Projects/PVplant/Daily/2026-05-21_iwin_pv_blinds_firecrawl_topology_synthesis/microinverter_deep_dive.md)
- NotebookLM upload pack: [../Daily/2026-05-22_BIPV_Brain_NotebookLM_upload_pack/MANIFEST - BIPV Brain NotebookLM upload 2026-05-22.md](C:/Users/Denys/Documents/Projects/PVplant/Daily/2026-05-22_BIPV_Brain_NotebookLM_upload_pack/MANIFEST%20-%20BIPV%20Brain%20NotebookLM%20upload%202026-05-22.md)

## Current Decisions

| Date | Decision | Status | Notes |
| --- | --- | --- | --- |
| 2026-04-14 | Use explicit evidence taxonomy for all non-trivial BIPV claims | Active | Prevents marketing drift and hidden assumptions |
| 2026-04-14 | Do not rank architecture until electrical-envelope hard gates are populated | Active | Core project gate |
| 2026-04-14 | Treat safety, thermal behavior, moving conductors, and service boundary as first-order design topics | Active | Applies to all future architecture work |
| 2026-04-14 | Use Lugano office facade case as practical sizing reference: 60 m2 per floor, 3-5 floors | Active | Used in the latest research prompt |
| 2026-04-14 | Explicitly include Swiss normative and legislative constraints in future research work | Active | Federal, cantonal, municipal, fire-safety, and market-interface layers required |

## Current Learnings

- The five reviewed decks are directionally strong but overstate certainty.
- The strongest technical content is around shading mismatch, reverse bias, hot-spot logic, and the value of higher granularity.
- The weakest content is around:
  - universalized power-loss claims
  - absolute safety claims
  - unsupported PR / LCOE / NPV claims
  - premature optimizer-versus-microinverter conclusions
- Safety claims must not collapse into slogans such as:
  - "safe below 120 V"
  - "microinverters eliminate risk"
  - "insurable architecture" without approval evidence
- Economics cannot be treated honestly until yield assumptions, replacement burden, thermal derating, and regulatory constraints are explicit.
- Swiss / Ticino / Lugano regulatory fit is not background context. It is an architecture filter.

## Open Threads

| Priority | Thread | Why it matters | Blocking items |
| --- | --- | --- | --- |
| High | Electrical envelope definition | Blocks architecture ranking | Module / louver electrical data, grouping assumptions, converter windows |
| High | Lugano practical dimensioning | Converts concept into usable pre-design | Power density, weather / irradiance source, facade assumptions |
| High | Swiss normative and legislative map | Can eliminate topologies before design effort is wasted | OIBT / NIV, ESTI, VKF / AEAI, Ticino, Lugano, DSO interface |
| High | Safety state definition | Needed for shutdown, fire response, maintenance | Isolation boundary, residual voltage, segmentation strategy |
| High | Thermal mission profile | Directly affects reliability and architecture choice | Cavity temperatures, low-temp Voc,max, derating behavior |
| Medium | Moving conductor and feedthrough strategy | Unique failure and maintenance driver for PV blinds | Cable class, flex life, sealing, strain relief, replacement method |
| Medium | Vendor-data request package | Needed to close assumptions cleanly | Datasheets, qualification reports, drawings, shutdown behavior |
| Medium | Architecture decision matrix | Needed after envelope and regulatory mapping | Comparable criteria and product candidates |

## Session Log

### 2026-05-21 - Session 04

#### Summary

- Converted the Lugano iWin office-facade research prompt into a Firecrawl-ready research instruction pack.
- Split the work into phased evidence acquisition: compliance, product/electrical envelope, claim re-evaluation, architecture evidence, thermal/reliability, and price evidence.
- Added falsification tests and stop rules to prevent premature architecture ranking or conversion of public clues into design facts.

#### Decisions / outcomes

- Firecrawl should be used as a source-acquisition and normalization layer, not as final design authority.
- Architecture ranking remains blocked until the electrical-envelope and compliance gates are populated.
- The new Firecrawl instruction pack is the durable entrypoint for web evidence collection on the Lugano case.

#### Learnings captured

- The original prompt is better deployed as a phased research workflow than as a single broad deep-research request.
- The first useful Firecrawl output should be a source ledger plus closure register, not prose-only synthesis.

#### Open threads carried forward

- Run Firecrawl phases and save the candidate evidence package.
- Review extracted claims before promoting them into the design envelope, assumption register, or vendor-data request package.

### 2026-05-22 - Session 05

#### Summary

- Consolidated the three Firecrawl topology research passes into a Daily synthesis package.
- Captured source inventory, evidence index, optimizer deep dive, microinverter deep dive, source discovery notes, and action log.
- Uploaded the high-signal source subset to NotebookLM BIPV_Brain and verified all uploaded sources reached `ready` status.

#### Decisions / outcomes

- Keep blind-module level as the active electrical unit; slat-level electronics remain excluded from current architecture synthesis.
- A multi-blind zone is acceptable only when each blind module keeps an independent MPPT channel.
- Architecture ranking remains blocked until the blind-module electrical envelope, shutdown/isolation state, moving-cable boundary, thermal envelope, target grid/code region, rapid-shutdown strategy, and service boundary are populated.
- NotebookLM BIPV_Brain core refresh added 27 staged sources; bookkeeping/final result sources brought the live source count to 43.

#### Learnings captured

- The strongest BIPV-specific evidence currently comes from facade/elevation optimizer papers plus vendor datasheets/manuals.
- Commercial optimizers are mostly module/string ecosystem products, not neutral small BIPV converter blocks.
- Commercial microinverters provide clearer grid-conversion evidence but move AC wiring, anti-islanding, gateway/grid-profile setup, and service constraints into the facade system.
- IEC 62109-3 is a central standards path if electronics become integrated with the blind module product.

#### Open threads carried forward

- Measure or model per-blind `Voc,max`, `Vmp`, `Isc,max`, `Imp`, and `Pmp`.
- Define the moving harness and fixed-headbox electronics boundary.
- Resolve Hoymiles 2T independent-MPPT evidence from formal datasheets.
- Build the next architecture decision matrix only after the hard gates are populated.

### 2026-04-17 - Session 03

#### Summary

- Derived a single missing-information map from the deck audit and the primary-source reevaluation.
- Reorganized the gaps by blocked decision rather than by presentation deck.
- Added a graphical dependency view showing which closure artifacts must exist before architecture scoring.

#### Decisions / outcomes

- The repeated missing items compress cleanly into five closure streams:
  - electrical envelope and granularity
  - shutdown / isolation and safety state
  - thermal / packaging
  - moving-interface and serviceability
  - diagnostics / economics
- No blocked conclusion can be closed from slide text alone.
- Architecture scoring remains gated behind the same hard-envelope and service-boundary inputs.

#### Learnings captured

- The strongest practical use of the deck set is now as a source of closure questions, not as a source of answers.
- The most leverage comes from turning narrative claims into worksheet-ready closure streams.
- Safety, packaging, and economics claims all depend on the same small set of missing single-line, product, and state-definition artifacts.

#### Open threads carried forward

- Build the first electrical-envelope worksheet
- Build the shutdown-state definition
- Build the thermal-risk worksheet
- Build the vendor-data request package

### 2026-04-16 - Session 02

#### Summary

- Re-reviewed the five uploaded deck PDFs directly as primary evidence for what the decks actually claim.
- Extracted page text and rendered decision-critical slides into a dedicated workspace subfolder.
- Compared the direct slide wording against the prior audit.
- Added a primary-source reevaluation note to capture what changed.

#### Decisions / outcomes

- The earlier audit stands directionally.
- The actual slide wording makes the safety, compliance, ROI, PR, LCOE, NPV, and optimizer-preference claims more absolute than the earlier text extraction suggested.
- No electrical-envelope hard gate was closed by the uploaded decks.
- No architecture ranking is justified yet.

#### Learnings captured

- The deck set is better treated as advocacy material than as decision-grade engineering evidence.
- The slides do confirm the intended design direction toward higher granularity, but they do not prove the final architecture choice.
- The strongest newly confirmed issue is categorical language:
  - `safe`
  - `pass`
  - `strict, inherent compliance`
  - `only friction point`
  - `LCOE superiority`
  - `highly positive NPV`
  - `ideal`

#### Open threads carried forward

- Turn the strengthened unsupported claims into a vendor-data closure list
- Build the Lugano normative checklist matrix
- Create the first electrical-envelope worksheet
- Define shutdown, firefighter, maintenance-lockout, and residual-voltage states

### 2026-04-14 - Session 01

#### Summary

- Reviewed five BIPV / iWin presentation decks in detail.
- Verified core physics and architecture claims against public technical sources.
- Identified the main overstated or unsupported claims.
- Produced a detailed Lugano office-facade research prompt.
- Extended that prompt to force Swiss normative and legislative constraint mapping.

#### Decisions / outcomes

- Keep the project in pre-design mode; no procurement or compliance language.
- Use the Lugano office-building facade as the practical case:
  - 60 m2 per floor
  - 3-5 floors
  - 180-300 m2 total active area
- Require future research to separate:
  - legal requirements
  - recognized technical rules
  - fire guidance
  - permit process
  - incentive conditions

#### Learnings captured

- The project now needs less storytelling and more bounded calculations.
- Future work should focus on:
  - first-pass dimensioning
  - segmentation strategy
  - safety states
  - thermal mission profile
  - approval and evidence path

#### Open threads carried forward

- Create a Lugano-specific normative checklist matrix
- Build the first electrical-envelope worksheet
- Draft a vendor-data request list tied to blocking assumptions
- Create a practical architecture comparison matrix using the Lugano case

## Update Template

Copy this block when adding a new session:

```text
### YYYY-MM-DD - Session NN

#### Summary
- ...

#### Decisions / outcomes
- ...

#### Learnings captured
- ...

#### Open threads carried forward
- ...
```
