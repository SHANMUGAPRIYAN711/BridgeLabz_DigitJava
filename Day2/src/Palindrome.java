import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int num = sc.nextInt();
        int originalnum = num;
        int rev =0 ;
        while (num > 0) {
            rev = rev * 10 + (num % 10);
            num /= 10;
        }

        if (originalnum == rev)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}
