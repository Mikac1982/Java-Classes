package com.class14;

public class IntQ1 {
  public static void main(String[] args) {
	
 // Write a program to swap 2 numbers without a temporary variable? Swap 2 strings without a temporary variable?  
	  
	int a=15;
	int b=5;
	
	System.out.println("Before swap:");
	System.out.println("a: "+a);
	System.out.println("b: "+b);
	
	a=a+b;  // 15+5=20
	b=a-b;  // 20-5=15
	a=a-b;  // 20-15=5
	
	a=a*b;  // 15*5=75
	b=a/b;  // 75/5=15
	a=a/b;  // 75/15=5
	
	a=a-b;  // 15-5=10
	b=a+b;  // 10+5=15
	a=b-a;  // 15-10=5
	
//	a=a/b;  // 15/5=3
//	b=a*b;  // 3*5=15
//	a=b/a;  // 15/3=5      
	
	System.out.println("The value of a="+a+", value of b="+b);
	System.out.println("a: "+a);
	System.out.println("b: "+b);
}
}
