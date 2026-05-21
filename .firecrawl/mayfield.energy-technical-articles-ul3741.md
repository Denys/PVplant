[Skip to content](https://www.mayfield.energy/technical-articles/ul3741/#content "Skip to content")

![](data:image/svg+xml,%3Csvg%20xmlns='http://www.w3.org/2000/svg'%20viewBox='0%200%201734%201424'%3E%3C/svg%3E)

## TechnicalArticle

# UnderstandingUL3741andNewRapidShutdownSolutions

Codes and Standards  –
2.8.2023

by Ryan Mayfield

* * *

Rapid shutdown requirements for PV systems have spurred innovations within the industry since the requirement first appeared in the 2014 _National Electrical Code_ ( _NEC_). The requirements imposed by rapid shutdown often seemed ahead of their time. So much so that the 2017 _Code_ provided an allowance to waive a specific subsection for two years to allow the industry to catch up and create products to meet the _Code_. One of these delayed provisions in 2017 allowed systems “listed or field labeled as a rapid shutdown PV array” to provide the necessary limits of PV conductors within the array boundary. The _Code_-making panel (CMP) recognized such a listing would eventually exist and proactively provided the industry with a way to meet this requirement.

Then in 2020, _NEC_ used an informational note bringing attention to UL standard 3741, _Photovoltaic Hazard Control_, specifically to address a method to meet this requirement. As with most standards, UL3741 took several years and revisions before release. The current version of the standard is dated December 8, 2020. It wasn’t until late 2021 that the industry started to see commercially available equipment with the UL3741 listing.

![](data:image/svg+xml,%3Csvg%20xmlns='http://www.w3.org/2000/svg'%20viewBox='0%200%201024%20841'%3E%3C/svg%3E)Image 1. Inverters within the boundary array on a UL3741-approved system with Sollega FR510-6 ballasted racking.

* * *

**UL3741 and the _NEC_**

Before jumping into the application of UL3741 in PV installations, let’s take a step back and look at the _Code_ requirements driving us to the standard. Section 690.12, Rapid Shutdown of PV Systems on Buildings, is familiar to most PV professionals. Regarding the UL3741 standard, our focus is subsection 690.12(B)(2), where the concern is controlling the conductors within the array boundary.

Installing module-level power electronics (MLPEs) on all rooftop arrays has been the most common solution to meet 690.12(B)(2). This installation method was the most straightforward way to limit the voltage of the conductors within the array boundary to less than 80 V within 30 seconds of initiation per 690.12(B)(2)(2). The 80 V threshold effectively eliminated the ability to place modules in series without an MLPE in the circuit before series connections. With the ability to list systems to the UL3741 standard, the options to meet 690.12 for rooftop PV arrays are increasing.

![](data:image/svg+xml,%3Csvg%20xmlns='http://www.w3.org/2000/svg'%20viewBox='0%200%201024%20430'%3E%3C/svg%3E)Figure 1. Rooftop installations have typically included MLPEs to meet rapid shutdown requirements.

The 2023 _NEC_ provides an excellent reference for the UL3741 requirements and installation applications. Many jurisdictions have not adopted the 2023 _Code_ at this time, but I will use it for reference as it provides the best clarity on the subject. UL3741 is also allowed under the 2020 _NEC_. The 2023 version simply offers better language and clarity on the subject.

To begin, 690.4(B) introduces the term “PV hazard control system (PVHCS)” in 2023. It’s also worth noting that all definitions have been pulled from individual articles in 2023 and moved to Article 100. In this case, PVHCS does not appear in Article 100. Therefore the only references for this new term are in 690.4, 690.12, and 690.31.

690.12(B)(2) calls out the use of these PVHCSs to “provide shock hazard control for firefighters” as one method to meet the requirements to control the conductor limits within the array boundary. The addition of “provide shock hazard control for firefighters” is also added to 690.12(B)(2) to help clarify the purpose of these systems and who they serve. UL3741 provides an alternative to the previous sole solution of utilizing MLPEs on all rooftop PV arrays to meet the 690.12 requirements for conductors inside the array boundary.

[![](data:image/svg+xml,%3Csvg%20xmlns='http://www.w3.org/2000/svg'%20viewBox='0%200%201024%20146'%3E%3C/svg%3E)](https://courses.mayfield.energy/offers/ZBxkwokv/checkout?utm_source=Technical+Article&utm_medium=Banner&utm_campaign=Workshop_Blog_Banner)

**UL3741 Overview**

The premise of UL3741 was to define electrical hazards firefighters encounter when interacting with PV systems. The _NEC_ threshold of reducing the conductors’ voltage within the array boundary to less than 80 V was never fully substantiated on actual risk to firefighters. UL formed a standards technical panel (STP) and engaged industry stakeholders, Sandia National Laboratories, and the US Department of Energy to gather data to define the hazards.

The result was empirical data measuring the potential shock hazards and risks firefighters face when interacting with PV arrays. The STP developed numerous parameters to substantiate the shock hazards imposed on firefighters. Items included the electrical resistance of standard, OSHA-required safety gear; the electrical body resistance of adult male and female firefighters; and the potential current pathways through a firefighter under various conditions.

This work culminated in defining shock hazards that accounted for voltage, current and resistance measurements. The result is a repeatable test method to ensure consistent and verifiable results. To pass the testing, manufacturers must prove that firefighters will not be exposed to shock hazards in various scenarios, including when firefighters fall on PV equipment with tools in their hands.

* * *

**Applying 3741 and the _NEC_**

The solar industry has not implemented this new standard broadly, at least not yet. Few products have completed the testing to date, but this solution will pick up. For example, MLPE manufacturers have listed their products to UL3741, allowing multiple modules in a series string. In addition, racking manufacturers have systems that enable string voltages up to 1,000 Vdc without using MLPEs. These are both deviations from what has become the norm of rooftop PV array installations.

![](data:image/svg+xml,%3Csvg%20xmlns='http://www.w3.org/2000/svg'%20viewBox='0%200%201024%20430'%3E%3C/svg%3E)Figure 2. UL3741 listed systems may allow for the elimination of MLPEs on rooftop installations.

The $64,000 question is, “how do I, as a designer and installer, apply this to my installations?” _Code_ doesn’t give us a lot, other than a mention of following the manufacturer’s instructions in an informational note in 690.12(B)(2)(1). And expecting PV installers and code officials to read through UL standards is not realistic. But if you are interested, you can register for UL’s Digital View and read any UL standard you desire for free.

Ultimately, it comes down to reading the installation manual for the listed piece of equipment to understand the installation requirements. Manufacturers are required to list all the “critical components” for the installation to meet UL3741. Depending on the exact system, this may include specific accessories for the racking system, particular inverters, and even requirements for the wire clips. These details are essential, as the manufacturers used particular materials and configurations to meet the testing requirements.

Another resource for this information is the certification the testing laboratory provides to the manufacturer upon successfully completing the test. These certificates will include any specific components required to comply. Agencies such as [UL](https://productiq.ulprospector.com/en/search?term=QIJR&page=1) and [Intertek](https://ramuk.intertekconnect.com//WebClients/ITS/DLP/products.nsf/vwSearch?SearchView&Query=FIELD%20ListHead%20Contains%203741%20or%20FIELD%20CatCode%20Contains%203741%20or%20FIELD%20Title%20Contains%203741%20or%20FIELD%20ProductInformation%20Contains%203741%20or%20FIELD%20ProductInfo%20Contains%203741&SearchOrder=1&SearchMax=1000&SearchWV=FALSE&SearchThesaurus=FALSE&SearchFuzzy=FALSE) have informational directories for the equipment they test on their websites.

Understanding what defines the critical components and how they relate to the listing is probably the most confusing and challenging part of applying UL3741. The standard goes into great detail to define the various hazard levels and the probabilities associated with firefighter exposure to these hazards. This results in multiple pathways for manufacturers to meet the standard.

For example, suppose a manufacturer can test their system and prove the shock hazard experienced under a set of worst-case scenarios does not exceed Hazard Level 1 as defined in Table 8 of UL3741. In that case, the system requires no further testing or protection. Hazard Level 1 defines the maximum direct current exposure to firefighters without strong involuntary muscular reactions. This test method will allow many MLPE manufacturers to meet the standard without needing additional installation requirements, such as specific racking requirements or specific protections associated with wiring. Current MLPE options allow two crystalline modules wired in series and comply with this method.

The standard provides additional pathways for compliance when the system can experience a Hazard Level 2 or greater. The standard will require additional protections and installation methods, such as specific wire guarding, racking systems, and wire management. Multiple racking companies have used this method to pass UL3741 without using MLPEs.

For those interested, Appendix F in UL3741 provides examples of the calculations and methods used for the two scenarios mentioned. The appendix offers what constitutes the worst-case scenario and how the STP used a combination of current and multiple resistance levels to determine the maximum allowable voltages.

* * *

**Conclusion**

UL3741 systems go against the grain of “typical” installations, so installers can expect some pushback from jurisdictions. As with many other advances within our industry, this will require patience and education to code officials and the firefighting community. Overall, the transition to providing systems that offer shock hazard control for firefighters in a defined way is good for the industry.

* * *

_Contact our team to inquire about Mayfield Renewables services—including system design, specialized consulting and educational programs._ [_Contact us_](https://www.mayfield.energy/about-us/#get-a-quote) _to start a project or learn more._

[Previous Post](https://www.mayfield.energy/technical-articles/sixhandlerule/) [Next Post](https://www.mayfield.energy/technical-articles/2023-nec-updates-for-energy-storage-systems/)

## ConsultingEngineering

![Two solar engineers review electrical control panel during professional system inspection.](data:image/svg+xml,%3Csvg%20xmlns='http://www.w3.org/2000/svg'%20viewBox='0%200%201024%20579'%3E%3C/svg%3E)

Our professional services cover every stage from feasibility to commissioning for commercial & industrial (C&I), microgrid, and small utility-scale projects.

[Learn More](https://www.mayfield.energy/consulting-engineering/)

## Education&Training

![Audience attends solar and microgrid engineering education summit presentation in modern conference auditorium.](data:image/svg+xml,%3Csvg%20xmlns='http://www.w3.org/2000/svg'%20viewBox='0%200%201024%20768'%3E%3C/svg%3E)

Mayfield's experts fulfill our commitment to educational excellence by presenting black-and-white technical concepts in dynamic, living color.

[Learn More](https://www.mayfield.energy/solar-storage-education-trainings/)

## TechnicalArticles

![Solar and microgrid engineers at Mayfield Renewables review detailed construction blueprints during collaborative project planning.](data:image/svg+xml,%3Csvg%20xmlns='http://www.w3.org/2000/svg'%20viewBox='0%200%201024%20576'%3E%3C/svg%3E)

We transform complex topics into actionable insights through high-quality digital content focused on codes, standards, and best practices.

[Learn More](https://www.mayfield.energy/technical-articles/)

![](data:image/svg+xml,%3Csvg%20xmlns='http://www.w3.org/2000/svg'%20viewBox='0%200%202048%20505'%3E%3C/svg%3E)

[Contact Us](http://www.mayfield.energy/contact/)

![](data:image/svg+xml,%3Csvg%20xmlns='http://www.w3.org/2000/svg'%20viewBox='0%200%20500%20500'%3E%3C/svg%3E)

2210 NW Hayes Ave.

Corvallis, OR

[541.754.2001](tel:5417542001)

[hello@mayfield.energy](mailto:hello@mayfield.energy?subject=Hello%20Mayfield&body=Hi%20there%2C%0D%0A%0D%0AI%27m%20interested%20in%20learning%20more%20about%20your%20services.%0D%0A%0D%0AThanks%2C%0D%0A%5BYour%20Name%5D)

**Let’s Talk**

[Contact Us](http://www.mayfield.energy/contact/)

**Company**

[About Us](http://www.mayfield.energy/who-we-are/)

[Careers](http://www.mayfield.energy/careers/)

**[Stay Connected](https://www.mayfield.energy/technical-articles/ul3741/#newsletter)**

Plug into our monthly newsletter for the latest technical updates on solar and energy storage.

Name

FirstLast

Company

Specify your company type.

Specify your company type.ManufacturerEPCDeveloperEngineering FirmSoftware ProviderEducation & TrainingUtilityGovernmentField Service O&MFinanceDistributorConsultingMarketingNon-profitOther

Email(Required)

- [LinkedIn](https://www.linkedin.com/company/mayfieldenergy)
- [Instagram](https://www.instagram.com/mayfieldrenewables/)
- [YouTube](https://www.youtube.com/@MayfieldRenewables)

* * *

@2026 Mayfield Renewables

[Privacy Policy](http://www.mayfield.energy/privacy-policy/)

Give credit to our work if you use it.

Founded in 1922, Socomec is an industrial group with a workforce of 4800 people. Their core business – the availability, control and safety of low voltage electrical networks with increased focus on their customers’ power performance.

Learn more: [https://www.socomec.us/en-us](https://www.socomec.us/en-us)

×

Yaskawa Solectria Solar, a wholly owned subsidiary of Yaskawa America, Inc., is the largest U.S.-based inverter manufacturer, with design and engineering offices in Lawrence, MA, and world-class production facilities in Buffalo Grove, IL and Franklin, WI. With over 20+ years of experience Yaskawa Solectria Solar is the only PV inverter designed, made, and serviced in the USA.

Learn more: [https://www.solectria.com/](https://www.solectria.com/)

×

Anza is a revolutionary platform that empowers solar and energy storage equipment buyers and developers to use advanced data and technology to see more options, reduce risk, increase project profits, and save massive amounts of time. Anza enables clients to spend more time creating value and less time chasing down data and using manual tools.

Learn more: [https://www.anzarenewables.com/](https://www.anzarenewables.com/)

×

CleanSource Capital is a specialty finance firm offering program administration, financial advisory, investment management, and project development services to the clean energy and environmental sustainability sectors.

Learn more: [https://cleansourcecap.com/](https://cleansourcecap.com/)

×

The Midwest Renewable Energy Association (MREA) is a nonprofit organization that promotes clean energy, energy efficiency, and sustainable living through education and demonstration.

Learn more: [https://midwestrenew.org/](https://midwestrenew.org/)

×

Atar Fire offers expert services in fire, building, and NFPA code consulting. They specialize in NFPA 855 training and renewable energy technologies such as energy storage systems, hydrogen, and photovoltaic systems. Nick Bartlett will be leading the education session covering Hazard Mitigation Analysis as this is a key service he provides.

Learn more: [https://www.atarfire.com/](https://www.atarfire.com/)

×

ComAp provides smart power control solutions and services that are highly flexible, intuitive, and scalable. Designing solutions for independent and backup power generation markets, including energy management services and software.

Learn more: [https://www.comap-control.com/](https://www.comap-control.com/)

×

With over 20 years of expertise, Pytes is a leading  developer and manufacturer of Lithium-ion battery packs and cells.

To learn more about Pytes, visit: [https://www.pytesusa.com/](https://www.pytesusa.com/)

**Pytes is a proud sponsor of the “Design Considerations for Energy Storage Systems” session.**

×

## Mayfield/Elexity–WhitePaperDownload

"\*" indicates required fields

X/Twitter

This field is for validation purposes and should be left unchanged.

Name\*

First NameLast Name

Email\*

Job Title

Company Name

×

**Kronus Engineering** is on a mission to power the clean energy transition by developing customizable turnkey battery energy storage systems in the C&I space with an unwavering commitment to high-quality, innovative solutions, and reliable customer service. Kronus is not a product company, but a rather highly skilled engineering firm that dedicates it’s time to thoughtfully designing, building, and commissioning high quality BESS solutions, all assembled in the USA. Our systems reduce reliance on fossil fuel generators, provide backup power during grid outages, enable demand management, and maximize the use of solar and other renewable energy sources.

To learn more about Kronus Engineering, visit: [www.kronusengineering.com/](http://www.kronusengineering.com/)

CLOSE

Fortress Power is a US-based manufacturer that specializes in advanced energy storage products designed for off-grid and battery backup applications. Fortress Power offers a variety of battery sizes and configurations to meet the power needs of both households and businesses.

To learn more about Fortress Power, visit: [https://www.fortresspower.com/](https://www.fortresspower.com/)

×

Xendee is an award-winning software platform built to integrate the feasibility analysis and proposal building, portfolio assessment, detailed engineering, and operation of Distributed Energy Resources and EV fast-charging infrastructure. It is the only integrated provider of microgrid design and Artificial Intelligence-based microgrid operation optimization software.

To learn more about Xendee, visit: [https://xendee.com/](https://xendee.com/)

**Xendee is a proud sponsor of the “An Introduction to Microgrid Systems” session.**

×

Eaton is an intelligent power management company dedicated to protecting the environment and improving the quality of life for people everywhere. We make products for the data center, utility, industrial, commercial, machine building, residential, aerospace and mobility markets. We are guided by our commitment to do business right, to operate sustainably and to help our customers manage power ─ today and well into the future. By capitalizing on the global growth trends of electrification and digitalization, we’re helping to solve the world’s most urgent power management challenges and building a more sustainable society for people today and generations to come.

Learn more: [https://www.eaton.com/us/en-us.html](https://www.eaton.com/us/en-us.html)

×

For over 40 years, SMA has been recognized as a global leader in the development of the renewable energy market. Known for its superior manufacturing of solar inverters, over the past three years it has expanded that expertise into offering a complete renewable solution including energy storage, management and connected, innovative technology.

Learn more: [https://www.sma-america.com/](https://www.sma-america.com/)

×

Elexity is building the next generation energy management platform, focused on the needs of an electrified world powered by renewable energy.

Learn more: [https://www.elexity.io/](https://www.elexity.io/)

×

Generac is a leading energy technology company committed to powering a smarter world. Founded in 1959, Generac introduced the first affordable backup generator and later created the category of automatic home standby generators. Their purpose is to lead the evolution to a more resilient, efficient, and sustainable world through our backup and prime power systems. As a company, they are committed to sustainable, cleaner energy products poised to revolutionize the 21st century electrical grid.

Learn more: [https://www.generac.com/](https://www.generac.com/)

**Generac is a proud sponsor of the “A Deep Dive into Microgrid Controls” session.**

×

SolArk puts a strong emphasis on education & training both internally and for their customers. SolArk is a global energy technology leader with over 6 generations of hybrid inverters. Backed by a vast ecosystem of thousands of partners worldwide, including distributors, installers, EPCs, integrators, and battery manufacturers. They are the trusted inverter choice for quality systems across the industry landscape.

Learn more: [https://www.sol-ark.com/](https://www.sol-ark.com/)

**SolArk is a proud sponsor of the “Large-Scale Fire Testing Updates for Energy Storage Systems” session.**

×

ELM Companies is a technology based team that provides compliant products and services to various sectors, including utilities, manufacturing, construction, and others, to enhance grid reliability and streamline distribution.

Learn more: [https://elmllc.com/](https://elmllc.com/)

**ELM is a proud sponsor of the “UL 3141 and Energy Management with Power Control Systems” session.**

×

Washington Solar Energy Industries Association (WASEIA) is a professional trade association established to represent the common business interests of its members, particularly related to public policy, legislation, and governmental relations. WASEIA plays a crucial role in promoting solar power policies, collaboration within the industry, and educating the public about the benefits of solar energy.

Learn more: [https://waseia.org/](https://waseia.org/)

×

GridVest makes energy storage systems accessible and affordable, empowering businesses, communities, and utilities to lower energy costs and transition to renewable energy.

Learn more: [https://gridvest.com/](https://gridvest.com/)

**GridVest is a proud sponsor of the “Microgrid Developer Roadmap” session.**

×

NABCEP is a highly esteemed and widely recognized certification organization for professionals in the renewable energy field. They offer the gold standard in certifications and credentials for skilled professionals, specialists, inspectors and those new to working in the industry.

Learn more: [https://www.nabcep.org/](https://www.nabcep.org/)

×

Media Partner

Solar Builder Magazine is a trusted source for the latest solar news in North America since 2011. They focus on the installation and construction of solar PV systems, covering the latest PV technology and providing installers and contractors with tips and tools to make informed purchasing decisions.

Learn more: [https://solarbuildermag.com/](https://solarbuildermag.com/)

×

Marketing Sponsor

Outfit, is a cleantech marketing agency, that works with leading project developers, manufacturers, and B2B service providers in the energy transition.

Learn more: [https://www.weoutfit.co/](https://www.weoutfit.co/)

×

Solar Energy International (SEI) is dedicated to empowering students, alumni, and partners to cultivate a diverse, inclusive, well-trained, and educated solar workforce, as well as to promote the safe deployment of industry-leading technology. SEI has provided leading in-person training at their facility in Peonia, Colorado for decades as well as their platform for online learning.

Learn more: [https://www.solarenergy.org/](https://www.solarenergy.org/)

×

HeatSpring is one of the leading providers of clean energy certifications like NABCEP, OSHA, FAA, and others. The HeatSpring platform includes over 300+ courses serving a community of over 118,500+ professionals.

Learn more: [https://www.heatspring.com/](https://www.heatspring.com/)

×

Megger Renewables is dedicated to supporting a sustainable energy future with advanced testing, monitoring, and diagnostic solutions for renewable systems like solar and energy storage. We address key challenges across renewables, including cable and generator faults, power quality issues, and transformer insulation deterioration, ensuring secure operations and longer asset lifespans.

Their solar testing solutions maintain the efficiency and reliability of photovoltaic systems, while their energy storage tools provide insights to optimize battery health and energy use.

With over 130 years of expertise, Megger offers renewable energy leaders a comprehensive range of solutions to protect their investments and deliver clean, reliable power.

Learn more: [https://www.megger.com/en-us](https://www.megger.com/en-us)

×

CPS America

CPS America (Chint Power Systems America) is the leading U.S. supplier of 3-phase string inverters for commercial, industrial, and utility-scale solar projects. With over 10 gigawatts installed across 20,000+ sites nationwide, CPS has maintained the #1 market share in its category for seven consecutive years. Headquartered in Richardson, Texas, with additional offices in New Jersey and California, CPS America delivers innovative, cost-effective solutions—including high-power 1500V string inverters and integrated energy storage systems—that enhance energy production and system reliability.

×

## MicrogridFeasibilityStudies-SampleReport

"\*" indicates required fields

Instagram

This field is for validation purposes and should be left unchanged.

Name\*

First NameLast Name

Email\*

Job Title

Company Name

×

Search for: