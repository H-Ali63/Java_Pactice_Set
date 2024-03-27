package haidar;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 23435543;
		int ans = 0;
		while(num > 0) {
			int rem = num%10;
			num /= 10;
			ans = ans * 10 + rem;
		}
		System.out.print(ans);
	}
}
