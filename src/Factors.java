import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int n = sc.nextInt();
        if(n < 0){
            System.out.println("Enter a number above 0");
            return;
        }
        System.out.println("Prime Factors : ");
        for(int i = 2; i * i <= n; i++){
            System.out.println(i + " ");
            n = n / i;
        }
        if(n > 1){
            System.out.println(n);
        }
    }
}
