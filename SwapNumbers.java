package Haidar;
import java.util.Scanner;  
public class SwapNumbers  
{  
int a, b;  
//function to swap two numbers   
static void swapNum(SwapNumbers swaptonum)  
{  
int temp;  
//logic for swapping  
temp = swaptonum.a;  
swaptonum.a = swaptonum.b;  
swaptonum.b = temp;
}
public static void main(String args[])
{
//creating object of the class  
SwapNumbers sn = new SwapNumbers();
Scanner sc = new Scanner(System.in);      
System.out.print("Enter the first number: ");
sn.a = sc.nextInt();
System.out.print("Enter the second number: ");
sn.b = sc.nextInt();
//function calling  
SwapNumbers.swapNum(sn);
//prints result after swapping  
System.out.println("After swapping: a= " + sn.a + ", b= " + sn.b);
}  
}  