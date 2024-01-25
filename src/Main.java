import bank.entities.Account;
import bank.entities.SavingAccount;

public class Main {
    public static void main(String[] args) {
//        Account firstAccount = new Account();
//
//        firstAccount.bankName = "BOA";
//        firstAccount.balance = 10_000;
//        System.out.println("firstAccount balance = " + firstAccount.balance); // 10.000
//        System.out.println("firstAccount bankName = " + firstAccount.bankName); // BOA
//
//        Account secondAccount = new Account();
//        System.out.println("secondAccount balance = " + secondAccount.balance); // 0
//        System.out.println("secondAccount bankName = " + secondAccount.bankName); // ECOBANK

//        User user = new User();
//        // get user info
//        user.username = Helper.generateRandomPassword(16);
//        user.password = Helper.generateRandomPassword();
        SavingAccount firstSavingAccount = new SavingAccount(10_000);
        firstSavingAccount.userName = "Rose Marie";
        firstSavingAccount.balance = 90_000;
        firstSavingAccount.describe();
//        System.out.println("firstSavingAccount balance = " + firstSavingAccount.getBalance()); // 100.000
//        System.out.println("firstSavingAccount userName = " + firstSavingAccount.baseBalance); // 10_000
//        System.out.println("firstSavingAccount bankName = " + firstSavingAccount.bankName); // 20.000
//        Account account = new Account();
//        account.balance = 60_000;
//        account.userName = "John Doe";

//        accountDescription(firstSavingAccount);
    }

    static void accountDescription(Account account) {
        System.out.println("Le propriétaire du compte se nomme : " + account.userName);
        System.out.println("Le solde du compte est : " + account.balance);
        System.out.println("Le compte est domicilié à : " + account.bankName);
    }
}