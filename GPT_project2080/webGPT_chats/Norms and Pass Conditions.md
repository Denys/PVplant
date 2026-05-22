me:
describe what each norm is responsible for and what are the pass conditions:
EC 63092-1 / -2
IEC 62548-1
IEC 62446-1 / -2 / TS 62446-3
IEC 62109-3
IEC 62790
IEC 62852
IEC 62930
IEC 61730-1 / -2
IEC 61215-1 / -2
IEC 61853-1 / -2
IEC TS 63126


---

answ:
## Assumption

You wrote **“EC 63092”**; I am treating that as **IEC 63092-1 / -2**.

Also, “pass condition” is **not uniform** across this list:

- some are **design / documentation / inspection** standards;
    
- some are **product / component safety or qualification** standards;
    
- some are **performance-characterization** standards.
    

IEC publishes the standards, but conformity certificates are normally issued by independent certification bodies, not by IEC itself. ([Iteh Standards](https://cdn.standards.iteh.ai/samples/22683/4de66fa53f2c4b8591ebe1672331acb4/IEC-TS-62446-3-2017.pdf "https://cdn.standards.iteh.ai/samples/22683/4de66fa53f2c4b8591ebe1672331acb4/IEC-TS-62446-3-2017.pdf"))

## The useful split

### 1) Building-integration standards

These tell you what a **BIPV module/system must be as a building product/system**.

### 2) Electrical design / commissioning / O&M standards

These tell you how the **array must be designed, commissioned, documented, maintained, and inspected**.

### 3) Product/component qualification standards

These tell you whether the **module / electronics / junction box / connector / cable** has passed the required safety or durability test program.

### 4) Performance characterization standards

These do **not** prove durability or safety. They generate the **power / temperature / angle / spectral data** you need for modeling and rating. ([IEC Webstore](https://webstore.iec.ch/en/publication/6035 "IEC 61853-1:2011 | IEC"))

---

# Standard-by-standard

## IEC 63092-1 — BIPV module requirements

**Responsible for:**  
BIPV **modules used as building products**. It focuses on module properties relevant to **basic building requirements** plus applicable electrotechnical requirements, and it covers the module in its intended mounting/application category, **not** the mounting structure itself. Public summaries tie this to building-relevant properties such as mechanical resistance, fire safety, hygiene/health, usability, noise protection, energy performance, and sustainable resource use. ([IEC Webstore](https://webstore.iec.ch/en/publication/32158 "IEC 63092-1:2020 | IEC"))

**What “pass” means:**  
This is **not** the same as a standalone IEC 61215/61730 lab endurance certificate. In practice, a BIPV module “passes” IEC 63092-1 when it can be shown to satisfy the **building-product obligations** and the referenced electrotechnical obligations for the intended application. The standard itself explicitly normatively pulls in module qualification and safety standards such as **IEC 61215**, **IEC 61730**, and also references **IEC TS 63126** where high-temperature deployment is relevant. ([Iteh Standards](https://cdn.standards.iteh.ai/samples/23167/5a770cce22b24a4189f93a9a19346c39/IEC-63092-1-2020.pdf "https://cdn.standards.iteh.ai/samples/23167/5a770cce22b24a4189f93a9a19346c39/IEC-63092-1-2020.pdf"))

## IEC 63092-2 — BIPV system requirements

**Responsible for:**  
BIPV **systems** integrated into buildings, including the **mounting structure** and system-level building/electrotechnical requirements. It is the system complement to 63092-1, which remains module-focused. ([IEC Webstore](https://webstore.iec.ch/en/publication/32329 "IEC 63092-2:2020 | IEC"))

**What “pass” means:**  
Again, this is an **application/system compliance** standard, not a single endurance test. Practical pass means the **installed BIPV system concept**, including mounting and integration, satisfies the building and electrical requirements for the intended installation. It does **not** replace module-level evidence under 63092-1 / 61215 / 61730. ([Iteh Standards](https://cdn.standards.iteh.ai/samples/22310/f09937fee605403ebad8072a711faddc/IEC-63092-2-2020.pdf "https://cdn.standards.iteh.ai/samples/22310/f09937fee605403ebad8072a711faddc/IEC-63092-2-2020.pdf"))

---

## IEC 62548-1 — PV array design requirements

**Responsible for:**  
This is the **electrical design backbone** for PV arrays. The current consolidated edition covers **DC array wiring, protection devices, switching, earthing**, and the interface to final power conversion equipment; it also includes updated provisions for insulation monitoring, earth-fault detection, isolation means, cable requirements, and systems with DC-DC units. ([IEC Webstore](https://webstore.iec.ch/en/publication/110893 "IEC 62548-1:2023+AMD1:2025 CSV | IEC"))

**What “pass” means:**  
There is no single “module passed IEC 62548” certificate. The practical pass condition is that the **array design review** closes successfully: voltage/current envelope within equipment ratings, wiring/protection/isolation concept defined, electric-shock protection handled, and the installation rules satisfied. In this project pack, that is exactly why IEC 62548 is treated as the electrical-design backbone behind `Voc,max`, `Isc,max`, MPPT compatibility, isolation boundary, connector family, and cable class. ([IEC Webstore](https://webstore.iec.ch/en/publication/110893 "IEC 62548-1:2023+AMD1:2025 CSV | IEC"))

---

## IEC 62446-1 — documentation, commissioning tests, inspection

**Responsible for:**  
Grid-connected PV **handover documentation**, **commissioning tests**, and **inspection**. Its purpose is to verify **safe installation and correct operation** and to define what must be handed to the customer. ([IEC Webstore](https://webstore.iec.ch/en/publication/63726 "IEC 62446-1:2016+AMD1:2018 CSV | IEC"))

**What “pass” means:**  
This is an **acceptance / commissioning** standard. Practical pass means the required document pack exists and the commissioning/inspection results show the installed system is safe and operating correctly. It is **not** a substitute for 62548 design work; it sits later in the chain as commissioning and handover evidence. ([IEC Webstore](https://webstore.iec.ch/en/publication/63726 "IEC 62446-1:2016+AMD1:2018 CSV | IEC"))

## IEC 62446-2 — maintenance of PV systems

**Responsible for:**  
Preventive, corrective, and performance-related **maintenance**, troubleshooting, and worker safety for grid-connected PV systems. ([IEC Webstore](https://webstore.iec.ch/en/publication/27382 "IEC 62446-2:2020 | IEC"))

**What “pass” means:**  
This is an **O&M governance** standard. Practical pass means there is a maintenance regime that covers routine inspection, corrective action, troubleshooting, safety, and performance-restoration logic, and that the system can be maintained within that framework. It is not a product qualification standard. ([IEC Webstore](https://webstore.iec.ch/en/publication/27382 "IEC 62446-2:2020 | IEC"))

## IEC TS 62446-3 — outdoor IR thermography

**Responsible for:**  
Outdoor **infrared inspection** of PV modules and plants in operation. The TS covers passive field thermography under natural sunlight and includes requirements for **IR camera capability**, ambient-condition recording, required inspection conditions, **classification of abnormalities**, personnel qualification, and report content. ([IEC Webstore](https://webstore.iec.ch/en/publication/28628 "IEC TS 62446-3:2017 | IEC"))

**What “pass” means:**  
This is a **procedure/specification**, not a durability certificate. Practical pass means the IR inspection is performed under the required conditions with suitable equipment and qualified personnel, abnormalities are classified correctly, and the inspection report is complete. The output is an **inspection result and action basis**, not a “this module family is qualified for 25 years” statement. ([Iteh Standards](https://cdn.standards.iteh.ai/samples/22683/4de66fa53f2c4b8591ebe1672331acb4/IEC-TS-62446-3-2017.pdf "https://cdn.standards.iteh.ai/samples/22683/4de66fa53f2c4b8591ebe1672331acb4/IEC-TS-62446-3-2017.pdf"))

---

## IEC 62109-3 — electronics integrated with PV elements

**Responsible for:**  
Safety requirements for **electronic devices combined with PV elements**: DC-DC, DC-AC, active diodes, protection, control, monitoring, communication, etc., when sold as one combined product. It supplements **IEC 62109-1 / -2** and works alongside PV module standards such as **IEC 61730** and **IEC 61215**. ([IEC Webstore](https://webstore.iec.ch/en/publication/27684 "IEC 62109-3:2020 | IEC"))

**What “pass” means:**  
Practical pass means the **combined PV + electronics product** passes the applicable IEC 62109-1/-2 requirements plus the additional IEC 62109-3 requirements and referenced PV-related tests as applicable. Important nuance for BIPV: the standard preview explicitly says it does **not fully address** the safety requirements of BIPV/BAPV products, even though such products may fall within its scope. For iWin-type integrated electronics, that means **62109-3 is relevant but not sufficient by itself**. ([Iteh Standards](https://cdn.standards.iteh.ai/samples/20066/0d38108b17684c66bc31aab866b4c6c2/IEC-62109-3-2020.pdf "https://cdn.standards.iteh.ai/samples/20066/0d38108b17684c66bc31aab866b4c6c2/IEC-62109-3-2020.pdf"))

---

## IEC 62790 — junction boxes for PV modules

**Responsible for:**  
Safety requirements, constructional requirements, and tests for **PV module junction boxes** up to **1 500 V DC**. Public previews also note it applies to enclosures on PV modules containing electronic circuits for converting, controlling, or monitoring, with additional requirements handled via IEC 62109-3. ([IEC Webstore](https://webstore.iec.ch/en/publication/32347 "IEC 62790:2020 | IEC"))

**What “pass” means:**  
A junction box/feedthrough solution “passes” when the exact design passes the required construction and safety tests for its rating/application. In an iWin context, a frame-exit or feedthrough architecture should not be treated as closed unless the actual component path is tied either to **IEC 62790-qualified hardware** or to an equally defensible, documented qualification basis. ([IEC Webstore](https://webstore.iec.ch/en/publication/32347 "IEC 62790:2020 | IEC"))

---

## IEC 62852 — PV DC connectors

**Responsible for:**  
Safety requirements and tests for **PV DC connectors** up to **1 500 V DC** and **125 A per contact**. The scope explicitly says these connectors have **no breaking capacity**, even though they may be engaged/disengaged under voltage. ([IEC Webstore](https://webstore.iec.ch/en/publication/66763 "IEC 62852:2014+AMD1:2020 CSV | IEC"))

**What “pass” means:**  
The pass condition is **component qualification**: the specific connector model must satisfy IEC 62852 and be used within its rated voltage/current envelope. In system use, practical pass also means no unapproved cross-mating and no treating the connector as a load-break isolation device. ([IEC Webstore](https://webstore.iec.ch/en/publication/66763 "IEC 62852:2014+AMD1:2020 CSV | IEC"))

---

## IEC 62930 — PV DC cables

**Responsible for:**  
Cables for the **DC side** of PV systems. The scope covers single-core cross-linked cables up to **1.5 kV DC**, suitable for Class II equipment, with **90 °C normal continuous conductor temperature** and **120 °C limited to 20 000 h**; the preview states expected normal-use life is at least **25 years**. ([IEC Webstore](https://webstore.iec.ch/en/publication/28067 "IEC 62930:2017 | IEC"))

**What “pass” means:**  
The pass condition is again **component qualification + correct application**: the selected cable family must comply with IEC 62930 and be used within its voltage, temperature, bend-radius, and routing constraints. In a moving blind or warm frame-edge zone, merely saying “solar cable” is not enough; the actual route and flex/thermal envelope still have to be closed. ([IEC Webstore](https://webstore.iec.ch/en/publication/28067 "IEC 62930:2017 | IEC"))

---

## IEC 61730-1 — module safety qualification, construction

**Responsible for:**  
The **construction rules** for PV module safety qualification: prevention of electric shock, fire hazards, and personal injury under mechanical/environmental stresses. It is the construction side of the safety pair; **61730-2** is the test side. The 2023 scope also states the base applicability is for open-air climates with **T98 ≤ 70 °C** and max system voltage **1 500 V DC**. ([IEC Webstore](https://webstore.iec.ch/en/publication/59803 "IEC 61730-1:2023 | IEC"))

**What “pass” means:**  
Pass means the module design, materials, insulation system, creepage/clearance, and related construction features satisfy the safety-construction requirements. On its own that is not enough; the same design must also pass the **61730-2 safety tests**. For high-temperature BIPV/shading deployments, the T98 limit is the key trigger for escalation to IEC TS 63126. ([IEC Webstore](https://webstore.iec.ch/en/publication/59803 "IEC 61730-1:2023 | IEC"))

## IEC 61730-2 — module safety qualification, testing

**Responsible for:**  
The **test sequence** used to verify safety of PV modules whose construction has already been assessed under 61730-1. The standard states that the test sequence and pass criteria are designed to detect breakdowns that could lead to **fire, electric shock, or personal injury**; categories include general inspection, shock hazard, fire hazard, mechanical stress, and environmental stress. ([IEC Webstore](https://webstore.iec.ch/en/publication/63895 "IEC 61730-2:2023 | IEC"))

**What “pass” means:**  
Product-style pass: representative samples complete the applicable 61730-2 sequences without failing the safety acceptance criteria. It is a **safety qualification**, not a performance model, not a system commissioning pack, and not a guarantee that every national building-code issue is closed. ([VDE Verlag](https://www.vde-verlag.de/iec-normen/preview-pdf/info_iec61730-2%7Bed3.0.RLV%7Den.pdf "https://www.vde-verlag.de/iec-normen/preview-pdf/info_iec61730-2%7Bed3.0.RLV%7Den.pdf"))

---

## IEC 61215-1 — module design qualification and type approval, requirements

**Responsible for:**  
The **requirements** side of PV module design qualification and type approval for long-term operation in general open-air climates. Public previews show the pass structure includes **Gate No. 1** for verifying rated label values and **Gate No. 2** for maximum power degradation during type-approval testing, plus electrical-circuitry, visual-defect, and electrical-safety requirements. ([IEC Webstore](https://webstore.iec.ch/en/publication/68594 "IEC 61215-1:2021 RLV | IEC"))

**What “pass” means:**  
Practical pass means the module meets Gate 1 and Gate 2 plus the other Part 1 acceptance requirements after the Part 2 test program is run. The public material is clear on the structure: **Gate 1 compares measured electrical quantities to the nameplate; Gate 2 compares power before and after stress**. Exact numerical thresholds depend on the applicable clauses and, where relevant, the technology-specific **Part 1-x** subpart. The standard’s own objective is qualification within reasonable cost/time, **not a literal lifetime guarantee**. ([Crsbis](https://www.crsbis.in/BIS/app_srv/tdc/gl/docs/SPV_changeover_guidelines_PV_modules_draft_V2.pdf "https://www.crsbis.in/BIS/app_srv/tdc/gl/docs/SPV_changeover_guidelines_PV_modules_draft_V2.pdf"))

## IEC 61215-2 — module design qualification and type approval, test procedures

**Responsible for:**  
The **test procedures** used to execute the 61215 design qualification program. ([IEC Webstore](https://webstore.iec.ch/en/publication/61350 "IEC 61215-2:2021 | IEC"))

**What “pass” means:**  
Product-style pass: the module completes the required MQT sequences and still satisfies the Part 1 acceptance logic. In other words, **61215-2 runs the stresses; 61215-1 defines what counts as passing them**. For thin-film or other specific technologies, you still need the relevant **61215-1-x** special-requirement subpart, which 63092-1 explicitly references. ([Iteh Standards](https://cdn.standards.iteh.ai/samples/101269/e9c169bfdf004586a8c0cf8bf9e2a625/IEC-61215-2-2021.pdf "https://cdn.standards.iteh.ai/samples/101269/e9c169bfdf004586a8c0cf8bf9e2a625/IEC-61215-2-2021.pdf"))

---

## IEC 61853-1 — irradiance/temperature performance matrix and power rating

**Responsible for:**  
Measured module power/rating over a range of **irradiances and temperatures**, yielding characterization parameters for performance modeling. It is about **performance characterization**, not safety or durability qualification. ([IEC Webstore](https://webstore.iec.ch/en/publication/6035 "IEC 61853-1:2011 | IEC"))

**What “pass” means:**  
Engineering reading: there is no “survived durability test” meaning here. You “pass” by obtaining a valid, standard-conformant **characterization data set** and power rating over the defined matrix. It feeds energy modeling and rating, but it does **not** prove module safety or long-term robustness. ([IEC Webstore](https://webstore.iec.ch/en/publication/6035 "IEC 61853-1:2011 | IEC"))

## IEC 61853-2 — spectral response, incidence angle, operating temperature

**Responsible for:**  
Measurement procedures for **spectral responsivity**, **incidence-angle effects**, and **module operating temperature** for energy prediction. ([IEC Webstore](https://webstore.iec.ch/en/publication/25811 "IEC 61853-2:2016 | IEC"))

**What “pass” means:**  
Same category as 61853-1: this is a **characterization** standard. Practical pass means the required measurements are produced validly, giving the parameter set needed for detailed energy prediction. It does not by itself qualify the product for field durability or safety. ([IEC Webstore](https://webstore.iec.ch/en/publication/25811 "IEC 61853-2:2016 | IEC"))

---

## IEC TS 63126 — high-temperature qualification extension

**Responsible for:**  
Additional qualification requirements for PV modules/components/materials used at **higher operating temperatures** than those assumed by the base 61215/61730 regime. The current TS states the base assumption behind those standards is **T98 < 70 °C**, and defines **Level 1** for **T98 ≤ 80 °C** and **Level 2** for **T98 ≤ 90 °C**. Passing a higher level implies passing the lower levels. ([IEC Webstore](https://webstore.iec.ch/en/publication/78554 "IEC TS 63126:2025 | IEC"))

**What “pass” means:**  
This standard only becomes relevant **after** you show the deployment is outside the base temperature envelope. Then pass means the product has completed the **additional tests for the applicable temperature level**. For a glazing-integrated blind / sealed chamber concept, this is the critical trigger standard whenever thermal analysis suggests the base 61730/61215 assumption is not credible. ([IEC Webstore](https://webstore.iec.ch/en/publication/78554 "IEC TS 63126:2025 | IEC"))

---

# The shortest practical reading for your project

For an **iWin-type glazing-integrated PV blind**, the standards stack works like this:

- **IEC 63092-1 / -2**: “is this a compliant BIPV building product/system concept?” ([Iteh Standards](https://cdn.standards.iteh.ai/samples/23167/5a770cce22b24a4189f93a9a19346c39/IEC-63092-1-2020.pdf "https://cdn.standards.iteh.ai/samples/23167/5a770cce22b24a4189f93a9a19346c39/IEC-63092-1-2020.pdf"))
    
- **IEC 62548-1**: “is the DC array / protection / isolation / cable / connector design electrically correct?” ([IEC Webstore](https://webstore.iec.ch/en/publication/110893 "IEC 62548-1:2023+AMD1:2025 CSV | IEC"))
    
- **IEC 62446-1 / -2 / -3**: “can it be commissioned, documented, maintained, and thermographically inspected in a controlled way?” ([IEC Webstore](https://webstore.iec.ch/en/publication/63726 "IEC 62446-1:2016+AMD1:2018 CSV | IEC"))
    
- **IEC 61730 + IEC 61215**: “is the PV module design safe and qualified?” ([IEC Webstore](https://webstore.iec.ch/en/publication/59803 "IEC 61730-1:2023 | IEC"))
    
- **IEC TS 63126**: “does the window-cavity/slat thermal environment force a high-temperature qualification extension?” ([IEC Webstore](https://webstore.iec.ch/en/publication/78554 "IEC TS 63126:2025 | IEC"))
    
- **IEC 62109-3 / 62790 / 62852 / 62930**: “are integrated electronics, feedthrough/junction interfaces, connectors, and cables properly qualified?” ([Iteh Standards](https://cdn.standards.iteh.ai/samples/20066/0d38108b17684c66bc31aab866b4c6c2/IEC-62109-3-2020.pdf "https://cdn.standards.iteh.ai/samples/20066/0d38108b17684c66bc31aab866b4c6c2/IEC-62109-3-2020.pdf"))
    
- **IEC 61853-1 / -2**: “do we have the performance/temperature/angle characterization needed for realistic energy modeling?” ([IEC Webstore](https://webstore.iec.ch/en/publication/6035 "IEC 61853-1:2011 | IEC"))
    

That split is consistent with the project standards/design-envelope file, which treats **62548 as the electrical-design backbone**, **62446 as commissioning/O&M**, **61730/61215 as safety + qualification**, and **TS 63126 as the high-temperature trigger**.

I can turn this into a **one-page matrix** with columns `Standard | Responsible for | Pass evidence | Main owner | iWin-specific risk if missing`.

---

me: create an html block diagram that rappresents interconnection between norms and what each norm regulates in BIPV SD with microinverter and in power optimizer architectures

---

Created the HTML block diagram here:

[Download the HTML block diagram](sandbox:/mnt/data/bipv_sd_standards_block_diagram.html)

The diagram is architecture-centric:

- **shared BIPV core**: `IEC 63092-1/-2`, `IEC 61730-1/-2`, `IEC 61215-1/-2`, `IEC 61853-1/-2`, `IEC TS 63126`, `IEC 62790`, `IEC 62852`, `IEC 62930`, `IEC 62548-1`
    
- **branch split**: **microinverter** vs **power optimizer**
    
- **lifecycle closure**: `IEC 62446-1`, `IEC 62446-2`, `IEC TS 62446-3`
    
- **cross-standard logic**: how the norms depend on each other, not just on hardware blocks
    

I based the map on the project standards/design-envelope backbone, where `IEC 62548-1` is the DC design anchor, `IEC 62109-3` is the MLPE / PV-adjacent electronics standard, and the rest of the stack is explicitly carried for architecture comparison.

The microinverter vs optimizer split is grounded in the guidebook’s BIPV design framing: BIPV strings may use microinverters, and additional DC-DC optimizers are identified as a way to reduce shading-driven losses and hotspots; the same guidebook also notes that microinverters optimize intricate BIPV systems while often increasing maintenance difficulty at module level.

One deliberate boundary in this version: the main diagram stays centered on the standards stack already adopted in the project pack. I only flag, but do not fully expand, adjacent dependencies such as broader LV installation rules and standalone inverter product safety outside the requested norm set.

A useful next refinement would be a **v2 with clause/page callouts on every block**.


<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8" />
  <meta name="viewport" content="width=device-width, initial-scale=1.0" />
  <title>BIPV Shading Device Standards Map — Microinverter vs Power Optimizer</title>
  <style>
    :root {
      --bg: #0b1020;
      --bg2: #121a31;
      --panel: #121a2b;
      --panel2: #17213b;
      --line: #334466;
      --text: #e8eefc;
      --muted: #9fb0d1;
      --shared: #5aa6ff;
      --qual: #b58cff;
      --interface: #ffb454;
      --micro: #51d38a;
      --opt: #58d6d6;
      --life: #ff7aa8;
      --logic: #c7d2fe;
      --ghost: #7f8ba8;
      --good: #1f9d60;
      --warn: #d18b2e;
      --danger: #d96a6a;
      --shadow: 0 18px 50px rgba(0,0,0,.28);
      --radius: 18px;
    }

    * { box-sizing: border-box; }
    html, body { margin: 0; padding: 0; background: linear-gradient(180deg, #07101d 0%, #0d1528 100%); color: var(--text); font-family: Inter, Segoe UI, Arial, sans-serif; }
    body { padding: 20px; }

    .page {
      max-width: 1650px;
      margin: 0 auto;
      display: grid;
      gap: 16px;
    }

    .header, .panel {
      background: linear-gradient(180deg, rgba(19,29,53,.96), rgba(14,21,39,.96));
      border: 1px solid rgba(124, 150, 199, 0.22);
      border-radius: 22px;
      box-shadow: var(--shadow);
    }

    .header {
      padding: 20px 24px 18px;
      display: grid;
      gap: 12px;
    }

    h1 {
      margin: 0;
      font-size: 28px;
      line-height: 1.15;
      letter-spacing: .2px;
    }

    .subtitle {
      color: var(--muted);
      font-size: 14px;
      line-height: 1.5;
      max-width: 1200px;
    }

    .controls {
      display: flex;
      flex-wrap: wrap;
      gap: 10px;
      align-items: center;
    }

    .btn {
      background: rgba(255,255,255,.03);
      color: var(--text);
      border: 1px solid rgba(177, 194, 229, .22);
      border-radius: 999px;
      padding: 9px 14px;
      font-size: 13px;
      cursor: pointer;
      transition: .2s ease;
    }

    .btn:hover, .btn.active {
      transform: translateY(-1px);
      border-color: rgba(255,255,255,.35);
      background: rgba(255,255,255,.08);
    }

    .legend {
      display: flex;
      flex-wrap: wrap;
      gap: 10px 16px;
      color: var(--muted);
      font-size: 12px;
    }

    .legend .tag {
      display: inline-flex;
      align-items: center;
      gap: 8px;
    }

    .swatch {
      width: 12px;
      height: 12px;
      border-radius: 50%;
      display: inline-block;
    }

    .panel {
      padding: 16px;
      overflow: hidden;
    }

    .section-title {
      display: flex;
      align-items: center;
      justify-content: space-between;
      gap: 12px;
      margin: 0 0 12px;
    }

    .section-title h2 {
      margin: 0;
      font-size: 17px;
      line-height: 1.2;
      letter-spacing: .2px;
    }

    .section-title .hint {
      color: var(--muted);
      font-size: 12px;
      text-align: right;
    }

    .flow-grid {
      display: grid;
      grid-template-columns: minmax(180px, 1fr) 40px minmax(180px, 1fr) 40px minmax(180px, 1fr) 40px minmax(180px, 1fr);
      gap: 10px;
      align-items: stretch;
    }

    .split-grid {
      display: grid;
      grid-template-columns: 1fr 1fr;
      gap: 16px;
      align-items: start;
    }

    .branch {
      background: linear-gradient(180deg, rgba(255,255,255,.02), rgba(255,255,255,.01));
      border: 1px solid rgba(177, 194, 229, .14);
      border-radius: 20px;
      padding: 14px;
      display: grid;
      gap: 12px;
    }

    .branch h3 {
      margin: 0;
      font-size: 16px;
      display: flex;
      align-items: center;
      justify-content: space-between;
      gap: 10px;
    }

    .branch-note {
      color: var(--muted);
      font-size: 13px;
      line-height: 1.45;
      margin-top: -2px;
    }

    .cards-grid {
      display: grid;
      grid-template-columns: repeat(auto-fit, minmax(205px, 1fr));
      gap: 12px;
      align-items: stretch;
    }

    .std-card, .sys-card, .note-card, .logic-card {
      position: relative;
      border-radius: var(--radius);
      padding: 14px 14px 13px;
      border: 1px solid rgba(255,255,255,.14);
      background: linear-gradient(180deg, rgba(255,255,255,.05), rgba(255,255,255,.02));
      transition: transform .2s ease, opacity .2s ease, filter .2s ease, border-color .2s ease;
      min-height: 132px;
    }

    .std-card:hover, .sys-card:hover, .note-card:hover, .logic-card:hover {
      transform: translateY(-2px);
      border-color: rgba(255,255,255,.32);
    }

    .std-card.muted, .sys-card.muted, .note-card.muted, .logic-card.muted {
      opacity: .23;
      filter: saturate(.55);
    }

    .std-card .kicker,
    .sys-card .kicker,
    .note-card .kicker,
    .logic-card .kicker {
      font-size: 11px;
      text-transform: uppercase;
      letter-spacing: .12em;
      color: var(--muted);
      margin-bottom: 8px;
    }

    .std-card h4,
    .sys-card h4,
    .note-card h4,
    .logic-card h4 {
      margin: 0 0 8px;
      font-size: 15px;
      line-height: 1.25;
    }

    .std-card p,
    .sys-card p,
    .note-card p,
    .logic-card p {
      margin: 0;
      color: #d5dff6;
      font-size: 13px;
      line-height: 1.45;
    }

    .chips {
      display: flex;
      flex-wrap: wrap;
      gap: 6px;
      margin-top: 10px;
    }

    .chip {
      padding: 4px 8px;
      border-radius: 999px;
      font-size: 11px;
      color: #e8eefc;
      background: rgba(255,255,255,.07);
      border: 1px solid rgba(255,255,255,.12);
      white-space: nowrap;
    }

    .sys-card { min-height: 142px; }

    .arrow {
      display: flex;
      align-items: center;
      justify-content: center;
      font-size: 24px;
      color: #83a3df;
      user-select: none;
      text-shadow: 0 0 16px rgba(100,150,255,.18);
    }

    .arrow.branching {
      font-size: 30px;
      line-height: 1;
      margin: 4px 0 0;
    }

    .band {
      border-top: 1px dashed rgba(177, 194, 229, .18);
      margin-top: 10px;
      padding-top: 14px;
    }

    .logic-wrap {
      display: grid;
      grid-template-columns: repeat(auto-fit, minmax(230px, 1fr));
      gap: 12px;
    }

    .footer-note {
      font-size: 12px;
      color: var(--muted);
      line-height: 1.5;
      padding: 2px 2px 0;
    }

    .accent-shared { box-shadow: inset 0 0 0 1px rgba(90,166,255,.18); }
    .accent-qual { box-shadow: inset 0 0 0 1px rgba(181,140,255,.18); }
    .accent-interface { box-shadow: inset 0 0 0 1px rgba(255,180,84,.18); }
    .accent-micro { box-shadow: inset 0 0 0 1px rgba(81,211,138,.2); }
    .accent-opt { box-shadow: inset 0 0 0 1px rgba(88,214,214,.22); }
    .accent-life { box-shadow: inset 0 0 0 1px rgba(255,122,168,.22); }
    .accent-logic { box-shadow: inset 0 0 0 1px rgba(199,210,254,.18); }
    .accent-ghost { box-shadow: inset 0 0 0 1px rgba(127,139,168,.18); }

    .bar {
      position: absolute;
      inset: 0 auto 0 0;
      width: 4px;
      border-top-left-radius: inherit;
      border-bottom-left-radius: inherit;
      opacity: .95;
    }

    .bar.shared { background: var(--shared); }
    .bar.qual { background: var(--qual); }
    .bar.interface { background: var(--interface); }
    .bar.micro { background: var(--micro); }
    .bar.opt { background: var(--opt); }
    .bar.life { background: var(--life); }
    .bar.logic { background: var(--logic); }
    .bar.ghost { background: var(--ghost); }

    .mini-title {
      color: var(--muted);
      font-size: 11px;
      text-transform: uppercase;
      letter-spacing: .12em;
      margin-bottom: 8px;
    }

    .splitter {
      height: 1px;
      background: linear-gradient(90deg, transparent, rgba(177,194,229,.2), transparent);
      margin: 2px 0 4px;
    }

    .small {
      font-size: 12px !important;
      color: var(--muted) !important;
      line-height: 1.45;
    }

    .dense .std-card,
    .dense .logic-card,
    .dense .note-card {
      min-height: 118px;
    }

    @media (max-width: 1200px) {
      .flow-grid { grid-template-columns: 1fr; }
      .arrow { transform: rotate(90deg); min-height: 30px; }
      .split-grid { grid-template-columns: 1fr; }
    }
  </style>
</head>
<body>
  <div class="page">
    <section class="header">
      <h1>BIPV shading device standards map<br>Microinverter vs power optimizer architecture</h1>
      <div class="subtitle">
        Architecture-centric block diagram for an iWin-type glazing-integrated PV shading device. Shared BIPV standards are shown once, then the map splits into the two downstream power-conversion options. Use the filters to emphasize the shared stack, the microinverter branch, the optimizer branch, lifecycle standards, or the cross-standard logic.
      </div>
      <div class="controls" id="controls">
        <button class="btn active" data-filter="all">Show all</button>
        <button class="btn" data-filter="shared">Shared BIPV core</button>
        <button class="btn" data-filter="micro">Microinverter emphasis</button>
        <button class="btn" data-filter="optimizer">Optimizer emphasis</button>
        <button class="btn" data-filter="lifecycle">Commissioning / O&amp;M</button>
        <button class="btn" data-filter="logic">Cross-standard logic</button>
      </div>
      <div class="legend">
        <span class="tag"><span class="swatch" style="background: var(--shared)"></span> shared system / design scope</span>
        <span class="tag"><span class="swatch" style="background: var(--qual)"></span> module qualification / performance / thermal trigger</span>
        <span class="tag"><span class="swatch" style="background: var(--interface)"></span> interface / DC BOS</span>
        <span class="tag"><span class="swatch" style="background: var(--micro)"></span> microinverter branch</span>
        <span class="tag"><span class="swatch" style="background: var(--opt)"></span> optimizer branch</span>
        <span class="tag"><span class="swatch" style="background: var(--life)"></span> commissioning / maintenance / thermography</span>
        <span class="tag"><span class="swatch" style="background: var(--logic)"></span> inter-standard dependency logic</span>
      </div>
    </section>

    <section class="panel">
      <div class="section-title">
        <h2>1. Shared physical stack of the BIPV shading device</h2>
        <div class="hint">These boxes exist before choosing microinverter or optimizer.</div>
      </div>
      <div class="flow-grid">
        <div class="sys-card accent-shared filterable" data-tags="all shared logic">
          <span class="bar shared"></span>
          <div class="kicker">Subsystem</div>
          <h4>Façade / IGU / blind system boundary</h4>
          <p>The building-integrated shading device as a façade subsystem: glazing role, blind location, mounting, replacement boundary, and building-facing obligations.</p>
          <div class="chips">
            <span class="chip">envelope role</span>
            <span class="chip">building integration</span>
          </div>
        </div>
        <div class="arrow">→</div>
        <div class="sys-card accent-shared filterable" data-tags="all shared micro optimizer logic">
          <span class="bar shared"></span>
          <div class="kicker">Subsystem</div>
          <h4>PV slats / module zone</h4>
          <p>PV element inside the shading device: slats, substrings, bypass topology, optical angle effects, and electro-thermal behavior inside the BIPV assembly.</p>
          <div class="chips">
            <span class="chip">slat partitioning</span>
            <span class="chip">mismatch</span>
          </div>
        </div>
        <div class="arrow">→</div>
        <div class="sys-card accent-interface filterable" data-tags="all shared micro optimizer logic">
          <span class="bar interface"></span>
          <div class="kicker">Subsystem</div>
          <h4>Feedthrough / connector / cable route</h4>
          <p>Frame exit, moving electrical interfaces, junction/feedthrough box, connector family, cable class, bend control, and warm frame-zone routing.</p>
          <div class="chips">
            <span class="chip">DC interface</span>
            <span class="chip">service risk</span>
          </div>
        </div>
        <div class="arrow">→</div>
        <div class="sys-card accent-shared filterable" data-tags="all shared micro optimizer lifecycle logic">
          <span class="bar shared"></span>
          <div class="kicker">Decision node</div>
          <h4>Architecture split: MLPE at unit edge</h4>
          <p>From the same BIPV core, choose either module-adjacent AC conversion or module-adjacent DC conditioning with downstream string DC retained.</p>
          <div class="chips">
            <span class="chip">microinverter</span>
            <span class="chip">power optimizer</span>
          </div>
        </div>
      </div>

      <div class="band dense">
        <div class="cards-grid">
          <div class="std-card accent-shared filterable" data-tags="all shared logic">
            <span class="bar shared"></span>
            <div class="kicker">IEC 63092-2</div>
            <h4>BIPV system in building</h4>
            <p>System-level building integration: façade layout, mounting/system obligations, and the BIPV shading device as part of the building system.</p>
            <div class="chips"><span class="chip">system-level</span><span class="chip">façade integration</span></div>
          </div>

          <div class="std-card accent-shared filterable" data-tags="all shared logic">
            <span class="bar shared"></span>
            <div class="kicker">IEC 63092-1</div>
            <h4>BIPV module as building product</h4>
            <p>Module-level building-product framing for the PV shading element used inside the building envelope.</p>
            <div class="chips"><span class="chip">module role</span><span class="chip">building product</span></div>
          </div>

          <div class="std-card accent-qual filterable" data-tags="all shared micro optimizer logic">
            <span class="bar qual"></span>
            <div class="kicker">IEC 61730-1 / -2</div>
            <h4>Module safety qualification</h4>
            <p>Construction safety basis and safety testing basis for the PV module/slat assembly.</p>
            <div class="chips"><span class="chip">electrical safety</span><span class="chip">fire / shock</span></div>
          </div>

          <div class="std-card accent-qual filterable" data-tags="all shared micro optimizer logic">
            <span class="bar qual"></span>
            <div class="kicker">IEC 61215-1 / -2</div>
            <h4>Module design qualification</h4>
            <p>Baseline module qualification and type-approval test path for the offered PV technology/build.</p>
            <div class="chips"><span class="chip">durability basis</span><span class="chip">type approval</span></div>
          </div>

          <div class="std-card accent-qual filterable" data-tags="all shared micro optimizer logic">
            <span class="bar qual"></span>
            <div class="kicker">IEC 61853-1 / -2</div>
            <h4>Performance characterization</h4>
            <p>Irradiance-temperature response, incidence-angle effects, spectral response, and operating-temperature basis for realistic BIPV/slat energy modeling.</p>
            <div class="chips"><span class="chip">model inputs</span><span class="chip">AOI / temp basis</span></div>
          </div>

          <div class="std-card accent-qual filterable" data-tags="all shared micro optimizer logic">
            <span class="bar qual"></span>
            <div class="kicker">IEC TS 63126</div>
            <h4>High-temperature qualification trigger</h4>
            <p>Additional qualification path when the actual deployment temperature envelope credibly exceeds the base module qualification assumption.</p>
            <div class="chips"><span class="chip">thermal trigger</span><span class="chip">T98 review</span></div>
          </div>

          <div class="std-card accent-interface filterable" data-tags="all shared micro optimizer logic">
            <span class="bar interface"></span>
            <div class="kicker">IEC 62790</div>
            <h4>Junction / feedthrough boxes</h4>
            <p>Safety and suitability of the junction or feedthrough interface at the frame exit / interface box level.</p>
            <div class="chips"><span class="chip">feedthrough</span><span class="chip">interface safety</span></div>
          </div>

          <div class="std-card accent-interface filterable" data-tags="all shared micro optimizer logic">
            <span class="bar interface"></span>
            <div class="kicker">IEC 62852</div>
            <h4>PV DC connectors</h4>
            <p>Connector family suitability, current/voltage class, mating discipline, and allowed connector use on the DC side.</p>
            <div class="chips"><span class="chip">connector class</span><span class="chip">mating control</span></div>
          </div>

          <div class="std-card accent-interface filterable" data-tags="all shared micro optimizer logic">
            <span class="bar interface"></span>
            <div class="kicker">IEC 62930</div>
            <h4>PV DC cables</h4>
            <p>DC cable suitability: cable class, insulation, route compatibility, and warm/moving interface routing on the façade side.</p>
            <div class="chips"><span class="chip">DC cable</span><span class="chip">route limits</span></div>
          </div>

          <div class="std-card accent-shared filterable" data-tags="all shared micro optimizer logic">
            <span class="bar shared"></span>
            <div class="kicker">IEC 62548-1</div>
            <h4>PV array DC design backbone</h4>
            <p>Voltage/current envelope, MPPT compatibility, disconnect/isolation boundary, protection concept, earthing/insulation monitoring, and DC routing rules.</p>
            <div class="chips"><span class="chip">Voc,max / Isc,max</span><span class="chip">DC safety design</span></div>
          </div>
        </div>
      </div>
    </section>

    <section class="panel">
      <div class="section-title">
        <h2>2. Architecture split after the common BIPV core</h2>
        <div class="hint">Same shading device, different downstream power-conversion topology.</div>
      </div>
      <div class="arrow branching">↙&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;↘</div>
      <div class="split-grid">
        <div class="branch">
          <h3>
            <span style="color: var(--micro)">Microinverter branch</span>
            <span class="chip" style="border-color: rgba(81,211,138,.25); background: rgba(81,211,138,.12)">AC earlier</span>
          </h3>
          <div class="branch-note">Shorter external DC path after each BIPV unit, but more electronics live near the façade edge / module zone.</div>

          <div class="flow-grid" style="grid-template-columns: minmax(160px,1fr) 30px minmax(160px,1fr) 30px minmax(160px,1fr);">
            <div class="sys-card accent-micro filterable" data-tags="all micro shared">
              <span class="bar micro"></span>
              <div class="kicker">Branch flow</div>
              <h4>BIPV unit DC output</h4>
              <p>Unit/slat-side DC exits the BIPV assembly over the shortest practical route.</p>
            </div>
            <div class="arrow">→</div>
            <div class="sys-card accent-micro filterable" data-tags="all micro shared logic">
              <span class="bar micro"></span>
              <div class="kicker">Branch flow</div>
              <h4>Local microinverter</h4>
              <p>Module-adjacent DC-AC conversion. Stronger concentration of electronics at unit level.</p>
            </div>
            <div class="arrow">→</div>
            <div class="sys-card accent-micro filterable" data-tags="all micro lifecycle">
              <span class="bar micro"></span>
              <div class="kicker">Branch flow</div>
              <h4>AC trunk / building AC board</h4>
              <p>After conversion, the architecture behaves more like distributed AC generation from the façade.</p>
            </div>
          </div>

          <div class="cards-grid dense">
            <div class="std-card accent-micro filterable" data-tags="all micro logic">
              <span class="bar micro"></span>
              <div class="kicker">IEC 62109-3</div>
              <h4>Electronics combined with PV elements</h4>
              <p>Relevant when the microinverter or power electronics are integrated with, packaged with, or boundary-coupled to the PV element.</p>
              <div class="chips"><span class="chip">MLPE near PV</span><span class="chip">product boundary</span></div>
            </div>

            <div class="std-card accent-micro filterable" data-tags="all micro shared logic">
              <span class="bar micro"></span>
              <div class="kicker">IEC 62548-1 emphasis</div>
              <h4>Still applies on the DC side</h4>
              <p>Array/DC safety design remains relevant, but the architecture usually externalizes less series DC stringing than the optimizer branch.</p>
              <div class="chips"><span class="chip">shorter DC route</span><span class="chip">unit isolation</span></div>
            </div>

            <div class="note-card accent-micro filterable" data-tags="all micro lifecycle">
              <span class="bar micro"></span>
              <div class="kicker">Architecture effect</div>
              <h4>What becomes more critical</h4>
              <p>Replacement access, electronics thermal environment, local diagnostics, and module-adjacent serviceability become dominant review topics.</p>
              <div class="chips"><span class="chip">higher MLPE count</span><span class="chip">façade service burden</span></div>
            </div>
          </div>
        </div>

        <div class="branch">
          <h3>
            <span style="color: var(--opt)">Power optimizer branch</span>
            <span class="chip" style="border-color: rgba(88,214,214,.25); background: rgba(88,214,214,.12)">DC retained longer</span>
          </h3>
          <div class="branch-note">Module-level DC conditioning mitigates mismatch while preserving downstream string/sub-array DC design obligations.</div>

          <div class="flow-grid" style="grid-template-columns: minmax(140px,1fr) 24px minmax(140px,1fr) 24px minmax(140px,1fr) 24px minmax(140px,1fr);">
            <div class="sys-card accent-opt filterable" data-tags="all optimizer shared">
              <span class="bar opt"></span>
              <div class="kicker">Branch flow</div>
              <h4>BIPV unit DC output</h4>
              <p>Unit/slat-side DC exits the BIPV assembly into local DC conditioning.</p>
            </div>
            <div class="arrow">→</div>
            <div class="sys-card accent-opt filterable" data-tags="all optimizer shared logic">
              <span class="bar opt"></span>
              <div class="kicker">Branch flow</div>
              <h4>Optimizer / DC conditioner</h4>
              <p>Module-level MPPT / DC conditioning used to manage mismatch while keeping a downstream DC bus.</p>
            </div>
            <div class="arrow">→</div>
            <div class="sys-card accent-opt filterable" data-tags="all optimizer shared logic">
              <span class="bar opt"></span>
              <div class="kicker">Branch flow</div>
              <h4>String / sub-array DC bus</h4>
              <p>Series/parallel grouping, longer DC route, and string/sub-array design remain explicit.</p>
            </div>
            <div class="arrow">→</div>
            <div class="sys-card accent-opt filterable" data-tags="all optimizer lifecycle">
              <span class="bar opt"></span>
              <div class="kicker">Branch flow</div>
              <h4>String / multi-string inverter</h4>
              <p>Conversion shifts downstream; façade-side BOS stays strongly DC-centric.</p>
            </div>
          </div>

          <div class="cards-grid dense">
            <div class="std-card accent-opt filterable" data-tags="all optimizer logic">
              <span class="bar opt"></span>
              <div class="kicker">IEC 62109-3</div>
              <h4>Electronics combined with PV elements</h4>
              <p>Directly relevant when the optimizer/DC conditioning unit is integrated at the unit edge or packaged with the PV element.</p>
              <div class="chips"><span class="chip">DC conditioning unit</span><span class="chip">MLPE</span></div>
            </div>

            <div class="std-card accent-opt filterable" data-tags="all optimizer shared logic">
              <span class="bar opt"></span>
              <div class="kicker">IEC 62548-1 emphasis</div>
              <h4>Dominant branch standard</h4>
              <p>Stringing, PV sections/sub-arrays, MPPT window, DC overcurrent/disconnect, insulation strategy, and array diagrams stay central here.</p>
              <div class="chips"><span class="chip">DC sections</span><span class="chip">string rules</span></div>
            </div>

            <div class="note-card accent-opt filterable" data-tags="all optimizer shared logic">
              <span class="bar opt"></span>
              <div class="kicker">Architecture effect</div>
              <h4>What becomes more critical</h4>
              <p>Approved connector/cable/feedthrough stack, longer DC routing discipline, string fault localization, and safe isolation of façade sections.</p>
              <div class="chips"><span class="chip">longer DC path</span><span class="chip">string isolation</span></div>
            </div>
          </div>
        </div>
      </div>
    </section>

    <section class="panel">
      <div class="section-title">
        <h2>3. Lifecycle standards that close the loop on both branches</h2>
        <div class="hint">These apply after design and architecture selection, but should be carried from day 1.</div>
      </div>
      <div class="cards-grid">
        <div class="std-card accent-life filterable" data-tags="all lifecycle micro optimizer logic">
          <span class="bar life"></span>
          <div class="kicker">IEC 62446-1</div>
          <h4>Documentation, commissioning, inspection</h4>
          <p>Handover documents, commissioning checks, inspection logic, labeling, and acceptance structure for the installed BIPV/PV system.</p>
          <div class="chips"><span class="chip">handover</span><span class="chip">first energization</span></div>
        </div>

        <div class="std-card accent-life filterable" data-tags="all lifecycle micro optimizer logic">
          <span class="bar life"></span>
          <div class="kicker">IEC 62446-2</div>
          <h4>Preventive / corrective maintenance</h4>
          <p>Maintenance planning, service logic, and post-installation operational discipline for the BIPV system over life.</p>
          <div class="chips"><span class="chip">O&amp;M</span><span class="chip">corrective service</span></div>
        </div>

        <div class="std-card accent-life filterable" data-tags="all lifecycle micro optimizer logic">
          <span class="bar life"></span>
          <div class="kicker">IEC TS 62446-3</div>
          <h4>Outdoor thermography</h4>
          <p>IR inspection method for anomaly detection, hotspot screening, and maintenance diagnostics in the installed system.</p>
          <div class="chips"><span class="chip">IR inspection</span><span class="chip">thermal anomaly</span></div>
        </div>

        <div class="note-card accent-life filterable" data-tags="all lifecycle micro optimizer logic">
          <span class="bar life"></span>
          <div class="kicker">Practical effect</div>
          <h4>Why these standards matter to architecture choice</h4>
          <p>Microinverters can improve module-level visibility but may complicate replacement access; optimizers preserve string-level DC architecture and can demand stronger isolation and route documentation.</p>
          <div class="chips"><span class="chip">diagnostics</span><span class="chip">service boundary</span></div>
        </div>
      </div>
    </section>

    <section class="panel">
      <div class="section-title">
        <h2>4. Cross-standard dependency logic</h2>
        <div class="hint">These are the interconnections between norms, not just between norms and hardware blocks.</div>
      </div>
      <div class="logic-wrap">
        <div class="logic-card accent-logic filterable" data-tags="all logic shared">
          <span class="bar logic"></span>
          <div class="kicker">Dependency</div>
          <h4>IEC 63092 sits on top of module safety / qualification</h4>
          <p>For a BIPV shading device, the building-product/system framing of IEC 63092 is not a substitute for the module safety and qualification basis delivered by IEC 61730 and IEC 61215.</p>
        </div>

        <div class="logic-card accent-logic filterable" data-tags="all logic shared micro optimizer">
          <span class="bar logic"></span>
          <div class="kicker">Dependency</div>
          <h4>IEC 61853 feeds architecture modeling</h4>
          <p>Incidence-angle and temperature characterization are the model basis that should feed mismatch studies, façade yield estimates, and architecture scoring.</p>
        </div>

        <div class="logic-card accent-logic filterable" data-tags="all logic shared micro optimizer">
          <span class="bar logic"></span>
          <div class="kicker">Dependency</div>
          <h4>IEC TS 63126 is a trigger, not a default claim</h4>
          <p>Open this path only when the BIPV shading device thermal envelope credibly exceeds the base qualification assumption.</p>
        </div>

        <div class="logic-card accent-logic filterable" data-tags="all logic optimizer micro shared">
          <span class="bar logic"></span>
          <div class="kicker">Dependency</div>
          <h4>IEC 62548 consumes component-level interface choices</h4>
          <p>Connector, cable, feedthrough, and MLPE decisions close through IEC 62852, IEC 62930, IEC 62790, and IEC 62109-3 before the array design is actually defensible.</p>
        </div>

        <div class="logic-card accent-logic filterable" data-tags="all logic lifecycle micro optimizer">
          <span class="bar logic"></span>
          <div class="kicker">Dependency</div>
          <h4>IEC 62446 verifies the installed outcome</h4>
          <p>Commissioning, inspection, maintenance, and thermography close the loop on the choices made under IEC 63092, IEC 62548, and the product qualification standards.</p>
        </div>
      </div>

      <div class="splitter"></div>
      <div class="footer-note">
        <strong>Boundary note.</strong> This map is intentionally centered on the standards stack carried in the project pack. For a real project, the architecture also depends on standards/codes outside this requested set, especially low-voltage installation rules, standalone inverter product safety, grid interconnection, fire-service marking, and local façade/building regulations.
      </div>
    </section>
  </div>

  <script>
    (function () {
      const buttons = Array.from(document.querySelectorAll('.btn'));
      const cards = Array.from(document.querySelectorAll('.filterable'));

      function applyFilter(filter) {
        buttons.forEach(btn => btn.classList.toggle('active', btn.dataset.filter === filter));
        cards.forEach(card => {
          const tags = (card.dataset.tags || '').split(/\s+/).filter(Boolean);
          const keep = filter === 'all' || tags.includes(filter);
          card.classList.toggle('muted', !keep);
        });
      }

      buttons.forEach(btn => {
        btn.addEventListener('click', () => applyFilter(btn.dataset.filter));
      });

      applyFilter('all');
    })();
  </script>
</body>
</html>