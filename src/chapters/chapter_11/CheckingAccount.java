package chapters.chapter_11;

import chapters.chapter_09.Account;

public class CheckingAccount extends Account {
    private double overdraftLimit;


    public CheckingAccount(){

    }
    public CheckingAccount(double overdraftLimit){
        this.overdraftLimit = overdraftLimit;
    }


    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    public String toString(){
        return super.toString() + "\nOverdraft Limit: " + getOverdraftLimit();
    }
}
