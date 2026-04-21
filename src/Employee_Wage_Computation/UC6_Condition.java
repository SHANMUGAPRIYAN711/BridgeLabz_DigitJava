package Employee_Wage_Computation;

public class UC6_Condition {

    static final int WAGE_PER_HOUR = 20;

    public static void calculateWithCondition() {

        int totalHours = 0, totalDays = 0, totalSalary = 0;

        while (totalHours < 100 && totalDays < 20) {
            totalDays++;

            int empCheck = (int)(Math.random() * 3);
            int empHours = (empCheck == 1) ? 8 : (empCheck == 2) ? 4 : 0;

            totalHours += empHours;
            totalSalary += empHours * WAGE_PER_HOUR;
        }

        System.out.println("Total Wage (Condition): " + totalSalary);
    }
}
