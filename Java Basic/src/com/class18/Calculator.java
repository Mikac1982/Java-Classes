package com.class18;

public class Calculator {

	
	public int sum(int a,int b) {
		//int sum= 0;
		int sum=a+b;
		return sum;	//or return a+b;
	}
	
	public void sub(int a,int b) {  //void -> no return values
		int sub=a-b;
		System.out.println(sub);  //we can do this way as well
	}
	
	public int div(int a,int b) {   //int -> have return value
		return a/b;
	}
	
	public void mult(int a,int b) {  //void -> no return value
		int mult=a*b;
		System.out.println(mult);
	}
}
