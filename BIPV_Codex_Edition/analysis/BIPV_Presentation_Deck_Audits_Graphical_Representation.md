# BIPV Presentation Deck Audits - Graphical Representation

These diagrams transform the narrative findings from:

- [BIPV_Presentation_Deck_Audit.md](./BIPV_Presentation_Deck_Audit.md)
- [BIPV_Presentation_Deck_Primary_Source_Reevaluation.md](./BIPV_Presentation_Deck_Primary_Source_Reevaluation.md)

Design intent:

- render reliably in Obsidian
- preserve the audit logic rather than decorate it
- separate what the decks do well from what remains blocked
- keep architecture ranking explicitly gated by missing electrical and safety inputs

## 1. Combined Audit Synthesis

```mermaid
flowchart TD

A0["Presentation Deck Set<br/>5 iWin / BIPV decks"]

A1["Audit 1<br/>Detailed engineering review"]
A2["Audit 2<br/>Primary-source reevaluation"]

P1["What survives<br/>directional framing is useful"]
P2["What gets stronger<br/>overstatement is clearer on rendered slides"]

S1["Valid engineering themes<br/>partial shading matters<br/>bypass topology matters<br/>thermal stress matters<br/>segmentation and shutdown matter"]
S2["Invalid closure behavior<br/>slides do not close compliance<br/>slides do not close economics<br/>slides do not close architecture selection"]

G1["Hard gates still open<br/>Voc,max<br/>Isc,max<br/>MPPT window<br/>disconnect boundary<br/>protection concept<br/>connector family<br/>cable class<br/>replacement boundary"]

R1["Decision status<br/>useful as framing only"]
R2["Not decision-grade for<br/>procurement<br/>compliance sign-off<br/>insurability claim<br/>architecture ranking"]

A0 --> A1
A0 --> A2

A1 --> P1
A2 --> P2

P1 --> S1
P2 --> S2

S1 --> G1
S2 --> G1

G1 --> R1
G1 --> R2

classDef root fill:#DBEAFE,stroke:#2563EB,color:#0F172A,stroke-width:2px;
classDef audit fill:#E0F2FE,stroke:#0284C7,color:#0F172A,stroke-width:2px;
classDef positive fill:#DCFCE7,stroke:#16A34A,color:#052E16,stroke-width:2px;
classDef negative fill:#FEE2E2,stroke:#DC2626,color:#450A0A,stroke-width:2px;
classDef gate fill:#FEF3C7,stroke:#D97706,color:#111827,stroke-width:2px;
classDef result fill:#EDE9FE,stroke:#7C3AED,color:#1F1147,stroke-width:2px;

class A0 root;
class A1,A2 audit;
class P1,S1 positive;
class P2,S2 negative;
class G1 gate;
class R1,R2 result;
```

## 2. Deck-by-Deck Verdict Map

```mermaid
flowchart LR

subgraph DECKS["Decks"]
D1["1. Shading Mitigation"]
D2["2. Granularity Paradigm"]
D3["3. Safety Architecture"]
D4["4. Active Envelope Engineering"]
D5["5. AC vs DC Comparison"]
end

subgraph SOLID["What is technically directionally solid"]
S1["Mismatch and partial-shading physics"]
S2["Need for finer electrical granularity"]
S3["Facade safety and shutdown are first-order"]
S4["Vertical BIPV is not rooftop PV"]
S5["Microinverter vs optimizer trade space is real"]
end

subgraph FAIL["What is overstated or unsupported"]
F1["Catastrophic shading ratios presented as generic laws"]
F2["Centralized MPPT failure presented too universally"]
F3["Safe / pass / fail safety labels without code closure"]
F4["PR LCOE NPV claims without model inputs"]
F5["Optimizer winner narrative without product data"]
end

subgraph BLOCK["What still blocks design-grade use"]
B1["Electrical envelope missing"]
B2["Shutdown and residual-voltage behavior missing"]
B3["Thermal derating and cavity mission profile missing"]
B4["Service and replacement boundary missing"]
B5["Economic assumptions missing"]
end

D1 --> S1
D1 --> F1
D1 --> B1

D2 --> S2
D2 --> F2
D2 --> B5

D3 --> S3
D3 --> F3
D3 --> B2

D4 --> S4
D4 --> F4
D4 --> B5

D5 --> S5
D5 --> F5
D5 --> B3
D5 --> B4

classDef deck fill:#DBEAFE,stroke:#2563EB,color:#0F172A,stroke-width:2px;
classDef solid fill:#DCFCE7,stroke:#16A34A,color:#052E16,stroke-width:2px;
classDef fail fill:#FEE2E2,stroke:#DC2626,color:#450A0A,stroke-width:2px;
classDef block fill:#FEF3C7,stroke:#D97706,color:#111827,stroke-width:2px;

class D1,D2,D3,D4,D5 deck;
class S1,S2,S3,S4,S5 solid;
class F1,F2,F3,F4,F5 fail;
class B1,B2,B3,B4,B5 block;
```

## 3. Cross-Deck Closure Dependency Map

```mermaid
flowchart LR

subgraph MISSING["Cross-Deck Missing Information"]
M1["Electrical envelope<br/>Voc Vmp Isc Imp<br/>temperature coefficients<br/>series and parallel grouping"]
M2["Bypass and granularity topology<br/>substring map<br/>converter level"]
M3["Shutdown and isolation boundary<br/>normal fault fire maintenance states"]
M4["Thermal mission profile<br/>cavity temperatures<br/>derating limits"]
M5["Moving electrical interfaces<br/>cables connectors feedthroughs flex life"]
M6["Serviceability boundary<br/>field replaceable unit<br/>access and downtime"]
M7["Diagnostics and controls<br/>telemetry alarms fail-safe logic"]
M8["Economics model inputs<br/>CapEx O&M failures tariff degradation"]
end

subgraph BLOCKED["Blocked Conclusions"]
C1["No architecture ranking"]
C2["No safe-voltage or arc-risk closure"]
C3["No firefighting or maintenance-state closure"]
C4["No thermal survivability conclusion"]
C5["No replacement-burden conclusion"]
C6["No PR LCOE NPV closure"]
C7["No procurement-ready recommendation"]
end

M1 --> C1
M1 --> C2

M2 --> C1

M3 --> C2
M3 --> C3

M4 --> C4
M4 --> C7

M5 --> C3
M5 --> C5
M5 --> C7

M6 --> C5
M6 --> C7

M7 --> C3
M7 --> C7

M8 --> C6
M8 --> C7

classDef miss fill:#F3F4F6,stroke:#6B7280,color:#111827,stroke-width:2px;
classDef blocked fill:#ECFCCB,stroke:#65A30D,color:#1A2E05,stroke-width:2px;

class M1,M2,M3,M4,M5,M6,M7,M8 miss;
class C1,C2,C3,C4,C5,C6,C7 blocked;
```

## 4. Primary-Source Escalation View

This diagram isolates what changed after direct slide review.

```mermaid
flowchart LR

R0["Primary-source slide review"]

R1["What changed"]
R2["What did not change"]

E1["More absolute wording is visible"]
E2["Safe insurable scalable claims are explicit"]
E3["Below 120 V and >2 mA claims are explicit"]
E4["PR ROI NPV superiority claims are explicit"]
E5["Optimizer ideal / microinverter weak framing is explicit"]

N1["No new standards clauses"]
N2["No new electrical-envelope data"]
N3["No new shutdown-state evidence"]
N4["No auditable economics basis"]
N5["No product-specific thermal derating proof"]

R3["Net effect<br/>earlier audit stands<br/>negative verdicts become stronger"]

R0 --> R1
R0 --> R2

R1 --> E1
R1 --> E2
R1 --> E3
R1 --> E4
R1 --> E5

R2 --> N1
R2 --> N2
R2 --> N3
R2 --> N4
R2 --> N5

E1 --> R3
E2 --> R3
E3 --> R3
E4 --> R3
E5 --> R3
N1 --> R3
N2 --> R3
N3 --> R3
N4 --> R3
N5 --> R3

classDef root fill:#DBEAFE,stroke:#2563EB,color:#0F172A,stroke-width:2px;
classDef stronger fill:#FEE2E2,stroke:#DC2626,color:#450A0A,stroke-width:2px;
classDef unchanged fill:#E0F2FE,stroke:#0284C7,color:#0F172A,stroke-width:2px;
classDef result fill:#EDE9FE,stroke:#7C3AED,color:#1F1147,stroke-width:2px;

class R0 root;
class E1,E2,E3,E4,E5 stronger;
class R1,R2,N1,N2,N3,N4,N5 unchanged;
class R3 result;
```

## 5. Color Legend

- Blue: source, deck, or neutral structural items
- Green: technically solid or blocked-output items
- Red: overstatement, unsupported claims, or stronger negative findings
- Amber: unresolved hard gates
- Gray: missing closure information
- Purple: final synthesis or decision-status nodes

## 6. Use Notes For Obsidian

- The overview and closure maps read best in a wide pane.
- The deck verdict map is easier to scan in reading mode than live preview.
- If Mermaid line breaks render poorly in your vault, replace `<br/>` with shorter node text rather than adding extra subgraphs.
