/*
Author: Skyler Wisdom
Date: 11-2-18
*/

import java.util.Scanner;

class Exercise_4_1 {
	public static void main(String[] args) {
		
		//scanner
		Scanner n = new Scanner(System.in);
		
		//user input
		System.out.println("Enter the length from the center to the vertex: ");
		double length = n.nextDouble();
		
		//Algorithm
		double side = 2 * length * Math.sin(Math.toRadians(36));
		double area = (5 * Math.pow(side, 2)) / ( 4 * Math.tan(Math.toRadians(36)));
		
		//rounding area to nearest 100
		area = Math.round(area * 100) / 100.0;
		
		//Display area
		System.out.println("The are of the pentagon is: " + area);
	}
}