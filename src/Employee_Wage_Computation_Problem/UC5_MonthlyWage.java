package Employee_Wage_Computation_Problem;
import java.util.Random;

public class UC5_MonthlyWage {
    public static void run() {
        int WAGE_PER_HOUR = 20;
        int totalSalary = 0;
        Random rand = new Random();

        for (int day = 1; day <= 20; day++) {
            int empCheck = rand.nextInt(3);
            int empHours;

            switch (empCheck) {
                case 1: empHours = 4; break;
                case 2: empHours = 8; break;
                default: empHours = 0;
            }

            totalSalary += empHours * WAGE_PER_HOUR;
        }

        System.out.println("UC5: Monthly Salary = " + totalSalary);
    }
}
