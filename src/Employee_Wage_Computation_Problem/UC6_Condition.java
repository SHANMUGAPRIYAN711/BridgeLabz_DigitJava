package Employee_Wage_Computation_Problem;

public class UC6_Condition {

    public static void run() {

        int totalHrs = 0, days = 0;

        while(totalHrs <= 100 && days < 20) {
            days++;

            int emp = (int)(Math.random() * 3);
            int hrs = (emp == 1) ? 8 : (emp == 2) ? 4 : 0;

            totalHrs += hrs;
        }

        System.out.println("UC6: Total Wage = " + (totalHrs * 20));
    }
}