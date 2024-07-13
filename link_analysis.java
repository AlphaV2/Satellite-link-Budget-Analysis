
import java.util.Scanner;

public class link_analysis{
    static final double EARTH_RADIUS = 37506 * 1000; // in meters
    static final double BOLTZMAN_CONSTANT_DBW = -228.6; // in dB

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Uplink input parameters
        System.out.println("Enter uplink frequency (MHz): ");
        double uplinkFrequency = scanner.nextDouble(); // Frequency in MHz
        double uplinkFrequencyHz = uplinkFrequency * 1e6; // Converts to Hz

        System.out.print("Enter Transponder Bandwidth (MHz): ");
        double transponderBandwidthMHz = scanner.nextDouble();
        double transponderBandwidth = transponderBandwidthMHz * 1e6; // Convert MHz to Hz

        System.out.print("Enter Symbol Rate (Msps): ");
        double symbolRateMsps = scanner.nextDouble();
        double symbolRate = symbolRateMsps * 1e6; // Convert Msps to sps

        System.out.print("Enter Roll-off Factor: ");
        double rollOffFactor = scanner.nextDouble();

        System.out.print("Enter Transmitting Antenna Gain (dBi): ");
        double txAntennaGain = scanner.nextDouble();

        // Calculate lambda for uplink frequency
        double lambdaUplink = 3e8 / uplinkFrequencyHz;
        System.out.println("Wavelength (lambda) for uplink frequency: " + lambdaUplink + " meters");

        System.out.print("Enter Optimized Power (dBm): ");
        double optimizedPower = scanner.nextDouble();

        // Calculate EIRP (Effective Isotropic Radiated Power)
        double eirp = optimizedPower + txAntennaGain;
        System.out.println("EIRP: " + eirp + " dBm");

        // Calculate free space path loss
        double distance = EARTH_RADIUS; // Assuming distance is the Earth's radius for this example
        double losspath = (4 * Math.PI * distance / lambdaUplink) * (4 * Math.PI * distance / lambdaUplink);
        double lp_db = 10 * Math.log10(losspath);
        System.out.println("Free Space Path Loss (Lp): - " + lp_db + " dB");

        // Additional link budget calculations can be added here
        // For example, calculating the received power at the receiver, considering the losses

        // Close the scanner
        scanner.close();
    }
}
