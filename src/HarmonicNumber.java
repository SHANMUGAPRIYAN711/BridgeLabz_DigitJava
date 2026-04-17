import java.util.Scanner;

public class HarmonicNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int n = sc.nextInt();
        if(n < 0){
            System.out.println("Enter a number above 0");
            return;
        }
        int harmonic = 0;
        for(int i = 0; i < n; i++){
            harmonic += 1.0/i;
        }
        System.out.println("Harmonic value of i : " + n + " is " + harmonic);
    }
}
