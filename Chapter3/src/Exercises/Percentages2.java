package Exercises;

public class Percentages2 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		double num1= 2.0;
		
		double num2 = 5.0;
		
		computePercent(num1, num2);
	}
	public static void computePercent(double x, double y)
	{
		double answer1, answer2;
		
		answer1 = x / y *100;
		answer2 = y / x *100; 
		 System.out.println(String.format("%.0f%%",answer1));
		 System.out.println(String.format("%.0f%%",answer2));
	}
	
}
