package Employee_Wage_Computation_Problem;

import java.util.ArrayList;

public class CompanyEmpWage {

    String name;
    int wage, days, hours;
    int totalWage;

    ArrayList<Integer> daily = new ArrayList<>(); // ✅ ADD THIS

    public CompanyEmpWage(String name, int wage, int days, int hours) {
        this.name = name;
        this.wage = wage;
        this.days = days;
        this.hours = hours;
    }
}