package Employee_Wage_Computation;

public class UC1_Attendance {

    public static int checkAttendance() {
        int isPresent = (int)(Math.random() * 2);

        if (isPresent == 1)
            System.out.println("Employee is Present");
        else
            System.out.println("Employee is Absent");

        return isPresent;
    }
}
