package Employee_Wage_Computation_Problem;

import java.util.Random;

public class UC8_MultipleCompany {

    public static int computeWage(int wagePerHour, int maxDays, int maxHours) {
        int totalHours = 0, totalDays = 0, totalSalary = 0;
        Random rand = new Random();

        while (totalHours <= maxHours && totalDays < maxDays) {
            totalDays++;

            int empCheck = rand.nextInt(3);
            int empHours;

            switch (empCheck) {
                case 1: empHours = 4; break;
                case 2: empHours = 8; break;
                default: empHours = 0;
            }

            totalHours += empHours;
            totalSalary += empHours * wagePerHour;
        }

        return totalSalary;
    }

    public static void run() {
        System.out.println("UC8: Company A Wage = " + computeWage(20, 20, 100));
        System.out.println("UC8: Company B Wage = " + computeWage(25, 22, 120));
    }
}