/*
Author: Skyler Wisdom
Date: 2-21-19
*/


import java.util.Scanner;

class Exercise_7_23 {

	public static void main(String[] args) {
		boolean[] lockers = new boolean[100];
		
		for (int student = 1; student <= 100; student++) {
			for(int k = (student-1); k < 100; k += student) {
				lockers[k] = !lockers[k];
			
			}
		}
	
		for (int i = 0; i < lockers.length; i++) {
			if(lockers[i] == true) {
				System.out.printf("L%d ", i + 1);
			
			}
		}
	}
}