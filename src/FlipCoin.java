import java.util.Scanner;

public class FlipCoin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of time to flip coin");
        int n = sc.nextInt();
        if(n < 0){
            System.out.println("Enter positive number");
            return;
        }
        int heads = 0;
        int tails = 0;
        for(int i = 0; i < n; i++){
            double rand = Math.random();
            System.out.println(rand);
            if(rand < 0.5){
                heads++;
            }
            else{
                tails++;
            }
        }
        double headPercent = (heads * 100.0) / n;
        double tailpercent = (tails * 100.0) / n;

        System.out.println("Heads : " + headPercent + "%");
        System.out.println("Tails : " + tailpercent + "%");
        sc.close();
    }
}
