package chapters.chapter_04;

import java.util.Scanner;

public class Q_23 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter employee's name:");
		String name = input.next();
		System.out.println("Enter number of hours worked in a week:");
		double hour = input.nextDouble();
		System.out.println("Enter hourly pay rate: ");
		double payRate = input.nextDouble();
		System.out.println("Enter federal tax withholding rate");
		double federalTaxRate = input.nextDouble();
		System.out.println("Enter state tax withholding rate:");
		double stateTaxRate = input.nextDouble();
		
		double grossPay = hour * payRate;
		double federalTax = federalTaxRate * grossPay;
		double stateTax = stateTaxRate * grossPay;
		double netPay = grossPay - (federalTax + stateTax);
		
		System.out.println("Employee Name: " + name);
		System.out.println("Hours Worked: " + hour);
		System.out.println("Pay Rate: " + payRate);
		System.out.println("Gross Pay: " + grossPay);
		System.out.println("Deductions:");
		System.out.println("Federal Withholding: " + federalTax);
		System.out.println("State Withholding: " + stateTax);
		System.out.println("Total Deduction: " + (federalTax + stateTax));
		System.out.println("Net Pay: " + netPay);

}
}