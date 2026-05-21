---
type: project
project: CONNECT-iWin
status: active
owner: Denys Kovalov
sponsor: Rubén Roldan Molinero
created: 2026-03-01
updated: 2026-05-21
tags: [BIPV, topology, iWin, TRS, power-electronics]
---

## Overview

Identify, evaluate, and select the optimal electrical connection architecture for the [[iWin SA]] venetian blind BIPV Active Window system. Output is a signed-off Technical Requirements Specification (TRS) covering voltage levels, protection schemes, connector standards, wiring topology, BMS integration, and monitoring architecture.

Project acronym: CONNECT-iWin. Confidential.

## Current Status

M3 phase — TRS drafting. Deadline: 31.05.2026.

> [!warning] 10 days to M3
> M1 (architecture shortlist) and M2 (MCDA evaluation dataset) are past. Final deliverable is the TRS document.

## Milestones

| ID | Deliverable | Deadline | Status |
|----|-------------|----------|--------|
| M1 | Architecture shortlist (3+ topologies, diagrams, operating ranges, benchmark refs) | 31.03.2026 | Done |
| M2 | Weighted MCDA evaluation dataset | 30.04.2026 | Done |
| M3 | TRS document | 31.05.2026 | Active |

## Architectures Evaluated

- String inverter (central)
- Microinverters (module-level)
- Power optimizers + central inverter
- DC bus per floor
- Hybrid AC/DC

## TRS Scope

Voltage levels, protection schemes, connector standards, wiring topology, BMS integration (KNX/Modbus/BACnet), monitoring architecture. Aligned with IEC/NEC standards.

## Key Risks

| Risk | Score | Status |
|------|-------|--------|
| R4 — CAPEX above market threshold | 9/25 | Monitor |
| R1 — HV DC safety in facade | 8/25 | Mitigate |
| R2 — Regulatory non-compliance | 6/25 | Mitigate |
| R5 — Distributed electronics reliability | 6/25 | Monitor |

## Stakeholders

- [[Denys Kovalov]] — project manager, technical expert
- [[Rubén Roldan Molinero]] — sponsor, technical support, iWin SA

## Key Resources

- Project charter: `iWin Electrical connection topology for BIPV.pdf`
- Research corpus: `BIPV_Codex_Edition/`, PV_books, [[NotebookLM]]
- Prior work: `GPT_project2080/`, `firecrawl_BIPV_prompts.md`
