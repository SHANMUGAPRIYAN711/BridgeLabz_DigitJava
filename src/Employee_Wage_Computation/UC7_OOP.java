package Employee_Wage_Computation;

public class UC7_OOP {

    static final int WAGE_PER_HOUR = 20;
    static final int MAX_HOURS = 100;
    static final int MAX_DAYS = 20;

    public static void computeWage() {

        int totalHours = 0, totalDays = 0, totalSalary = 0;

        while (totalHours < MAX_HOURS && totalDays < MAX_DAYS) {
            totalDays++;

            int empCheck = (int)(Math.random() * 3);
            int empHours = (empCheck == 1) ? 8 : (empCheck == 2) ? 4 : 0;

            totalHours += empHours;
            totalSalary += empHours * WAGE_PER_HOUR;
        }

        System.out.println("Final Wage (OOP): " + totalSalary);
    }
}
