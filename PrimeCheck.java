package Haidar;
import java.util.Scanner;
public class PrimeCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		boolean num = isPrime(n);
		System.out.print(num);
		
	}
	static boolean isPrime(int n) {
		if(n <= 1) {
			return false;
		}
		int c = 2;
		while(c * c <= n) {
			if(n % 2 == 0) {
				return false;
			}
			c++;
		}
		return c * c > n;
	}

}
