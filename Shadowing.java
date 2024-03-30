package Haidar;

public class Shadowing {
	
	static int x = 1000;
	
	public static void main(String[] args) {
		
		System.out.println(x); // This will print the global value of x
		
		int x = 10000; // Here we create a new variable with different value
		
		int y; // Declaration
//		System.out.print(y);  # This will throw an error because we use any variable after initialization
		y = 10; // Initialization
		System.out.print(y);
		
		System.out.println(x); // This will overlap with the global variable and print the local variable
		
		num(); // Function call
	}
	static void num() { // New function definition
		
		System.out.println(x); // This will access again the global variable
	}

}
