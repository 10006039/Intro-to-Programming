/*
Auhtor: Skyler Wisodm
Date: 11-13-18
*/

import java.util.Scanner;
class Exercise_4_23 {
	public static void main(String[] args) {
		//new scanner
		Scanner n = new Scanner(System.in);
		
		//user input
		System.out.print("Enter employee's name: ");
		String name = n.next();
		System.out.print("Enter number of hours worked: ");
		double hoursWorked = n.nextDouble();
		System.out.print("Enter hourly pay rate: $");
		double hourlyRate = n.nextDouble();
		System.out.print("Enter fedral tax witholding rate: ");
		double fedTaxRate = n.nextDouble();
		System.out.print("Enter state tax witholding rate: ");
		double stateTaxRate = n.nextDouble();
		
		//Algorithm
		double grossPay = hourlyRate * hoursWorked;
		double totalDeductions = fedTaxRate + stateTaxRate;
		double netPay = grossPay - totalDeductions;
		fedTaxRate = grossPay * fedTaxRate;
		stateTaxRate = grossPay * stateTaxRate;
		
		//Display
		System.out.println("Employee name: " + name);
		System.out.println("Hours worked: " + hoursWorked);
		System.out.println("Pay rate: $" + hourlyRate);
		System.out.println("Gross pay: $" + grossPay);
		System.out.println("Deductions: ");
		System.out.println("\t Federal Witholding(" + fedTaxRate * 100 + "): $" + fedTaxRate);
		System.out.println("\t State Witholding($" + stateTaxRate * 100 + "): $" + stateTaxRate);
		System.out.println("\t Total Deduction: $" + totalDeductions * 100);
		System.out.println("Net Pay: $" + netPay);
		
	}
}