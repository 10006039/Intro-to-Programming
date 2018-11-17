/*
Author: Skyler Wisdom
Date: 11-5-18
*/
import java.util.Scanner;

class Exercise_4_17 {
	public static void main(String[] args) {
		//new scanner
		Scanner n = new Scanner(System.in);
		
		//user input
		System.out.print("Enter a year: ");
		int year = n.nextInt();
		System.out.print("Enter a month: ");
		String month = n.next();
		int days = 0;
		
		
		switch(month)
		{
			case "Feb":
			
			//if a leap year
			if ((year % 4== 0 && year % 100 != 0) || (year % 400 == 0))
			{
				days = 29;
				break;
				
			}
			//if not a leap year
			days = 28;
			break;
			
			//Months that hava 30 days
			case "Apr":
			case "Jun":
			case "Sep":
			case "Nov":
			
			days = 30;
			break;
			
			//months that have 31 days
			case "Jan":
			case "Mar":
			case "May":
			case "Jul":
			case "Aug":
			case "Oct":
			case "Dec":
			
			days = 31;
			break;
			
			//invalid input
			default:
			System.out.println("Invalid input");
			System.exit(0);
			
		}//end of switch
		
		//display
		System.out.println(month + " " + year + " has " + days + " days");
		
		
	}
}