
import java.util.Scanner;
class Exercise_2_13 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the amount to be saved each month: ");
		double monthlyDeposit  = input.nextDouble();
		
		System.out.println("Enter the annual intrest rate: ");
		double annualInterestRate = input.nextDouble();
		double monthlyInterestRate = input.nextDouble();
		
		System.out.println("Enter the number of months: ");
		double numberMonths = input.nextDouble();
		double currentValue = monthlyDeposit * (1 + monthlyInterestRate);
		for (int i = 1; i < numberMonths; i++){
			currentValue = (currentValue + monthlyDeposit) * (1 + monthlyInterestRate);
		}
		System.out.println("After the " + numberMonths + "th month, the account value is" + currentValue);
	}
}