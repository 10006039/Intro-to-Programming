/*
Author: Skyler Wisdom
Date: 12-19-18
*/

import java.util.Scanner;
class Exercise_6_37 {
	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int number = n.nextInt();
		System.out.print("Enter the width: ");
		int width = n.nextInt();
		
		System.out.println("The width of the number is: " + format(number, width));
	}
	public static String format(int number, int width){
		String num = number + "";
		
		if (num.length() < width){
			for (int i = width - num.length(); i > 0; i--){
				num = 0 + num;
			}
		}
		return num;
	}
}