package chapters.chapter_12;

public class Loan {
    private double annualInterestRate;
    private int numberOfYears;
    private double loanAmount;
    private java.util.Date loanDate;


    public Loan(){
        this(2.5,1,1000);
    }
    public Loan(double annualInterestRate, int numberOfYears, double loanAmount){
        if (loanAmount <= 0) {
            throw new IllegalArgumentException("Loan Amount must be greater than 0.");
        } else if (annualInterestRate <= 0) {
            throw new IllegalArgumentException("Annual interest rate must be greater than 0.");
        } else if (numberOfYears <= 0) {
            throw new IllegalArgumentException("Number of years must be greater than 0.");
        }
        this.annualInterestRate = annualInterestRate;
        this.numberOfYears = numberOfYears;
        this.loanAmount = loanAmount;
        loanDate = new java.util.Date();
    }


    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public int getNumberOfYears() {
        return numberOfYears;
    }

    public void setNumberOfYears(int numberOfYears) {
        this.numberOfYears = numberOfYears;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public double getMonthlyPayment() {
        double monthlyInterestRate = annualInterestRate / 1200;
        return loanAmount * monthlyInterestRate / (1 - (1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12)));
    }

    public double getTotalPayment() {
        return getMonthlyPayment() * numberOfYears * 12;
    }

    public java.util.Date getLoanDate() {
        return loanDate;
    }
}
