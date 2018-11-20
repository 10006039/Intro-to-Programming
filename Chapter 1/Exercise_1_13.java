/*
Author:Skyler Wisdom
Date: 10/5/2018
*/

class Exericse1_13 {
	public static void main(String[] args) {
	
//Declarations
	double a = 3.4;
    double b = 50.2;
    double c = 2.1;
    double d = 0.55;
    double e = 44.5;
    double f = 5.9;
//Alogorithm
    double dx = ((e * d) - (b * f)) / ((a * d) - (b * c));
    double dy = ((a * f) - (e * c)) / ((a * d) - (b * c));
		
//Display	
	System.out.println("3.4x + 50.2y = 44.5 and 2.1x + 0.55y = 5.9");
	System.out.println("The solution for x is:"); 
	System.out.println(dx);
	System.out.println("The solution for y is:");
	System.out.println(dy);
		
	}
}