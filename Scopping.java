package Haidar;

public class Scopping {
// # We can initialize any object outside and use inside the block but can't initialize it again inside
	
// # We can initialize any object inside the block and use outside the block but we can't reinitialized it again outside the block 
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		int a = 10;
		int b = 20;
		System.out.println(a);
		System.out.println(b);
		
		{
			a = 200; // We can not create another object with same name but we can modify the object in different blocks.
			System.out.println(a);
		}
		System.out.println(a);
		random(); // function call
		
		
		// Scoping for loops
		
		for (int i = 0; i <= 3; i++) {
			System.out.print(i+" ");
		}
//		System.out.print(i); // "i" can not be used in outside the block
	
	// New method which does not return anything
	}
	static void random() {
		int marks = 100;
		System.out.println(marks);
	}

}
