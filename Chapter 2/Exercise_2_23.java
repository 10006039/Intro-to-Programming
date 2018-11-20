/*
Author: Skyler Wisdom
Date: 10-9-18
*/
import java.util.Scanner;
class Exercise_2_23 {
	public static void main(String[] args) {
		//new scanner
		Scanner input = new Scanner(System.in);
		
		//Declarations and input
		System.out.println("Enter the driving distance: ");
		double drivingDistance = input.nextDouble();
		
		System.out.println("Enter the miles per gallon: ");
		double milesGallon = input.nextDouble();
		
		System.out.println("Enter the price per gallon: ");
		double priceGallon = input.nextDouble();
		
		//Algorithm
		double cost = (drivingDistance / milesGallon) * priceGallon;
		
		//Display
		System.out.println("The cost of driving is: " + cost);
	}
}