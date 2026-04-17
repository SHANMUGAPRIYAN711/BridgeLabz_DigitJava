import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of N : ");
        int n = sc.nextInt();
        if(n < 0 || n > 31){
            System.out.println("Enter value between 0 and 30");
            return;
        }
        int power = 1;
        for (int i = 0; i <= n; i++){
            System.out.println("2^" + i + "=" + power);
            power = power * 2;
        }
    }
}
