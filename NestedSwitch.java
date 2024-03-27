package haidar;
import java.util.Scanner;
public class NestedSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String Employee_Department = in.next();
		int Employee_ID = in.nextInt();
		switch (Employee_Department) {
		case "IT":
			System.out.println("Haidar Ali is from IT Department!");
			break;
		case "Management":
			System.out.println("Kaishar Ali is from Machenical Department");
			break;
		default:
			System.out.println("Department is not exist!");
		case "Data_Science":	
			switch (Employee_ID) {
			case 1:
				System.out.println("Haidar Ali Emp ID is 1");
				break;
			case 2:
				System.out.println("Kaishar Ali Emp ID is 2");
				break;
			default:
				System.out.println("Not Exist!");
			}
		break;
		}
	}

}
