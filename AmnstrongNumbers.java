package Haidar;
import java.util.Scanner;
public class AmnstrongNumbers {
//	# Armstrong number is basically sum of the cue of the digits is same as the value.
/*
 * Number -> 153
 * 1^3 + 5^3 + 3^3 
 *  3  + 125 + 27
 *  Return-> 153
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		System.out.println(isArmstrong(num));
	
//		It will just print the three digits Armstrong numbers
		for (int i = 100; i < 1000; i++) {
			if(isArmstrong(i)) {
				System.out.print(i+" ");
			}
		}
		
	}

	static boolean isArmstrong(int num) {
		int original = num;
		int sum = 0;
		
		while(num > 0) {
			int rem = num %10;
			num = num / 10;
			sum = sum + rem * rem * rem;
			
		}
		return sum == original;
	}
}
