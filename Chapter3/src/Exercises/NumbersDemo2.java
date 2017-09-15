package Exercises;
import java.util.Scanner;
public class NumbersDemo2 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int num1 = 5;
		Scanner inputDevice = new Scanner(System.in);
		System.out.print("Enter number >> ");
		num1 = inputDevice.nextInt();
		int num2 = 10;
		System.out.print("Enter number >> ");
		num2 = inputDevice.nextInt();
		System.out.println("Your number is " + num1 + " num2");
		
		displayTwiceTheNumber(num1, num2);
		
		
	}
	public static void displayTwiceTheNumber(int x, int y)
	{
		int answer1, answer2;
		
		answer1 = x * 2;
		answer2 = y * 2;
		
		System.out.println("first number is "+ answer1);
		System.out.println("second number is "+ answer2);
	}
	public static void displayNumberPlusFive(int x, int y)
	{
		int answer1, answer2;
		
		answer1 = x + 5;
		answer2 = y + 5;
		
		System.out.println("first number is "+ answer1);
		System.out.println("second number is "+ answer2);
	}
	public static void displayNumberSquared(int x, int y)
	{
		int answer1, answer2;
		
		answer1 = (int)Math.pow(x, 2);
		answer2 = (int)Math.pow(y, 2);
		
		System.out.println("first number is "+ answer1);
		System.out.println("second number is "+ answer2);
	}
}
