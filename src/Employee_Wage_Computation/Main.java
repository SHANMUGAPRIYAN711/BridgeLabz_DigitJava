package Employee_Wage_Computation;

public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to Employee Wage Computation Program");

        // UC1
        int attendance = UC1_Attendance.checkAttendance();

        // UC2
        UC2_DailyWage.calculateDailyWage(attendance);

        // UC3
        UC3_PartTime.calculatePartTime();

        // UC4
        UC4_SwitchCase.calculateUsingSwitch();

        // UC5
        UC5_MonthlyWage.calculateMonthlyWage();

        // UC6
        UC6_Condition.calculateWithCondition();

        // UC7
        UC7_OOP.computeWage();
    }
}