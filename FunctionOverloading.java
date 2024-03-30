package Haidar;

public class FunctionOverloading {

//	# If we have two functions with same name then we call it function overloading
//	# If the function name is same but parameter is different then function will call by with its parameter
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Calling the functions with there parameter
		function(20);
		function("- ");
	}
	
	static void function(int a)
	{
	System.out.println(a);	
	}
	static void function(String s) {
		System.out.println(s);
		
	}
}
