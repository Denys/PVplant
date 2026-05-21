# Action Log

| Owner | Action | Blocking severity | Evidence needed | Due date / milestone |
|---|---|---:|---|---|
| Codex / Denys | Extract formal page-level citations from the required sources: Xiao 2017, Chivelet 2025, IEC 62548, and Photovoltaic Systems Technology 2024. | Medium | PDF page numbers and short locators for each evidence row. | Before deck/report publication |
| Denys | Define whether "hybrid DMPPT" is project shorthand for mixed DC/AC MLPE, mixed granularity, mixed source HRES, or something else. | High | One explicit project definition. | Before architecture scoring |
| Denys / vendor | Populate iWin electrical hard gates: Voc,max, Isc,max, Pmp per blind/segment, MPPT voltage/current window, safe shutdown state, isolation class, moving-cable boundary, thermal limits, and service boundary. | High | Vendor datasheet or measured/prototype values. | Before selecting optimizer vs microinverter |
| Codex | Build a topology decision matrix only after page citations and vendor hard gates exist. | Medium | Evidence-index rows plus vendor envelope. | Next synthesis pass |
| Codex / Denys | Check the current national implementation of IEC 62548 and adjacent PCE standards before treating IEC 62548:2016 as acceptance authority. | Medium | Current standard edition/adoption and applicable local electrical code. | Before compliance claims |
| Codex | If simulation is needed, use Khatib/Elmenreich 2016 Ch. 3 and Xiao 2017 power-conditioning chapters as the modeling starting point. | Low | Converter topology, PV segment model, irradiance/shading profiles. | Simulation phase |
