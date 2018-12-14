/*
Author: Skyler Wisdom
Date: 11-15-18
*/

class Exercise_5_11 {
	public static void main(String[] args) {
		//declarations
		int count = 0;
		
		//Algorithem
		for (int i = 100; i<= 200; i++)
		{
			if (count < 10)
			if ((i % 5 == 0 && i % 6 != 0) || (i % 5 != 0 && i % 6 == 0))
			{
				System.out.print(i + " ");
				count ++;
			}
			//prints 10 numbers per line
			if (count == 10)
			{
				System.out.println();
				count = 0;
			}
		}//end of for
	}//end of main
}