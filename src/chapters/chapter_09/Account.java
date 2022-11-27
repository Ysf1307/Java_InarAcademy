package chapters.chapter_09;

import java.util.Date;
import java.util.Scanner;

public class Account {
    public static Scanner input = new Scanner(System.in);
    private static int id = 0;
    private static double balance = 0;
    private static double annualInterestRate = 0;
    private static Date dateCreated = new Date();



    public Account(){
        this(1000);
    }
    public Account(double newBalance){
        balance = newBalance;
    }
    public Account(int newId, double newBalance){
        id = newId;
        balance = newBalance;
    }
    public Account(int newId, double newBalance, double newAnnualInterestRate){
        id = newId;
        balance = newBalance;
        annualInterestRate = newAnnualInterestRate;
    }




    public int getId(){
        return id;
    }
    public double getBalance(){
        return balance;
    }
    public double getAnnualInterestRate(){
        return annualInterestRate/100;
    }
    public String getDate(){
        return dateCreated.toString();
    }
    public double getMonthlyInterestRate(){
        return getAnnualInterestRate() / 12;
    }
    public double getMonthlyInterest(){
        return getMonthlyInterestRate() * balance;
    }
    public double withdraw(double withdrawAmount){
        return balance -= withdrawAmount;
    }
    public double deposit(double depositAmount){
        return balance += depositAmount;
    }
    public void printAccount(){
        System.out.println("Annual Interest Rate: " + getAnnualInterestRate());
        System.out.println("Account ID: " + getId());
        System.out.println("Balance " + getBalance());
    }
    public String toString(){
        String output = "";
        output += "Annual Interest Rate: " + getAnnualInterestRate();
        output += "\nAccount ID: " + getId();
        output += "\nBalance " + getBalance();
        return output;
    }
}
