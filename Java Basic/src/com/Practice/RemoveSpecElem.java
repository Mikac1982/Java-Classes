package com.Practice;

public class RemoveSpecElem {
   public static void main(String[] args) {
	
   // Write a Java program to remove a specific element from an array
	   
	int[] arr= {32,7,153,69,36,11,5,101,7};
	
	int a=69;
	int[] arr1=new int [arr.length-1];
	 
    for(int i=0;i<arr.length;++i) {
        if(arr[i]!=a) {
           for(int y=0; y<arr.length-1; y++) {
               arr1[y]=arr1[1];
                        
           }
           System.out.print(arr[i]+" ");
        }
 
    }
    

	
}
}
