package Employee_Wage_Computation_Problem;

public class UC3_PartTime {

    public static void run() {
        int emp = (int)(Math.random() * 3);
        int hours = (emp == 1) ? 8 : (emp == 2) ? 4 : 0;

        System.out.println("UC3: Hours = " + hours);
    }
}