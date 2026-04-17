import java.util.Scanner;

public class QuotientReminder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter dividend : ");
        int dividend = sc.nextInt();
        System.out.println("Enter divisor : ");
        int divisor = sc.nextInt();

        if(divisor == 0){
            System.out.println("Division by Zero is not allowed");
            return;
        }
        int quotient = dividend / divisor;
        int reminder = dividend % divisor;

        System.out.println("Quotient  : " + quotient);
        System.out.println("Reminder : " + reminder);
    }
}
