# Research Prompt - Lugano iWin Office Facade - Diagrams

These Mermaid diagrams are derived from:

- [Research_Prompt_Lugano_iWin_Office_Facade.md](/C:/Users/Denys/Documents/Codex/BIPV_Codex_Edition/analysis/Research_Prompt_Lugano_iWin_Office_Facade.md)
- [BIPV_Presentation_Deck_Audit.md](/C:/Users/Denys/Documents/Codex/BIPV_Codex_Edition/analysis/BIPV_Presentation_Deck_Audit.md)

Design goals for Obsidian:

- conservative Mermaid syntax
- no nested styling tricks or unsupported icons
- short node labels with line breaks for readability
- explicit `classDef` colors instead of theme-dependent defaults
- one overview diagram plus one closure diagram

## 1. Research Structure Overview

```mermaid
flowchart LR

P["Lugano iWin Office-Facade Research Prompt"]
T["Evidence taxonomy<br/>Verified fact | Standards framing | Public clue | Engineering inference | Vendor data required"]
R["Hard gates<br/>No hidden assumptions<br/>No architecture ranking before envelope<br/>No compliance or procurement claim from concept data"]

subgraph CASE["Case Definition"]
C1["Site and scale<br/>Lugano<br/>3-5 floors<br/>60 m² per floor"]
C2["System under study<br/>iWin PV venetian blinds"]
C3["Candidate segmentation<br/>Each floor is a possible electrical boundary"]
end

subgraph STREAMS["Research Workstreams"]
W0["Part 0<br/>Swiss legal and normative map"]
W1["Part A<br/>Claim re-evaluation"]
W2["Part B<br/>Practical dimensioning"]
W3["Part C<br/>Architecture comparison"]
W4["Part D<br/>Safety architecture"]
W5["Part E<br/>Thermal and reliability"]
end

subgraph GAPS["Blocking Unknowns"]
G1["Electrical envelope<br/>Voc Vmp Isc Imp<br/>temperature coefficients<br/>series and parallel grouping"]
G2["Facade geometry<br/>azimuth bays cavity depth<br/>unit count and layout"]
G3["Control and motion states<br/>angle range schedules<br/>sensor logic fail-safe"]
G4["Thermal mission profile<br/>summer cavity temperature<br/>winter Tmin<br/>electronics location"]
G5["Safety and service boundary<br/>shutdown residual voltage<br/>replacement level<br/>access zones"]
G6["Economics boundary<br/>CapEx O&M failures<br/>tariffs discount rate"]
end

subgraph OUT["Required Outputs"]
O1["Claim re-evaluation matrix"]
O2["Assumptions register"]
O3["Normative constraints matrix"]
O4["Electrical-envelope table"]
O5["Architecture comparison matrix"]
O6["Safety state table"]
O7["Thermal and reliability findings"]
O8["Vendor-data closure table"]
end

P --> T
P --> R
P --> C1
P --> C2
P --> C3

T --> W0
T --> W1
T --> W2
T --> W3
T --> W4
T --> W5

R --> W2
R --> W3
R --> W4

C1 --> W0
C1 --> W2
C2 --> W1
C2 --> W2
C3 --> W3
C3 --> W4

G1 -- blocks --> W2
G1 -- blocks --> W3
G1 -- blocks --> W4
G2 -- limits --> W2
G2 -- limits --> W5
G3 -- drives --> W2
G3 -- drives --> W4
G3 -- drives --> W5
G4 -- limits --> W3
G4 -- limits --> W5
G5 -- blocks --> W3
G5 -- blocks --> W4
G6 -- limits --> W3

W0 --> O3
W1 --> O1
W2 --> O2
W2 --> O4
W3 --> O5
W4 --> O6
W5 --> O7

G1 --> O8
G2 --> O8
G3 --> O8
G4 --> O8
G5 --> O8
G6 --> O8

classDef prompt fill:#DBEAFE,stroke:#2563EB,color:#0F172A,stroke-width:2px;
classDef rule fill:#FEF3C7,stroke:#D97706,color:#111827,stroke-width:2px;
classDef input fill:#E0F2FE,stroke:#0284C7,color:#0F172A,stroke-width:2px;
classDef stream0 fill:#DBEAFE,stroke:#1D4ED8,color:#0F172A,stroke-width:2px;
classDef stream1 fill:#FFEDD5,stroke:#EA580C,color:#111827,stroke-width:2px;
classDef stream2 fill:#DCFCE7,stroke:#16A34A,color:#052E16,stroke-width:2px;
classDef stream3 fill:#EDE9FE,stroke:#7C3AED,color:#1F1147,stroke-width:2px;
classDef stream4 fill:#FEE2E2,stroke:#DC2626,color:#450A0A,stroke-width:2px;
classDef stream5 fill:#FCE7F3,stroke:#DB2777,color:#500724,stroke-width:2px;
classDef gap fill:#F3F4F6,stroke:#6B7280,color:#111827,stroke-width:2px;
classDef out fill:#ECFCCB,stroke:#65A30D,color:#1A2E05,stroke-width:2px;

class P prompt;
class T,R rule;
class C1,C2,C3 input;
class W0 stream0;
class W1 stream1;
class W2 stream2;
class W3 stream3;
class W4 stream4;
class W5 stream5;
class G1,G2,G3,G4,G5,G6 gap;
class O1,O2,O3,O4,O5,O6,O7,O8 out;
```

## 2. Missing-Information Closure Map

```mermaid
flowchart LR

M0["Missing Information Register"]

subgraph PROD["Vendor and Product Data"]
P0["Product data cluster"]
P1["Per-louver electrical datasheet"]
P2["Bypass and substring map"]
P3["MLPE derating and enclosure data"]
P4["Cable connector feedthrough flex-life data"]
P5["Replacement boundary and service drawing"]
end

subgraph SITE["Building and Site Data"]
S0["Site data cluster"]
S1["Facade azimuth geometry and bay layout"]
S2["Single-skin or double-skin and cavity ventilation"]
S3["Real shading context<br/>adjacent buildings fins overhangs"]
S4["Retrofit or new-build<br/>permit and fire-context class"]
end

subgraph CTRL["Control and Safety Data"]
C0["Controls data cluster"]
C1["Louver angle states and schedule"]
C2["Shutdown and isolation logic"]
C3["Accessible zones and intervention roles"]
C4["Grid interface earthing and protection concept"]
end

subgraph ECON["Economic Boundary Data"]
E0["Economics data cluster"]
E1["CapEx by architecture"]
E2["O&M and replacement intervals"]
E3["Tariffs self-consumption export value"]
E4["Discount rate lifetime degradation"]
end

subgraph BLOCKED["Blocked Decisions"]
D1["Credible installed kWp range"]
D2["Voc,max and Isc,max checks"]
D3["Architecture ranking"]
D4["Thermal-risk statement"]
D5["Safety state table"]
D6["PR LCOE NPV claims"]
end

M0 --> P0
M0 --> S0
M0 --> C0
M0 --> E0

P0 --> P1
P0 --> P2
P0 --> P3
P0 --> P4
P0 --> P5

S0 --> S1
S0 --> S2
S0 --> S3
S0 --> S4

C0 --> C1
C0 --> C2
C0 --> C3
C0 --> C4

E0 --> E1
E0 --> E2
E0 --> E3
E0 --> E4

P1 --> D1
P1 --> D2
P2 --> D2
P3 --> D3
P3 --> D4
P4 --> D3
P5 --> D3
P5 --> D5

S1 --> D1
S1 --> D3
S2 --> D4
S3 --> D1
S3 --> D3
S4 --> D5

C1 --> D3
C1 --> D4
C2 --> D5
C3 --> D5
C4 --> D3

E1 --> D6
E2 --> D6
E3 --> D6
E4 --> D6

classDef root fill:#DBEAFE,stroke:#2563EB,color:#0F172A,stroke-width:2px;
classDef prod fill:#EDE9FE,stroke:#7C3AED,color:#1F1147,stroke-width:2px;
classDef site fill:#E0F2FE,stroke:#0284C7,color:#0F172A,stroke-width:2px;
classDef ctrl fill:#FEE2E2,stroke:#DC2626,color:#450A0A,stroke-width:2px;
classDef econ fill:#FEF3C7,stroke:#D97706,color:#111827,stroke-width:2px;
classDef blocked fill:#ECFCCB,stroke:#65A30D,color:#1A2E05,stroke-width:2px;

class M0 root;
class P0,P1,P2,P3,P4,P5 prod;
class S0,S1,S2,S3,S4 site;
class C0,C1,C2,C3,C4 ctrl;
class E0,E1,E2,E3,E4 econ;
class D1,D2,D3,D4,D5,D6 blocked;
```

## 3. Color Legend

- Blue: prompt structure, case inputs, and site/context framing
- Amber: rules and economics
- Green: outputs or blocked decision items
- Purple: product or architecture-related data
- Red: safety and control boundaries
- Gray: unresolved gaps

## 4. Obsidian Notes

- `TD` works better for the overview in a portrait note pane.
- `LR` works better for the closure map in a wider pane.
- If node text wraps too aggressively in your theme, shorten labels first rather than adding more subgraphs.
- If your local Obsidian Mermaid version renders HTML line breaks inconsistently, replace `<br/>` with plain spaces and shorter labels.
