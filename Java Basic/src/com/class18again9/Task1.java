package com.class18again9;

public class Task1 {
   public static void main(String[] args) {
	
	/* I want to print pattern
	 *   *****   rows=4; columns=5;
	 *   *****
	 *   *****
	 *   *****
	 */  
	 Task1 obj=new Task1();
	 obj.printPyramid();
	 System.out.println();
	 obj.square();
	
   // *
   // **
   // ***
   // ****
   // *****
   // ******
   // *******   
}
   void printPyramid() {
	   for (int i=1; i<=7; i++) {
		   for (int y=1; y<=i; y++) {
			   System.out.print("*");
		   }
		   System.out.println();
	   }
   }
 
  
   
   void square() {
	   
	   for (int i=1; i<=4; i++) {
		   for (int y=1; y<=5; y++) {
			   System.out.print("*");
		   }
		   System.out.println();
	   }
   }
}
