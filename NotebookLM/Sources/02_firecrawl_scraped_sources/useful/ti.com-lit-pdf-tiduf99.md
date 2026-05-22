Design Guide: TIDA-010949
600W Solar Power Optimizer Reference Design Based on
GaN With Wired and Wireless Communication

Description

This reference design is a solar power optimizer,
which can support up to 80V input voltage and
80V output voltage, providing upwards of 18A

80V output voltage, providing upwards of 18A
output current and input current. The design uses

output current and input current. The design uses
a configurable four switch buck-boost converter to
step up or step down the panel current to the
string current. The bypass circuit uses a smart diode

output current and input current. The design uses
a configurable four switch buck-boost converter to
step up or step down the panel current to the
string current. The bypass circuit uses a smart diode

string current. The bypass circuit uses a smart diode

This reference design includes power line
communication (PLC) and also features wireless
communication. Both the digital control and
communication are all implemented in a single
C2000™ microcontroller (MCU).

Resources

TIDA-010949

LMG2100R026, TMS320F2800137

TMCS1127, LM74610-Q1

AFE031, CC1352P7

TEXAS INSTRUMENTS

Design Folder
Product Folder
Product Folder
Product Folder
Product Folder

LM5164, INA181

Ask the TI E2E™ support experts

• 99.5% peak efficiency and 99.4% CEC weighted
efficiency in short mode
• 99.0% peak efficiency and 97.7% CEC weighted

• 99.0% peak efficiency and 97.7% CEC weighted
efficiency in switching mode at 15A constant
output current
• 98.6% peak efficiency and 97.0% CEC weighted

• Power line communication and wireless
communication function
• Wide input voltage range: 15V to 80V

• Wide input voltage range: 15V to 80V
• High rated output current: 18A

• Gallium nitride (GaN) technology with integrated
driver-based design
• Power line communication and wireless

output current
• 98.6% peak efficiency and 97.0% CEC weighted
efficiency in switching mode at 18A constant
output current
• Gallium nitride (GaN) technology with integrated

• Wide input voltage range: 15V to 80V
• High rated output current: 18A

Applications

• Solar power optimizer
• Solar charge controller

• Solar charge controller
• Rapid shutdown

• Rapid shutdown

* * *

1 System Description

This reference design is developed around TI's half-bridge gallium nitride (GaN) power stage with integrated
gate drivers and the TMS320F2800137 C2000 MCU. The design is targeted for single-panel power optimizer
designs, capable of operating with 15V to 80V solar panel modules with up to 18A output current.

The design uses the perturb-and-observe algorithm for MPPT and has an operating efficiency of greater than
99%. The high efficiency is attributed to the half-bridge GaN FETs power stage with low RDS(on), low Pswitch and
zero reverse recovery charge in the design. Usage of small sized components is made possible by the high
switching frequency (up to 300kHz) of the buck converter.

\\mathsf{R}\_{\\mathsf{D S(o n)}}

\\mathsf{P}\_{\\mathsf{s w i t c h}}

This design also includes PLC communication based on AFE031 and wireless communication based on
CC1352P7 for sending and receiving data such as voltage, current, power, and so forth.

1.1 Key System Specifications

Table 1-1. System Specifications

| PARAMETER | SPECIFICATIONS | UNIT |
| --- | --- | --- |
| Input panel voltage range | 15-80 | V |
| Rated maximum current | 18 | A |
| Efficiency | >99 | % |
| Interleaved buck operating frequency | 300 | kHz |

2.1 Block Diagram

2 System Overview

Figure 2-1. TIDA-010949 Block Diagram

To power the system, a 100V switching regulator (LM5164) is used to step down the panel voltage to 12V for
PLC. The second fly-buck topology (LMR51410) is used to step down from 12V to a non-isolated 5V and two
isolated 5V to provide power for the LMG2100 and C2000 control card. Two isolated 5V is to provide driver voltage for the upper FET of LMG2100 to support 100% duty cycle. From the non-isolated 5V, a low-dropout
(LDO) regulator (TPS7A2033) is used to regulate a 3.3V line for the rest of the components.

Figure 2-2. DC-DC Converter-Buck Stage

Figure 2-3. DC-DC Converter-Boost Stage

The R6 in the boost stage is a bypass resistor, if the resistor is soldered, then the converter is configured
into buck mode. Removing this resistor can configure the converter into 4-switch buck-boost mode. Two
LMG2100R026 devices are used in the 4-switch buck-boost power stage. To better utilize the potential of
the GaN device, component selection and the layout are important. High-quality input and output MLCCs are
needed to better handle the high frequency current during switching. The layout is required to minimized the
parasitics in the power loop, thus to reduce the voltage spike and ringing. Short, straight traces produce the
lowest impedance path for the signal and minimize the current loop area, thereby reducing loop inductances
present. Bypass capacitors filter and condition signals before use and are placed as close to the respective
component as possible. Any extraneous trace between the capacitor and component mitigates the effectiveness
of the bypass capacitor.

Figure 2-4. LMG2100R026 Layout

* * *

The AFE031 is used for the power line communication interface. This interface includes a power amplifier,
PGAs, and filters for the TX and RX path as well as an internal DAC. The SPI to the MCU is used to configure
the filters, PGAs, and the internal DAC. For transmitting data, the PWM mode is used. See also the AFE031
Powerline Communications Analog Front-End data sheet for a detailed design description for PWM mode. In the
RX path, a band-pass filter is implemented using R58, C87, L5, R59, L6, and C91. This filter removes any noise
outside the frequency band used for the PLC communication. The output of the band-pass filter is connected to
the internal PGAs and RX filters of the AFE031 and is then connected to an ADC of the MCU, which is sampling
and decoding the filtered signal.

The coupling circuit connects the AFE031 to the power line and removes the high voltage to protect the
low-voltage circuits of the AFE031. The transformer and DC blocking capacitor in series are in parallel with an
LRC circuit. The resonance frequency of this LRC circuit needs to be set to the PLC carrier frequency. This
makes sure that there is always sufficient impedance to couple the PLC signal onto the power line and the signal
is not shorted through the output capacitor of the power optimizer. R23 sets the impedance at the resonance
frequency. L4 needs to handle the full DC current without saturation.

Figure 2-5. PLC Coupling Circuit

The reference design utilizes J4 and J5 connectors for interfacing the MCU with wireless connectivity modules.
These modules add a lot of connectivity options like Wi-SUN®, Zigbee®, Bluetooth® Low Energy, and Wi-Fi®.

The C2000 MCU continuously measures parameters like voltages and currents on input and output and
periodically sends this data over universal asynchronous receiver-transmitter (UART). This data can be
transmitted over a wireless network to a monitoring system. Also the connectors have dedicated pins to enable
rapid shutdown over a wireless network feature.
The wireless connectivity example is available for evaluation by request.

The wireless connectivity example is available for evaluation by request.

* * *

Figure 2-6. Wireless Connectors

2.3 Highlighted Products

2.3.1 TMS320F2800137

The TMS320F280013x (F280013x) is a member of the C2000™ real-time microcontroller family of scalable,
ultra-low latency devices designed for efficiency in power electronics.

The real-time control subsystem is based on TI’s 32-bit C28x DSP core, which provides 120MHz of signalprocessing performance for floating- or fixed-point code running from either on-chip flash or SRAM. The C28x
CPU is further boosted by the Trigonometric Math Unit (TMU), speeding up common algorithms key to real-time
control systems. The F280013x supports up to 256KB (128KW) of flash memory. Up to 36KB (18KW) of on-chip
SRAM is also available to supplement the flash memory.

High-performance analog blocks are integrated into the F280013x real-time microcontroller (MCU) and are
closely coupled with the processing and pulse width modulation (PWM) units to provide best-in-class real-time
signal chain performance.
Fourteen PWM channels enable control of various power stages from a 3-phase inverter to power-factor

Fourteen PWM channels enable control of various power stages from a 3-phase inverter to power-factor
correction and other advanced multilevel power topologies.

The voltage and current of the panel and string lines are used to calculate and track the maximum power
point (MPP) and the TMS320F2800137 enables quick data acquisition from the various analog signals using
the internal analog-to-digital converter (ADC), set to read from the ADC channels once every 40μs. Operating
at 120MHz allows for fast conversion and calculation to efficiently perform MPPT and adjust the duty cycle of
converter accordingly. The comparator subsystem (CMPSS) is also utilized to fast protect the converter from
overvoltage, overcurrent or overtemperature.
An enhanced pulse width modulator (ePWM) is used to generate the PWM for 4 switches. The high-resolution

An enhanced pulse width modulator (ePWM) is used to generate the PWM for 4 switches. The high-resolution
pulse width modulator (HRPWM) can be used to generate a 3-level signal for AFE031, which can be used for
PLC transmission function. The internal ADC is used to sample the RX signal at 300kHz to receive the PLC
signals. An FSK decoding library (part of the C2000 ware) is used to decode the sampled signal.

Status indicators, controlled by the MCU, are also included in the design to provide feedback to the user.

* * *

2.3.2 LMG2100R026

Figure 2-7. LMG2100 Functional Block Diagram

The LMG2100R026 device is an 93V continuous, 100V pulsed, 53A half-bridge power stage, with integrated
gate-driver and enhancement-mode Gallium Nitride (GaN) FETs, 2.6mΩ RDS(on).

• 5V external bias power supply
• Zero reverse recovery

• Zero reverse recovery
• Very small input capacitance C

• Very small input capacitance CISS and output capacitance COSS
• Internal bootstrap supply voltage clamping to prevent GaN FET overdrive

\\mathbf{C}\_{\ 1mathbf s mathbf S

\\mathrm{c}\_{\\mathrm{O s s}}

ISS OSS
• Internal bootstrap supply voltage clamping to prevent GaN FET overdrive
• Excellent propagation delay (33ns typical) and matching (2ns typical)

• Excellent propagation delay (33ns typical) and matching (2ns typical)
• Exposed top QFN package for top-side cooling

• Exposed top QFN package for top-side cooling
• Package optimized for easy PCB layout

• Exposed top QFN package for top-side cooling
• Package optimized for easy PCB layout
• 7.0mm × 4.5mm × 0.89mm lead-free package

The device extends advantages of discrete GaN FETs by offering a more user-friendly interface. The device has
a practical design for applications requiring high-frequency, high-efficiency operation in a small form factor.

• 7.0mm × 4.5mm × 0.89mm lead-free package

The LMG2100R026, half-bridge, GaN power stage with highly integrated high-side and low-side gate drivers,
includes built-in UVLO protection circuitry and an overvoltage clamp circuitry. The clamp circuitry limits the
bootstrap refresh operation to make sure that the high-side gate driver overdrive does not exceed 5.4V. The
device integrates two, 2.6mΩ GaN FETs in a half-bridge configuration. The device can be used in many isolated
and non-isolated topologies allowing very simple integration. The HI and LI pins can be independently controlled
to minimize the third quadrant conduction of the low-side FET for hard-switched buck converters. The package
is designed to minimize the loop inductance while keeping the PCB design simple. TI recommends a small
footprint MLCC to minimize trace length to the pin. Place the bypass and bootstrap capacitors as close as
possible to the device to minimize parasitic inductance. The drive strengths for turn-on and turn-off are optimized
to make sure high-voltage slew rates without causing much excessive ringing on the gate or power loop.

600W Solar Power Optimizer Reference Design Based on GaN With Wired
and Wireless Communication
Copyright © 2024 Texas Instruments Incorporated

* * *

2.3.3 TMCS1127

The TMCS1127 is a galvanically isolated Hall-effect current sensor with industry-leading isolation and accuracy.
An output voltage proportional to the input current is provided with excellent linearity and low drift at all sensitivity
options. Precision signal conditioning circuitry with built-in drift compensation is capable of less than 2.75%
maximum sensitivity error over temperature and lifetime with no system level calibration, or less than 1.5%
maximum sensitivity error including both lifetime and temperature drift with a one-time calibration at room
temperature.

AC or DC input current flows through an internal conductor generating a magnetic field measured by integrated,
on-chip, Hall-effect sensors. Core-less construction eliminates the need for magnetic concentrators. Differential
Hall-effect sensors reject interference from stray external magnetic fields. Low conductor resistance increases
measurable current ranges up to ±96A while minimizing power loss and easing thermal dissipation requirements.
Insulation capable of withstanding 5kVRMS, coupled with a minimum of 8mm creepage and clearance, provides
high levels of reliable lifetime reinforced working voltage. Integrated shielding enables excellent common-mode
rejection and transient immunity.

2.3.4 LM5164

The LM5164 synchronous buck converter is designed to regulate over a wide input voltage range, minimizing
the need for external surge suppression components. A minimum controllable on-time of 50ns facilitates large
step-down conversion ratios, enabling the direct step-down from a 48V nominal input to low-voltage rails for
reduced system complexity and design cost. The LM5164 operates during input voltage dips as low as 6V, at
nearly 100% duty cycle if needed, making this device an excellent choice for wide input supply range industrial
and high cell count battery pack applications.

With integrated high-side and low-side power MOSFETs, the LM5164 delivers up to 1A of output current. A
constant on-time (COT) control architecture provides nearly constant switching frequency with excellent load
and line transient response. Additional features of the LM5164 include ultra-low IQ and diode emulation mode
operation for high light-load efficiency, remarkable peak and valley overcurrent protection, integrated VCC bias
supply and bootstrap diode, precision enable and input UVLO, and thermal shutdown protection with automatic
recovery. An open-drain PGOOD indicator provides sequencing, fault reporting, and output voltage monitoring.
The LM5164 is available in a thermally-enhanced, 8-pin SO PowerPAD™ integrated circuit package. The
1.27mm pin pitch provides adequate spacing for high-voltage applications.

2.3.5 LM74610-Q1

The LM74610-Q1 is a controller device that can be used with an N-channel MOSFET in a reverse polarity
protection circuitry. The device is designed to drive an external MOSFET to emulate an ideal diode rectifier when
connected in series with a power source. This scheme is not referenced to ground and thus has Zero IQ. The
LM74610-Q1 controller provides a gate drive for an external N-channel MOSFET and a fast response internal
comparator to discharge the MOSFET gate in the event of reverse polarity. This fast pulldown feature limits
the amount and duration of reverse current flow if opposite polarity is sensed. The device design also meets
CISPR25 Class 5 EMI specifications and automotive ISO7637 transient requirements with a qualified TVS diode.

* * *

2.3.6 AFE031

The AFE031 is a low-cost, integrated, power line communications (PLC) analog front-end (AFE) device that is
capable of capacitive- or transformer-coupled connections to the power line while under the control of a DSP
or microcontroller. This device is an excellent choice for driving low impedance lines that require up to 1.5A
into reactive loads. The integrated receiver is able to detect signals down to 20μVRMS and is capable of a wide
range of gain options to adapt to varying input signal conditions. This monolithic integrated circuit provides high
reliability in demanding power line communications applications.

20\\upmu V\_{\ S R}\

The AFE031 transmit power amplifier operates from a single supply in the range of 7V to 24V. At maximum
output current, a wide output swing provides a 12VPP (IOUT = 1.5A) capability with a nominal 15V supply. The
analog and digital signal processing circuitry operates from a single 3.3V power supply.

12V\_{P P}\\left(I\_{O U T}=1.5A\\right)

2.3.7 CC1352P7

The CC1352P7 device with SimpleLink™ platform is a multiprotocol and multiband Sub-1 GHz and 2.4GHz
wireless microcontroller (MCU) supporting Thread, Zigbee®, Bluetooth® Low Energy 5.2, IEEE 802.15.4g,
IPv6-enabled smart objects (6LoWPAN), mioty®, Wi-SUN®, proprietary systems, including the TI 15.4-Stack
(Sub-1GHz and 2.4GHz), and concurrent multiprotocol through a Dynamic Multiprotocol Manager (DMM) driver.
The CC1352P7 is based on an Arm®Cortex®-M4F main processor and optimized for low-power wireless
communication and advanced sensing in grid infrastructure, building automation, retail automation, personal
electronics, and medical applications.

* * *

[www.ti.com](http://www.ti.com/) _System Design Theory_

# 3 System Design Theory

## 3.1 MPPT Operation

The power output from a photovoltaic (PV) panel depends on a few parameters, such as the irradiation received by the panel, panel voltage, panel temperature, and so forth. The power output also varies continuously throughout the day because of varying conditions.

Figure 3-1 shows the I-V curve and the P-V curve of a solar panel. The I-V curve represents the relationship

between the panel output current and the output voltage. As the I-V curve in Figure 3-1 shows, the panel current is at the maximum when the terminals are shorted and is at the lowest when the terminals are open and unloaded.

I-V curve I SC PMAX I MP

## P-V curve

## Current Power

**Voltage** V MP V OC

**Figure 3-1. Solar Panel Characteristics I-V and P-V Curves**

As Figure 3-1 shows, obtain the maximum power output from the panel represented as P (A) P MAX at a point when the 100 mW / cm2 MAX product of the panel voltage and the panel current is at the maximum. This point is designated as the maximum power point (MPP). 80 mW / cm2 The graphs in Figure 3-2 and Figure 3-3 show examples of how each of the various parameters affect the output IPV power from the solar panel. The graphs also show the variation in the power output of a solar panel as a function 2 of irradiance. Observe in these graphs how the power output from a solar panel increases with the increase 60 mW / cm

in irradiance and decreases with a decrease in irradiance. Also note that the panel voltage at which the MPP 40 mW / cm2(W) PMAX occurs also shifts with the change in irradiance. 2 20 mW / cm2 100 mW / cm

4 5 10 15 20 25 (V) 80 mW / cm2 60 V 2 PV 60 mW / cm PPV 50 40 mW / cm2 40 2 20 mW / cm 30

20 0 5 10 15 20 25 (V) VPV

**Figure 3-2. Solar Panel Output Power Variation Figure 3-3. Solar Panel Output Power Variation**

## Under Different Irradiation Conditions—Graph A Under Different Irradiation Conditions—Graph B

Figure 3-4 shows a typical graph representing the variation in the power output of a photovoltaic panel as a

function of the temperature. Observe how the panel current (and thereby the panel power) decreases with an increase in temperature. The MPP voltage continues to shift substantially with the change in temperature.

TIDUF99 – NOVEMBER 2024 _600W Solar Power Optimizer Reference Design Based on GaN With Wired_ _Submit Document Feedback and Wireless Communication_ Copyright © 2024 Texas Instruments Incorporated

* * *

_System Design Theory_ [www.ti.com](http://www.ti.com/)

4 75°C

3 50°C

Panel Current (A) 2 25°C Irradiance = 1000 W/m2 AM - 1.5 1

0 0 5 10 1 20 25 Voltage Across Panel (V)

**Figure 3-4. Solar Panel I-V Curve Variation With Temperature Under Constant Irradiation Conditions**

Draw the maximum power from a solar panel by operating the panel close to the MPP point; however, doing so poses two challenges:

1. Providing a way to connect a battery or load with a different operating voltage in comparison to the MPP of the panel
2. Identifying the MPP automatically, as the MPP varies with the environmental conditions and is not a constant Directly connecting a solar panel with a VMPP close to 17V to a 12V lead acid battery forces the panel to operate at 12V, which reduces the amount of power that can be drawn from the panel. From this situation, one can surmise that a DC/DC converter is able to draw more power from the solar panel because this converter forces the solar panel to operate close to the VMPP and transfer the power to a 12V lead acid battery (impedance matching). The preceding paragraph explains why the user implements a synchronous buck converter to charge the lead acid battery from the solar panel and address the first challenge. The second challenge of automatically identifying the MPP of the panel is typically performed by employing MPPT algorithms in the system. The MPPT algorithm tries to operate the photovoltaic panel at the maximum power point and uses a switching power stage to supply the load with the power extracted from the panel. Perturb and observe is one of the most popular MPPT algorithms used. The fundamental principle behind this algorithm is simple and easy to implement in a microcontroller-based system. The process involves slightly increasing or decreasing (perturbing) the operating voltage of a panel. Perturbing the panel voltage is accomplished by changing the duty cycle of the converter. Assuming that the panel voltage has been slightly increased and that this leads to an increase in the panel power, then another perturbation in the same direction is performed. If the increase in the panel voltage decreases the panel power, then a perturbation in the negative direction is done to slightly lower the panel voltage. By performing the perturbations and observing the power output, the system begins to operate close to the MPP of the panel with slight oscillations around the MPP. The size of the perturbations determines how close the system is operating to the MPP. Occasionally this algorithm can become stuck in the local maxima instead of the global maxima, but this problem can be solved with minor tweaks to the algorithm. The P&O algorithm is easy to implement and effective, and was chosen for this design.

## 3.2 Power Optimizer Function

A string inverter using multi-panels in series is a mainstream type of solar inverter, the lowest cost per watt makes this method attractive. But this method has the risk of catching fire caused by DC arc due to the high voltage and harsh environment, and the fire is difficult to extinguish. PV panels always produce high voltage even when the string inverter has stopped working since the sun is always there. Also, when some panels are

_600W Solar Power Optimizer Reference Design Based on GaN With Wired_ TIDUF99 – NOVEMBER 2024 _and Wireless Communication Submit Document Feedback_ Copyright © 2024 Texas Instruments Incorporated partially shaded, the output current of the shaded panel decreases, thus, the whole string current decreases
since panels are in series, causing the string power to drop significantly as shown in Figure 3-5.

For example, like the ideal working condition on the left of Figure 3-5, 10 PV panels are in series, each one with
full irradiation can output 600W power, at 40V and 15A. The whole string power is 10 × 600W = 6000W.

When the string is partially shaded like on the middle of Figure 3-5, one panel cannot have full irradiation, the
output current of this panel drops, the string current is 5A now, the whole string power is only 40V × 5A × 10 =
2000W. As a result, total power drops 66.7% just because one panel is shaded. This reduces the profit of the
string inverter a lot, so a power optimizer is needed to help the string inverter solve these conditions.

The right side of Figure 3-5 shows a partially shaded string but power optimizers are installed for each panel.
Although the shaded panel can only output 40V, 5A, the DC/DC circuit of optimizer can boost up the current
to 15A, other panels are not affected. The string power with optimizer is 40V × 5A + 40V × 15A × 9 = 5600W.
Additional 3600W power is saved to generate more profit.

Figure 3-5. PV String Working Conditions With and Without Optimizer

A power optimizer can also better protect the PV string. Since the optimizer is connected independently to each
panel, the high voltage of the DC link is on the output side of the optimizer instead of the PV side. The optimizer
can easily do the rapid shut down (RSD) function, which is mandatory in many countries.

The implemented power line communication uses FSK modulation. In this design a SunSpec RSD receiver is
implemented, similar to the receiver implementation of TIDA-060001 and BOOSTXL-AFE031-DF1. See also the
SunSpec® Rapid Shutdown Transmit and Receive design guide and BOOSTXL-AFE031-DF1 user's guide. A
bidirectional frequency shift keying (FSK) based PLC can be implemented in this reference design.

3.2.1 Power Line Communication (PLC)

* * *

3.3 Four-Switch Buck-Boost Converter

Table 3-1. Specifications for Four-Switch Buck-Boost Converter

| PARAMETER | SPECIFICATIONS | UNIT |
| --- | --- | --- |
| Maximum input voltage | 80 | V |
| Maximum output voltage | 80 | V |
| Maximum current | 18 | A |

This reference design implements a 4-switch buck-boost topology to step up or step down the panel current
to string current, so this reference design can be used in many applications that need to operate module-level
optimization.

This topology can also be configured to a buck topology by using a bypass resistor to bypass the upper switch of
the boost side. This bypass resistor simplifies the design and implementation of both topologies.

Figure 3-6. Configurable Four-Switch Buck-Boost Topology

A stack-carrier modulation is used to generate the PWMs for the 4-switch buck-boost topology, as shown in
Figure 3-6.

The carrier of the buck stage and boost stage is stacked. The buck carrier amplitude is between 0 to 1.05, the
boost carrier amplitude is between 0.95 to 2, so, naturally, these two carriers have an overlapping when the
modulator is between 0.95 to 1.05. Thus, this modulation scheme can seamlessly change from buck mode to
buck-boost mode and boost mode, as shown in Figure 3-7.

Figure 3-7. Four Switch Buck-Boost Topology Modulation Scheme

Adjusting the carrier starting point in C2000 causes a loss of PWM resolution, if using the theoretical
implementation, then the PWM resolution can lose almost 50%, this reduces the performance of the converter.
So in software, this is realized by adjusting the modulator of the boost stage and buck stage, as shown in Figure
3-8, the carrier of boost and buck is still between 0–1, while the modulator is between 0–2. By simply multiplying

12 600W Solar Power Optimizer Reference Design Based on GaN With Wired
and Wireless Communication
Copyright © 2024 Texas Instruments Incorporated [www.ti.com](http://www.ti.com/) _System Design Theory_

the modulator of buck by 0.95, which is equivalent to multiplying the carrier of buck by 1.05. The boost stage is similar; first, subtract the modulator of boost by 0.95, and then, multiply the result by 0.95 to get the final modulator of the boost stage. In Equation 1 and Equation 2, Mbuck is the modulator of the buck stage, Mboost is the modulator of the boost stage:

Mbuck = Mloop × 0 . 95 (1)

Mboost =( Mloop − 0 . 95) × 0 . 95 (2)

Effective Modulator 1

Buck Modulator Boost Modulator

0 0.951.05 2 Set Modulator

**Figure 3-8. Four Switch Buck-Boost Topology Modulation Scheme Implemented in C2000™**

To make this four-switch buck-boost power stage more compact and efficient, the LMG2100R026 half-bridge power stage is selected for this reference design for the high maximum VDS of 93V continuous, 100V pulsed rating, and low Qg and RDS(on) of 12nC and 2.6mΩ, respectively, at a gate voltage of 5V. Also, the 7.0mm × 4.5mm × 0.89mm lead-free package saves a lot of PCB area, and this package is optimized for a smaller high-frequency current loop to provide the very small ringing during the switching period. This is a desirable design for a compact, high power density, and high-efficiency power optimizer of the medium power rating.

## 3.4 Output Inductance

Continuous conduction mode (CCM) is desired to maintain a high efficiency while delivering the constant current required for the string inverter. When the input voltage range, output voltage, and load current are defined, this leaves the inductor value as the design parameter to maintain CCM.

Put simply, define the desired ripple current (ΔI) for the converter. Normally ΔI is 0.2–0.4 times the output current (IO). A value of 0.4 is selected as the coefficient of ripple current.

Considering 18A maximum output current, and ignoring the voltage drop on the FETs and resistance of the inductor gives:

L × TΔI = Vo (3) off

The output voltage at an 18A, 600W condition is about 33.3V, the input voltage can be considered 43V at the maximum power point of the PV panel, then, the output inductance can be derived, 3.48μH. At half load, considering output voltage at an 18A, 300W condition is about 16.7V, the input voltage is also 43V since the MPP voltage at half irradiation is similar with the MPP voltage at full irradiation, the output inductance is about

4.7μH. In the case of the same size, an inductor with smaller inductance can have a larger saturation current. Finally, a
3.6μH inductor is chosen to make the design compact.
TIDUF99 – NOVEMBER 2024 _600W Solar Power Optimizer Reference Design Based on GaN With Wired_ _Submit Document Feedback and Wireless Communication_ Copyright © 2024 Texas Instruments Incorporated

* * *

3.5 Input Capacitance

Select input capacitors carefully to both reduce the size and satisfy the big ripple current capability (see the How
to select input capacitors for a buck converter analog applications journal).
I CAP(SW1 OFF) I SW =I CAP +I IN

To get a satisfied MPPT effect, such as 99.5% of maximum power tracking, the input ripple voltage value needs
to be small, for many panels, when the VI CAP(SW1 ON) is within 97.5%–102.5% of the V, the output power of the panel
panel mpp
I IN
is above 99.5% of maximum power. For most panels, the MPP voltage is higher than 30V. So, 0.75V is taken as
the maximum input ripple voltage (ΔVin).

\\mathsf{V}\_{\\mathsf{p a n e e l}}

\\mathrm{v}\_{\\mathsf{m p p}}

(\\Delta\\mathbb{V}\_{\\mathsf{i n}})

Figure 3-9. Input Current Waveform

The AC current flowing through the input capacitors results in input voltage ripple. Even the majority of the ripple
current goes through MLCC, thanks to the low equivalent series resistance (ESR), ripple voltage results from
this can be ignored. The rest of the ripple current goes through the electrolytic capacitor if the system has one,
although the electrolytic capacitor has a much bigger ESR, the AC current is small, the overall impact for input
voltage ripple is minor.

\\mathrm{C i n}

\\mathrm{C}{ _{N}}\\geq\\frac{\\mathrm{D}\\times\\left(1-\\mathrm{D}\\right)\\times\\mathrm{I}_{0}}{\\Delta\\mathrm{V} _{\\mathrm{i n}}\\times\\mathrm{f}_{\\mathrm{s w}}}

(4)

Where Io is 18A and fsw is 300kHz, Cin needs to be bigger than 20μF. Considering the DC bias effect of the
MLCC as the voltage increases, the actual value taken needs to be larger depending on the practical situation.

\ {bf f}\_{\\mathrm{s w}}

\\mathrm{C i n}

20{upupup\\up F}.

Additionally, the input capacitors also need to meet the thermal stress caused by the ripple current, the bigger
the footprint, the lower the temperature rise. Use Equation 5 to calculate the root mean square (RMS) current of
the input ripple current.

(5)

Duty cycle has a significant impact on the input RMS ripple current. Figure 3-10 is a plot of Input RMS current
to Load Current Ratio versus Duty Cycle, from which the largest ripple current RMS can be observed. The
largest ripple current occurs when the duty cycle is 0.5. The maximum value of Iin\_rms is 9.5A. To reduce the
temperature rise of the MLCC, the 1210 footprint is chosen. Meanwhile, it is better to parallel multiple capacitors
with small capacity than just use one with a bigger capacity.

\\lim\\limits\_{\ arrow m s s}

14 600W Solar Power Optimizer Reference Design Based on GaN With Wired
and Wireless Communication
Copyright © 2024 Texas Instruments Incorporated

* * *

Figure 3-10. Input RMS, Load Current Ratio vs Duty Cycle

Place additional small MLCCs with low equivalent series inductance (ESL) and low ESR as close as possible
to the input side of the FETs, especially using GaN devices with high di/dt and dv/dt slope. These MLCCs can
greatly alleviate overshoot of the switching node waveform without sacrificing efficiency.

Bulk capacitors like aluminum electrolytic capacitors can also be added to satisfy the transient response if the
response speed of the system is important. Because of the high ESR of electrolytic capacitors, the ripple current
can be approximated by dividing the input ripple voltage by the ESR. Also, the waveform is triangular, so the
RMS value can be estimated with Equation 6.

(6)

\\begin{array}{r}{\\mathrm{l\_{b u l k\_r m s}}=\\frac{1}{2\\sqrt{3}}\\times\\frac{\\Delta\\mathrm{V\_{i n}}}{\\mathrm{E S R}}}\\end{array}

Take care when selecting a bulk capacitor due to the low tolerance for RMS current.

3.6 Current Sensor

Table 3-2. Current Sensor Design Criteria

| PARAMETER | SPECIFICATION |
| --- | --- |
| Maximum common-mode voltage | 80V |
| Maximum input current | 18A |
| Maximum output voltage | 3.3V |

This reference design requires accurate measurement of the panel and battery currents to calculate and track
the maximum power point. The design supports panels of up to 80V, so a maximum common-mode voltage of at
least 80V is required.

* * *

3.6.1 Current Measurement Resolution

The sensitivity of TMCS1127B2A is 50mV/A. The current resolution of the amplifier into a 12-bit ADC is given by:

\ {sf\_\_{R\\in S}}=({\\sf V\_{O U T}\ /\ ({D D C M A X\ \\times\ S e r s i t i v i t y}}))=(3.3\ \\lor,(4095\\times,507mathsf{V W/A}))

(7)

IRES = 16.1mA per bit, that is, 1A equals 62.05bit in MCU

3.6.2 Current Sensor Power Dissipation

Equation 8 is the maximum power dissipation calculation:

(8)

P\_{D S S}=I A\_{N A times2}\\times R\_{N N}=(18A)^{2}\\times0.7m O

\\mathsf{P}\_{\\mathsf{D I S S}}=0.23W

3.7 Switching Regulator

This reference design requires 12V for AFE031, 5V for the C2000 control card and GaN device (the
LMG2100R026), subsequently stepped down from 5V to 3.3V for the sampling device and other components, to
operate. To generate the 12V line from the power lines (panel), a wide VIN buck, switching regulator LM5164 is
needed to support a maximum voltage of 80V.

A fly-buck topology based on LMR51410XF, a fixed switching frequency regulator is used to generate two
isolated 5V for the upper FET of LMG2100 to support a 100% duty cycle.

3.8 Bypass Circuit

The bypass circuit plays an important role when the optimizer main circuit or the panel malfunctioning.
Traditional solar power optimizers use a Schottky diode or a P-N junction diode for the bypass circuit. When
the string current is high, the power dissipation of the diode can cause severe thermal issues due to the high
forward voltage drop. To reduce the power dissipation of the bypass circuit, another design is using an active
MOSFET controlled by the MCU, but the normal operation of the MOSFET relies on the MCU.

In this design, a high reliable and low-power dissipation method is used. The design does not rely on the signal
of the MCU for turning on or off, thus the design can bypass the string current with low-power dissipation even
when the MCU is not functioning. LM74610-Q1 is used in this design for stand-alone MOSFET control that can
work autonomously without any external intervention. The How to use an ideal diode controller as a scalable
input bypass switch in solar applications analog design journal article explains the detailed design and working
principle for this method. By adding a depletion MOSFET QD in the sense path, the reverse voltage range of the
ideal diode controller (42V rated) can be easily extended. String current flows through the power MOSFET Q1
which lowers the power dissipation of the bypass circuit.

\ \_\\mathrm{D}

\\mathsf{Q}\_{1}

16 600W Solar Power Optimizer Reference Design Based on GaN With Wired
and Wireless Communication
Copyright © 2024 Texas Instruments Incorporated

* * *

4 Hardware, Software, Testing Requirements, and Test Results

4.1 Hardware Requirements

The hardware of this reference design is composed of the following:

• TIDA-010949
• TMDSCNCD2800137 control card

• TMDSCNCD2800137 control card
• USB Type-C® cable

• USB Type-C® cable
• USB isolator

• USB isolator
• Laptop

• Laptop

The following equipment was used to power and evaluate the board:

• DC power source: ITECH IT6010C-80
• DC load: Chroma 63203A

• DC load: Chroma 63203A
• Power analyzer: YOKOGAWA WT500

• Power analyzer: YOKOGAWA WT500

4.2 Software Requirements

To test the board, see the digital power SDK, TIDA-010949 software, and the software user guide.

Figure 4-1 shows the software flow chart.

Figure 4-1. Software Flow Chart

* * *

4.3 Test Setup

Connect the input to the DC power source and output to the DC load to test the power stage.

If four-switch buck-boost topology is tested instead of buck topology, remove the bypass resistor, see Figure 4-2.

Figure 4-2. Test Connection

In these test results, the extra power consumed by the control card (the power consumption of C2000 is
retained) is subtracted to better reflect the losses and efficiency of a real system.
4.4.1 Short Mode Test Result

In short mode, the DC source is directly connected to the load through the on-resistance of power switch and
passive components on the board. The buck stage duty cycle is 100%, the boost stage duty cycle is 0%. Figure
4-3 shows the block diagram of this mode.

600W Solar Power Optimizer Reference Design Based on GaN With Wired
and Wireless Communication
Copyright © 2024 Texas Instruments Incorporated

* * *

Table 4-1, Table 4-2, and Figure 4-4 show the efficiency for different input voltage and power rating. A value of
33V is chosen because most of the MPPT voltage of the 400W panels is at about this range. A value of 43V is
chosen because this is a representative voltage for the MPPT voltage of 500W and 600W of the panels.

• Peak efficiency for 33Vin is 99.5% from 120W to 240W and full load efficiency at 400W is 99.3%
• Peak efficiency for 43Vin is 99.6% at 250W, full load efficiency at 600W is 99.3%

Table 4-1. TIDA-010949 Short Mode Efficiency, 33Vin

| OUTPUT POWER | 20W | 40W | 80W | 120W | 180w | 240w | 300w | 400w |
| --- | --- | --- | --- | --- | --- | --- | --- | --- |
| Vin=33V | 97.8% | 98.9% | 99.3% | 99.5% | 99.5% | 99.5% | 99.4% | 99.3% |

Table 4-2. TIDA-010949 Short Mode Efficiency, 43VIN

| OUTPUT POWER | 25W | 50W | 100W | 150W | 200W | 250W | 320W | 450W | 500W | 600W |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
| Vin=43V | 97.6% | 98.8% | 99.3% | 99.5% | 99.5% | 99.6% | 99.5% | 99.5% | 99.5% | 99.3% |

4.4.2 Switching Mode Test Result

In switching mode, the power switch starts to switch to operate the active MPPT algorithm. Table 4-3 through
Table 4-5 and Figure 4-5 show the test results for different power ratings and currents.

For 400W panels, set a constant output current at 9A, peak efficiency is achieved at 98.7% for power higher than
300W. At 300W output power, the converter works in buck-boost mode. At 400W output power, the converter
works in boost mode, see Table 4-3. At other power points, the converter works in buck mode.

* * *

Table 4-3. TIDA-010949 Switching Mode Efficiency, 400W

| OUTPUT POWER | 20W | 40W | 80W | 120W | 200W | 300W | 400W |
| --- | --- | --- | --- | --- | --- | --- | --- |
| Vin=33V,Iout=9A | 89.9% | 94.2% | 96.6% | 97.5% | 98.5% | 98.7% | 98.7% |

V\_{\\mathrm{i n}}=33V,

I\_{0sf{t t}}=9A

Table 4-4. TIDA-010949 Switching Mode Efficiency, 500W

| OUTPUT POWER | 25W | 50W | 100W | 150W | 250W | 375W | 500W |
| --- | --- | --- | --- | --- | --- | --- | --- |
| Vin=43V,Iout=12A | 83.9% | 92.3% | 95.8% | 96.8% | 97.8% | 98.7% | 98.8% |

V\_{\\mathrm{i n}}=43V,

1\_{0t}=12A

Table 4-5. TIDA-010949 Switching Mode Efficiency, 600W

| OUTPUT POWER | 30W | 60W | 120W | 180W | 300W | 450W | 600W |
| --- | --- | --- | --- | --- | --- | --- | --- |
| Vin=43V,Iout=15A | 83.8% | 91.6% | 95.2% | 96.4% | 97.6% | 98.5% | 99.0% |
| Vin=43V,Iout=18A | 80.6% | 89.2% | 93.7% | 95.7% | 97.0% | 97.9% | 98.6% |

V\_{\\mathrm{i n}}=4V,

1\_{0sf{t t}}=15\\sf{A}

V\_{\\mathrm{i n}}=43V,

1\_{0t}=18A

Figure 4-5. Switching Mode Efficiency [www.ti.com](http://www.ti.com/) _Hardware, Software, Testing Requirements, and Test Results_

Figure 4-6 shows the switching node waveform in buck stage. Overshoot is very small and there is no obvious

ringing.

**Figure 4-6. No Load Switching Node Waveform, Buck Stage**

**Figure 4-7. Switching Node Waveform Rising Edge Figure 4-8. Switching Node Waveform Falling Edge**

## With Full Load, Buck Stage With Full Load, Buck Stage

TIDUF99 – NOVEMBER 2024 _600W Solar Power Optimizer Reference Design Based on GaN With Wired_ _Submit Document Feedback and Wireless Communication_ Copyright © 2024 Texas Instruments Incorporated

* * *

Figure 4-9 shows the switching node waveform in boost stage. The waveform is also clean.

Figure 4-9. Switching Node Waveform With Full Load, Boost Stage

4.4.3 Bypass Circuit Test Results

Figure 4-10 and Figure 4-11 show the test result of the bypass circuit based on LM746x0-Q1. Channel 2 is the
voltage drop of the bypass circuit. Channel 3 is the gate drive voltage of LM74610-Q1. Channel 4 is the bypass
current.

The waveform illustrates that this design can effectively bypass the string current with very low voltage drop
and provides around a 98.5% duty cycle. This design reduces the power dissipation and improves the system
reliability.

Figure 4-11. Bypass Circuit Test Results–Graph B

* * *

4.4.4 PLC Test Results

Testing the PLC hardware implementation includes validating the coupling circuit and the band-pass filter in the
receive path.

To check the coupling circuit, the impedance was measured using a frequency response analyzer (Venable
Instruments Model 3120). Importantly, the coupling network needs to present a high impedance at the PLC
carrier frequencies and maintains lower impedances outside the communication band. Figure 4-12 shows the
measured impedance. Yellow markers highlight the impedance at the mark and space frequencies of the RSD
PLC protocol.

Figure 4-12. Impedance Coupling Circuit

An additional band-pass filter is implemented in the receive path. In this path it is important that the pass band is
set to the carrier frequencies of the PLC communication. Figure 4-13 shows the measured transfer curve of the
bandpass filter. The pass band is located between 70kHz and 150kHz. The same frequency response analyzer
was used for this measurement.

Figure 4-13. Transfer Curve Band-Pass Filter Receive Path

This design verified the PLC coupling circuit and AFE031 with rapid shutdown function in combination with the
TIDA-060001 reference design. See also SunSpec Rapid Shutdown Transmit and Receive Reference Design.

* * *

5 Design and Documentation Support

5.1.1 Schematics

To download the schematics, see the design files at TIDA-010949.

5.1.2 BOM

To download the bill of materials (BOM), see the design files at TIDA-010949.

5.2 Tools and Software

Tools

TMDSCNCD2800137 TMS320F2800137 evaluation module C2000™ MCU controlCARD™

Software

Code Composer Studio™

Integrated development environment (IDE)

C2000WARE-DIGITALPOWER-SDK DigitalPower software development kit (SDK) for C2000™MCUs

5.3 Documentation Support

1. Texas Instruments, Understanding Buck Power Stages in Switchmode Power Supplies Application Note

2. Texas Instruments, 400-W GaN-Based MPPT Charge Controller and Power Optimizer Reference Design

3. Texas Instruments, 400-W GaN-Based MPPT Charge Controller and Power Optimizer Reference Design
   Guide


5.4 Support Resources

TI E2E™ support forums are an engineer's go-to source for fast, verified answers and design help — straight
from the experts. Search existing answers or ask your own question to get the quick design help you need.

Linked content is provided "AS IS" by the respective contributors. They do not constitute TI specifications and do
not necessarily reflect TI's views; see TI's Terms of Use.

5.5 Trademarks

C2000™, E2E™, SimpleLink™, and TI E2E™ are trademarks of Texas Instruments.
Wi-SUN® is a registered trademark of Wi-SUN Alliance.

Wi-SUN® is a registered trademark of Wi-SUN Alliance.
Zigbee® is a registered trademark of ZigBee Alliance.

Zigbee® is a registered trademark of ZigBee Alliance.
Bluetooth® is a registered trademark of Bluetooth SIG, Inc.

Bluetooth is a registered trademark of Bluetooth SIG, Inc.
Wi-Fi® is a registered trademark of Wi-Fi Alliance.
mioty® is a registered trademark of Fraunhofer-Gesellschaft zur Förderung der angewandten Forschung e.V.

ANDREAS LECHNER is a Systems Engineer for Energy Infrastructure working in Texas Instruments. Andreas
supports customers within the Energy Infrastructure sector worldwide. Andreas earned his master's degree from
the University of Applied Sciences in Landshut, Germany.

Bluetooth® is a registered trademark of Bluetooth SIG, Inc.
Wi-Fi® is a registered trademark of Wi-Fi Alliance.

mioty® is a registered trademark of Fraunhofer-Gesellschaft zur Förderung der angewandten Forschung e.V.
Arm® and Cortex® are registered trademarks of Arm Limited.

VSEVOLOD ELANTSEV is a Systems Engineer for Energy Infrastructure at Texas Instruments Germany.
Vsevolod focuses on power conversion systems. Vsevolod graduated from the South Russian State Technical

Arm and Cortex are registered trademarks of Arm Limited.
SunSpec® is a registered trademark of SunSpec Alliance, Inc.
USB Type-C® is a registered trademark of USB Implementers Forum.

USB Type-C® is a registered trademark of USB Implementers Forum.
All trademarks are the property of their respective owners.

USB Type-C is a registered trademark of USB Implementers Forum.
All trademarks are the property of their respective owners.
6 About the Author

* * *

# IMPORTANT NOTICE AND DISCLAIMER

TI PROVIDES TECHNICAL AND RELIABILITY DATA (INCLUDING DATA SHEETS), DESIGN RESOURCES (INCLUDING REFERENCE DESIGNS), APPLICATION OR OTHER DESIGN ADVICE, WEB TOOLS, SAFETY INFORMATION, AND OTHER RESOURCES “AS IS” AND WITH ALL FAULTS, AND DISCLAIMS ALL WARRANTIES, EXPRESS AND IMPLIED, INCLUDING WITHOUT LIMITATION ANY IMPLIED WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE OR NON-INFRINGEMENT OF THIRD PARTY INTELLECTUAL PROPERTY RIGHTS. These resources are intended for skilled developers designing with TI products. You are solely responsible for (1) selecting the appropriate TI products for your application, (2) designing, validating and testing your application, and (3) ensuring your application meets applicable standards, and any other safety, security, regulatory or other requirements. These resources are subject to change without notice. TI grants you permission to use these resources only for development of an application that uses the TI products described in the resource. Other reproduction and display of these resources is prohibited. No license is granted to any other TI intellectual property right or to any third party intellectual property right. TI disclaims responsibility for, and you will fully indemnify TI and its representatives against, any claims, damages, costs, losses, and liabilities arising out of your use of these resources. TI’s products are provided subject to TI’s Terms of Sale or other applicable terms available either on ti.com or provided in conjunction with such TI products. TI’s provision of these resources does not expand or otherwise alter TI’s applicable warranties or warranty disclaimers for TI products. TI objects to and rejects any additional or different terms you may have proposed. IMPORTANT NOTICE

Mailing Address: Texas Instruments, Post Office Box 655303, Dallas, Texas 75265 Copyright © 2024, Texas Instruments Incorporated