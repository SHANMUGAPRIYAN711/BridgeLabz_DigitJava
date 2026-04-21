package Employee_Wage_Computation;

public class UC3_PartTime {

    static final int WAGE_PER_HOUR = 20;

    public static void calculatePartTime() {

        int empCheck = (int)(Math.random() * 3);
        int empHours = 0;

        if (empCheck == 1)
            empHours = 8;
        else if (empCheck == 2)
            empHours = 4;

        int salary = empHours * WAGE_PER_HOUR;
        System.out.println("Part-Time Salary: " + salary);
    }
}
