# A Performance and Economic Analysis of Distributed Power

# Electronics in Photovoltaic Systems

## Chris Deline and Bill Marion

_National Renewable Energy Laboratory_

## Jennifer Granata and Sigifredo Gonzalez

_Sandia National Laboratories_

**NREL is a national laboratory of the U.S. Department of Energy, Office of Energy** **Efficiency & Renewable Energy, operated by the Alliance for Sustainable Energy, LLC.** **Technical Report** **NREL/TP-5200-50003** **January 2011** Contract No. DE-AC36-08GO28308

* * *

A Performance and Economic
Analysis of Distributed Power
Electronics in Photovoltaic
Systems

Chris Deline and Bill Marion
National Renewable Energy Laboratory

Jennifer Granata and Sigifredo Gonzalez
Sandia National Laboratories

Prepared under Task No. PVD9.1410

NREL is a national laboratory of the U.S. Department of Energy, Office of Energy
Efficiency & Renewable Energy, operated by the Alliance for Sustainable Energy, LLC.

National Renewable Energy Laboratory
1617 Cole Boulevard
Golden, Colorado 80401
303-275-3000 • [www.nrel.gov](http://www.nrel.gov/)

Technical Report
NREL/TP-5200-50003
January 2011

Contract No. DE-AC36-08GO28308

* * *

**NOTICE**

This report was prepared as an account of work sponsored by an agency of the United States government. Neither the United States government nor any agency thereof, nor any of their employees, makes any warranty, express or implied, or assumes any legal liability or responsibility for the accuracy, completeness, or usefulness of any information, apparatus, product, or process disclosed, or represents that its use would not infringe privately owned rights. Reference herein to any specific commercial product, process, or service by trade name, trademark, manufacturer, or otherwise does not necessarily constitute or imply its endorsement, recommendation, or favoring by the United States government or any agency thereof. The views and opinions of authors expressed herein do not necessarily state or reflect those of the United States government or any agency thereof.

Available electronically at [http://www.osti.gov/bridge](http://www.osti.gov/bridge)

Available for a processing fee to U.S. Department of Energy and its contractors, in paper, from:

U.S. Department of Energy Office of Scientific and Technical Information
P.O. Box 62 Oak Ridge, TN 37831-0062 phone: 865.576.8401 fax: 865.576.5728 email: mailto: [reports@adonis.osti.gov](mailto:reports@adonis.osti.gov)
Available for sale to the public, in paper, from:

U.S. Department of Commerce National Technical Information Service 5285 Port Royal Road Springfield, VA 22161 phone: 800.553.6847 fax: 703.605.6900 email: [orders@ntis.fedworld.gov](mailto:orders@ntis.fedworld.gov) online ordering: [http://www.ntis.gov/help/ordermethods.aspx](http://www.ntis.gov/help/ordermethods.aspx)
Cover Photos: (left to right) PIX 16416, PIX 17423, PIX 16560, PIX 17613, PIX 17436, PIX 17721

Printed on paper containing at least 50% wastepaper, including 10% post consumer waste.

* * *

## Table of Contents

Executive Summary ... 1
Introduction ... 1
Background — Partial Shading and Mismatch Losses ... 3
DC-DC Converter Deployment and Topologies ... 5
General Benefits of Distributed PV Power Electronics ... 7
Particular Concerns for Systems Using Distributed PV Electronics ... 8
Performance Analysis of Various DC-DC Topologies ... 9
Qualitative Economic Analysis of Expected Applications ... 12
Summary ... 13
Acknowledgments ... 13
References ... 14
Additional Bibliography ... 15

* * *

Executive Summary
Distributed power electronics such as micro-inverters and DC-DC converters can help reduce

Executive Summary
Distributed power electronics such as micro-inverters and DC-DC converters can help reduce
mismatch and shading losses in photovoltaic (PV) systems. Under partially shaded conditions,
the use of distributed power electronics can recover between 10%–30% of annual performance
loss or more, depending on the system configuration and type of device used. Additional valueadded features may also increase the benefit of using per-panel distributed power electronics;
these include increased safety, reduced system design constraints, and added monitoring and
diagnostics. The economics of these devices will also become more favorable as production
volume increases and integration within the solar panel’s junction box reduces part count and
installation time. Some potential liabilities of per-panel devices include increased PV system
cost, additional points of failure, and an insertion loss that may or may not offset performance
gains under particular mismatch conditions.

Introduction
A number of new products have come to the market in the field of distributed photovoltaic (PV)

Introduction
A number of new products have come to the market in the field of distributed photovoltaic (PV)
power electronics. This category of devices includes DC-DC converters and AC micro-inverters
that are designed to either replace or work in concert with traditional central PV inverters. Recent
improvements in the efficiency, reliability, and cost of these products have made them viable in
many applications, from small residential installations to large commercial PV arrays. The
breadth of options and claims among these various products shows that some differentiation
exists between these devices. On the other hand, all of these devices share many similar benefits
due to their distributed nature. This report intends to highlight the differences and similarities of
these technologies and to provide some analysis of their benefits to power production and system
economics.

In general, the use of power electronics at a per-module or per-PV string basis can reduce the
impact of module mismatch and partial shading. A traditional central inverter will have only a
few (typically one and rarely two or more) input channels that independently track the maximum
power point (MPP) of the PV system. With large utility-scale inverters reaching up to half a
megawatt (MW) in size, over 5,000 individual PV panels could potentially operate at one
common peak power point. A reduction in the output power of one or more of these PV panels
can lead to mismatch in the maximum power point between the various PV modules and strings.
Possible causes of MPP mismatch include partial shading, soiling from dust, debris, and bird
droppings, and module physical degradation. The impact of partial shading and mismatch can be
reduced by increasing the number of independent MPP tracking channels in the PV system. The
improvement from distributed MPP tracking depends on the amount of mismatch throughout the
system, the size and configuration of the system, and the characteristics of its PV modules,
among other factors.

* * *

match the optimum voltage requested by the central inverter. Many currently available solar DC-
DC converters use a separate enclosure for the power electronics at each panel, typically attached
to the PV module frame or rack. Newer proposed versions of this technology involve partnering
with PV module manufacturers to integrate the DC-DC electronics directly into the PV panel
junction box. This convergence produces a so-called “smart junction box” or “smart panel” that
provides some cost and labor savings over separate panel and power electronics.

Another type of distributed PV electronics is the AC micro-inverter. While this technology made
an appearance a decade ago as an integrated AC module, cost and reliability issues prevented the
technology’s widespread adoption. The current generation of micro-inverter products appears to
be achieving greater market penetration through improved efficiency, reduced cost, increased
reliability, and diagnostic capabilities. AC micro-inverters are installed on each PV module,
replacing the use of a central inverter. Each PV panel’s DC power is converted directly to AC
120 V or 240 V and grid-tied. The output of each PV panel is therefore effectively in parallel,
which eliminates power losses due to module mismatch. Thus the performance improvements
that arise from independently peak-power tracking PV modules can be achieved with microinverters as well as with DC-DC converters. An additional benefit to micro-inverters compared
with DC-DC devices is the reduction in DC balance of system components, including the central
inverter. Also, voltages tend to be lower with micro-inverter systems, which could be a safety
benefit for rooftop systems. Figure 1 shows some example topologies for per-panel microelectronics, including DC-DC converters and micro-inverters.

Figure 1. Schematic of conventional single-string PV system (top), DC-DC converter-equipped PV
system (middle), and AC micro-inverter-equipped PV system (bottom).

* * *

There is also interest in reducing mismatch losses in larger installations, but perhaps not at the per-panel level. One strategy is to include DC-DC converters at the string level, which can reduce voltage mismatch between parallel strings. A boost converter can also provide a higher constant voltage to the central inverter, thereby reducing resistive losses and optimizing the DC operating point of the inverter. This type of string-level DC-DC equipment can be located inside or in place of a traditional combiner box, leading to the term “smart combiner box.” An example of this layout is shown in Figure 2.

PV strings connected to a ‘smart combiner box’

Electricity Grid Inverter DC-DC DC-DC DC AC DC-DC Smart combiner box

**Figure 2. Schematic of a larger solar installation with multiple strings, each feeding into a “smart**

**combiner box.” Maximum power point tracking is provided at the string level.**

One aspect of distributed PV electronics that has yet to be addressed is the effect of their long- term reliability on the complete PV system. In general, the probability of system failure increases with each component in the system. Understanding the component-level reliability, failure modes, and effect of failure on system availability will be important in assessing the overall value of distributed PV electronics.

## Background — Partial Shading and Mismatch Losses

The impact of shade and mismatch on PV systems has previously been studied, both with and without the use of DC-DC converters or micro-inverters \[1-6\]. Due to the variety of possible string configurations and module characteristics in PV systems, it is difficult to generalize how mismatch will affect a given system. However, in most PV systems with conventional silicon panels, the presence of shade or mismatch will have a greater than proportional impact on the system’s power output. This is due to the serial nature of PV modules in strings, which creates a “Christmas tree effect” in which current reduction in one series-connected module causes mismatch losses in the rest of the string. Because of this potential for greater power losses in mismatched systems (and for hot-spot safety concerns, which are not addressed here), solar module manufacturers typically include one or more bypass diodes in their modules, usually located in the module’s junction box. The function of the bypass diode is to allow current to flow past impaired sections of a module that are unable to produce as much current as the rest of the system. To accomplish this, the module section is shorted out by the diode, producing no power of its own. This bypass condition is preferable to allowing the shaded or impaired module to reduce the current of the entire string, thereby lowering production. Since the bypass diode shorts out the partially shaded section, causing its operating voltage to fall to zero, the overall operating voltage of the PV string will be reduced accordingly; see Figures 3 and 4.

* * *

Figure 3 (left). PV modules are shown in series, each module containing 3 bypass diodes. A
bypass diode will typically protect 15-20 cells from shade and reverse bias. In this example, shade
causes diode D1 to short out its substring of cells, reducing Module 1’s voltage by one third.

Figure 4 (right). System I-V curve (red) and power \[W\] vs. voltage \[V\] curve (black) for a partially
shaded two-string PV system. The impact of shade is shown by a reduction in operating current
and MPP of the system at higher voltages. Note that under certain operating conditions, both local
maxima and global maxima can arise in the power vs. voltage curve.

If the PV system in question is only composed of a single string, there is no additional impact
due to the shaded string’s reduced voltage. However, if multiple parallel strings are present in the
system, an additional source of mismatch loss occurs: voltage mismatch between parallel strings.
In this situation, it’s the voltage—not the current—that needs to be equal between parallel strings
of PV modules. Given this constraint, the voltage of a partially shaded string must remain high,
even if bypass diodes are shorting out sections of the shaded string. This results in the MPP
tracking inverter to force unshaded modules in the affected string to operate at a higher than
optimum voltage to make up for the voltage drop from bypass diodes elsewhere in the string.
This mismatch loss causes power losses in both shaded and unshaded modules. The impact of
this voltage mismatch can range from an additional 60% power loss for unbalanced shade on
two-string systems \[5\] to an additional 400% power loss for shade covering 15%–20% of a
utility-sized PV string \[7\]. It is clear that partial shading and other mismatch sources can result in
performance losses much greater than the apparent scale of the shade itself. However, these
worst-case values are not typically seen in real installations. An analysis of a shaded residential
installation with somewhat more extensive shade than average showed a performance reduction
of 22% due to shading from neighboring trees and other elements. Of this lost power, a majority
(70%) was due to reduced irradiance and direct losses from shading. Only 30% of the power loss
was due to mismatch of current and voltage \[5\]. Therefore, the installation of DC-DC converters
or micro-inverters would improve this particular system’s annual production by roughly 7%
through the elimination of mismatch losses.

The use of distributed MPP tracking equipment can also improve system performance if the PV
panels have mismatch in their nameplate operating conditions, particularly maximum-power
current (Imp). Although nameplate values are the same for identical module model numbers, there
can be some variation from panel to panel, as manufacturers typically bin the modules in 5 W to
10 W bins. There can therefore be a 5% difference or greater between the power output of
modules with identical model numbers. This can contribute to mismatch losses between modules

The use of distributed MPP tracking equipment can also improve system performance if the PV
panels have mismatch in their nameplate operating conditions, particularly maximum-power
). Although nameplate values are the same for identical module model numbers, there
can be some variation from panel to panel, as manufacturers typically bin the modules in 5 W to
10 W bins. There can therefore be a 5% difference or greater between the power output of
modules with identical model numbers. This can contribute to mismatch losses between modules

\ (\\mathrm{I}\_{\\mathsf{m p}})

* * *

in the same string if the mismatch is between the Impof series-connected modules. Judging from
datasheets of silicon PV panels in the 200 W to 240 W range, the variation in Impwithin a single
bin is typically 2%–3%. However, this does not directly indicate that the power loss within a
series string is also 2%–3%, as seen in Figure 5. Because of the flatness of the I-V curve of a PV
panel in the neighborhood of the maximum power point, a 2.5% change in operating current near
the MPP only leads to a 0.5%–0.7% reduction in power for an average (0.72–0.74 fill factor)
module. It is this 0.5%–0.7% series current mismatch loss that could be recovered through the
installation of per-module MPP tracking equipment. Of course, not every panel in a string can
have below-average Imp, so the real mismatch loss is likely to be lower than the previously stated
limit, and efficiency losses in DC-DC devices may further reduce this benefit.

\\mathrm{I}\_{\\mathrm{m p}}

\\mathrm{I}\_{\\mathrm{m p}}

\\mathrm{I}\_{\\mathrm{m p}}

Figure 5. Power vs. current curve for a typical Si PV panel (Sharp ND-208) with fill factor = 0.71.
Note that current mismatch of 3% leads to only 0.5% power reduction.

DC-DC Converter Deployment and Topologies
Several different DC-DC converter device topologies are available for use with individual solar

DC-DC Converter Deployment and Topologies
Several different DC-DC converter device topologies are available for use with individual solar
panels, each with different strengths and operating uses. The simplest DC-DC converter uses a
single converter stage to either buck (reduce) or boost (increase) the output voltage of a PV
panel. In either case, the PV panel output voltage is MPP tracked by the control algorithm in the
device. A slightly more advanced DC-DC converter is the buck-boost converter, which uses
both buck and boost stages to allow the converter to either increase or decrease the output

DC-DC Converter Deployment and Topologies
Several different DC-DC converter device topologies are available for use with individual solar
panels, each with different strengths and operating uses. The simplest DC-DC converter uses a
single converter stage to either buck (reduce) or boost (increase) the output voltage of a PV
panel. In either case, the PV panel output voltage is MPP tracked by the control algorithm in the
device. A slightly more advanced DC-DC converter is the buck-boost converter, which uses
both buck and boost stages to allow the converter to either increase or decrease the output

both buck and boost stages to allow the converter to either increase or decrease the output
voltage of a PV panel. A list of some available DC-DC converter devices and their topologies is

voltage of a PV panel. A list of some available DC-DC converter devices and their topologies is
given in Table I.

voltage of a PV panel. A list of some available DC-DC converter devices and their topologies is

* * *

Table I. Select commercially available distributed DC-DC devices

| Company | Model | Input V | Power | Topology | Output V |
| --- | --- | --- | --- | --- | --- |
| Azuray | AP250 | 14-80V | 250W | Buck | 0-80V |
| e-IQ energy | vBoost 250 | 20-50V | 250W | Boost | 250-350V |
| Solar Edge | PB250-AOB | 5-65V | 250W | Buck/Boost | 5-60V |
| Solar Edge | PB350-TFI | 10-95V | 350W | Buck/Boost | 5-60V |
| Solar Magic | SM1230-3B1 | 30-80V | 230W | Buck/Boost | 0-86V |
| Solar Magic | SM3320 | 15-40V | 350W | Buck/Boost | 0-43V |
| ST Micro-electronics | SPV1020 | 0-36V | 100W+ | Boost† | 0-36V |
| Tigo energy | MM-ES50 | 16-48V | 300W | Buck‡ | 0-48V |
| Tigo energy | MM-EP35 | 28-42V | 280W | Boost | 375V |
| Xandex Solar | SunMizer | 15-48V | 250W | Buck | 0-48V |

† Preliminary spec, based on 3 devices per PV module.
‡Uses 'impedance matching' circuit, which is a buck converter with synchronous rectification \[8\]

‡Uses 'impedance matching' circuit, which is a buck converter with synchronous rectification \[8\]

The advantages of a buck-boost converter include an increased operating range and the ability to
correct for a greater amount of system mismatch. Since the device includes two conversion
stages rather than one, the increased flexibility may come at the cost of a slight efficiency
reduction as well as possible size and cost increases relative to single-stage devices.

In a buck-only DC-DC converter, the output voltage from a shaded panel is decreased, and the
output current is increased to match the operating current of the unshaded modules in series with
it. Because the current is boosted, there is no mismatch in current between the series-connected
modules. There is no longer any need for the shaded module’s bypass diodes to begin
conducting. Therefore, the panel equipped with the buck DC-DC converter can produce power at
a reduced level without needing the bypass diodes to conduct. This type of converter works best
in PV systems with limited mismatch, e.g., where shade or mismatch occurs only on a few PV
panels. In this case, the buck DC-DC converter is installed only on those PV panels experiencing
shade. An increase in annual production results from the partially shaded modules producing
some limited amount of power (due to the diffuse component of irradiance that is still present
even under shaded conditions) rather than no power at all. The amount of power that can be
recovered depends on how diffuse the shade is, but it may account for half or more of the
recoverable mismatch loss under certain conditions \[5\].
A boost-only DC-DC converter operates by taking the input PV voltage (typically at the

A boost-only DC-DC converter operates by taking the input PV voltage (typically at the
maximum power voltage of the particular panel) and increasing it. This type of system is
typically designed with every PV panel in the system equipped with a boost converter. In some
systems, the converter boosts the voltage to a high constant value (~300 Vdc –550 Vdc), and all
of the panels are placed in parallel. System mismatch is eliminated here because each panel
contributes current proportional to the amount of irradiance it receives. This system will work
even with panels facing different directions, or at different tilt angles, because all of the
converters are placed in parallel. The high constant-output voltage from the boost converter is
chosen to maximize the efficiency of a fixed-input voltage inverter connected to the output of the converters. Another similar style of boost system places 10 to 20 of the PV modules and
converters in series to achieve the high constant voltage of the inverter’s DC input. In this
system, the amount of voltage boost is reduced for each converter, possibly improving its
efficiency or durability. Both of these boost converter systems can allow for mismatched module
tilt and orientation—and even mismatched module size, brand, or technology (to a point). If
multiple parallel strings are present, they can also be of different lengths within the input range
of the fixed-input inverter.

A system using buck-boost converters enjoys most of the benefits of both buck and boost
converters. For instance, if shade is limited to only a few modules in the system, a buck-boost
converter can be selectively installed on only the affected modules, and it will operate in buck
mode to reduce the current mismatch between shaded and unshaded modules. Also, if the PV
system includes modules of different size, power rating, or orientation, a buck-boost converter
can be placed on every module in the series string, allowing for differences in the various
module power outputs. If parallel strings are of different lengths, buck-boost converters on the
shorter string will increase the operating voltage of the string to match the other longer strings.
Buck-boost converters can also be used with specialized fixed-input-voltage inverters that
operate at a constant high input voltage. Because the converters can also buck the output voltage,
they are also compatible with conventional input voltage inverters, which operate at a lower,
variable voltage.

In addition to per-module DC-DC converters, which account for the majority of products
currently available, other converter deployments are possible. On larger utility-scale arrays, perstring MPP tracking places the power electronics at the end of each series string. On a smaller
scale, MPP tracking can be accomplished with three or more independent channels per module—
requiring access to the interconnection tabs within the PV panel. The benefit of finer (or coarser)
MPP tracking resolution depends on the scale of mismatch within the system, balanced by the
increased cost and complexity of additional MPP tracking channels.

General Benefits of Distributed PV Power Electronics
As stated above, there can be performance benefits to using per-panel distributed DC-DC and

As stated above, there can be performance benefits to using per-panel distributed DC-DC and
micro-inverter products based on the reduction in panel current and voltage mismatch. These
advantages are primarily realized in residential and commercial installations, where localized
shading and possible orientation mismatch are more common. Additional benefits include greater
flexibility in system design and reduced time to engineer PV panel placement in complicated
rooftop designs. This can lead to lower levelized cost of energy (LCOE) and possible reduction
in balance of systems (BOS) wiring cost in the case of boost converters that operate at higher
voltage and lower current, or micro-inverters that do not require string combiner boxes.

* * *

In the case of micro-inverters, one specific value-added benefit is the elimination of the singlepoint failure of a central inverter. It is possible that individual independent power conversion
devices might require more individual replacements, but since a single micro-inverter failure
does not cause the entire system to fail, power reduction during a single failure is limited to the
power of a single module. This advantage is balanced by the generally more difficult
replacement of a micro-inverter on a rooftop underneath PV panels when compared with a
typical wall-mount central inverter in a more easily accessible location. The overall lifetime of
current micro-inverter products is also difficult to compare with central inverters, as these microinverters have not been available long enough to obtain field lifetime results.

The safety aspects of certain distributed products may also influence their adoption. In
conventional residential rooftop applications, a particular safety concern is the presence of high
DC voltages (up to 600 V) even when the AC and DC disconnect are thrown. This can cause
issues such as arc-fault damage to modules in the case of an internal module failure, and rescue
personnel could be exposed to high voltage in the event of a rooftop fire. In the case of AC
micro-inverters, these issues are mitigated because the system is de-energized when the AC
disconnect is thrown. The available DC voltage is limited to that of a single module, which is
considered benign. This arc-fault safety concern may also be mitigated by the use of per-module
DC-DC converters, although further system tests would be required to verify this safety benefit.

Particular Concerns for Systems Using Distributed PV Electronics
The inclusion of distributed PV electronics in a system may give rise to additional concerns or

Particular Concerns for Systems Using Distributed PV Electronics
The inclusion of distributed PV electronics in a system may give rise to additional concerns or
considerations for the system design or operation. For instance, the input voltage and current
range of a given converter may require the use of a limited set of compatible PV panels. Also,
the inverter that is used with a particular set of DC-DC converters might need to be specific,
based on the output voltage of the converter and the MPP tracking algorithm of the string
inverter. Certain combinations of inverter and DC-DC converter have been shown to lead to
inverter input voltage instability because both the output voltage of the converters and the input
voltage of an inverter are variable. This condition has been observed during testing at both the
National Renewable Energy Laboratory and Sandia National Laboratories using different DC-
DC converter/inverter combinations. This particular condition may be mitigated by ensuring that
at least one parallel string of PV panels is not equipped with DC-DC converters. This provides a
stable input voltage for the inverter to track, with the parallel DC-DC converter-equipped strings
matching this operating voltage. It may also be possible to work with equipment manufacturers
to optimize the MPP tracking algorithms and DC-DC converter set point to improve stability.
Output stability issues are typically discussed in a device’s operation manual. Another similar
consideration is whether the manufacturer requires a blocking diode in series in which each PV
string is equipped with DC-DC converters.

Regarding reliability, there is not yet enough field data nor independently measured accelerated
testing to confidently assess the lifetime of these distributed power electronics. Currently, limited
warranties are offered on some products for 15 to 25 years, with the longer warranties being
offered on DC-DC converter products. This reflects the conventional wisdom that microinverters contain more life-limiting parts and also intertie to the grid, which exposes devices to
power-surge induced failures. In general, the warranties and expected lifetime for distributed
products are at least as good as those for traditional central inverters and are approaching the
lifetimes of the PV modules with which they are seeking to become integrated. One aspect of distributed PV electronics that has yet to be addressed is the effect of their long-term reliability
on the complete PV system. In general, the probability of system failure increases with each
component in the system. Understanding the component-level reliability, failure modes, and
effect of failure on system availability will be important in terms of assessing the overall value of
using distributed PV electronics. Despite these predictions of long service life, it is possible that
the product could last longer than the manufacturer is able to replace or support it. Indeed, in the
past year several product lines have been discontinued, with additional culling anticipated. In this
climate, it is wise to evaluate the product’s interoperability with other similar products as well as
what might happen if support is no longer available for a particular product in the future. For
example, buck-only DC-DC converters that are installed on only a few PV panels in a system
could be freely replaced with other buck-only or buck-boost converters. However, boost
converters using a specialized central inverter might require identical replacement parts, leaving
the system owner exposed to possible obsolescence risk. Similarly, micro-inverter interoperability may not be possible due to incompatible electrical connectors and in certain cases the
use of proprietary powerline modem communications. In this case, a separate AC branch circuit
would be required for the replacement micro-inverter device(s).

Performance Analysis of Various DC-DC Topologies
Computer simulations were conducted of a variety of shade conditions and DC-DC converter

Computer simulations were conducted of a variety of shade conditions and DC-DC converter
deployments. It is difficult to account for every possible system configuration and mismatch
condition, so a few example situations were considered. Three different “typical residential
installations” were simulated, all based on an actual residential installation described in \[5\]. The
residential installation is a 3-kW roof-mounted PV system with 14 mc-Si modules (Sharp ND-
208s). The system is modeled either as a single-string installation or two parallel strings. The
shading on the system is somewhat more extensive than average, with an annual irradiance
reduction of 20% as measured by a detailed site survey. A reduced shading condition is
considered as well, in which the annual irradiance loss due to shade is only 10%, concentrated
entirely on one of the two strings.

In addition to the residential rooftop shading simulations, larger systems with inter-row shading
were also considered. For these systems, it was assumed that rows are spaced such that 3% of the
annual irradiance is lost due to inter-row shading. This value is consistent with industry practice
to optimize the roof or land utilization of a PV installation. Sharp ND-208 PV modules were
assumed for this simulation case as well. A ground coverage ratio of 0.54 and a module tilt of
o
18.5 are assumed. Modules are oriented in landscape, with two modules stacked vertically and
eight modules horizontally per row, shown in Figure 6. A total of ten rows are simulated in the
commercial (33 kW) case.

18.5^{0} o
Figure 6. Commercial row-row shading example with 18.5 tilt and 0.54 ground coverage ratio. The
modules are stacked two high and eight wide for a total string length of 16. Ten strings are placed
in parallel (figure courtesy of DOE/NREL’s Solar Advisor Model).

18.5^{\\circ}

To predict the performance gains from the use of distributed electronics, substring-level I-V
curves were calculated and summed based on the predicted irradiance and shade on a given
module substring. The performance of the DC-DC converter was modeled by a constant power
curve, as discussed in \[9\]. DC-DC converter efficiency was set equal to 0.99 for all devices. This
was done partly because detailed efficiency data for the different devices were unavailable, and
also because the DC-DC efficiency loss will partly be offset by mismatch from soiling, aging,
and manufacturer distribution of PV panels, which are all mismatch terms neglected in this
simulation. Annual performance data is produced using the PVWatts engine \[10\], modified to
allow for reduced irradiance due to partial shade. TMY3 meteorological data is used for Boulder,
Colorado. The simulation results are provided below in Table II.

Table II. Annual performance of four PV systems, different DC-DC configurations\*

|  | No DC-DC device | Buck DC-DC on all panels | Buck/Boost DC-DC on all panels | Per-string DC-DC |
| --- | --- | --- | --- | --- |
| Rooftop system,1 string.20% shaded.Unshaded annual production:4051kWh |  |  |  |  |
| Annual energy: | 3376kWh | 3440kWh | 3440kWh | 3349kWh |
| Power lost to shade: | -17% | -15% | -15% | -17% |
| Shade loss recovered: | N/A | 10% | 10% | -4% |
| Rooftop system,2 strings.20% shaded.Unshaded annual production:4051kWh |  |  |  |  |
| Annual energy: | 3310kWh | 3427kWh | 3437kWh | 3364kWh |
| Power lost to shade: | -18.3% | -15.4% | -15.1% | -17% |
| Shade loss recovered: | N/A | 16% | 17% | 7% |
| Rooftop system,2 strings.Shade on one string only.Unshaded production:4051kWh |  |  |  |  |
| Annual energy: | 3646kWh | 3693kWh | 3712kWh | 3682kWh |
| Power lost to shade: | -10.0% | -8.8% | -8.4% | -9.1% |
| Shade loss recovered: | N/A | 12% | 16% | 9% |
| Commercial system,10 strings.3% shaded.Unshaded annual production:46.3MWh |  |  |  |  |
| Annual energy: | 44.9MWh | 44.5MWh | 44.5MWh | 44.2MWh |
| Power lost to shade: | -3.1% | -3% | -3% | -3.6% |
| Shade loss recovered: | N/A | 1% | 2% | -17% |
|  | NoDC-DCdevice | BuckDC-DCon all panels | Buck/BoostDC-DCon all panels | Per-stringDC-DC |

- DC-DC device efficiency = 0.99. Soiling, aging and distribution mismatch are neglected.

* * *

For these particular installations, the presence of shade led to performance losses of 3%–18%.

The addition of DC-DC converters with MPP tracking led to a recovery of 10%–20% of the
annual loss due to partial shade, with more gain coming from systems with more parallel strings
and greater amount of shade.

The above simulation results and additional results from literature are summarized in Table III
below:

Table III. Sources of mismatch loss cited in the literature

| Type of mismatch | System loss (est) | Potential DC-DC gain\* | Ref |
| --- | --- | --- | --- |
| Residential roof shade, 1 string | 5-15% | +15-20% of loss | \[5\] |
| Residential rooftop tree shading - multiple strings | 5-20% | +20-30% of loss | \[5\] |
| Residential rooftop, pole shading - multiple strings | 4-8% | +40-70% of loss | \[6\] |
| Commercial system with inter-row shading | 1-5% | +0% of loss\*\* | \[Table II\] |
| Residential orientation mismatch within a string | 1-20% | ~100% of loss | \[11\] |
| Imp distribution mismatch | 0.2-1% | ~100% of loss | \[Fig.4\] |
| Soiling-CA and Southwest US | 1.5-6.2% | +15-40% of loss | \[12\] |

- For typical cSi PV panels and per-panel DC-DC devices, not accounting for device efficiency and insertion loss
  \\*\\* In this simulation, the small amount of inter-row shading was not enough to benefit from DC-DC devices when
  device efficiency is accounted for.

* * *

Qualitative Economic Analysis of Expected Applications
The relative benefit of distributed PV electronics depends on the system configuration, the

The relative benefit of distributed PV electronics depends on the system configuration, the
amount of current and voltage mismatch within the system, and the cost of the PV electronics. A
greater performance improvement could support a greater equipment cost. In some cases, the
system is limited by the available space, and performance improvement is sought above all other
considerations. In other cases, there is available space to include additional PV panels, and the
increased performance provided by distributed power electronics must be compared with the
alternative of including additional solar panels to increase production.

In general, distributed power electronics manufacturers seek to reduce installation time and
component expense by integrating directly with PV panels inside the junction box. This also
streamlines distribution channels, but effectively commoditizes the “smart junction box” which
may prevent the electronics manufacturer from differentiating. PV module manufacturers will
likely push for more uniformity and interoperability, in addition to demanding lower margins for
junction box electronics. This model of pre-integrated power electronics—which stands a chance
to reduce component costs enough to become cost-competitive on a $/W basis—works best with
new rooftop installations that include the power electronics on every panel. The compatible
technologies include micro-inverters, high-voltage boost converters, and buck-boost DC-DC
converters. In the case of buck DC-DC converters which are intended for installation on only a
few PV panels experiencing isolated shade, using a module-integrated “smart junction box” may
not make the most sense, as the amount of shade and power loss may not be apparent until after
the system is installed. Buck converters may work the best as a standalone retrofit device, similar
to the first-generation DC-DC converters available now. However, one advantage of selective
installation on only a few modules is that performance improvement can be achieved with a
much lower part count (and cost) than installing the converter devices on each module in a
string. This configuration also minimizes reliability risks based on part count. Another
application that may warrant the use of either the pre-integrated or standalone retrofit DC-DC
converters could be an expansion of an existing PV installation. If the existing central inverter
were oversized, using DC-DC converters could allow mismatched modules to be included into
the existing array, even if the existing array’s modules are no longer manufactured.
Alternatively, a separate AC branch circuit could be supplied to micro-inverters to increase the
capacity of an existing PV array.

In the case of larger PV installations 100 kW or greater, the prospect of per-module power
electronics is limited. This is because the uniformity of such large installations is usually better
than on a residential or commercial warehouse rooftop. Also, the additional part count,
monitoring and installation time, and desire to reduce levelized cost of electricity is a
disadvantage to per-module power electronics in large installations. In the case of isolated
shading from nearby obstructions, individual modules could be fitted with retrofit buck or buckboost DC-DC converters. If there is some nonuniformity on a per-string basis—for instance, if
the installation is on rocky or otherwise un-level ground—there could be an advantage to using
per-string MPP tracking. This technology can be integrated into the equivalent of the existing
DC combiner boxes, so no additional installation or part count is required. In the case of boost
DC-DC converters, higher DC voltages between the combiner box and the inverter can lead to
2
reduced I R wire losses or lower wiring cost. Also, the central inverter can be designed to
operate at a fixed high voltage, further reducing complexity and cost. In certain applications, this

\\mathrm{I^{2}R} technology may be cost effective, particularly if the benefit of per-string monitoring is included, with its concomitant improvement in system up-time and reduced O&M costs.

**Summary** Distributed power electronics have the potential to reduce PV performance loss due to partial shade and mismatch. Depending on the mismatch condition and system size, a variety of products are available to help improve system performance. The benefits of per-module power electronics are greatest for multi-string residential installations with close-in shade obstructions or mismatch from orientation or panel size. Value-added features of some devices include performance monitoring and emergency power-off, which may assist in market penetration, along with reduced cost through integration within PV panels’ junction boxes. While the performance aspects of these distributed electronics can be assessed, it is still unclear what effect the introduction of more components and complexity will have on system reliability. Larger PV installations may prefer to install string-level DC-DC equipment to achieve some of the mismatch reduction benefits of distributed power electronics without the part count and cost of per-panel electronics.

**Acknowledgments** Sandia is a multiprogram laboratory operated by Sandia Corporation, a Lockheed Martin Company, for the United States Department of Energy’s National Nuclear Security Administration under contract DE-AC04-94AL85000.

* * *

**References**

01. M. Gross, S. Martin, N. Pearsall, “Estimation of Output Enhancement of a Partially Shaded BIPV Array by the Use of AC Modules,” IEEE Photovoltaic Specialists Conference, Anaheim, CA, 1997.

02. A. Woyte, J. Nijs, R. Belmans, “Partial Shadowing of PV Arrays with Different System Configurations: Literature Review and Field Test Results,” Solar Energy 74, pp. 217-233, 2003.

03. N. Chaintreuil, F. Barruel, X. Le Pivert, H. Buttin, J. Merten, “Effects of Shadow on a Grid
    _rd_ Connected PV System,” 23 _European Photovoltaic Solar Energy Conference and Exhibition, p._ 3417, 2008.

04. C. Deline, “Partially Shaded Operation of a Grid-Tied Photovoltaic System,” IEEE _Photovoltaic Specialists Conference, Philadelphia, PA, 2009._

05. C. Deline, “Partially Shaded Operation of Multi-String Photovoltaic Systems,” IEEE _Photovoltaic Specialists Conference, Honolulu, HI, 2010._

06. S. MacAlpine, M. Brandemuehl, R. Erickson, “Analysis of Potential for Mitigation of Building-Integrated PV Array Shading Losses Through the Use of Distributed Power
    _th_ Converters,” ASME 4 _International Conference on Energy Sustainability, Phoenix, AZ, 2010._

07. C. Deline, “Characterizing Shading Losses on Partially Shaded PV Systems,” PV _Performance Modeling Workshop, Albuquerque, NM. NREL Publication PR-5200-49504._

08. B. Burger, B. Goeldi, S. Rogalla, H. Schmidt, “Module Integrated Electronics – An
    _th_ Overview,” 25 _European Photovoltaic Solar Energy Conference and Exhibition, Valencia,_ Spain, 2010.

09. P. Tsao, “Simulation of PV Systems with Power Optimizers and Distributed Power Electronics,” IEEE Photovoltaic Specialists Conference, Honolulu, HI, 2010.

10. B. Marion, M. Anderberg, “PVWatts – An Online Performance Calculator for Grid- Connected PV Systems,” ASES Solar 2000 Conference, June 16-21, 2000, Madison, WI.

11. S. MacAlpine, M. Brandemuehl, L.Linares, R. Erickson, “Effect of Distributed Power Conversion on the Annual Performance of Building-Integrated PV Arrays with Complex Roof
    _rd_ Geometries,” ASME 3 _International Conference on Energy Sustainability, San Francisco, CA,_

13. A. Kimber, L. Mitchell, S. Nogradi, H. Wenger, “The Effect of Soiling on Large Grid- Connected Photovoltaic Systems in California and the Southwest Region of the United States,” _th_ _IEEE 4 World Conference on Power Conversion, Waikoloa, HI, 2006._


* * *

## Additional Bibliography

N. Femia, et al., “Distributed Maximum Power Point Tracking of Photovoltaic Arrays: Novel Approach and System Analysis,” IEEE Transactions on Industrial Electronics 55, pp. 2610-
2621.
G. Walker, P. Sernia, “Cascaded DC-DC Converter Connection of Photovoltaic Modules,” IEEE _Transactions on Power Electronics 19, pp.1130-1139, 2004._
S. Rogalla, B. Burger, B. Goeldi, H. Schmidt, “Light and Shadow – When is MPP-Tracking at
_th_ the Module Level Worthwhile?” 25 _European Photovoltaic Solar Energy Conference,_ Valencia, Spain, 2010.

S. Vighetti, J. Ferrieux, Y. Lembeye, J. Barbaroux, “Photovoltaic Module and Shadow: Study
_th_ and Integration of a Current Balancing System,” 25 _European Photovoltaic Solar Energy_ _Conference, Valencia, Spain, 2010._

_th_

B. Sadlik, T. Wardle, V. Nebusov, L. Rubin, “PV Module with Effective Shade Protection,” 25 _European Photovoltaic Solar Energy Conference, Valencia, Spain, 2010._
H. Berger, M. Midl, A. Kaufmann, T. Sivaraman, “Module Integrated MPP Trackers: Efficiency
_th_ Comparison of Suitable Converter Topologies,” 25 _European Photovoltaic Solar Energy_ _Conference, Valencia, Spain, 2010._

N. Sridhar, D. Freeman, “Solar Module and Array Characterization under Partially Shaded
_th_ Conditions at Low and Medium Level Illumination Conditions,” 25 _European Photovoltaic_ _Solar Energy Conference, Valencia, Spain, 2010._

F. Pulvirenti, A. La Scala, D. Ragonese, K. D’Souza, “DC-DC Converters with MPPT Control
_th_ for Photovoltaic Panels,” 25 _European Photovoltaic Solar Energy Conference, Valencia, Spain,_

N. Martin, et al., “Electrical and Thermal Characterisation of PV Modules under Partial
_rd_ Shadowing,” 23 _European Photovoltaic Solar Energy Conference, Valencia, Spain, 2008._

_rd_

N. Chaintreuil, et al., “Effects of Shadow on a Grid Connected PV System,” 23 _European_ _Photovoltaic Solar Energy Conference, Valencia, Spain, 2008._

* * *

REPORT DOCUMENTATION PAGE

| REPORT DOCUMENTATION PAGE |  |  |  | Form ApprovedOMB No. 0704-0188 |  |  |
| --- | --- | --- | --- | --- | --- | --- |
| The public reporting burden for this collection of information is estimated to average 1 hour per response, including the time for reviewing instructions, searching existing data sources, gathering and maintaining the data needed, and completing and reviewing the collection of information. Send comments regarding this burden estimate or any other aspect of this collection of information, including suggestions for reducing the burden to Department of Dateneasy Executive Services and Communication Devices (0704-1183). Respondents should be aware that notwithstanding any other provision of law, no person shall be subject to any penalty for failing to comply with a collection of information if it does not display a similarity to OMB control number. |  |  |  |  |  |  |
| 1\. REPORT DATE (DD-MM-YYYY) | 2\. REPORT TYPE White Paper |  |  | 3\. DATES COVERED (From - To) January 2011 |  |  |
| 4\. TITLE AND SUBTITLE A Performance and Economic Analysis of Distributed Power Electronics in Photovoltaic Systems |  |  |  | 5a. CONTRACT NUMBER DE-AC16-08GO28308 |  |  |
| 5b. GRANT NUMBER |  |  |  |  |  |  |
| 5c. PROGRAM ELEMENT NUMBER |  |  |  |  |  |  |
|  |  |  | 5d. PROJECT NUMBER NREL/TP-5200-50003 |  |  |  |
| 5e. TASK NUMBER PVD9.1410 |  |  |  |  |  |  |
| 5f. WORK UNIT NUMBER |  |  |  |  |  |  |
| 6\. AUTHOR(S) Chris Deline and Bill Marion National Renewable Energy Laboratory Jennifer Granata and Sigifredo Gonzalez Sandia National Laboratories |  |  |  | 8\. PERFORMING ORGANIZATION REPORT NUMBER NREL/TP-5200-50003 |  |  |
| 10\. SPONSOR/MONITOR'S ACRONYM(S) NREL |  |  |  |  |  |  |
| 11\. SPONSORING/MONITORING AGENCY REPORT NUMBER |  |  |  |  |  |  |
| 7\. PERFORMING ORGANIZATION NAME(S) AND ADDRESS(ES) National Renewable Energy Laboratory 1617 Cole Blvd. Golden, CO 80401-3393 |  |  |  |  |  |  |
| 9\. SPONSORING/MONITORING AGENCY NAME(S) AND ADDRESS(ES) |  |  |  | 10\. SPONSOR/MONITOR'S ACRONYM(S) NREL |  |  |
| 11\. SPONSORING/MONITORING AGENCY REPORT NUMBER |  |  |  |  |  |  |
| 12\. DISTRIBUTION AVAILABILITY STATEMENT National Technical Information Service U.S. Department of Commerce 5285 Port Royal Road Springfield, VA 22161 |  |  |  |  |  |  |
| 13\. SUPPLEMENTARY NOTES |  |  |  |  |  |  |
| 14\. ABSTRACT (Maximum 200 Words) Distributed electronics like micro-inverters and DC-DC converters can help recover mismatch and shading losses in photovoltaic (PV) systems. Under partially shaded conditions, the use of distributed electronics can recover between 15-40% of annual performance loss or more, depending on the system configuration and type of device used. Additional value-added features may also increase the benefit of using per-panel distributed electronics, including increased safety, reduced system design constraints and added monitoring and diagnostics. The economics of these devices will also become more favorable as production volume increases, and integration within the solar panel's junction box reduces part count and installation time. Some potential liabilities of per-panel devices include increased PV system cost, additional points of failure, and an insertion loss that may or may not offset performance gains under particular mismatch conditions. |  |  |  |  |  |  |
| 15\. SUBJECT TERMS Photovoltaic system; shading; mismatch; DC-DC converter; power optimizer |  |  |  |  |  |  |
| 16\. SECURITY CLASSIFICATION OF:a. REPORT Unclassifiedb. ABSTRACT Unclassifiedc. THIS PAGE Unclassified |  |  |  |  |  | 19a. NAME OF RESPONSIBLE PERSON19b. TELEPHONE NUMBER (include area code) |

Standard Form 298 (Rev. 8/98)
Prescribed by ANSI Std. Z39.18