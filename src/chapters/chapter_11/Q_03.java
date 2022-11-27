package chapters.chapter_11;

import chapters.chapter_09.Account;

public class Q_03 {
    public static void main(String[] args) {

        Account account = new Account(5107,50000,2);
        SavingsAccount savingsAccount = new SavingsAccount();
        CheckingAccount checkingAccount = new CheckingAccount(5000);

        System.out.println(account.toString());
        System.out.println("-----------------");
        System.out.println(savingsAccount.toString());
        System.out.println("-----------------");
        System.out.println(checkingAccount.toString());
    }
}
