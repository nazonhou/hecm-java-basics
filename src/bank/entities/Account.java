package bank.entities;

public class Account {
    public static String bankName = "ECOBANK";
    public String userName;
    public int balance;

    public Account() {
        balance = 100_000;
    }

    public Account(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int newBalance) {
        balance = newBalance;
    }

    public void describe() {
        System.out.println("Le propriétaire du compte se nomme : " + userName);
        System.out.println("Le solde du compte est : " + balance);
        System.out.println("Le compte est domicilié à : " + bankName);
    }
}