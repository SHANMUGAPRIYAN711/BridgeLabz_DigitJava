public class UC4_OOP {

    public static void runOOPDemo() {

        Line line1 = new Line(new Point(0, 0), new Point(3, 4));
        Line line2 = new Line(new Point(1, 1), new Point(4, 5));

        System.out.println("OOP Length1: " + line1.length());
        System.out.println("OOP Length2: " + line2.length());

        if (line1.equals(line2))
            System.out.println("OOP: Lines are equal");
        else
            System.out.println("OOP: Lines are not equal");

        int result = line1.compareTo(line2);

        if (result == 0)
            System.out.println("OOP: Lines are equal");
        else if (result > 0)
            System.out.println("OOP: Line1 is longer");
        else
            System.out.println("OOP: Line2 is longer");
    }
}