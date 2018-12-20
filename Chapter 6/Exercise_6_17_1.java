/*
Author: Skyler Wisdom
Date: 12-19-18
*/

import java.util.Scanner;
class Exercise_6_17_1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n;
		
		System.out.print("Enter n: ");
		n = input.nextInt();
		
		printMatrix(n);
	}
	public static void printMatrix(int n){
		int[][] matrix = new int[n][n];
		
		int count = 0;
		int r;
		
		for (int row = 0; row < n; row++){

			for (int col = 0; col < n; col++){
				count++;
				r = (int)(Math.random() * 2);
				matrix[row][col] = r;
				System.out.print(matrix[row][col] + " ");
				
				if (count == n){
					System.out.println();
					count = 0;
					
				}
			}
		}
	}
}