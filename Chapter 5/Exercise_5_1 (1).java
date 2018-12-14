/*
Author: Skyler Wisdom
Date: 12-14-18
*/

import java.util.Scanner;
class Exercise_5_1 {
	public static void main(String[] args) {
		
		//Scanner
		Scanner n = new Scanner (System.in);
		
		//Declarations
		int negitive = 0;
		int positive = 0;
		int num = 0;
		int total = 0;
		
		//User input
		System.out.print("Enter a Positive or negitive Number: ");
		num = n.nextInt();
				
		while (num != 0){
			if (num < 0){
				negitive += 1;
				
			} else {
				positive += 1;
			}	
				total += num;
		
				//User input
				System.out.print("Enter a Positive or Negitive Number (0 to quit): ");
				num = n.nextInt();
		} 	
			
		//Display
		System.out.println("Positive Numbers: " + positive);
		System.out.println("Negitive Numbers: " + negitive);
		System.out.println("The Total is:  " + total);
	}
}