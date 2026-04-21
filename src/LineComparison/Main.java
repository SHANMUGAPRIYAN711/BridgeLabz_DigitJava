public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to Line Comparison Computation Program");

        // UC1
        double length1 = UC1_Length.calculateLength(0, 0, 3, 4);
        double length2 = UC1_Length.calculateLength(1, 1, 4, 5);

        System.out.println("Length1: " + length1);
        System.out.println("Length2: " + length2);

        // UC2
        UC2_Equality.checkEquality(length1, length2);

        // UC3
        UC3_Compare.compareLines(length1, length2);

        // UC4 (OOP)
        UC4_OOP.runOOPDemo();
    }
}