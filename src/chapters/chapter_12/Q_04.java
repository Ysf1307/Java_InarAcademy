package chapters.chapter_12;

public class Q_04 {
    public static void main(String[] args) {
        Loan loan = new Loan();

        try {
            loan.setLoanAmount(-1000);
        }
        catch (IllegalArgumentException ex1){
            System.out.println("IllegalArgumentException Caught: " + ex1.getMessage());
            System.out.println("Loan amount cannot be less than or equals to '0'");
        }
        try {
            loan.setAnnualInterestRate(-7);
        }
        catch (IllegalArgumentException ex2){
            System.out.println("IllegalArgumentException Caught: " + ex2.getMessage());
            System.out.println("Annual interest rate cannot be less than or equals to '0'");
        }
        try {
            loan.setNumberOfYears(-3);
        }
        catch (IllegalArgumentException ex3){
            System.out.println("IllegalArgumentException Caught: " + ex3.getMessage());
            System.out.println("Number of years cannot be less than or equals to '0'");
        }

        try {
            loan.setLoanAmount(7000);
            loan.setAnnualInterestRate(0.7);
            loan.setNumberOfYears(3);
        }
        catch (IllegalArgumentException ex4){
            System.out.println("IllegalArgumentException Caught: " + ex4.getMessage());
        }
        try {
            System.out.println("Annual Interest Rate: " + loan.getAnnualInterestRate());
            System.out.println("Loan Amount: " + loan.getLoanAmount());
            System.out.println("Number of Years: " + loan.getNumberOfYears());
            System.out.println("Loan Date: " + loan.getLoanDate());
            System.out.printf("Monthly Payment: %.2f", loan.getMonthlyPayment());
        }
        catch (IllegalArgumentException ex5){
            System.out.println("IllegalArgumentException Caught: " + ex5.getMessage());
        }
    }
}
