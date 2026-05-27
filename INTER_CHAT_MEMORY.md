# Inter-Chat Memory

PVplant uses `.memory/` as its durable inter-chat memory layer for source authority, iWin/BIPV research state, architecture decisions, assumptions, vendor-data gaps, validation evidence, and unresolved conflicts.

Record:

- decisions that affect future PVplant work
- validation evidence and audit results
- architecture assumptions and overturn conditions
- vendor-data-required items
- standards, commissioning, FMEA, and calculation gaps
- conflicts between local docs, public sources, and project assumptions
- project-specific conventions from `AGENTS.md`
- changes to A4/A1/A2/A3 topology ranking, including source and overturn condition
- source-pack load-order changes for NotebookLM or other research tools
- price evidence changes only when they include source path, normalized unit, and applicability limit
- vendor questionnaire responses, missing fields, and response-matrix status

Start with:

- `.memory/hubs/Agent Context Bootstrap and Memory Layer.md`
- `.memory/hubs/Current State Mirror.md`
- `.memory/hubs/Evidence Index.md`
- `.memory/hubs/Validation and Open Items.md`
- `.memory/daily/2026-05-26.md`

Current must-preserve facts:

- `AGENTS.md` is the root instruction base and should not be overwritten by generated templates.
- The current topology ranking is conditional: A4 first, A1 second, A2 fallback, A3 weaker.
- One blind module is the current practical controllable PV unit; slat-level commercial electronics are rejected as near-term practical granularity.
- Final architecture, TRS, procurement, installation, or compliance-readiness claims remain blocked until the hard gates in `CHECKPOINT.md` are closed.
