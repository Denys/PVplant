Think suggest prompts for use of evidence to report pipeline - skill to analyze throughtfully one by one pepers in folder: C:\Users\Denys\Documents\Projects\PVplant\claude_literature

Tuesday 17:57

Worked for 57s

**Executive Summary**

Use a **two-layer prompt set**: one orchestration prompt to define the queue and output rules, then one repeatable **single-paper extraction prompt** for each PDF. Do not ask Codex to synthesize all papers first; that will blur evidence strength. The synthesis prompt should run only after every paper has its own evidence index.

**Conclusion**

Best direction: analyze each paper against the current BIPV/iWin blockers: electrical envelope, MLPE granularity, shutdown/isolation, thermal packaging, moving-interface/serviceability, diagnostics, and economics. Preserve epistemic labels: Verified public fact, Standards-backed framing, Public clue, Engineering inference, Vendor-data required.

**Personal Suggestion**

Start with the two strongest-looking technical papers, not the web article:

1. Review on Building-Integrated Photovoltaics Electrical System Requirements and Module-Integrated Converter Recommendations.pdf
2. Building Integrated Photovoltaic Systems -- Characteristics and Power Management.pdf
3. Effects of Power Optimizer Application in a Building-Integrated Photovoltaic System According to Shade Conditions.pdf
4. A comprehensive techno-economic review of microinverters.pdf
5. accelerate-solar.com-Power Optimizer vs Microinverter Which Is Better in Accelerate Solar-fpscreenshot.pdf

Treat the Accelerate Solar screenshot as **public clue / vendor-style framing**, not as technical authority.

`Use the evidence-to-report-pipeline skill. Goal: Create a controlled one-paper-at-a-time evidence workflow for the folder: C:\Users\Denys\Documents\Projects\PVplant\claude_literature Context: This supports the BIPV/iWin pre-design effort. Preserve the project evidence taxonomy: Verified public fact, Standards-backed framing, Public clue, Engineering inference, Vendor-data required. Do not rank architectures or vendors. Architecture scoring is blocked until electrical-envelope and shutdown/service-boundary inputs are populated. Do: 1. Inventory all files in the folder and assign stable source_id values. 2. Propose the paper processing order from most authoritative/technical to least authoritative. 3. For each source, state whether it appears peer-reviewed, standards-like, review paper, case-study, vendor/web article, or screenshot. 4. Stop after the inventory and proposed order. Do not analyze paper content yet. Deliver: source_inventory table with source_id, filename, type, likely relevance, expected risk of bias, and recommended processing order.`

Repeat this prompt once per paper:

`Use the evidence-to-report-pipeline skill. Goal: Analyze exactly one paper thoughtfully and traceably: <PASTE EXACT FILE PATH HERE> Context: This paper supports BIPV/iWin pre-design research for glazing-integrated photovoltaic venetian blinds / PV shading devices. The current project blockers are: electrical envelope, MLPE granularity, shutdown/isolation state, thermal/packaging limits, moving electrical interfaces, diagnostics, serviceability, and economics. Rules: Analyze only this one paper. Do not synthesize across other papers unless explicitly comparing to previously extracted evidence. Classify every non-trivial claim as: Verified public fact, Standards-backed framing, Public clue, Engineering inference, or Vendor-data required. Separate direct evidence from interpretation. Preserve exact units, dates, equations, standards numbers, test conditions, and page locators. Do not convert review-paper statements into project facts without checking whether they are generic, bounded, or vendor/product-specific. Extract: 1. Bibliographic metadata and paper type. 2. Research question / scope. 3. BIPV-relevant claims. 4. Electrical envelope data: Voc, Vmp, Isc, Imp, MPPT windows, voltage classes, converter topology. 5. Shading and mismatch evidence. 6. MLPE / optimizer / microinverter / module-integrated converter evidence. 7. Thermal, reliability, packaging, and serviceability evidence. 8. Standards, codes, and qualification references. 9. Economics evidence, if any. 10. Claims that are not transferable to iWin-type moving PV blinds. Deliver: - source summary - evidence_index table with page/section locators - claim-strength table - assumptions/inferences - contradictions or weak claims - iWin relevance score: high / medium / low, with reasons - next closure questions this paper helps answer - what remains vendor-data-required`

Use this after each paper, before moving to the next one:

`Use the evidence-to-report-pipeline skill. Goal: Create a short per-paper handoff note from the just-analyzed source: <PASTE SOURCE_ID AND FILE NAME> Do: Condense the extraction into a restart-safe note for BIPV_Brain.md or a future literature matrix. Do not add new claims. Only reuse evidence already extracted from this paper. Deliver: 1. Three strongest reusable facts with page locators. 2. Three claims that are useful but conditional. 3. Project blockers affected. 4. One sentence saying whether this paper changes the current working conclusion. 5. Exact next paper to analyze.`

Use this only after all five papers are processed:

`Use the evidence-to-report-pipeline skill. Goal: Synthesize the completed one-paper evidence indexes from: C:\Users\Denys\Documents\Projects\PVplant\claude_literature Context: The synthesis must support BIPV/iWin pre-design decisions, not generic literature review prose. Do: 1. Compare evidence across papers by blocker: electrical envelope, shading/mismatch, MLPE granularity, shutdown/isolation, thermal/packaging, moving-interface/serviceability, diagnostics, economics. 2. Separate consensus, contradiction, and one-source-only claims. 3. Identify which claims can update BIPV_Brain.md and which must remain literature-only. 4. Build a closure matrix mapping evidence to the missing-information streams. 5. State whether any hard gate is now closed. If not, say "not closed" and list the exact missing inputs. Deliver: - literature synthesis memo - cross-paper evidence matrix - contradiction log - vendor-data-required register - recommended next artifact updates - no architecture ranking unless the hard gates are actually populated`