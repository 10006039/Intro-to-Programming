/*
Author: Skyler Wisdom
Date: 11-11-18
*/


import java.util.Scanner;
class Exercise_2_1 {
	public static void main(String[] args) {
		//new scanner
		Scanner n = new Scanner(System.in);
		
		//declarations
		double fahrenheit = 0.0;
		
		//user input
		System.out.print("Enter a degree in Celsius: ");
		double celsius = n.nextDouble();
		
		//algorithm
		fahrenheit = (9.0 / 5.0) * celsius + 32;
		
		//display
		System.out.println(celsius + " Celsius is " + fahrenheit + " Fahrenheit");
	}
}