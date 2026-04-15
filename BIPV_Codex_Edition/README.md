# BIPV Assistant — Codex Edition

This package is a **mixed Codex customization**:
- `AGENTS.md` keeps the always-on repo guidance concise.
- `.agents/skills/bipv-predesign-assistant/SKILL.md` carries the heavier reusable BIPV workflow.
- `.agents/skills/bipv-predesign-assistant/agents/openai.yaml` adds lightweight skill metadata.

## Intended use
Use this package for iWin-type glazing-integrated PV blind pre-design tasks where the agent must keep evidence classes, design-envelope checks, assumption visibility, commissioning logic, FMEA gates, and vendor-data closures explicit.

## Installation
- Put `AGENTS.md` at the repo root.
- Put the skill folder under `.agents/skills/`.
- Keep the source companion documents in the repo so the skill can cite and update them.

## Why this split
The package follows the Codex guidance that `AGENTS.md` should stay small and durable, while richer reusable workflows belong in skills.
