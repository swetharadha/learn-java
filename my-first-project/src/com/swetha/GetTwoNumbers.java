package com.swetha;

public class GetTwoNumbers {

	private int num1 = 10;
	
	private int num2 = 100;
	
	private int num3 = 20;
	
	public int getResultOfTwoNumbers() {
		num2 = 2;
		int result = num1 + num2;
		return result;
	}
	
	public int subtractTwoNumbers() {
		int result = num2 - num3;
		return result;
		
	}
	
	public void logicToCheck() {
		if(num3 > 5) {
			System.out.println(num3+" is greater than a 5");
		}
		else {
			System.out.println(num3+" is less than 5");
		}	
		
	}
	
	
}
