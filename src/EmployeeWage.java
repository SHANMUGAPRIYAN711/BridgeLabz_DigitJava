public class EmployeeWage {

    static final int WAGE_PER_HOUR = 20;
    static final int FULL_DAY_HOUR = 8;
    static final int PART_TIME_HOUR = 4;
    static final int MAX_WORKING_DAYS = 20;
    static final int MAX_WORKING_HOURS = 100;

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation\n");

        uc1();
        uc2();
        uc3();
        uc4();
        uc5();
        uc6();
    }

    // UC1: Check Employee Attendance
    static void uc1() {
        System.out.println("UC1: Employee Attendance");

        int isPresent = (int)(Math.random() * 2);

        if (isPresent == 1) {
            System.out.println("Employee is Present");
        } else {
            System.out.println("Employee is Absent");
        }
        System.out.println();
    }

    // UC2: Calculate Daily Wage
    static void uc2() {
        System.out.println("UC2: Daily Wage");

        int isPresent = (int)(Math.random() * 2);

        if (isPresent == 1) {
            int dailyWage = WAGE_PER_HOUR * FULL_DAY_HOUR;
            System.out.println("Employee Present → Daily Wage: " + dailyWage);
        } else {
            System.out.println("Employee Absent → Daily Wage: 0");
        }
        System.out.println();
    }

    // UC3: Add Part-Time Employee
    static void uc3() {
        System.out.println("UC3: Part-Time or Full-Time");

        int empType = (int)(Math.random() * 3);
        int empHours = 0;

        if (empType == 1) {
            empHours = FULL_DAY_HOUR;
            System.out.println("Full-Time Employee");
        } else if (empType == 2) {
            empHours = PART_TIME_HOUR;
            System.out.println("Part-Time Employee");
        } else {
            System.out.println("Employee Absent");
        }

        int wage = empHours * WAGE_PER_HOUR;
        System.out.println("Wage: " + wage);
        System.out.println();
    }

    // UC4: Using Switch Case
    static void uc4() {
        System.out.println("UC4: Using Switch Case");

        int empCheck = (int)(Math.random() * 3);
        int empHours;

        switch (empCheck) {
            case 1:
                empHours = FULL_DAY_HOUR;
                System.out.println("Full-Time Employee");
                break;
            case 2:
                empHours = PART_TIME_HOUR;
                System.out.println("Part-Time Employee");
                break;
            default:
                empHours = 0;
                System.out.println("Employee Absent");
        }

        int wage = empHours * WAGE_PER_HOUR;
        System.out.println("Wage: " + wage);
        System.out.println();
    }

    // UC5: Monthly Wage (20 Days)
    static void uc5() {
        System.out.println("UC5: Monthly Wage");

        int totalWage = 0;

        for (int day = 1; day <= MAX_WORKING_DAYS; day++) {
            int empCheck = (int)(Math.random() * 3);
            int empHours;

            switch (empCheck) {
                case 1: empHours = FULL_DAY_HOUR; break;
                case 2: empHours = PART_TIME_HOUR; break;
                default: empHours = 0;
            }

            totalWage += empHours * WAGE_PER_HOUR;
        }

        System.out.println("Total Monthly Wage: " + totalWage);
        System.out.println();
    }

    // UC6: Wage till condition (100 hours / 20 days)
    static void uc6() {
        System.out.println("UC6: Wage till Condition");

        int totalHours = 0;
        int totalDays = 0;
        int totalWage = 0;

        while (totalHours <= MAX_WORKING_HOURS && totalDays < MAX_WORKING_DAYS) {
            totalDays++;

            int empCheck = (int)(Math.random() * 3);
            int empHours;

            switch (empCheck) {
                case 1: empHours = FULL_DAY_HOUR; break;
                case 2: empHours = PART_TIME_HOUR; break;
                default: empHours = 0;
            }

            totalHours += empHours;
            totalWage += empHours * WAGE_PER_HOUR;
        }

        System.out.println("Total Working Days: " + totalDays);
        System.out.println("Total Working Hours: " + totalHours);
        System.out.println("Total Wage: " + totalWage);
        System.out.println();
    }
}
