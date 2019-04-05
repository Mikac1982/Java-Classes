package com.class17;

public class Task3 {

	//Create a method that will print whether given String is palindrome or not
	
	public static void main(String[] args) {
		
		Task3 str=new Task3();
		str.isPalindrome("madam");
		
	}
	void isPalindrome (String str) {
		
		String reverse="";
		for (int i=str.length()-1; i>=0; i--) {
			reverse+=str.charAt(i);
		}
		if (reverse.equalsIgnoreCase(str)) {
			System.out.println(str+" is palindrome");
		}else {
			System.out.println(str+" is not palindrome");
		}
	}
	
	
	
	
	
	
}
