package chapters.chapter_10;

import chapters.chapter_09.Account;

import java.util.Scanner;

public class Q_07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Account[] accounts = new Account[10];
        for (int i = 0; i < accounts.length; i++) {
            accounts[i] = new Account(i, 1000);
        }

        while (true) {
            System.out.println("-------");
            System.out.println("Enter an ID: ");
            int accountId = input.nextInt();

            while (true) {
                System.out.println();
                System.out.println("Main Menu\n1: Check Balance\n2: Withdraw\n3: Deposit\n4: Exit\nEnter a choice: ");
                int choice = input.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("The balance is " + accounts[accountId].getBalance());
                        continue;
                    case 2:
                        System.out.println("Enter an amount to withdraw:");
                        accounts[accountId].withdraw(input.nextDouble());
                        continue;
                    case 3:
                        System.out.println("Enter an amount to deposit:");
                        accounts[accountId].deposit(input.nextDouble());
                        continue;
                }
                if (choice == 4) break;
            }
        }
    }
}