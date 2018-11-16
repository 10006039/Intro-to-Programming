/*
Author: Skyler Wisdom
Date: 11-1-18
*/

import java.util.Scanner;
class Exercise_3_23 {
	public static void main(String[] args) {
		
		
		Scanner n = new Scanner(System.in);
		
		System.out.println("Enter the value for x: ");
		double x = n.nextDouble();
		System.out.println("Enter the value for y: ");
		double y = n.nextDouble();
		
		if ((x <= 10.0/2 && x >= -10.0/2) && (y <= 5.0/2 && y >= -5.0/2))
		{
			System.out.println("Point (" + x + "," + y + ") is in the rectangle.");
		}
		else {
			System.out.println("Point (" + x + "," + y + ") is not in the rectangle.");
		}
	}
}