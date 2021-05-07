package com.assignmentFour;

public class Reversestring {

	public static void main(String args[]) {

		String name = "Never Say Never";

		StringBuilder reversename = new StringBuilder();

		reversename.append(name);

		reversename.reverse();

		System.out.println(reversename);
	}
}
