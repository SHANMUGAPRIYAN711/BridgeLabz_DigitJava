import java.util.*;

class Stock {
    String name;
    int shares;
    double price;

    Stock(String name, int shares, double price) {
        this.name = name;
        this.shares = shares;
        this.price = price;
    }

    double getValue() {
        return shares * price;
    }
}

public class StockAccountManagement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Stock> list = new ArrayList<>();

        System.out.print("Enter number of stocks: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Name: ");
            String name = sc.next();

            System.out.print("Shares: ");
            int shares = sc.nextInt();

            System.out.print("Price: ");
            double price = sc.nextDouble();

            list.add(new Stock(name, shares, price));
        }

        double total = 0;

        System.out.println("\n--- Stock Report ---");
        for (Stock s : list) {
            double value = s.getValue();
            total += value;
            System.out.println(s.name + " Value: " + value);
        }

        System.out.println("Total Value: " + total);
    }
}