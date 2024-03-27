// Source code is decompiled from a .class file using FernFlower decompiler.
package haidar;

import java.util.Scanner;

public class SwitchStatement {
   public SwitchStatement() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      // Use case - 1
//      switch (var1.next()) {
//         case "mango":
//            System.out.print("King of fruits! ");
//            break;
//         case "orage":
//            System.out.print("I like it!! ");
//            break;
//         case "Apple":
//            System.out.print("I don't like it more");
      
// 			use case - 2
//      switch (var1.next()) {
//      case "Mango" -> System.out.print("My favorite fruit");
//      case "Orange" -> System.out.print("Round fruit");
//      case "Banana" -> System.out.print("I most like this fruit");
//      case "Papaya" -> System.out.print("I eat for a long time fruit");
//      case "Graps" -> System.out.print("My most demanding fruit");
//      case "Water Melan" -> System.out.print("I  don't like it");
//      default -> System.out.print("This is not valid statement");
      
      // use case 3
//      int day = var1.nextInt();
//      switch (day){
//      	case 1 -> System.out.print("Today is Sunday");
//      	case 2 -> System.out.print("Today is Monday");
//      	case 3 -> System.out.print("Today is Tuesday");
//      	case 4 -> System.out.print("Today is Wednesday");
//      	case 5 -> System.out.print("Today is Thursday");
//      	case 6 -> System.out.print("Today is Friday");
//      	case 7 -> System.out.print("Today is Saturday");
      
//      int day = var1.nextInt();
//      switch (day){
//    	case 1:
////    		 System.out.print("Today is Sunday");
////    		 break;
//    	case 2:
////    		System.out.print("Today is Monday");
////    		break;
//    	case 3:
////    		System.out.print("Today is Tuesday");
////    		break;
//    	case 4:
////    		System.out.print("Today is Wednesday");
////    		break;
//    	case 5:
////    		System.out.print("Today is Thursday");
////    		break;
//    	case 6:
//    		System.out.print("Today is Weak-day");
//    		break;
//    	case 7:
//    		System.out.print("Today is Weak-end");

//      Very Simple way to write switch cases;
      
      int day = var1.nextInt();
      switch (day){
    	case 1, 2, 3, 4, 5, 6 -> System.out.print("Weak-day");
    	case 7 -> System.out.print("Today is Weak-end");
      }
   }
}