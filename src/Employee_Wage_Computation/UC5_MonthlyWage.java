package Employee_Wage_Computation;

public class UC5_MonthlyWage {

    static final int WAGE_PER_HOUR = 20;

    public static void calculateMonthlyWage() {

        int totalSalary = 0;

        for (int day = 1; day <= 20; day++) {
            int empCheck = (int)(Math.random() * 3);
            int empHours = (empCheck == 1) ? 8 : (empCheck == 2) ? 4 : 0;

            totalSalary += empHours * WAGE_PER_HOUR;
        }

        System.out.println("Monthly Wage: " + totalSalary);
    }
}
