# Reading Tracker — iWin-Type BIPV v2

## Rule

Do not track reading as “done / not done” only.

For each source, extract:
- scope and relevance
- numeric values
- clauses/pages used
- contradictions
- design decisions affected
- whether the source is **authoritative** or only **contextual**

---

## Evidence classes

- **Official public source**
- **Standards-backed**
- **Product-proximate technical evidence**
- **Contextual literature**
- **Vendor-data required**

---

## Working table

| ID | Source | Type | URL / DOI | Edition / revision / date | Why it matters | Pages / clauses used | Numerical values extracted | 3 key takeaways | Contradictions / caveats | Decision impacted | Evidence class | Status |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| R01 | iWin product page | Official public source | https://iwin.ch/product/ | Current public page | Locks public concept claim, thin-film clue, target applications |  |  |  |  | Section model, tech clue, target use-case | Official public source | Not started |
| R02 | SUPSI / ISAAC Innovative Envelope page | Official public source | https://www.isaac.supsi.ch/en/innovative-envelope-bipv | Current public page | Locks research context and iWin spin-off link |  |  |  |  | Research provenance, product lineage | Official public source | Not started |
| R03 | Solar RRL 2024 dynamic shading paper / ARIS abstract | Product-proximate technical evidence | https://aris.supsi.ch/entities/publication/ccbac461-bea4-4f82-a19d-b8eccefeda95 ; DOI 10.1002/solr.202400465 | 2024-12-01 | Best public clue on substring / bypass design effect |  | >20% seasonal gain; lower temperature; pilot notes |  |  | Substring topology, mismatch priority | Product-proximate technical evidence | Not started |
| R04 | IEA PVPS Task 15 BIPV Guidebook | Guidebook | https://iea-pvps.org/key-topics/book-building-integrated-photovoltaics-a-technical-guidebook/ | 2025 | Practical implementation frame |  |  |  |  | BIPV implementation, example framing | Standards-backed | Not started |
| R05 | IEC 63092-1 | Standard | https://webstore.iec.ch/en/publication/32158 | 2020 | BIPV module as building product |  |  |  |  | Module/system split | Standards-backed | Not started |
| R06 | IEC 63092-2 | Standard | https://webstore.iec.ch/en/publication/32329 | 2020 | BIPV system in building |  |  |  |  | Mounting/system obligations | Standards-backed | Not started |
| R07 | IEC 62548-1 | Standard | https://webstore.iec.ch/en/publication/110893 | 2023 + A1:2025 | Array design, DC wiring, protection, switching, earthing |  |  |  |  | Electrical envelope and BOS concept | Standards-backed | Not started |
| R08 | IEC 62446-1 | Standard | https://webstore.iec.ch/en/publication/63726 | 2016 + A1:2018 | Documentation, commissioning, inspection |  |  |  |  | Commissioning pack | Standards-backed | Not started |
| R09 | IEC 62446-2 | Standard | https://webstore.iec.ch/en/publication/27382 | 2020 | Preventive/corrective maintenance |  |  |  |  | O&M / service logic | Standards-backed | Not started |
| R10 | IEC TS 62446-3 | Technical specification | https://webstore.iec.ch/en/publication/28628 | 2017 | Outdoor thermography guidance |  |  |  |  | Thermal inspection strategy | Standards-backed | Not started |
| R11 | IEC 61730-1 | Standard | https://webstore.iec.ch/en/publication/59803 | 2023 | Module construction safety baseline |  | T98th threshold note if relevant |  |  | Safety baseline | Standards-backed | Not started |
| R12 | IEC 61730-2 | Standard | https://webstore.iec.ch/en/publication/63895 | 2023 | Module testing safety baseline |  |  |  |  | Safety test framing | Standards-backed | Not started |
| R13 | IEC 61215-1 | Standard | https://webstore.iec.ch/en/publication/68594 | 2021 | Module design qualification |  |  |  |  | Qualification basis | Standards-backed | Not started |
| R14 | IEC 61215-2 | Standard | https://webstore.iec.ch/en/publication/61350 | 2021 | Module design qualification tests |  |  |  |  | Qualification basis | Standards-backed | Not started |
| R15 | IEC TS 63126 | Technical specification | https://webstore.iec.ch/en/publication/78554 | 2025 | Higher-temperature deployment testing |  | 70°C / T98th trigger logic if extracted |  |  | Thermal qualification trigger | Standards-backed | Not started |
| R16 | IEC 62109-3 | Standard | https://webstore.iec.ch/en/publication/27684 | 2020 | Integrated electronics with PV elements |  |  |  |  | MLPE / frame electronics concept | Standards-backed | Not started |
| R17 | IEC 62790 | Standard | https://webstore.iec.ch/en/publication/32347 | 2020 | Junction/feedthrough box safety |  |  |  |  | Feedthrough and interface design | Standards-backed | Not started |
| R18 | IEC 62852 | Standard | https://webstore.iec.ch/en/publication/66763 | 2014 + A1:2020 | DC connector suitability |  | 1500 Vdc; 125 A per contact |  |  | Connector selection rule | Standards-backed | Not started |
| R19 | IEC 62930 | Standard | https://webstore.iec.ch/en/publication/28067 | 2017 | PV DC cable suitability |  | 1.5 kVdc rating note |  |  | Cable selection rule | Standards-backed | Not started |
| R20 | IEC 61853-1 | Standard | https://webstore.iec.ch/en/publication/6035 | 2011 | Power versus irradiance and temperature characterization |  |  |  |  | Model parameter basis | Standards-backed | Not started |
| R21 | IEC 61853-2 | Standard | https://webstore.iec.ch/en/publication/25811 | 2016 | Incidence-angle, operating temperature, spectral response |  |  |  |  | Vertical/slat energy modeling | Standards-backed | Not started |

---

## Fast extraction prompts for each source

For every source, answer these before moving on:
1. What exact decision does this source help close?
2. What numerical values or limits does it provide?
3. What does it **not** prove?
4. What vendor data still remains missing after reading it?
5. Which line in the capstone memo should cite this source?

---

## Decision log

| Date | Decision | Basis source IDs | Confidence | What could overturn it? | Owner |
|---|---|---|---|---|---|
|  |  |  |  |  |  |

---

## Contradiction log

Use this table when two sources push different conclusions.

| ID | Source A | Source B | Conflict | Which source is more authoritative here? | Action needed |
|---|---|---|---|---|---|
| C01 |  |  |  |  |  |

---

## Closure rule

A source is only “closed” when:
- the relevant pages/clauses are recorded,
- at least one decision or calculation is tied to it,
- the unresolved caveats are captured,
- and any extracted number is copied into the memo or standards matrix.
