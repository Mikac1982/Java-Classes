package com.class18again9;

public class NestedLoopDemo {
   public static void main(String[] args) {
	
	   NestedLoopDemo obj=new NestedLoopDemo();
	   obj.printNum();
	   
 }
   
  void printNum() {
	  
     for (int i=1; i<=2; i++) {       // outer loop
		   for (int y=0; y<=3; y++) {   // inner loop
			   
	   System.out.println(i+" "+y);  //10; 11; 12; 13 //20; 21; 22; 23 		  
		   }
	   }
  }
   
   
   
   
   
}
