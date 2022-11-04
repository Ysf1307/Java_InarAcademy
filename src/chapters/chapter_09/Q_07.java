package chapters.chapter_09;

public class Q_07 {
    public static void main(String[] args) {

        Account account1 = new Account(1122, 20000, 4.5);

        account1.printAccount();
        System.out.println("-----------------------");
        account1.withdraw(2500);
        account1.printAccount();
        System.out.println("-----------------------");
        account1.deposit(3000);
        account1.printAccount();

    }



}
