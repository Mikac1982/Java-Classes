package com.class17;

public class Task1 {

	//Create a method that will take 2 parameters as a numbers and prints which number is larger.
	
	public static void main(String[] args) {
		
		Task1 obj=new Task1();
		obj.largerNum(19, 128);
		
	}
	void largerNum(int a, int b) {
		
		if (a>b) {
			System.out.println("Number A is larger than number B");
		}else {
			System.out.println("Number B is larger than number A");
		} 
	}
}
