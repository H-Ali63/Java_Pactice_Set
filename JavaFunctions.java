package Haidar;
import java.util.Scanner;
public class JavaFunctions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Question : Take 2 numbers and find the sum
		
		// # Normal Method
		
//		Scanner in = new Scanner(System.in);
//		int num1 = in.nextInt();
//		int num2 = in.nextInt();
//		
//		int sum = num1 + num2;
//		System.out.print(sum);
	sum();
	sum();
	sum();
	}
	static void sum() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number 1 : ");
		int num1 = in.nextInt();
		System.out.println("Enter the number 2 : ");
		int num2 = in.nextInt();
		int sum = num1 + num2;
		System.out.println("The sum is = " + sum);
	}

}
