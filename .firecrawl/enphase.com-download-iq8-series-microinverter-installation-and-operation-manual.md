IQ8, IQ8+, IQ8M, IQ8A, and IQ8H Microinverters

* * *

Contents

1 The Enphase IQ System.....10
1.1 How the Enphase IQ Series Microinverters work.....10
1.1.1 System monitoring.....11
1.1.2 Optimal reliability.....11
1.1.3 Ease of design.....11

2 Planning for microinverter installation.....11
2.1 Compatibility.....12
2.2 Grounding considerations.....12
2.3 Branch circuit capacity.....12
2.4 Utility service requirements.....13
2.5 Wire lengths and voltage rise.....13
2.6 Lightning and surge suppression.....14

3 Parts and tools required.....14
3.1 Enphase equipment.....14
3.2 Other items.....15

4 Enphase microinverter installation.....15
4.1 Position the IQ Cable.....16
4.2 Position the junction box.....16
4.3 Mount the microinverters.....17
4.4 Create an installation map.....18
4.5 Manage the cabling.....19
4.6 Connect the micro

* * *

4.11 Set up and activate monitoring ..... 26

5 Troubleshooting.....26
5.1 Status LED indications and error reporting.....27
5.1.1 LED operation.....27
5.1.2 DC Resistance Low – Power off condition.....27
5.1.3 Other faults.....28
5.2 Troubleshoot an inoperable microinverter.....28
5.3 Disconnect a microinverter.....29
5.4 Install a replacement microinverter.....30

6 Replacement parts and cabling.....31
6.1 Ordering replacement parts.....31
6.2 Enphase IQ Cable planning and ordering.....31
6.3 Connector spacing options.....32
6.4 Cabling options.....32
6.5 IQ Cable accessories.....32

7 Technical data.....33
7.1 Technical considerations.....33
7.2 Bifacial modules.....33

8 Specifications.....33
8.1 IQ8-60-2-US Microinverter specifications.....34
8

* * *

Corporate headquarters contact information

Enphase Energy, Inc.
47281 Bayside Pkwy, Fremont, CA 94538,

47281 Bayside Pkwy, Fremont, CA 94538,
United States of America, PH: +1 (707) 763-4784

United States of America, PH: +1 (707) 763-4784
[https://enphase.com/contact/support](https://enphase.com/contact/support)

[https://enphase.com/contact/support](https://enphase.com/contact/support)

FCC compliance

This equipment has been tested and found to comply with the limits for a Class B digital device,
pursuant to part 15 of the FCC Rules. These limits are designed to provide reasonable protection
against harmful interference in a residential installation. This equipment generates, uses, and can
radiate radio frequency energy and, if not installed and used in accordance with the instructions,
may cause harmful interference to radio communications. However, there is no guarantee that
interference will not occur in a particular installation. If this equipment does cause harmful
interference to radio or television reception, which can be determined by turning the equipment
off and on, you are encouraged to try to correct the interference by one or more of the following
measures:

• Reorient or relocate the receiving antenna.
Increase the separation between the equipment and the receiver.

• Increase the separation between the equipment and the receiver.
• Connect the equipment to an outlet on a circuit different from that to which the receiver is

• Connect the equipment to an outlet on a circuit different from that to which the receiver is
connected.

• Consult the dealer or an experienced radio/TV technician for help.

Changes or modifications not expressly approved by the party responsible for compliance may void
the user’s authority to operate the equipment.

Other information

Product information is subject to change without notice. All trademarks are recognized as the
property of their respective owners.

User documentation is updated frequently; check the Enphase website for the latest information.
[https://enphase.com/installers/resources/documentation](https://enphase.com/installers/resources/documentation).

To ensure optimal reliability and to meet warranty requirements, the Enphase microinverter must
be installed according to the instructions in this manual. For warranty text, refer to enphase.com/
installers/resources/warranty.

Audience

For Enphase patent information, refer to [https://enphase.com/patents](https://enphase.com/patents).

This manual is intended for use by professional installation and maintenance personnel.

* * *

Important safety information

Read this first

This manual contains important instructions for use during the installation and maintenance of the IQ8
Series Microinverters.

IMPORTANT: Enphase IQ Series Microinverters require the IQ Cable. An IQ Gateway is required
to monitor the performance of the IQ Microinverters and configure them to be compliant with
certain Authority Having Jurisdictions (AHJs). The IQ accessories work only with Enphase IQ
Series Microinverters.

Product labels

The following symbols appear on the product label and are described here.

Hot surface

Refer to safety instructions

Risk of electric shock

DANGER: This indicates a hazardous situation, which, if not avoided, will result in death or serious injury.

Refer to the manual

Safety and advisory symbols

WARNING: This indicates a situation where failure to follow instructions may be a safety hazard or
cause equipment malfunction. Use extreme caution and follow instructions carefully.

Double insulated

* * *

NOTE: This indicates information that is very important for optimal system operation. Follow
instructions closely.

IQ8 Series Microinverters safety instruction

General safety

Only use electrical system components approved for wet locations.

Only qualified personnel should install, troubleshoot, or replace Enphase microinverters or IQ Cable and
accessories.

Ensure that all AC and DC wiring is correct and that none of the AC or DC cables are pinched, shorted, or
damaged. Also, ensure that all AC junction boxes are properly closed.

Do not exceed the maximum number of microinverters in an AC branch circuit listed in the manual. You must
protect each microinverter AC branch circuit with a 20 A maximum breaker or fuse, as appropriate.

Do not use Enphase equipment in a manner not specified by the manufacturer. Doing so may cause death or
injury to persons or damage to equipment.

Be aware that installation of this equipment includes the risk of electric shock.

The DC conductors of this photovoltaic system are ungrounded and may be energized.

Always de-energize the AC branch circuit before servicing. Never disconnect the DC or AC connectors under
load.

WARNING: Before installing or using the Enphase microinverter, read all instructions and cautionary
markings in the technical description of the Enphase equipment and the photovoltaic (PV) equipment.

Do not connect Enphase microinverters to the grid or energize the AC circuit(s) until you have completed all the
installation procedures and have received approval from the electrical utility.

When the PV array is exposed to light, DC voltage is supplied to the power conversion equipment (PCE).

Risk of equipment damage. Enphase male and female connectors must only be mated with the identical type
and brand of male/female connector.

NOTE: To ensure optimal reliability and to meet warranty requirements, install the Enphase equipment
according to the instructions in this manual.Protection against lightning and resulting voltage surges
must be in accordance with local standards.Perform all electrical installations in accordance with all
applicable local electrical codes, such as the Canadian Electrical Code, Part 1; ANSI requirements; and
NPFA 70 (NEC).

* * *

Microinverter safety

WARNING: Risk of skin burn.

The chassis of the Enphase microinverter is the heat sink. Under normal operating conditions, the temperature
could be 20°C above ambient temperature, but under extreme conditions, the microinverter can reach a
temperature of 90°C. To reduce the risk of burns, use caution when working with microinverters.

DANGER: Risk of fire.

The DC conductors of the PV module must be labeled PV Wire or PV Cable when paired with the Enphase
microinverter.

DANGER: Risk of electric shock. Risk of fire.

Only qualified personnel may connect the Enphase microinverter to the utility grid.

Do not attempt to repair the Enphase microinverter; it contains no user-serviceable parts. If it fails, contact
Enphase Support at [https://enphase.com/contact/support](https://enphase.com/contact/support) to obtain a return merchandise authorization
(RMA) number and start the replacement process. Tampering with or opening the Enphase microinverter will
void the warranty.

WARNING: Risk of equipment damage.

Install the microinverter under the PV module to avoid direct exposure to rain, UV, and other harmful weather
events. Always install the microinverter bracket side up. Do not mount the microinverter upside down. Do not
expose the AC or DC connectors (on the IQ Cable, PV module, or microinverter) to rain or condensation before
the connectors are mated.

The maximum open circuit voltage of the PV module must not exceed the specified maximum input DC voltage
of the Enphase microinverter. Refer to [https://enphase.com/en-us/support/module-compatibility](https://enphase.com/en-us/support/module-compatibility) to verify PV
module electrical compatibility with the microinverter. Use IQ8 Series Microinverters only with compatible PV
modules per the Enphase compatibility calculator. Using an electrically incompatible PV module voids Enphase
warranty.

You must match the DC operating voltage range of the PV module with the allowable input voltage range of the
Enphase microinverter.

The Enphase microinverter functions only with a standard, compatible PV module with appropriate fill factor,
voltage, and current ratings. Unsupported devices include smart PV modules, fuel cells, wind or water turbines,
DC generators, non-Enphase batteries, etc. These devices do not behave like standard PV modules, so
operation and compliance are not guaranteed. These devices may also damage the Enphase microinverter
by exceeding its electrical rating, making the system unsafe.

The Enphase microinverter is not protected from damage due to moisture trapped in cabling systems. Never
mate microinverters to cables left disconnected and exposed to wet conditions. This voids the Enphase
warranty.

* * *

Microinverter safety

NOTE: Installers must check the manufacturing date of the products to ensure that the installation date
is within one year of the manufactured date of the products. Contact your local distributor to validate
the date code.

IQ Cable safety

DANGER: Risk of electric shock.

Do not install the IQ Terminator while the power is connected.

WARNING: Risk of electric shock. Risk of fire.

When stripping the sheath from the IQ Cable, make sure the conductors are not damaged. If the exposed wires
are damaged, the system may not function properly.

Do not leave AC connectors on the IQ Cable uncovered for an extended period. You must cover any unused
connector with an IQ Sealing Cap.

Make sure a protective IQ Sealing Cap has been installed on all unused AC connectors. Unused AC connectors
are live when the system is energized.

Use the IQ Terminator only once. If you open the IQ Terminator following installation, the latching mechanism
is destroyed. If the latching mechanism is defective, do not use the IQ Terminator. Do not circumvent or
manipulate the latching mechanism.

When installing the IQ Cable, secure any loose cable to minimize tripping hazards.

NOTE: When looping the IQ Cable, do not form loops smaller than 4.75" (12 cm) in diameter.

Provide support for the IQ Cable every 1.8 m (6 ft).

If you need to remove the IQ Sealing Cap, use the IQ Disconnect Tool.

When installing the IQ Cable and accessories, adhere to the following:

• Do not expose the IQ Terminator cap or IQ Cable connections to continuous tension (for example, tension
due to pulling or bending the cable near the connection).
Use only the connectors provided.

• Do not allow the IQ Terminator to come into contact with an open flame.

• Do not install or use in potentially explosive environments.
Do not allow the IQ Terminator to come into contact with an open flame.

• Fit the IQ Terminator cap using only the prescribed tools and in the prescribed manner.

• Only the IQ Terminator is used to seal the conductor end of the IQ Cable; no other method is allowed.

* * *

PV rapid shutdown equipment (PVRSE)

This product is UL Listed as PV rapid shutdown equipment and conforms with NEC-2014, NEC-2017,
and NEC-2020 section 690.12 and C22.1-2018 Rule 64-218 rapid shutdown of PV systems, for AC and
DC conductors, when installed according to the following requirements:

• Microinverters and all DC connections must be installed inside the array boundary. Enphase
further requires that the microinverters and DC connections be installed under the PV module
to avoid direct exposure to rain, UV, and other harmful weather events.
• The array boundary is defined as 305 mm (1 ft.) from the array in all directions or 1 m (3 ft.) from the

• The array boundary is defined as 305 mm (1 ft.) from the array in all directions or 1 m (3 ft.) from the
point of entry inside a building.

This rapid shutdown system must be provided with an initiating device or status indicator installed in a
location accessible to first responders. Alternately, it must be connected to an automatic system that
initiates rapid shutdown in the event a system disconnects or another emergency system is activated.

The initiator shall be listed and identified as a disconnecting means that plainly indicates whether it is
in the “off” or “on” position.

Examples are:

• Service disconnecting means
• PV system disconnecting means

• PV system disconnecting means
Readily accessible switch or circuit breaker

• Readily accessible switch or circuit breaker

The handle position of a switch or circuit breaker is suitable for use as an indicator. Refer to NEC or
CSA C22.1-2018 for more information.

Additionally, in a prominent location near the initiator device, a placard or label must be provided with
a permanent marking including the following wording:

PHOTOVOLTAIC SYSTEM EQUIPPED WITH RAPID SHUTDOWN”. The term PHOTOVOLTAIC may be
replaced with PV.

The placard, label, or directory shall be reflective, with all letters capitalized and having a minimum
height of 9.5 mm (3/8") in white on a red background.

* * *

1. The Enphase IQ System

The Enphase IQ System includes:

• IQ8, IQ8+, IQ8M, IQ8A, and IQ8H Microinverters: The smart grid-ready IQ Series Microinverters
convert the DC output of the PV module into grid-compliant AC power.
IQ Gateway (ENV-IQ-AM1-240): The IQ Gateway is a communication device that provides network

• IQ Gateway (ENV-IQ-AM1-240): The IQ Gateway is a communication device that provides network
access to the PV array. The IQ Gateway collects production and performance data from the
IQ Microinverters over on-site AC power lines and transmits the data to Enphase through an
internet or cellular modem connection. IQ Gateway is required to update the grid profile setting,
which is required for certain utilities. The IQ Gateway is capable of monitoring up to 600 Enphase
IQ Microinverters and up to 39 Enphase IQ Batteries. Microinverters should be continuously
connected to the internet using an IQ Gateway. This will help ensure that they can be monitored
remotely and that the product can receive over-the-air firmware updates.

NOTE: All 208 VAC installations require that you use the Enphase IQ Gateway to
commission the Enphase microinverters to propagate correct grid profile settings for
208 VAC trip points.

• Enphase Installer Platform Web-based monitoring and management software: Installers can use
the Enphase Installer Platform to view detailed performance data, manage multiple PV systems,
and remotely resolve issues that might impact system performance. Find out more at https://
enphase.com/installers/apps.
Enphase Installer App for iOS and Android devices: It allows installers to configure the system while

• Enphase Installer App for iOS and Android devices: It allows installers to configure the system while
on-site, eliminating the need for a laptop and improving installation efficiency. You can use the app
to:

• Connect to the IQ Gateway over a wireless network for faster system setup and verification.
View and email a summary report that confirms a successful installation.

• View and email a summary report that confirms a successful installation.
• Scan device serial numbers and sync system information with the Enphase Installer Platform.

• Scan device serial numbers and sync system information with the Enphase Installer Platform.
Enphase IQ Battery

• Enphase IQ Battery
• IQ Field Wireable Connectors (Q-CONN-10F and Q-CONN-10M): Make connections from any

• IQ Field Wireable Connectors (Q-CONN-10F and Q-CONN-10M): Make connections from any
IQ Cable or open IQ Field Wireable Connector.

This manual describes the safe installation and operation of the Enphase microinverter.

NOTE: To ensure optimal reliability and to meet warranty requirements, the microinverter must
be installed according to the instructions in this manual.

The Enphase microinverter maximizes energy production by using a sophisticated maximum power
point tracking (MPPT) algorithm. Each microinverter individually connects to one PV module in your
array. This configuration enables an individual MPPT to control each PV module, ensuring that the
maximum power available from each PV module is exported to the utility grid regardless of the
performance of the other PV modules in the array. While an individual PV module in the array may
be affected by shading, soiling, orientation, or PV module mismatch, each microinverter ensures top
performance for its associated PV module.

1.1 How the Enphase IQ Series Microinverters work

* * *

1.1.1 System monitoring

Once you install the IQ Gateway and provide an internet connection through a broadband router or modem, the IQ Microinverters automatically begin reporting to the Enphase Installer Platform. The Enphase Installer Platform presents current and historical system performance trends and informs you of PV system status.

1.1.2 Optimal reliability

Microinverter systems are inherently more reliable than traditional inverters. The distributed nature of a microinverter system ensures that there is no single point of system failure in the PV system. Enphase microinverters are designed to operate at full power at ambient temperatures as high as $ 60^{\\circ} \\mathrm{C} $ （140 $ ^{\\circ} \\mathrm{F} $ ）.

1.1.3 Ease of design

PV systems using Enphase microinverters are very simple to design and install. You will not need string calculations or cumbersome traditional inverters. You can install individual PV modules in any combination of PV module quantity, type, age, and orientation. Each microinverter quickly mounts on the PV racking directly beneath each PV module. Low-voltage DC wires connect from the PV module directly to the co-located microinverter, eliminating the risk of personnel exposure to dangerously high DC voltage.

2. Planning for microinverter installation

The IQ8 Microinverter is compatible with 60-cell PV modules, and the IQ8+, IQ8M, IQ8A, and IQ8H Microinverter support PV modules with 54, 60, 66, or 72-cell PV modules. All of them install quickly and easily. The microinverter housing is designed for outdoor installation and complies with the NEMA 250, type 6 environmental enclosure rating standard.

The IQ Cable is available with connector spacing options to accommodate the installation of PV modules in portrait or landscape orientation. For IQ Cable ordering information, see Enphase IQ Cable planning and ordering.

* * *

2.1 Compatibility

The IQ Series Microinverters are electrically compatible with PV modules, as listed in the following
table. For specifications, see Technical data on page 33. You can refer to the Enphase Compatibility
Calculator at [https://enphase.com/installers/microinverters/calculator](https://enphase.com/installers/microinverters/calculator) electrical compatibility. To
ensure mechanical compatibility, be sure to order the correct connector type for both the
microinverter and PV module from your distributor.

WARNING: Risk of fire. The PV module DC conductors must be labeled “PV Wire” or “PV Cable”
to comply with NEC for ungrounded PV power systems.

| Microinverter model | Connector type | PV module cell count |
| --- | --- | --- |
| IQ8-60-2-US | MC4 | To meet compatibility, PV modules must be within the following maximum input DC voltage and maximum module $ I\_{sc} $ . Module compatibility can be checked at [https://enphase.com/installers/microinverters/calculator](https://enphase.com/installers/microinverters/calculator). |
| IQ8PLUS-72-2-US |  |  |
| IQ8M-72-2-US |  |  |
| IQ8A-72-2-US |  |  |
| IQ8H-240-72-2-US |  |  |
| IQ8H-208-72-2-US |  |  |

$$
I \_ {\\mathrm {s c}}
$$

NOTE: IQ8 Series Microinverters can be added to existing IQ7 systems on the same IQ Gateway
only in the following grid-connected configurations: (i) Solar Only or (ii) Solar + Battery (IQ
Battery 3T/10T and IQ Battery 5P) without backup.

NOTE: IQ7 Series Microinverters cannot be added to a site that already has
IQ8 Series Microinverters connected to the same IQ Gateway.

2.3 Branch circuit capacity

NOTE: Adding IQ8 Series Microinverters to an existing IQ7 system with an IQ System Controller
is not supported if they are connected to the same IQ Gateway.

* * *

| $Maximum^{1}IQ8Microinverters per AC branch circuit(240VAC) | Maximum^{1}IQ8+Microinverters per AC branch circuit(240VAC) | Maximum^{1}IQ8M Microinverters per AC branch circuit(240VAC) |
| --- | --- | --- |
| 16 | 13 | 11 |
| Maximum^{1}IQ8A Microinverters per AC branch circuit(240VAC) | Maximum^{1}IQ8H Microinverters per AC branch circuit(240VAC) | Maximum^{1}IQ8H Microinverters per AC branch circuit(208VAC) |
| 11 | 10 | 9 |

1
Limits may vary. Refer to local requirements to define the number of microinverters per branch in your area.

NOTE: For a mixed system with both IQ7 and IQ8 Microinverters on the same branch, ensure
that the total maximum continuous output current of all microinverters on the branch does not
exceed 16 A.

2.4 Utility service requirements

The IQ Series Microinverters work with single-phase service. Measure AC line voltages at the
electrical utility connection to confirm that it is within the ranges shown in the following table.

240 VAC, single-phase

| 240VAC, single-phase |  |
| --- | --- |
| L1 to L2 | 211 to 264VAC |
| L1,L2 to ground | 106 to 132VAC |
| 208VAC, single-phase |  |
| L1 to L2 | 183 to 229VAC |
| L1,L2 to ground | 106 to 132VAC |

NOTE: All 208 VAC installations require that you use the Enphase IQ Gateway to commission
the Enphase microinverters to propagate correct grid profile settings for 208 VAC trip points.

Standard guidelines for voltage rise on feeder and AC branch circuit conductors might not be
sufficient for microinverter AC branch circuits that contain the maximum allowable microinverters.
This is due to the high inherent voltage rise on the AC branch circuit.

2.5 Wire lengths and voltage rise

NOTE: The best practice is to center-feed the branch circuit to minimize voltage rise in a fully
populated branch. This practice greatly reduces the voltage rise as compared with an end-fed branch. To center-feed a branch, divide the circuit into two sub-branch circuits protected by a
single OCPD.

2.6 Lightning and surge suppression

Enphase microinverters have integral surge protection, greater than most traditional inverters.
However, if the surge has sufficient energy, the protection built into the microinverter can be
exceeded, and the equipment can be damaged. For this reason, Enphase recommends that you
protect your system with a lightning and/or surge suppression device. In addition to having some
level of surge suppression, it is also important to have insurance that protects against lightning and
electrical surges. Enphase has tested the following devices:

• Leviton 51110-SRG

• Schneider SquareD HEPD50

NOTE: Protection against lightning and resulting voltage surges must be in accordance with
local standards.

3. Parts and tools required

In addition to the microinverters, PV modules, and racking, you will need the following.

3.1 Enphase equipment

• IQ Gateway: Required to monitor production and configure microinverters to be compliant with
certain AHJs. IQ Gateway (model ENV-IQ-AM1-240) communications gateway or IQ Combiner
(model X-IQ-AM1-240-B, X-IQ-AM1-240-2, X-IQ- AM1-240-3, X-IQ-AM1-240-3C).
• Enphase Installer App: Download the Enphase Installer App, open it, and log in to your Enphase

• Enphase Installer App: Download the Enphase Installer App, open it, and log in to your Enphase
Installer Platform account. Use it later to scan microinverter serial numbers and connect to
the IQ Gateway to track system installation progress. To download, go to [https://enphase.com/](https://enphase.com/)
installers/apps or scan the QR code to download it.

• Tie wraps or IQ Cable Clips (Q-CLIP-100)
IQ Sealing Caps (Q-SEAL-10) for any unused drops on the IQ Cable.

• IQ Sealing Caps (Q-SEAL-10) for any unused drops on the IQ Cable.
• IQ Terminator (Q-TERM-10) typically two needed per branch circuit.

| Cable model | Connector spacing | PV module orientation | Connector count per box |
| --- | --- | --- | --- |
| Q-12-10-240 | 1.3m | Portrait | 240 |
| Q-12-17-240 | 2.0m | Landscape(60-cell) | 240 |
| Q-12-20-200 | 2.3m | Landscape(72-cell) | 200 |

• IQ Terminator (Q-TERM-10) typically two needed per branch circuit.
• IQ Disconnect Tool (Q-DISC-10)

• IQ Cable:

• IQ Disconnect Tool (Q-DISC-10)
IQ Field Wireable Connectors (male and female: Q-CONN-10M and Q-CONN-10F)

* * *

3.2 Other items

- AC junction box

- Number 2 and 3 screwdrivers

- Wire cutters, voltmeter

- Torque wrench, sockets, wrenches for mounting hardware


4. Enphase microinverter installation

Installing the Enphase IQ Series Microinverters involves several key steps. Each step listed here is detailed in the following pages.

01. Position the IQ Cable

02. Position the junction box

03. Mount the microinverters

04. Create an installation map

05. Manage the cabling

06. Connect the microinverters

07. Terminate the unused end of the cable

08. Complete the installation of the junction box

09. Connect the PV modules

10. Energize the system


Figure 1: Horizontal mount

* * *

Figure 2: Vertical mount

4.1 Position the IQ Cable

1. Plan each cable segment to allow drop connectors on the IQ Cable to align with each PV module Allow extra length for slack, cable turns, and any obstructions.

2. Mark the approximate centers of each PV module on the PV racking.

3. Lay out the cabling along the installed racking for the AC branch circuit.

4. Cut each segment of cable to meet your planned needs.


4.2 Position the junction box

| 240VAC split-phase | 211 to 264VAC |
| --- | --- |
| 208VAC single-phase | 183 to 229VAC |

NOTE: All 208 VAC installations require that you use the IQ Gateway to commission the microinverters to propagate correct grid profile settings for 208 VAC trip points.

1. Verify that the AC voltage at the site is within range.

2. Install a junction box at a suitable location on the racking.

3. Provide an AC connection from the junction box back to the electricity network using equipment and practices as required by local jurisdictions.


* * *

4.3 Mount the microinverters

1. Mount the microinverter horizontally, bracket side up, or vertically.

- Always place the microinverter under the PV module,protected from direct exposure to rain, sun,and other harmful weather events. Allow a minimum of 1.9 cm (3/4") between the roof and the microinverter.Also,allow 1.3 cm （1/2"）between the back of the PV module and the top of the microinverter.

- For vertical mount, also maintain >30 cm (12") clearance from the edges of the PV module to protect the microinverter from direct exposure to rain, UV, and other harmful weather events.


WARNING: Install the microinverter under the PV module to avoid direct exposure to rain, UV, and other harmful weather events. Do not mount the microinverter upside down.

2. Torque the microinverter fasteners as follows. Do not over-torque.

- 6 mm (1/4") mounting hardware: 5 N m (45 to 50 in-lbs.)

- 8 mm (5/16") mounting hardware: 9 N m (80 to 85 in-lbs.)

- When using UL 2703 mounting hardware, use the manufacturer's recommended torque value.


Figure 3: Horizontal mount

* * *

Figure 4: Vertical mount

4.4 Create an installation map

The Enphase installation map is a diagram of the physical location of each microinverter in your PV
installation. Copy or use the blank Enphase installation map to record microinverter placement for the
system, or provide your own layout if you require a larger or more intricate installation map.
Each Enphase microinverter, IQ Gateway, and IQ Battery has a removable serial number label. Build

Each Enphase microinverter, IQ Gateway, and IQ Battery has a removable serial number label. Build
the installation map by peeling the serial number labels from the microinverter mounting plates and
placing the labels on the map. You will also place the IQ Gateway and IQ Battery serial number on the
map after installation.

After you have created the installation map, use the Enphase Installer App (mobile app) to record
serial numbers and configure the system. For details, refer to Detect the Microinverters in the help
topics of the Enphase Installer App.

1. Peel the removable serial number label from each microinverter and affix it to the respective
   location on the paper installation map.

2. Peel the label from the IQ Gateway and any IQ Battery (if installed) and affix it to the installation

3. Peel the label from the IQ Gateway and any IQ Battery (if installed) and affix it to the installation
   map.

4. Always keep a copy of the installation map for your records.

5. Always keep a copy of the installation map for your records.


* * *

Affix serial number labels

4.5 Manage the cabling

1. Use cable clips or tie wraps to attach the cable to the racking. Leave no more than 1.8 m (6 ft)
   between cable clips or tie wraps.

2. Dress any excess cabling in loops so that it does not contact the roof. Do not form loops smaller
   than 12 cm (4¾") in diameter.


WARNING: Tripping hazard. Loose cables can become a tripping hazard. Dress the IQ Cable
to reduce this risk.

* * *

4.6 Connect the microinverters

1. Connect the microinverter. Listen for a click as the connectors engage.

2. Cover any unused connector with IQ Sealing Caps. Listen for a click as the connectors engage.

3. Cover any unused connector with IQ Sealing Caps. Listen for a click as the connectors engage.


WARNING: Risk of electric shock. Risk of fire. Install sealing caps on all unused AC connectors,
as these connectors become live when the system is energized. Sealing caps are required for
protection against moisture ingress.

NOTE: If you need to remove a sealing cap, you must use the IQ Disconnect Tool. Refer to
Disconnect a microinverter.

4.7 Terminate the unused end of the cable

Terminate the unused end of the IQ Cable as follows.

* * *

1. Remove 13 mm (½ inch) of the cable sheath from the conductors. Use the terminator loop to
   measure 13 mm.

2. Slide the hex nut onto the cable.

3. Insert the cable into the terminator body so that each of the two wires lands on opposite sides of
   the internal separator. There is a grommet inside of the hex nut that should remain in place.

4. Insert a screwdriver into the slot on the top of the terminator to hold it in place and torque the nut
   to 7 N m.

5. Hold the terminator body stationary with the screwdriver and turn only the hex nut to prevent the
   conductors from twisting out of the separator.


NOTE: Turn only the hex nut to prevent conductors from twisting out of the separator.

6. Attach the terminated cable end to the PV racking with a cable clip or tie wrap so that the cable
   and terminator do not touch the roof.

WARNING: The terminator cannot be re-used. If you unscrew the nut, you must discard the
terminator.

1. Connect the IQ Cable to the junction box.
2. Refer to the Sample wiring diagram on page 53 for more information. Wire colors are listed in the

| Wire colors |  |
| --- | --- |
| L1-Black | L2-Red |

Wire colors

4.8 Complete the installation of the junction box

L1-Black

* * *

4.9 Connect the PV modules

WARNING: Electrical shock hazard. The DC conductors of this photovoltaic system are
ungrounded and may be energized.

1. If required, attach the DC bulkhead adaptors to the microinverters. Ensure they are fully seated.
   Do not reverse the adaptor connections.

2. Connect the DC leads of each PV module to the DC input connectors of the corresponding

3. Connect the DC leads of each PV module to the DC input connectors of the corresponding
   microinverter.

4. Check the LED on the connector side of the microinverter. The LED flashes six times when DC

5. Check the LED on the connector side of the microinverter. The LED flashes six times when DC
   power is applied.

6. Mount the PV modules above the microinverters.

7. Mount the PV modules above the microinverters.


4.10 Enphase Energy System configurations

Following are common system configurations possible with Enphase Energy System using IQ8 PV
(IQ8/IQ8+/IQ8M/IQ8A/IQ8H) microinverters.

• PV solar grid-tied

• IQ System Controller 2 The Enphase Energy System includes the IQ System Controller smart
switch with microgrid interconnect device (MID) capability, which consolidates interconnection
equipment into a single enclosure and streamlines grid-independent capabilities of PV and storage
installations by providing a consistent, pre-wired solution for residential applications. Along with
MID functions, it includes PV, storage, and generator input circuits. It allows IQ Battery storage

• PV solar grid-agnostic
• PV solar + storage

• PV solar + storage
• PV solar + generator systems to form an intentional island (per IEEE 1547.4 definition) and contains a neutral-forming transformer (NFT) to enable 120/240 V operation in backup mode.

- Wireless Communications Kit enables direct communication between the IQ Battery,IQ System Controller,and the Gateway using a 2.4 GHz frequency.The kit is connected to one of the USB ports on the IQ Gateway.

- Mobile Connect cellular modem is required unless already present to ensure the best performance of your system. The cellular modem connects to a USB port on the IQ Gateway.

- For new or retrofit systems with IQ Series Microinverters:

- IQ8 (IQ8/IQ8+/IQ8M/IQ8A/IQ8H) Series Microinverters and accessories. Enphase Energy System technology is fully compatible with IQ8 Series Microinverters.

- IQ Gateway is a communications gateway that can communicate with IQ8 Series Microinverters, IQ Batteries, and the IQ System Controller. It collects system performance information and transmits that information over the internet to the Enphase Cloud. An IQ Gateway is required for Enphase Energy Systems with IQ Series Microinverters. Note the IQ Gateway is included in an IQ Combiner.

- IQ Combiner Series consolidates interconnection equipment into a single enclosure and streamlines PV and storage installations by providing a consistent, pre-wired solution for residential applications. It includes the IQ Gateway. Install the new Communication Kit in any IQ Combiner to enable wireless communication with IQ Battery and IQ System Controller.


4.10.1 Enphase Energy System PV solar grid-tied

For grid-tied mode, post IQ8 Microinverter installations energize the system as follows:

| LED color | Indication |
| --- | --- |
| Flashing green | Normal operation. AC grid function is normal, and there is communication with the IQ Gateway. |
| Flashing orange | The AC grid is normal, but there is no communication with the IQ Gateway. |
| Flashing red | The AC grid is either not present or not within the specification. |
| Solid red | There is an active DC Resistance Low，Power Off Condition.To reset，refer to DC Resistance Low- Power off condition. |

2. Turn ON the main utility-grid AC circuit breaker. Your system starts producing power after a five-minute wait time.

3. Check the LED on the connector side of the microinverter:


* * *

Refer to the IQ Gateway quick install guide to install the IQ Gateway and set up system monitoring
and grid management functions.

4.10.2 Enphase Energy System PV solar grid agnostic

In the PV solar grid, agnostic configuration in the Enphase Energy System, IQ System Controller smart
switch is installed on the line-side of the main load panels. This allows a properly sized Enphase
Energy System to provide power to all loads in the main load panel in the event of a grid outage
and PV solar presence. In this configuration, the IQ System Controller can be configured with a main
breaker to act as the service disconnecting means. The PV system shall be interconnected to the
IQ System Controller on a dedicated breaker. This configuration typically supports larger PV system
sizes and may allow avoiding expensive utility service and/or main service panel upgrades.

System commissioning for a grid-agnostic configuration should be done with grid power present.
During IQ8 PV installation, ensure all relays are open from the main panel and IQ System
Controller. When commissioned, the IQ System Controller gets powered on from the grid side of
the MID (microgrid interconnect device); it closes the MID relay and PV relay. IQ8 PV shall start
producing power in grid-tied mode with IQ Gateway power on. Follow the Enphase Energy System
commissioning process using the Enphase Installer App for system commissioning.

* * *

4.10.3 Enphase Energy System PV solar + storage – whole home backup
configuration

In the whole home (main load panel) backup configuration, the IQ System Controller is installed
on the line side of the main load panels rated up to 200 A. This allows a properly sized Enphase
Energy System to provide power to all loads in the main load panel in the event of a grid outage.
In this configuration, the IQ System Controller can be configured with a main breaker to act as the
service disconnecting means. The PV system can be interconnected to the IQ System Controller on
a dedicated breaker or may be interconnected to the main load panel. This configuration typically
supports larger PV and storage system sizes and may allow for avoiding expensive utility service
and/or main service panel upgrades.

The above configuration can also work with a generator connected to the IQ System Controller with
or without an IQ Battery. The following two images explain the connection configuration.

Figure 5: Enphase Energy System PV solar + generator configuration

* * *

Figure 6: Enphase Energy System PV solar + IQ Battery + generator configuration

4.11 Set up and activate monitoring

Refer to the IQ Gateway quick install guide to install the IQ Gateway and set up system monitoring
and grid management functions. This guide leads you through the following:

• Connecting the gateway
• Detecting devices

• Detecting devices

• Connecting to the Enphase Installer Platform
• Registering the system

• Building the virtual array

• Registering the system
• Building the virtual array

NOTE: When the utility requires a profile other than the default IEEE 1547 (for example, grids
managed by Hawaii Electric Industries \[HEI\], including HECO or in California), you must select
an appropriate grid profile for your installation.

5. Troubleshooting

Follow all the safety measures described throughout this manual. Qualified personnel can use the
following troubleshooting steps if the PV system does not operate correctly.

You can set the grid profile through the Enphase Installer Platform, during system registration, or
through the Enphase Installer App at any time. You must have an IQ Gateway to set or change the grid
profile to be compliant with certain jurisdictions. For more information on setting or changing the grid
profile.

* * *

5.1 Status LED indications and error reporting

The following section describes LED indications.

5.1.1 LED operation

| LED color | Indicates |
| --- | --- |
| Flashing green | Normal operation. AC grid function is normal, and there is communication with the IQ Gateway. |
| Flashing orange | The AC grid is normal, but there is no communication with the IQ Gateway. |
| Flashing red | The AC grid is either not present or not within the specification. |
| Solid red | There is an active DC Resistance Low，Power Off Condition。To reset，see DC Resistance Low- Power Off Condition below. |

The status LED on each microinverter lights green about six seconds after DC power is applied. It
remains lit solid for two minutes, followed by six green blinks. After that, red blinks indicate that no grid
is present if the system is not yet energized.

Any short red blinks after DC power is first applied to the microinverter indicate a failure during
microinverter start-up.

5.1.2 DC Resistance Low – Power off condition

For all IQ Series models, a solid red status LED when DC power has been cycled indicates the
microinverter has detected a DC Resistance Low – Power Off event. The LED will remain red, and the
fault will continue to be reported by the gateway until the error has been cleared.

An insulation resistance (IR) sensor in the microinverter measures the resistance between the positive
and negative PV inputs to the ground. If either resistance drops below a threshold, the microinverter
stops power production and raises this condition. This may indicate defective module insulation,
defective wiring or connectors, moisture ingress, or a similar problem. Although the cause may be
temporary, this microinverter condition persists until the sensor is manually reset.

An IQ Gateway is required to clear this condition. The condition clears on operator command unless
its cause is still present.

If a microinverter registers a “DC Resistance Low - Power Off” condition, you can attempt to clear this
condition. If the condition does not clear after you perform the following procedure, contact Enphase
Support at [https://enphase.com/support](https://enphase.com/support).

Method 1: Clear this error using the Enphase Installer Platform

* * *

01. Log in to the Enphase Installer Platform and access the system.

02. Click the Events tab. The next screen shows a current DC Resistance Low - Power Off condition for

03. Click the Events tab. The next screen shows a current DC Resistance Low - Power Off condition for
    the system.

04. Click DC Resistance Low - Power Off.

05. Click DC Resistance Low - Power Off.

06. Where “n” is the number of affected devices, click n devices (show details).

07. Click the serial number of the affected microinverter.

08. Click the serial number of the affected microinverter.

09. Click Reset DC Resistance Low - Power Off Sensor.

10. Click Reset DC Resistance Low - Power Off Sensor.

11. The system displays that a DC Resistance Low-Power Off reset task was issued on \[date and time\]

12. The system displays that a DC Resistance Low-Power Off reset task was issued on \[date and time\]
    for this microinverter and is still pending.


Method 2: Use the Enphase Installer App to clear the condition

On the list of detected microinverters, a green dot or red square appears to the left of each
microinverter serial number. A green dot indicates the status OK. A red square indicates an event
for that microinverter.

1. Tap to the left of the serial number to view details for a microinverter event.

2. If the microinverter status shows that there is an active DC Resistance Low – Power Off condition,

3. If the microinverter status shows that there is an active DC Resistance Low – Power Off condition,
   tap to send a clear message to the affected microinverter. The app then indicates that a clear
   message was sent.


5.1.3 Other faults

All other faults are reported to the gateway.

5.2 Troubleshoot an inoperable microinverter

To troubleshoot an inoperable microinverter, follow the steps in the order shown.

WARNING: Risk of electric shock. Always de-energize the AC branch circuit before servicing.
Never disconnect the DC or AC connectors under load.

WARNING: The Enphase microinverters are powered by DC power from the PV modules. Ensure
you disconnect the DC connections, reconnect the DC power, and then watch for the solid
green for about six seconds after connecting to the DC power.

* * *

1. Ensure AC breakers and disconnects are closed.

2. Check the connection to the utility grid and verify that the utility voltage is within allowable

3. Check the connection to the utility grid and verify that the utility voltage is within allowable
   ranges.

4. Verify that AC line voltages at all solar power circuit breakers at the load center and subpanels are

5. Verify that AC line voltages at all solar power circuit breakers at the load center and subpanels are
   within the ranges shown in the following table:


240 VAC, single-phase

| L1 to L2 | 211 to 264 VAC |
| --- | --- |
| L1, L2 to ground | 106 to 132 VAC |
| 208VAC，single-phase |  |
| L1 to L2 | 183 to 229 VAC |
| L1, L2 to ground | 106 to 132 VAC |

4. Using an IQ Disconnect Tool, disconnect the AC cable for the microinverter in question from the IQ
   Cable.

5. Verify that utility power is present at the microinverter by measuring line to line and line to ground
   at the IQ Cable connector.

6. Visually check that the AC branch circuit connections (IQ Cable and AC connections) are properly

7. Visually check that the AC branch circuit connections (IQ Cable and AC connections) are properly
   seated. Reset if necessary. Check also for damage, such as rodent damage.

8. Ensure that any upstream AC disconnects, as well as the dedicated circuit breakers for each AC

9. Ensure that any upstream AC disconnects, as well as the dedicated circuit breakers for each AC
   branch circuit, are functioning properly and are closed.

10. Disconnect and re-connect the DC PV module connectors. The status LED of each microinverter

11. Disconnect and re-connect the DC PV module connectors. The status LED of each microinverter
   will light solid green a few seconds after connection to DC power and then blink green six times
   to indicate normal start-up operation about two minutes after connecting to DC power. The LED
   subsequently resumes normal operation if the grid is present. See the table on the previous page
   outlining LED indicators for normal operation.

12. Attach an ammeter clamp to one conductor of the DC cables from the PV module to measure the


10.Verify the PV module DC voltage is within the allowable range shown in the Specifications.
11\. Swap DC leads with a known good, adjacent PV module. If, after checking the Enphase Installer

11. Swap DC leads with a known good, adjacent PV module. If, after checking the Enphase Installer
    Platform periodically (this may take up to 30 minutes), the problem moves to the adjacent module,
    this indicates that the PV module is not functioning correctly. If it stays in place, the problem is with
    the original microinverter. Contact Enphase Support for help in reading the microinverter data and
    for help in obtaining a replacement microinverter, if needed.

12. Check the DC connections between the microinverter and the PV module. The connection may

13. Check the DC connections between the microinverter and the PV module. The connection may
    need to be tightened or reseated. If the connection is worn or damaged, it may need replacement.

14. Verify with your utility that the line frequency is within range.

15. If the problem persists, contact Enphase Support at [https://enphase.com/support](https://enphase.com/support).


5.3 Disconnect a microinverter

* * *

1. De-energize the AC branch circuit breaker.

2. AC connectors are tool-removable only. To disconnect the microinverter from the IQ Cable, insert

3. AC connectors are tool-removable only. To disconnect the microinverter from the IQ Cable, insert
   the disconnect tool and remove the connector.

4. Cover the PV module with an opaque cover.

5. Cover the PV module with an opaque cover.

6. Using a clamp-on meter, verify there is no current flowing in the DC wires between the PV module

7. Using a clamp-on meter, verify there is no current flowing in the DC wires between the PV module
   and the microinverter. If the current is still flowing, check that you have completed steps one and
   two above.


NOTE: Take care when measuring DC current, as most clamp-on meters must be zeroed first
and tend to drift with time.

5. Disconnect the PV module DC wire connectors from the microinverter using the IQ Disconnect
   Tool.

6. If present, loosen and/or remove any bonding hardware.

7. Remove the microinverter from the PV racking.

8. Remove the microinverter from the PV racking.


WARNING: Risk of electric shock. Risk of fire. Do not leave any connectors on the PV
system disconnected for an extended period. If you do not plan to replace the microinverter
immediately, you must cover any unused connector with a sealing cap.

5.4 Install a replacement microinverter

1. When the replacement microinverter is available, verify that the AC branch circuit breaker is
   de-energized.

2. Mount the microinverter horizontally, bracket side up, or vertically.

3. Mount the microinverter horizontally, bracket side up, or vertically.


• Always place the microinverter under the PV module, protected from direct exposure to rain,
sun, and other harmful weather events. Allow a minimum of 1.9 cm (3/4") between the roof and
the microinverter. Also, allow 1.3 cm (1/2") between the back of the PV module and the top of
the microinverter.
• For vertical mount, also maintain >30 cm (12") clearance from the edges of the PV module to

WARNING: Risk of equipment damage. Mount the microinverter under the PV module.
Install the microinverter under the PV module to avoid direct exposure to rain, UV, and other

• Install the microinverter under the PV module to avoid direct exposure to rain, UV, and other
harmful weather events.
Always install the microinverter bracket side up.

• Always install the microinverter bracket side up.
• Do not mount the microinverter upside down.

• 8 mm (5/16") mounting hardware: 9 N m (80 to 85 in-lbs.)
• When using UL 2703 mounting hardware, use the manufacturer’s recommended torque value.

3. Torque the mounting fasteners to the values shown. Do not over-torque.

4. Connect the microinverter to the IQ Cable connector. Listen for a click as connectors engage.

5. Connect the DC leads of each PV module to the DC input connector of the microinverter.


• Do not expose the AC or DC connectors (on the IQ Cable connection, PV module, or
microinverter) to rain or condensation before the connectors are mated.
3\. Torque the mounting fasteners to the values shown. Do not over-torque.

6. Connect the DC leads of each PV module to the DC input connector of the microinverter.

7. Re-mount the PV module above the microinverter.

8. Re-mount the PV module above the microinverter.

9. Energize the AC branch circuit breaker and verify the operation of the replacement microinverter

10. Energize the AC branch circuit breaker and verify the operation of the replacement microinverter
   by checking the Status LED on the connector side of the microinverter.


* * *

9. Use the Enphase Installer App to delete the old microinverter serial number from the Enphase
   IQ Gateway database. In the Enphase Installer App, once connected to the IQ Gateway:

a. Tap Micros > Manage.

b. Tap the checkbox to the right of the microinverter serial number that you replaced.
c. Tap to delete the microinverter from the IQ Gateway database.

c. Tap to delete the microinverter from the IQ Gateway database.
10.Add the new microinverter serial number to the gateway database by initiating a device scan using

10.Add the new microinverter serial number to the gateway database by initiating a device scan using
one of the following methods:

a. Method 1: Initiate a scan using the Enphase Installer App

• In the Enphase Installer App, once connected to the IQ Gateway, navigate to the Overview
screen.
From the Overview screen, tap Detected > Start Device Scan to start a new 30-minute

• From the Overview screen, tap Detected > Start Device Scan to start a new 30-minute
device scan.
If device scanning on the IQ Gateway is inhibited, the app displays Scan Inhibited. If you

• If device scanning on the IQ Gateway is inhibited, the app displays Scan Inhibited. If you
need to add more microinverters to the system when device scanning is inhibited on the
IQ Gateway, you must use the Enphase Installer App scanning tool to provision them on the
IQ Gateway rather than using the IQ Gateway’s device scanning function to discover them.
If this is not possible and you need to enable device scanning on the IQ Gateway, contact
Enphase Support.
Method 2: Use an IQ Gateway

b. Method 2: Use an IQ Gateway

• Press the Device Scan button on the IQ Gateway. The IQ Gateway begins a 15-minute scan
to identify all of the microinverters deployed at the site. The Microinverter Communications
LED flashes green during the scan.

11. Log in to Enphase Installer Platform to use Enphase Installer Platform’s Array Builder to add the
    newly detected microinverter to the virtual array.
12. Ship the old microinverter to Enphase using the supplied return shipping label.

6.2 Enphase IQ Cable planning and ordering

The Enphase IQ Cable is a continuous length of 12 AWG, double insulated, outdoor-rated cable with
integrated connectors for microinverters. These connectors are preinstalled along the IQ Cable at

12. Ship the old microinverter to Enphase using the supplied return shipping label.

6.1 Ordering replacement parts intervals to accommodate varying PV module widths. The microinverters plug directly into the cable
connectors.

The cabling is compatible with a variety of PV racking systems. For a list of approved PV racking
systems, refer to the PV racking compatibility document on the Enphase website at https://
enphase.com/support.

6.3 Connector spacing options

IQ Cable is available in three connector spacing options. The gap between connectors on the cable
can be 1.3 meters, 2.0 meters, or 2.3 meters. The 1.3-meter spacing is best suited for connecting PV
modules installed in portrait orientation, while the 2.0-meter and 2.3-meter spacing allows you to
install 60-cell and 72-cell PV modules in landscape orientation, respectively.

6.4 Cabling options

| Cable model | Connector spacing | PV module orientation | Connector count per box |
| --- | --- | --- | --- |
| Q-12-10-240 | 1.3m(50") | Portrait | 240 |
| Q-12-17-240 | 2.0m(78") | Landscape(60-cell) | 240 |
| Q-12-20-200 | 2.3m(90") | Landscape(72-cell) | 200 |

• When mixing PV modules in both portrait and landscape orientation, you may need to transition
between cable types. See the preceding table for available cable types.
To transition between cable types, install a IQ Field Wireable Connector pair.

• To transition between cable types, install a IQ Field Wireable Connector pair.

The IQ Cable is available with several accessory options for ease of installation, including:

• IQ Field Wireable Connector (male): (Q-CONN-10M) Make connections from any field wireable
female connector.
• IQ Field Wireable Connector (female): (Q-CONN-10F) Make connections from any IQ Cable open

• IQ Field Wireable Connector (female): (Q-CONN-10F) Make connections from any IQ Cable open
connector or field wireable male connector.
• IQ Cable Clips: (Q-CLIP-100) Used to fasten cabling to the racking or to secure looped cabling.

• IQ Cable Clips: (Q-CLIP-100) Used to fasten cabling to the racking or to secure looped cabling.

• IQ Disconnect Tool: (Q-DISC-10) Disconnect tool for IQ Cable connectors, DC connectors, and AC
module mount.

WARNING: Do not form loops smaller than 12 cm (4.75") in diameter.

* * *

• IQ Sealing Caps (female): (Q-SEAL-10) One needed to cover each unused connector on the
cabling.
IQ Terminator: (Q-TERM-10) Terminator cap for cut cable ends.

• IQ Terminator: (Q-TERM-10) Terminator cap for cut cable ends.

7. Technical data

7.1 Technical considerations

WARNING: Risk of equipment damage. You must match the DC operating voltage range of the
PV module with the allowable input voltage range of the microinverter.

WARNING: Risk of equipment damage. The maximum open circuit voltage of the PV module
must not exceed the specified maximum input voltage of the Enphase microinverter.

Be sure to apply the following when installing the Enphase IQ8 Series Microinverter system:

• PV modules must have conductors labeled PV Wire or PV Cable to comply with NEC for
ungrounded PV power systems.
• Verify that the voltage and current specifications of the PV module match those of the

• Verify that the voltage and current specifications of the PV module match those of the
microinverter.

• The maximum short circuit current rating of the PV module must be equal to or less than the
maximum input DC short circuit current rating of the microinverter.

The output voltage and current of the PV module depend on the quantity, size, and temperature of the
PV cells, as well as the insolation of each cell. The highest PV module output voltage occurs when the
temperature of the cells is the lowest and the PV module is at an open circuit (not operating).

7.2 Bifacial modules

Enphase microinverters are compatible with bifacial PV modules. Bifacial solar modules produce
power from both sides of a bifacial module, increasing total energy generation. The power gained
from the rear side (bifacial gain) is highly influenced by various design factors such as albedo, module
elevation, pitch, temperature, and shading. The bifacial gain can be anywhere between 0% to 30% of
the nominal rating (front-side power rating) of the module. Since the bifacial gain is highly influenced
by various design considerations, pairing the bifacial module with the right microinverter depends on
the electrical characteristics of a given module.

Refer to Mount the microinverters on page 17 for tips on vertical mounting of bifacial modules.

* * *

8. Specifications

See the specifications in the following tables:

• IQ8-60-2-US Microinverters

• IQ8PLUS-72-2-US Microinverters
• IQ8M-72-2-US Microinverters

• IQ8M-72-2-US Microinverters
IQ8A-72-2-US Microinverters

• IQ8A-72-2-US Microinverters
IQ8H-240-72-2-US Microinverters

• IQ8H-240-72-2-US Microinverters
IQ8H-208-72-2-US Microinverters

• IQ8H-208-72-2-US Microinverters

• IQ Cable

8.1 IQ8-60-2-US Microinverter specifications

| Parameter | Units | Min. | Typical | Max. |
| --- | --- | --- | --- | --- |
| Commonly used modules for pairing1 | - | 235W-350W |  |  |
| Peak power tracking voltage | V | 27 | - | 37 |
| Operating voltage range | V | 16 | - | 48 |
| Maximum input DC voltage | V | - | - | 50 |
| Minimum/Maximum start voltage | V | 22 | - | 48 |
| Max. continuous input DC current | A | - | - | 10 |
| Max. input DC short-circuit current | A | - | - | 25 |
| Max. moduleIsc | A | - | - | 20 |
| Overvoltage class DC port | - | - | II | - |
| DC port back feed under single fault | A | - | - | 0 |
| PV array configuration | 1×1 ungrounded array; no additional DC side protection required; AC side protection requires a maximum of 20A per branch circuit |  |  |  |

| Parameter | Units | Min. | Typical | Max. |
| --- | --- | --- | --- | --- |
| Peak output power | VA | 245 |  |  |
| Maximum continuous AC output power | VA | 240 |  |  |
| Grid-tied power factor(adjustable) |  | 0.85 leading...0.85 lagging |  |  |
| Nominal AC output voltage range 240VAC(single-phase)^{2}$ | Vrms | 211 | - | 264 |

AC parameters

* * *

| AC parameters |  |  |  |  |
| --- | --- | --- | --- | --- |
| Parameter | Units | Min. | Typical | Max. |
| Max continuous output current | A | - | 1.0 | - |
| Nominal frequency | Hz | - | 60 | - |
| Extended frequency range | Hz | 47 | - | 68 |
| Maximum AC output over current protection device | A | 20 |  |  |
| AC short circuit fault current over three cycles | A$\_{rms}$ | 2 |  |  |
| High AC voltage trip limit accuracy | % | ±1.0 | - | - |
| Low AC voltage trip limit accuracy | % | ±1.0 | - | - |
| Frequency trip limit accuracy | Hz | ±0.1 | - | - |
| Trip time accuracy(for trip times or delays<5 sec.) | ±ms | - | - | 33 |
| Trip time accuracy(for trip times or delays>=5 sec.) | % | - | - | 1 |
| Overvoltage class AC port | - | - | III | - |
| AC port back feed current | mA | 30 |  |  |
| Power factor setting |  | - | 1.0 | - |

$$
A \_ {\\mathrm {r m s}}
$$

Miscellaneous parameters

| Parameter | Units | Min. | Typical | Max. |
| --- | --- | --- | --- | --- |
| Maximum4 microinverters per20A(max)AC branch circuit240VAC(single-phase)$ ^{3}$ | s | - | - | 16 |
| CEC weighted efficiency240VAC(single-phase) | % | - | - | 97 |
| Total harmonic distortion | % | - | - | <5 |
| Ambient temperature range | $ ^{\\circ}C $ | -40 | - | 60 |
| Nighttime power consumption | mW | - | - | 23 |
| Storage temperature range | $ ^{\\circ}C $ | -40 | - | 85 |

$$
I \_ {\\mathrm {s c}}.
$$

$$
^{\\circ} \\mathrm {C}
$$

* * *

| Features and specifications |  |  |  |
| --- | --- | --- | --- |
| Feature | Min. | Typical | Max. |
| Dimensions not including mounting bracket | 212mm(8.3")×175mm(6.9")×30.2mm(1.2") |  |  |
| Connector type | Enphase IQ Connector |  |  |
| Weight | 1.08kg(2.38lb) |  |  |
| Environmental category/UV exposure rating | NEMA Type 6/Outdoor |  |  |
| Torque specifications for fasteners(Do not over-torque) | 6mm(1/4")mounting hardware:5Nm(45to50in-lb)8mm(5/16")mounting hardware:9Nm(80to85in-lb)When usingUL2703mounting hardware,use the manufacturer's recommended torque value |  |  |
| Cooling | Natural convection-No fans |  |  |
| Relative humidity range | 4% to100%(condensing) |  |  |
| Approved for wet locations | Yes |  |  |
| Pollution degree | PD3 |  |  |
| Standard warranty term | [http://enphase.com/warranty](http://enphase.com/warranty) |  |  |
| Compliance | CA Rule21(UL1741-SA),UL62109-1,IEEE1547:2018(UL1741-SB),FCC Part15ClassB,ICES-0003ClassB,CAN/CSA-C22.2NO.107.1-01This product isULListedasPVrapidshutdownequipmentandconformswithNEC2014,NEC2017,NEC2020,andNEC2023section690.12andC22.1-2018Rule64-218rapidshutdownofPVsystemsforACandDCconductorswheninstalledaccordingtomanufacturer'sinstructions. |  |  |
| Grounding | TheDCcircuitmeetstherequirementsforungroundedPVarraysinNEC.Groundfaultprotection(GFP)isintegratedintotheclassIldouble-insulatedmicroinverter. |  |  |
| Monitoring | EnphaseInstallerPlatform和EnphaseAppmonitoringoptions.BothoptionsrequireanEnphaseIQGateway. |  |  |
| Communication | Powerlinecommunication(PLC) |  |  |

1
Pairing PV modules with wattage above the limit may result in additional clipping losses. See the compatibility calculator at
[https://link.enphase.com/module-compatibility](https://link.enphase.com/module-compatibility).
2
Nominal voltage range can be extended beyond nominal if required by the utility.

2
Nominal voltage range can be extended beyond nominal if required by the utility.
3
Limits may vary. Refer to local requirements to define the number of microinverters per branch in your area.

Nominal voltage range can be extended beyond nominal if required by the utility.
3
Limits may vary. Refer to local requirements to define the number of microinverters per branch in your area.

* * *

8.2 IQ8PLUS-72-2-US Microinverter specifications

| Parameter | Units | Min. | Typical | Max. |
| --- | --- | --- | --- | --- |
| Commonly used modules for pairing1 | - | 235W-440W |  |  |
| Peak power tracking voltage | V | 27 | - | 45 |
| Operating voltage range | V | 16 | - | 58 |
| Maximum Input DC voltage | V | - | - | 60 |
| Minimum/Maximum start voltage | V | 22 | - | 58 |
| Max. continuous input DC current | A | - | - | 12 |
| Max. input DC short-circuit current | A | - | - | 25 |
| Max. moduleIsc | A | - | - | 20 |
| Overvoltage class DC port | - | - | II | - |
| DC port backfeed under single fault | A | - | - | 0 |
| PV array configuration | 1×1 ungrounded array; no additional DC side protection required; AC side protection requires a maximum of 20A per branch circuit |  |  |  |

| Parameter | Units | Min. | Typical | Max. |
| --- | --- | --- | --- | --- |
| Peak output power | VA | 300 |  |  |
| Maximum continuous AC output power | VA | 290 |  |  |
| Grid-tied power factor(adjustable) |  | 0.85 leading...0.85 lagging |  |  |
| Nominal AC output voltage range 240VAC(single-phase)2 | Vrms | 211 | - | 264 |
| Max continuous output current | A rms | - | 1.21 | - |
| Nominal frequency | Hz | - | 60 | - |
| Extended frequency range | Hz | 47 | - | 68 |
| Maximum AC output over current protection device | A | 20 |  |  |
| AC short circuit fault current over three cycles | Arms | 2 |  |  |
| High AC voltage trip limit accuracy | % | ±1.0 | - | - |
| Low AC voltage trip limit accuracy | % | ±1.0 | - | - |
| Frequency trip limit accuracy | Hz | ±0.1 | - | - |

$$
V \_ {\\mathrm {r m s}}
$$

$$
\\mathrm {H z}
$$

* * *

| Parameter | Units | Min. | Typical | Max. |
| --- | --- | --- | --- | --- |
| Trip time accuracy(for trip times or delays<5sec.) | ±ms | - | - | 33 |
| Trip time accuracy(for trip times or delays≥5sec.) | % | - | - | 1 |
| Overvoltage class AC port | - | - | III | - |
| AC port backfeed current | mA | 30 |  |  |
| Power factor setting |  | - | 1.0 | - |

Miscellaneous parameters

| Parameter | Units | Min. | Typical | Max. |
| --- | --- | --- | --- | --- |
| Maximum4 microinverters per20A(max)AC branch circuit240VAC(single-phase)$ ^{3}$ | - | - | - | 13 |
| CEC weighted efficiency240VAC(single-phase) | % | - | - | 97 |
| Total harmonic distortion | % | - | - | <5 |
| Ambient temperature range | $ ^{\\circ} \\mathrm{C}$ | -40 | - | 60 |
| Nighttime power consumption | mW | - | - | 25 |
| Storage temperature range | $ ^{\\circ} \\mathrm{C}$ | -40 | - | 85 |

$$
^{\\circ} \\mathrm {C}
$$

$$
^{\\circ} \\mathrm {C}
$$

| Parameter | Min. | Typical | Max. |
| --- | --- | --- | --- |
| Compatibility | To meet compatibility, PV modules must be within the following maximum input DC voltage and maximum module $I\_{sc}$. Module compatibility can be checked at [https://enphase.com/installers/microinverters/calculator](https://enphase.com/installers/microinverters/calculator). |  |  |
| Dimensions not including mounting bracket | 212mm(8.3")x175mm(6.9")x30.2mm(1.2") |  |  |
| Connector type | Enphase IQ Connector |  |  |
| Weight | 1.08kg(2.38lb) |  |  |
| Environmental category/UV exposure rating | NEMA Type 6/Outdoor |  |  |
| Torque specifications for fasteners(Do not over-torque) | ·6mm(1/4")mounting hardware:5Nm(45to50in-lb) |  |  |
| ·8mm(5/16")mounting hardware:9Nm(80to85in-lb) |  |  |  |
| ·When usingUL2703mounting hardware,use the manufacturer's recommended torque value |  |  |  |

* * *

| Features and specifications |  |  |  |
| --- | --- | --- | --- |
| Parameter | Min. | Typical | Max. |
| Cooling | Natural convection-No fans |  |  |
| Relative humidity range | 4% to 100%(condensing) |  |  |
| Approved for wet locations | Yes |  |  |
| Pollution degree | PD3 |  |  |
| Standard warranty term | [http://enphase.com/warranty](http://enphase.com/warranty) |  |  |
| Compliance | CA Rule 21(UL 1741-SA),UL 62109-1,IEEE1547:2018(UL 1741-SB),FCC Part 15 Class B,ICES-0003Class B,CAN/CSA-C22.2NO.107.1-01This product is UL Listed as PV rapid shutdown equipment and conforms with NEC 2014,NEC 2017,NEC 2020,and NEC 2023 section 690.12andC22.1-2018Rule 64-218rapid shutdown of PV systemsfor AC and DC conductors when installed accordingto manufacturer's instructions. |  |  |
| Grounding | The DC circuit meets the requirements forungrounded PV arrays inNEC.Ground fault protection(GFP)is integrated into the classII double-insulatedmicroinverter. |  |  |
| Monitoring | Enphase Installer Platform and Enphase Appmonitoring options.Both options require anEnphaseIQ Gateway. |  |  |
| Communication | Power line communication(PLC) |  |  |

1
Pairing PV modules with wattage above the limit may result in additional clipping losses. See the compatibility calculator at
[https://link.enphase.com/module-compatibility](https://link.enphase.com/module-compatibility).
2
Nominal voltage range can be extended beyond nominal if required by the utility.

2
Nominal voltage range can be extended beyond nominal if required by the utility.
3
Limits may vary. Refer to local requirements to define the number of microinverters per branch in your area.

| Parameter | Units | Min. | Typical | Max. |
| --- | --- | --- | --- | --- |
| Commonly used modules for pairing1 | - | 260W-460W |  |  |
| Peak power tracking voltage | V | 30 | - | 45 |
| Operating voltage range | V | 16 | - | 58 |
| Maximum input DC voltage | V |  | - | 60 |
| Minimum/Maximum start voltage | V | 22 | - | 58 |

8.3 IQ8M-72-2-US Microinverter specifications

Nominal voltage range can be extended beyond nominal if required by the utility.
3
Limits may vary. Refer to local requirements to define the number of microinverters per branch in your area.

* * *

| Parameter | Units | Min. | Typical | Max. |
| --- | --- | --- | --- | --- |
| Max. continuous input DC current | A | - | - | 12 |
| Max. input DC short-circuit current | A | - | - | 25 |
| Max. module $I\_{sc}$ | A | - | - | 20 |
| Overvoltage class DC port | - | - | II | - |
| DC port backfeed under single fault | A | - | - | 0 |
| PV array configuration | 1×1 ungrounded array; no additional DC side protection required; AC side protection requires a maximum of 20 A per branch circuit |  |  |  |
| AC parameters |  |  |  |  |
| Parameter | Units | Min. | Typical | Max. |
| Peak output power | VA | 330 |  |  |
| Maximum continuous AC output power | VA | 325 |  |  |
| Power factor (adjustable) | - | 0.85 leading ... 0.85 lagging |  |  |
| Nominal AC output voltage range 240 VAC (single-phase)² | Vrms | 211 | - | 264 |
| Max continuous output current | $A\_{rms}$ | 1.35 |  |  |
| Nominal frequency | Hz | 60 |  |  |
| Extended frequency range | Hz | 47 | - | 68 |
| Maximum AC output over current protection device | A | 20 |  |  |
| AC short circuit fault current over three cycles | $A\_{rms}$ | 2 |  |  |
| High AC voltage trip limit accuracy | % | ±1.0 | - | - |
| Low AC voltage trip limit accuracy | % | ±1.0 | - | - |
| Frequency trip limit accuracy | Hz | ±0.1 | - | - |
| Trip time accuracy (for trip times or delays <5 sec.) | ±ms | - | - | 33 |
| Trip time accuracy (for trip times or delays >=5 sec.) | % | - | - | 1 |
| Overvoltage class AC port | - | - | III | - |
| AC port backfeed current | mA | 30 |  |  |
| Power factor setting | - | - | 1.0 | - |

$$
\\mathrm {I} \_ {\\mathrm {s c}}
$$

$$
A \_ {\\mathrm {r m s}}
$$

$$
A \_ {\\mathrm {r m s}}
$$

* * *

Miscellaneous parameters

| Miscellaneous parameters |  |  |  |  |
| --- | --- | --- | --- | --- |
| Parameter | Units | Min. | Typical | Max. |
| Maximum 4 microinverters per 20A(max) AC branch circuit 240VAC(single-phase)$^3$ | - | - | - | 11 |
| CEC weighted efficiency 240VAC(single-phase) | % | - | - | 97.5 |
| Total harmonic distortion | % | - | - | <5 |
| Ambient temperature range | °C | -40 | - | 60 |
| Nighttime power consumption | mW | - | - | 21 |
| Storage temperature range | °C | -40 | - | 85 |
| Features and specifications |  |  |  |  |
| Feature | Min. |  | Typical | Max. |
| Compatibility | To meet compatibility, PV modules must be within the following maximum input DC voltage and maximum moduleI6c.Module compatibility can be checked at [https://enphase.com/installers/microinverters/calculator](https://enphase.com/installers/microinverters/calculator). |  |  |  |
| Dimensions not including mounting bracket | 212mm(8.3")x175mm(6.9")x30.2mm(1.2") |  |  |  |
| Connector type | Enphase IQ Connector |  |  |  |
| Weight | 1.08kg(2.38lb) |  |  |  |
| Environmental category/UV exposure rating | NEMA Type6/Outdoor |  |  |  |
| Torque specifications for fasteners(Do not over-torque) | ·6mm(1/4")mounting hardware:5Nm(45to50in-lb)·8mm(5/16")mounting hardware:9Nm(80to85in-lb)·When usingUL2703mounting hardware,use the manufacturer's recommended torque value |  |  |  |
| Cooling | Natural convection-No fans |  |  |  |
| Relative humidity range | 4% to100%(condensing) |  |  |  |
| Approved for wet locations | Yes |  |  |  |
| Pollution degree | PD3 |  |  |  |
| Standard warranty term | [http://enphase.com/warranty](http://enphase.com/warranty) |  |  |  |
| Compliance | CA Rule21(UL1741-SA),UL62109-1,IEEE1547:2018(UL1741-SB),FCC Part15ClassB,ICES-0003ClassB,CAN/CSA-C22.2NO.107.1-01 |  |  |  |

Features and specifications

Torque specifications for fasteners

* * *

| Features and specifications |  |  |  |
| --- | --- | --- | --- |
| Feature | Min. | Typical | Max. |
|  | This product is UL Listed as PV rapid shutdown equipment and conforms with NEC 2014, NEC 2017,NEC 2020,and NEC 2023 section 690.12 andC22.1-2018 Rule 64-218 rapid shutdown of PV systems for AC and DC conductors when installed according to manufacturer's instructions. |  |  |
| Grounding | The DC circuit meets the requirements for ungrounded PV arrays in NEC.Ground fault protection(GFP)is integrated into the classII double-insulated microinverter. |  |  |
| Monitoring | Enphase Installer App and Enphase App monitoring options.Both options require an Enphase IQ Gateway. |  |  |
| Communication | Power line communication(PLC) |  |  |

1
Pairing PV modules with wattage above the limit may result in additional clipping losses. See the compatibility calculator at
[https://link.enphase.com/module-compatibility](https://link.enphase.com/module-compatibility).
2
Nominal voltage range can be extended beyond nominal if required by the utility.

[https://link.enphase.com/module-compatibility](https://link.enphase.com/module-compatibility).
2
Nominal voltage range can be extended beyond nominal if required by the utility.
3
Limits may vary. Refer to local requirements to define the number of microinverters per branch in your area.

8.4 IQ8A-72-2-US Microinverter specifications

| Parameter | Units | Min. | Typical | Max. |
| --- | --- | --- | --- | --- |
| Commonly used modules for pairing1. | - | 295W-500W |  |  |
| Peak power tracking voltage | V | 32 | - | 45 |
| Operating voltage range | V | 16 | - | 58 |
| Maximum input DC voltage | V | - | - | 60 |
| Max. continuous input DC current | A | - | - | 12 |
| Max. input DC short-circuit current | A | - | - | 25 |
| Max. moduleIsc | A | - | - | 20 |
| Overvoltage class DC port | - | - | II | - |
| DC port backfeed under single fault | A | - | - | 0 |
| PV array configuration | 1×1 ungrounded array; no additional DC side protection required; AC side protection requires a maximum of 20 |  |  |  |

$$
\\mathrm {I} \_ {\\mathrm {s c}}
$$

1×1 ungrounded array; no additional DC side protection
required; AC side protection requires a maximum of 20
A per branch circuit

* * *

| Parameter | Units | Min. | Typical | Max. |
| --- | --- | --- | --- | --- |
| Peak output power | VA | 366 |  |  |
| Maximum continuous AC output power | VA | 349 |  |  |
| Power factor(adjustable) | - | 0.85 leading...0.85 lagging |  |  |
| Nominal AC output voltage range240VAC(single-phase)^{2}$ | $V\_{rms}$ | $211 | - | 264 |
| Max continuous output current | A\_{rms}$ | - | 1.45 | - |
| Nominal frequency | Hz | - | 60 | - |
| Extended frequency range | Hz | 47 | - | 68 |
| Maximum AC output over current protection device | A | 20 |  |  |
| AC short circuit fault current over three cycles | A\_{rms}$ | 5.8 |  |  |
| High AC voltage trip limit accuracy | % | ±1.0 | - | - |
| Low AC voltage trip limit accuracy | % | ±1.0 | - | - |
| Frequency trip limit accuracy | Hz | ±0.1 | - | - |
| Trip time accuracy(for trip times or delays<5sec.) | $\\pm$ms | - | - | 33 |
| Trip time accuracy(for trip times or delays>=5sec.) | % | - | - | 1 |
| Overvoltage class AC port | - | - | III | - |
| AC port backfeed current | mA | 30 |  |  |
| Power factor setting | - | - | 1.0 | - |

$$
V \_ {\\mathrm {r m s}}
$$

$$
A \_ {\\mathrm {r m s}}
$$

$$
\\mathrm {H z}
$$

$$
\\mathrm {H z}
$$

$$
A \_ {\\mathrm {r m s}}
$$

Miscellaneous parameters

| Parameter | Units | Min. | Typical | Max. |
| --- | --- | --- | --- | --- |
| Maximum 4 microinverters per 20A(max) AC branch circuit 240VAC(single-phase)$^3$ | - | - | - | 11 |
| CEC weighted efficiency 240VAC(single-phase) | % | - | - | 97 |
| Total harmonic distortion | % | - | - | <5 |
| Ambient temperature range | ℃ | -40 | - | 60 |
| Nighttime power consumption | mW | - | - | 22 |
| Storage temperature range | ℃ | -40 | - | 85 |

$$
^{\\circ} \\mathrm {C}
$$

* * *

| Features and specifications |  |  |  |
| --- | --- | --- | --- |
| Feature | Min. | Typical | Max. |
| Compatibility | To meet compatibility, PV modules must be within the following maximum input DC voltage and maximum module Isc. Module compatibility can be checked at [https://enphase.com/installers/microinverters/calculator](https://enphase.com/installers/microinverters/calculator). |  |  |
| Dimensions not including mounting bracket | 212 mm(8.3")x175 mm(6.9")x30.2mm(1.2") |  |  |
| Connector type | Enphase IQ Connector |  |  |
| Weight | 1.08kg(2.38lb) |  |  |
| Environmental category/UV exposure rating | NEMA Type 6/outdoor |  |  |
| Torque specifications for fasteners(Do not over-torque) | ·6mm(1/4")mounting hardware:5Nm(45to50in-lb) |  |  |
| ·8mm(5/16")mounting hardware:9Nm(80to85in-lb) |  |  |  |
| ·When usingUL2703mounting hardware,use the manufacturer's recommended torque value |  |  |  |
| Cooling | Natural convection-No fans |  |  |
| Relative humidity range | 4% to100%(condensing) |  |  |
| Approved for wet locations | Yes |  |  |
| Pollution degree | PD3 |  |  |
| Standard warranty term | [http://enphase.com/warranty](http://enphase.com/warranty) |  |  |
| Compliance | CA Rule21(UL1741-SA),UL62109-1,IEEE1547:2018(UL1741-SB),FCC Part15ClassB,ICES-0003ClassB,CAN/CSA-C22.2NO.107.1-01This product is UL Listed as PV rapid shutdown equipment and conforms with NEC2014,NEC2017,NEC2020,and NEC2023section690.12andC22.1-2018Rule64-218rapidshutdownofPVsystemsforACandDCconductorswheninstalledaccordingtomanufacturer'sinstructions. |  |  |
| Grounding | The DC circuit meets the requirements forungroundedPVarrays inNEC.Ground fault protection(GFP)is integrated into theclassIIdouble-insulatedmicroinverter. |  |  |
| Monitoring | Enphase Installer Platform and EnphaseAppmonitoringoptions.Both options requireanEnphaseIQGateway. |  |  |

* * *

Features and specifications

| Feature | Min. | Typical | Max. |
| --- | --- | --- | --- |
| Communication | Power line communication(PLC) |  |  |

1
Pairing PV modules with wattage above the limit may result in additional clipping losses. See the compatibility calculator at
[https://link.enphase.com/module-compatibility](https://link.enphase.com/module-compatibility)
2
Nominal voltage range can be extended beyond nominal if required by the utility.

[https://link.enphase.com/module-compatibility](https://link.enphase.com/module-compatibility)
2
Nominal voltage range can be extended beyond nominal if required by the utility.
3
Limits may vary. Refer to local requirements to define the number of microinverters per branch in your area.

Nominal voltage range can be extended beyond nominal if required by the utility.
3
Limits may vary. Refer to local requirements to define the number of microinverters per branch in your area.

8.5 IQ8H-240-72-2-US Microinverter specifications

| Parameter | Units | Min. | Typical | Max. |
| --- | --- | --- | --- | --- |
| Commonly used modules for pairing1 | - | 320W-540W |  |  |
| Peak power tracking voltage | V | 36 | - | 45 |
| Operating voltage range | V | 16 | - | 58 |
| Maximum input DC voltage | V | - | - | 60 |
| Minimum/Maximum start voltage | V | 22 | - | 58 |
| Max. continuous input DC current | A | - | - | 12 |
| Max. input DC short-circuit current | A | - | - | 25 |
| Max. moduleIsc | A | - | - | 20 |
| Overvoltage class DC port | - | - | II | - |
| DC port backfeed under single fault | A | - | - | 0 |
| PV array configuration | 1×1 ungrounded array; no additional DC side protection required; AC side protection requires a maximum of 20A per branch circuit |  |  |  |

| Parameter | Units | Min. | Typical | Max. |
| --- | --- | --- | --- | --- |
| Peak output power | VA | 384 |  |  |
| Maximum continuous AC output power | VA | 380 |  |  |
| Power factor(adjustable) | - | 0.85 leading...0.85 lagging |  |  |
| Nominal AC output voltage range2240VAC(single-phase) | Vrms | 211 | - | 264 |
| Max continuous output current | Arms | - | 1.58 | - |
| Nominal frequency | Hz | - | 60 | - |

$$
\\mathrm {I} \_ {\\mathrm {s c}}
$$

$$
V \_ {\\mathrm {r m s}}
$$

$$
A \_ {\\mathrm {r m s}}
$$

$$
\\mathrm {H z}
$$

* * *

| AC parameters |  |  |  |  |
| --- | --- | --- | --- | --- |
| Parameter | Units | Min. | Typical | Max. |
| Extended frequency range | Hz | 47 | - | 68 |
| Maximum AC output over current protection device | A | 20 |  |  |
| AC short circuit fault current over three cycles | A$\_{rms}$ | 2 |  |  |
| High AC voltage trip limit accuracy | % | ±1.0 | - | - |
| Low AC voltage trip limit accuracy | % | ±1.0 | - | - |
| Frequency trip limit accuracy | Hz | ±0.1 | - | - |
| Trip time accuracy(for trip times or delays<5sec.) | $\\pm$ms | - | - | 33 |
| Trip time accuracy(for trip times or delays>=5sec.) | % | - | - | 1 |
| Overvoltage class AC port | - | - | III | - |
| AC port backfeed current | mA | 30 |  |  |
| Power factor setting | - | - | 1.0 | - |

$$
A \_ {\\mathrm {r m s}}
$$

Miscellaneous parameters

| Parameter | Units | Min. | Typical | Max. |
| --- | --- | --- | --- | --- |
| Maximum4 microinverters per20A(max)AC branch circuit240VAC(single-phase)$ ^{3}$ | - | - | - | 10 |
| CEC weighted efficiency240VAC(single-phase) | % | - | - | 97 |
| Total harmonic distortion | % | - | - | <5 |
| Ambient temperature range | $ ^{\\circ} \\mathrm{C}$ | -40 | - | 60 |
| Nighttime power consumption | mW | - | - | 22 |
| Storage temperature range | $ ^{\\circ} \\mathrm{C}$ | -40 | - | 85 |

| Features and specifications |  |  |  |
| --- | --- | --- | --- |
| Feature | Min. | Typical | Max. |
| Compatibility | To meet compatibility, PV modules must be within the following maximum input DC voltage and maximum module $I\_{sc}$. Module compatibility can be checked at [https://enphase.com/installers/microinverters/calculator](https://enphase.com/installers/microinverters/calculator). |  |  |
| Dimensions not including mounting bracket | 212mm(8.3")x175mm(6.9")x30.2mm(1.2") |  |  |
| Connector type | Enphase IQ Connector |  |  |
| Weight | 1.08kg(2.38lb) |  |  |

$$
^{\\circ} \\mathrm {C}
$$

$$
I \_ {\\mathrm {s c}}
$$

$$
^{\\circ} \\mathrm {C}
$$

Features and specifications

* * *

| Features and specifications |  |  |  |
| --- | --- | --- | --- |
| Feature | Min. | Typical | Max. |
| Environmental category/UV exposure rating | NEMA Type 6/Outdoor |  |  |
| Torque specifications for fasteners(Do not over-torque) | ·6mm(1/4")mounting hardware:5Nm(45to50in-lb) |  |  |
| ·8mm(5/16")mounting hardware:9Nm(80to85in-lb) |  |  |  |
| ·When usingUL2703mounting hardware,use the manufacturer's recommended torque value |  |  |  |
| Cooling | Natural convection-No fans |  |  |
| Relative humidity range | 4% to100%(condensing) |  |  |
| Approved for wet locations | Yes |  |  |
| Pollution degree | PD3 |  |  |
| Standard warranty term | [http://enphase.com/warranty](http://enphase.com/warranty) |  |  |
| Compliance | CA Rule21(UL1741-SA),UL62109-1,IEEE1547:2018(UL1741-SB),FCCPart15ClassB,ICES-0003ClassB,CAN/CSA-C22.2NO.107.1-01This product isULListedasPVrapidshutdownequipmentandconformswithNEC2014,NEC2017,NEC2020,andNEC2023section690.12andC22.1-2018Rule64-218rapidshutdownofPVsystemsforACandDCconductorswheninstalledaccordingtomanufacturer'sinstructions. |  |  |
| Grounding | TheDCcircuitmeetstherequirementsforungroundedPVarraysinNEC.Groundfaultprotection(GFP)isintegratedintotheclassIIdouble-insulatedmicroinverter. |  |  |
| Monitoring | EnphaseInstallerPlatform和EnphaseAppmonitoringoptions.BothoptionsrequireanEnphaseIQGateway. |  |  |
| Communication | Powerline communication(PLC) |  |  |
| 1.PairingPVmoduleswithwattageabovethelimitmayresultindiculipinglosses.Seethecompatibilitycalculatorat [https://link.enphase.com/module-compatibility2.Nominalvoltagerangecanbeextendedbeyondnominalifrequiredbytheutility3.limitsmayuseRefertolocalenvironmentstodefinethenumberofmicroninvertersperbranchinyourarea](https://link.enphase.com/module-compatibility2.Nominalvoltagerangecanbeextendedbeyondnominalifrequiredbytheutility3.limitsmayuseRefertolocalenvironmentstodefinethenumberofmicroninvertersperbranchinyourarea) |  |  |  |

1
Pairing PV modules with wattage above the limit may result in additional clipping losses. See the compatibility calculator at
[https://link.enphase.com/module-compatibility](https://link.enphase.com/module-compatibility) .
2
Nominal voltage range can be extended beyond nominal if required by the utility.

8.6 IQ8H-208-72-2-US Microinverter specifications

3
Limits may vary. Refer to local requirements to define the number of microinverters per branch in your area.

2
Nominal voltage range can be extended beyond nominal if required by the utility.
3
Limits may vary. Refer to local requirements to define the number of microinverters per branch in your area.

NOTE: The IQ8H-208 variant will be operating in grid-tied mode only at 208V AC.

* * *

| Parameter | Units | Min. | Typical | Max. |
| --- | --- | --- | --- | --- |
| Commonly used modules for pairing¹ | - | 295 W–500 W |  |  |
| Peak power tracking voltage | V | 36 | - | 45 |
| Operating voltage range | V | 16 | - | 58 |
| Maximum input DC voltage | V | - | - | 60 |
| Minimum/Maximum start voltage | V | 22 | - | 58 |
| Max. continuous input DC current | A | - | - | 12 |
| Max. input DC short-circuit current | A | - | - | 25 |
| Max. module lsc | A | - | - | 20 |
| Overvoltage class DC port | - | - | II | - |
| DC port backfeed under single fault | A | - | - | 0 |
| PV array configuration | 1×1 ungrounded array; no additional DC side protection required; AC side protection requires a maximum of 20 A per branch circuit |  |  |  |
| AC parameters |  |  |  |  |
| Parameter | Units | Min. | Typical | Max. |
| Peak output power | VA | 366 |  |  |
| Maximum continuous AC output power | VA | 360 |  |  |
| Power factor (adjustable) | - | 0.85 leading ... 0.85 lagging |  |  |
| Nominal AC output voltage range² 208 VAC | Vrms | 183 | - | 229 |
| Max continuous output current | Arms | - | 1.73 | - |
| Nominal frequency | Hz | - | 60 | - |
| Extended frequency range | Hz | 47 | - | 68 |
| Maximum AC output over current protection device | A | 20 |  |  |
| AC short circuit fault current over three cycles | Arms | 4.4 |  |  |
| High AC voltage trip limit accuracy | % | ±1.0 | - | - |
| Low AC voltage trip limit accuracy | % | ±1.0 | - | - |
| Frequency trip limit accuracy | Hz | ±0.1 | - | - |
| Trip time accuracy (for trip times or delays <5 sec.) | ±ms | - | - | 33 |
| Trip time accuracy (for trip times or delays >=5 sec.) | % | - | - | 1 |
| Overvoltage class AC port | - | - | III | - |

$$
I \_ {\\mathrm {s c}}
$$

AC parameters

$$
V \_ {\\mathrm {r m s}}
$$

$$
A \_ {\\mathrm {r m s}}
$$

* * *

| AC parameters |  |  |  |  |
| --- | --- | --- | --- | --- |
| Parameter | Units | Min. | Typical | Max. |
| AC port backfeed current | mA | 30 |  |  |
| Power factor setting | - | - | 1.0 | - |

Miscellaneous parameters

| Parameter | Units | Min. | Typical | Max. |
| --- | --- | --- | --- | --- |
| Maximum 4 microinverters per 20 A(max) AC branch circuit 208VAC3 | - | - | - | 9 |
| CEC weighted efficiency 208VAC | % | - | - | 97 |
| Total harmonic distortion | % | - | - | <5 |
| Ambient temperature range | ℃ | -40 | - | 60 |
| Nighttime power consumption | mW | - | - | 15 |
| Storage temperature range | ℃ | -40 | - | 85 |

$$
\\mathrm {V A C} ^ {3}
$$

$$
^{\\circ} \\mathrm {C}
$$

$$
^{\\circ} \\mathrm {C}
$$

Features and specifications

| Feature | Min. | Typical | Max. |
| --- | --- | --- | --- |
| Compatibility | To meet compatibility, PV modules must be within the following maximum input DC voltage and maximum module $I\_{\\mathrm{sc}}$. Module compatibility can be checked at [https://enphase.com/installers/microinverters/calculator](https://enphase.com/installers/microinverters/calculator). |  |  |
| Dimensions not including mounting bracket | 212mm(8.3")x175mm(6.9")x30.2mm(1.2") |  |  |
| Connector type | Enphase IQ Connector |  |  |
| Weight | 1.08kg(2.38lb) |  |  |
| Environmental category/UV exposure rating | NEMA Type 6/outdoor |  |  |
| Torque specifications for fasteners(Do not over-torque) | 6mm(1/4")mounting hardware:5Nm(45to50in-lb)8mm(5/16")mounting hardware:9Nm(80to85in-lb)When usingUL2703mounting hardware,use the manufacturer's recommended torque value |  |  |
| Cooling | Natural convection-No fans |  |  |
| Relative humidity range | 4% to100%(condensing) |  |  |
| Approved for wet locations | Yes |  |  |

* * *

| Features and specifications |  |  |  |
| --- | --- | --- | --- |
| Feature | Min. | Typical | Max. |
| Pollution degree | PD3 |  |  |
| Standard warranty term | [http://enphase.com/warranty](http://enphase.com/warranty) |  |  |
| Compliance | CA Rule 21(UL 1741-SA),UL 62109-1,IEEE1547:2018(UL 1741-SB),FCC Part 15 Class B,ICES-0003 Class B,CAN/CSA-C22.2NO.107.1-01This product is UL Listed as PV rapid shutdown equipment and conforms with NEC 2014,NEC 2017,NEC 2020,and NEC 2023 section 690.12andC22.1-2018Rule 64-218 rapid shutdown of PV systems for AC and DC conductors when installed according to manufacturer's instructions. |  |  |
| Grounding | The DC circuit meets the requirements for ungrounded PV arrays in NEC.Ground fault protection(GFP)is integrated into the class II double-insulated microinverter. |  |  |
| Monitoring | Enphase Installer Platform and Enphase App monitoring options.Both options require an Enphase IQ Gateway. |  |  |
| Communication | Power line communication(PLC) |  |  |

1
Pairing PV modules with wattage above the limit may result in additional clipping losses. See the compatibility calculator at
[https://link.enphase.com/module-compatibility](https://link.enphase.com/module-compatibility) .
2
Nominal voltage range can be extended beyond nominal if required by the utility.

8.7 IQ Cable specifications

| Specification | Value |
| --- | --- |
| Voltage rating | 600V |
| Voltage withstand test(kV/1min) | AC3.0 |
| Max DC conductor resistance(20℃)(Ω/km) | 5.433 |
| Insulation resistance(20℃) | ≥20M(Ω/Km) |
| System temperature range(ambient) | -40℃to65℃(-40Fto149F) |
| Cable temperature rating | 90℃Dry/90℃Wet |
| Cable rating | DG |
| Certification | UL3003,TC-ER equivalent |
| Flame test rating | FT4 |

Nominal voltage range can be extended beyond nominal if required by the utility.
Limits may vary. Refer to local requirements to define the number of microinverters per branch in your area.

$$

- 4 0 ^ {\\circ} C
  $$

$$
9 0 ^ {\\circ} \\mathrm {C}
$$

* * *

| Specification | Value |
| --- | --- |
| Cable conductor insulator rating | THHN/THWN-2 |
| Environmental protection rating | IEC 60529 IP67NEMA 6 |
| UV resistance | 720h |
| Compliance | RoHS,OIL RES I,CE,UV resistant,combined UL for Canada and the United States |
| Conductor size | 12AWG |
| Maximum loop size | 12cm(4.75") |
| Flat cable dimensions | 6mmx9.5mm(0.2"x0.37") |
| Sealing cap dimensions | 38.6mmx20mm(1.5"x0.7") |
| Cable connector dimensions | 20mmx1.1mmx6.5mm(0.7"x0.04"x0.25") |

8.8 Enphase connector ratings

Enphase connectors on the cable assemblies in the following table have a maximum current of 20 A, a
maximum OCPD of 20 A, and a maximum ambient temperature of –40° to 79° C (–40° to 174.2° F) and
are rated for disconnection under load.

| Part number | Model | Maximum voltage |
| --- | --- | --- |
| 840-00387 | Q-12-10-240 | 277VAC |
| 840-00388 | Q-12-17-240 | 277VAC |
| 840-00389 | Q-12-20-200 | 277VAC |
| 840-00385 | Q-DCC-2 | 100VDC |
| 840-00386 | Q-DCC-5 | 100VDC |

* * *

9. Enphase installation map

To Sheet / A la hoja de:

| Panel Group/Grupo de los paneles: Azimuth/Azimut: Tilt/inclinación: Sheet/Hoja of/de |  | Customer/Cliente: |  |  | Installer/Instalador: |  |  | N SEW NSEO |
| --- | --- | --- | --- | --- | --- | --- | --- | --- |
|  | 1 | 2 | 3 | 4 | 5 | 6 | 7 |  |
| A |  |  |  |  |  |  |  |  |
| B |  |  |  |  |  |  |  |  |
| C |  |  |  |  |  |  |  |  |
| D |  |  |  |  |  |  |  |  |
| E |  |  |  |  |  |  |  |  |
| F |  |  |  |  |  |  |  |  |
| G |  |  |  |  |  |  |  |  |
| H |  |  |  |  |  |  |  |  |
| J |  |  |  |  |  |  |  |  |
| K |  |  |  |  |  |  |  |  |
| L |  |  |  |  |  |  |  |  |
| M |  |  |  |  |  |  |  |  |
| Scan the completed map and upload it to Enphase. Click "Add a New System" at [https://enlighten.enphaseenergy.com](https://enlighten.enphaseenergy.com/). Use this map to build the virtual array in Enlighten's Array Builder. / Escanee el mapa completo y cálguelo en Enphase. Haga clic en "Añadir nuevo sistema" en [https://enlighten.enphaseenergy.com](https://enlighten.enphaseenergy.com/). Utilice este mapa para crear el conjunto de paneles virtual en el Creador de conjuntos de paneles de Enlighten. |  |  |  |  |  |  |  |  |

To Sheet / A la hoja de: \_\_\_\_\_

* * *

10. Sample wiring diagram

* * *

11. Revision history

| Revision | Date | Description |
| --- | --- | --- |
| IOM-00068-2.0 | December 2024 | Updated information on backward compatibility with IQ7 Series Microinverters. |
| IOM-00068-1.0 | January 2024 | Updated microinverter specifications. |

Previous releases.