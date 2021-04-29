package com.swetha.math;

import com.swetha.GetTwoNumbers;

public class AddTwoNumbers {


	
	public static void main(String args[]) {
		
		GetTwoNumbers getTwoNumbers = new GetTwoNumbers();
		int additionResult = getTwoNumbers.getResultOfTwoNumbers();
		int subResult = getTwoNumbers.subtractTwoNumbers();
		System.out.println("Result is "+additionResult);
		System.out.println("Sub Result "+subResult);
		
		
		getTwoNumbers.logicToCheck();
	}
	
	
}
