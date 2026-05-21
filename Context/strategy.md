---
type: context
project: CONNECT-iWin
status: active
tags: [strategy, BIPV, topology, iWin]
updated: 2026-05-21
---

## Persistent Goal

Define the optimal electrical connection topology for the [[iWin]] venetian blind BIPV Active Window system, culminating in a signed-off Technical Requirements Specification (TRS).

This vault is the working environment for [[CONNECT-iWin]] — research, analysis, modeling, and documentation all live here.

## Project: CONNECT-iWin

**Sponsor**: Rubén Roldan Molinero ([[iWin SA]], Via Cantonale 18, Manno CH)
**Deadline**: 31.05.2026

### Milestones

| ID | Deliverable | Deadline | Status |
|----|-------------|----------|--------|
| M1 | Architecture shortlist: min. 3 topologies with diagrams, operating ranges, benchmark refs | 31.03.2026 | Past |
| M2 | Weighted MCDA evaluation dataset validated | 30.04.2026 | Past |
| M3 | TRS: voltage levels, protection schemes, connector standards, wiring topology, BMS integration, monitoring architecture | 31.05.2026 | Active |

### Architectures Under Evaluation

- String inverter (central)
- Microinverters (module-level)
- Power optimizers + central inverter
- DC bus per floor
- Hybrid AC/DC system

### Scope

Included: SOTA review of BIPV electrical architectures, technical benchmarking, regulatory mapping (IEC/NEC/local codes), preliminary electrical modeling and loss estimation, thermal and safety analysis, economic comparison, final recommendation.

Excluded: detailed product engineering, certification processes, pilot manufacturing, structural facade engineering.

### Top Risks

| Risk | Score | Mitigation |
|------|-------|------------|
| R4 - CAPEX above market threshold | 9/25 | Cost modeling, design-to-cost, modular architecture |
| R1 - HV DC safety in facade | 8/25 | Voltage limiting, MLPE, arc-fault detection, IEC/NEC compliance |
| R2 - Regulatory non-compliance | 6/25 | Early certification body engagement, design-to-standard |
| R5 - Distributed electronics reliability (T, RH) | 6/25 | Environmental stress testing, IP-rated enclosures |

## Research Stack

| Resource | Role |
|----------|------|
| PV_books | Primary literature: PV system design, BIPV, power electronics references |
| claude_literature | AI-assisted literature synthesis and technical analysis |
| [[NotebookLM]] | Source ingestion, cross-document Q&A, synthesis across research corpus |
| Presentations | Output layer: stakeholder-facing deliverables, milestone reviews |

> [!important] Current focus
> M3 closes 31.05.2026. Priority is completing the TRS document based on M1 + M2 outputs.
