package com.assignmentFour;

public class Ternary {

	public static void main(String[] args) {

		int num = 100;

		for (int i = 0; i <= num; i++) {

			String check = (i % 2 == 0) ? "even" : "odd";

			System.out.println(i + "-" + check);
		}

	}
}
