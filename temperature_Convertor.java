package haidar;
import java.util.Scanner;
public class temperature_Convertor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner temp = new Scanner(System.in);
		System.out.print("Enter the temp in calcious : ");
		float TempC = temp.nextFloat();
		float TempF = (TempC * 9/5) + 32;
		System.out.print("The temp in farehnigt is : " + TempF);
		

	}

}
