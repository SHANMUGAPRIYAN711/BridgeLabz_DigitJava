package Employee_Wage_Computation;

public class UC4_SwitchCase {

    static final int WAGE_PER_HOUR = 20;

    public static void calculateUsingSwitch() {

        int empCheck = (int)(Math.random() * 3);
        int empHours;

        switch (empCheck) {
            case 1:
                empHours = 8;
                break;
            case 2:
                empHours = 4;
                break;
            default:
                empHours = 0;
        }

        int salary = empHours * WAGE_PER_HOUR;
        System.out.println("Switch Case Salary: " + salary);
    }
}
