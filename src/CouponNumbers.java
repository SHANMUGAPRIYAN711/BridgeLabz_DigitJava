import java.util.*;

public class CouponNumbers {

    // Function to generate random number
    public static int getRandom(int n) {
        Random rand = new Random();
        return rand.nextInt(n); // 0 to n-1
    }

    // Function to collect distinct coupons
    public static int collectCoupons(int n) {
        HashSet<Integer> set = new HashSet<>();
        int count = 0;

        while (set.size() < n) {
            int coupon = getRandom(n);
            count++;

            set.add(coupon); // duplicates automatically ignored
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of coupons: ");
        int n = sc.nextInt();

        int totalAttempts = collectCoupons(n);

        System.out.println("Total random numbers needed: " + totalAttempts);
    }
}