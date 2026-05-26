# Understand-Anything PVplant Cheat Sheet

## Executive Summary

Run `/understand` first from `C:\Users\Denys\Documents\Projects\PVplant` to create `.understand-anything\knowledge-graph.json`. Most other tools read that graph rather than scanning the project again.

Recommended PVplant sequence:

1. `/understand "C:\Users\Denys\Documents\Projects\PVplant" --full --no-auto-update`
2. `/understand-domain`
3. `/understand-dashboard "C:\Users\Denys\Documents\Projects\PVplant"`
4. Use `/understand-chat`, `/understand-explain`, `/understand-diff`, and `/understand-onboard` as graph readers.

Personal suggestion: for PVplant, use these tools as a navigation and dependency-map layer, not as design authority. Keep BIPV/iWin architecture conclusions conditional until the electrical envelope, shutdown/isolation boundary, protection concept, connector family, cable class, and replacement boundary are populated.

PVplant root used in examples:

```powershell
C:\Users\Denys\Documents\Projects\PVplant
```

## Tool Map

| Tool | What it does | Best PVplant use | Needs graph first |
|---|---|---|---|
| `/understand` | Builds the structural knowledge graph for files, components, relationships, layers, and tours. | Index the whole PVplant repo or a focused BIPV subfolder. | No |
| `/understand-dashboard` | Opens the interactive graph dashboard. | Explore BIPV documents, reports, literature folders, and cross-folder relationships visually. | Yes |
| `/understand-chat` | Answers repo questions by searching the generated graph. | Ask where assumptions, vendor gaps, topology evidence, or report outputs live. | Yes |
| `/understand-explain` | Deep-dives into one file, component, or node from the graph. | Explain `BIPV_Codex_Edition\BIPV_Brain.md`, a report, or a standards-envelope artifact. | Yes |
| `/understand-diff` | Maps git changes to graph nodes and affected areas. | Review how edits to assumptions, BIPV prompts, or evidence reports affect the project. | Yes |
| `/understand-domain` | Extracts business/domain/process flows into a domain graph. | Map PVplant as research workflow, evidence acquisition, standards closure, vendor-data closure, report synthesis. | No, but better after `/understand` |
| `/understand-knowledge` | Builds a graph from a Karpathy-pattern wiki: `index.md`, wikilinks, raw sources, schema/log files. | Use only after a PVplant subcorpus is arranged as a wiki, for example an iWin evidence wiki. | No |
| `/understand-onboard` | Generates an onboarding guide from graph layers, tour steps, and high-level nodes. | Create a project orientation for a new BIPV reviewer or engineering collaborator. | Yes |

## Command Examples

### `/understand`

Description: scans the selected project and writes the main graph to:

```text
C:\Users\Denys\Documents\Projects\PVplant\.understand-anything\knowledge-graph.json
```

Use when you need a current project map before asking graph-based questions.

Examples:

```text
/understand "C:\Users\Denys\Documents\Projects\PVplant" --full --no-auto-update
```

Use this for a clean full PVplant graph without adding a commit hook.

```text
/understand "C:\Users\Denys\Documents\Projects\PVplant\BIPV_Codex_Edition" --full --language en
```

Use this for a focused graph of the iWin/BIPV pre-design companion folder.

PVplant use cases:

| Situation | Example question after graph exists |
|---|---|
| You want to see project structure | "Which folders contain evidence, source inventory, and report outputs?" |
| You need BIPV artifact routing | "Where are assumption registers, vendor questionnaires, standards envelope, and commissioning templates connected?" |
| You want a graph before report work | "Which documents should be read before synthesizing DMPPT topology evidence?" |

Validation check:

```powershell
Test-Path "C:\Users\Denys\Documents\Projects\PVplant\.understand-anything\knowledge-graph.json"
```

### `/understand-dashboard`

Description: launches the web dashboard for the generated graph.

Example:

```text
/understand-dashboard "C:\Users\Denys\Documents\Projects\PVplant"
```

PVplant use cases:

| Use case | What to inspect |
|---|---|
| Find major project clusters | `BIPV_Codex_Edition`, `claude_literature`, `Daily`, `NotebookLM`, `reports` |
| Check whether literature and reports are connected | Edges from source inventory and report artifacts |
| Review onboarding path | Tour steps and layer grouping |

Use after `/understand`. If the dashboard says no graph exists, rerun `/understand` on the same project root.

### `/understand-chat`

Description: answers questions using `.understand-anything\knowledge-graph.json`.

Examples:

```text
/understand-chat Where does PVplant track vendor-data-required gaps for iWin BIPV?
```

```text
/understand-chat Which artifacts connect Daily/2026-05-21_iwin_pv_blinds_firecrawl_topology_synthesis to reports/PV_DMPPT_Book_Chapter_Map_2026-05-21?
```

```text
/understand-chat Find all graph nodes related to DMPPT, MPPT, microinverter, optimizer, IEC 62548, and shutdown.
```

PVplant use cases:

| Situation | Good query |
|---|---|
| Evidence routing | "Which files mention source inventory, evidence index, or action log?" |
| Hard-gate tracking | "Where are Voc, Isc, MPPT window, isolation boundary, protection concept, cable class, and replacement boundary discussed?" |
| Report reuse | "Which report files are connected to NotebookLM source mapping?" |

Do not ask it to decide the architecture unless the hard-gate fields are present. Use it to find evidence and gaps.

### `/understand-explain`

Description: explains one file or graph component in depth, including incoming and outgoing relationships.

Examples:

```text
/understand-explain BIPV_Codex_Edition\BIPV_Brain.md
```

```text
/understand-explain claude_literature\source_inventory.md
```

```text
/understand-explain Daily\2026-05-21_iwin_pv_blinds_firecrawl_topology_synthesis
```

PVplant use cases:

| Target | Why use it |
|---|---|
| `BIPV_Codex_Edition\BIPV_Brain.md` | Understand the project-memory anchor and linked BIPV artifacts. |
| `claude_literature\source_inventory.md` | Audit the literature queue and source classification. |
| `reports\PV_DMPPT_Book_Chapter_Map_2026-05-21` | Trace how the report package is organized. |
| `firecrawl_BIPV_prompts.md` | Understand research-prompt intent before reuse. |

Best pattern: ask for explanation of one artifact at a time, then use `/understand-chat` for cross-artifact questions.

### `/understand-diff`

Description: reads current git changes and maps them to graph nodes, affected files, and likely risks.

Example:

```text
/understand-diff
```

PVplant use cases:

| Change type | What to ask it to check |
|---|---|
| Edited `BIPV_Codex_Edition\AGENTS.md` | Whether workflow rules conflict with existing BIPV guardrails. |
| Edited assumptions or standards files | Which reports, prompts, or closure artifacts may need refresh. |
| Added source PDFs to `claude_literature` | Whether source inventory and processing order need updates. |
| Edited report package files | Whether evidence index, source inventory, action log, and report narrative still align. |

PVplant-specific review prompt:

```text
/understand-diff Check whether these changes affect BIPV hard gates, evidence tags, vendor-data-required items, or report traceability.
```

Current note: PVplant already has unrelated dirty Obsidian UI/theme files. Do not treat those as BIPV engineering changes unless the task is about the Obsidian vault.

### `/understand-domain`

Description: creates a domain/process graph. If the structural graph already exists, it derives from it. Otherwise it performs a lighter scan.

Examples:

```text
/understand-domain
```

```text
/understand-domain --full
```

PVplant domain model to expect:

| Domain/process | Candidate PVplant evidence |
|---|---|
| BIPV pre-design governance | `BIPV_Codex_Edition\AGENTS.md`, `PLAN.md`, `BIPV_Brain.md` |
| Literature evidence intake | `claude_literature\source_inventory.md`, PDFs |
| Firecrawl source discovery | `.firecrawl`, `firecrawl_BIPV_prompts.md`, `Daily\2026-05-21_iwin_pv_blinds_firecrawl_topology_synthesis` |
| NotebookLM source mapping | `NotebookLM`, `reports\PV_DMPPT_Book_Chapter_Map_2026-05-21` |
| Vendor-data closure | questionnaires, assumption registers, standards/design-envelope files |

Use it when you need workflow understanding rather than file dependency understanding.

### `/understand-knowledge`

Description: analyzes a wiki-style knowledge base with `index.md`, wikilinks, raw sources, and optional schema/log files.

Current PVplant fit: the quick scan of `C:\Users\Denys\Documents\Projects\PVplant` did not find an `index.md`, so the PVplant root is not currently a direct target for this tool.

Use it after organizing a subcorpus into a wiki pattern, for example:

```text
C:\Users\Denys\Documents\Projects\PVplant\Obsidian\iWin_Wiki
  index.md
  log.md
  raw\
  standards\
  topology\
  vendor-data\
```

Example after such a wiki exists:

```text
/understand-knowledge "C:\Users\Denys\Documents\Projects\PVplant\Obsidian\iWin_Wiki"
```

PVplant use cases:

| Wiki topic | Useful graph questions |
|---|---|
| DMPPT taxonomy | Which concepts cite Xiao 2017, IEC 62548, and microinverter literature? |
| iWin vendor-data closure | Which claims remain vendor-data-required rather than verified public fact? |
| Standards map | Which notes connect IEC/UL constraints to architecture candidates? |

Do not point it at arbitrary folders of PDFs only. It expects a wiki-style Markdown layer.

### `/understand-onboard`

Description: generates an onboarding guide from graph metadata, layers, tour steps, file-level nodes, and complexity hotspots.

Examples:

```text
/understand-onboard
```

```text
/understand-onboard Generate an onboarding guide for an electrical engineer reviewing PVplant BIPV/iWin evidence, with emphasis on source authority and hard gates.
```

PVplant use cases:

| Audience | Emphasis |
|---|---|
| New BIPV reviewer | Source hierarchy, assumptions, standards envelope, report packages. |
| Vendor-review collaborator | Vendor-data-required items, questionnaire/rubric artifacts, closure workflow. |
| Research assistant | Literature queue, Firecrawl outputs, NotebookLM source map, evidence indexes. |

Suggested PVplant onboarding shape:

1. Project purpose and authority boundaries.
2. Folder map.
3. Evidence taxonomy: verified public fact, standards-backed framing, public clue, engineering inference, vendor-data required.
4. Hard gates before architecture ranking.
5. How to update source inventory, assumption register, evidence index, and action log.

## PVplant Working Recipes

### First Graph Pass

```text
/understand "C:\Users\Denys\Documents\Projects\PVplant" --full --no-auto-update
/understand-domain
/understand-dashboard "C:\Users\Denys\Documents\Projects\PVplant"
```

Use this after installing or updating the tools.

### Evidence Navigation

```text
/understand-chat Which PVplant files contain source inventories, evidence indexes, action logs, or report packages?
/understand-explain claude_literature\source_inventory.md
/understand-explain reports\PV_DMPPT_Book_Chapter_Map_2026-05-21
```

Use this before writing a report or updating the BIPV memory anchor.

### BIPV Hard-Gate Audit

```text
/understand-chat Find where PVplant tracks Voc, Isc, MPPT window, shutdown, isolation, cable class, connector family, protection concept, and replacement boundary.
/understand-domain --full
```

Use this before any architecture comparison.

### Change Review

```text
/understand-diff Check graph impact and flag any affected evidence tags, assumptions, standards references, or vendor-data-required closure items.
```

Use this after editing BIPV prompts, assumptions, standards matrices, source inventories, or report packages.

## Output Files To Expect

| Output | Path |
|---|---|
| Structural graph | `C:\Users\Denys\Documents\Projects\PVplant\.understand-anything\knowledge-graph.json` |
| Domain graph | `C:\Users\Denys\Documents\Projects\PVplant\.understand-anything\domain-graph.json` |
| Temporary/intermediate files | `C:\Users\Denys\Documents\Projects\PVplant\.understand-anything\tmp\` or `intermediate\` |
| Dashboard build/runtime | Resolved through `C:\Users\Denys\.understand-anything-plugin\packages\dashboard` |

## Validation Checklist

After `/understand`:

```powershell
Test-Path "C:\Users\Denys\Documents\Projects\PVplant\.understand-anything\knowledge-graph.json"
```

After `/understand-domain`:

```powershell
Test-Path "C:\Users\Denys\Documents\Projects\PVplant\.understand-anything\domain-graph.json"
```

Before relying on graph answers:

```powershell
Get-Item "C:\Users\Denys\Documents\Projects\PVplant\.understand-anything\knowledge-graph.json" |
  Select-Object FullName, Length, LastWriteTime
```

If the graph predates important source additions or report edits, rerun `/understand`.

## PVplant Guardrails

Treat graph-derived answers as navigation evidence. They can tell you where relevant artifacts and relationships are, but they do not close engineering assumptions.

For BIPV/iWin work, keep these as blockers until explicitly populated:

| Gate | Why it blocks design decisions |
|---|---|
| `Voc,max`, `Isc,max`, `Vmp/Imp/Pmp` per blind/module | Defines electrical envelope and MLPE compatibility. |
| MPPT window and granularity | Determines whether blind/module/submodule tracking is plausible. |
| Shutdown/disconnect/isolation boundary | Defines safety architecture and service state. |
| Protection concept | Defines fusing, backfeed, fault handling, and standards pathway. |
| Connector family and cable class | Affects moving-interface reliability, fire/load constraints, and replacement. |
| Replacement boundary | Determines maintainability and vendor responsibility. |
| Thermal envelope | Determines derating, electronics placement, and service risk. |

Use `/understand-chat` to locate where those gates are discussed. Use source files, standards, vendor documents, and evidence indexes to close them.

