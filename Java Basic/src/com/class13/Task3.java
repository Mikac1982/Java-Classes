package com.class13;

import java.util.Scanner;

public class Task3 {
	public static void main(String[] args) {
		
		// Write a program that reads two people’s first names and if they expecting boy or girl? 
	    // Based on the input suggests a name for a baby:
		//  Example Output:
		//	  Mom’s first name? Mary
		//	  Dad’s first name? Daniel
		//	  Boy or Girl? boy
		//	  Suggested baby name: DANRY

		//	  Example Output:
		//	  Mom’s first name? Mary
		//	  Dad’s first name? Daniel
		//	  Boy or Girl? girl
		//	  Suggested baby name: MAIEL  
		  
		String motherName, fatherName;
		String gender;
		
		  Scanner scan=new Scanner(System.in);
		  System.out.println("Please enter mother's first names");
		  motherName=scan.nextLine();
		  System.out.println("Please enter father's first names");
		  fatherName=scan.nextLine();
		  
		  System.out.println("Are they expecting a boy or a girl?");
		  gender=scan.nextLine();
		  
		  if (gender.equals("boy")) {
			  System.out.println("Danilo");
		  }else if (gender.equals("girl")) {
			  System.out.println("Petra");
		  }	 
	   }
}
