package Haidar;

import java.util.Scanner;

public class Greeting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		greeting();
		int sum1 = sum2();
		System.out.println("The sum is = " + sum1);
	}
	
	// Return function value
	static int sum2() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number 1 : ");
		int num1 = in.nextInt();
		System.out.println("Enter the number 2 : ");
		int num2 = in.nextInt();
		int sum = num1 + num2;
		return sum;
		}
	// It's just display the value
	static void greeting() {
		System.out.println("Hello world");
	}

}
