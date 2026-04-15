package operators;
import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a: ");
        double a = sc.nextDouble();

        System.out.print("Enter b: ");
        double b = sc.nextDouble();

        System.out.print("Enter c: ");
        double c = sc.nextDouble();

        double delta = b * b - 4 * a * c;

        if (a == 0) {
            System.out.println("Not a quadratic equation");
            return;
        }

        if (delta > 0) {
            double r1 = (-b + Math.sqrt(delta)) / (2 * a);
            double r2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Two real roots: " + r1 + " , " + r2);
        }
        else if (delta == 0) {
            double r = -b / (2 * a);
            System.out.println("One real root: " + r);
        }
        else {
            System.out.println("Imaginary roots");
        }
    }
}
