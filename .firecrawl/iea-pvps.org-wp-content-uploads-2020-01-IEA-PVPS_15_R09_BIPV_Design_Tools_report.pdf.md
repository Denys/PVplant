# BIPV Design and Performance Modelling: Tools and Methods

### Report IEA-PVPS T15-09:2019

* * *

## INTERNATIONAL ENERGY AGENCY PHOTOVOLTAIC POWER SYSTEMS PROGRAMME

# BIPV Design and Performance Modelling: Tools and Methods

## IEA PVPS Task 15 Subtask E – Demonstration

## Draft Report IEA-PVPS T15-09: 2019 October 2019

Editors: Nebojsa Jakica (University of Southern Denmark, Denmark), Rebecca J. Yang (RMIT University, Australia) Johannes Eisenlohr (Fraunhofer ISE, Germany)

Authors: Nebojsa Jakica, Mikkel Kragh (University of Southern Denmark, Denmark), Rebecca J. Yang

W.M.Pabasara, U. Wijeratne, Eric Too, Ron Wakefield (RMIT University, Australia), Johannes Eisenlohr (Fraunhofer ISE, Germany), Simon Boddaert (Centre Scientifique et Technique du Bâtiment, France), Pierluigi Bonomo, Erika Saretta, Francesco Frontini (SUPSI, Switzerland), Alessandra Zanelli (Politecnico di Milano, Italy), Sara Freitas (Lisboa E-Nova and Faculdade de
Ciências, Universidade de Lisboa, Portugal), Philippe ALAMY (EnerBIM, France), Jonathan Leloux (LuciSun, Belgium)

Cover photo: Study of Solar Radiation Potential for BIPV in NY, developed by University of Southern Denmark (courtesy of Nebojsa Jakica).

### ISBN: 978-3-906042-86-2

* * *

# Contents

Contents ... 3
Foreword ... 5
Executive summary ... 6

1. Introduction ... 7
2. Acknowledgments ... 8
3. Previous Studies and Reviews ... 9
4. Objectives ... 13
5. Methodology ... 14
6. Analysis of BIPV Planning Process ... 16
   6.1. BIPV Design ... 16
   _6.1.1. BIPV planning ... 16_ _6.1.2. Building Type ... 18_ _6.1.3. Interactive design ... 19_ _6.1.4. BIPV and Building Standards ... 20_ _6.1.5. Building integration ... 21_ _6.1.6. Level of Development ... 22_
   6.2. Environment ... 24
   _6.2.1. Terrain/Surroundings ... 24_ _6.2.2. Weather data ... 26_
   6.3. BIPV Performance Modelling ... 28
   _6.3.1. Simple vs. Complex BIPV cases ... 28_ _6.3.2. Loss mechanisms ... 28_ _6.3.3. Irradiance on PV ... 29_ _6.3.4. Temperature of PV ... 40_ _6.3.5. Electric DC output of PV ... 40_ _6.3.6. Power electronics /electric AC output of PV ... 41_ _6.3.7. Grid Infrastructure and limitations ... 41_ _6.3.8. Integrated PV performance models ... 42_ _6.3.9. Additional important aspects of BIPV performance modeling ... 43_ _6.3.10. Databases ... 45_ _6.3.11. Grid Infrastructure ... 47_
   6.4. Building Performance Simulation ... 47

* * *

_6.4.1. Structural ... 47_ _6.4.2. Energy demand ... 48_ _6.4.3. Energy PV yield ... 49_ _6.4.4. Energy Price ... 49_ _6.4.5. Emissions ... 49_ _6.4.6. Other ... 50_ _6.4.7. Optioneering ... 51_
6.5. Economics ... 52
_6.5.1. Costs ... 52_ _6.5.2. Benefits ... 53_ _6.5.3. Finance Modes ... 54_ _6.5.4. Financial Analyses ... 55_ _6.5.5. Government Incentives ... 56_
7\. Tools’ comparative analysis ... 58
8\. Discussion ... 62
9\. Conclusion ... 67
10\. Future work ... 68 This report consists of 82 pages, including the covers. Incomplete or misleading publication of the results is forbidden. Any part of this report may be reproduced, upon specific acknowledgment to IEA PVPS International Energy Agency Photovoltaic Power Systems Programme. October, 2019 Nebojsa Jakica Rebecca J. Yang Johannes Eisenlohr Editors of this report

* * *

# Foreword

The International Energy Agency (IEA), founded in November 1974, is an autonomous body within the framework of the Organization for Economic Co-operation and Development (OECD), which carries out a comprehensive programme of energy co-operation among its member countries.

The IEA Photovoltaic Power Systems Programme (PVPS) is one of the technological collaboration programmes (TCP’s) on research and development within the International Energy Agency (IEA). IEA PVPS has been established in 1993, and participants in the programme have been conducting a variety of joint projects regarding applications of photovoltaic (PV) conversion of solar energy into electricity.

The mission of the PVPS is “…to enhance the international collaboration efforts which accelerate the development and deployment of photovoltaic solar energy as a significant and sustainable renewable energy option…”. The underlying assumption is that the market for PV systems is gradually expanding from the niche‐markets of remote applications and consumer products to rapidly growing ones for building‐integrated and centralised PV generation systems.

Building Integrated PV (BIPV) is seen as one of the five major tracks for large market penetration of PV, besides price decrease, efficiency improvement, lifespan, and electricity storage. IEA PVPS Task 15 is an international collaboration to create an enabling framework and to accelerate the penetration of BIPV products in the global market of renewables and building envelope components, resulting in an equal playing field for BIPV products, Building Applied PV (BAPV) products and regular building envelope components, respecting mandatory, aesthetic, reliability and financial issues.

To reach this objective, an approach based on five key developments has been developed, focused on growth from prototypes to large-scale producible and applicable products. The key developments are dissemination, business modelling, regulatory issues, environmental aspects, and research and development sites.

This Task contributes to the ambition of realizing zero energy buildings and built environments. The scope of this Task covers new and existing buildings, different PV technologies, different applications, as well as scale difference from single-family dwellings to large-scale BIPV application in offices and utility buildings.

The current members of IEA PVPS Task 15 include Austria, China, Belgium, Canada, Denmark, France, Germany, Italy, Japan, Korea, Norway, The Netherlands, Spain, Sweden and Switzerland.

Further information on the activities and results of the Task can be found at [www.iea-pvps.org](http://www.iea-pvps.org/).

Michiel Ritzen, operating agent IEA PVPS Task 15

## October 2019

* * *

Executive summary

The given state-of-the-art review of BIPV design and management tools presents recent developments
in BIPV modelling concerning design and management processes with different levels of detail, targeting
various stakeholders and their requirements in the BIPV value chain in relation to geophysical, technical,
economic and environmental aspects. It goes beyond focusing only on PV modelling and gives an
overview of the BIPV tools from the perspective of BIPV integration in design and multi-performance
modelling and planning. The report examines features and functions, as well as potential development
and limitations of currently available tools used in BIPV planning process, including tools specifically
designed for BIPV and PV tools with capacity to simulate certain BIPV cases. Moreover, report provides
information on limitation and reliability of these tools in different settings and for different BIPV
categories, indicating pathways and tools’ selection that would provide the highest confidence and
fidelity of results as well as positive user experience throughout the process.

The report streamlines workflows according to the type and complexity of BIPV integration and offers
pathways and tools suitable for required case. The report included 15 domains of BIPV planning such as
geophysical, technical, economic and environment which affect successful BIPV integration. 27
software, 9 online tools and 4 apps were compared against the aforementioned domains.

The findings of this review showed none of the examined software and apps can cater to all the factors
pertaining to PV project design and management. Results have shown that majority of tools used in BIPV
modelling come from PV domain and consequently still lack important features regarding BIPV
integration, especially for vertical or externally mounted BIPV.

Therefore, this study propose a decision support system which will address stakeholders’ practical
difficulties by providing the main features: (1) a localized data repository which will include weather
information, building regulations, energy consumptions in different building sectors, utility prices,
construction and maintenance costs, contract types, financial modes, carbon prices and government
incentive schemes; (2) efficient 3D model creation of the physical environment; (3) Hourly comparison
of energy input and output; (4) PV layout design optimization; (5) Simulated installation process and
impact analysis; (6) Monitoring and inspection modules with auto diagnosing function; (7) PV system
performance recording; and (8) sensitivity analysis and scenario-based decision making support.

* * *

1. Introduction

Buildings account for approximately 32% of global final energy use, 19% of energy-related greenhouse
gas emissions and 51% of global electricity consumption \[1\]. Therefore, there is an urgent need to
explore the renewable energy resources which not only meet the increasing energy requirements of the
world but also are environmentally friendly \[2\]. The long-term role of solar power as a renewable energy
source has recently become a much more popular topic of discussion because of its impact on the future
of energy and reduction of CO2 emissions.

Solar power expansion has happened across continents and in many forms and environmental settings.
It covered a wide range of scenarios, from solar power plants focusing on energy generation for external
use, up to small decentralized solar units generating on-site energy for improving self-sufficiency. Variety
of scenarios have imposed many challenges in planning solar installations mainly concerning optimal
location, climate, specific environmental and urban conditions, electricity prices, grid structure,
incentives, business models, etc.

This is especially noticeable in BIPV field, where non-optimal placements are much more common than
in solar power plants. Therefore, these cases require much higher spatial-temporal granularity to
provide reliable results. Moreover, the granularity of results differs along with design phases, starting
from low detail and rough results for initial feasibility assessments, and ending up with results in high
detail and with high reliability.

From the value-chain perspective, stakeholders’ target information domains and objectives differ and
consequently, they require different types and quality of information. For example, the primary design
goal from a developers’ perspective is maximizing the lifecycle benefits from the PV projects, while
clients and developers are keen to know the payback time in alternative design scenarios by
incorporating the direct cost and benefit items with their financial modes, tax, and incentive policies. On
the other hand, to optimize PV designs building designers need easy access to view the external physical
environment, building features and energy usage, and smart tools to compare alternative designs.

Furthermore, Contractors and Facility Managers want to understand the impact of installation,
operation, and maintenance on their routine practices. From a broader perspective, all these factors
would directly impact government agencies’ decision making on sustainable related policies.

Therefore, to accelerate the implementation of BIPV systems, there is an increase in demand for
convenient software tools for stakeholders, along with the supply chain and planning process that can
be used for design, analysis, and troubleshooting \[3\]. This report will examine features and functions, as
well as potential development and limitations of currently available tools used in BIPV planning process,
including tools specifically designed for BIPV and PV tools with capacity to simulate certain BIPV cases.
BIPV design and management tools are analyzed in relation to geophysical, technical, economic and
environmental aspects. Moreover, report provides information on limitation and reliability of these
tools in different settings and for different BIPV categories, indicating pathways and tools’ selection that
would provide the highest confidence and fidelity of results as well as positive user experience
throughout the process.

* * *

# 2\. Acknowledgments

Publishing of this report would not be possible without the participation of many experts within IEA- PVPS Task 15 as well as international experts. The publication presents an amalgamation of several years of collective effort to summarize design workflows and tools used in academic research and practice. With this regard, we would like to acknowledge authors of this report for their knowledge and research in the field and especially their previously published material, such as \[11\] \[14\] \[171\] and \[230\], that the report builds on. Used material has been revised, adjusted and updated to include current methods and tools and provide an integrated and holistic overview of BIPV tools and digital planning processes. We also want to acknowledge all participants of the IEA-PVPS Task 15 and their institutions for their valuable contribution provided during Task’s meetings as well as oral and written conversations through different media. In addition, the authors appreciate the support of the International Energy Agency Photovoltaics Power Systems Programme as well as ExCo members.

* * *

# 3\. Previous Studies and Reviews

When considering the building attached and integrated PV (i.e. BAPV and BIPV), each project is unique and therefore requires careful and meticulous planning to increase the efficiency and cost-effectiveness of the design \[4\]. There are various tools currently available in the market that are used for BIPV planning. These tools are available either online, PC-based or as smartphone/tablet applications. Many studies have used these solar PV design tools for calculating solar irradiance, shading losses, energy output, and financial viability and carrying out 3D modeling of potential PV installations/projects. Some examples are given in Table 1 which indicate the specialty of the tools.

Further, several past studies have been conducted to compare the key features of the major tools (See

Table 2). For example, Axaopoulos et al. \[5\], examined six tools, i.e. TRNSYS, Archelios, Polysun, PVSyst,

PV\*SOL, and PVGIS, to compare the energy generation results with the actual data on a grid-connected

19.8 kWp PV installation. A similar study has been performed by Freeman et al., \[6\] which validated and compared the energy production result accuracy within SAM, PVsyst 6.1.1, PV\*SOL, PVWatts and RETScreen for nine PV systems. Both studies have compared only energy generation and solar irradiation results. They did not investigate the accuracy of use of building physics, life cycle costs, financial and environmental savings calculations, and construction operation and maintenance. Therefore, there is a necessity to assess the accuracy of other parameters such as building physics, costs, benefits, government incentives, environmental aspects, operation, and maintenance, etc. which also impact a solar PV project. A comprehensive study was done within the framework of IEA SHC Task 41 – Solar Energy and Architecture \[7-10\]. The study has reviewed and analyzed the obstacles faced by architects when using the tools for solar design in the conceptual phase, preliminary design phase, detailed design phase and the construction drawing phase of a solar project. The study compares 56 software grouped under computer-aided architectural design (CAAD) tools, visualization tools, and simulation tools (See Table
2). The study has analyzed the selected tools in terms of aesthetic aspects, technical aspects, and economic aspects. However, this study is done through architects’ perspective in the conceptual phase to the construction drawing phase of a solar project. Therefore, it does not consider the needs of other stakeholders in PV projects or the balance phases of a solar project such as commissioning, operation and maintenance and decommissioning. Another comprehensive study was done recently within the framework of IEA – PVPS Task 15 - BIPV by Jakica \[11\], and it has compared 200 solar design tools with 70 features and their integration in 50 3D, CAD / CAM, and BIM software packages. The study has classified the software solutions into five main disciplines: tools for PV and BIPV, tools for optical design, multi-physics, daylighting, whole-building energy and urban, tools for daylighting and whole-building energy, tools for visualization (images) and tools for visualization (animations and real-time presentation) and gaming. The study has assessed the tools for PV and BIPV in terms of parameters such as light sources, available databases, PV performance models, simulation analysis (rendering/visualization; BAPV/roof-mounted PV/BIPV energy yield; financial performance parameters), shading, PV technology, design phase, design workflow, method of computation, computer operating systems system, 3D/BIM integration, interoperability in BIM/CADD platforms and software price. However, although the study analyzed many features, the study focused on daylighting and BIPV solar potential in solar design tools. Thus, other parameters such as government incentives, emissions, cost savings, grid details, structural analysis, construction and commissioning, operation and maintenance and decommissioning, etc. have not been considered. Sharma et al., \[12\] have listed 45 solar design tools classified under simulation tools, economic evaluation tools, photovoltaic industry-related tools, analysis and planning tools, monitoring and control tools solar radiation maps and online tools. However, the study has only evaluated 12 major solar design tools out of the 45 design tools. Unlike the studies mentioned above, it only provides an overview of the tools as a function of availability, cost, working platform, working capacities, scope, and output.
Therefore, factors such as environmental parameters, building physics, finance modes construction and
commissioning, operation and maintenance and decommissioning have not been discussed. Apart from
PC or online-based solar design tools, apps are available on smartphones and tablets. These apps use
onboard hardware: GPS, compass, camera, and accelerometer/ inclinometer to calculate annual energy
output based on local information with some even doing it in real-time as the device is moved around
\[13\]. Several apps perform financial calculations such as system payback time.

S. Freitas et al., \[14\] analyzed various models and tools that use numerical radiation algorithms coupled
with GIS tools to evaluate complex dynamic overshadowing effects on building surfaces. The review
covered models ranging from simple 2D visualization and solar constant methods, to more sophisticated
3D representation and analysis, and conclude with web-based solar maps that rely on these models to
communicate benefits of solar resources to the public and support for the policy-making process.

Table 1 - Studies which have used PV design and management software

| Software used for | Software |
| --- | --- |
| Evaluation of technical feasibility and financial viability | RET Screen\[15\];\[16\];\[17\]Homer Pro\[18\]Sunnulator\[19\] |
| Levelized cost of electricity calculation | SAM\[20\];\[21\] |
| PV system design and performance analysis | Polysun\[22\]PV Sol\[22\];\[24\] |
| Solar irradiation calculation | Polysun\[25\]PV-GIS\[26\];\[27\] |
| Shading loss analysis | SAM\[28\]Skelion\[29\]Ladybug\[30\] |
| PV Energy output analysis | PVsyst\[31\];\[32\]PVwatts\[33\]Autodesk Revit\[34\]PV-GIS\[35\] |
| Cell arrays layout optimization | PVsyst\[36\] |
| Optimize hybrid renewable technology | Homer Pro\[37\] |
| 3D design | Skelion\[29\]Rhinoceros 3D- Grasshopper\[30\];\[38\] |

Table 2 - Studies on key features of Solar PV design tools

| Author | Software |
| --- | --- |

* * *

| Klise and Stein \[3\] | PV Models Developed and Used by Sandia National Laboratories: PVSS, SOLCEL, Evans and Facinelli Model, PVForm, PVSIM, Sandia Photovoltaic Array Performance Model, Sandia Inverter Performance Model, PVDesignPro, Solar Advisor Model |
| --- | --- |
| Other PV Performance Models: Parameter Array Performance Model, PVWatts, PVSYST, PV F-Chart, RETScreen Photovoltaic Project Model, PVSol, Polysun, INSEL, SolarPro |  |
| Simplified PV Performance Models: Clean Power Estimator, PVOptimize, OnGrid, CPF Tools Solar Estimate |  |
| Hybrid System Models Developed and Used by Sandia National Laboratories: SOLSTOR, HybSim,Hysis |  |
| Other Hybrid System Models: HOMER, Hybrid2, UW-Hybrid(TRNSYS), RETScreen, PVToolbox,RAPSIM,SOMES,IPSYS,HySys,Dymola/Modelica |  |
| Lalwani et al.,\[40\] | RETScreen, TRNSYS,HOMER,INSEL,PV F-Chart,SAM,PVsyst,SolarDesignTool,ESP-r 11.5,SolarPro,PV DesignPro-G,PV\*SOL Expert |
| Horvat and Dubois\[7\];Kanters et al.\[8\] | CAAD tools:Allplan,ArchiCAD,AutoCAD,Blender,Bricscad,Caddie,CATIA,CINEMA 4D,DDS-CAD,Digital Project,form\*Z,Google SketchUp,Houdini,IntelliPlus Architecturals,Lightworks,Maya,MicroStation,Revit Architecture,Rhinoceros 3D,SolidWorks,Spirit,Vectorkworks,3ds Max |
| Visualization tools:Artlantis,Flamingo,Kerkythea,LightWave,LuxRender,Maxwell Render,Mental Ray,POV-Ray,RenderMan,RenderWorks,RenderZone,V-Vray and YafaRay |  |
| Simulation tools:bSol,DAYSIM,DesignBuilder,Design Performance Viewer(DPV),Ecotect,Energy Design Guide II(EDG II),EliteCAD,BKI ENERGIEplaner,eQUEST,Green Building Studio,IDA ICE,IES VE,LESOSAI,Polysun,PVsyst,PV _SOL,Radiance,RETScreen,T_ Sol and VisualDOE |  |
| Sharma et al.,\[12\] | Simulation tools:INSEL and TRNSYS |
| Economic evaluation tools:HOMER,Solar Advisor Model(SAM),RETScreen,SOLinvest and EnergyPeriscope |  |
| Photovoltaic industry related tools:APOS photovoltaic StatLab,Organic Photovoltaics Analysis Platform and PV Cost Simulation Tool |  |
| Analysis and planning tools:pvPlanner,Archelios,String Design Tool,PV\*SOL,BlueSol,PV F-CHART, Solmetric PV Designer,DDS-CAD PV,Polysun,REA System Sizing Tool,PVsyst,Solar Pro,PV Professional,Solarius-PV and Matel Grid; |  |
| Monitoring and Control Tools:Meteocontrols,SPYCE,pvspot,Autodesk ECOTECT Analysis,METEONORM,Shadow Analyser,Shadows,Amethyst ShadowFX,Sombrero,Panorama master,Horizon,GOSOL and Skelion |  |
| Solar radiation maps:Focus Solar,SolarGIS,3TIER and PVGIS |  |
| Online softwares:PV-Phil,SolarDesignTool,oTilt,PVwizard,Logiciel CalSol,Environmental System Performance-renewable(ESP-r),PhotoVoltaic Design Program-Grid connected system(PV DesignPro-G) |  |

* * *

|  | PV and BIPV: SAM, PV syst, PV\*SOL,Skelion, Solarius PV, PolySun, CECPV Calculator, PVwatts, DDS-CAD PV, INSEL, PV Designer, PV F-CHART, SMA Off- Grid Configurator, Solar-Pro, Archelios, PV-DesignPro, RETScreenPlus, Homer Pro, PV scout, HELIOS3D |
| --- | --- |
| Nebojsa Jakica | Optical design and Multiphysics: TracePro, Photopia, OpticsStudio, ASAP, FRED, LightTools, SPEOS, THEIA RT, Integra Lumicept, LucidShape, OSLO, OpTalik, COMSOL |
| 2017 \[11\] | Daylighting and whole building energy: OpenStudio, Design Builder, IES-VE, Honeybee, Mr. Comfy, ArchiWizard Urban: ARCHSIM Daylighting/lighting/Solar: Diva, Rayfront, Lighting analysis tool for Revit, Ocean, BIM IQ Visualisation (images): Iray, Lightworks Iray + Visualisation (motion pictures) and gaming: None |
| Kumar \[41\] | PV Watts, PVGIS, PV-Online, PV\*SOL, PVsyst, RETScreen, and SAM |
| S. Freitas et al., \[14\] | GOSOL, SHADOWPACK, ATM, Sky view factor, Solei-32, SolarFlux, Kumar et al., RADIANCE, Daysim, ArcGIS Solar Analyst, SRAD, Solar Envelopes, r.sun, RayMan, Solar3DBR, SORAM Professional tools: SAM, RETScreen, PVComplete, PVscout 2.0 Premium, PVSYST, SOLARPRO, PLAN4SOLAR PV, PV F-CHART, INSEL, PV SOL Premium, POLYSUN, HOMER, SOLARIUS PV, PV-Design-PRO, PV Designer Solmetric, Archelios PRO, Solarmapper, HELIOS 3D Solarparkplanung, SOLERGO, SKELION, Hybrid2 |
| [http://photovoltaic](http://photovoltaic/) -software.com \[42\] | Online Tools: SOLARPLUS, FOCUS SOLAR, SISIFO, PV-GIS, PVWATTS, Calculation solar for off-grid PV systems, PV\*SOL online, DIAFEM, EASY-PV, EASYSOLAR, SOLARDESIGNTOOL, PVANALYTICS. SOLARGIS-PVPLANNER, HELIOSCOPE, POLYSUN Online, SOLARMODEL i-Pals WEB, AURORASOLAR Apps: SOLAR SHADING, SOLAR SYSTEM CALCULATOR, EASYSOLAR, ONYX SOLAR, SOLMETRIC iSV, PV OUTPUT, PV Optimize, SMA SUNNYPORTAL, AHA SOLAR, |

* * *

4. Objectives

With consideration to current studies/reviews on solar PV design tools, most of the aforementioned
studies have not provided a holistic overview of the BIPV value chain that analyses both BIPV specific
tools and PV design tools adapted for specific BIPV cases, taking into account the geophysical, technical,
economic and environmental requirements of BIPV projects. Therefore, this report aims to provide an
extensive review of the available software tools for BIPV design and management. In particular, the main
objectives of this review are:

• to understand the current possibilities of features and functions in the available BIPV design and
management tools;

• to describe the features and functions of current solar PV design and management tools in
relation to geophysical, technical, economic and environment;

• to provide insight into possible limitations and bottlenecks of particular functionalities,
procedures, and tools;
• to offer a quick and effective comparison in a visually structured way that could be done in two

• to offer a quick and effective comparison in a visually structured way that could be done in two
ways, per feature/category and/or per tool/discipline;
• to target needs and facilitate decision-making of end-users from all backgrounds and level of

• to target needs and facilitate decision-making of end-users from all backgrounds and level of
expertise who are interested in learning and working in the BIPV sector.
• to aid the right tool selection for the planning of specific BIPV categories considering their

• to aid the right tool selection for the planning of specific BIPV categories considering their
requirements in relation to geophysical, technical, economic and environment
• to propose potential improvements for an integrated solution for PV design and management.

• to propose potential improvements for an integrated solution for PV design and management.

* * *

# 5\. Methodology

The report’s methodology uses data collected through an extensive literature survey, available official resources provided by software developers in various formats including web sites, manuals, white pages, tutorials, feature lists, etc. An extensive worldwide search was carried out for providing a diagnosis of photovoltaic design and management systems. Out of many software tools found in the literature review, 27 software, 9 Online tools, and 4 Apps were selected as follows:

- 22 major standalone PV software packages: System Advisor Model (SAM) 2017.1.17; RETScreen; Expert Homer Pro; PV \*SOL Expert; PV Scout; Solar F-Chart; Sunulator Pvsyst; Helios; 3D solarparkplanung; Polysun; INSEL; Aurora; ArcGIS; SolarPro; BIMsolar; SolarBIM PV; Helioscope; PV-DesignPro; PVComplete; Solar Pro; Solergo; BLUESOL
- 5 CADD/BIM plugins: Solarius-PV, Skellion for Google Sketchup, INSIGHT (Solar analysis tool) for Revit, Ladybug Tools for Grasshopper/ Rhinoceros 3D, DDS-CAD PV (Polysun);
- 9 online tools: Construct PV’ ArcheliosPro, PVwatts, PVGIS, CalculationSolar.com, PV\*SOL Online, EasyPV; Solar Estimate, SOLARGIS – PVPLANNER
- 4 smartphone/tablet applications: EasySolar, Onyx Solar, PVOutput, SMA Sunny Portal
  The selection of the standalone software and the online tool PV-GIS was based on their usage in the current Solar PV literature. The tools that were common in the studies mentioned in Table 2 were selected. Furthermore, several online tools (Calculation solar, PV\*SOL online, Easy-PV and Easysolar) CAAD/ BIM plugin and smartphone/tablet apps were selected based on the studies \[11\], \[42\] and \[30\]. Tools developed in joint research projects such as PVSITES-BIMsolar, SolarBIM PV and Construct PV are also included as they target BIPV market and requirements and aim to provide convenient tools for BIPV industry and stakeholders. Although the listed tools still cannot cover across the world, we endeavor to include the major ones based on their accessibility and relevancy for BAPV/BIPV design and management. Also, tools which were developed specifically for single company PV products such as Fronius Solar Configurator, The Redback app, etc. were not considered in this review.

The selected Solar PV design and management tools were evaluated in relation to 15 key PV project design and management factors as shown in Figure 1. These key PV project design and management factors were identified from the literature and will be further explained in the following sections. Each solar design and management tool and app which were free to download for a trial version or where the demo or educational version was available were tested with simulation exercises whereas for software tools with limited access, web sites, product manuals, white papers, and demo videos, etc. were used. The selected tools and the key findings from the review are presented in Tools’ comparative analysis in Chapter 7 and their features will be explained in the following subsections.

* * *

_Figure 1 - Key Factors of PV Project Design and Management_

* * *

# 6\. Analysis of BIPV Planning Process

## 6.1. BIPV Design

### 6.1.1. BIPV planning

### Conceptual/Early phase

Every BIPV design process starts with an evaluation of environmental conditions considering location, terrain, orientation, surrounding buildings, as well as the seasonality of surrounding vegetation that may cause potential shadowing on building surfaces. Since BIPV may be installed and integrated into many different forms in an envelope and auxiliary structures, an early assessment of surfaces that may be subjected to BIPV integration is needed. This identification may also start form assessing solar potential on all surfaces and then followed by the identification of surfaces that are most effective. In both scenarios, or in a hybrid one, identification of BIPV surfaces in early design phase represents a crucial step for successful integration and optimal BIPV energy performance. However, various parts of the building envelope require different design workflows as shown in the next chapters. In that sense, south facing BIPV roof has a better solar potential than south facing BIPV curtain wall. Also, the technical requirements and aesthetics for a BIPV roof can be less demanding than of a BIPV facade. In this phase, only generic modules are considered to provide an indication of energy generation and benefit. This study is usually one part of a larger initial feasibility assessment that combines Life Cycle Analysis (LCA), business model, integration with BIPV system parts, grid vs. storage, etc. This phase should demonstrate the benefits and limitations of BIPV integration. Furthermore, this phase favors speed over accuracy in order to explore more options time-efficiently. In the case of a positive evaluation, the range of BIPV system target capacity and grid connectivity should be defined. At the end of this phase, the BIPV system is designed with all major parts defined but not sized and characterized, corresponding to the Level of Development 100, as described in chapter 6.1.6.

**Schematic**

Schematic design phase continues with ideation of BIPV systems and evaluates identified options from the early phase using BIPV simulations of general nature to obtain first indications of BIPV energy yield potential. Parallelly or as a part of an integrated design approach, building energy analysis should provide an assessment of Energy Use Intensity (EUI) that feed the input for BIPV sizing. Economic and financial analyses with various metrics, explained in chapter 6.5, aims to provide information on energy balance and potential for energy self-sufficiency leading to Zero-Energy Building target. Assessment during this phase considers energy density of different PV cell types, that directly influences the surface area of BIPV. Furthermore, performance-based design process identifies appropriate PV cell technologies based on the type of integration. During this phase, accuracy settings are generally higher than in the early phase but still reasonable for time-efficient simulation. At the end of this phase, the BIPV system is defined, sized and characterized till the Level of Development 200 (see chapter 6.1.6). BIPV system and module integration are fixed and documented as a part of the project delivery sent to approval from a client and followed by urban planning permission that includes energy grid connection permit.

### Design Development

Design development phase is focused on characterizing BIPV modules and system and identifying BIPV module requirements for standard compliance including: mechanical resistance and stability, safety in case of fire, hygiene, health and environment, safety and accessibility in use, protection against noise, energy economy and heat retention, sustainable use of natural resources as defined in EN 50583 standard (see 6.1.4). Depending on the BIPV category defined in the same standard, relevant specific requirements are applied, while other non-relevant are neglected. Furthermore, this phase defines testing procedures for all requirements and target certification class of each BIPV system component. Regarding design and simulation methods, this design phase significantly improves accuracy that is consequently more time-consuming. Yet, this increase in computational time is compensated by the smaller number of design options that have to be evaluated as the design search space is very narrow. Additionally, BIPV modules and system design characterize materials, layered compositions, maintenance, replacement procedures of malfunctioning parts, connection details, performance testing and monitoring equipment and procedures, energy metering equipment and/or battery storage, etc. This design phase encompasses LOD 300, 350 and 400 (chapter 6.1.6.).

## Construction and commissioning

There are many identifiable phases in the construction and commissioning stage of a BIPV system. The construction phase consists of project scheduling, installation training guidance, occupational health, and safety requirements \[43\]. Delivery and storage of products and appliances is a costly item in building construction where delays can occur because of inclement weather, underestimating construction completion phases and setbacks from product defects, breakage and re-ordering replacements \[43\]. Further, installation should be done by skilled and qualified tradesmen to ensure that all building and safety regulations, building standards are complied with and expensive breakages and accidents kept to a minimum \[43\]. After the installation, in the commissioning phase it is required to test the 1. structural compliance; 2. electrical safety; 3. Calibration of the BIPV system to ensure that expected system output is met and 4. Sign off: builder or customer sign a statement that the installation was carried out by a certified installer and that the work has been completed as per specification \[43\]. Commissioning is a way to formalize quality control of installed PV systems which ensures that systems are safe and high performing \[44\]. Therefore, commissioning is essential for the achievement of expected PV system output. This phase is defined as LOD 500.

Hardly any of the software and mobile apps considered for this review have a function which facilitates the construction and commissioning procedures of the BIPV system. It would be beneficial if there’s a platform which incorporates the information on construction schedules with the performance status, installation process and safety training which are specified by building codes and standards applicable for different building types. Further, a defect inspection tracker for panels, inverters, frames, building envelop, etc. as well as analysis thermal imaging could facilitate the designers, developers, contractors and owners to track defects and design changes and for quality assurance.

## Maintenance and monitoring

PV installation lifetimes are expected to be 25 years or more, so safe and proper maintenance and monitoring is an integral part of successful and reliable operation \[45\]. Maintenance and monitoring ensure that a system operates optimally and safely and extends the life of the system components \[46\]. Typical maintenance procedures can be applied to a photovoltaic system such as periodical inspection of PV modules and arrays, screws and for corrosion, PPM for inverters, batteries and charge controllers, inverter replacement, etc. \[43,46\]. Monitoring allows to locate faults and provide operating data which facilitates maintenance \[46\]. Most inverters provide a display of system output and maintain a history for some period, such as a month. In addition, the electricity utility may also maintain a record of system performance, depending on the metering type \[43\]. Many PV designers allow customers remote monitoring via the internet and this remote monitoring software facilitates troubleshooting, provides additional information, and take timely readings of the system \[46\]. Solar BIPV system owners/ operators are interested in the ongoing performance of their system to ensure a good return on investment (ROI). Some tools like Rbee Solar, are focused only on performance monitoring of PV installations and smart energy meters. From analyzed tools, SMA SunnyPortal, PVoutput Apps have considered PV system maintenance and monitoring. However, even the SunnyPortal App provides a
basic overview of the performance of the PV system as shown in Figure 2.

Figure 2 - PV system monitoring interface - SMA Sunnyportal (left) PVoutput (right)

In addition, these tools do not provide an indication of poor performance in the current monitoring
platform. Simply, this monitoring platform shows overall system output, but are not able to explain why
a system may not be meeting expectations. However, even this very basic level of information is useful
and it constitutes an improvement over the situation for other systems where their users receive no
indication at all on the PV system performance. When it comes to maintenance, most tools (e.g.
RetScreen, SAM, EasyPV) incorporate the cost of maintenance in the project financial analysis. However,
no consideration is given on the operation and maintenance tasks, warranty period or component
replacement.

Decommissioning

PVs are warranted to last for about 25 years. However, there is currently no formal procedure for re-use
or recycling of PV products at the end of their lifecycle \[43\]. According to Moss et al. \[47\], disposing of
PV material is accompanied by potential health issues such as the disposal of electronics. However, while
the PV industry seems committed to maintaining the environmentally-friendly profile, recycling options
at the end of its life cycle would substantially reduce waste. Therefore, designers need to pay attention
to the material they are selecting and the environmental effects of this material at the end of their
lifecycle during the inception stage of a PV project. None of the software nor any mobiles apps have
incorporated the effect of the decommissioning phase in their PV system design platforms. However, it
is important to take off the end-of-life treatment to ensure that the solar
modules/components/materials can be reused/recycled/recovered.

6.1.2. Building Type

Building types such as residential, commercial, industrial, heritage buildings, etc. are incorporated with
different construction and building codes and regulations, government incentives and building energy
loads which would impact on distributed PV designs \[48\]. For example, In Australia, connecting
residential systems and small commercial systems process is virtually identical, the process for installing
large commercial systems is much more complex. Where structural assessment, council development
approvals, building permits, installation of additional componentry grid protection, export control,
power quality logging, and witness testing will be required \[49\]. Tools such as SAM and Polysun provide
options for commercial or residential buildings. Whereas Homer Pro has the option to select other building types such as community and industrial. None of the tools covers other building types such as
heritage buildings. It would be much more convenient to have the building requirements to be
integrated into the design tools to facilitate industry professionals.

6.1.3. Interactive design

2D and 3D Modelling

Interactive design is based on a premise that building tools offer content in a form that is subject to
change based on input parameters. It allows the designers to visualize the outcome of any proposed
designs from a variety of angles and to have several design options to choose from, which will help to
foresee any shortcomings and enhance the PV design. The most basic interaction is in the form of 2D
design and user interface that present solar panels with azimuth and zenith angles. This is the most
common approach for assessing the feasibility of solar systems with minimum obstructions producing
shading. However, this approach lacks the ability to present BIPV installations in a building context and
understand the quality of integration. On the other hand, 3D building modeling, provides such enhanced
features where users can see BIPV installations directly integrated with building models. However, 3D
models of buildings may have different levels of integration and interoperability, from full integration in
a 3D CAD environment up to a standalone tool. For understanding the advantages of the new forms of
integration it is needed to first explain their levels. The first method of integration, or lack of it, is the
most basic level so-called parallel workflow where simulation tool differs from 3D modeling tool and the
communication between them is conducted through the export of files from 3D tools and import into
simulation tools. This approach has numerous shortcomings as a manual update is needed for every
change and it is not possible to get feedback information. Every new iteration must be carried out in the
same manner as the first one and there is no option for automated performance assessment. However,
some tools such as PVSITES-BIMsolar, SolarBIM PV and Construct PV offer modeling capabilities of BIPV
systems on top of building models. An alternative to this approach is 3D building modeling capabilities
directly inside the BIPV performance tool. While this may be a very useful option for fast and easy setup,
3D modeling capabilities of these tools offer very limited features, especially for large BIPV installations
that must be handled manually. Currently, a small number of tools offers these features: SAM, PV\*SOL.
The more advanced level is the dynamic or live link workflow where two tools exist as standalone but

Similarly to this approach in terms of the design process is the embedded workflow where simulation
plugins or add-ons are integrated within a BIM environment with the ability for parametric modeling.
While BIM offers a certain amount of predefined parametric capabilities, parametric add-ons such as
grasshopper for Rhino offers greater design freedom and control, especially for complex projects with
multiple instances of BIPV panels. Differences between them can be noted in the more flawless design
workflow that is optimized for speed and interaction. An improved version of the latter two is
represented in design workflow that is supported by the optimization algorithms and multi-solution
comparison in either simplified manner or more advanced parametric workflow. The only tool that
offers parametric modeling within a BIM environment is Ladybug Tools in Grasshopper and Rhino, while
Solar analysis tool for Revit and DDS-CAD PV (Polysun) offer BIM with predefined features. Currently,
partners within a consortium of European project BIPVBOOST work on developing enhanced BIM tools
that will offer a high level of interactivity for users. However, substantial developments are needed to
provide augmented workflows for designers and architects offering goal-based methods.

* * *

**Visualization**

Photorealistic representations of BIPV systems are very useful for understanding the qualitative aspects of BIPV integration and can lead to improved aesthetics. The relevance of visualization rises with the visibility of the BIPV installation, for example in vertically mounted systems, or BIPV systems in protected urban areas. However, only some tools and apps provide functions to let designers visualize building models with BIPV and GIS (e.g. PV\*SOL, Easy Solar App, Skellion, PVSITES-BIMsolar, SolarBIM PV and Construct PV) (Figure 3).

a. PV\*SOL Expert b. SAM c. EasySolar \[114-115\]
d. BIMsolar-PVSITES
_Figure 3 - Forms of interactive design_

## 6.1.4. BIPV and Building Standards

Approval is required to initiate any PV project \[50\]. As discussed in section 6.1.2 different types of buildings (e.g. residential, commercial, industrial, etc.) use different building codes and standards. Most local building codes and product certification requirements will refer to specific standards for PV mounting, fixing and fire resistance which will often vary with the location of the building to take account

* * *

\[Image: R170\]

of possible differences in wind loading, earthquake risk, and the attendant risks associated with failure
modes \[51\]. PV specific regulations are available such as information on manufacturing and installation
standards and; Installation and safety requirements for photovoltaic (PV) arrays; Stand-alone power
systems Series; Grid connection of energy systems via inverters Series; Safety of power converters for
use in photovoltaic power systems etc. \[52\]. Therefore, compliance of the stated building codes and
regulations is paramount for any PV project.

In order to provide a regulatory framework for BIPV installations, international experts developed a new
EN 50583 standard for BIPV products (part 1) and systems (part 2). The standard aims to classify specific
requirements of different types of BIPV and present related existing standards. However, none of the
software and mobiles apps have incorporated any feature which facilitates the compliance of applicable
building regulations nor BIPV standards. Incorporation of building codes and standards in a PV design
tool would represent an important feature for PV design and management professionals.

6.1.5. Building integration

BIPV standard EN 50583 defines five categories of BIPV: (A) sloped horizontal, not accessible, (B) sloped
horizontal accessible, (C) vertical not accessible, (D) vertical accessible and (E) externally integrated
(Figure 4). There are multiple strategies available for integrating solar PVs in buildings. Stapleton and
Neill \[53\] describes two basic ways of mounting PVs in buildings: roof mounting systems (pitched roof
mounts, rack mounts, direct mounts and building integrated photovoltaic (Roof, façade, sunshades, and
sunscreens) and ground-mounted systems (ground rack mounts and pole mounts). The right solar
mounting system, if installed correctly, will provide the structural support as well as set the orientation
and elevation of a solar system, to maximize its energy performance. Therefore, BIPV designers required
to ensure that the mounting approaches ensure overly secure fixtures and support frames as required
by building and regulations \[43\]. Several software packages provide the feature to select a BIPV system
mounting option when selecting BIPV modules or entering the BIPV module parameters. Most of the
tools provide only limited functionality and include only very simple roof mounting. However, SAM,
PV _SOL, PV GIS, Onyx Solar, allows the designers to select out of the rack, flush, gap, roof parallel, roofmounted open space mounted as well as roof and façade integrated. PV_ SOL Online further described
the roof-integrated mount with roof-integrated rear ventilation and roof-integrated no ventilation. Yet,
the selection of the mount depends on the structural load of the system which is only considered in
EasyPV as discussed in section 6.4.1.

When considering complex integration, where advanced simulation is needed as the specific case is not
covered with currently available tools. This is especially applicable in BIPV category E that commonly
implies BIPV systems with partial shading and near-field reflections, complex air and heat flow, along
with back face illumination and thermal effects from an indoor environment. For simulating such cases,
one must use custom approaches and usually combine tools in a multi-physics environment, such as
Computational Fluid Dynamics - CFD, optics, building thermal, Finite Element Modeling – FEM, etc.
depending on the case. This is a very active area of research, and it is expected that in the future there
will be more commercially available tools able to simulate complex BIPV cases.

\[Image: R170\]

\[Image: R170\]

\[Image: R170\]

\[Image: R170\]

Figure 4 – BIPV Categories

* * *

6.1.6. Level of Development

In the construction industry, the design process is described by the phases of pre-design, conceptual
design, design development, and final design. The building life cycle process is described by the phases
of construction and building operation. In order to efficiently manage the BIM workflow, the industry
has adopted a formal language of describing a digital model. The “Level of Development” (LOD) is
sometimes understood as Level of Detail rather than Level of Development, but there are important
differences. Level of Detail is essentially how much detail is included in the model element. Level of
Development is the degree to which the element’s geometry and attached information have been
thought through – the degree to which project team members may rely on the information when using
the model. LOD, in the BIM world, ranges from 100 (basic/conceptual) to 500 (highly detailed/precise)
\[54\].

BIPV systems for façade can be associated, by definition, in two different categories of standard
classification (Uniformat or OmniClass): the wall category as Exterior Vertical Enclosures (Uniformat B20,
OmniClass 21-02 20) and the Photovoltaic Collectors (Uniformat D5010.30, OmniClass 21-04 50 10 30).
However, definitions reported show a lack of specific content for BIPV systems which can be improved
by defining specific Levels of Development (LOD), namely of graphic accuracy, modeling and informative
content required for each level and for the different stages of the process (Figure 5). Currently, the main
questions are: what are the Levels of Geometry (LOG) and the Levels of Information (LOI) necessary for
the authorized uses at each Level of Development (LOD) for BIPV systems? At purpose, we analyzed
some existing e-objects on various platforms by classifying them based on LOG and LOI. We concluded
that the LOD achieved are various and not clearly defined. We proposed a reference definition of LOD
for BIPV as the following report.

\[Image: R183\]

\[Image: R183\]

Figure 5 - From the analysis of different e-objects of PV panels and solar systems, we systematically
investigated the level of details and development of different families (left). Based on this study we
defined LOD for BIPV (schemes on the right) (source: SUPSI-Bonomo, P. et.al. 2018)\[55\]
It is worth mentioning that a relationship between LOD and design phases can be loosely established.

It is worth mentioning that a relationship between LOD and design phases can be loosely established.
However, it should be emphasized that this relationship is not empirical. For instance, a project may be
in design development, but in the digital model, the building envelope system may be fully detailed with exact materials and thicknesses. More so, plumbing systems might be represented with single lines, not modeled geometries.

_Table 3 - Definition of LOD for BIPV systems (source: SUPSI-Bonomo, P. et.al. 2018) \[55\]_

## LOD 100: concept phase, schematic drawing, generic representation even non-

scaled, symbol, generic mass. It can be assimilated, for example, to the schematic representation of an electrical system. From the non-graphical content point of view, it can contain cost/energy information, derived only by roughly estimating as a percentage compared to other elements in the model. The model can be used for a design level of a feasibility study.

## LOD 200: Graphically equivalent to a generic modeling phase, where the

system and elements are modeled with approximate placement, shape, and size. In the case of a photovoltaic module, an overall thickness of the element can be indicated at this stage. At the information level, the approximate energy data, cost, and extension of the installation surface can be indicated. This level allows performing the first simulations/previsions of a general nature. The model can be used for a preliminary design level.

## LOD 300: From the graphical point of view, the system and elements are

modeled with placement, shape, size, stratigraphy and detailed thicknesses (specific model). Cells technology and precise definition of individual modules within the installation area are indicated at this level. From an informative point of view, the basic electrical, mechanical, construction, thermal and energetic-environmental properties are attached, the number and weight of the modules and the main details of all the electro-technical features are introduced. The realistic cost should be provided. The model can be used for a developed design level.

**LOD 350: At this level, all the contents of the previous layer are defined and, in** addition, the substructures and the connections between the various elements of the model and the building skin will be modeled, which can also be enriched in 2D detail technical drawings. From the informative point of view, the properties remain the same as the previous level. The model can be used for a level of technical design.

## LOD 400: The minimum contents of this level of development complete the

LOD 3, with all the necessary parameters needed at least for the manufacturing and construction, including the addition of the constructive details of the connections, completed with more detailed 2D drawings, printable in scale 1:10, 1:5 for construction site. The model can be used for a constructive design level, including assembly and mounting information of the specific modeled module, as well as cabling information for installation.

## LOD 500: This level of development is generally not considered for BIM models,

as it relates to site verification and thus does not imply any progression to a more accurate geometry or information level but rather the definition of an as- built model (e.g. for O&M and facility management)

Finally, concerning BIPV modeling workflows, these BIPV LODs can be divided into two groups as previously described: simple and complex (Figure 6). Simple LODs refer to generic modules and consequently loss factors and related coefficients. This LODs may be useful in early design phases when feasibility studies are performed. In the later stages, LODs become specific and BIPV modeling becomes more detailed and accurate. This includes reading performance parameters from databases that accordingly improves the accuracy of modeling. LODs are color coded so they can be traced in workflow diagrams in Figure 19 and Figure 20.

_Figure 6 -BIM LODs categories_

The LOD described above provides a first reference definition which will be further detailed by authors in next researches and Task activities. The scope is only to provide a possible first basis for BIM coordinators/managers on which BIM Execution Plans can introduce further specifications.

# 6.2. Environment

## 6.2.1. Terrain/Surroundings

The terrain is a vital physical parameter for site analysis \[56\]; \[57\]. Terrain/Surroundings can be categorized as exposed open terrain with few or no obstructions and terrain with numerous closely spaced obstructions. Different terrain categories affect the distribution of solar irradiation, variability in elevation, surface orientation (slope and aspect), and shadows cast by topographic features. There are generally four types of terrain: (1) flat terrain without obstacles, (2) agricultural area with isolated houses, trees, hedgerow barriers, (3) suburbs or industry, woods, (4) urban areas with a minimum developed area of 15% and buildings’ heights exceeding 15 m. Therefore, for any photovoltaic project, one of the most pressing hurdles is how to design the most efficient system when facing significant topographical variances. Several tools have considered the terrain in their PV design platforms (Figure

7). Orientation identification Survey (USGS)/land surveying) Slope Analysis
_Figure 7 - Analysis and evaluation of terrain data (Helios 3D solarparkplanung, 2017 \[58\])_

* * *

Often, the PV arrays get shadowed, completely or partially, by the passing clouds, neighboring buildings and towers, trees, and utility and telephone poles, etc. \[59\]. Therefore, in photovoltaic it is important to understand and analyze the effects caused by neighboring buildings, objects and/or vegetation to extract the maximum possible power.

Geographical Information Systems (GIS) may be described either through point-clouds or solid surfaces, both with variable granularity. Point-cloud data on urban morphology may be obtained by remote- sensing technologies, such as airborne LIDAR. One of the analyzed tools uses LIDAR-assisted modeling to quantify the shading effects of the surroundings (Figure 8).

Figure 8 - LIDAR-assisted modeling. Credit: Aurora

Solid surface representation of GIS may have various levels of granularity for the representation of semantic 3D city models. The CityGML 2.0 LODs represent an industry standard for conveying the grade of 3D city models and they distinguish 5 LODs (Figure 9).

_Figure 9 – GIS LODs_

A few existing tools facilitate the placement of neighboring buildings, objects and/or vegetation in a 3D environment to simulate their effects. PVSITES-BIMsolar software allows integration of extended 3D scene imported from any CAD solution, even at urban level and delivers irradiance, shading, within the 3D interface. Similarly, as shown in Figure 7, in PV\*SOL allows the designers to place surrounding buildings, trees, and simple objects such as walls, masts, etc. to identify their impact on shading (Figure

10). The program allows animation depicting the position of the sun through azimuth and elevation angles or by time specification to show how far object shading can cause interference. Seasonal shading for a tree object screen captures color coded to indicate the amount of shading across the roof the numbers on the module indicate the shading loss for each PV module. Similarly, SAM automatically generates shade data from a drawing of the array and surrounding objects as shown. Further, in SAM shading losses can be imported from external tools such as PVsyst near shading and Suneye hourly shading. However, it can be overwhelming for a person who does not have a background in PV system design. The tools require more professional knowledge of the software. However, it would be better if the tools can facilitate users who are not familiar with technical knowledge.

## PV\*SOL Premium b. PV Scout 2.0

_Figure 10 - Neighboring buildings/objects design_

## 6.2.2. Weather data

Local weather can have a dramatic effect on electricity production from a PV array. Essentially, solar irradiation data is the key point for the planning and sizing of the PV systems \[60\]. In addition to solar irradiation, air temperature, humidity, wind regime, snow cover, and rainfall patterns also play a role in the power output of a BIPV system and its performance efficiency \[60-62\]. There are three types of available weather data available: Meteorological/Statistical data, Satellite-based data and Hybrid data of the first two types. Meteorological data is collected from ground weather stations and in most cases spatial resolution is quite low and consequently, weather conditions on building locations far away from the weather station may differ significantly. On the other hand, Satellite-based data relies on satellite hyperspectral imagery to produce highly detailed spatial resolution meshes up to 1 km accuracy (Figure

11). However, discrepancies of these data sets may be high in cases where local conditions could not be captured from space. The third type combines benefits of both previous types and offers high fidelity of spatial resolution maps calibrated with ground weather station data. When considering whether data source used in BIPV tools we distinguish two types: 1. Most tools use an existing database (e.g. NREL National Solar Radiation Database, PVGIS, NASA) to present the weather data (e.g. SAM, RETscreen, Homer Pro, Easy PV, PV-GIS); 2. Provide external import options (e.g. Homer Pro, SAM). Software such as Homer Pro PVsyst, PVWatts, and SAM capable of receiving hourly weather data such as solar radiation, ambient temperature, wind speed, humidity and snow conditions at the PV project locations. The tools use typical year weather data files to represent the long-term solar resource at the location and automatically identify appropriate data for the system based on the address provided for its location. However, RetScreen requires the input of solar irradiation, ambient temperature and wind speed in monthly values if the software user requires a custom weather data file. None of the tools has considered rainfall patterns which play an important role in the energy output of a PV design.

* * *

_Figure 11 - Ground weather station (left) \[39\], METEOSAT-7 Satellite image (right) Credit PVGIS_

* * *

6.3. BIPV Performance Modelling

For the planning of BIPV systems, the modeling of the electrical performance of the system is a key
aspect. Every planning or design tool features a physically or empirically based performance model. In
this chapter, we want to give an overview about the important parts and steps of performance models,
elaborate the different simplifications many tools use and their implications and make suggestions
regarding the requirements of appropriate way of modeling the performance of BIPV systems. The
actual, time-dependent operating conditions of PV-modules are decisive for the performance. While
module labels are based on measurements under standard test conditions (STC: temperature 25°C,
irradiance 1000 W/m2, spectrum according to \[64\], normal incidence), in real operation several loss
mechanisms lead to a decreased performance compared to STC. In 6.3.2, these loss mechanisms are
briefly mentioned. The subsequent chapters 6.3.3 to 6.3.6 are dedicated to a basic description of the
models and processes behind PV performance modeling – always emphasizing aspects that are
especially important for BIPV. Chapter 6.3.3 deals with the first major part of all performance models,
the calculation of the irradiance on the BIPV system (or its parts – modules or cells). This irradiance
calculation is a crucial step, and, for many BIPV systems, it is much more complex than for geometrically
very regular PV power plants. Chapter 6.3.4 deals with the calculation of the temperature of PV cells. In
6.3.5, the calculation of the DC output (based on irradiance and temperature) is described and in 6.3.6
the DC-AC-conversion leading to the final AC output. As most (BI)PV systems are connected to a grid,
also grid properties have to be considered for PV performance modeling (6.3.7). Finally, 6.3.8 shows
how all these parts are typically integrated into full performance models. The last section of this chapter,
6.3.9, provides some more details about spatial and temporal resolution, different PV technologies and
data sources.
6.3.1. Simple vs. Complex BIPV cases

25^{\\circ}\\mathsf{C},

1000w/N/m^{2}

6.3.1. Simple vs. Complex BIPV cases

Since there are not so many tools specifically designed for BIPV purposes, while there are tools originally
developed for ground-mounted PV system that contain features suitable to simulate simple BIPV cases
with reasonable accuracy, this report proposes a classification on simple and complex BIPV performance
modeling. This classification aims to present possible use of PV software in BIPV field, and at the same
time present their limitations and indicate improper use. Furthermore, objective of the classification is
to explain different demand of BIPV comparing to PV and identify areas for future development.
Moreover, Simple vs Complex classification refers mainly to the irradiance modeling and complexity of
the outdoor and indoor environment BIPV is facing. In this sense, BIPV categories A and C, are not
accessible and therefore their indoor environment have limited effect on irradiance modeling, and these
cases may be considered as simple. For these two BIPV categories, irradiance may be potentially
simulated with PV tools as well, only if there are no near-field shading from immediate surrounding
buildings that may alter the irradiance on PV surface due to the reflections. In other cases, in order to
properly model complete BIPV behavior, only tools supporting advanced irradiance modeling and losses
have to be used as described in 6.3.3.

6.3.2. Loss mechanisms

According to Roberts et al., \[65\] PV system losses comprise of: 1. DC losses: module nameplate DC rating;
DC wiring; diodes and connections; mismatch; MPP tracker efficiency; 2. AC losses: AC wiring;
transformer; 3. Other losses such as soiling, shading, inverter, degradation, system availability, sun
tracking and initial light-induced degradation (ILID). It is important to note that these losses may have a
significant impact on the life of the PV module and plant performances \[66\]. For BIPV two loss
mechanisms should be especially emphasized: First, shading. Due to the complex geometry of many
BIPV systems and their surroundings, (partial) shading is a major challenge for the design of BIPV
systems. Second, temperature-induced losses. As there are various mounting situations for BIPV systems, also the ventilation and hence the temperature of PV modules varies strongly. A careful analysis
of temperature losses with regard to PV performance is strongly recommended for every BIPV project.

6.3.3. Irradiance on PV

Simple 2D – POA

The plane of Array (POA) irradiance is an analytical method to calculate the sum of separate irradiance
contributions from POA beam component, POA sky-diffuse component and POA ground-reflected
component (albedo) (Figure 12). It is the most common approach to assess the performance of PV
systems in the solar industry.

POA beam component is the most important of them as it represents irradiation contribution from the
sun. As all testing of modules predicts calculations of PV performance under light sources perpendicular
to the PV surface, this component implements Angle Of Incidence (AOI) correction to adjust the Direct
Normal Irradiance (DNI) for incidence angles greater than 50 degrees \[67\]. 2D function Incidence Angle
Modifier (IAM) is used to define optical losses, due to angle-dependent reflections, from arbitrary optical
surfaces of the PV module top layers. IAM value is usually calculated using analytical IAM models such
as physical \[68\], Souka and Safwat \[69\] or ASHRAE \[70\], Martin and Ruiz \[71-73\], and Sandia \[74\].
Additionally, IAM of complex surfaces can be calculated by optical software such as TracePro and Zemax

to characterise optical properties of the top layer of the PV cell as a 2D function of the incidence angle
of the light source \[75\] and finally be provided as an input for PV software such as PVsyst \[76\]. In this
way, optical simulation is separated from electricity yield simulation. For calculating IAM and
consequently POA beam component PV tools compare solar azimuth and zenith angles, with the PV
module azimuth and tilt angles respectively.

POA sky-diffuse component accounts for diffuse radiation from the skydome and is usually described by
several models ordered by level of complexity: Isotropic, Simple Sandia, Hay and Davies, Reindl and
Perez. All except Perez calculate isotropic, circumsolar, and horizon components separately, while the
Perez model is based on empirical coefficients for each of them \[77-79\].

POA ground-reflected component is a function of Global Horizontal Irradiance (GHI), the reflectivity of
the ground surface (albedo) and the tilt angle of the surface. Again, this approximation is reasonable in
open spaces without shading as in the case of PV plants but can be highly inaccurate in complex urban
settings.

Similarly to the previous component, 3D packages using advanced light transport models that can model
an urban environment should outperform PV tools in terms of accuracy.

* * *

_Figure 12 - Diagram of the multiple components of the clear sky. Credit: Jeffrey R. S. Brownson \[80\]_

## Simple 2D-POA with shading

Common PV tools using POA methods calculate only one value per module. However, in complex scenarios, a precise irradiance distribution on whole PV surfaces is needed to account for irradiance homogeneity and partial shadowing. There are various types of shading approximations with a low temporal resolution such as Far-field shading horizon map, Far-field (Horizon) shading factor, Near-field shading factor, Shading percentage (SP), Reduction of Incident Irradiation (RII), Shading Index (SI), \[81- 82\]. Far-field shading can be caused by the terrain, trees, surrounding buildings. PV modeling software uses horizon shading masks to account for shading losses (Figure 13). To increase accuracy and estimate shading losses caused by near-field shading objects such as chimneys, walls, skylights, HVAC, etc., PV modeling software use a specific procedure such as the near-field shading factor, relying on many approximations. These procedures are not physically based, and they cannot model specular near field objects. This can have negligible consequences for roof-mounted PV but significant ones for complex BIPV categories in urban areas. For the general purpose of BIPV, this approximated model is outdated, and advanced irradiance models such as the ray-tracing approach should be used instead.

* * *

Figure 13 – PV\*SOL Premium near-field shading analysis (left), Ladybug far-field shading analysis (right)

Most of the PV simulation tools do not support complex lighting conditions and near shading caused by
surrounding, as they are mainly developed for stand-alone PV modules in energy plants. However, some
of them like PVsyst can still be used for roof-mounted PV that uses shading factor to account for nearfield shading effect \[83\]

Sky View Factor

The sky view factor (SVF) was introduced to quantify obstructions resulting either from 'self-shadowing'
by the slope itself, known as shading, or from adjacent terrain or elements, called shadowing \[84\]. It
represents the solid angle of the visible celestial hemisphere normalized by the solid angle of the total
celestial hemisphere, i.e. only the geometrical aspect of the available sky radiation is considered. A
procedure to calculate the SVF is suggested in \[85\], where the division of the sky hemisphere into small
segments or sky zones is proposed, each with similar solid angles. From this work, the CIE recommended
the use of a hemisphere evenly-distributed in 145 virtual light sources. Many other different sky
subdivision strategies can be applied. SVF is time-independent unless significant changes occur in the
surroundings, which is fairly probable in the urban environment. \[86\] reviews a range of tools to predict
solar access in obstructed urban situations, including simple angular criteria, sun path diagrams, solar
gain indicators, and solar envelopes, among others. Ratti and Richens \[87\], assume that the whole sky
hemisphere is represented by a large number of dispersing light sources and propose the estimation of
the SVF of a particular point by knowing the number of times that a point has been lit and the total
number of times it could have been lit.

The study of the Sky View Factor (SVF) parameter gains importance to correctly describe the open sky
access and the degree of obstruction at certain places. Although SVF has always had special relevance
as one of the most important parameters in the study of urban heat island phenomena \[88, 89\], it gives
insight into obstructions to solar radiation at places that might be suited for the installation of PV
systems. SVF can also be a measure of the amount of diffuse solar radiation that reaches a certain point
when the isotropic distribution is considered \[90, 91\]. Several methods exist to estimate SVF and they
can be classified into four main categories: analytical, photographic, GPS and raytracing methods \[92\].
The fisheye photographic method can be considered one of the most accurate for the assessment of
SVF in small areas. Usually, this method requires photographic cameras are equipped with proper
fisheye converters, a fisheye lens commonly used to capture the entire surroundings of a shooting place
\[89, 93\] and known for its 180° hemispheric view, depicting with the great quality the full horizon skyline.
After the collection of photos, an SVF custom algorithm or a dedicated software, such as the

* * *

SkyViewFactor Calculator \[94\], can be used to get values. This tool, in particular, allows for the upload of single fisheye photographs to determine SVF by employing two different methods: a pixel-based method introduced by \[95\], and the annulus method presented in \[96\]. A weakness recognized to the photographic method relates to the ideal meteorological conditions in which the surveys should be carried out. Overcast skies are preferred, given their homogeneity, avoiding any excess of direct radiation or even different types of clouds that could jeopardize the post-processing of images \[97\].

The photographic method is a standard procedure for the evaluation of sky obstruction, however other methodologies might be more cost-competitive and less time consuming than this standard procedure when medium to large urban areas are analyzed. The use of GPS to assess the SVF of a location is an uncommon but promising alternative due to its low cost and tolerance to different meteorological conditions \[97\]. It also allows for the portability that lacks too many other SVF surveying methods. This method requires a receiver typically used in outdoor activities, such as Geocaching, which serves the purpose of displaying the number of satellites and their satellite status index, which reflects the signal to noise ratio, in a 1 (weak signal) to 10 scales \[98\]. Higher signal intensity is associated with a low level of obstruction, and therefore a higher SVF value. Before data acquisition, it is recommended to check satellite availability at the site and collection time through maps such as \[99\]. A wide distribution of satellites in the sky means that the receiver is going to collect information from all directions, and therefore identify possible obstructions from any point on the horizon.

Wherever a digital surface model (DSM) is available, it can be used to compute SVF over medium to very large areas in a reliable and fast way using raytracing algorithms \[100\]. This method consists of counting the number of rays cast from all the sky divisions that reach a point in the DSM. The ratio between this number and the total number of rays cast (or sky divisions) is the SVF for that point. Of course, the quality of this estimation depends on the quality of the DSM, and on the type of sky subdivision, which can have a great impact on the computational demand.

Calculation of irradiance can be challenging, as irradiance data of high spatial resolution on each solar cell of the BIPV system are required. As the geometry of the building skin and its surroundings is usually complex, simple view factor methods widely used for simple PV plant configurations cannot be used. Detailed, time-resolved shading analysis is required. There are several tools on the market that can partly fulfill this requirement, mainly 3D CAD software such as for example ArchiCAD, SketchUp, Autodesk Revit or specialized PV simulation tools such as for example PVsyst or PV\*Sol. A good overview of available tools can be found in \[101\].

Most of analyzed software and apps can calculate shading losses, soiling losses, snow losses, irradiance losses, DC Losses, and AC losses once the system is selected. Archelios Pro, SAM, and PVsyst consider losses due to temperature, aging and maintenance time, wiring losses, light-induced degradation and module efficiency loss (Mismatch losses). As discussed under Neighboring buildings and objects under section Terrain/Surroundings, PV\*SOL allows the users to calculate shading losses based on 3D visualization of building and surrounding objects. The users can optimize the allocation of PV modules based on the shading position. The precise shading losses factor for each PV module is visualized per each module/area using color codes to indicate the amount of shading across the roof the numbers on the module indicate the shading loss for each. The loss data is shown in minimum times interval (e.g. per hour / half an hour). However, most of the above-mentioned tools are able to simulate roof- mounted and roof-integrated PV. Only a few tools such as Ladybug, Revit solar analysis tools, PVsyst, etc. facilitate solar shading analysis for façade integrated PV. The software could be improved if shading losses for façade integrated PV could be implemented. Further, the tools could facilitate simulation of minimum time interval loss data. Product loss can be linked to the product database.

* * *

## Complex 3D simulation – Raytracing

Ray tracing is a rendering technique based on a geometric (ray) optic light model that calculates light transport by tracing a large number of rays in a scene-Path Tracing (PT). It originates from ray casting algorithm, developed to solve intersections of the rays with an arbitrary geometry including triangle meshes and mathematical surfaces such as constructive solid geometry models, which trace only one ray per pixel without recursively tracing additional rays needed for global illumination. Ray tracing is an advancement of this approach, originally proposed by \[102\], that calculate global irradiance by means of recursive point-sampling based on rendering equation developed by Kajiya \[103\]. Rays in ray tracing follow the same principles as light in the real world and therefore this technique is the only one that can be considered physically-based \[104\]. This implies light transport follows energy conservation principles \[105\] \[106\] with every light bounce. In other words, at each level of recursion ray tracing algorithm can split ray into components for reflection, transmission (refraction) or in the case of participating media absorption and in particular cases emission, where a sum of radiosity values of the component part must be equal to incident radiosity. The accuracy of this numerical solution depends on the level of model description in terms of sky, materials and light transport characterized by the number of samples and bounces.

Furthermore, shading and light on the surfaces is a sum of components coming directly from the light sources, as specular: reflection and refraction, and as diffuse indirect reflections. First two components can be handled relatively easily while the last one typically requires tracing hundreds, thousands or even millions of rays. Hence, this component is usually subjected to various levels of approximations and optimizations and it is generally considered as a bias.

RADIANCE represents the daylighting industry-standard simulation tool. It employs a light backward ray- tracing algorithm based on the physical behavior of light in a volumetric 3D model, including complicated curved geometries with different reflectance and specular properties \[107\]. It is extensively validated and successfully used in applications related to solar potential in building roofs and façades for electricity generation and daylighting analysis \[108\]. Radiance is a powerful tool for evaluating the light distribution in indoor and outdoor spaces, architects and designers were the first to benefit from its implementation within several CAD interfaces such as Autodesk Ecotect Analysis \[109\], DIVA4RHINO \[110\], among others (Figure 14). A database with material properties for lighting simulations with Radiance is freely available \[111\].

* * *

_Figure 14 - Solar mapping analysis in Radiance_

Daysim is a validated Radiance-based daylighting analysis program \[112\] that employs a daylight coefficient method \[113\] based on ray-trace calculations and the Perez all-weather sky model \[114\]. The workflow of Daysim consists on generating an annual illuminance profile at each point in and around the digital model of the buildings, followed by a ray-trace operation, which takes a 145 segments skydome and 3 ground segments, and a second raytracing run with approximately 65 direct solar positions distributed along the annual solar path. By tracing backward from the simulation sensor points, each sky segment and solar position is weighed relative to its contribution to each point in the scene \[115\]. Contextual shading and reflections are, therefore, considered. Typical climate data series are usual input and any incremental time step is allowed. Currently, Daysim is part of the package for energy simulation in a variety of CAD plug-ins including Autodesk Ecotect Analysis \[109\], DIVA4RHINO \[110\] and LadyBug \[116\].

PVSITES-BIMSolar represents one of the tools that use proprietary raytracing for calculating irradiance on PV cells. This tool was specifically developed for BIPV and it supports both simple BAPV and complex BIPV workflows, 3D (CAD) model import, weather data (tm2, epw, CSV), inverter and module databases, detailed outputs and financial analyses through interactive graphical user interfaces (Figure 15).

* * *

_Figure 15 - BIMSolar_

## Complex 3D simulation – Other

Worth-mentioning hybrid approaches include a combination of ray tracing with radiosity, or ray tracing with rasterization. First is used in some daylighting software tools such as EDSL TAS and DIAL+Suite and it offers some advantages of both approaches. An advanced version of this hybrid method uses Multidimensional Lightcuts \[117\], based on Lightcuts \[118\] and Instant Radiosity \[119\], to handle complex illumination and specular materials efficiently. This method is implemented in Autodesk 360 rendering engine used in INSIGHT (Solar analysis tool) for Revit (Figure 16 and Figure 27). Developers claim that this method is up to 10 times faster than Radiance. However, since indirect illumination is based on Instant Radiosity, a biased method that does not include caustics, this may be a significant shortcoming for CFS and complex BIPV.

Figure 16 – Cumulative Insolation in INSIGHT (Solar analysis tool) for Revit

Another approach, originally developed for the gaming industry, combines ray tracing with rasterization \[120\] \[121\]. Despite the fact, these methods are not designed for scientific purposes, but for entertainment, some of them like Frostbite demonstrated great accuracy when validated against visualization industry-standard PBR engine Mitsuba \[122\]. Since leading gaming engines are turning towards unbiased PBR, it is expected that in the future, custom tools, built on these engines and validated, will be capable to simulate complex BIPV with reasonable accuracy in an interactive or even real-time manner. One of the possible approaches is explained in the following sub-chapter.

## GPU-based shading evaluation techniques

Ray tracing algorithms can handle very complex shading scenarios \[123-125\]. Nevertheless, the system resources that they require to depend on the number of rays that need to be traced, which swiftly increases with the desired accuracy and the complexity of the scene \[126-128\]. The complexity of the objects or structures that the ray tracing can manage is limited by the power of the Central Processing Unit (CPU) that handles their execution. Even though CPU power has increased over time, some practical cases are still out of reach \[129\] \[130\] \[11\].

Another software approach is now emerging as a viable alternative. Today, virtually all graphics systems are characterized by a special-purpose Graphics Processing Unit (GPU) that is custom-tailored to carry out specific graphics functions. The GPU is a specialized electronic circuit designed to rapidly manipulate and alter the computer memory and accelerate the creation of images on a display device via a frame buffer. During the last decade, the performance of GPUs has surged, mainly driven by the ever- increasing demand emanating from the video game industry. Modern GPUs are very effective at manipulating computer graphics and image processing, and their highly parallel structure makes them more efficient than general-purpose CPUs for algorithms that are designed to process large blocks of data in parallel \[131\]. In a personal computer, a GPU can be present on a video card or can be embedded on the motherboard. The availability of powerful GPUs opens very promising possibilities for the simulation of complex 3D shading scenes applied to PV systems because the impacting shadows can be evaluated with a very high spatial resolution that reaches well beyond the PV cell level in short calculation times. One of the functionalities of the GPU during rasterization is to evaluate the depth of each pixel to be displayed for a specified field of view, defined by its source point and angle of view. This information is stored as a z-coordinate in the depth buffer, where a lower z-value corresponds to a lower depth (closer to the observer).

The spatial resolution of the 3D scene can be adapted at will by varying the area of the object that is covered by one pixel. The shadow evaluation on the PV array can be carried out on elements that are much smaller than a PV cell. Figure 17 illustrates this concept through the example of a PV system mounted on the roof of a house and that is affected by shadows produced by a tree, an antenna, a chimney, and the roof itself. All the 3D objects of the scene were imported from 3D Warehouse, and the PV system was directly defined into 3DPV, a GPU-based simulation tool under development \[132\]. The Figure a) shows the shading scene for a given time moment, b) shows the corresponding modeling of the shading status of the PV generator elements, and c) shows the integration of the effective shading losses factor over a day. The shading status can be defined at a spatial resolution that is well below the PV cell level. Increasing the number of elements per PV cell automatically increases the accuracy of the shadow evaluation, but also increases the calculation time. For most cases, using one element per PV cell is sufficient to provide reasonable accuracy. For cases where the 3D scene is very complex and/or high accuracy is required, or in the high-end case of specialized research topics \[133-135\], it can be advantageous to use more than one element per cell. In any case, using nine elements per PV cell is normally more than enough. Even though it remains possible to carry out the shadow evaluation using more elements per PV cell (e.g. 16, 25 or more), up to the pixel level, experience shows that this leads to a very little gain in accuracy, so that the increase in computation time is not justified.

* * *

Figure 17 - Shading scene modeled into 3DPV using a GPU-based method. a) shows the shading scene
for a given time moment, b) shows the corresponding modeling of the shading status of the PV generator
elements, and c) shows the integration of the effective shading losses factor over a day.

These GPU-based methods make it possible to evaluate very complex shading scenes in short amounts
of calculation times. For example, 3DPV was applied to the evaluation of the effective shading losses
over one part of the city of Boston called the Skyline where the buildings were covered with BIPV
modules. In this example, some PV modules are integrated into building facades, whereas others are
mounted on rooftops. Some systems are even mounted on curved facades for architectural reasons.
Overall, there is a wide variety of system geometries. All the hypothetical PV installations together
amount to a total number of 29,872 PV modules, or 1,792,320 PV cells, representing a total capacity
close to 7.5 MWp. A shading evaluation was carried out for each PV cell and for each 10-min moment.
This represents a total of ≈40 billion shading evaluations. Despite this massive amount of calculations
for the complete scenario, they were completed within only several minutes on a conventional desktop
computer. Figure 18 illustrates some of the results obtained on some of the buildings, where the shading
losses fraction has been evaluated for each element of the scene and is represented through its daily
integration over one arbitrary day of the year.

Figure 18 - Daily integration of the shading losses fraction as evaluated over some of the buildings of the
Skyline area of Boston.

* * *

Apart from their advantages in terms of calculation power, these GPU-based approaches also offer additional interesting features. For example, as in the case of 3DPV, they can be implemented using the programming language WebGL \[136-137\]. This makes it possible to carry out all the simulations locally on the user's client-side (e.g. computer) from a user-friendly and interactive Web browser, without requiring any local installation from the user. This approach also empowers the user, who can obtain full benefit from the underlying information already available online, such as 3D object libraries. Since the tool can be directly operated online, the use of 3D objects libraries available online is possible. This approach also offers more interactive capabilities, thus constituting a suitable pathway to integrated science, technology, engineering, and mathematics (STEM) education \[138-139\]. This also opens the doors to more advanced built-in learning tools for the users and to the implementation of gamification techniques, which introduce game-design elements and game principles in non-game contexts \[140- 141\].

* * *

_Figure 19 – Workflow for calculating effective irradiance_

* * *

6.3.4. Temperature of PV

The conversion of sunlight into electricity generally is temperature-dependent. Different PV
technologies have different temperature coefficients for voltage, current and power output originating
from basic temperature dependencies of physical quantities like band-gap, charge carrier lifetimes and
mobilities. In order to calculate the relevant cell temperature of each solar cell for each time step,
differently detailed models can be applied: from simple approaches using the ambient air temperature
and the irradiance level with a technology- and product-specific linear factor, through node models
considering the module layer structure, up to detailed, spatially resolved thermal simulations. A detailed
comparison of temperature models can be found for example in \[142\], temperature loss models are also
reported in \[143-146\]. It is important to mention, that the temperature of cells in a BIPV system can vary
strongly and can be higher than for standard PV power plant configurations. The ventilation of modules
is often poor, depending on the mounting situation. Thus, every BIPV project needs a careful evaluation
of the temperature levels reached in the modules. These temperature levels are very relevant for the
performance but also for the stability, durability, material strain, etc.

6.3.5. Electric DC output of PV
Based on irradiance, temperature, the electric interconnection of cells, modules, and strings, the

6.3.5. Electric DC output of PV
Based on irradiance, temperature, the electric interconnection of cells, modules, and strings, the
electric output can be calculated. Either empirical models or equivalent circuit models are used. Due to
various types of inclination and orientation of BIPV-systems, irradiance values between 100 and 1500
W/m2 are of particular interest. This means that all electrical models should be able to predict the DC
yield for this broad range of irradiance levels, especially for low light conditions. There are many
investigations in the literature about PV cells under low light conditions, such as for c-Si \[147\], a-Si and
CIGS \[148\] and other cell materials \[149-151\]. Stamenic et al. demonstrated the influence of low light
conditions in the simulation of (BIPV) systems \[152\]. It is shown that the cumulative impact on PV
module performance can decrease by 30% in module efficiency from 1000 to 200 W/m2, whereas in
some latitudes this drop can go as high as 57% \[153\]. For this behavior, basic photovoltaic cell
characteristics at low irradiance are mainly responsible, while the angle of incidence and spectral
changes only account for up to 15%. For every BIPV system, the electric model that is applied has to be
suitable for the cell technology used and the actual product. Datasheet parameters stated in typical
module data sheets should be used as inputs for all calculations. Many tools offer a convenient selection
of modules from a list of modules available on the market. However, as many projects feature also
custom-made modules, sometimes a very specific definition of the input parameters is required.

(Combined) empirical models

A very basic power model has been introduced by Heydenreich et al. \[154\]. It contains only three
empirical parameters and allows for the calculation of the power output at maximum power point for
arbitrary combinations of irradiance and temperature. The three parameters can be extracted from the
datasheet if the output is given for at least three different irradiance levels. This is, however, not always
the case and thus the parameter fitting is a crucial step for this model. If the parameters can be
determined properly, the model enables the especially good description of the low light behavior, which
is of major importance for BIPV. However, effects like partial shading of a cell or a module are difficult
to include, as the model describes only the power output and no detailed current-voltage characteristics.

A different empirical approach is followed in the loss factors model (LFM) \[156-161\], where five
physically significant and independent normalized loss factors are considered. Together with the parameters for irradiance, spectral mismatch, and temperature, these five loss factors for Isc, Rs, Rp, FF, and Voc determine the electrical output of the module. As the loss factors have physical meanings, the method allows quick identification of unusual performance patterns and can give insightful information during operation of a BIPV system. LFM is more advanced as it takes into account these five physically significant and independent normalized loss factors as well as spectral and temperature corrections to estimate Final Energy Yield (YF) or Performance Ratio (PR) for most PV module technologies (c-Si, HIT, a-Si, CIGS, CdTe and a-Si/uc-Si).

## Equivalent circuit models

The use of equivalent circuit models is also wide-spread in PV simulation tools. In these models, the electric behavior of a PV device is represented by an equivalent circuit consisting of one or more diodes, series and shunt resistance. Thus, the complete IV-curve of a PV device can be modeled, not only characteristic points as in the SAPM or loss factor model described above. The simplest version would be the ideal single diode model with only three parameters: photocurrent Ipv, the saturation current I0 and ideality factor a. However, the practical relevance of the ideal single diode model is low, as at least an additional series resistance has to be considered to describe a real device. Therefore, the single diode Rs-model, also known as the 4-parameter model, has been introduced \[162\]. Adding also a parallel shunt resistance leads to the single diode Rp-model, also known as the five parameter model (e.g. \[163\]). All single diode models inherently neglect the recombination losses in the depletion region. These can be included by extending the equivalent circuit by an additional diode leading to the two-diode model with two additional parameters: saturation current (I02) and ideality factor (a2) of the second diode. With these 7 parameters, the two diode model gets computationally demanding but also results in a high accuracy especially at low irradiance conditions. For all equivalent circuit models, a precise extraction of the parameters from typically available datasheet information or IV measurements can be challenges and a lot of algorithms have been presented. A good overview of equivalent circuit models and corresponding algorithms can be found in \[164\]. A comparison of both, empirical models and a diode model, is presented in \[165\].

## 6.3.6. Power electronics /electric AC output of PV

In most BIPV systems an inverter converts the DC output to AC. Inverters typically combine two functionalities: MPP-tracking and DC/AC-conversion. There are also systems with additional module- level power electronics like DC/DC-optimizers or full DC-systems with batteries and DC loads. In any case, performance models have to be able to consider the actual setup of power electronics used and its operating conditions. A parametric model for the inverter efficiency, for example, can be based on the input power and the input voltage using the model of Schmidt and Sauer \[166\].

## 6.3.7. Grid Infrastructure and limitations

Two basic categories of PV systems are available today: 1. Stand-alone off-grid 2. Grid-tie PV systems (Batteryless or Battery-based). Electricity grids must have standard conditions of supply to ensure that end-use equipment and infrastructure can operate safely and effectively. These conditions are commonly referred to as power quality requirements voltage and frequency regulation, power factor correction and harmonics \[167\]. For example, the standards for the voltage that Australian distribution network service providers (DNSPs) must comply with are determined individually by each state and territory. At the current time, there is a group of states that have adopted the new nominal voltage of 230 V +10% / -6% (New South Wales, South Australia, Tasmania, and Victoria) \[168\]. Source of energy in a grid-connected system can fluctuate significantly over timescales from seconds through hours to days and seasonally which can cause significant negative power quality impacts at high penetrations \[169\]. Therefore, in a distributed a PV project it is necessary to understand the factors associated with the grid connection such as voltage; phase; power factor; feed-in power clipping, etc. For example, it helps to comprehend the available savings associated with reduced demand as some electricity networks charge demand in real power (kW) and in apparent power (kVA): Variance in demand charges is considerable, from 5.4376 $/kVA/month for United Energy (in Victoria) to 28.780 $/kW/month for Ergon Energy (in Queensland) \[70\].

Out of the 23 tools and 4 apps few tools (e.g. Solarius PV, PV Scout 2.0, Polysun) have provided the options on the electric grid types to differentiate the grid voltage between phase and neutral, a number of phases, displacement power factor, and feed-in power clipping. Polysun allows the users to select the grid configuration from a catalog e.g. single phase 230 50Hz, or three-phase 230V/400V, 50 Hz Star WHY, etc. Also, the software considers maximum phase load, an imbalance in the feed-in phase (input). COSθ and feed in power limitation consumption. This knowledge is quite specific disciplinary related and hard for architects and consultants to understand. It would be good if the selection of grid types can be auto- configured with the combination with localized information.

## 6.3.8. Integrated PV performance models

PV performance models implemented in software tools comprise at least the functionalities described in the previous chapters.

_Figure 20 – Workflow for calculating BIPV yield and other building performances_

* * *

Also, Fraunhofer ISE developed a scientific tool suite to combine the relevant performance simulation steps for arbitrarily complex BIPV systems. In \[166\], such a detailed model combining all steps has been presented and validated. Further descriptions, application examples and possible connections to Building Information Modelling of this tool suite can be found in \[171\]. For the calculation of the time- dependent irradiance on each individual solar cell of a BIPV system, the ray-tracing tool RADIANCE is used. For the calculation of the temperature of all PV cells, different models are available \[172\]. The electrical cell behavior is described by an equivalent circuit model. Due to accuracy, usually, the two diode model is used. Finally, the DC-AC conversion is considered by a parameterized inverter model based on the datasheet specifications of the inverter. Thus, a very detailed simulation of the performance of a BIPV system, especially also for complex building geometries, customized BIPV modules, and complex electric circuit designs, can be performed. The model has been validated and used for the design, planning, and optimization of several complex BIPV systems1.

## 6.3.9. Additional important aspects of BIPV performance modeling

## Spatial Resolution

As already discussed, some BIPV systems can represent complex installations in terms of irradiance and electrical yield performance modeling. Simulating effects of partial shading can be very significant as it may cause electrical mismatch losses, hot-spots and overheating of PV cells, thus influencing power output, accelerating degradation and decreasing system reliability \[173\]. Therefore, models with higher spatial resolutions, preferably on a PV cell level or higher, are needed to account for these effects. Only one of the analyzed tools, Ladybug Tools, has been documented to be able to simulate BIPV performance on PV cell level when coupled with external script in MATLAB \[174\]. The employed model can handle mutual shading, solar insolation, and electric energy yield of dynamically actuated PV modules. The study showed that with a detailed “planning of module string configuration, PV cell orientation, and location of bypass diodes reduces electrical mismatch losses induced by partial shading and can result in more than 50% higher energy yield compared to uninformed design strategies”.

## Temporal Resolution

For the BIPV energy output predictions, it is necessary to perform simulations on an annual basis. However, the temporal resolution of results may greatly affect BIPV performance assessment and an especially off-grid solution including energy storage. Since energy storage capacity is sized based on a high temporal resolution to match energy loads usually on an hourly basis, lower temporal resolutions may cause unreliable results. Furthermore, climates with a high frequency of change may require even greater temporal resolution. Especially the extent of partial shading due to close objects can vary rapidly and requires a high temporal resolution of up to 5 min-steps.

On the other hand, during the early design phase, time-efficient methods are applied that provide reasonable and predictive reliability. Robinson and Sone proposed such a method using Radiance module GenCumulativeSky, that takes a climate file as an input and generates a cumulative sky Radiance distribution. It may be described either in terms of a global Radiance distribution for a discretized sky

1 [https://www.ise.fraunhofer.de/de/forschungsprojekte/auslegung-einer-bipv-anlage-fuer-](https://www.ise.fraunhofer.de/de/forschungsprojekte/auslegung-einer-bipv-anlage-fuer-) ein-jugendstilgebaeude-in-zuerich.html

[https://de.strabag-newsroom.com/pressreleases/construct-pv-zeigt-fassadenintegrierte-](https://de.strabag-newsroom.com/pressreleases/construct-pv-zeigt-fassadenintegrierte-) photovoltaik-am-zueblin-gebaeude-z3-2224113

[https://www.ise.fraunhofer.de/en/research-projects/rdemo-facade.html](https://www.ise.fraunhofer.de/en/research-projects/rdemo-facade.html)

[https://www.sciencedirect.com/science/article/pii/S0038092X16302183](https://www.sciencedirect.com/science/article/pii/S0038092X16302183)

* * *

vault, or a diffuse discretized Radiance distribution with either hourly or a statistical subset of suns and produces annual irradiation images from a single simulation \[175\]. The method successfully combines the advantages of alternatives approaches represented through a computational efficiency \[176\] and accuracy \[177\]. This approach has found particular application in estimating precisely annual solar irradiation on the building envelope and in an urban context, useful for identifying areas with a good PV potential and areas with an excessive solar exposure (overheating) that should consider shading options for reducing solar penetration. Another very accurate method for predicting PV potential through irradiance on the surface is A360 rendering engine used in Autodesk Green Building Studio. This method is validated in NREL according to the standard calculation methods for POA irradiance \[178-179\]. Both engines present valuable tools for estimating BIPV potential that can compete with tools designed only for PV, while effectively and accurately accounts for shading and complex environments contrary to the standard POA methods

## PV Cell Technologies

PV cells have different sensitivity to light in a certain range of wavelengths as well as irradiance levels. The spectral sensitivity curve is known as the spectral response. Figure 21 shows the spectral response curves for different PV cell types. Some PV cell types have the high spectral response in both visible and near-infrared part of the spectrum (c-Si). Others are more inclined towards the visible part of the spectrum (a-Si). Some PV tools like PVGIS use satellite solar radiation data for different spectral bands to calculate the effect of spectrum changes on the PV energy output (Figure 22). It is therefore important to assess irradiance levels on BIPV surfaces and verify PV cell type most suitable for a particular climate and setting.

_Figure 21 - Spectral sensitivity of different PV technologies (left), Relative efficiency at constant irradiance_

_at different module temperatures (right) Credit PVGIS_

* * *

Figure 22 - Effect of spectral variations on PV energy output for two PV technologies. Left: crystalline
silicon. Right: CdTe. The maps show the percentage increase (or decrease) in the energy output due to
spectral effects, i.e. value of -3 means the spectral effects cause a decrease in the energy output of 3%.
Credit PVGIS

Bifacial

Bifacial modules get more and more important in the market, also for BIPV applications. The simplest
irradiance calculation methods do not easily work for the combination of front and rear side absorption
and therefore more often ray-tracing has to be applied. A practical irradiance model for bifacial modules
has been presented by Marion et al. \[180\]. Also, there are particularities associated with the electrical
modelling of bifacial modules that are not captured by the typical electrical PV models currently in use.

6.3.10. Databases

In the software and apps observed, the PV modules can be selected from a Module Database. For
example, SAM, PV Watts, Solarius PV, PVSocut, PV Sol allows selecting the PV details such as PV
technology, type of installation (open, rack, roof-mounted, tracking), tilt angle, azimuth angle, etc. Some
software and apps allow entering custom module specifications (e.g. Sunnulator). In PV-GIS in addition
to PV technology, tilt, and azimuth angle, they type installation can be selected as fixed or buildingintegrated. However, most tools are made for conventional PV modules and do not have specific
components related to BIPV projects. Currently, BIMsolar-PVSITES software has details of BIPV modules
in their database that support configurators from cell to glazing allowing generation of realistic BIPV
modules (even semi-transparent aSi or CIGS). It would be easier for local designers and engineers if there were a database for commercially available BIPV module with technical specifications, cost information and fire rating information in PV design software. This would result in accurate calculations and simulation of BIPV project power output as well as the cost.

**Inverters**

Solar PV inverters facilitate the conversion of solar PV DC power to AC at the required voltage \[184\]. The performance of an inverter depends on topology (central, string, multi-string and micro), its point of work, threshold of operation, grid connection system, inverter output waveform, harmonic distortion and frequency, PV efficiency, maximum power point tracker (MPPT) and transformer \[51;185\]. Therefore, designers should choose inverters according to load types and power requirements. As in the selection of PV modules, most software has provided inverter databases for the users to select from. For example, SAM uses a single library of inverter input parameters which is maintained by the California Energy Commission (CEC). In PVsyst, PV SOL, PV\*SOL online and EasyPV the inverter can be auto- configured to suit the PV Panels. Whereas in software such as RetScreen Expert, Easy Solar the details the inverter capacity, efficiency, losses and cost details must be manually entered. The software SAM, Archelios Pro online contains micro inverter details to select from. Therefore, it would be easier for local designers, installers, and engineers if a comprehensive inverter database along with their technical specifications, cost information was presented to them in a PV design software, which would result in accurate calculations and simulation of PV project performance and as well as the cost and benefits.

**Batteries**

Batteries are used to store energy in PV applications for use at times when no solar irradiance is available (e.g. night time). The common battery type used in a PV system is the lead-acid battery. However, under extreme temperature life of the lead-acid battery will lower. Therefore, in such situations, Nickle Cadmium batteries are used \[186\]. The first decision that needs to make for battery sizing is ‘how much storage you would like your battery bank to provide’. Often this is expressed as ‘days of autonomy’ because it is based on the number of days you expect your system to provide power without receiving an input charge from the solar PV array \[187\]. Although batteries are a relatively low fraction of PV system initial costs, they can be the most expensive component in the overall life-cycle cost of a PV system \[186\]. Therefore, PV designers should ensure the selection of the most suitable battery for the PV system. Several software which facilitate the design of standalone PV systems provide either databased to select the battery (e.g. SAM, Homer Pro, PVsyst, Polysun Solarius PV, EasyPV), auto- configure based on the PV system and inverter parameters (e.g. SAM) or the parameters can be manually entered as per manufacturer specification (e.g. Sunnulator). Databases include the details of type/chemistry, battery bank sizing, current and capacity, power converters, storage dispatch controller, battery lifetime, battery bank replacement and thermal behavior. However, there should be a database with comprehensive battery product and cost information to cater to the design of BIPV systems.

## BOS components

BOS components typically constitute 10-50% of total system costs \[188\]. They are all the additional elements necessary to properly install the PV system such as isolators, cabling, circuit, charge controllers, earthing and lightning protection, metering systems, etc. Only several tools consider information on isolators, caballing, circuits, charge controllers, meters, monitors, inspectors, and frames. Out of them, tools such as Easy Solar online, Easy Solar App and SAM have considered the cost aspect only. In Solarius PV electrical components (in both AC and DC) can be added and the PV system wiring diagram is generated. Further, information such as voltages, currents, power and cable designations, wiring diagram can always be exported in the DXF/DWG CAD file formats. EasyPV has a database on DC Isolators, DC cable, and connectors, AC cable and isolators and meters. Most tools do not consider earthing and lightning protection or requirement for plant/equipment room under BOS. However, in PVscout an option is given to whether lightning protection provided or not can be selected. But PVscout is developed for Germany only, therefore, not suited to the local context. When considering the local context, a database with locally available products with codes and standards for installing these components is required. This is an important consideration in PV design software.

## 6.3.11. Grid Infrastructure

Two basic categories of PV systems are available today: (1) Stand-alone off-grid (2) Grid-tie PV systems (Batteryless or Battery-based). Electricity grids must have standard conditions of supply to ensure that end-use equipment and infrastructure can operate safely and effectively. These conditions are commonly referred to as power quality requirements voltage and frequency regulation, power factor correction and harmonics \[167\]. Source of energy in a grid-connected system can fluctuate significantly over timescales from seconds through hours to days and seasonally which can cause significant negative power quality impacts at high penetrations \[169\]. Therefore, in a distributed BIPV project it is necessary to understand the factors associated with the grid connection such as voltage; phase; power factor; feed-in power clipping, etc. For example, it helps to comprehend the available savings associated with reduced demand as some electricity networks charge demand in real power (kW) and in apparent power (kVA) \[170\].

Out of the 23 tools and 04 apps few tools e.g. Solarius PV, PV Scout 2.0, Polysun have provided the options on the electric grid types to differentiate the grid voltage between phase and neutral, a number of phases, displacement power factor, and feed-in power clipping. Polysun allows the users to select the grid configuration from a catalog e.g. single phase 230 50Hz or three-phase 230V/400V, 50 Hz Star WHY, etc. Also, the software considers maximum phase load, an imbalance in the feed-in phase (input). COSθ and feed in power limitation consumption. This knowledge is quite specific disciplinary related and hard for architects and consultants to understand. It would be good if the selection of grid types can be auto- configured with the combination with localized information.

# 6.4. Building Performance Simulation

Building physics addresses several different areas in building performance, including hygrothermal, acoustical and light-related properties, and the performance of the material, building assemblies (roof, facades, windows, etc.), spaces, the whole building, and the built environment \[189\]. In this study building types, interactive design, structural loads, energy loads, and neighboring building and objects are considered important in PV system design and management.

## 6.4.1. Structural

Impact of structural loads on PV arrays and PV attachments such as Dead Load, Wind Load, Earthquake (Seismic) Load, Live Load, Rain Load, Snow loads is vital in planning and development of a PV system \[190\]. These elements introduce substantial loads to the panels and the roof through wind up-lift, thermal expansion, and debris buildup and as a result, substantial loads can lead to the destruction of rooftops and PV systems \[191\]. In case of BIPV systems, the PV panels are integral with the roof or lay flat on the roof surface such that they do not affect the roof profile and they may consist of sheets of photovoltaic material attached to the roof membrane by an adhesive. The attachment method can significantly affect the loads that are being applied to the structure and how it is being handled. In most cases, building façade integrated PV is designed to withstand wind loads, snow loads, and impose loads: barrier loading, impact loading due to cleaning and maintenance, bomb blast effect and seismic effects \[192\]. Therefore, the entire PV array mounting system and all components must be designed to support the maximum expected load combinations.

None of the tools except EasyPV provide options for structural load calculations. EasyPV offers a simple calculation for the dead load and the wind load based on roof structure types (such as flat, truss, rafters, roof with hips and valleys, asymmetric pitched roof, etc.). The calculation is based on the total weight
of the solar array, the area covered by the solar array, weight of the mounting and ballast, weight of the
roof covering. This calculator works out the additional loading on the roof due to the solar array,
associated mounting components and wind load (Figure 23). This method does not actually check the
load capacity of the roof. It merely checks that the loading is not increased significantly. Nevertheless,
EasyPV is a tool which is specifically designed for assessing PV systems in the UK for roof-mounted PV
only. It does not support the roof-integrated or façade integrated PV. Therefore, it would be good for
software to consider structural load calculations combined with localized information.

Figure 23 - Easy PV Structural Load Calculation

6.4.2. Energy demand

Software such as Solarius PV, PV\*SOL Premium, HomerPro and SAM, allow to specify the electric
demand, or expected electricity consumption for a grid-connected power system. The loaded data
represents the electric demand of a building or other load center over the period of a single year. SAM’s
Input Time Series Load Data option allows you to import hourly or sub-hourly load data from a text file,
or paste it from a spreadsheet or other program. It also provides an option for scaling the load data to
better match the building's load or values from an electricity bill. Figure 24 shows whole building energy
analysis interface in INSIGHT for Revit.
Calculationsolar.com for online calculation of solar photovoltaic installations supports energy consumed on habitual use and use during weekends and holidays. It would be beneficial if the software can
incorporate instant data or at least a minimum time interval (minutes or seconds) on real-time energy
consumption data will significantly impact the accuracy of economic analysis and design optimization.
Further, the software can interpolate the data to forecast future consumption that facilitates to life cycle
analysis of PV system.

Figure 24 - Whole Building Energy Analysis in INSIGHT for Revit Credit Autodesk

PVs in buildings provide direct environmental advantages and serve as a statement of environmental
interest \[193\]. Photovoltaics are seen to be generally of benign environmental impact, generating no
noise or chemical pollutants during use \[194\]. The life cycle of PV systems consists of three phases: (1)
manufacturing and construction phase, (2) operational phase and (3) decommissioning phase \[195 –\
197\]. In the manufacturing and construction phase, electricity is required and imported from the national grids which are powered by various power plants, where 93% of the energy sources are fossil
fuels and a result, greenhouse gases would be emitted during the manufacturing and installation of PV
systems (e.g. Raw Materials Extraction, Materials Production, Module Manufacturer, System/Plant
Component, Manufacture Installation/Construction \[197\]. They are embedded in the installed PV
system. In the operational phase, PV systems generate clean electricity thus reduce the use of natural
gas and in return the emissions of greenhouse gases caused by the combustion of natural gas \[197-198\].
Further, in the decommissioning phase, electricity is required for recycling all the materials disposed of,
such as recycling of aluminum supporting structures and module frames \[198\].

Several software has covered the effect of PV systems on the environment. For example, Solarius PV,
PVsyst, Homer Pro, RetScreen calculate the emissions avoided which are expressed for a year and for 25
years. This helps to provide the customers and designers on the environmental impact through energy
saved from their proposed design. However, this software does not pay attention to the embedded
emissions of the PV system during the manufacturing and construction phase nor the emissions caused
during the decommissioning phase. Therefore, the amount of emission avoided could be overstated and
does not show a real situation.

6.4.6. Other

Heat Island Effect

The heat island effect is related to higher urban temperatures in the city centers compared to the
surrounding rural or suburban area \[199\]. According to Genchi et al. \[200\] and \[201\], if photovoltaic (PV)
panels are installed over a large area, the surface heat balance of the city will be altered. Large-scale PV
panel installation may influence urban microclimate in different ways: (1) shading effect: the PV panels
installed on the rooftops decrease conductive heat transfer through the roof of the building. Thus,
resulting in a reduction in the energy consumption for cooling the building and reduce CO2 emissions (2)
sensible heating effect of the PV panels: PV panels have albedos that are lower than most other building
surface materials and therefore tend to absorb more solar irradiation, thereby reaching a higher
temperature. Furthermore, because the surface area to volume ratio of the PV panels is large, the energy
absorbed is easily transmitted to the air, thus accelerating the urban heat island effect. However, it is
unclear if the same will occur under a massive deployment of PV in the cityscape. In \[202\], simulations
for an urban location in China revealed that, although the building surfaces experienced important
temperature and heat flux variations, the air temperature of urban canyons with integrated PV varied
little compared to a non-PV scenario. In fact, the opposite was obtained: the increase in conversion
efficiency lead to a reduction in the urban canyon air temperature. The literature on this issue is still
very scarce, and conclusions are drawn based only on small-scale simulations (given the complexity of
models). Existing studies for several locations in the world – Tianjin, Los Angeles \[203\], Phoenix e Tucson
\[204\], Paris \[205\], Osaka \[206\] – indicate a decrease in the electricity consumption for cooling in the
summer and a slight increase in heating needs in the winter, depending of course on local climate and
PV conversion efficiency.
Therefore, it is necessary to factor the effect to PV system towards heat island effect in the design

\\mathrm{C{}0}\_{2}

Impact on Indoor Environment

Rooftop PV panels produce a substantial amount of heat while generating power. Consequently, BIPV
has a significant influence on the amount of heat transfer through the building fabrics and could affect
the indoor air temperatures, cooling load and the comfort of the occupants, as it changes the thermal properties of the building envelops. Therefore, it is necessary to balance the effect of PV systems in the
building cooling load with the cost/benefits associated with the PV system design.

On the other hand, BIPV categories (C-E) indicate the application of BIPV in facades. This brings another
set of challenges on how to integrate BIPV so it doesn’t have any undesirable effect on the indoor
environment. Apart from potential thermal stress already discusses that is applicable to these BIPV
categories as well, BIPV may have a huge impact on visual and non-visual comfort. Solar design methods
and tools for assessing daylighting, glare and circadian effects are in general compatible with the tools
used in BIPV modeling as they use the same light source. Tools such as Ladybug Tools for Rhinoceros 3D
and INSIGHT for Revit (Figure 25) facilitate the analysis of multiple performances within the same design
framework that facilitates multi-criteria assessment. However, the majority of other tools do not allow
co-simulation of performances other than PV energy yield, and it would be beneficial if the design tools
could provide an indication on how the proposed design will affect the indoor environment of the
selected building.

Figure 25 - Daylighting Analysis in INSIGHT for Revit. Credit Autodesk

6.4.7. Optioneering

Every BIPV ideation process includes numerous design options to be considered during BIPV planning.
The process usually starts from a number of solutions that are iteratively assessed either through
parametric or traditional workflows. A traditional workflow typically iterates through a smaller number
of solutions than parametric one, due to the limitation of manually setting parameters and choosing
their right combination. In this workflow, the choice on the parameter set per solution is based on
designers’ knowledge, experience and rules-of-thumb approach, while successive iteration selection can
be described as a trial and error process. With an increased number of parameters, the set can be quite
challenging to define. Furthermore, a high uncertainty of the performance implies that successive
iteration may even perform less than previous. In this non-linear process and uneven design landscape,
keeping a track of options is a very useful option. With multiple solution comparisons, the selection is facilitated as all performance categories may be compared and subjectively evaluated based on the
designer’ preferences. In a parametric workflow, and depending solely on the computation power,
multiple options may be assessed through automated process mapping a whole design landscape.
Specific options with associated parameter set may be extracted and compared until the preferred
option is defined.

Integrated optimization

Iterating through vast design landscape may be very time-consuming depending on the parameter count
and simulation time per each simulation run. The smaller parameter set may be explored via brute force
methods, where each parameter set is assessed. However, with increased parameter count, and
especially in the case of integrated simulations, this approach would be practically impossible. In these
cases, the optimization process aims to rationalize this search and minimize the number of iterations by
using previous iterations to learn and make an informed selection. This machine learning process has a
great potential to go beyond human capacity to improve multi-objective of BIPV installations. Currently,
machine learning methods such as genetic algorithms, neural networks and recently deep-learning are
leading the innovation in this field. However, a very limited number of tools supports such optimization
techniques. Ladybug Tools is one of the rare ones that may implement optimization due to highly flexible
parametric workflow within Rhino/grasshopper. Additionally, there is an ongoing development for
BIMsolar within the H2020 BIPVBOOST Project to support this feature.

6.5. Economics

This section will discuss the economic factors concerning PV project design and development.

6.5.1. Costs

Capital cost / BOQ prices

Solar PV systems vary in cost and customers are required to evaluate the technology, installer, and
warranty to ensure that the most feasible system is selected. The cost of a solar PV system can be
affected by a range of different factors such as government rebates and support schemes, location,
number of panels, BOS components, etc \[52\]. In this study, direct cost is discussed under capital cost/bills
of quantities (BOQ) prices and operations and maintenance cost. In addition to module price, many
factors contribute to the price of a PV system. The capital cost of a PV system is composed of the PV
module cost and the Balance of system (BOS) cost \[51, 207}. The PV module cost is determined by raw\
material costs, notably silicon prices, cell processing/manufacturing, and module assembly costs. The\
BOS cost includes items, such as the cost of the structural system (e.g. structural installation, site\
preparation and other attachments), the electrical system costs (e.g. the inverter, transformer, wiring\
and other electrical installation costs) and the battery or other storage system cost in the case of offgrid applications \[207\]. In addition, soft costs such as labor costs, permitting, inspection, and\
interconnection; land acquisition; tax; and engineering, procurement, and construction (EPC)/developer\
overhead and net profit should be taken into consideration \[208\]. For further information refer IEA Task\
15: Subtask B is currently working towards, identification, benchmarking and development of business\
models of BIPV.\
\
Approximately all the described software and mobile apps have the capability to calculate the cost of a on the other hand, calculates the total installed cost considering 1. Direct cost: module, inverter, BOS, labor cost, installer margin and overhead and contingency 2. Indirect capital cost: cost for permits and environmental studies, engineering and development overheads, grid interconnections, land costs, and sales tax. In terms of the local context, it would be good for the software to have a database with PV system cost details.\
\
## Operations and maintenance cost\
\
In addition to thinking about upfront costs of the PV solar plant, determining a plan and budget for ongoing operations and maintenance (O&M) expenses is essential in assessing the business case for a facility \[209\]. Accordingly, maintenance cost can be broken-down across four categories 1. scheduled maintenance; 2. unscheduled maintenance; 3. inverter/equipment replacement; and 4. insurance, property taxes, and owner’s costs. Furthermore, the cost for Administration (Billing, accounting, hiring subcontractors and enforcement of warranties) and Monitoring (metering for revenue, alarms, diagnostics) come under O & M cost \[210\]. These costs will likely escalate over the life of PV project investment and should be factored into the financial analysis \[211\]. Only a few software has considered incorporating the O&M cost in the financial analysis (e.g. SAM, EasyPV, Polysun, RetScreen). SAM allows to enter O & M costs in three ways fixed annual costs, fixed annual costs proportional to the system rated/nameplate capacity and variable annual costs proportional to system annual electricity generation. However, in practice maintenance tasks and their frequency varies. Therefore, the operational and maintenance cost should be calculated annually based on the system planned preventive maintenance schedules. Another important feature in SAM is that it allows users to specify cost categories as an annual value which recur every year or an annual schedule where the user is required to allocate the cost to the year which is likely to occur. However, SAM does not specify the inflation or cost escalations thus, the users require to enter the cost details adjusted with likely inflations and escalations. It is essential for PV software to integrate maintenance schedules as well as associated costs.\
\
## 6.5.2. Benefits\
\
To optimize the return on the solar installation, the total lifetime cost of a solar installation and total energy generated should be compared to what would be spent with your current electricity provider during that same period \[52\]. Solar PV direct benefits are saving of electricity bills, building material cost offset, transmission loss, reduction of carbon cost.\
\
## Reduction of energy bills\
\
The electricity generated by a solar energy system offsets the consumption of electricity provided by the local utility. By foregoing the use of this electricity, solar customers avoid paying retail rates for the generation and delivery of, and any other incidental costs associated with, electricity obtained from a utility \[212\]. Solar PV and battery storage technologies offer consumers the ability to reduce their electricity bills. The extent to which the savings on these bills are currently being determined within the industry is limited to the savings associated with reduced volume consumption of electricity, denoted in kilowatt-hours (kWh) \[213\]. Most of the software and mobile apps calculate the electricity cost and savings. SAM calculates the electricity cost without the system and electricity cost with the system. The difference between the two is the net saving with the PV system. EasyPV the projected income from the system over the project lifetime in payments for generated and exported electricity, along with electricity savings, are shown. Another important feature found in SAM is supporting (i.e. hourly sub- hourly) electricity bill values. Ideally, there should be real-time data but having sub-hourly electricity- saving values has more data point than monthly data taken from utility bills \[214\]. Therefore, having sub-hourly data facilitates a more detailed level of analysis. Many countries have a number of energy pricing structures which vary based on the building type, energy provided, and the state located. For example, a rate that is subject to the same price always; a standard rate applies other than a lower offpeak rate, etc. Different rates for usage depending on the time of day. Typically, these tariffs have a peak\
rate period (usually weekdays and evenings) and off-peak rate (usually nights and weekends \[215\].\
However, if the software can facilitate an up to date energy price database the results of the analysis\
can be more accurate.\
\
Building material cost offsets\
\
One benefit of building-integrated PVs is that the cost of the elements they replace can be offset against\
the PV cost \[193\]. Incorporation of PV materials into products such as roofing materials, windows,\
awnings, and glassed facades provides the opportunity for cost reduction by replacing common building\
materials with PV materials \[51\]. According to Eiffert \[216\], If BIPV products completely replace\
traditional building materials, overall system costs should reflect a commensurate cost offset \[217\]\
which should be considered in the design evaluation. However, none of the software and apps has\
considered building material cost offsets in their PV system design platforms or in financial analysis.\
However, the software can maintain a database on the façade and roof material and their costs could\
facilitate the calculation of savings from the material offset.\
\
Reduction of transmission loss\
\
The compounded value of the additional energy generated by central plants that would otherwise be\
lost due to inherent inefficiencies (electrical resistance) in delivering energy to the customer via the\
transmission and distribution system \[218\]. When electricity is generated by a distributed generator, it\
need not be transported as far, so less energy is lost. The energy value of distributed generation is\
increased because distributed generation reduces the amount of electricity ‘lost’ in transport \[219-220\].\
Since PV generates energy at or near the customer, those losses are avoided \[218\]. None of the software\
and apps has considered this matter in their analysis. It would be beneficial if the owners could get a\
clear picture of the percentage of transmission loss they have avoided from the proposed PV system.\
\
Reduction of carbon cost\
\
\\mathrm{C O}\_{2}\
\
\\mathrm{C O\_{2}}\
\
Table 4 - Types of finance modes available\
\
Financing is one of the largest barriers to the development of renewable energy and this is true for both\
renewable energy and energy efficiency in any country. Solar photovoltaic systems have low running\
costs but comparatively high initial capital costs. Different types of financing modes/contracts are\
available for the solar photovoltaic system. Therefore, the PV owner must consider the best options for\
capital cost repayments \[43\]. Examples of several Solar PV financing contract arrangements are available\
as shown in Table 4. This section will cover the modes of finance applicable for PV installation as well as\
the parameters that should be considered in evaluating PV system option.\
\
| Finance Mode | Description |\
| --- | --- |\
\
* * *\
\
| Direct Finance | Self-funded or debt/loan |\
| --- | --- |\
| Fully owned or leased by a third party (Solar Power Purchase Agreement) | A solar company pays for the installation of a PV system in residence or business and then sells the owner the power it generates at a cheaper rate than what they would pay an energy retailer. |\
| Solar Leasing | Financed by a third party and lease arrangement made with the building owner. A supplier installs a solar PV system and the owner make monthly repayments on the system for a period, commonly five to 10 years |\
\
Some software supports analysis of financial contract information and most are designed for direct financing model (e.g. Polysun, PV scout, EasyPV, Solarius PV) where NPV, IRR and payback period is calculated taking debt financing into consideration. However, for direct financing of residential or commercial project, SAM allows the users to include 1. loan types: standard loan or mortgage; 2. loan parameters: debt fraction, loan term, loan rate, principal amount, the weighted average cost of capital.\
\
3. Analysis parameters: a period of analysis, inflation rate, real and nominal discount rates, tax and insurance rates; 4. salvage value: net salvage value, end of analysis period salvage value. Further, SAM consist of different templates for direct financing, third-party ownership, PA single owner, and PPA partnership. Inputs of different finance parameters for different financial models are different. Comparison of different finance models allows users to make informed decisions on the most financially feasible project. However, it would be good if a local finance model can be included in software for analyzing PV projects in Australia. Attributing each of these variables in a financial performance evaluation requires up-to-date market costs, as well as location-relevant energy and network costs, debt, inflation, tax rate, insurance rate, depreciation, and salvage value.\
\
## 6.5.4. Financial Analyses\
\
Financial to determine the expected financial benefit from a BIPV project to offset its current energy costs, the lifetime cash flows are required. Annual cash flows would comprise the cost of installing the equipment; the tax impact; depreciation; Renewable Energy incentives, energy costs, and energy savings. Based on annual cash flows the following financial indicators can be calculated.\
\
- Life cycle cost (LCC()/Net present value (NPV)\
- Simple Payback\
- The internal rate of return (IRR)\
- Profitability Index/Return on investment (ROI)/ Levelized cost of energy LCOE)\
- Sensitivity Analysis\
  Most of the examined software uses cash flow models to calculate NPV, Simple payback and Levelized cost of energy, net present value, payback period, and other financial metrics. For example, SAM (Figure\
\
26), Retscreen Expert, Solarious PV, and Homer Pro. Further, Retscreen Expert and Homer Pro facilitate Sensitivity Analysis as well.\
\
* * *\
\
_Figure 26 - Financial Analysis. Credit: System Advisor Model (SAM)_\
\
When concerning BIM integrated BIPV tools able to perform financial analyses, the choice is very limited. One such tool is INSIGHT (Solar analysis tool) for Revit ( Figure 27). This tool offers very simple analyses but very effective as they are integrated within the digital design workflow and does not require any file conversion, transfer or external software. As a consequence, analyses are fast and convenient and most importantly available at any time during the process.\
\
_Figure 27 – PV payback analysis in INSIGHT (Solar analysis tool) for Revit_\
\
## 6.5.5. Government Incentives\
\
* * *\
\
Government policies play a vital role in PV solar system decisions. They can be identified as tradable certificates, feed-in tariffs, finance loan programs and tax breaks \[223-224\].\
\
Several software has considered government incentives such as feed-in tariffs, incentives and tax breaks in the evaluation of PV system (e.g. SAM, Solarius PV, Polysun, EasyPV, Sunnulator, etc.). However, non- provide different types of government incentives applicable locally. For example, Sunnulator only shows the incentives applicable in Australia where retailer import tariff and retailer feed-in tariff for export can be included. The data on feed-in tariffs and tax breaks could be manually entered into these software systems. However, there’s a need for a database base with local government incentives to facilitate BIPV project design and management.\
\
* * *\
\
# 7\. Tools’ comparative analysis\
\
_Table 5 - Analysis of BIPV Design and Management tools_\
\
* * *\
\
_Table 6 - Analysis of BIPV Design and Management tools_\
\
* * *\
\
_Table 7 - Analysis of BIPV Design and Management tools_\
\
* * *\
\
_Table 8 - Analysis of BIPV Design and Management tools_\
\
* * *\
\
8. Discussion\
\
The findings in the above section show that the current PV design and management tools cannot satisfy\
all the above-mentioned aspects of PV design and management. Many application problems can be\
found in these tools which are given below.\
\
1. Lack of detailed localized meteorological data and localized terrain data\
\
Most tools do not consider the local geological/terrain of the project site and its impacts on the PV\
system output. However, terrain elevation is needed for calculation algorithms for solar radiation and\
PV performance can make use of the height of the local horizon to consider the effect of shadowing on\
the solar irradiance and hence PV output power \[225\]. An important consideration in achieving the\
efficiency of a PV panel is to evaluate the performance for any weather conditions and to match the\
maximum power output \[226\]. Therefore, actual local meteorological data in minimum time intervals\
(e.g. seconds, minutes) are required.\
\
2. Lack of localized PV system product (e.g. panel, storage, BOS) cost database\
\
Solar sector in Australia is highly competitive and offers many different systems with different designs,\
levels of quality and performance and price points \[52\]. However, in the current software do not have\
information on the PV system components used locally. Including local PV product costs, installation\
costs will significantly impact the accuracy of the economic analysis of the PV system.\
\
3. Lack of localized energy prices and localized building codes and standards\
\
Different building types have their respective building codes and standard as well as grid requirements\
and utility prices which have not been fully embedded into the tools; thereby it creates lots of difficulties\
for designers.\
\
4. Less consideration on roof /façade integrated PV design and assessment\
\
Among the PV design and management software and apps discussed most are developed for roofmounted PV and less consideration is given for ground-mounted and roof-integrated PV design and none\
for façade integrated designs. Further none of the software facilitate calculation of shading loss on\
façade integrated PV.\
\
5. Lack of information on finance modes and contract options\
\
Evaluation of different PV project finance modes and contract options are important in selecting the\
most viable option. Considering the local financing modes and contracts will provide accurate results to\
local stakeholders. However, most software tools have not embedded the feature of local finance\
contract arrangement which creates a lot of difficulties for designers.\
\
6. Lack of information on localized government incentives\
\
Different building types /PV projects have their respective government incentives. The locally available\
which have not been fully embedded into the tools; thereby it creates lots of difficulties for designers.\
7\. Difficulties for 3D virtual visualization and lack of consideration on different stakeholders’\
\
7. Difficulties for 3D virtual visualization and lack of consideration on different stakeholders’\
   perspectives\
\
Current tools seldom provide alternative modeling perspectives. 3D virtual visualization is considered in\
some tools but has limitations such as most cannot be used for BIPV buildings. Different stakeholders,\
such as designers, clients, contractors, and government, have different focuses on PV analysis and\
simulation. Further, in the certain software learning curve is high therefore, only specialized personnel\
could use them.\
\
* * *\
\
The existing software support comparison of alternative PV designs. The designer, owners, etc. must run each PV option individually and compare. Therefore, the users of these software face difficulties in deciding the most economic and efficient PV option.\
\
## 9\. Lack of information on other BOS components\
\
In a PV system, another BOS refers to the components and equipment that move DC energy produced by solar panels through the conversion system which in turn produces AC electricity. This includes the cables/wires, switches, enclosures, fuses, ground fault detectors, etc. Most tools have not considered the information on isolators, caballing, circuits, charge controllers, meters, monitors, earthing and lightning protection and plant /equipment rooms in system design and capital cost calculation. These items are an integral part of the PV system and will significantly impact the accuracy of the economic analysis as well as design optimization.\
\
## 10\. Lack of data on operation and maintenance costs\
\
In most cases, operation and maintenance of PV and its cost is given the very low profile. Even though PV system requires less maintenance, the cost involved in repair and replacement could be high. Therefore, it is necessary to identify the maintenance tasks, their frequencies and the applicable costs at the design stage to provide more realistic NPV values as well as clients can have a realistic picture on the post-construction costs.\
\
## 11\. Lack of consideration on carbon emission, heat island effect, and indoor environment\
\
Emission of the PV system only considers the operational phase. However, it is necessary to check the embedded emissions from the manufacturing, construction and decommissioning phase. Therefore, embedded CO2 emissions need to be taken into consideration to validate the actual reduction of CO2 emissions from Solar PV. Further, All the tools have missed the Heat Island effect of the PV panels. It is necessary to factor the effect to PV system towards heat island effect and impact on the indoor environment on the selected location in the design decision. This could be important in making environmental policies as well as urban development policies.\
\
## 12\. Lack of consideration on construction /installation and commissioning process\
\
None of the software has considered the commissioning and construction of the PV system. Tools available in the current market are more suitable for detailed design phase as the tools require a complex and detailed level of information as input \[7-8\]. However, the construction /installation and commissioning process in a PV project should be taken into account as the construction schedules with the performance status, installation process and safety training, defect inspection tracker for panels, inverters, frames, building envelop, etc., thermal imaging could facilitate the designers, developers, contractors and owners to track defects and design changes and for quality assurance.\
\
## 13\. Lack of real-time monitoring and control of the PV system\
\
Today monitoring and performance analysis of solar PV plants has become extremely critical due to the increasing cost of operation and maintenance as well as reducing yield due to performance degradation during the lifecycle of the plant equipment \[227\]. Most tools examined do not support the post- construction phase of the PV system. That is to identify whether the PV system is producing sufficient power around the clock or if not, how the PV system operation can be controlled. Presently, monitoring and control of the PV system are done through software given by the product or vendor. Therefore, it is difficult for users of the PV system to identify the real-time performance of the PV system.\
\
## 14\. Not considering the decommissioning phase\
\
* * *\
\
None of the software has considered the decommissioning phase and the cost and environmental aspect\
of it due to the lack of inputs as BIPV is not yet a mature market. For clients, it is important to take notice\
of the end-of-life treatment to ensure that the solar modules/components/materials can be\
reused/recycled/recovered. Further, this will affect the calculation of NPV and financial analysis as well.\
\
The above findings show that the current PV design and management tools cannot satisfy all of the\
above-mentioned aspects of PV design and management. It is therefore essential to develop an\
integrated platform which will provide cost-effective solutions for PV project development. Several\
studies have been carried out in this regard. They have mainly focused on using BIM software for Solar\
PV design. For example, Dixit et al. \[228\], developed an Application Programming Interface program in\
Autodesk Revit to calculate the orientation of a sun-tracking PV roof tile/panel which can be used to\
simulated PV electricity in Revit. Gupta et al. \[229\], developed a conceptual framework for PV simulation\
using an open BIM standard format. However, none of the above studies has considered the whole life\
cycle of PV projects on their platforms. Therefore, this study proposes a decision support system which\
will address stakeholders’ practical difficulties. The proposed improvements are categorized under three\
main headings: Information, Simulation, and analysis options and PV system operation - Table 9. The\
proposed platform will operate under eight segments: weather and terrain database, virtual model\
builder, local PV product database, lifecycle cost-benefit analysis, local building regulations, energy\
consumption/generation, operation, and maintenance environmental benefits as shown in Figure 28.\
\
Table 9 - Proposed Improvements for Solar PV Design and Management Tools\
\
| Category | Proposed Improvements |\
| --- | --- |\
| Information | Detailed local meteorological data and local geographic/terrain data with minimum time intervals |\
| Localized PV system product database (e.g. panel, storage, BOS) |  |\
| Localised cost data on PV system products and installation |  |\
| Localised energy price data |  |\
| Accurate energy consumption data |  |\
| Information on local building regulations and codes |  |\
| Information on local government incentives and policies |  |\
| Information on financial modes and contract arrangements |  |\
| Database on previous project examples |  |\
| Information on product performance in previous projects |  |\
| Information on installers' track record and experiences |  |\
| Information on commissioning and O&M procedures |  |\
| Simulation and analysis options | Efficient 3D model creation of the physical environment |\
| Generation and comparison of alternative PV module designs |  |\
| Visualization of shading impact and losses |  |\
| Automatic PV system configuration and optimization |  |\
| Accurate energy consumption data simulation |  |\
\
* * *\
\
|  | Installation process simulation and impact analysis (e.g. impact of harsh weather conditions, occupational health and safety risks etc. on the project completion and cost) Matching and optimizing energy outputs with fluctuating demands and electricity prices Balancing revenue against the cost to optimise PV module and storage sizes Analysis of environmental impact (carbon footprint, heat island) Lifecycle cost-benefit analysis and comparison from different stakeholders’ perspectives Sensitivity analysis by changing simulation and assessment factors |\
| --- | --- |\
| PV system operation | PV system performance monitoring and recording Auto diagnosing function to alarm Und users’ behavior should be monitored and recapped in the performance optimisation |\
\
* * *\
\
\[Image: R532\]\
WEATHER AND TERRAIN DATABASE\
\[Image: R536\]\
\[Image: R540\]\
\
\[Image: R526\]\
\[Image: R520\]\
\
SOLAR PV\
DESIGN/MANAGEME\
NT PLATFORM\
\[Image: R564\]\
\
\[Image: R550\]\
OPERATIONS &\
MAINTENANCE\
Monitoring and inspection\
\[Image: R560\]\
\
* * *\
\
# 9\. Conclusion\
\
This report summarized the complex BIPV planning process and demonstrated various methods and tools, addressing their advantages and limitations regarding specific BIPV categories. Analysis of a BIPV design and management process spans across the interests of multidisciplinary stakeholders including academic and industrial parties. The report included 15 domains of BIPV planning such as geophysical, technical, economic and environment which affect successful BIPV integration. 27 software, 9 Online tools, and 4 Apps were compared against the aforementioned domains. The findings of this review showed none of the examined software and apps can cater to all the factors pertaining to PV project design and management. Therefore, this study propose a decision support system which will address stakeholders’ practical difficulties by providing the main features: (1) a localized data repository which will include weather information, building regulations, energy consumptions in different building sectors, utility prices, construction and maintenance costs, contract types, financial modes, carbon prices and government incentive schemes; (2) efficient 3D model creation of the physical environment;\
\
(3) Hourly comparison of energy input and output; (4) PV layout design optimization; (5) Simulated installation process and impact analysis; (6) Monitoring and inspection modules with auto diagnosing function; (7) PV system performance recording; and (8) sensitivity analysis and scenario-based decision making support.\
\
* * *\
\
10. Future work\
\
The methodology presented in this study analyses the BIPV planning process from a multi-stakeholder\
perspective. Future trends will stream towards integrative approaches where digital communication will\
allow interactive collaboration and decision making. Creation of digital-value chain will be a prerequisite\
for larger BIPV implementation and acceleration. A prerequisite for such digitalization will be a creation\
of BIPV standards and classification according to Industry Foundation Classification (IFC) that will be used\
to describe BIPV products, store information, facilitate interoperability of software through the unified\
format. This BIPV data-classification within Building Information Modelling (BIM) will also affect the\
integration of design and engineering processes to produce highly aesthetic and performing BIPV.\
Therefore, future work will be focused on the BIPV planning within BIM and the creation of improved\
\
Therefore, future work will be focused on the BIPV planning within BIM and the creation of improved\
tools, workflows, data management, and interoperability. In particular, future works will be built around\
the following themes:\
• Tools: Validation of existing BIPV simulation tools assessing accuracy, speed for variable spatial\
\
• Tools: Validation of existing BIPV simulation tools assessing accuracy, speed for variable spatial\
and temporal resolution as well as a comparison to round-robin results.\
• Workflows: Collecting existing and proposing novel approaches that connect BIM and BIPV that\
\
• Workflows: Collecting existing and proposing novel approaches that connect BIM and BIPV that\
support integrative processes and feedback from stakeholders. Survey to the main players of\
the process.\
• Data management: Digital (BIM) product data models. Collecting requirements (parametric?\
\
• Data management: Digital (BIM) product data models. Collecting requirements (parametric?\
data formats? usability in different phases?…). Standardization of digital (BIM) product data\
models creation for BIPV (e.g. representative modules in standards vs. parametric product data\
models). Identifying which of the approaches in fulfill these requirements and where further\
development is required.\
• Digital BIM-based process for BIPV. Definition of reference processes and requirements\
\
• Digital BIM-based process for BIPV. Definition of reference processes and requirements\
(Interoperability? Usability for non-experts? Full flexibility vs. standard procedure?…).\
\
* * *\
\
References\
\
\[1\] Intergovernmental Panel on Climate Change (IPCC) (2014). Climate Change 2014: Mitigation of\
Climate Change. The contribution of Working Group III to the Fifth Assessment Report of the\
Intergovernmental Panel on Climate Change \[Edenhofer, O., R. Pichs-Madruga, Y. Sokona, E.\
Farahani, S. Kadner, K. Seyboth, A. Adler, I. Baum, S. Brunner, P. Eickemeier, B. Kriemann, J.\
Savolainen, S. Schlömer, C. von Stechow, T. Zwickel and J.C. Minx (eds.)\]. Cambridge University\
Press, Cambridge, United Kingdom and New York, NY, USA; 2014, p. 675-677.\
\[2\] Pandey A.K., Tyagi V.V., Selvaraj J. A. L., Rahim N. A. and Tyagi S.K. (2016). Recent advances in\
solar photovoltaic systems for emerging trends and advanced applications. Renewable and\
Sustainable Energy Reviews 53:859–884.\
\[3\] Klise G.T., Stein J.S., (2009). Models used to assess the performance of photovoltaic systems.\
Sandia Report, Sand2009-8258; December 2009.\
\[4\] Gridscape (2013). Solar PV Design: Best Practices. White paper.\
\
\[5\] Axaopoulos P. J., Fylladitakis E.D., and Gkarakis K., (2014). Accuracy analysis of software for the\
estimation and planning of photovoltaic installations. Int J Energy Environ Eng; 5 (1): pp. 1-7.\
\
\[6\] Freeman J., Whitmore J., Blair N., Dobos A.P., (2014). Validation of multiple tools for flat plate\
photovoltaic modeling against measured data. National Renewable Energy Laboratory (NREL),\
Denver West Parkway Golden, CO, USA, NREL/TP-6A20-61497 Prepared under Task No.\
SS13.5010.\
\[7\] Dubois, M.C., Horvat M., (2010). State-of-the-art of digital tools used by architects for solar design.\
\[T. 41. B. 1\]. International Energy Agency for Solar Heating and Cooling, Paris, France.\
\[8\] Kanters, J., Horvat, M., Dubois M. C. (2014). Tools and methods used by architects for solar design.\
Energy Build; 68: pp. 721-731.\
\[9\] Task 41: Solar Energy and Architecture - Subtask B: Methods and Tools for Solar Design. Report\
T.41.B.1 State-of-the-art of digital tools used by architects for solar design. The International\
Energy Agency Solar Heating and Cooling Programme (IEA SHC), 2010\
\[10\] Task 41: Solar Energy and Architecture - Subtask B: Methods and Tools for Solar Design. Report\
T.41.B.3 Solar Design of Buildings for Architects: Review of Solar Design Tools. The International\
Energy Agency Solar Heating and Cooling Programme (IEA SHC), Jul-2012\
\[11\] Jakica, N., 2018. State-of-the-art review of solar design tools and methods for assessing\
daylighting and solar potential for building-integrated photovoltaics. Renewable and Sustainable\
Energy Reviews, 81, pp.1296-1328.\
\[12\] Sharma, D.K., Verma, V. and Singh, A.P., (2014). Review and analysis of solar photovoltaic\
softwares. International Journal of Current Engineering and Technology; 4(2): pp.725-731.\
\[13\] Fox S., (2011). Mobile Apps for Solar PV design and calculation. Available at:\
[https://www.civicsolar.com/support/installer/articles/mobile-apps-solar-pv-design-andcalculation](https://www.civicsolar.com/support/installer/articles/mobile-apps-solar-pv-design-andcalculation). \[Accessed 08 November 2017\].\
\[14\] Freitas, S., Catita, C., Redweik, P., & Brito, M. C. (2015). Modelling solar potential in the urban\
environment: State-of-the-art review. Renewable and Sustainable Energy Reviews, 41, 915–931.\
[https://doi.org/10.1016/J.RSER.2014.08.060](https://doi.org/10.1016/J.RSER.2014.08.060)\
\[15\] Bakos, Soursos, and Tsagas (2003). Technoeconomic assessment of a building-integrated PV\
system for electrical energy saving in residential sector. Energy & Buildings; 35(8), 757-762.\
\
* * *\
\
\[16\] Rehman S., Bader M. A., and Al-Moallem S. A., (2007). Cost of solar energy generated using PV\
panels. Renewable and Sustainable Energy Reviews; 11(8), 1843-1857.\
\[17\] Amit Jain, Rajeev Mehta and Susheel K. Mittal (2011). Modeling Impact of Solar Radiation on Site\
Selection for Solar PV Power Plants in India. International Journal of Green Energy; 8:4, 486-498.\
\[18\] Shah K. K., Mundada A. S., and Pearce J. M., (2015). Performance of U.S. hybrid distributed energy\
systems: Solar photovoltaic, battery and combined heat and power. Energy Conversion and\
Management;105, pp.71–80.\
\[19\] Roberts, T., Stace, N., Roberts, A., Conway, D., Van Nettern, J., and Woodard, N., (2016). Moving\
your campus Smartly to 100% renewable energy. In Proceedings of the 16th International\
Australasian Campuses Towards Sustainability (ACTS) Conference; Sunshine Coast, Australia.\
\[20\] Reichelstein S and Yorston M., (2013). The prospects for cost competitive solar PV power. Energy\
Policy; 55, pp.117–127.\
\[21\] Cameron C.P., Boyson W.E. and Riley D.M., (2008). Comparison of PV system performance-model\
predictions with measured PV system performance. In Photovoltaic Specialists Conference, PVSC\
'08\. 33rd IEEE, pp.1–6.\
\[22\] Good C. Andresen I. and Hestnes A. G. (2015). Solar energy for net zero energy buildings – A\
comparison between solar thermal, PV and photovoltaic–thermal (PV/T) systems. Solar Energy;\
122, pp.986–996.\
\[23\] Cavalcante F. F., Vanise dos Santos Rodrigues , Greyce dos Santos Rodrigues, Marcus Vinicius Alves\
Nunes, Elda Nunes de Carvalho, Wilson Gonçalves de Araújo et al. (2017). Simulation Study to\
Evaluate the Performance of a Photovoltaic System Connected to the Electrical Network in the\
Municipality of Terra Santa – PA. Journal of Engineering and Technology for Industrial\
Applications. Edition.10. Vol: 03: pp. .133-141.\
\[24\] Oswaldo A. Arráez-Cancelliere ; Nicolás Muñoz-Galeano ; Jesús M. Lopez-Lezama (2017).\
Performance and economical comparison between micro-inverter and string inverter in a 5, 1\
kWp residential PV-system in Colombia. In 2017 IEEE Workshop on Power Electronics and Power\
Quality Applications (PEPQA).\
\[25\] Ghafoor A and Munir A., (2015). Design and economics analysis of an off-grid PV system for\
household electrification. Renewable and Sustainable Energy Reviews; 42, pp.496–502\
\[26\] Milosavljević, D.D., Pavlović, T.M. and Piršl, D.S., (2015). Performance analysis of A grid-connected\
solar PV plant in Niš, republic of Serbia. Renewable and Sustainable Energy Reviews; 44, pp.423-\
435\.\
\[27\] D.Z. (2011). Perspectives and assessments of solar PV power engineering in the Republic of\
Serbia. Renewable and Sustainable Energy Reviews; 15(5), pp.2431-2446.\
\[28\] Chris Deline, Aron Dobos, Steven Janzou, Jenya Meydbray, Matt Donovan (2013). A simplified\
model of uniform shading in large photovoltaic arrays. Solar Energy; 96, pp.274–282.\
\[29\] Soucase, B.M., Aleman, J.P. and Guaita-Pradas, I., (2016). Design of a solar system installation in\
Marrakesch using the SKELION software tool. In Renewable and Sustainable Energy Conference\
(IRSEC), 2016 (pp. 717-721). IEEE.\
\[30\] Nault, E., Peronato, G., Rey, E. and Andersen, M., (2015). Review and critical analysis of earlydesign phase evaluation metrics for the solar potential of neighborhood designs. Building and\
environment; 92, pp.679-691\
\
* * *\
\
\[31\] Sauer, K.J., Roessler, T. & Hansen, C.W., (2015). Modeling the Irradiance and Temperature\
Dependence of Photovoltaic Modules in PVsyst. Photovoltaics. IEEE Journal; 5(1), pp.152–158.\
\[32\] Karki, P., Adhikary, B. & Sherpa, K., (2012). Comparative study of grid-tied photovoltaic (PV)\
system in Kathmandu and Berlin using PVsyst. Sustainable Energy Technologies (ICSET), 2012 IEEE\
Third International Conference; pp.196–199.\
\[33\] Darghouth, N. R., Barbose, G., and Wiser, R., (2011). The impact of rate design and net metering\
on the bill savings from distributed PV for residential customers in California. Energy Policy; 39(9),\
pp.5243-5253.\
\[34\] Kuo, Hang-Jung ; Hsieh, Shang-Hsien ; Guo, Rong-Chin ; Chan, Chi-Chang (2016). A verification\
study for energy analysis of BIPV buildings with BIM. Energy & Buildings; 130, pp.676–691.\
\[35\] Hofierka, J. and Kaňuk, J. (2009). Assessment of photovoltaic potential in urban areas using opensource solar radiation tools. Renewable Energy; 34(10), pp.2206-2214.\
\[36\] Jianping, S. (2011). An optimum layout scheme for photovoltaic cell arrays using PVSYST.\
Mechatronic Science, In Electric Engineering and Computer (MEC), International Conference,\
2011; pp.243–245.\
\[37\] Kazem, Hussein ; Al-Badi, Hamood ; Al Busaidi, Ahmed ; Chaichan, Miqdam (2017). Optimum\
design and evaluation of hybrid solar/wind/diesel power system for Masirah Island. Environment,\
Development and Sustainability; 19(5), pp.1761–1778.\
\[38\] Hofer, J., Groenewolt, A., Jayathissa, P., Nagy, Z. and Schlueter, A. (2016). Parametric analysis and\
systems design of dynamic photovoltaic shading modules. Energy Science & Engineering; 4(2),\
pp.134-152.\
\[39\] De Simón-Martín, M., Díez-Mediavilla, M., & Alonso-Tristán, C. (2016). Shadow-band radiometer\
measurement of diffuse solar irradiance: calculation of geometrical and total correction factors.\
[https://doi.org/10.1016/j.solener.2016.09.026](https://doi.org/10.1016/j.solener.2016.09.026)\
\[40\] Lalwani M, Kothari D and Singh M. (2010). Investigation of solar photovoltaic simulation\
softwares. International Journal of Applied Engineering Research; 1(3):585-601.\
\[41\] Manoj kumar, Nallapaneni (2017). Simulation Tools for Technical Sizing and Analysis of Solar PV\
Systems. Conference: Proceedings of the 6th World Conference on Applied Sciences, Engineering\
and Technology (WCSET-2017), 26-27 August 2017, UMPO, Indonesia, ISBN 13: 978-81-930222-3-\
8, pp 218-222, At Universitas Muhammadiyah Ponorogo, Indonesia.\
\[42\] photovoltaic-software.com. Photovoltaic & Solar Electricity Design Tools. Available at:\
[http://photovoltaic-software.com](http://photovoltaic-software.com/), 2017 \[Accessed 04 July 2017\].\
\[43\] Prasad, D., Snow, M. and Watt, M., 2005. Best Practice Guidelines for Solar Power Building\
Projects in Australia. Renewable Energy Industry Development (REID 7) Program, The University\
of New South Wales (UNSW).\
\[44\] Gleason B. (2009). PV System Commissioning. Available at:\
[http://solarprofessional.com/articles/design-installation/pv-systemcommissioning#.WhXrY0qWZPY](http://solarprofessional.com/articles/design-installation/pv-systemcommissioning#.WhXrY0qWZPY), 2009 \[Accessed 14 October 2017\]\
\[45\] Josh Haney and Adam Burstein (2013). PV System Operations and Maintenance Fundamentals.\
Solar America Board for Codes and Standards 2013.\
\[46\] Balfour, John R, Nash, Nicole Bremer. and Shaw, Michael., (2013). Introduction to photovoltaic\
system design, Burlington, MA: Jones & Bartlett Learning.\
\
* * *\
\
\[47\] Jeremy Moss, Alicia Coram and Grant Blashki (2014). Solar energy in Australia: Health and\
environmental costs and benefits. The Australia Institute.\
\[48\] Park A & Lappas, P. (2017). Evaluating demand charge reduction for commercial-scale solar PV\
coupled with battery storage. Renewable Energy; 108, pp.523–532.\
\[49\] Infinite Energy (2017). What’s Really Included in Your Commercial Solar Quote?. Available at:\
[https://www.infiniteenergy.com.au/whats-really-included-commercial-solar-quote/](https://www.infiniteenergy.com.au/whats-really-included-commercial-solar-quote/) 2017\.\
\[accessed 25 July 2017\].\
\[50\] Clean Energy Council (2017). Guide to Installing Solar PV For Business and Industry. Clean Energy\
Council, Australia.\
\
\[51\] Norton, B., Eames, P.C., Mallick, T.K., Huang, M.J., McCormack, S.J., Mondol, J.D. and Yohanis, Y.G.\
(2011). Enhancing the performance of building integrated photovoltaics. Solar Energy; 85(8),\
pp.1629-1664.\
\[52\] Clean Energy Council (2012). Solar PV Fact Sheet: A guide to purchasing solar power for your\
school, Clean Energy Council, Australia.\
\[53\] Stapleton, Geoff & Neill, Susan.. Grid-Connected Solar Electric Systems, Hoboken: Taylor and\
Francis, 2012.\
\[54\] Weygant, R. S. (2011). BIM content development : standards, strategies, and best practices. Wiley.\
\[55\] Bonomo, P., Saretta, E., and Frontini, F. (2018) Towards the implementation of a BIM-based\
approach in BIPV sector. In: Conference On Advanced Building Skins 2018.\
\[56\] Lisell, L., Tetreault, T., and Watson, A. (2013). Evaluation and Selection of Renewable Energy\
Technologies for Highway Maintenance Facilities, ProQuest Dissertations and Theses.\
\[57\] Deambi, S. (2016). Petroleum Sector Going The Natural Energy Resources Way. Energy Future;\
5(1), pp.34–41.\
\[58\] STÖHR+SAUER CAD- und Computersystem GmbH (2017). Helios 3D solarparkplanung. Available\
at: [https://www.helios3d.com/index.php/en/](https://www.helios3d.com/index.php/en/), 2017 \[accessed 08 July 2017\].\
\[59\] Patel, H. and Agarwal, V. (2008). MATLAB-based modeling to study the effects of partial shading\
on PV array characteristics. IEEE transactions on energy conversion, 23(1), pp.302-310.\
\[60\] Dubey S., Sarvaiya, J. N., Bharath Seshadri Energy Research Institute and Nanyang Technological\
University . Temperature Dependent Photovoltaic (PV) Efficiency and Its Effect on PV Production\
in the World: A Review.\
\[61\] S. Mekhilef, R. Saidur, M. Kamalisarvestani (2012). Effect of dust, humidity and air velocity on\
efficiency of photovoltaic cells. Renewable and Sustainable Energy Reviews; 16 (2012) 2920–2925\
\[62\] Said et al. (2018). The effect of environmental factors and dust accumulation on photovoltaic\
modules and dust-accumulation mitigation strategies. Renewable and Sustainable Energy\
Reviews; 82, pp.743–760.\
\[63\] De Simón-Martín, M., Díez-Mediavilla, M., & Alonso-Tristán, C. (2016). Shadow-band radiometer\
measurement of diffuse solar irradiance: calculation of geometrical and total correction factors.\
[https://doi.org/10.1016/j.solener.2016.09.026](https://doi.org/10.1016/j.solener.2016.09.026)\
\[64\] IEC System of Conformity Assessment Schemes for Electrotechnical Equipment and Components\
(IECEE) (2016). IEC 61215-1-1:2016 Terrestrial photovoltaic (PV) modules - Design qualification\
and type approval - Part 1-1: Special requirements for testing of crystalline silicon photovoltaic\
(PV) modules\
\
* * *\
\
\[65\] Roberts, Mendiburu Zevallos & Cassula, (2017). Assessment of photovoltaic performance models\
for system simulation. Renewable and Sustainable Energy Reviews, 72, pp.1104–1123.\
\[66\] Cristaldi et al., (2012). Economical evaluation of PV system losses due to the dust and pollution.\
In: Instrumentation and Measurement Technology Conference (I2MTC), 2012 IEEE International,\
pp.614–618.\
\[67\] W. F. Marion, (2010). “Overview of the PV Module Model in PVWatts,” National Renewable\
Energy Laboratory (NREL), Albuquerque, New Mexico, USA, NREL/PR-520-49607,\
\
\[68\] W. De Soto, S. A. Klein, and W. A. Beckman, (2006). “Improvement and validation of a model for\
photovoltaic array performance,” Sol. Energy, vol. 80, no. 1, pp. 78–88\
\[69\] A. F. Souka and H. H. Safwat, Oct. (1966). “Determination of the optimum orientations for the\
double-exposure, flat-plate collector and its reflectors,” Sol. Energy, vol. 10, no. 4, pp. 170–174\
\[70\] ASHRAE (1997). “93-77: Methods of testing to determine the thermal performance of solar\
collectors.” Refrigeration and Air Conditioning Engineers, Inc., New York\
\[71\] N. Martin and J. M. Ruiz, (2001). “Calculation of the PV modules angular losses under field\
conditions by means of an analytical model,” Sol. Energy Mater. Sol. Cells, vol. 70, no. 1, pp. 25–\
38\
\[72\] N. Martín and J. M. Ruiz, (2002). “A new model for PV modules angular losses under field\
conditions,” Int. J. Sol. Energy, vol. 22, no. 1, pp. 19–31\
\[73\] N. Martín and J. M. Ruiz, (2005). “Annual angular reflection losses in PV modules,” Prog. Photovolt.\
Res. Appl., vol. 13, no. 1, pp. 75–84\
\[74\] D. L. King, J. A. Kratochvil, and W. E. Boyson, (2004). “Photovoltaic array performance model,”\
Sandia National Laboratories, Albuquerque, New Mexico, USA\
\[75\] A. S.-N. Dynge and A. O. Stoveland, (2013). “Optical modelling for photovoltaic panels,” Master\
Thesis, University of Agder, Kristiansand S, Norway\
\[76\] Mermoud, (2012). Pvsyst: Software for the study and simulation of photovoltaic systems. Geneva,\
Switzerland: ISE, University of Geneva\
\[77\] R. Perez, R. Seals, P. Ineichen, R. Stewart, and D. Menicucci, (1987). “A new simplified version of\
the Perez diffuse irradiance model for tilted surfaces,” Sol. Energy, vol. 39, no. 3, pp. 221–231\
\[78\] R. Perez, R. Stewart, R. Seals, and T. Guertin, (1988). “The Development and Verification of the\
Perez Diffuse Radiation Model,” Sandia National Labs., Albuquerque, New Mexico, USA;\
University at Albany, State University of New York, Atmospheric Sciences Research Center,\
Albany, USA, SAND-88-7030\
\[79\] R. Perez, P. Ineichen, R. Seals, J. Michalsky, and R. Stewart, (1990). “Modeling daylight availability\
and irradiance components from direct and global irradiance,” Sol. Energy, vol. 44, no. 5, pp. 271–\
289\
\[80\] 4.4 Empirical Correlation for Estimating Components of Light \| EME 810: Solar Resource\
Assessment and Economics. (n.d.). Retrieved March 30, 2019, from [https://www.eeducation.psu.edu/eme810/node/683](https://www.eeducation.psu.edu/eme810/node/683)\
\[81\] Zomer C, Rüther R. (2017). Simplified method for shading-loss analysis in BIPV systems – part 1:\
Theoretical study. Energy Build 2017;141:69–82. doi:10.1016/j.enbuild.2017.02.042.\
\[82\] Zomer C, Rüther R. (2017). Simplified method for shading-loss analysis in BIPV systems. Part 2:\
Application in case studies. Energy Build 2017;141:83–95. doi:10.1016/j.enbuild.2017.02.043.\
\
* * *\
\
\[83\] S. PVsyst, (2012). “User’s Guide: PVsyst Contextual Help.\
\[84\] Dubayah, R., Rich, P.M., (1995). Topographic solar radiation models for GIS. International journal\
of geographical information systems, 9, 405–419.\
\[85\] Tregenza, P.R., (1987). Subdivision of the sky hemisphere for luminance measurements. Lighting\
Research & Technology, 19, 13–14.\
\[86\] Littlefair, P., (1998). Passive solar urban design: ensuring the penetration of solar energy into the\
city. Renewable and Sustainable Energy Reviews , 2, 303–326.\
\[87\] Ratti, C., Richens, P., (2004). Raster Analysis of Urban Form. Environment and Planning B: Planning\
and Design 31, 297–309.\
\[88\] T. R. Oke, (1981). Canyon geometry and the nocturnal urban heat island: comparison of scale\
model and field observations. Journal of Climatology, Vol. 1,237-254\
\[89\] S. B. Grimmond, S. K. Potter, H. N. Zutter, C. Souch, (2001). Rapid methods to estimate sky-view\
factors applied to urban areas, Journal of Climatology, Vol. 21, 903-913\
\[90\] K. Yoon, G, Yun, J, Jeon, K. S. Kim, (2014). Evaluation of hourly solar radiation on inclined surfaces\
at Seoul by Photographical Method, Solar Energy, Vol. 100, pp 203-216\
\[91\] Joze Rakovec, Klemen Zaksek, (2012). On the proper analytical expression for the sky-view factor\
and the diffuse irradiation of a slope for an isotropic sky, Renewable Energy, Vol. 37, pp. 440-444\
\[92\] L. Chen, E. Ng, X. An, C. Ren, M. Lee, U. Wang, Z. He, (2012). Sky view factor analysis of street\
canyons and its implications for daytime intra-urban air temperature differentials in high-rise,\
high-density urban areas of Hong Kong: a GIS-based simulation approach, International Journal of\
Climatology, Vol. 32, 121–136\
\[93\] J. Unger, (2009). Connection between urban heat island and sky view factor approximated by a\
software tool on a 3D urban database, Int. J. Environment and Pollution, Vol. 36, 59-80.\
\[94\] Lindberg, F., Holmer, B., (2010). Sky View Factor Calculator User Manual – Version 1.1. University\
of Gothenburg.\
\[95\] Holmer, B., Postgard, U. and Eriksson, M., (2001). Sky view factors in forest canopies calculated\
with IDRISI, Theoretical and Applied Climatology, Vol. 68, pp.33–40.\
\[96\] Johnson, G.T. and Watson, J.D., (1984). The determination of view-factors in urban canyons’,\
Journal of Climate and Applied Meteorology, Vol. 23, pp.329–335.\
\[97\] Chapman, L., Thornes, J.E. and Bradley, A.V., (2002). Sky-view factor approximation using GPS\
receivers, International Journal of Climatology, Vol. 22, pp.615–621.\
\[98\] Chapman, L., & Thornes, J., (2004). Real-Time Sky-View Factor Calculation and Approximation. J.\
Atmos. Oceanic. Technol; 21, 730-741.\
\[99\] Map of Live Satellite Positions, (2016) Available at: [https://in-the-sky.org/satmap\_radar.php](https://in-the-sky.org/satmap_radar.php)\
\[100\] Redweik, P., Catita, C., Brito, M.C., (2013). Solar energy potential on roofs and facades in an urban\
landscape, Solar Energy, Vol 97, 332-341.\
\[101\] Wijeratne, W. P. U., Yang, R. J., Too, E., & Wakefield, R. (2018). Design and development of\
distributed solar PV systems: Do the current tools work?. Sustainable cities and society.\
\[102\] T. Whitted and J. D. Foley, (1980). “An Improved Illumination Model for Shaded Display,”\
\[103\] J. T. Kajiya, (1986). “The rendering equation,” in ACM Siggraph Computer Graphics, Dallas, USA,\
vol. 20, pp. 143–150.\
\
* * *\
\
\[104\] P. S. Shirley, (1991). “Physically Based Lighting Calculations for Computer Graphics,” PhD Thesis, University of Illinois at Urbana-Champaign, Urbana, Illinois, USA\
\
\[105\] M. Pharr and G. Humphreys, (2010). Physically Based Rendering: From Theory to Implementation. Burlington, MA, USA: Morgan Kaufmann\
\
\[106\] H. Pacheco, “Ray Tracing in Industry. An up-to-date review of industrial ray tracing applications and academic contributions.”\
\
\[107\] Ward, G., (1994). The RADIANCE Lighting Simulation and Rendering System, In: 4 SIGGRAPH _Conference. pp. 459–72._\
\
\[108\] Compagnon, R., (2004). Solar and daylight availability in the urban fabric. Energy and Buildings; 36, 321–328.\
\
\[109\] Ecotect, (2010). _Autodesk ECOTECT Analysis._ Retrieved from: [https://knowledge.autodesk.com/support/ecotect-analysis/learn-](https://knowledge.autodesk.com/support/ecotect-analysis/learn-) explore/caas/video/youtube/watch-v-BKZ35xh4ofw.html\
\
\[110\] Jakubiec, J.A., Reinhart, C.F., (2011). DIVA 2.0: Integrating daylight and thermal simulations using rhinoceros 3D, DAYSIM and EnergyPlus. In Proceedings of Building Simulation 2011: 12th _Conference of International Building Performance Simulation Association; 2202–2209._\
\
\[111\] Jakubiec, J.A., Balakrishnan, P., (2015). Quantifying Materials in Lighting Simulations, in: 14th _International Radiance Workshop. Philadelphia._\
\
\[112\] Reinhart, C.F., Walkenhorst, O., (2001). Validation of dynamic RADIANCE-based daylight simulations for a test office with external blinds. Energy and Buildings; 33, 683–697\
\
\[113\] Mardaljevic, J., (2000). Simulation of annual daylighting profiles for internal illuminance. Lighting _Research and Technology; 32, 111–118._\
\
\[114\] Perez, R., Seals, R., Michalsky, J., (1993). To all-weather model for sky luminance distribution— preliminary configuration and validation. Solar Energy; 51, 423\
\
\[115\] Reinhart, C., (2011). Simulation-based Daylight Performance Predictions, in: Building Performance _Simulation for Design and Operation. Taylor & Francis, ISBN 9780415474146_\
\
\[116\] Roudsari, M.S., Pak, M., (2013). Ladybug: a Parametric Environmental Plugin for Grasshopper To Help Designers Create an Environmentally-Conscious Design. 13th Conference of International _building Performance Simulation Association; 3129–3135._\
\
\[117\] Walter, A. Arbree, K. Bala, and D. P. Greenberg, (2006). Multidimensional Lightcuts, in ACM SIGGRAPH 2006 Papers, New York, NY, USA, pp. 1081–1088.\
\
\[118\] B. Walter, S. Fernandez, A. Arbree, K. Bala, M. Donikian, and D. P. Greenberg, (2005). Lightcuts: A Scalable Approach to Illumination, in ACM SIGGRAPH 2005 Papers, New York, NY, USA, pp. 1098–\
\
\[119\] A. Keller, (1997). Instant Radiosity, in Proceedings of the SIGGRAPH ’97, pp. 49–56.\
\
\[120\] J. P. G. Cabeleira, (2010). Combining rasterization and ray tracing techniques to approximate global illumination in real-time, Master Thesis, Instituto Superior Técnico, Lisbon, Portugal\
\
\[121\] W. Hu, Y. Huang, F. Zhang, G. Yuan, and W. Li, (2014). Ray tracing via GPU rasterization, Vis. Comput., vol. 30, no. 6–8, pp. 697–706\
\
\[122\] S. Lagarde and C. de Rousiers, (2014). Moving Frostbite to Physically Based Rendering, presented at the SIGGRAPH 2014 Conference, Vancouver\
\
* * *\
\
\[123\] Whitted T. (1980). An improved illumination model for shaded display, Commun. ACM 23, 6, pp.\
343-349.\
\[124\] Erdélyi R., Wang Y., Guo W., Hanna E., Colantuono G., (2014). Three-dimensional SOlar RAdiation\
Model (SORAM) and its application to 3-D urban planning, Solar Energy, Volume 101, Pages 63-\
73, ISSN 0038-092X, [http://dx.doi.org/10.1016/j.solener.2013.12.023](http://dx.doi.org/10.1016/j.solener.2013.12.023).\
\[125\] Fartaria T.O., Collares-Pereira M., (2013). Simulation and computation of shadow losses of direct\
normal, diffuse solar radiation and albedo in a photovoltaic field with multiple 2-axis trackers\
using ray tracing methods, Solar Energy, Volume 91, Pages 93-101, ISSN 0038-092X,\
[http://dx.doi.org/10.1016/j.solener.2013.02.008](http://dx.doi.org/10.1016/j.solener.2013.02.008).\
\[126\] Márton G., Szirmay-Kalos L., (1995). On average-case complexity of ray tracing algorithms. In\
Proceedings of Winter School of Computer Graphics 95, pages 187–196\
\[127\] Kovach A., Schmid J., (1996). Determination of energy output losses due to shading of buildingintegrated photovoltaic arrays using a raytracing technique, Solar Energy, Volume 57, Issue 2,\
Pages 117-124, ISSN 0038-092X, [https://doi.org/10.1016/S0038-092X(96)00066-7](https://doi.org/10.1016/S0038-092X(96)00066-7).\
\[128\] Walter B., Shirley P., (1997). Cost Analysis of a Ray Tracing Algorithm, Cornell University\
\[129\] Nagy Z., Svetozarevic B., Jayathissa P., Begle M., Hofer J., Lydon G., Willmann A., Schlueter A.,\
(2016). The Adaptive Solar Facade: From concept to prototypes, Frontiers of Architectural\
Research, Volume 5, Issue 2, Pages 143-156, ISSN 2095-2635,\
[https://doi.org/10.1016/j.foar.2016.03.002](https://doi.org/10.1016/j.foar.2016.03.002).\
\[130\] Jayathissa P., Luzzatto M., Schmidli J., Hofer J., Nagy Z., Schlueter A., (2017). Optimising building\
net energy demand with dynamic BIPV shading, Applied Energy, Volume 202, Pages 726-735, ISSN\
0306-2619, [https://doi.org/10.1016/j.apenergy.2017.05.083](https://doi.org/10.1016/j.apenergy.2017.05.083).\
\[131\] Nehab D., Sander P.V., Lawrence J., Tatarchuk N., Isidoro J.R., (2007). Accelerating Real-Time\
Shading with Reverse Reprojection Caching, ACM SIGGRAPH/EUROGRAPHICS Conference on\
Graphics Hardware\
\[132\] Robledo J., Leloux J., Lorenzo E., (2014). 3D simulation of complex shading affecting PV systems\
taking benefit from the power of graphics cards developed for the video game industry, 29th\
European Photovoltaic Solar Energy Conference and Exhibition, DOI: 10.4229/EUPVSEC20142014-\
5CO.12.2.\
\[133\] Sinapis K., Litjens G., Donker M., Folkerts W., van Sark W. G. J. H. M., (2015). Outdoor\
characterization and comparison of string and MLPE under clear and partially shaded conditions.\
Energy Science & Engineering, 3: 510-519, doi:10.1002/ese3.97.\
\[134\] Sinapis K., Tzikas C., Litjens G., van den Donker M., Folkerts W., van Sark W.G.J.H.M., Smets A.,\
(2016). A comprehensive study on partial shading response of c-Si modules and yield modeling of\
string inverter and module level power electronics, Solar Energy, Volume 135, Pages 731-741,\
ISSN 0038-092X, [https://doi.org/10.1016/j.solener.2016.06.050](https://doi.org/10.1016/j.solener.2016.06.050).\
\[135\] Pannebakker B.B., de Waal A. C., van Sark W. G. J. H. M., (2017). Photovoltaics in the shade: one\
bypass diode per solar cell revisited, Progress in Photovoltaics, 25: 836–849, doi:\
10.1002/pip.2898.\
\[136\] Mattila A.L., Mikkonen T., (2013). Designing a 3D widget library for WebGL enabled browsers. In\
Proceedings of the 28th Annual ACM Symposium on Applied Computing (SAC '13). ACM, New\
York, NY, USA, 757-760, doi [http://dx.doi.org/10.1145/2480362.2480506](http://dx.doi.org/10.1145/2480362.2480506).\
\[137\] Dirksen J., Learning Three.js – the JavaScript 3D Library for WebGL - Second Edition, Packt\
Publishing, ISBN: 9781784392215, 2015.\
\
* * *\
\
\[138\] Xie C., Schimpf C., Chao J., Nourian S., Massicotte J., (2018). Learning and teaching engineering design through modeling and simulation on a CAD platform. Comput Appl Eng Educ. 2018;26:824–\
\
840. [https://doi.org/10.1002/cae.21920](https://doi.org/10.1002/cae.21920).\
     \[139\] Gesquière, G., & Manin, A. (2012). 3D visualization of urban data based on CityGML with WebGL. International Journal of 3-D Information Modeling (IJ3DIM), 1(3), 1-15.\
\
\[140\] Marsh A., Thoo S., (2016). Games technology and building performance analysis, Fifty years later: Revisiting the role of architectural science in design and practice: 50th International Conference of the Architectural Science Association, pp. 417–426.\
\
\[141\] Marsh A., Stravoravdis S., (2017). Towards Dynamic Real-Time Daylight Simulation, PLEA Conference, Edinburgh.\
\
\[142\] IEA SHC Task 41: Solar Energy and Architecture, Solar design of buildings for architects: Review of solar design tools: Subtask B: Methods and Tools for Solar Design, available at [http://task41.iea-](http://task41.iea-/) shc.org/data/sites/1/publications/T41B3\_approved-Jul12.pdf (accessed on October 10, 2017).\
\
\[143\] Faiman D. (2008). Assessing the outdoor operating temperature of photovoltaic modules. Prog Photovolt Res Appl 2008;16:307–15. doi:10.1002/pip.813.\
\
\[144\] King DL, Kratochvil JA, Boyson WE. (2004). Photovoltaic array performance model. Albuquerque, New Mexico, USA: Sandia National Laboratories\
\
\[145\] Skoplaki E, Palyvos JA. (2008). Operating temperature of photovoltaic modules: A survey of pertinent correlations. Renew Energy 2009;34:23–9. doi:10.1016/j.renene.2008.04.009.\
\
\[146\] Luketa-Hanlin A, Stein J. (2012). Improvement and validation of a transient model to predict photovoltaic module temperature. World Renew Energy Forum\
\
\[147\] N. H. Reich et al., (2009). Crystalline silicon cell performance at low light intensities, Sol. Energy Mater. Sol. Cells, vol. 93, no. 9, pp. 1471–1481\
\
\[148\] Gemmer and M. B. Schubert, (2001). Solar Cell Performance Under Different Illumination Conditions, in Symposium A – Amorphous and Heterogeneous Silicon-Based Films-2001, vol. 664\
\
\[149\] J. F. Randall, C. Droz, M. Goetz, A. Shah, and J. Jacot, (2002). Comparison of 6 photovoltaic materials across 4 orders of magnitude of intensity, in Proceedings of the 17th EC Photovoltaic Solar Energy Conference, Munich, Germany, vol. 1, pp. 603–606.\
\
\[150\] J. F. Randall, (2003). On the use of photovoltaic ambient energy sources for powering indoor electronic devices, PhD Thesis, The École polytechnique fédérale de Lausanne, Lausanne, Switzerland\
\
\[151\] J. F. Randall and J. Jacot, (2003). Is AM1.5 applicable in practice? Modelling eight photovoltaic materials with respect to light intensity and two spectra, Renew. Energy, vol. 28, no. 12, pp. 1851– 1864\
\
\[152\] L. Stamenic, E. Smiley, and K. Karim, (2004). Low light conditions modelling for building integrated photovoltaic (BIPV) systems, Sol. Energy, vol. 77, no. 1, pp. 37–45\
\
\[153\] J. A. Eikelboom and M. J. Jansen, (2000). Characterisation of PV modules of new generations,” Energy Research Centre of the Netherlands (ECN), Petten, Netherlands, ECN-C-00-067\
\
\[154\] W. Heydenreich, B. Müller, C. Reise, (2008). Describing the World with three Parameters: A new Approach to PV Module Power Modelling, 23rd European PV Solar Energy Conference and Exhibition (EU PVSEC) 2786–2789.\
\
* * *\
\
\[155\] King, Boyson, W.E., Kratochvilll, J.A, (2004). Photovoltaic Array Performance Model: Report SAND2004-3535, Sandia National Laboratories (3535) 1–43.\
\
\[156\] J. Sutterlueti, S. Ransome, R. Kravets, L. Schreier, (2011). Characterising PV modules under outdoor conditions: What's most important for energy yield, in: 26th European Photovoltaic Solar Energy Conference and Exhibition-Proceedings: The most inspiring platform for the global PV solar sector ; CCH Congress Centre and International Fair, Hamburg, Germany, Conference 5 - 9 September 2011, exhibition 5 - 8 September 2011, Hamburg; Germany, WIP Renewable Energies, München\
\
\[157\] Stein JS, Sutterlueti J, Ransome S, Hansen CW, King BH. (2013). Outdoor PV Performance Evaluation of Three Different Models: Single-Diode, SAPM and Loss Factor Model. Proc. 28th Eur. Photovolt. Sol. Energy Conf. Exhib., Paris, France\
\
\[158\] Sutterlueti J, Ransome S, Kravets R, Schreier L. (2008). Characterising PV modules under outdoor conditions: what’s most important for energy yield. Proc. 26th Eur. Photovolt. Sol. Energy Conf. Exhib., Valencia, Spain, p. 3608–3614.\
\
\[159\] Sellner S, Sutterlüti J, Ransome S, Schreier L, Allet N. (2012). Understanding PV module performance: further validation of the novel loss factors model and its extension to AC arrays. 27th EU PVSEC, 3199–3204.\
\
\[160\] Ransome S, Sutterlueti J, Sellner S. (2012). PV technology differences and discrepancies in modelling between simulation programs and measurements. 38th IEEE Photovolt. Spec. Conf., 2012, p. 003061–6. doi:10.1109/PVSC.2012.6318228.\
\
\[161\] Sellner S, Sutterlüti J, Schreier L, Ransome S. (2012). Advanced PV module performance characterization and validation using the novel Loss Factors Model. 38th IEEE Photovolt. Spec. Conf., 2012, p. 002938–43. doi:10.1109/PVSC.2012.6318201.\
\
\[162\] J.A. Gow, C.D. Manning, (1999). Development of a photovoltaic array model for use in power- electronics simulation studies, IEE Proc., Electr. Power Appl. 146 (2) pp. 193.\
\
\[163\] W. de Soto, S.A. Klein, W.A. Beckman, (2006). Improvement and validation of a model for photovoltaic array performance, Solar Energy 80 (1) pp. 78–88.\
\
\[164\] V.J. Chin, Z. Salam, K. Ishaque, (2015). Cell modelling and model parameters estimation techniques for photovoltaic simulator application: A review, Applied Energy 154 pp. 500–519.\
\
\[165\] Joshua S. Stein, Juergen Sutterlueti, Steve Ransome, Clifford W. Hansen, Bruce H. King, (2013). Outdoor PV Performance Evaluation of Three Different Models: Single-Diode, SAPM and Loss Factor Model, Sandia National Laboratories 2013 (7913C).\
\
\[166\] W. Sprenger, (2013). Electricity yield simulation of complex BIPV systems, Fraunhofer-Verlag, Stuttgart\
\
\[167\] Kumar, V., Pandey, A.S. and Sinha, S.K. March (2016). Grid integration and power quality issues of wind and solar energy system: A review. In Emerging Trends in Electrical Electronics & Sustainable _Energy Systems (ICETEESES), International Conference, IEEE; pp. 71-80_\
\
\[168\] Noone, B. (2013). PV Integration on Australian distribution networks: Literature review, Australian PV Association 2013; 4-35.\
\
\[169\] Passey, R. (2011). The potential impacts of grid-connected distributed generation and how to address them: A review of technical and non-technical fixes. Energy Policy, 2011; 39 (2011) 6280 – 6290.\
\
* * *\
\
\[170\] Park A & Lappas, P. (2017). Evaluating demand charge reduction for commercial-scale solar PV\
coupled with battery storage. Renewable Energy; 108, pp.523–532.\
\[171\] J. Eisenlohr, H.R. Wilson, T. E. Kuhn, (2017). Detailed modeling of building-integrated\
photovoltaics - from component and environmental data to the system output, presented at the\
33rd European Photovoltaic Solar Energy Conference and Exhibition EU PVSEC, Amsterdam, The\
Netherlands\
\[172\] Y.B. Assoa, L. Mongibello, A. Carr, B. Kubicek, M. Machado, J. Merten, S. Misara, F. Roca, W.\
Sprenger, M. Wagner, S. Zamini, T. Baenas, P. Malbranche, (2017). Thermal analysis of a BIPV\
system by various modelling approaches, Solar Energy 155, pp.1289–1299.\
\[173\] Roche, D., H. Outhred, and R. J. Kaye. (1995). Analysis and control of mismatch power loss in\
photovoltaic arrays. Prog. Photovoltaics Res. Appl. 3:115–127.\
\[174\] Hofer, J., Groenewolt, A., Jayathissa, P., Nagy, Z., & Schlueter, A. (2016). Parametric analysis and\
systems design of dynamic photovoltaic shading modules. Energy Science & Engineering, 4(2),\
134–152. [https://doi.org/10.1002/ese3.115](https://doi.org/10.1002/ese3.115)\
\[175\] D. Robinson and A. Stone, (2004). Irradiation modelling made simple: the cumulative sky approach\
and its applications, in Proceedings of the 21st PLEA Conference on Built Environments and\
Environmental Buildings, Eindhoven, the Netherlands, pp. 19–22.\
\[176\] R. Compagnon and D. Raydan, (2000). Irradiance and illuminance distributions in urban areas, in\
Proceedings of PLEA, pp. 436–441\
\[177\] J. Mardaljevic and M. Rylatt, (2000). An image-based analysis of solar radiation for urban settings,\
in Proceedings of PLEA 2000; Architecture City Environment, Cambridge, UK, pp. 442–447.\
\[178\] R. Perez, P. Ineichen, R. Seals, J. Michalsky, and R. Stewart, (1990). Modeling daylight availability\
and irradiance components from direct and global irradiance,” Sol. Energy, vol. 44, no. 5, pp. 271–\
289\
\[179\] W. Marion and S. Wilcox, (1994). Solar radiation data manual for flat-plate and concentrating\
collectors, National Renewable Energy Laboratory (NREL), Golden, CO, USA, NREL/TP-463-5607\
\[180\] Marion, B.; MacAlpine, S.; Deline, C.; Asgharzadeh, A.; Toor, F.; Riley, D.; Stein, J.; Hansen, C.\
(2017). A Practical Irradiance Model for Bifacial PV Modules. NREL/CP-5J00-67847\
\[181\] Bogus, K. & Markvart, T. (2000). Solar electricity. 2nd ed., Chichester ; New York: John Wiley &\
Sons.\
\[182\] Wikipedia (2017). List of photovoltaics companies.\
[https://en.wikipedia.org/wiki/List\_of\_photovoltaics\_companies](https://en.wikipedia.org/wiki/List_of_photovoltaics_companies), 2017 \[accessed 26 July 2017\].\
\[183\] The International Energy Agency (2010). Technology Roadmap: Solar photovoltaic energy. IEA.\
\[184\] Solar Energy International, (2007). Photovoltaics: design and installation manual. Renewable\
energy education for a sustainable future Rev. and updated., Gabriola, B.C.: New Society\
Publishers\
\[185\] Rashid, M.H., (2014). Alternative Energy in Power Electronics, Saint Louis: Elsevier Science.\
\[186\] Dunlop, J. and Farhi, B., (2001). Recommendations for maximizing battery life in photovoltaic\
systems: a review of lessons learned. Solar Engineering, pp.275-280.\
\[187\] Mohanty, P. & Tyagi, A., (2015). Introduction to Solar Photovoltaic Technology. In Food, Energy,\
and Water: The Chemistry Connection. Elsevier Inc., pp. 309–348.\
\
* * *\
\
\[188\] Civic Solar (2015). Balance of Solar PV Systems (BOS).\
[https://www.civicsolar.com/support/installer/articles/balance-solar-pv-systems-bos](https://www.civicsolar.com/support/installer/articles/balance-solar-pv-systems-bos), 2015\
\[accessed 10 August 2017\].\
\[189\] Hens, H.S. (2016). Applied Building Physics: Ambient Conditions, Building Performance and\
Material Properties. John Wiley & Sons.\
\[190\] Lisell, L., Tetreault, T. and Watson, A (2009). Solar ready buildings planning guide.\
\[191\] Wills, R., Milke, J.A., Royle, S. and Steranka, K. (2015). Best Practices for Commercial Roof-\
Mounted Photovoltaic System Installation. Springer.\
\[192\] Roberts, S. and Guariento, N. (2009). Building integrated photovoltaics: a handbook. Walter de\
Gruyter,\
\[193\] Sustainable Energy Authority, Ireland (2017). Best Practice Guide: Photovoltaics (PV).\
\[194\] Tsoutsos, Frantzeskaki and Gekas (2005). Environmental impacts from the solar energy\
technologies. Energy Policy; 33(3), pp.289–296.\
\[195\] Sherwani, A. F. Usmani J. A. and Varun J. A., (2010). Life cycle assessment of solar PV based\
electricity generation systems: A review. Renewable and Sustainable Energy Reviews; 14(1),\
pp.540–544.\
\[196\] Fthenakis V. M. and Kim, H.C. (2009) Photovoltaics: Life-cycle Analyses. Solar Energy; 85(8),\
pp.1609–1628.\
\[197\] Seng, L.Y., Lalchand, G. and Lin, G.M.S. (2008) Economical, environmental and technical analysis\
of building integrated photovoltaic systems in Malaysia. Energy Policy; 36(6), pp.2130-2142.\
\[198\] Kannan, R., Leong, K.C., Osman, R., Ho, H.K. and Tso, C.P. (2006). Life cycle assessment study of\
solar PV systems: an example of a 2.7 kW p distributed solar PV system in Singapore. Solar energy;\
80(5), pp.555-563.\
\[199\] Santamouris, M., Synnefa, A. and Karlessi, T. (2011). Using advanced cool materials in the urban\
built environment to mitigate heat islands and improve thermal comfort conditions. Solar Energy;\
85(12), pp.3085-3102.\
\[200\] Genchi, Y., Ishisaki, M., Ohashi, Y., Takahashi, H. and Inaba, A. (2003). Impacts of large-scale\
photovoltaic panel installation on the heat island effect in Tokyo. In: Fifth Conference on the Urban\
Climate.\
\[201\] Barron-Gafford, G.A., Minor, R.L., Allen, N.A., Cronin, A.D., Brooks, A.E., Pavao-Zuckerman, M.A.,\
(2016). The Photovoltaic Heat Island Effect: Larger solar power plants increase local temperatures.\
Scientific Reports; 6, 35070.\
\[202\] Tian, W., Wang, Y., Xie, Y., Wu, D., Zhu, L., Ren, J., (2007). Effect of building integrated\
photovoltaics on microclimate of urban canopy layer. Building and Environment; 42, 1891–\
1901.189. (Taha, 2013)\
\[203\] Taha, H., (2013). The potential for air-temperature impact from large-scale deployment of solar\
photovoltaic arrays in urban areas. Sol. Energy; 91, 358–367.\
[https://doi.org/10.1016/j.solener.2012.09.014](https://doi.org/10.1016/j.solener.2012.09.014)\
\[204\] Salamanca, F., Georgescu, M., Mahalov, A., Moustaoui, M., Martilli, A., (2016). Citywide Impacts\
of Cool Roof and Rooftop Solar Photovoltaic Deployment on Near-Surface Air Temperature and\
Cooling Energy Demand. Boundary-Layer Meteorol. 161, 203–221.\
[https://doi.org/10.1007/s10546-016-0160-y](https://doi.org/10.1007/s10546-016-0160-y)\
\
* * *\
\
\[205\] Masson, V., Bonhomme, M., Salagnac, J.-L., Briottet, X., Lemonsu, A., (2014). Solar panels reduce\
both global warming and urban heat island. Front. Environ. Sci.; 2, 1–10.\
[https://doi.org/10.3389/fenvs.2014.00014](https://doi.org/10.3389/fenvs.2014.00014)\
\[206\] Cortes, A., Murashita, Y., Matsuo, T., Kondo, A., Shimadera, H., Inoue, Y., (2015). Numerical\
evaluation of the effect of photovoltaic cell installation on urban thermal environment. Sustain.\
Cities Soc.; 19, 250–258. [https://doi.org/10.1016/j.scs.2015.07.012](https://doi.org/10.1016/j.scs.2015.07.012)\
\[207\] The International Renewable Energy Agency (IRENA) (2012). Renewable Energy Technologies: Cost\
Analysis Series: Solar Photovoltaics; Vol 1(4/5).\
\[208\] Ran Fu, Donald Chung, Travis Lowder, David Feldman, Kristen Ardani, and Robert Margolis (2016).\
U.S. Solar Photovoltaic System Cost Benchmark: Q1 2016. Task No. ST6T.0510 : National\
Renewable Energy Laboratory (NREL).\
\[209\] ScottMadden, (2016). Solar Photovoltaic Plant Operating and Maintenance Costs.\
[https://www.scottmadden.com/insight/solar-photovoltaic-plant-operating-and-maintenancecosts/](https://www.scottmadden.com/insight/solar-photovoltaic-plant-operating-and-maintenancecosts/) 2010\. \[accessed 28 July 2017\].\
\[210\] DOE Office of Indian Energy (2015). The Five-Step Development Process Step 5: Project Operations\
and Maintenance. [https://energy.gov/sites/prod/files/2015/09/f26/7a%20-Step5-Operations-](https://energy.gov/sites/prod/files/2015/09/f26/7a%20-Step5-Operations-)\
Maintenance.pdf, 2015. \[accessed 28 July 2017\].\
\[211\] IOWA Energy Center (2016). Solar PV Energy Guide: Home Series.\
\[212\] The solar foundation (2012). Solar Accounting: Measuring the Costs and Benefits of Going Solar.\
2012\.\
\[213\] Park & Lappas, (2017). Evaluating demand charge reduction for commercial-scale solar PV coupled\
with battery storage. Renewable Energy, 108, pp.523–532.\
\[214\] Adam Gerza (2015). The Value of Interval Meter Data in solar PV project analysis. Energy tool base\
resource guide.\
\
\[215\] Martin R (2015). How to reduce your energy bill. Available at:\
[http://www.aeesgroup.com.au/aeesgroup-blog/reducing-energy-bills](http://www.aeesgroup.com.au/aeesgroup-blog/reducing-energy-bills), 2015\. \[accessed 28 July\
2017\].\
\[216\] Eiffert, P. (2003). Guidelines for the economic evaluation of building integrated photovoltaic power\
systems, NREL/TP-550-31977.\
\[217\] James, Ted, Alan Goodrich, Michael Woodhouse, Robert Margolis, and Sean Ong (2011).\
"Building-Integrated Photovoltaics (BIPV) in the residential sector: an analysis of installed rooftop\
system prices." Contract 303 (2011): 275-3000.\
\[218\] Electronic Innovation Lab (2013). A Review of Solar PV Benefit and Cost Studies. 2nd ed. Rocky\
Mountain Institute.\
\[219\] Solomon, Evan., Heintzman, Andrew and Ingenuity Project (2003). Fueling the future : how the\
battle over energy is changing everything. Toronto: House of Anansi Press.\
\[220\] ACIL Tasman (2012). Modelling Feed-in Tariffs: Final Report.\
\[221\] Than K, (2015). Estimated social cost of climate change not accurate, Stanford scientists say.\
Available at: [https://news.stanford.edu/2015/01/12/emissions-social-costs-011215](https://news.stanford.edu/2015/01/12/emissions-social-costs-011215), 2015\.\
\[accessed 10 September 2017\].\
\[222\] Nordhaus, W. D. (2017). Revisiting the social cost of carbon. Proceedings of the National Academy\
of Sciences of the United States of America; 114(7), 1518–1523.\
\
* * *\
\
\[223\] Renewable energy target (2017). _Financial incentives._ [http://www.cleanenergyregulator.gov.au/RET/How-to-participate-in-the-Renewable-Energy-](http://www.cleanenergyregulator.gov.au/RET/How-to-participate-in-the-Renewable-Energy-) Target/Financial-incentives, 2017. \[accessed 05 November 2017\]\
\
\[224\] Minerals Council of Australia (2015). Electricity production subsidies in Australia. Policy Paper.\
\
\[225\] Huld, T., (2017). PVMAPS: Software tools and data for the estimation of solar radiation and photovoltaic module performance over large geographical areas. Solar Energy, 142, pp.171-181.\
\
\[226\] Lo Brano, V., Ciulla, G. and Di Falco, M. (2014). Artificial neural networks to predict the power output of a PV panel. International Journal of Photoenergy.\
\
\[227\] Rosen M., (2013). Real-time monitoring is critical for sustaining solar PV energy output. Available at: [https://www.controleng.com/single-article/real-time-monitoring-is-critical-for-sustaining-](https://www.controleng.com/single-article/real-time-monitoring-is-critical-for-sustaining-) solar-pv-energy-output/02b45dcf1c4446ee59536978ff8b9ee1.html, 2013 \[accessed 05 October 2017\].\
\
\[228\] Dixit, M. and Yan, W., (2015). A Building-Integrated Photovoltaic Prototype for Calculating Solar Orientation and Solar Insolation. In: Khare V. R. and Gundepudi S. editors. BS2015: Proceedings of _14th Conference of International Building Performance Simulation Association, 2015 Dec. 7-9,_ Hyderabad, India, Hyderabad: BS Publications; p. 2002-2009.\
\
\[229\] Gupta A, Cemesova A, Hopfe C J, Rezgui Y, & Sweet T. (2014). A conceptual framework to support solar PV simulation using an open-BIM data exchange standard. Automation in Construction; 37, 166-181.\
\
\[230\] Wijeratne, W.P.U., Yang, R.J., Too, E. and Wakefield, R., 2019. Design and development of distributed solar PV systems: Do the current tools work?. Sustainable cities and society. vol. 45, pp. 553-578\
\
* * *\
\
\[Image: R656\] \[Image: R655\]\
\[Image: R654\]\
\
\[Image: R656\] \[Image: R655\]\
\[Image: R654\]