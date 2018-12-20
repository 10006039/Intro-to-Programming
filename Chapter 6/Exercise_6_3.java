/*
Author: Skyler Wisodm
Date: 12-11-18
*/

import java.util.Scanner;

class Exercise_6_3 {
	public static void main(String[] args) {
		//new scanner
		Scanner n = new Scanner(System.in);
		//declarations
		int num;
		boolean ispalindrome;
		
		//user input
		System.out.print("Enter a integer: ");
		num = n.nextInt();
		
		//palindrome method
		ispalindrome = isPalindrome(num);
		
		//check if palindrome
		if (ispalindrome)
			System.out.println(num + " is a Palindrome number ");
		else 
			System.out.println(num + " is not a Palindrome number ");	
			
	}
	//method defintion
	private static boolean isPalindrome(int n){
		
	//method reverse	
	int rev = reverse(n);
	
	//check reverse number
	if(rev == n)
		return true;
	else 
		return false;	
}
//method definition
public static int reverse(int n){
	
	//declarations
	int rev = 0;
	int rem;

	//find reverse number
	while(n > 0){
		rem = n % 10;
		rev = rev * 10 + rem;
		n = n/10;
	}
	return rev;
}
}//end class
