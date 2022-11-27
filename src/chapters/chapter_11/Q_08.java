package chapters.chapter_11;

public class Q_08 {
    public static void main(String[] args) {

        Account1 account = new Account1("Yusuf", 5107, 5000);
        account.deposit(107);
        account.withdraw(90);
        account.deposit(500);
        System.out.println(account.toString());
    }
}
