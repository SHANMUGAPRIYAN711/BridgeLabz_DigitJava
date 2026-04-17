import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int n = sc.nextInt();
        if(n < 0){
            System.out.println("Enter Positive numbers ");
            return;
        }
        if(checkperfectNum(n)){
            System.out.println(n + "is a perfect number");
        }else{
            System.out.println(n  + "is a Perfect number");
        }
    }
    public static boolean checkperfectNum(int n){
        int temp = n;
        int sum = 0;
        for(int i = 1; i <= n /2; i++){
            if(n % i == 0){
                sum += i;
            }
        }
        if(temp == sum){
            return true;
        }
        return false;
    }
}
