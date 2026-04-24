package Employee_Wage_Computation_Problem;
import java.util.Random;

public class UC4_SwitchCase {
    public static void run() {
        int WAGE_PER_HOUR = 20;
        Random rand = new Random();

        int empCheck = rand.nextInt(3);
        int empHours;

        switch (empCheck) {
            case 1: empHours = 4; break;
            case 2: empHours = 8; break;
            default: empHours = 0;
        }

        System.out.println("UC4: Wage = " + (empHours * WAGE_PER_HOUR));
    }
}