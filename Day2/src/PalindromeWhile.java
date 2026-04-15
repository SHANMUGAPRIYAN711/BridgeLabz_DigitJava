import java.util.Scanner;
public class PalindromeWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number :");
        int num = sc.nextInt();
        int orginalnum = num;
        int rev = 0;
        while (num > 0){
            int digit = num % 10;
            rev = rev * 10 + digit;
            num /=10;
        }
        if(rev == orginalnum){
            System.out.println("Its a Palindrome");
        }
        else{
            System.out.println("Not a Palindrome");
        }
    }
}
