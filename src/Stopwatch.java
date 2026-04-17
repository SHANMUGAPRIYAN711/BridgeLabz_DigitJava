import java.util.*;

public class Stopwatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Press ENTER to start stopwatch...");
        sc.nextLine();

        long start = System.currentTimeMillis();

        System.out.println("Stopwatch started... Press ENTER to stop");
        sc.nextLine();

        long end = System.currentTimeMillis();

        long elapsed = end - start;

        System.out.println("Elapsed Time: " + elapsed + " milliseconds");
    }
}