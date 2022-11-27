package chapters.chapter_11;

import java.util.ArrayList;
import java.util.Arrays;

public class Account1 {
    private String customerName;
    private int id;
    private double balance;
    private ArrayList<Transaction> transactions;


    public Account1(){

    }
    public Account1(String customerName, int id, double balance){
        transactions = new ArrayList<>();
        this.customerName = customerName;
        this.id = id;
        this.balance = balance;
    }


    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(ArrayList<Transaction> transactions) {
        this.transactions = transactions;
    }

    public void withdraw(double amount){
        setBalance(balance-amount);
        Transaction transaction = new Transaction('W', amount, getBalance(), "Standard");
        transactions.add(transaction);
    }

    public void deposit(double amount){
        setBalance(balance+amount);
        Transaction transaction = new Transaction('D', amount, getBalance(),"Standard");
        transactions.add(transaction);
    }

    public String toString(){
        return "---Account---" +
                "\nCustomer Name: " + getCustomerName() +
                "\nCurrent Balance: " + getBalance() +
                "---Transactions:\n" + Arrays.toString(transactions.toArray());
    }
}
