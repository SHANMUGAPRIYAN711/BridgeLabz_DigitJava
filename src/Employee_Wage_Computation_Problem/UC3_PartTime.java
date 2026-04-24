package Employee_Wage_Computation_Problem;

import java.util.Random;

public class UC3_PartTime {
    public static void run() {
        int WAGE_PER_HOUR = 20;

        Random rand = new Random();
        int empCheck = rand.nextInt(3);

        int empHours = 0;

        if (empCheck == 1)
            empHours = 4;
        else if (empCheck == 2)
            empHours = 8;

        int wage = empHours * WAGE_PER_HOUR;

        System.out.println("UC3: Wage = " + wage);
    }
}
