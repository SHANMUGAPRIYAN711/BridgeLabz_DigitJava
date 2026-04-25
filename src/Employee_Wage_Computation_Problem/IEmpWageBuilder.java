package Employee_Wage_Computation_Problem;

public interface IEmpWageBuilder {

    void addCompany(String name, int wage, int days, int hours);

    void compute();

    int getTotalWage(String name);
}