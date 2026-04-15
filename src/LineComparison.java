public class LineComparison {

    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation Program\n");

        uc1();
        uc2();
        uc3();
    }

    // UC1: Calculate Length of a Line
    static void uc1() {
        System.out.println("UC1: Calculate Length of Line");

        int x1 = 1, y1 = 2;
        int x2 = 4, y2 = 6;

        double length = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        System.out.println("Line Coordinates: (" + x1 + "," + y1 + ") to (" + x2 + "," + y2 + ")");
        System.out.println("Length of Line: " + length);
        System.out.println();
    }

    // UC2: Check Equality of Two Lines
    static void uc2() {
        System.out.println("UC2: Check Equality of Two Lines");

        // Line 1
        int x1 = 1, y1 = 2, x2 = 4, y2 = 6;
        double line1 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        // Line 2
        int x3 = 2, y3 = 3, x4 = 5, y4 = 7;
        double line2 = Math.sqrt(Math.pow(x4 - x3, 2) + Math.pow(y4 - y3, 2));

        System.out.println("Length of Line1: " + line1);
        System.out.println("Length of Line2: " + line2);

        if (Double.valueOf(line1).equals(Double.valueOf(line2))) {
            System.out.println("Lines are Equal");
        } else {
            System.out.println("Lines are Not Equal");
        }

        System.out.println();
    }

    // UC3: Compare Two Lines
    static void uc3() {
        System.out.println("UC3: Compare Two Lines");

        // Line 1
        int x1 = 1, y1 = 2, x2 = 4, y2 = 6;
        double line1 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        // Line 2
        int x3 = 2, y3 = 3, x4 = 5, y4 = 7;
        double line2 = Math.sqrt(Math.pow(x4 - x3, 2) + Math.pow(y4 - y3, 2));

        int result = Double.valueOf(line1).compareTo(Double.valueOf(line2));

        if (result == 0) {
            System.out.println("Lines are Equal");
        } else if (result > 0) {
            System.out.println("Line1 is Greater than Line2");
        } else {
            System.out.println("Line1 is Less than Line2");
        }

        System.out.println();
    }
}
