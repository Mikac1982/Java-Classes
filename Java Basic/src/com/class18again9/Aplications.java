package com.class18again9;

import com.class18.Calculator;

public class Aplications {

	
	public static void main(String[] args) {
		
		Calculator obj=new Calculator();
		
		
		System.out.println(obj.sum(10, 20));  //diferent ways of doing this
		obj.sub(40, 33);
		System.out.println(obj.div(50, 5));
		obj.mult(4, 8);
	}
}
