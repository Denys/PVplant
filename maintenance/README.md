# Maintenance

Store repeatable project maintenance routines and scripts here.

Current routines:

- Run `pvplant-agent-infrastructure-checklist.md` after editing root support docs, `.memory/`, `docs/`, or `maintenance/`.
- Keep `CHECKPOINT.md`, `PROJECT_TRACKER.md`, and `.memory/hubs/Current State Mirror.md` consistent after any architecture-state change.
- Keep `.memory/hubs/Evidence Index.md` append-only and reference exact source paths.
- Recheck `NotebookLM/Sources/UPLOAD_MANIFEST.md` before NotebookLM-based research.
- Do not use the broad v0.2 audit as the only gate in this repo; it can scan unrelated binary or packaged files and report false positives.

Useful documentation checks:

```powershell
rg "PVplant|iWin|BIPV|A4|A1|vendor-data|commissioning|NotebookLM" README.md CHECKPOINT.md PROJECT_TRACKER.md CHANGELOG.md INTER_CHAT_MEMORY.md .memory docs maintenance --hidden
```

For stale generated-text markers, use the exact command in `pvplant-agent-infrastructure-checklist.md` so the checklist can exclude itself deliberately.
