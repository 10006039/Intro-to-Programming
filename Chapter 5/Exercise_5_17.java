/*
Author: Skyler Wisdom
Date: 11-26-18

Accepts int n from user and prints a pyramid of n height
*/

import java.util.Scanner;
class Exercise_5_17 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int user = 0;
		
		System.out.print("Enter height of pyramid (1-15): ");
		user = scan.nextInt();
		
		while (user > 15 || user < 1) {
			System.out.print("Enter height of pyramid (1-15): ");
			user = scan.nextInt();
		}
		//count rows
		for (int count = 1; count <= user; count++) {
			//print spaces
			for (int space = 1; space <= (user - count); space++) {
				System.out.print("   ");
			}
			//print left side
			for (int left = count; left >= 1; left--) {
				System.out.printf("%3d", left);
			}
			//print right side
			for (int right = 2; right <= count; right++) {
				System.out.printf("%3d", right);
			}
			//end row
			System.out.println();
		}
		
	}
}