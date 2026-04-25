package Employee_Wage_Computation_Problem;

public class UC4_SwitchCase {

    public static void run() {
        int emp = (int)(Math.random() * 3);
        int hours = 0;

        switch(emp) {
            case 1: hours = 8; break;
            case 2: hours = 4; break;
            default: hours = 0;
        }

        System.out.println("UC4: Wage = " + (hours * 20));
    }
}