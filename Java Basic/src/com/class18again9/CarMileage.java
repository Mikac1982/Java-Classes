package com.class18again9;

public class CarMileage {
	public static void main(String[] args) {
          // 9999
		
		CarMileage obj=new CarMileage();
		obj.printMiles();
	}
		void printMiles() {
			
			for (int a = 0; a <= 9; a++) {

				for (int b = 0; b <= 9; b++) {

					for (int c = 0; c <= 9; c++) {

						for (int d = 0; d <= 9; d++) {

							System.out.println(a + "" + b + "" + c+""+d); //0000; 0001; 0002; ...0009; 0010; 0011;
						}
					}
				}
			}
		}
		
	
}
