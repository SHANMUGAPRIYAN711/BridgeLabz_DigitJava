public class UC3_Compare {

    public static void compareLines(double l1, double l2) {
        Double length1 = l1;
        Double length2 = l2;

        int result = length1.compareTo(length2);

        if (result == 0)
            System.out.println("Both lines are equal");
        else if (result > 0)
            System.out.println("Line1 is longer");
        else
            System.out.println("Line2 is longer");
    }
}