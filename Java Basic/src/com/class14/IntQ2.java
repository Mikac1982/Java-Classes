package com.class14;

public class IntQ2 {
  public static void main(String[] args) {
	  
	                // INTERVIEW QUESTION!
 //  2.Write a java program to find the second largest number in the array? Maximum and minimum number in the array?	  
	  
	int[] array= {32,-9,210,11,-43,15};
	int largest=0;
	int min=0;;
	int secondLar=0;
	
    for (int i=0; i<array.length; i++) {
    	
    	if (array[i]>largest) {
    		secondLar=largest;
    		largest=array[i];
    		
    	}else if (array[i]>secondLar) {
    		secondLar=array[i];
        }
    	if (array[i]<min) {
    		min=array[i];
    	}
    }
    System.out.println("Largest number           : "+largest);
	System.out.println("The second largest number: "+secondLar);
	System.out.println("Minimum number           : "+min);
	
}
}
