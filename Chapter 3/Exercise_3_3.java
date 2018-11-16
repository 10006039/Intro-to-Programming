/*
Author: Skyler Wisdom
Date: 10-19-18
*/

import java.util.Scanner;
class Exercise_3_3 {
	//Declarations
	public static void main(String[] args) {
		double a;
		double b;
		double c;
		double d;
		double e;
		double f;
		double temp;
		double x;
		double y;
		//new scanner
		Scanner n = new Scanner(System.in);
		//user input
		System.out.print("Enter a: ");
		a = n.nextDouble();
		System.out.print("Enter b: ");
		b = n.nextDouble();
		System.out.print("Enter c: ");
		c = n.nextDouble();
		System.out.print("Enter d: ");
		d = n.nextDouble();
		System.out.print("Enter e: ");
		e = n.nextDouble();
		System.out.print("Enter f: ");
		f = n.nextDouble();
		
		temp = ((a * d) - (b * c));
		
		if (temp == 0){
			System.out.print("The equation has no solution");
		}
	
	else {
		x = (e * d - b * f) / temp;
		y = (a * f - e * c) / temp;
		
		System.out.println("X is" + x + "and y is" + y); 
		}
	}	
		
	
}
		
	

