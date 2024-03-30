package Haidar;

import java.util.Arrays;
import java.lang.String;

public class VarArgs {

//	This is known as variable length arguments
	public static void main(String[] args) {
		arr(242,4345,3453,53,234,6,5,7,8,6);

//		Multiple parameterized function called
		multiple(2,3,"Haidar","Junaid","Hamza");	
	}
	
	static void arr(int ...v) { 	// ...v is defined as variable length argument which always comes to end... 
		System.out.println(Arrays.toString(v));
	}
	
//	Multiple arguments can be passed 
	static void multiple(int a, int b, String ...s) {
		System.out.println(a);
		System.out.println(b);
		System.out.println(s);
	}

}
