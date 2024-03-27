package haidar;

public class NumberChecking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 23425334;
		int count = 0;
		while(num > 0) {
			int remind = num % 10;
			if(remind == 2) {
			count++;
			}
			num = num / 10;
		}
		System.out.print(count);
	}
}
