package Employee_Wage_Computation_Problem;

public class UC7_to_UC14 {

    public static void run() {

        IEmpWageBuilder obj = new EmpWageBuilder();

        obj.addCompany("TCS", 20, 20, 100);
        obj.addCompany("Infosys", 25, 22, 120);

        obj.compute();

        System.out.println("UC14: TCS Total = " + obj.getTotalWage("TCS"));
    }
}