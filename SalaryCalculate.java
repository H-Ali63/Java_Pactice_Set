package haidar;
import java.util.Scanner;
public class SalaryCalculate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner salary = new Scanner(System.in);
		System.out.print("Enter you package of salary for a month : ");
		double pack = salary.nextDouble();
		
		if (pack == 20000) {
			System.out.println("He may get 2000 bonus!");
			double sal = pack + 2000;
			System.out.print(sal);
		}
		else if(pack == 15000) {
			System.out.println("He may get 1500 bonus!");
			double sal = pack + 1500;
			System.out.print(sal);
		}
		else {
			System.out.println("He may only get 1k bonus!");
			double sal = pack + 1000;
			System.out.print(sal);
		}
	}
}
