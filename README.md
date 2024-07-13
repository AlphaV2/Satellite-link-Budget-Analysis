# Satellite-link-Budget-Analysis
Link budget analysis evaluates the performance of a communication link by accounting for all gains and losses from the transmitter to the receiver. It includes parameters like transmitted power, antenna gains, and path losses to determine the received signal strength. This analysis ensures the communication link meets the required signal quality and reliability standards.Budget Analysis consists of 
# -UP-LINKING AND DOWN-LINKING 
# Uplinking Analysis
This Java program performs uplink analysis for satellite communication systems. It calculates key parameters such as the Effective Isotropic Radiated Power (EIRP) and Free Space Path Loss (Lp) based on user inputs. The uplink frequency, transponder bandwidth, symbol rate, roll-off factor, and transmitting antenna gain are essential parameters considered in this analysis.
Elements Used in the Code:
Uplink Frequency: The frequency at which the signal is transmitted from the ground station to the satellite. The program accepts this input in MHz and converts it to Hz for calculations.

Transponder Bandwidth: The bandwidth of the transponder on the satellite, which determines the range of frequencies it can handle. This input is also in MHz and converted to Hz.

Symbol Rate: The rate at which symbols are transmitted, measured in Msps (Mega symbols per second).

Roll-off Factor: A factor that describes the bandwidth expansion in a filter used in digital communication systems.

Transmitting Antenna Gain: The gain of the antenna used for transmission, measured in dBi.

Optimized Power: The power output of the transmitter, measured in dBm.

Wavelength (Lambda): Calculated for the uplink frequency to determine the wavelength of the transmitted signal.

Effective Isotropic Radiated Power (EIRP): The total power radiated by an antenna in all directions, measured in dBm. This is calculated using the optimized power and the antenna gain.

Free Space Path Loss (Lp): The loss of signal strength as it propagates through free space, measured in dB. This is calculated using the distance (Earth's radius in this example) and the wavelength.
