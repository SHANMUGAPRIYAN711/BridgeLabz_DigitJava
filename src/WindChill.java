import java.util.*;

class WindChill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter temperature (F): ");
        double t = sc.nextDouble();

        System.out.print("Enter wind speed (mph): ");
        double v = sc.nextDouble();

        // Validation
        if (Math.abs(t) > 50 || v < 3 || v > 120) {
            System.out.println("Invalid input range for wind chill calculation.");
            return;
        }

        double windChill = 35.74 + (0.6215 * t) +
                (0.4275 * t - 35.75) * Math.pow(v, 0.16);

        System.out.println("Wind Chill: " + windChill + " °F");
    }
}