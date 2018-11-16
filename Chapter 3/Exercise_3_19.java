/*
Author: Skyler Wisdom
Date: 10-30-18
*/

import java.util.Scanner;

class Exercise_3_19 {
	public static void main(String[] args) {
		//Declarations
		double side1;
		double side2;
		double side3;
		double totalPerimeter;
		
		//User Input
		Scanner n = new Scanner(System.in);
		System.out.print("Enter side one: ");
		side1 = n.nextDouble();
		System.out.print("Enter side two: ");
		side2 = n.nextDouble();;
		System.out.print("Enter side three: ");
		side3 = n.nextDouble();
		
		//Determines if the sum of every pair of two edges is greater than the remaining edge.	
		if (side1 + side2 < side3 || side2 + side3 < side1 || side1 + side3 < side2)
		{
			System.out.println("Invalid input");
		}
		//Calculate permiter and Display
		else 
		{
			totalPerimeter = side1 + side2 + side3;
			System.out.println("The perimeter of the triangle is: " + totalPerimeter);
		}
	}
}