import java.util.*;

class CompanyShares {
    String symbol;
    int shares;

    CompanyShares(String symbol, int shares) {
        this.symbol = symbol;
        this.shares = shares;
    }
}

class StockAccountSystem {
    ArrayList<CompanyShares> list = new ArrayList<>();

    void buy(String symbol, int shares) {
        list.add(new CompanyShares(symbol, shares));
        System.out.println("Bought " + shares + " of " + symbol);
    }

    void sell(String symbol, int shares) {
        for (CompanyShares c : list) {
            if (c.symbol.equals(symbol) && c.shares >= shares) {
                c.shares -= shares;
                System.out.println("Sold " + shares + " of " + symbol);
                return;
            }
        }
        System.out.println("Not enough shares");
    }

    void display() {
        for (CompanyShares c : list) {
            System.out.println(c.symbol + " -> " + c.shares);
        }
    }
}

public class StockAccount {
    public static void main(String[] args) {

        StockAccountSystem acc = new StockAccountSystem();

        acc.buy("TCS", 10);
        acc.buy("INFY", 5);

        acc.sell("TCS", 5);

        acc.display();
    }
}