# HeatMod
## A general purpose Heat transfer & energy Library
**The plan**
Heat is pushed
Will try to average temperature out over a system

* IHeatGenerator
  * Creates Heat
* IHeatAcceptor
  * Can take heat in from specified side(s)
* IHeatProvider
  * Will attempt to output heat from specified side(s)
* IHeatDiffuser
  * Leaks heat from the system to the ambient environment
* IHeatContainer
  * Can store heat internally
  * Has a thermal capacity (J/K)
  * and a thermal conductivity (%)
* IHeatInsulator
  * Will not allow heat (ambient or otherwise) to transfer through
  * Perhaps has an efficiency