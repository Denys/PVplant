# Photovoltaic Shading Testbed for Module-Level Power

# Electronics

## Chris Deline

_National Renewable Energy Laboratory_

## Jenya Meydbray, Matt Donovan, and Jason Forrest

### PV Evolution Labs

**NREL is a national laboratory of the U.S. Department of Energy, Office of Energy** **Efficiency & Renewable Energy, operated by the Alliance for Sustainable Energy, LLC.** **Technical Report** NREL/TP-5200-54876 May 2012 Contract No. DE-AC36-08GO28308

* * *

Photovoltaic Shading Testbed
for Module-Level Power
Electronics

Chris Deline
National Renewable Energy Laboratory

Jenya Meydbray, Matt Donovan, and
Jason Forrest
PV Evolution Labs

Prepared under Task No. SS12.2650

NREL is a national laboratory of the U.S. Department of Energy, Office of Energy
Efficiency & Renewable Energy, operated by the Alliance for Sustainable Energy, LLC.

National Renewable Energy Laboratory
15013 Denver West Parkway
Golden, Colorado 80401
303-275-3000 • [www.nrel.gov](http://www.nrel.gov/)

Technical Report
NREL/TP -5200-54876
May 2012

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

# Table of Contents

**Abstract ... 1** **Overview ... 1** **Test Configuration and Rationale ... 2** **Direct Shading Operating Efficiency Test Procedure ... 4** **Direct Shading Analysis Procedure ... 9**
19% (Moderate) Shade Weighting ... 10
7% (Light) Shade Weighting ... 12
25% (Heavy) Shade Weighting ... 14
**Initial Test Results and Application of the Analysis Method ... 16**
Experiment Results – Table Method ... 17
Experiment Results – Normalized Method ... 19
Analysis of Additional Conditions ... 21
Inverter MPPT Errors ... 22
**Conclusion ... 23** **Acknowledgements ... 23** **References ... 24** **Additional Bibliography ... 25** **Appendix A: Light Shading Using Three Parallel Strings ... 26** **Appendix B: Moderate Shading Using Three Parallel Strings ... 27** **Appendix C: Heavy Shading Using Three Parallel Strings ... 28**

iii

* * *

# Abstract

This document describes a repeatable test procedure that attempts to simulate shading situations as would be experienced by typical residential rooftop photovoltaic (PV) systems. This type of shading test is particularly useful to evaluate the impact of different power conversion setups, including microinverters, direct current (DC) power optimizers, and string inverters, on overall system performance. The performance results are weighted based on annual estimates of shade to predict annual performance improvement. A trial run of the test procedure was conducted with a side-by-side comparison of a string inverter with a microinverter, both operating on identical 8-kW solar arrays. Considering three different shade-weighting conditions, the microinverter was found to increase production by 3.7% under light shading, 7.8% under moderate shading, and 12.3% under heavy shading, relative to the reference string inverter case. Detail is provided in this document to allow duplication of the test method at different test installations and for different power electronics devices.

# Overview

Though today’s test protocols for inverters are designed to evaluate a number of aspects of device performance, there remains a need for a standardized test procedure to judge the performance of inverters, microinverters, and other power electronic devices in sub-optimal irradiance conditions such as shading. The design of a representative test procedure is complicated by the fact that the performance benefit from including distributed power electronics will depend on the electrical configuration of the PV system in question, the extent of shade or mismatch in the system, and the type of distributed electronics under test.

This document focuses primarily on the residential rooftop market to determine representative shade conditions in which it would seem that distributed power electronics have made the greatest initial impact \[1\]. However, the market is quickly evolving for PV power electronics, and follow-on test cases could easily be considered that would be appropriate for commercial flat roof or utility-scale ground-mount PV.

In the following proposed test, we will use two side-by-side PV arrays that are otherwise identical, except for the PV power electronics. The reference array will be equipped with a standard string inverter, while the test array will be equipped with the distributed power electronics (power optimizers, microinverters, etc.) to be tested. Several dozen systematic shading conditions will be applied to both arrays, and the alternating current (AC) kWh production of both systems compared under these shaded conditions. The multiple shade performance values will be assigned a given weight, referenced to detailed site survey data that was collected for representative rooftop installations. Three “prototype” shade conditions will be simulated by different weighting conditions in this test: “light” shading (7% irradiance reduction), “moderate” shading (15%–19% irradiance reduction), and “heavy” shading (25% irradiance reduction). The resulting performance score for each shade-weighting condition could be considered an annual efficiency value, reflecting additional power output produced by the device under test (DUT) relative to the reference string inverter system. An advantage of this weighted approach is that with the same performance data, a system owner could simply apply their specific weighting parameters (determined through a shading site survey) to tailor the performance score to apply specifically to their shade conditions.

* * *

# Test Configuration and Rationale

The California Energy Commission’s (CEC) New Solar Homes Partnership has provided some details on average residential PV installations applying for rebates in California. The amount of PV required to offset an average California home’s electricity use is around 5 kW \[2\] (assuming 6–7 MWh annual consumption per residence \[3\]). Likewise, more detailed analysis of rebate applications \[4\] has shown that around 50% of applications in this program were for systems composed of two parallel strings of PV modules, and 75% were for either two or three parallel strings. The recommended size and configuration for a representative shade impact test bed would therefore be a 5–8 kW PV system consisting of two or three parallel strings of PV modules. The current PV industry standard solar module is also a 60-cell or 72-cell silicon (crystalline or poly-Si) module with a power rating between 200 W and 240 W. With the industry moving towards 6-inch silicon cells, it is likely that 60-cell modules will become more prevalent than 72-cell modules in the future. For this reason, the shading test bed was designed to consist of three parallel strings of 12 modules, with modules of 60 cells and 235 W each, for a total system size of 8.5 kW. Module fill factor is representative of modern silicon solar panels,

0.73 +/-.01. The solar panel manufacturer does not matter (in this test case the modules are Sharp NUU235), although it is important to identify the electrical configuration of bypass diodes within the system. Typical 60-cell modules include three bypass diodes in the junction box, each protecting 20 cells in series. This electrical unit (20 series cells protected by a bypass diode) is referred to here as a submodule. In order to compare the performance of two different shade or electrical configurations on the same array, it is possible to either conduct side-by-side testing on two similar arrays, or test the same array under identical irradiance and temperature conditions. Because it is easier to control (or characterize) the similarity of the equipment rather than the similarity of the weather, a side- by-side test with two identical 8-kW arrays is proposed. One array will remain a reference case with a typical string inverter, while the other array will be equipped with the distributed power electronics to be tested. An artificial shading condition will be applied identically to both arrays and the performance of both arrays compared to determine the benefit from the distributed electronics. Because some mismatch may be present in the array due to inherent manufacturer distribution, it is important to characterize the solar modules prior to installation. This may be accomplished by recognized indoor or outdoor PV characterization methods. Once the degree of mismatch in the group of modules is known, it is important to distribute the good and bad modules evenly between the two systems such that each has a similar degree of mismatch. In this case, measured module Imp should be used as a primary estimate of string level mismatch to divide modules between strings, and total string Vmp should be used to assign the strings to the two arrays. The idea is to have a similar power rating and mismatch distribution in the two arrays. The two arrays should be situated side by side in an open rack configuration near latitude tilt (between 15 and 45 degrees). Both arrays should have similar ground cover in front of them, although the type of ground cover does not matter. If vegetation is present in front of the array it should be kept close cropped so as not to interfere with measurements.

* * *

Identical string inverters should be attached to each array. As each array will be partially shaded, it is important that the maximum operating point window accept low-voltage DC input. In this test case, the reference system uses a Fronius IG Plus 100V-2 inverter (230V input minimum) and 36 Sharp NU-U235 panels. Uniform shading of up to 30% of the modules in a three-string configuration could be tolerated before minimum maximum power point tracking (MPPT) o tracking voltage limits may be reached. Module operating temperature of 45 C is assumed, which is an average operating condition. For the lower-input-voltage inverters, as much as 54% shade is tolerated on each of the three strings before the minimum DC input voltage may be reached. The choice of string inverter could cause some differences in the final calculated result of performance improvement from the use of distributed power electronics, due to differences in MPPT algorithm and input voltage window.

**Table 1. Inverter Input Voltage Minimum and Shade Extent Required to Reach That Minimum**

Inverter lower MPPT input voltage: 150V 200V 230V 250V Shading to reach input minimum\* 0.54 0.38 0.29 0.23 \*Calculation assumes 12 modules in series with Vmp = 29.4V, and a 8.5% Vmp derate from elevated ambient temperature.

Measurement of array performance should be conducted using a revenue-grade AC kWh meter with 0.2% accuracy (ANSI C12.20) and 1 Wh resolution at the output of each string inverter. If AC microinverters are under test, the kWh meter should be placed at the point of common AC connection of all of the microinverters in the array. Performance comparison will be gauged by periodic measurement of kWh production of both installations over a minimum 15-minute time period. Secondary measurements may include string-level DC measurement of voltage and current. Sample rates should be faster than 10 seconds with 1 minute averaged data recorded.

Temperature should be collected at the back of a similarly located module in each string (top row edge, bottom row middle, etc.). Plane-of-array irradiance should be monitored using a silicon photodetector, thermopile pyranometer, or reference cell. Meteorological data may be collected but is not required. Likewise, accurate irradiance data is not crucial because the performance metric compares two arrays under identical exposure conditions. Irradiance data is primarily used to determine when appropriate conditions exist to make the comparison tests.

Prior to conducting any tests using the DUT, a side-by-side comparison should be conducted on the two arrays for several days using identical string inverters. During this time, a reference 𝑊ℎ𝐴𝐶1 calibration factor 𝐶1−2= can be determined if one array’s AC watt-hours output (WhAC) 𝑊ℎ𝐴𝐶2 is greater than the other’s. The calibration factor should be monitored and calculated for 15- minute intervals throughout a typical testing day. Ideally this value will be less than 1%.

* * *

Direct Shading Operating Efficiency Test Procedure

An artificial shading condition will be applied identically to both arrays, and the relative
performance will be monitored between the reference array and the test array. The type of shade
applied and the extent of the shade to be applied has caused a good deal of discussion among
interested parties. The two basic philosophies for shading are to construct a nearby shade
obstruction such as a screen or pole in front of the array, or to apply a shading material such as
opaque masking tape or cardboard directly to parts of the array. The first approach can be called
obstruction shading, and the second approach can be called direct shading, and each has benefits
and disadvantages.

Figure 1. Example obstruction shading conditions
Source: PHOTON, November 2010.

The advantage of obstruction shading is
that it can accurately simulate certain
shade conditions and is recognized as
producing realistic conditions.

Examples of such shade are shown in
Figure 1. The downside is that the
repeatability of the shade conditions
depends on the solar angle (time of day
and year) for the length and position of
the shadow, as well as how much
diffuse irradiance is present for the
opacity of the shadow. It is
conceivable that a shading obstruction
would have to be moved throughout the
day, and moved much closer or farther
from the array in order to have similar
conditions at different times of the year.

can be simulated. The light reaching a solar module at a given fixed tilt is made up of three
independent components: sky diffuse D, beam B, and ground-reflected R \[5\]. The sum of these
components is equal to the total global irradiance G. Under obstruction-shaded conditions, B is
blocked, with the other two components remaining relatively constant. Therefore, blocking an
amount of irradiance equal to the beam component B with directly applied shading would result
in similar performance to obstruction shading. Under real-life situations, the longest shadows
and the most shading occur during the early and late parts of the day when the diffuse component
of irradiance D/G is higher. It is these somewhat diffuse conditions that we will attempt to
duplicate, even though they occur at times of the day when conditions are more variable.

Therefore, it is best to apply partial shading to the array during high-irradiance conditions (> 500
2
W/m ), blocking a fraction of the irradiance to arrive at the proper D/G ratio.

* * *

global irradiance ratio that is desired to be replicated (D/G), and the spectral uniformity should
also be good. An alternative shading method is to completely shade part of the cell, e.g., with
opaque masking tape. It has been shown that within 1%, there is no difference between
uniformly screening half of a cell’s irradiance and directly shading one half of the cell while
leaving the other half uncovered \[6\]. However, applying and removing a perforated screen
across an entire section of the PV module would be much easier than applying and removing
masking tape on a specific fraction of multiple cells.

For any location, the ratio D/G depends partly on atmospheric conditions and solar position
(Figure 2), with shade or large incidence angle increasing the relative diffuse component. The
most accurate D/G fraction to use for shading also depends on the geographic location (Figure 3)
and the extent of shade at different times of the day. In general, longer shadows with more
shading will occur when the solar zenith angle is large. As Figure 2 illustrates, the opacity of
shade should decrease with solar incidence angle, but having a variable transmittance fabric is
not likely to be practical in this test.

Figure 2. D iffuse irradiance / global (total)
irradiance vs. incidence angle at NREL.

Latitude tilt installation at spring equinox.

Figure 3. Annual irradiance cumulative
distribution function for four different U.S.
locations. Based on TMY3 weather data.

Given these above considerations, a shading screen of at least 50% opacity is suggested for these
tests. When applied during high irradiance conditions, this shading fabric will replicate 50%
diffuse conditions—corresponding to a solar incidence angle of 80 degrees, which occurs 45–60
minutes or less from sunrise/sunset (depending on location and time of year). In addition,
shadows will be at least this opaque for 70% of the power-producing day in Miami/Seattle, and
85%+ of the power producing day in Denver/Sacramento (see Figure 3). The use of a shading
screen of at least 50% opacity will also be confirmed later in this report by results showing
relatively constant performance under diffuse conditions less than D/G = 0.5 (Figure 14).

$$
85 % +
$$

* * *

Figure 4. Partial shading of a single module
should use 50% opacity filter to cover all of
a given bypass diode submodule (1/3 of the
module for 60-cell modules).

The exact methodology for shading the solar
panels is as follows. A row of modules to be
shaded are arranged in portrait configuration.

This will allow side-to-side shading to cover one
bypass-diode-protected submodule at a time. A
shading screen (e.g., McMaster-Carr P/N
87655K134) consisting of black plastic mesh with
an open area percentage of 50% is drawn from
one side of the row to the other, in 1/3 module
increments. The shading material should be
affixed to the frame of the module at the top and
bottom, or otherwise kept stationary to prevent
the shade screen from moving during a test
measurement period. The leading edge of the shade screen may need to be reinforced to keep it

measurement period. The leading edge of the shade screen may need to be reinforced to keep it
flush with the PV module and to prevent shading of the adjacent submodule. It should be noted
that shading the module in increments of 1/3 does not allow for alternate shade geometries such
as shading only a few cells in the module, or drawing the shade screen diagonally across the
module. Under many circumstances, these different shade configurations will result in identical
results if the same number of submodule bypass diodes begin conducting. With shade covering
the entire submodule, performance is less dependent on individual cell reverse-bias
characteristics, which can vary widely \[8\].

Figure 5. Transmittance measurements of three screen samples from McMaster-Carr. Black
polypropylene light-blocking mesh (P/N 88275k39) with average %T: 62%. White vinyl/ polyester
mesh (P/N 87655K11) with %T: 52%. Black vinyl/polyester mesh (P/N 87655K13) average %T: 37%.

To determine an optimal screen material, spectral measurements were taken for three mesh
materials from the distributor McMaster-Carr. The spectral transmittance (%T) of the three
screen samples is shown in Figure 5. One of the screen materials had %T less than 50%, as
required: vinyl/polyester material 87655K13 with %T = 37% and good spectral uniformity. The
other two test samples were sub-optimal for the following reasons. A second black mesh
material (polypropylene 88275K39) was too transparent, with average transmittance of 62%. A
white vinyl mesh material (vinyl/polyester 87655K11) had an average transmittance close to

* * *

50%, but %T was not constant with wavelength, which could necessitate complicated spectral
corrections. It was also considered that the transmittance of the white material may change over
time due to soiling. For the test case considered here, McMaster-Carr part number 87655K13
was used for direct shading of the PV modules.

The following table shows the measurement conditions to be made with each string’s modules
covered by the shading screen, with a given fraction of modules covered. If a fraction of a
module is covered, it should be covered in the portrait direction, in units of 1/3 for modules with
three bypass diodes. (See Figure 4). Note that for 12-module strings with three diodes per string,
that makes 36 submodules in a string. Three separate shade ratios are used, each shading a
different proportion of the three parallel strings. With single-string shading, only one of the
three strings is shaded, with the other two strings receiving zero shading. It is therefore denoted
by the shade vector n:0:0 where n is the number of shaded submodules per string, up to a
maximum of 36. The two other shade vectors used in this procedure are two-string shading
(n:n:0) and three-string shading (n:n:n). Other vectors are possible and may be taken (such as
2n:n:0, 2n:n:n or 3n:2n:n) but are not used to calculate the final performance score.

Table 2. Shade Conditions for the Direct Shading Test, Three Parallel Strings of 12 Modules Each

| Single-string(n:0:0) shading |  | Two-string(n:n:0) shading |  | Three-string(n:n:n) shading |
| --- | --- | --- | --- | --- |
| Submodules shadedn(of36) |  | Submodules shadedn(of36) |  | Submodules shadedn(/36) |
| String1 | String2,3 | String1,2 | String3 | String1,2,3 |
| 1,4,8,12,16,20,24,28,32,35 | 0 | 1,4,8,12,16,20,24,28,32,35 | 0 | 1,4,8,12,16,20,24,28,32,35 |

For each shading ratio, the same ten shading amounts n are used, for a total of 30 different
measurements, shown in Table 2. Not all of these shading conditions count equally to the final
performance score and are assigned a different weight, described in Appendices A-C.

For each of the shading conditions considered, a minimum 15-minute measurement interval is
required, taking 1-minute average data of AC kWh production. A conservative estimate for the
valid times allowed to collect data is when solar incidence angle is less than 50 degrees with
respect to the plane of array. During this time, loss terms due to transmission through the front
glass are constant. Table 3 provides the beginning and end times (standard time) for the first of
the month, assuming a Davis, California, facility with a 20 degree tilt angle and a 50 degree
incidence angle.
Table 3. Select data collection limits for Davis, California, for a PV Array at 20° Tilt, due South.

Table 3. Select data collection limits for Davis, California, for a PV Array at 20° Tilt, due South.

| Month | Start Time | Stop Time |
| --- | --- | --- |
| January | 10:17 | 14:05 |
| March | 9:26 | 15:13 |
| May | 8:35 | 15:33 |
| June | 8:31 | 15:38 |

\*50 degree incidence angle limit at the first of the month, standard time

* * *

In addition to the incidence angle criteria, data should not be used when clouds are obscuring the 2 sun, or when irradiance is below 500 W/m . As long as these conditions are met, the value of shaded performance is recorded:

𝑊ℎ𝐴𝐶(𝐷𝑈𝑇,𝑛)1 𝜂𝑠ℎ𝑎𝑑𝑒,𝑛= 𝑊ℎ𝐴𝐶(𝑟𝑒𝑓,𝑛)𝐶1−2

Where Wh\*AC(DUT,n) _is the AC watt-hours produced by the array equipped with the DUT during shade condition n, Wh_ AC(ref,n)\*is the AC watt-hours produced by the reference array during shade condition n, and C1-2is the (constant) performance correction term determined from side-by-side operation of the two arrays without any attached DUT. Each of these values is calculated over a 15-minute minimum interval, neglecting data points when shade obstructions are being changed. This value is measured for each of the 30 shade conditions listed in Table 2 and the appendices.

One final consideration deals with inverter peak-power operation. For the reference inverter to properly track the global maximum power point, the reference inverter should not be started up in a partially shaded condition. If a particular heavily shaded condition is desired, that shading condition should be arrived at gradually, giving the inverter several minutes to adjust to each subsequent operating voltage.

## Unshaded condition: A test is also conducted to monitor DUT efficiency under normal

unshaded conditions. This data is collected over a 24-hour period. The incident irradiance in 2 kWh/m /day must be greater than or equal to the annual average for that location. For Davis, 2 California, that value is 5.45 kWh/m /day. Because this measurement plays such a large part in the overall efficiency value given for the product, it would be best to move the DUT to the second array and measure operation on both arrays to account for natural variation between the two arrays. The overall unshaded efficiency is given by:

𝑊ℎ𝐴𝐶1(𝐷𝑈𝑇)+ 𝑊ℎ𝐴𝐶2(𝐷𝑈𝑇) 𝜂𝑢𝑛𝑠ℎ𝑎𝑑𝑒𝑑= 𝑊ℎ𝐴𝐶2(𝑟𝑒𝑓)+ 𝑊ℎ𝐴𝐶1(𝑟𝑒𝑓)

Where subscript 1 and 2 indicate the array number, and DUT and ref indicate equipped with and without the DUT, respectively.

* * *

# Direct Shading Analysis Procedure

The analysis of this data involves weighting each of the 30 shaded measurements and the one unshaded measurement value. Because many differences exist in different shaded installations, it is possible to determine the relative benefit of a given piece of equipment in different shade circumstances—for instance, heavily shaded, or heavily mismatched. It is proposed to account for these differences by using the same measured data, but weighting the shaded and unshaded conditions differently. For this testing protocol, three different weightings are proposed: light **shading, moderate shading, and heavy shading. These weighting conditions are derived from** the annual distribution of shade on real residential PV installations.

Site survey information was obtained from a large residential installer in California to determine the extent of shade on 66 residential PV installations \[9\]. In these measurements, a panoramic view of surrounding obstructions was taken, and the annual irradiance lost due to shade was calculated. Here, annual irradiance is defined as “Solar Access” measured by a Solmetric Suneye imaging tool \[10\]. This measurement is averaged across the installation using multiple images taken at the corners of the PV array. The annual shading losses for these various site surveys are given in Figure 6.

**Figure 6. Site survey details for 66 residential installations. Distribution best fit is log-normal with**

µ = 2.025 and σ = 1.11. The three asterisks \* indicate the three shade-weighting conditions targeted in this test.

The shading distribution closely follows a log-normal distribution, with µ = 2.03 and σ = 1.11. This means that a majority of sites have a small amount of shading, but there are still some sites with a good deal of shading. The median shading condition occurs for a system receiving 7.6% annual shade. This median shading value represents our light shading condition, and shade data from a representative installation with 7% annual shading will serve as the basis for the light shading analysis.

The second shading condition was chosen to represent moderate shading, which is estimated to occur near 15%–20% annual shading across the system. A representative PV installation with 19% annual shade is taken as the basis for the moderate shade analysis. This particular installation was chosen for analysis because it received an extensive site survey with over 30
images of shade taken across the site.

Heavy shading is taken here to mean anything greater than 20% system shading, and a
representative installation with 25.5% annual system shade was chosen to provide the basis for
the heavy shade analysis.

As the moderately shaded site had the most detailed site survey, we will begin by discussing this
site.

19% (Moderate) Shade Weighting
The residential PV system chosen as the prototype for moderate shade conditions is a 3-kW PV

The residential PV system chosen as the prototype for moderate shade conditions is a 3-kW PV
system consisting of 14 crystalline silicon PV modules in two parallel strings \[7\]. A shade site
survey was conducted over the whole system with a Solmetric SunEye imaging tool, showing
that annual irradiance loss due to shade is around 19%. The shade experienced by this PV
system is therefore somewhat more extensive than average \[11\], and it may in fact be an ideal
o
candidate to receive some form of shade mitigation device. A fish-eye 360 picture of the nearby
shade obstructions of this installation is shown in Figure 7.

Figure 7. Fish-eye photo showing surrounding obstructions (green) with sun path overlay. Annual
irradiance reduction by shade is 19%, averaged over the whole system. East-facing and westfacing obstructions are shown at the left and right of the image, respectively.

A high-density site survey was conducted on this installation, taking shading measurements at
each bypass-diode submodule in the system. This provides statistical information about shade
conditions seen at the array. This shade data was combined with TMY3 meteorological data to
obtain details on typical shade percentages, D/G ratios, and irradiance values. The histogram in
Figure 8 shows the extent of shade throughout the system. Rather than display an equal-weight
probability of shade conditions, this histogram is weighted by irradiance level, as greater shade
extent occurs during lower-irradiance times of the day (morning and evening). The impact of
shade during high-irradiance conditions is greater than shade during low-irradiance conditions,
hence the weighting by irradiance. When the histogram is weighted for irradiance at the time of
shade, the system experiences 63% of its annual irradiance under unshaded conditions. Greater
amounts of shade are increasingly unlikely, with complete string shading being only 38% as
likely as a small amount of shading.

* * *

2
Figure 8. Histogram weighted by irradiance. Unshaded portion = 1132 kWh/m ; sum of all others =
2
691 kWh/m . Unshaded fraction (irradiance weighted): 63%. Linear fit through shaded portion of
histogram is shown with black trend line. Points represent shade-weighting conditions given in
Appendix B (scaled).

$$
\\mathrm {k W h} / \\mathrm {m} ^ {2}
$$

The data in Figure 8 were plotted for overall system shading percentage, although this system
contains two parallel strings. Because the test procedure calls for three different string
weightings (single-string shade, two-string shade, and three-string shade), a histogram is shown
in Figure 9 for the irradiance-weighted distribution between three conditions in this moderately
shaded two-string PV installation. The effective shading conditions shown are equal (n:n) shade,
2:1 shade, and isolated (n:0) shade. The results show that equal shading occurs 55% of the time,
2:1 shading occurs 28% of the time, and isolated shading on just one string occurs only 17% of
the time.

Figure 9. Distribution of shade between two strings, weighted by irradiance. Results: 55% (equal
shade), 28% (2:1 shade), 17% (isolated shade).

Based on the values in Figure 8, the breakdown for weighting of the shaded and unshaded tests is
37% and 63%, respectively. The shaded weighting can be further subdivided into the three
different string-shading configurations based on Figure 9, arriving at the individual weightings
given in Table 4. Here we equate one-string shading with isolated (n:0) shading, two-string
shading with 2:1 shading, and three-string shading with equal (n:n) shading.

* * *

Table 4. Weighting Values for the Four Test Conditions; Moderate Shade-Weighting Condition
Using a Test Array with Three Parallel Strings

|  | Weight | Total % |
| --- | --- | --- |
| Unshaded | 63% | 63% |
| One-string(n:0:0) | 7% |  |
| Two-string(n:n:0) | 10% |  |
| Three-string(n:n:n) | 20% |  |
| Total Shaded |  | 37% |

Therefore, the calculation of overall device efficiency is:

$$
\\begin{array}{l} \\eta\_ {m o d e r a t e} = 0. 6 3 \\eta\_ {u n s h a d e d} + 0. 2 \\eta\_ {s h a d e, \\mathrm {t h r e e - s t r i n g}} + 0. 1 \\eta\_ {s h a d e, \\mathrm {t w o - s t r i n g}} \ + 0. 0 7 \\eta\_ {s h a d e, \\mathrm {o n e - s t r i n g}} \ \\end{array}
$$

To further subdivide the three shading tests into the 30 individual measurement conditions, we
apply a number of additional weighting functions W that can be used to create the overall
shading efficiency:

$$
\\eta\_ {s h a d e, X} = \\sum\_ {n = 1} ^ {N} W \_ {n} \\eta\_ {s h a d e, n}
$$

Where X is the particular shading test being analyzed (one-string, two-string, or three-string) and
N is the number of measurement conditions in that test. The various weighting values W are
provided in Appendix B for the moderate shading condition.

The weighting conditions in Appendix B approximate the linear fit through the shading site
survey data taken from this residential installation. These points are shown in Figure 8, scaled to
2
match the site survey data in kWh/m .

7% (Light) Shade Weighting
A second residential PV installation was chosen to represent the lightly shaded condition. A

A second residential PV installation was chosen to represent the lightly shaded condition. A
total of eight survey images were taken at this site, with an average solar access of 93% (or 7%
shade). The distribution of the shade across the system is given in Figure 10, weighted for

shade). The distribution of the shade across the system is given in Figure 10, weighted for
irradiance. The system sees much less shade than the moderately shaded system, with unshaded
conditions accounting for 82% of incident irradiance. The extent of system shade decreases
exponentially, with 1/e likelihood at 0.28 system shade fraction.

shade). The distribution of the shade across the system is given in Figure 10, weighted for
irradiance. The system sees much less shade than the moderately shaded system, with unshaded
conditions accounting for 82% of incident irradiance. The extent of system shade decreases
exponentially, with 1/e likelihood at 0.28 system shade fraction.

* * *

Figure 10. Histogram weighted by irradiance for a lightly shaded residential installation.

2 2
Unshaded conditions account for 1490 kWh/m out of 1812 kWh/m (82%). Points represent
2
Appendix A weighting conditions, scaled for kWh/m .

The site survey for this lightly shaded installation was not taken in sufficient detail to give much
information about the distribution of shade between the two parallel strings of the system.

Therefore, the division between equal-weight shade and isolated shade between the two strings is
assumed to be the same as that previously shown for the moderate shade condition (see Figure
9).

Based on the irradiance-weighted histogram of the lightly shaded installation in Figure 10, the
division between shaded and unshaded conditions is 18% and 82%, respectively. To further
subdivide the shaded conditions into one-, two-, and three-string shading, the ratios in Figure 9
are used, resulting in an overall shade weighting for the light shade condition in Table 5.

Table 5. Weighting Values for the Four Test Conditions, Light (7%) Shade-Weighting Condition

|  | Weight | Total % |
| --- | --- | --- |
| Unshaded | 82% | 82% |
| One-string(n:0:0) | 3% |  |
| Two-string(n:n:0) | 5% |  |
| Three-string(n:n:n) | 10% |  |
| Total Shaded |  | 18% |

$$
\\begin{array}{l} \\eta\_ {l i g h t} = 0. 8 2 \\eta\_ {u n s h a d e d} + 0. 1 \\eta\_ {s h a d e, \\mathrm {t h r e e - s t r i n g}} + 0. 0 5 \\eta\_ {s h a d e, \\mathrm {t w o - s t r i n g}} \ + 0. 0 3 \\eta\_ {s h a d e, \\mathrm {o n e - s t r i n g}} \ \\end{array}
$$

* * *

As before, we further subdivide the three shading tests into individual measurement conditions
by applying additional weighting functions Wn:

$$
W \_ {n}
$$

$$
\\eta\_ {s h a d e, X} = \\sum\_ {n = 1} ^ {N} W \_ {n} \\eta\_ {s h a d e, n}
$$

Where X is the particular shading test being analyzed (one-string, two-string, or three-string) and
N is the number of measurement conditions in that test. The weighting values W for the light
shade condition are provided in Appendix A.

The values given in Appendix A were chosen to match the exponential decrease in shade extent
seen in this lightly shaded residential installation. Figure 10 displays these data points, scaled to
2
match the site survey data in kWh/m .

25% (Heavy) Shade Weighting
The final residential PV installation represents the heavily shaded condition. Six site survey

The final residential PV installation represents the heavily shaded condition. Six site survey
images were taken at this site, with an average solar access of 74.5% (25.5% shade). The
distribution of the shade across the system is given in Figure 11, weighted for irradiance. The
system sees unshaded conditions 48.5% of the time, on an irradiance-weighted basis. Again, not
enough site survey imaging was available to determine a distribution between single-string and
multiple-string shading, so the representative data from the moderate shade case in Figure 9 is
again used as a guide. The overall shade weighting values for the heavy shade conditions are
provided in Table 6.

Figure 11. Histogram weighted by irradiance for heavily shaded residential installation. Unshaded
fraction (irradiance weighted): 48.5%. Data points indicate weight conditions in Appendix C,
2
scaled for kWh/m .

$$
\\mathrm {k W h} / \\mathrm {m} ^ {2}
$$

* * *

Table 6. Weighting Values for the Heavy (25%) Shade-Weighting Condition

|  | Weight | Total % |
| --- | --- | --- |
| Unshaded | 48.5% | 48.5% |
| One-string(n:0:0) | 7% |  |
| Two-string(n:n:0) | 14.5% |  |
| Three-string(n:n:n) | 30% |  |
| Total Shaded |  | 51.5% |

The calculation of overall device efficiency for the heavy shading condition is:

$$
\\begin{array}{l} \\eta\_ {h e a v y} = 0. 4 8 5 \\eta\_ {u n s h a d e d} + 0. 3 \\eta\_ {s h a d e, \\mathrm {t h r e e - s t r i n g}} + 0. 1 4 5 \\eta\_ {s h a d e, \\mathrm {t w o - s t r i n g}} \ + 0. 0 7 \\eta\_ {s h a d e, \\mathrm {o n e - s t r i n g}} \ \\end{array}
$$

The three shading tests are further subdivided into individual measurement conditions by
applying additional weighting functions Wn, given in Appendix C. These weighting conditions
were adjusted to approximately fit the linear decrease in shade weight with increased shade
percentage, as shown in Figure 11.

$$
W \_ {n},
$$

* * *

# Initial Test Results and Application of the Analysis Method

An experiment implementing this shading procedure was conducted by PV Evolution Labs in Davis, California. The test ran from August to October 2011, with the intent of assessing the performance of Enphase M215 microinverters relative to a Fronius string inverter. The previously discussed methodology was followed during this performance assessment test, with the following details:

Two PV arrays were utilized to make the comparison of inverter performance, each consisting of three parallel strings of 12 modules. The 72 Sharp NU-U235 modules used in the test were flash tested and distributed between the two arrays such that each array had a similar average rated power and distribution. The panels assigned to the Enphase array had a total power rating of 8494 W at standard test conditions (STC), and the panels assigned to the Fronius array had a total STC power rating of 8502 W. The standard deviation of per-panel STC rating is 1 W for both arrays. The panels are oriented at a 20 degree latitude tilt, south facing, and divided between six successive rows (Figure 12).

Per-panel shading is accomplished using a black, 50% open vinyl/polyester fabric (McMaster- Carr P/N 87655K134) with average transmittance of 37% (see in Figure 5).

**Figure 12. Image showing the two arrays at the test yard in Davis, California. The reference array**

**is on the right, and the Enphase array is on the left. Both arrays are shaded in the (14:14:0)** **configuration. The irradiance sensors and met station are centrally located in the front row** **between the two arrays.**

The string inverter used for the reference case is a Fronius IG Plus 100V-2, with a rated DC input of 8520 W. The input voltage minimum for peak power tracking is 230V, which means that inverter input voltage issues may occur once a significant amount of shade is present on the system (< 50%). The manufacturer-stated efficiency of the inverter is 95.7% maximum, 95.2% European weighted. The Fronius inverter was chosen for this test configuration because it has a relatively low DC input voltage minimum and is from a relatively common inverter
manufacturer, representative of typically installed residential inverters.

The power electronics devices under test are Enphase M215 microinverters, which are attached
at the back of each panel in the Enphase test array. The manufacturer-stated efficiency of the
inverter is 96.3% maximum, 96.0% CEC weighted.

The main performance metric studied here was AC energy production, which is monitored for
each array with a revenue-grade (0.2% accuracy) ElectroIndustries Shark 100T power
transducer. This data is logged on a Campbell Scientific CR1000 datalogger, along with
meteorological data such as plane-of-array irradiance using a silicon reference cell, and module
temperatures using thin-film thermocouples. DC performance characteristics of the reference
array were also recorded (DC input voltage and per-string current) but are not discussed here.

Experiment Results – Table Method
A comparison of unshaded power production was conducted for the two arrays over a period of

A comparison of unshaded power production was conducted for the two arrays over a period of
2
four days, totaling 22 kWh/m irradiance exposure. The Enphase array produced on average
0.5% more power during this period, due in part to the Enphase M215 inverter’s higher rated
efficiency. Therefore ηunshaded = 1.005.

$$
\\eta\_ {u n s h a d e d} = 1. 0 0 5
$$

During the shaded part of the experiment, the shade conditions shown in Table 2 are carried out
for both PV arrays. Each shade condition is maintained for at least 15 minutes under sunny skies
2
with irradiance greater than 500 W/m and solar incidence angle less than 50 degrees (see Table
3). In this experiment, data is not recorded before 9:15 AM Pacific Standard Time (PST) or after
3:45 PM PST to maintain these irradiance requirements.

$$
\\mathrm {W / m ^ {2}}
$$

A ratio of AC production between the Enphase array and the Fronius array is recorded to provide
the various ηshadedvalues. All three performance scores are determined from the same 30-
measurement data set by applying the different weights in Appendices A–C. For the light
shading condition, the weight values in Appendix A are used to arrive at the following values:

Table 7. Test Results for Light (7%) Shading Using Appendix A Weights

| Shade Type | Performance Score | Relative Weight |
| --- | --- | --- |
| (n:0:0) | 1.08 | 3% |
| (n:n:0) | 1.16 | 5% |
| (n:n:n) | 1.26 | 10% |
| Unshaded | 1.005 | 82% |

Total Performance Score (Light): 1.04

* * *

For the moderate shading condition, the weight values in Appendix B are used to arrive at the
following values:

Table 8. Test Results for Moderate (19%) Shading Using Appendix B Weights

| Shade Type | Performance Score | Relative Weight |
| --- | --- | --- |
| (n:0:0) | 1.08 | 7% |
| (n:n:0) | 1.16 | 10% |
| (n:n:n) | 1.28 | 20% |
| Unshaded | 1.005 | 63% |

Total Performance Score (Moderate):

Heavy shading results are determined from the weight values in Appendix C, as shown below:

Table 9. Test Results for Heavy (25.5%) Shading Using Appendix C Weights

| Shade Type | Performance Score | Relative Weight |
| --- | --- | --- |
| (n:0:0) | 1.10 | 7% |
| (n:n:0) | 1.18 | 14.5% |
| (n:n:n) | 1.30 | 30% |
| Unshaded | 1.005 | 48.5% |
| Total Performance Score(Heavy): |  | 1.126 |

Total Performance Score (Heavy):

Therefore, using the light shading conditions, the Enphase M215 saw a performance
improvement of 4% over the reference system. This represents a 4% annual energy production
increase for a residential installation experiencing an average amount of shade (7%), as
determined by our site survey analysis.

Using the moderate and heavy shade conditions, the Enphase M215 displayed an even greater
performance improvement of 8%–12.6% over the reference system. The shade conditions
replicated here were for moderate and heavily shaded PV systems experiencing 15%–25%
irradiance reduction throughout the year.

Additional uncertainty arose from this particular test because data was only collected out to n =
18 for any of the conditions due to time constraints. Additional data is simulated based on
normalized results, as will be discussed below.

$$
n =
$$

* * *

## Experiment Results – Normalized Method

In addition to applying weighting values to the relative measurements between the two systems, a second method was investigated to look at the relative performance of the two systems. This analysis method looks at the shaded performance of each system relative to its own unshaded performance. To accomplish this normalized method, it was necessary to compare shaded and unshaded data from multiple days and multiple temperature and irradiance conditions. One complication of this method is that the data is susceptible to increased uncertainty due to a number of uncontrolled environmental conditions, such as changing spectrum throughout the day, different haze conditions, reflections from changing ground cover, etc. For these reasons, it was important to compare only data points from sequential days at identical time of day, under completely sunny conditions. It is hoped that by comparing data at identical time of day, similar spectral, temperature, irradiance, and incidence angle effects will affect both measurements equally. To provide a good unshaded reference condition, four consecutive days of unshaded data were collected on both arrays until a completely unshaded dataset was obtained. As an alternative to looking at data from sequential days, the two systems could be identically outfitted with the same power electronics (reference inverter or DUT) and have one array be shaded and the other remain unshaded. This was not the approach followed here, but it would be a good idea for future tests since simultaneous comparisons do not depend as much on variable weather conditions.

When comparing test results from multiple days, the shaded conditions are compared with the 2 unshaded conditions, after correcting both by temperature and irradiance to STC of 1000 W/m o and 25 C \[12\]. The results shown in Figure 13 indicate that the microinverter system has better performance under shaded conditions, losing only half as much performance as the string inverter, out to 50% system shade S.

**Figure 13. Normalized production of the Enphase microinverter system (blue diamond) and**

**Fronius string inverter (red square) vs. extent of system shade %.**

Figure 13 shows performance loss with respect to shade extent S. The normalized production P

of the Enphase system neatly follows the linear fit P = 1-0.67 S, where the slope is nearly equal to the opacity of the shading screen (opacity = 1-0.37 = 63%). This means that the Enphase system is recovering almost all of the irradiance filtering through the shade screen. The slope of the Fronius system is greater, owing to mismatch losses within the module strings and between parallel strings. Also, there is a much greater amount of scatter in the data, with different shading conditions resulting in different slope of performance loss vs. S. For instance, isolated
shade n:0:0 conditions result in a steeper slope than uniform shade n:n:n conditions. In this test
case for the reference string inverter, a single linear fit is taken through all of the various shading
conditions, resulting in the linear fit of P = 0.99-1.36 S.

However, for the string inverter case, the linear slope seems to level out near y = 0.37 times the
normalized power, with power loss remaining constant with increased S. This coincides exactly
with the transmittance of the shading screen %T = 0.37, so the Fronius system can be assumed to
be switching up to a high-voltage, low-current peak operating point at this shade extent and
beyond. This behavior is consistent with prior shade modeling analysis detailed in \[13\]. The
overall modeled behavior of the string inverter here is taken to be P = 0.99-1.36 S with a
production minimum of P = 0.37.

The modeled behavior of the two systems based on the normalized data can be used to conduct a
second determination of the annual performance score, combining linear fits for system
performance in Figure 13 with shade site survey data described above. The shade conditions
given by the shading histograms in Figures 9, 12, and 14 are again used to determine shading
losses for these three prototype shade scenarios. The shade losses determined through the use of
modeled performance are detailed below in Table 10.

Table 10. Calculation of Relative Performance for Light, Moderate, and Heavy Shading Histograms
Based on Normalized Data in Figure 13

| Enphase production | Fronius production | Fronius shade loss | Enphase score(l) | Enphase shade derate |
| --- | --- | --- | --- | --- |
| 1753 | 1691 | -6.7% | 1.037 | 0.967 |

Moderate shading: (1894 kWh/m2 unshaded production)
Enphase Fronius Fronius Enphase

| Enphase production | Fronius production | Fronius shade loss | Enphase score(m) | Enphase shade derate |
| --- | --- | --- | --- | --- |
| 1690 | 1568 | -17.2% | 1.078 | 0.892 |

Heavy shading: (1784 kWh/m2 unshaded production)
Enphase Fronius Fronius Enphase

| Enphase production | Fronius production | Fronius shade loss | Enphase score(h) | Enphase shade derate |
| --- | --- | --- | --- | --- |
| 1532 | 1365 | -23.5% | 1.123 | 0.859 |

The results of Table 10 indicate that the light shading scenario shows an annual microinverter
performance improvement of 3.7% using the normalized data set, compared with a 4%
improvement from the table method. The moderate shading scenario shows a performance
improvement of 7.8% from the normalized data, compared with 8.0% from the table method.

Finally, the heavy shading scenario resulted in a performance improvement score of 12.3% with
the normalized method, and 12.6% with the table method. In all cases, the performance score
shows an improvement equivalent to 45% - 55% of the surveyed annual irradiance loss,
indicating that roughly half of the performance loss due to shade is recovered through the use of
microinverters.

* * *

Also, the table method and the modeled performance method yield performance scores that are
within 1% absolute from each other, for this particular test case. Note that when the performance
loss due to shade is multiplied by the shade mitigation score, the overall shade derate is less than
one—shade mitigation devices only recover a percentage of the annual power lost due to shade.

Analysis of Additional Conditions
The normalized results above provide the ability to extrapolate the modeled performance score

Analysis of Additional Conditions
The normalized results above provide the ability to extrapolate the modeled performance score
of the Enphase microinverters to other use conditions. For instance, the slope of the normalized
production P vs. S graph in Figure 13 indicates that the Enphase production is related to the
percent diffuse irradiance D/G. This fact has previously been demonstrated for module-level
power electronics in general \[7\]. If the normalized production of the Enphase microinverter can
be assumed to follow the equation P =1 – (1-D/G) S, the performance of the Enphase equipment
can be determined for arbitrary D/G ratio. Likewise, the normalized production of the Fronius
string inverter in Figure 13 indicates that a production minimum exists when P = D/G. Other
than this limit condition, the slope of the production from the string inverter is assumed to be
constant with D/G—an assumption consistent with previously modeled shade impact on PV
systems \[13\].

Given the above equations for modeled performance of the two systems, additional performance
scores for 13 different solar installations with varying shade extent are created. Results are
shown in Figure 14 assuming five different D/G ratios: 0.15, 0.37, 0.5, 0.75 and 0.9. It can be
seen that D/G ratios less than or equal to 0.5 give nearly identical results. For these three lowest
D/G ratios, performance scores follow a slope of 0.5 times shade extent. Put another way, 50%
of the lost power due to shade is recovered by the use of the microinverters. At higher diffuse
fraction, however, this performance benefit is reduced to something closer to 30% at D/G = 0.75,
and 15% at D/G = 0.9. The fact that performance results are relatively consistent for any
simulated diffuse ratio below 0.5 supports the earlier prescription of using at least 50% opaque
shading materials to collect shaded measurements in this procedure.

* * *

Inverter MPPT Errors
During the course of this experiment, it was found that certain shading conditions led to

During the course of this experiment, it was found that certain shading conditions led to
additional performance losses from the reference Fronius inverter. This was because the inverter
was incorrectly operating at a point that was not the global maximum. This effect is illustrated in
Figure 15 for an example shading condition. In this case, there are two local peaks in the power
vs. voltage curve. The higher voltage peak also happens to be the global maximum, but this is
not always the case. Under certain shading conditions, the lower voltage peak is the true global
maximum. Depending on how quickly the shading condition is changed, the inverter might be
left behind, and not track the real maximum power point.

Figure 15. Power vs. voltage curve for a partially shaded PV system. Partial shading results in
multiple local maxima, which may confuse the peak power tracking algorithm of the inverter.

A number of measurements were retaken for the (n:n:n) uniform shading condition, as this shade
condition was more likely to result in peak-power tracking errors from the string inverter in our
test case. To help minimize tracking errors, the reference system was started up in a shade-free
condition, and then slowly placed into a shaded condition by incrementally shading additional
submodules.

The impact of these inaccuracies on a real system is debatable. However, for this experiment, by
allowing the inverter to inaccurately track the maximum power point, the reference system
would have received an additional performance loss of 2%, when weighted by the moderate
shade conditions in Appendix B. For this comparative test, it is best to ensure that the reference
inverter is accurately tracking the maximum power point to reduce possible variability from the
measurement of one type of device to another.

* * *

Conclusion

A new test method is presented here, aimed at providing a repeatable and representative
performance analysis of distributed power electronics. The test methodology is based on directly
shading two side-by-side systems and comparing the relative output of the two systems. Three
shading conditions are identified to illustrate the performance benefit of the test device under
different representative conditions, relative to a string inverter. By applying temperature and
irradiance corrections to the same shading data, a comparison can be made between the device
performance under shaded and unshaded conditions. This provides additional details of how the
distributed power electronics behave under different shade conditions, and allows a model of
shade impact to be proposed. Instead of correcting and comparing data collected on different
days, a second approach would be to make simultaneous comparisons of two arrays equipped
with the same power electronics, one with shade and one without. This would require additional
shading performance data to be collected, but would possibly be more accurate since it does not
depend as much on variable weather conditions, and does not produce results referenced to a
specific string inverter.

In comparing the performance results of the table analysis method and the modeled performance
method, both methods agree to within 1% absolute, giving annual performance improvement
scores of 4% for light shading conditions, 8% for moderate shade conditions, and 12%–13% for
heavy shade conditions. Each of these scores indicates a recovery of around half of the overall
performance loss due to shade, as predicted by the shading loss site survey.

It is hoped that the test methodology described here can be duplicated and repeated at multiple
test installations for a variety of microinverter and shade mitigation products, as well as for string

inverters with novel maximum-power-point-tracking algorithms. The performance score
information could be particularly valuable for consumers curious about the relative benefit of a
shade mitigation device, compared with a string inverter or another distributed power electronics

shade mitigation device, compared with a string inverter or another distributed power electronics
product. Combined with the CEC efficiency of the device (or the CEC efficiency of the inverter
upstream of the device) this performance score provides an annual derate that could be used in
many PV simulation programs such as NREL’s PVWatts or SAM to more accurately predict
annual system performance.

shade mitigation device, compared with a string inverter or another distributed power electronics
product. Combined with the CEC efficiency of the device (or the CEC efficiency of the inverter
upstream of the device) this performance score provides an annual derate that could be used in
many PV simulation programs such as NREL’s PVWatts or SAM to more accurately predict

Acknowledgements

Test data for this experiment were collected under a test service agreement between PV
Evolution Laboratory and Enphase Energy Inc. The testing method was developed and data
analysis was independently conducted by the National Renewable Energy Laboratory under
Contract No. DOE-AC36-08GO28308 with the Department of Energy. A number of individuals
also contributed important reviews and contributions to this work, including Jeff Newmiller,
David Briggs, Sara MacAlpine, and Solar Works, Inc. Testing was conducted at PV Evolution
Labs by Rajeev Singh, Filiberto Alex Pineda, and Dang H. Dang.

* * *

# References

01. C. Deline, B. Marion, J. Granata, S. Gonzalez. A Performance and Economic Analysis of _Distributed Power Electronics in Photovoltaic Systems. NREL Report No. TP-5200-50003._ Golden, CO: National Renewable Energy Laboratory, December 2010. [http://www.nrel.gov/docs/fy11osti/50003.pdf](http://www.nrel.gov/docs/fy11osti/50003.pdf).

02. California Energy Commission. New Solar Homes Partnership Committee Final Guidebook. Report CEC-300-2006-017-CTF. Sacramento, CA: California Energy Commission, November 2006; p. 25. [http://www.energy.ca.gov/2006publications/CEC-300-2006-017/CEC-300-2006-](http://www.energy.ca.gov/2006publications/CEC-300-2006-017/CEC-300-2006-) 017-CTF.PDF.

03. California Energy Commission. 2009 California Residential Appliance Saturation Study, Vol.
    _2\. Sacramento, CA: California Energy Commission, October 2010; p. 13._ [http://www.energy.ca.gov/2010publications/CEC-200-2010-004/CEC-200-2010-004-V2.PDF](http://www.energy.ca.gov/2010publications/CEC-200-2010-004/CEC-200-2010-004-V2.PDF).

04. BEW Engineering Inc. Draft Evaluation Approach for Shade Impact Mitigation Devices. Contractor report prepared for the California Energy Commission, June 3, 2009 (unpublished).

05. R. Perez et al. “A new simplified version of the Perez diffuse irradiance model for tilted surfaces.” Solar Energy; Vol. 39, 1987; pp. 221–231.

06. V. Quaschning, R. Hanitsch. “Influence of shading on electrical parameters of solar cells.” _25th IEEE Photovoltaic Specialists Conference, Washington, DC, 1996; pp.1287–1290._ _th_

07. C. Deline. “Partially Shaded Operation of Multi-String Photovoltaic Systems.” 35 _IEEE_ _Photovoltaic Specialists Conference, Honolulu, HI, 2010._

08. M.C. Alonso-Garcia, J.M. Ruiz, F. Chenlo, “Experimental study of mismatch and shading effects in the I-V characteristic of a photovoltaic module”, Solar Energy Materials & Solar _Cells; Vol. 90, 2006; pp.329-340_

09. Solar Works. Private communication. August 2011.

10. Solmetric Inc. “Application Note: Understanding the Solmetric SunEye.” March 2011. [http://resources.solmetric.com/get/UnderstandingTheSolmetricSunEye-March2011.pdf](http://resources.solmetric.com/get/UnderstandingTheSolmetricSunEye-March2011.pdf).

11. R. Levinson, H. Akbari, M. Pomerantz, S. Gupta. “Solar access of residential rooftops in four California cities.” Solar Energy; Vol. 83, 2009; pp. 2120–2135.

12. B. Marion. “Comparison of Predictive Models for Photovoltaic Module Performance.”
    _rd_ Equation (2). 33 _IEEE Photovoltaic Specialists Conference, San Diego, CA, 2008._

13. C. Deline, A. Dobos, J. Meydbrey, M. Donovan. “A simplified model of uniform shading in large photovoltaic arrays.” (not yet published)


* * *

Additional Bibliography
M. Gross, S. Martin, N. Pearsall. “Estimation of Output Enhancement of a Partially Shaded
th
BIPV Array by the Use of AC Modules.” 26 IEEE Photovoltaic Specialists Conference,
Anaheim, CA, 1997.
A. Woyte, J. Nijs, R. Belmans. “Partial Shadowing of PV Arrays with Different System
Configurations: Literature Review and Field Test Results.” Solar Energy; Vol. 74, 2003; pp.
217–233.
N. Chaintreuil, F. Barruel, X. Le Pivert, H. Buttin, J. Merten. “Effects of Shadow on a Grid
rd
Connected PV System.” 23 European Photovoltaic Solar Energy Conference and Exhibition,
2008; p. 3417.
th
C. Deline. “Partially Shaded Operation of a Grid-Tied Photovoltaic System.” 34 IEEE
Photovoltaic Specialists Conference, Philadelphia, PA, 2009.
S. MacAlpine, M. Brandemuehl, R. Erickson. “Analysis of Potential for Mitigation of Building-
Integrated PV Array Shading Losses Through the Use of Distributed Power Converters.” ASME
th
4 International Conference on Energy Sustainability, Phoenix, AZ, 2010.
C. Deline. “Characterizing Shading Losses on Partially Shaded PV Systems.” PV Performance
Modeling Workshop, Albuquerque, NM, 2010. NREL Report No. PR-5200-49504.

B. Burger, B. Goeldi, S. Rogalla, H. Schmidt. “Module Integrated Electronics – An Overview.”
th
25 European Photovoltaic Solar Energy Conference and Exhibition, Valencia, Spain, 2010.
P. Tsao. “Simulation of PV Systems with Power Optimizers and Distributed Power
Electronics,.” IEEE Photovoltaic Specialists Conference, Honolulu, HI, 2010.
S. MacAlpine, M. Brandemuehl, L. Linares, R. Erickson. “Effect of Distributed Power
Conversion on the Annual Performance of Building-Integrated PV Arrays with Complex Roof
rd
Geometries.” ASME 3 International Conference on Energy Sustainability, San Francisco, CA,
2009\.
A. Kimber, L. Mitchell, S. Nogradi, H. Wenger. “The Effect of Soiling on Large Grid-Connected
th
Photovoltaic Systems in California and the Southwest Region of the United States.” IEEE 4
World Conference on Power Conversion, Waikoloa, HI, 2006.
S. Poshtkouhi, et al., "A General Approach for Quantifying the Benefit of Distributed Power
Electronics for Fine Grained MPPT in Photovoltaic Applications using 3D Modeling," IEEE

$$
2 6 ^ {t h}
$$

$$
4 ^ {t h}
$$

$$
2 5 ^ {t h}
$$

$$
3 ^ {r d}
$$

$$
4 ^ {t h}
$$

S. Poshtkouhi, et al., "A General Approach for Quantifying the Benefit of Distributed Power
Electronics for Fine Grained MPPT in Photovoltaic Applications using 3D Modeling," IEEE
Transactions on Power Electronics, in press; doi: 10.1109/TPEL.2011.2173353

* * *

Appendix A: Light Shading Using Three Parallel Strings

Unshaded shade test ηunshaded. Total weight: 82%.

| n:0:0(single string) shade test $ \\eta\_{\\mathrm{shade},\\mathrm{one-string}} $ |  | Total weight:3% |
| --- | --- | --- |
| Submodules shaded | % system shade S | Relative weight W |
| 1 | 0.01 | 11.7% |
| 4 | 0.04 | 11.3% |
| 8 | 0.07 | 10.9% |
| 12 | 0.11 | 10.5% |
| 16 | 0.15 | 10.1% |
| 20 | 0.19 | 9.8% |
| 24 | 0.22 | 9.4% |
| 28 | 0.26 | 9.1% |
| 32 | 0.30 | 8.7% |
| 35 | 0.32 | 8.5% |
| Total |  | 100.0% |

$$
\\eta\_ {s h a d e},
$$

Total
n:n:0

n:n:0 (two-string) shade test ηshade,two-string.Total weight: 5 %.
Submodules shaded % system shade S Relative weight W

$$
\\eta\_ {s h a d e},
$$

Submodules shaded % system shade S Relative weight W
1 0.02 13.4%

| rules shaded | % system shade S | Relative weight W |
| --- | --- | --- |
| 1 | 0.02 | 13.4% |
| 4 | 0.07 | 12.7% |
| 8 | 0.15 | 11.8% |
| 12 | 0.22 | 10.9% |
| 16 | 0.30 | 10.2% |
| 20 | 0.37 | 9.4% |
| 24 | 0.44 | 8.8% |
| 28 | 0.52 | 8.1% |
| 32 | 0.60 | 7.6% |
| 35 | 0.64 | 7.1% |
|  |  | 100.0% |

Total
n:n:n (three -string)

n:n:n (three -string) shade ηshade,three -string. Total weight: 1 0%.
Submodules shaded % system shade S Relative weight W

| dules shaded | % system shadeS | Relative weightW |
| --- | --- | --- |
| 1 | 0.03 | 15.3% |
| 4 | 0.11 | 14.1% |
| 8 | 0.22 | 12.6% |
| 12 | 0.33 | 11.3% |
| 16 | 0.44 | 10.1% |
| 20 | 0.56 | 9.0% |
| 24 | 0.67 | 8.0% |
| 28 | 0.78 | 7.2% |
| 32 | 0.89 | 6.5% |
| 35 | 0.97 | 5.9% |
|  |  | 100.0% |

* * *

Appendix B: Moderate Shading Using Three Parallel Strings

Unshaded shade test ηunshaded.Total weight: 63%.

| n:0:0(single string) shade test $ \\eta\_{\\mathrm{shade,one-string}} $ |  | Total weight:7% |
| --- | --- | --- |
| Submodules shaded | % system shade S | Relative weight W |
| 1 | 0.01 | 8.8% |
| 4 | 0.04 | 9.0% |
| 8 | 0.07 | 9.3% |
| 12 | 0.11 | 9.6% |
| 16 | 0.15 | 9.9% |
| 20 | 0.19 | 10.1% |
| 24 | 0.22 | 10.4% |
| 28 | 0.26 | 10.7% |
| 32 | 0.30 | 11.0% |
| 35 | 0.32 | 11.2% |
| Total |  | 100.0% |

Total

$$
\\eta\_ {s h a d e},
$$

| Modules shaded | % system shade S | Relative weight W |
| --- | --- | --- |
| 1 | 0.02 | 7.8% |
| 4 | 0.07 | 8.2% |
| 8 | 0.15 | 8.7% |
| 12 | 0.22 | 9.2% |
| 16 | 0.30 | 9.7% |
| 20 | 0.37 | 10.3% |
| 24 | 0.44 | 10.8% |
| 28 | 0.52 | 11.3% |
| 32 | 0.60 | 11.8% |
| 35 | 0.64 | 12.2% |
|  |  | 100.0% |

Total
n:n:n (three -string)

n:n:n (three -string) shade ηshade,three -string. Total weight: 2 0%.
Submodules shaded % system shade S Relative weight W

| modules shaded | % system shade S | Relative weight W |
| --- | --- | --- |
| 1 | 0.03 | 7.1% |
| 4 | 0.11 | 7.6% |
| 8 | 0.22 | 8.3% |
| 12 | 0.33 | 9.0% |
| 16 | 0.44 | 9.7% |
| 20 | 0.56 | 10.3% |
| 24 | 0.67 | 11.0% |
| 28 | 0.78 | 11.7% |
| 32 | 0.89 | 12.4% |
| 35 | 0.97 | 12.9% |
|  |  | 100.0% |

Total

* * *

Appendix C: Heavy Shading Using Three Parallel Strings

Unshaded shade test ηunshaded.Total weight: 48.5%.

$$
\\eta\_ {s h a d e},
$$

| n:0:0(single string) shade test $ \\eta\_{\\mathrm{shade},\\mathrm{one-string}} $ |  | Total weight:7% |
| --- | --- | --- |
| Submodules shaded | % system shade S | Relative weight W |
| 1 | 0.01 | 12.5% |
| 4 | 0.04 | 12.5% |
| 8 | 0.07 | 12.5% |
| 12 | 0.11 | 12.5% |
| 16 | 0.15 | 12.5% |
| 20 | 0.19 | 12.5% |
| 24 | 0.22 | 12.5% |
| 28 | 0.26 | 12.5% |
| 32 | 0.30 | 0% |
| 35 | 0.32 | 0% |
| Total |  | 100.0% |

Total

$$
\\eta\_ {s h a d e},
$$

| 10(two-string) shade test $ \\eta\_{shade} $ ,two-string. |  | Total weight:14.5% |
| --- | --- | --- |
| modules shaded | % system shade S | Relative weight W |
| 1 | 0.02 | 11.1% |
| 4 | 0.07 | 11.1% |
| 8 | 0.15 | 11.1% |
| 12 | 0.22 | 11.1% |
| 16 | 0.30 | 11.1% |
| 20 | 0.37 | 11.1% |
| 24 | 0.44 | 11.1% |
| 28 | 0.52 | 11.1% |
| 32 | 0.60 | 5.6% |
| 35 | 0.64 | 5.6% |
|  |  | 100.0% |

Total
n:n:n (three string)

| dules shaded | % system shade S | Relative weight W |
| --- | --- | --- |
| 1 | 0.03 | 8.0% |
| 4 | 0.11 | 10.0% |
| 8 | 0.22 | 10.0% |
| 12 | 0.33 | 12.0% |
| 16 | 0..44 | 12.0% |
| 20 | 0.56 | 10.0% |
| 24 | 0.67 | 12.0% |
| 28 | 0.78 | 8.0% |
| 32 | 0.89 | 8.0% |
| 35 | 0.97 | 10.0% |
|  |  | 100.0% |

Total