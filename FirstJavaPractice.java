package haidar;
import java.util.Scanner;
public class FirstJavaPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello world!");
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.print(input.nextInt()); // for integer values only
		System.out.print(input.nextLine()); // for string values only, 
											// if we use next() then it will only take first value for the given input.
	}

}
