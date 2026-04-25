import java.util.*;

class Account {
    private double balance;

    Account(double balance) {
        this.balance = balance;
    }

    void credit(double amount) {
        if (amount > 0) balance += amount;
    }

    void debit(double amount) {
        if (amount > balance)
            System.out.println("Debit amount exceeded account balance");
        else if (amount > 0)
            balance -= amount;
    }

    double getBalance() {
        return balance;
    }
}

public class AccountDebit {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Initial Balance: ");
        double b = sc.nextDouble();

        Account acc = new Account(b);

        System.out.print("Deposit: ");
        acc.credit(sc.nextDouble());

        System.out.print("Withdraw: ");
        acc.debit(sc.nextDouble());

        System.out.println("Final Balance: " + acc.getBalance());
    }
}