package Employee_Wage_Computation_Problem;

public class UC5_MonthlyWage {

    public static void run() {
        int total = 0;

        for(int i = 1; i <= 20; i++) {
            int emp = (int)(Math.random() * 3);
            int hrs = (emp == 1) ? 8 : (emp == 2) ? 4 : 0;

            total += hrs * 20;
        }

        System.out.println("UC5: Monthly Wage = " + total);
    }
}