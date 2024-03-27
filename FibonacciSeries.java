package haidar;
import java.util.Scanner;
public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter any number : ");
		Scanner in = new Scanner(System.in);
		int input = in.nextInt();
		int a = 0;
		int b = 1;
		int count = 2;
		while(count <= input) {
			int temp = b;
			b = a + b;
			a = temp;
			count++;
		}
		System.out.print(b);
		
	}

}
