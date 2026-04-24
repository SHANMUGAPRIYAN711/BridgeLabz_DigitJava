package Employee_Wage_Computation_Problem;

import java.util.Random;

public class UC1_CheckAttendance {
    public static void run() {
        int IS_PRESENT = 1;
        Random rand = new Random();

        int empCheck = rand.nextInt(2);

        if (empCheck == IS_PRESENT)
            System.out.println("UC1: Employee is Present");
        else
            System.out.println("UC1: Employee is Absent");
    }
}
