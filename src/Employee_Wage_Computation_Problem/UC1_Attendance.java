package Employee_Wage_Computation_Problem;

public class UC1_Attendance {

    public static void run() {
        int empCheck = (int)(Math.random() * 2);

        if (empCheck == 1)
            System.out.println("UC1: Present");
        else
            System.out.println("UC1: Absent");
    }
}