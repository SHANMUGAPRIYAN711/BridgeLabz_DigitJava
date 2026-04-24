package Employee_Wage_Computation_Problem;

import java.util.Random;

public class UC2_DailyWage {
    public static void run() {
        int IS_PRESENT = 1;
        int WAGE_PER_HOUR = 20;
        int FULL_DAY_HOUR = 8;

        Random rand = new Random();
        int empCheck = rand.nextInt(2);

        int wage = (empCheck == IS_PRESENT) ? WAGE_PER_HOUR * FULL_DAY_HOUR : 0;

        System.out.println("UC2: Daily Wage = " + wage);
    }
}
