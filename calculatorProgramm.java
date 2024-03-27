package haidar;
import java.util.Scanner;
public class calculatorProgramm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Cal = new Scanner(System.in);
		int ans = 0;
		while(true) {
			// take the operator as input from user
			System.out.print("Enter the operator " );
			char op = Cal.next().trim().charAt(0);
			if(op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
				System.out.print("Enter first numbers : ");
				int num1 = Cal.nextInt();
				System.out.print("Enter second numbers : ");

				int num2 = Cal.nextInt();
				if(op == '+') {
					ans = num1 + num2;
				}
				if(op == '-') {
					ans = num1 - num2;
				}
				if(op == '*') {
					ans = num1 * num2;
				}
				if(op == '/') {
					if(num2 != 0) {
						ans = num1 / num2;
					}
				}
				if(op == '%') {
					ans = num1 % num2;
				}
			}
			else if(op == 'x' || op == 'X'){
				break;
			}
			else {
				
				System.out.println("\n Invalid operations!");
			}
			System.out.println("The answer is " + ans);
		}
	}
}
