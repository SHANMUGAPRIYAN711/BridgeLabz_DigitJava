package Employee_Wage_Computation;

public class UC2_DailyWage {

    static final int WAGE_PER_HOUR = 20;
    static final int FULL_DAY = 8;

    public static void calculateDailyWage(int isPresent) {

        if (isPresent == 1) {
            int salary = WAGE_PER_HOUR * FULL_DAY;
            System.out.println("Daily Wage: " + salary);
        } else {
            System.out.println("No Wage");
        }
    }
}
