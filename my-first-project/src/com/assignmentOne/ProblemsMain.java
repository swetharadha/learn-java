package com.assignmentOne;

public class ProblemsMain {

	public static void main(String args[]) {

		OddOrEven oddoreven = new OddOrEven();
		oddoreven.oddorEven(35);
		oddoreven.oddorEven(22);

		AreaOfRectangle areaofrectangle = new AreaOfRectangle();
		int area = areaofrectangle.getAreaOfRectangle(12, 4);
		System.out.println(area + " is the area of the rectangle");

		SumOfTwoNumbers sumoftwonumbers = new SumOfTwoNumbers();
		int sum = sumoftwonumbers.additionoftwonumbers(4, 5);
		System.out.println("sum of two numbers is " + sum);

		CheckString checkstring = new CheckString();
		checkstring.stringcheck("Python");
		checkstring.stringcheck("Java");

	}
}
