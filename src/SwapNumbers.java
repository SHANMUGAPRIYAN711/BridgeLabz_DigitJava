import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first Number :");
        int n1 = sc.nextInt();
        System.out.println("Enter Second Number : ");
        int n2 = sc.nextInt();
        int temp = n1;
        n1 = n2;
        n2 = temp;
        System.out.println("First Element  : " + n1 + " Second Element : " + n2);
    }
}
