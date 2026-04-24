package Employee_Wage_Computation_Problem;

import java.util.Random;

public class UC7_ClassMethod {

    public static int computeWage() {
        int WAGE_PER_HOUR = 20;
        int totalHours = 0, totalDays = 0, totalSalary = 0;
        Random rand = new Random();

        while (totalHours <= 100 && totalDays < 20) {
            totalDays++;

            int empCheck = rand.nextInt(3);
            int empHours;

            switch (empCheck) {
                case 1: empHours = 4; break;
                case 2: empHours = 8; break;
                default: empHours = 0;
            }

            totalHours += empHours;
            totalSalary += empHours * WAGE_PER_HOUR;
        }

        return totalSalary;
    }

    public static void run() {
        System.out.println("UC7: Total Wage = " + computeWage());
    }
}
