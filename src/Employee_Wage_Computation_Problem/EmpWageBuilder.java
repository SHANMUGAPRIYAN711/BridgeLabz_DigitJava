package Employee_Wage_Computation_Problem;

import java.util.ArrayList;

public class EmpWageBuilder implements IEmpWageBuilder {

    ArrayList<CompanyEmpWage> list = new ArrayList<>();

    @Override
    public void addCompany(String name, int wage, int days, int hours) {
        list.add(new CompanyEmpWage(name, wage, days, hours));
    }

    @Override
    public void compute() {
        for (CompanyEmpWage c : list) {

            int totalHrs = 0, d = 0;

            while (totalHrs <= c.hours && d < c.days) {
                d++;

                int emp = (int)(Math.random() * 3);
                int hrs = (emp == 1) ? 8 : (emp == 2) ? 4 : 0;

                totalHrs += hrs;

                c.daily.add(hrs * c.wage);
            }

            c.totalWage = totalHrs * c.wage;

            System.out.println(c.name + " Wage: " + c.totalWage);
        }
    }

    @Override
    public int getTotalWage(String name) {
        for (CompanyEmpWage c : list) {
            if (c.name.equals(name)) {
                return c.totalWage;
            }
        }
        return -1;
    }
}