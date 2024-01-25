package bank.entities;

public class SavingAccount extends Account {
    public int baseBalance;

    public SavingAccount(int balance, int baseBalance) {
        super(balance);
        this.baseBalance = baseBalance;
    }

    public SavingAccount(int baseBalance) {
        super();
        this.baseBalance = baseBalance;
    }

    public void describe() {
        System.out.println("Le propriétaire du compte se nomme : " + userName);
        System.out.println("Le solde du compte est : " + balance);
        System.out.println("Le compte est domicilié à : " + bankName);
        System.out.println("Le solde de base : " + baseBalance);
    }
}
