# PV Electrical Power Systems and DMPPT Source Map

Date: 2026-05-21  
NotebookLM notebook: `BIPV Electrical Architectures and MPPT` (`a8ea7cfa-be5d-4aa3-8467-f3abf3756f0e`)  
NotebookLM conversation used: `7013ccda-c544-4d31-928e-b3545133ff83`  
Deliverable type: technical source map with evidence index

## Executive Summary

The strongest source for detailed DMPPT topology taxonomy is **Weidong Xiao, _Photovoltaic power system -- modelling, design, and control_ (2017)**. Its Chapter 2 is the required starting point because it explicitly separates CMPPT from DMPPT and then breaks DMPPT down by MPPT granularity: string, module, submodule, and cell. It is also the source that gives the useful topology names for DC and AC DMPPT: MIPI, MIPC, MISC, MIDPP, MISI, subMISC, subIDPP, and subIPDPP.

For BIPV/iWin, use **Chivelet 2025** for BIPV electrical-design constraints under partial shading, **IEC 62548:2016** for array/PCE/DC conditioning architecture language, and **Photovoltaic Systems Technology 2024** for a current central/module/string/multi-string inverter and MPPT/reconfiguration overview. Use **Haeberlin 2012** as the practical engineering reference for solar-generator wiring, mismatch, central/string/module inverter layouts, and MPPT tracking efficiency.

Conclusion: the notebook sources support **DC-side DMPPT** and **AC-side DMPPT** as evidence-backed categories. They do **not** support **"hybrid DMPPT"** as a source-defined term. In these sources, "hybrid" usually means PV plus another generation source, HRES, hybrid control, or hybrid MPPT algorithms. My suggestion is to stop using "hybrid DMPPT" as a source-search term and define the project term explicitly if you mean mixed MLPE granularity, mixed DC/AC coupling, or PV plus another energy source.

## Objective

Identify the books and chapters in the NotebookLM notebook that describe electrical power systems for PV systems, PV power topologies, and DMPPT, with explicit attention to DC, AC, and hybrid terminology.

## Method

I used the `notebooklm` CLI against the provided notebook URL. The initial health check showed expired API reachability while local auth still appeared valid, so I ran the requested `reauth` skill. The reauth pass succeeded with all four gates OK: CLI, auth, API reachability, and status.

The evidence extraction used three layers:

1. NotebookLM source inventory for the 11 notebook sources.
2. NotebookLM Q&A for reading map and DMPPT topology extraction.
3. Local PDF text checks with `pdftotext` for the primary sources available under `PV_books`.

The sidecar files are:

- `source_inventory.csv`
- `evidence_index.csv`
- `action_log.md`

## Required Reading Order

### 1. Xiao 2017

Read first:

- Chapter 2, **Classification of Photovoltaic Power Systems**
- Chapter 5, **Power Conditioning**
- Chapter 8, **Maximum Power Point Tracking**
- Chapter 10, **Grid-connected Systems**

Chapter 2 is the main DMPPT chapter. Local text and NotebookLM both show sections for DMPPT at string level, module level, submodule level, and cell level. The chapter also contains the topology terms that matter for this task:

| Locator | Topology family | Domain | Granularity | Notes |
|---|---|---|---|---|
| 2.2 | CMPPT | DC/DC and/or DC/AC through central architecture | array | Baseline comparator; weak under mismatch/partial shading. |
| 2.3 | string-level DMPPT | DC/DC or DC/AC | string | Independent string-level MPPT; shared DC or AC link. |
| 2.4.1 | MIPI, module-integrated parallel inverter | DC/AC | module | Microinverter / AC-module family. |
| 2.4.2 | MIPC, module-integrated parallel converter | DC/DC | module | Module converter to common DC bus. |
| 2.4.3 | MISC, module-integrated series converter | DC/DC | module | Commercially corresponds to DC power optimizers in series strings. |
| 2.4.4 | MIDPP, module-integrated differential power processor | DC/DC | module | Processes mismatch power; wiring/fault complexity matters. |
| 2.4.5 | MISI, module-integrated series inverter | DC/AC | module | Series AC-output architecture; needs protection/coordination scrutiny. |
| 2.5.1 | subMISC | DC/DC | submodule | Promising granularity, but requires access to internal module/submodule wiring. |
| 2.5.2-2.5.3 | subIDPP / subIPDPP | DC/DC | submodule | DPP variants with wiring, communication, and isolation implications. |
| 2.6 | cell-level DMPPT | DC/DC | cell | Research-level granularity; likely too complex/costly for near-term iWin integration. |

This is the only source in the notebook that should be treated as the DMPPT taxonomy backbone.

### 2. IEC 62548:2016

Read next for architecture and compliance language:

- 5.1.2, **PV system architectures**
- 5.1.4, **Use of PCE with multiple DC inputs**
- 5.1.5, **Strings constructed using DC conditioning units**
- 5.1.6, **Series-parallel configuration**
- 7.3.13, **Power conversion equipment including DC conditioning units**

Local text corroborated PCE with multiple MPPT DC inputs and DC conditioning units connected to individual modules or groups of modules. This source does not choose an iWin topology; it defines architecture and safety vocabulary that a later decision matrix must respect.

### 3. Chivelet 2025 BIPV Technical Guidebook

Read for BIPV-specific electrical design:

- 2.2.4, **Electrical design of a BIPV system**
- Chapter 4/5 installation and BOS passages surfaced by local text search

This is the BIPV anchor. It ties non-uniform irradiance and partial shading to electrical design choices and explicitly surfaces central inverter, string/multi-string inverter, microinverter, and DC-DC optimizer options. It is directly relevant to iWin because facade shading and nonuniform operating conditions are first-order constraints.

### 4. Photovoltaic Systems Technology 2024

Read for a newer survey-level topology and MPPT overview:

- Chapter 1, section 1.4.3, **Solar Inverter**
- 1.4.3.1, **Central Inverter**
- 1.4.3.2, **Module Inverter**
- 1.4.3.3, **String Inverter**
- 1.4.3.4, **Multi String Inverter**
- Chapter 3, **Clustering of Panels and Shade Diffusion Techniques**
- Chapter 5, **Review of MPPT Techniques**

This source is useful for central/module/string/multi-string definitions, microinverters, PV reconfiguration, mismatch mitigation, and MPPT/GMPPT algorithms. Its hybrid chapters are about HRES and PV/PEM fuel-cell systems, not DMPPT topology.

## Useful Secondary Sources

**Haeberlin 2012, _Photovoltaics -- System Design and Practice_**

Use these sections:

- 4.3, **Interconnection of Solar Modules and Solar Generators**
- 4.4, **Solar Generator Power Loss Resulting from Partial Shading and Mismatch Loss**
- 4.5.3, **Electrical Integration of Solar Generators**
- 5.1.2.5, **Installations with MPPT charge controllers**
- 5.2.2, **Design Engineering and Operating Principles of PV System Inverters**
- 5.2.5, static/dynamic MPPT tracking efficiency material

This is a practical validation and loss-mechanism source, not the primary DMPPT taxonomy.

**Hebert 2020, _Maximum power point tracking -- background, implementation and classification_**

Use Chapter 4, **Maximum Power Point Tracking: A Review of the Considerations for Large Scale and Small Scale Photovoltaic Installations**. It is useful for scale-dependent MPPT/DMPPT considerations and for the distinction between topology-based approaches, DPP, DC-DC interfaces, and DC-AC interfaces.

**Khatib/Elmenreich 2016, _Modeling of photovoltaic systems using MATLAB_**

Use Chapter 3, **Modeling of PV System Power Electronic Features and Auxiliary Power Sources**, if a simulation model is needed. NotebookLM identified it as relevant for DC-DC converters, DC-AC inverters, and MPPT controllers. I did not locally verify this PDF during this pass.

**Mayfield 2010, _Photovoltaic Design & Installation For Dummies_**

Use only as a quick practical glossary:

- Chapter 8, **Keeping Current and Voltage in Check: Charge Controllers**
- Chapter 9, **Inverters: AC (From) DC**

Local text corroborated MPPT charge controllers, grid-direct inverter MPPT, multiple MPPT inputs, microinverters, string inverters, and central inverters. It is too basic for detailed DMPPT design.

## Skip Or Deprioritize

**Shi/Zhu 2023 BIPV Windows Review** is useful for optical/thermal/smart-window context but not for detailed electrical topology or DMPPT classification.

**GitHub NotebookLM prompt repository** is not a PV technical source and should be excluded.

**BIPV slide/source S01** may be useful as prior synthesis, but it is not a primary book/chapter source for evidence.

## DMPPT Framing For iWin

DC-side DMPPT means the MPPT granularity is distributed but the module/submodule/cell power is still conditioned on the DC side. In the notebook evidence this includes MIPC, MISC/power optimizer, subMISC, DPP variants, and IEC DC conditioning unit language.

AC-side DMPPT means the module-level or string-level distributed architecture converts to AC near the PV source. In the notebook evidence this includes MIPI/microinverter/AC module and the less common MISI series-AC family.

"Hybrid DMPPT" is not a confirmed source term in this notebook. The sources use hybrid for PV plus another generator, hybrid renewable energy systems, hybrid control loops, hybrid storage, and hybrid MPPT algorithms. If the project needs a hybrid DMPPT category, define it explicitly as one of:

- mixed granularity, such as string plus module or module plus submodule MPPT;
- mixed coupling, such as a DC optimizer layer feeding an AC inverter layer;
- mixed source system, such as PV plus wind/fuel cell/diesel/storage, which is HRES rather than DMPPT.

My personal suggestion: for iWin, use **DC DMPPT / AC DMPPT / HRES-hybrid** as separate labels. Avoid "hybrid DMPPT" until the exact electrical meaning is fixed, because it will pull in irrelevant HRES and algorithm literature.

## Open Gaps

The evidence currently identifies books, chapters, and topology families. It does not yet decide an architecture. Scoring should wait for iWin hard gates:

- `Voc,max`
- `Isc,max`
- `Pmp` per blind or segment
- MPPT voltage/current window
- safe shutdown and isolation state
- cable movement boundary
- thermal limits
- service/replacement boundary
- monitoring and fault-detection requirements
- price and availability evidence for candidate MLPE hardware

IEC 62548:2016 should not be treated as the sole current compliance authority until the applicable national adoption/current edition and adjacent PCE standards are checked.

## Conclusions

Use **Xiao 2017 Chapter 2** as the DMPPT topology spine.

Use **Chivelet 2025 Chapter 2.2.4** to translate PV topology choices into BIPV/facade constraints.

Use **IEC 62548:2016 sections 5.1.2-5.1.6** as the standards vocabulary for PV array architecture, PCE, multiple DC inputs, and DC conditioning units.

Use **Photovoltaic Systems Technology 2024 Chapter 1 plus Chapters 3 and 5** for a newer survey of inverter topologies, reconfiguration, and MPPT/GMPPT algorithms.

Do not treat "hybrid DMPPT" as evidence-backed terminology from this notebook. Define the project meaning before asking NotebookLM or Firecrawl for more sources.
