package haidar;
import java.util.Scanner;
public class LargestAmnogThreeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		
		int b = input.nextInt();
		
		int c = input.nextInt();
//		
//		if (a > b) {
//			System.out.println("A is greater than B");
//		}
//		else if(b > c) {
//			System.out.println("B is greater than C");
//		}
//		else if(c > a) {
//			System.out.println("C is greater than a and b");	
//		}
//		else {
//			System.out.println("Does not found");
//		}	
		
		int max = a;
		if(b > max) {
			max = b;
		}
		if(c > max) {
			max = c;
		}
		System.out.print(max);
	}
	
	
}
