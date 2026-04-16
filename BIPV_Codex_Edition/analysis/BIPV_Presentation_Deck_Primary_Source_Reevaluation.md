# BIPV Presentation Deck Primary-Source Reevaluation

## Objective / decision

Reevaluate the prior deck audit against the actual uploaded PDF slide decks as the primary source for what the decks explicitly claim, determine whether any conclusions change, and identify which claims become more problematic once the exact slide wording and matrices are reviewed directly.

## Evidence by tag

- `Verified public fact`
  - The five uploaded PDFs are the source-of-record for the claims being made in the presentation set.
  - The rendered slides reviewed here visibly carry a `NotebookLM` watermark and do not provide source citations, equations, or appendix calculations on the slides inspected.
- `Standards-backed framing`
  - None added by the decks themselves. The decks invoke compliance and safety language, but the slides reviewed do not provide clauses, listing references, or standards tables that would close those claims.
- `Public clue`
  - The decks consistently frame the design direction as module-level or distributed power processing rather than centralized string MPPT.
  - The decks consistently treat facade-integrated DC routing, partial shading, and thermal loading as first-order risks.
- `Engineering inference`
  - The primary-source slide wording strengthens the earlier conclusion that the decks are better as directional framing than as decision-grade engineering evidence.
  - Several claims that previously looked merely aggressive read as categorical or compliance-like once the actual slides are rendered and reviewed.
- `Vendor-data required`
  - Any architecture-specific claim involving voltage caps, shutdown behavior, safety pass/fail, thermal survivability, ROI, PR, NPV, LCOE, slim-profile fit, or insurability remains blocked without datasheets, drawings, qualification basis, and project calculations.

## Numbers, clauses, or source pages used

- Deck 1, page 3:
  - `5%` area shaded
  - `80%` total power drop
- Deck 1, page 7:
  - `150 C+` at the breakdown site
  - thermal color bar shown up to `200 C+`
- Deck 3, page 3:
  - `600V-1000V DC` in the facade
- Deck 3, page 7:
  - `currents >2mA`
- Deck 3, page 12:
  - `maximum open-circuit voltage capped below 120V per sector`
- Deck 4, page 12:
  - `>74% PR`
- Deck 5, page 10:
  - `60 C+`

No standards clauses, product listings, or calculation pages are provided in the rendered slides reviewed.

## Reevaluated conclusion

The prior audit remains directionally correct, but the primary-source deck review strengthens the negative side of the verdict. The actual slide wording is more absolute than the earlier text extraction suggested. The biggest shift is not that the decks reveal new hard evidence; it is that they reveal stronger overstatement.

The result is:

- The earlier concerns about unsupported safety/compliance claims are confirmed and should be stated more strongly.
- The earlier concerns about unsupported economics are confirmed and should be stated more strongly.
- The earlier concerns about premature optimizer preference are confirmed and should be stated more strongly.
- No hard-gate electrical-envelope item was closed by the uploaded decks.

## Deck-by-deck delta against the prior audit

| Deck | Prior position | What the primary-source review changes |
| --- | --- | --- |
| `1_BIPV_Shading_Mitigation.pdf` | Directionally correct but rhetorically overstated | Confirmed. The actual slide language is explicitly catastrophic: `5% = 80%`, `150 C+`, and facade fire escalation. No slide-level citation closes those numbers. |
| `2_The_Granularity_Paradigm.pdf` | Strong conceptual case for DMPPT, weak ROI proof | Confirmed. The ROI slide is a conceptual curve with no input assumptions, no actual data points, and no reliability penalty treatment. |
| `3_BIPV_Safety_Architecture.pdf` | Raises the right hazards but overstates safe-voltage and compliance claims | Strengthened negatively. The actual slides explicitly label microinverters as `Safe`, optimizers as `Pass`, claim `below 120V per sector`, and conclude the architecture is `safe, insurable, and scalable`. This is materially more absolute than a cautious engineering review can support. |
| `4_Active_Envelope_Engineering.pdf` | Good systems narrative, weak quantification | Strengthened negatively. The slides explicitly say CMPPT `fails`, CAPEX is the `absolute ONLY friction point`, and DMPPT unlocks `>74% PR`, `LCOE Superiority`, and `Highly Positive NPV` without calculation basis. |
| `5_BIPV_SD_Architectures_ACvsDC_Comparison.pdf` | Useful comparison framework, premature optimizer conclusion | Strengthened negatively. The actual slides explicitly present optimizers as `IDEAL` for double-skin and dynamic louvers, say microinverters are too bulky or thermally weak, and treat optimizer durability claims as settled. |

## Claim checks from the actual slide wording

### 1. Shading-loss and hot-spot claims

- Deck 1, page 3 states:
  - `a mere 5% shadow ... can trigger a catastrophic 80% drop in total power generation`
- Deck 1, page 7 states:
  - `Temperatures rapidly spike to 150 C+ at the breakdown site`
  - `severe fire risks in building facades`

Reevaluation:

- The earlier audit stands.
- The primary-source wording confirms these are presented as generic outcomes, not bounded case-specific examples.
- This should stay classified as a mix of `Verified public fact` for the underlying mismatch/hot-spot physics and `Engineering inference` or `Public clue` for the magnitude and facade-fire consequence as presented.

### 2. Centralized MPPT failure claims

- Deck 1, page 11 states the centralized inverter gets `stuck` on a `false local peak`.
- Deck 2, page 7 uses the same logic graphically.

Reevaluation:

- The underlying partial-shading multi-peak issue remains real.
- The slide wording still overgeneralizes from conventional local tracking behavior to centralized MPPT as a class.
- The earlier audit remains valid: this is conditionally supported, not universally closed.

### 3. Safety and compliance claims

- Deck 3, page 7 states the facade presents a lethal shock hazard at `currents >2mA`.
- Deck 3, page 11 labels microinverter architecture `Safe`, optimizer architecture `Pass`, and centralized string `Fail`.
- Deck 3, page 12 states a `DC bus per floor` approach keeps field strength too low to sustain a catastrophic arc and caps `Voc` below `120V per sector`.
- Deck 3, page 14 states the three-pillar approach moves the design into a `safe, insurable, and scalable operational zone`.
- Deck 4, page 9 states the same bus-per-floor logic `ensures strict, inherent compliance with IEC/NEC safety audits` and `allows total safe intervention`.

Reevaluation:

- These claims are stronger and less defensible than the earlier summary wording suggested.
- The reevaluated status should remain `unsupported` or `potentially misleading` unless backed by:
  - the actual single-line
  - residual-voltage behavior
  - shutdown timing
  - applicable code path
  - product listings
  - arc-fault detection qualification
  - service-state definition

### 4. Economics and PR claims

- Deck 2, page 15 shows an unlabeled conceptual ROI curve and states recovered yield `vastly outpaces` the hardware premium.
- Deck 4, page 10 says CAPEX is the `absolute ONLY friction point`.
- Deck 4, page 12 states DMPPT consistently unlocks `>74% PR`.
- Deck 4, page 14 states `LCOE Superiority` and `Highly Positive NPV`.

Reevaluation:

- The primary-source review confirms these are not just missing citations; they are non-auditable claims presented as settled outputs.
- No irradiance model, tariff, replacement schedule, failure-rate assumption, discount rate, degradation basis, availability model, or baseline PR definition is shown.
- The earlier audit should therefore be read strictly: these are unsupported and remain blocked.

### 5. Optimizer-versus-microinverter claims

- Deck 5, page 8 states optimizers maintain high-voltage DC within the facade while microinverters eliminate it.
- Deck 5, page 10 states BIPV temperatures `routinely exceed 60 C`, microinverters need large electrolytics, and optimizers `rely entirely on solid-state electronics`.
- Deck 5, page 13 labels power optimizers `IDEAL` for double-skin facades and dynamic sun-tracking louvers, while microinverters are called `too bulky` or heat-limited.

Reevaluation:

- The primary-source review confirms that the deck is not simply comparing architectures; it is asserting a winner.
- These claims remain blocked by missing:
  - actual product candidates
  - package dimensions
  - heat rejection path
  - derating curves
  - enclosure temperature limits
  - capacitor strategy by product
  - service access geometry
  - branch and shutdown architecture

## Assumptions and vendor-data-required items

- Still missing and still architecture-blocking:
  - `Voc,max`
  - `Isc,max`
  - MPPT window requirement
  - disconnect / isolation boundary
  - protection concept
  - connector family
  - cable class
  - replacement boundary
- Still missing and now highlighted more strongly by the actual slides:
  - PR definition and baseline
  - economics model inputs
  - arc-fault detector basis
  - residual-voltage and firefighter state
  - actual per-floor segmentation logic
  - thermal mission profile in the cavity / glazing / louver stack
  - product-level MLPE packaging and derating evidence

## Checks / calculations performed

- Extracted text and rendered selected slides from all five uploaded PDFs into a dedicated workspace subfolder:
  - `tmp/2026-04-16_audit_presentation_decks`
- Checked whether direct slide review overturns the earlier audit:
  - result: no positive overturn
  - result: several overstatement findings are stronger after visual review
- Checked whether any slide closes the electrical-envelope hard gates:
  - result: none do
- Checked whether any slide provides auditable economics:
  - result: none do
- Checked whether any slide provides clause-level compliance evidence:
  - result: none do

## Risks, contradictions, and what could overturn the result

- The main risk is not missing the direction of travel; it is letting deck rhetoric substitute for engineering closure.
- The strongest overturn scenarios would be vendor or project evidence showing:
  - a documented low-voltage segmented architecture with verified shutdown behavior
  - product-specific thermal qualification and derating limits
  - product-specific microinverter or optimizer dimensions and replacement method
  - a real Lugano case economic model with traceable assumptions
- Until those exist, the architecture preference remains conditional.

## Next artifact updates needed

- Keep the earlier detailed audit as the broader claim review:
  - `analysis/BIPV_Presentation_Deck_Audit.md`
- Use this primary-source note as the deck-claim calibration addendum.
- Next durable work should focus on:
  - Lugano normative checklist
  - electrical-envelope worksheet
  - shutdown-state definition
  - vendor-data request package
  - architecture decision matrix only after the hard gates are populated
