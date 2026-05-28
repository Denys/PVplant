# iWin H2-PDO Parallel DCO Evaluation

Date: 2026-05-28  
Method: Firecrawl search-first, targeted scrape of high-value sources.  
Decision question: replace the earlier H2 "zonal DC optimizer" concept with **PDO: parallel-output DCO**, then estimate suitable common DC bus voltage and DCO grouping.

## Executive Summary

H2 should be renamed from zonal DCO to **H2-PDO: per-blind or per-segment parallel-output DCO into a protected common DC node**. The corrected topology is:

```text
PV blind module
-> per-blind buck/boost MPPT DCO with reverse-current blocking and current limiting
-> parallel common DC node
-> zone combiner / protection / disconnect
-> shared DC/DC, battery inverter, or grid inverter interface
```

This is not the same class as Tigo TS4-A-O, SolarEdge, or Huawei MERC string optimizers. Those are normally series-string MLPE. PDO requires a DCO that can regulate or current-feed into a common bus while preserving independent MPPT.

Best current voltage candidate for a practical iWin prototype is **48 V nominal LVDC**, meaning an operating bus around **54-58 V** for a 48 V battery-like system. The practical common node should be **3-4 DCO per node** for 330-500 W blinds, or **2 DCO per node** for 720 W high-power blinds. More than that pushes the node into 50-80 A wiring and protection unless the bus voltage is raised.

For a building/floor architecture, **~380 V DC** is electrically cleaner but not product-easy: current falls sharply, but I did not find a current off-the-shelf blind-scale certified PDO device for 45 V / 300-600 W PV inputs feeding a high-voltage parallel DC bus. Evidence exists at utility/string scale and in research prototypes, not as a small BIPV MLPE product.

## H2-PDO Definition

Use this naming:

```text
H2-PDO: Parallel DCO node architecture
PV blind module -> independent MPPT DCO -> common parallel DC bus node -> shared downstream converter/inverter
```

Required DCO behavior:

- MPPT on each blind input.
- Buck-boost capability if the blind `Vmp` may be below or above the common bus.
- Reverse-current blocking from the bus into a shaded/faulted blind.
- Output current limiting.
- Fault isolation per DCO branch.
- A defined bus-control method: voltage regulation, current-source mode, droop, or supervised charge-control.
- Serviceable fixed-frame/headbox placement, not slat-level electronics.

## Firecrawl Evidence

| Source | Type | Evidence | Relevance to PDO | Limitation |
| --- | --- | --- | --- | --- |
| [eIQ Energy Parallux / vBoost article](https://eepower.com/news/eiq-energy-launches-parallel-solar-technology-for-solar-arrays/) | technical news / historic product clue | Describes solar panels connected in parallel to a constant high-voltage DC bus through vBoost DC/DC modules with distributed MPPT and bus monitoring. | Direct conceptual match to PDO. | Old non-official article; no current procurement/certification path found. Treat as concept evidence, not supplier evidence. |
| [ScienceDirect 2026 parallel SPO paper](https://www.sciencedirect.com/science/article/pii/S2352484726002015) | paper | Describes high-boost DC/DC converter structures for parallel solar power optimizer operation, high-voltage DC bus, MPPT, and two 100 W lab prototypes with voltage gains of 6 and 8 at 50% duty. | Confirms PDO is an active research topology. | Laboratory scale; not a certified product. |
| [Ampt string optimizers](https://www.ampt.com/products/string-optimizers/) | manufacturer | Two-input string optimizers with MPPT per input, output to inverter, V-match to DC bus, fixed/high DC bus behavior, 600-1500 V system voltage. | Commercial evidence for parallel-bus DCO behavior at string scale. | Too large/high-voltage for per-blind modules. Useful as architecture proof, not blind hardware. |
| [Alencon SPOT DC-DC optimizers](https://alenconsystems.com/dc-dc-optimizers/) | manufacturer | Up to four MPPT inputs, galvanic isolation between PV string and DC bus, customizable output voltage, placement between PV strings and combiner or post-combiner. | Commercial multi-input DC bus optimizer evidence. | Utility/commercial string scale, not 300-600 W blind scale. |
| [Victron VE.Smart synchronized charging](https://www.victronenergy.com/media/pg/VE.Smart_Networking/en/synchronised-charging---further-details.html) | manufacturer manual | Multiple SmartSolar charge controllers can charge the same battery as if one large charger; each regulates its own output current. | Proves multiple MPPT converters can operate in parallel on a common low-voltage battery bus. | Battery charging architecture, not PV-grid MLPE; no network-wide current limit. |
| [Victron VE.Smart limits](https://www.victronenergy.com/media/pg/VE.Smart_Networking/en/limitations.html) | manufacturer manual | VE.Smart network maximum is 10 devices; designed for small systems without a GX controller. | Upper bound for small synchronized MPPT-controller node if using this ecosystem. | Not a BIPV product architecture. Current and protection will limit iWin before the 10-device network limit. |
| [Victron MPPT 150/35 specs](https://www.victronenergy.com/media/pg/Manual_BlueSolar_150-35__150-45/en/technical-specifications.html) | manufacturer manual | 12/24/36/48 V battery, 35 A output, 2000 W nominal PV power at 48 V, max PV Voc 150 V, PV voltage must exceed battery by 5 V to start and by 1 V thereafter. | Good 48 V bus MPPT-controller evidence. | Buck-only behavior means a 45 V iWin module cannot reliably charge a 48 V bus. |
| [Sunforge/Genasun GVB-8](https://sunforgellc.com/product/gvb-8/) and [GVB-8 manual](https://sunforgellc.com/wp-content/uploads/2022/04/GVB-8_Manual-rev.4.1-2021-2022_AP.pdf) | manufacturer / manual | Boost MPPT controller for low-voltage PV into 24/36/48 V batteries; 0-60 V input, 48 V model max recommended panel power 350 W, recommended max Vmp 43 V, recommended max Voc STC 50 V, input Isc 8 A. | Closest small commercial boost-PDO part found. | Underpowered for 480-720 W blinds and marginal/conflicting for a 45 Vmp, 55-60 Voc iWin module. |
| [Infineon power optimizer solutions](https://www.infineon.com/application/power-optimizer-solutions) | component / reference design | Power optimizer components and reference designs including 400 W buck-boost up to 60 V/15 A and 600 W buck up to 80 V/18 A. | Supports custom PDO DCO design route. | Components/reference designs, not certified finished DCO devices. |
| [TI TIDA-010949](https://www.ti.com/lit/pdf/tiduf99) | reference design | 600 W optimizer reference with 15-80 V input, 18 A, buck or buck-boost behavior, PLC/wireless options. | Strong custom-design benchmark for a per-blind DCO. | Not productized/certified; enclosure, thermal, safety, and BOM closure required. |

## Common DC Bus Voltage Evaluation

Input assumptions:

- Blind module power envelope: 180-720 W.
- Working target range from prior topology work: 330-500 W per blind module.
- High-power case: 720 W should already be treated as split or special case.
- Existing TS4-oriented module target was about 45 Vmp. PDO may push that target lower if using 48 V boost controllers.

### Per-Blind Current At Candidate Bus Voltages

| Blind Pmp | 48 V bus | 60 V bus | 120 V bus | 380 V bus |
| ---: | ---: | ---: | ---: | ---: |
| 180 W | 3.75 A | 3.00 A | 1.50 A | 0.47 A |
| 270 W | 5.62 A | 4.50 A | 2.25 A | 0.71 A |
| 330 W | 6.88 A | 5.50 A | 2.75 A | 0.87 A |
| 412.5 W | 8.59 A | 6.88 A | 3.44 A | 1.09 A |
| 480 W | 10.00 A | 8.00 A | 4.00 A | 1.26 A |
| 500 W | 10.42 A | 8.33 A | 4.17 A | 1.32 A |
| 600 W | 12.50 A | 10.00 A | 5.00 A | 1.58 A |
| 720 W | 15.00 A | 12.00 A | 6.00 A | 1.89 A |

### Node Size Formula

```text
Nnode <= floor(I_node_limit * V_bus / P_blind_design)
```

This only checks current. Final node count also needs voltage drop, conductor temperature, connector rating, fuse/breaker selectivity, fault current, and service-boundary requirements.

### Node Count At 500 W/Blind

| Bus | 16 A node | 32 A node | 40 A node | 63 A node |
| ---: | ---: | ---: | ---: | ---: |
| 48 V | 1 | 3 | 3 | 6 |
| 60 V | 1 | 3 | 4 | 7 |
| 120 V | 3 | 7 | 9 | 15 |
| 380 V | 12 | 24 | 30 | 47 |

### Node Count At 720 W/Blind

| Bus | 16 A node | 32 A node | 40 A node | 63 A node |
| ---: | ---: | ---: | ---: | ---: |
| 48 V | 1 | 2 | 2 | 4 |
| 60 V | 1 | 2 | 3 | 5 |
| 120 V | 2 | 5 | 6 | 10 |
| 380 V | 8 | 16 | 21 | 33 |

## Recommended PDO Voltage

### Prototype / near-term evidence-backed bus

Use:

```text
48 V nominal bus
operating range roughly 48-58 V depending battery/DC-link definition
common node: 3-4 DCO for 330-500 W blinds
high-power 720 W blind: 2 DCO per node unless split electrically
```

Why: 48 V is the only small-system bus class with real commercial MPPT controller evidence from Victron and Genasun. It keeps the moving/facade electrical interface in a lower-voltage class than 120-380 V DC and gives a plausible test path.

Blocking issue: with a 45 Vmp iWin module, ordinary buck MPPT controllers cannot charge a 48 V bus. PDO needs a boost or buck-boost DCO. The Genasun GVB-8 proves the boost-controller pattern, but it is too small for 480-720 W blinds and marginal for 45 Vmp / 55-60 Voc modules.

If PDO becomes a serious candidate, adjust iWin's electrical target for this branch:

```text
PDO-48 branch target:
Vmp,module: 30-40 V preferred
Voc,cold: below selected DCO absolute input limit, likely <50-60 V for small boost controllers
Pmp/module: <=350 W if using GVB-like commercial boost controllers
Pmp/module: 330-600 W only if custom buck-boost DCO is accepted
```

This conflicts with the TS4-A-O-friendly 42-48 Vmp / 330-500 W target. The same blind electrical design may not be optimal for both H4-series-optimizer and H2-PDO.

### Intermediate bus

Use 120 V DC only as a custom-engineering branch:

```text
120 V bus
common node: 6-8 DCO for 330-500 W blinds at ~25-35 A
```

Why: much lower current than 48 V, still far below 380 V.  
Limitation: I did not find a small certified 300-600 W PV PDO product that outputs to a 120 V common DC bus. Safety, connectors, disconnects, arc behavior, and downstream inverter interface are less product-ready than 48 V battery-bus equipment.

### Building/floor bus

Use 350-400 V DC only as a later custom or string-scale branch:

```text
380 V bus
common node: 8-12 DCO at 720 W/blind or 12-24 DCO at 500 W/blind depending current limit
```

Why: current becomes attractive and cable losses drop. Ampt/eIQ/Alencon evidence supports the general high-voltage DC-bus idea.  
Limitation: no blind-scale certified parallel DCO was found. This is not a short component-selection path.

## What-If Branches

### Omega: custom buck-boost PDO works

If iWin accepts a custom fixed-frame DCO, then H2-PDO becomes technically strong. Use a 48 V nominal prototype bus first, then evaluate 120 V or 380 V after safety and converter qualification. The strongest design target is one MPPT DCO per blind module, 3-4 blinds per 48 V node, protected node combiners by facade bay.

### Alpha: commercial-only path

If iWin needs off-the-shelf commercial electronics now, PDO is weaker than H4/A4. Genasun-like boost MPPTs are too low-power and battery-oriented; Victron-like MPPTs require PV voltage above the battery bus; Ampt/Alencon are string-scale. The practical commercial path stays with series optimizers or microinverters.

### Delta: common bus chosen too high or node too large

If the common DC node is raised to 120-380 V or loaded with too many DCO without certified hardware, the architecture loses the original service/safety advantage and becomes a custom power-electronics product. Expected failures: difficult fault isolation, DC arc/disconnect burden, unclear rapid-shutdown behavior, and no supplier warranty boundary.

## Product Suitability Read

| Candidate | Suitable for H2-PDO? | Why |
| --- | --- | --- |
| Genasun/Sunforge GVB-8 boost MPPT | Limited prototype only | True boost MPPT to 48 V battery-like bus, but 350 W / 8 A class and input limits are tight for iWin. |
| Victron SmartSolar MPPT | Limited prototype only | Multiple MPPT controllers can share a battery bus, but buck requirement conflicts with 45 Vmp-to-48 V bus. |
| TI TIDA-010949 / Infineon optimizer references | Good custom-design evidence | Voltage/current/power classes are close to iWin, but certification/productization remains open. |
| Ampt string optimizer | Architecture benchmark only | Commercial high-voltage DC-bus optimizer, but string-scale 600-1500 V product. |
| Alencon SPOT | Architecture benchmark only | Multi-input isolated MPPT to customizable DC bus, but utility/commercial scale. |
| eIQ Parallux/vBoost | Historic concept only | Direct PDO concept, but no current product path found. |
| Tigo TS4-A-O / SolarEdge / Huawei MERC | No, not PDO | Series-string optimizer architecture, useful for H4/A4 instead. |

## Decision Update

Rename old H2:

```text
Old H2: per-zone DC/DC MPPT + floor-level multi-MPPT inverter
New H2-PDO: per-blind parallel-output DCO + protected common DC node + shared downstream converter/inverter
```

Preliminary H2-PDO rule:

```text
Do not merge raw blind PV before MPPT.
Merge only DCO outputs.
Common node size should be current/protection limited, not shading limited.
For 48 V nominal bus, start with 3-4 blind DCO per node at 330-500 W/blind.
For 720 W/blind, use 2 DCO per node or split the blind electrically.
```

## Missing Data Before Ranking H2-PDO

- Whether iWin can target a PDO-specific module voltage, e.g. 30-40 Vmp instead of TS4-friendly 42-48 Vmp.
- Blind `Voc,cold`, `Vmp`, `Isc`, `Imp`, and `Pmp` under slat-angle and shade cases.
- Whether a battery/DC-link exists or the bus must feed a grid inverter directly.
- Allowed common bus voltage across the moving/facade boundary.
- Required isolation: non-isolated DCO, isolated DCO, or isolation downstream.
- Per-node service boundary and maximum acceptable node current.
- Rapid-shutdown behavior for a parallel DC bus.
- DCO thermal envelope in the fixed headbox.
- Reverse-current and fault-current protection concept.

## Next Firecrawl Searches

1. `certified PV module level buck boost MPPT DC DC 48V output 500W`
2. `parallel solar optimizer high voltage DC bus product module level`
3. `PV DC optimizer current source common DC bus datasheet`
4. `48V building DC microgrid PV MPPT optimizer module level`
5. `IEC 62109-3 PV module integrated DC DC converter parallel output`
6. `BIPV facade low voltage DC bus MPPT converter product`
