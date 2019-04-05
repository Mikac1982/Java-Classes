package com.class17;

public class Task {
  //Create a method that will take 2 parameters as a numbers and prints which number is larger.
  //Create a method that will take a number and prints whether the number is even or odd.
  //Create a method that will print whether given String is palindrome or not.
	
	public static void main(String[] args) {
		
		
		Task obj=new Task();
		obj.isLarger(20,310);
		obj.evenOrOdd(57);	
		obj.isPalindrome("madam");
	}
	
	void isLarger (int a,int b) {
		
		if (a>b) {
			System.out.println(a+" is larger than "+b);
		}else {
			System.out.println(b+" is larger than "+a);
		}
	}
	
	void evenOrOdd(int num) {
		
		if (num%2==0) {
			System.out.println(num+" is even number");
		}else {
			System.out.println(num+" is odd number");
		}
	}
	
	void isPalindrome(String str) {
		
		String reverse="";
		
		for (int i=str.length()-1; i>=0; i--) {
			reverse+=str.charAt(i);
		}
		if (reverse.equalsIgnoreCase(str)) {
			System.out.println(str+" is a palindrome");
		}else {
			System.out.println(str+" is not a palindrome");
		}
		
	}
	
	
	
	
	
}
