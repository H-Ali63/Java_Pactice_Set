package Haidar;
import java.util.Scanner;
public class ParameterizedFunctions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		# INTEGER TYPE PARAMETER
		int ans = sum1(1,3);
		System.out.println("The sum is = " + ans);
//		# STRING TYPE PARAMETER
		Scanner in = new Scanner(System.in);
		System.out.print("Enter name ");
		String name = in.next();
		String message = greet(name);
		System.out.println(message);
	}
//	# RETURN TYPE IS STRING
	static String greet(String name) {
		String greeting = "Hello " + name;
		return greeting;
	}
//	# RETURN TYPE IS INTEGER
	static int sum1(int a, int b) {
		int sum = a + b;
		return sum;
	}
}
