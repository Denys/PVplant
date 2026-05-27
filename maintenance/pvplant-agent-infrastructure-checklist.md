# PVplant Agent Infrastructure Checklist

Use after changes to root support docs, `.memory/`, or agent workflow files.

## Checks

1. Confirm `AGENTS.md` remains the root instruction base and was not overwritten by a generic template.
2. Run the broad agent infrastructure audit only as a coarse check. In PVplant, v0.2 can false-positive on pre-existing PDFs, docx, plugin JS, and git pack files because it scans the whole tree:

```powershell
powershell -ExecutionPolicy Bypass -File C:\Users\denko\.codex\skills\agent-infrastructure-deployer\scripts\audit-agent-infrastructure.ps1 -TargetPath C:\Users\denko\PVplant -CanonicalName PVplant -RequireSpecialization
```

3. Run targeted content checks:

```powershell
rg "PVplant|iWin|BIPV|Specialized Codex agent infrastructure|vendor-data|commissioning" README.md CHECKPOINT.md PROJECT_TRACKER.md CHANGELOG.md INTER_CHAT_MEMORY.md .memory docs maintenance --hidden
rg "generic Codex agent infrastructure|Customize agent instructions|Project-specific verification commands: not recorded yet" README.md CHECKPOINT.md PROJECT_TRACKER.md CHANGELOG.md INTER_CHAT_MEMORY.md .memory docs maintenance --hidden --glob "!maintenance/pvplant-agent-infrastructure-checklist.md"
```

4. Confirm any new research note uses `docs/research/pvplant-iwin-research-template.md`.
5. Record durable decisions in `.memory/daily/`.
6. Confirm current architecture wording stays conditional unless hard gates are closed:

```powershell
rg "A4|A1|A2|A3|conditional|blocked|hard gate|Voc|Isc|thermal|vendor" README.md CHECKPOINT.md PROJECT_TRACKER.md .memory docs --hidden
```

7. Confirm generated support files cite available local evidence paths:

```powershell
rg "BIPV_Codex_Edition/companion|Daily/2026-05-21_iwin_pv_blinds_firecrawl_topology_synthesis|Daily/2026-05-26_iwin_topology_decision_matrix|Daily/2026-05-26_iwin_price_evidence|NotebookLM/Sources/UPLOAD_MANIFEST.md" README.md CHECKPOINT.md PROJECT_TRACKER.md .memory docs maintenance --hidden
```
