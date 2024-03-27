package haidar;
import java.util.Scanner;
public class CharTypeCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		char in = input.next().trim().charAt(0);
		if(in > 'a' && in < 'z') {
			System.out.print("Lowecase");
		}
		else {
			System.out.print("Uppercase");
		}
	}

}
