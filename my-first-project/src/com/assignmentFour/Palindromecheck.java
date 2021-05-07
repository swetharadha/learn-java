package com.assignmentFour;

import java.util.Scanner;

public class Palindromecheck {

	public static void main(String args[]) {

		String original, reverse = "";

		Scanner name = new Scanner(System.in);

		System.out.println("Please enter a String");

		original = name.nextLine();

		int length = original.length();

		for (int i = length - 1; i >= 0; i--) {

			reverse = reverse + original.charAt(i);
		}
		if (original.equals(reverse)) {

			System.out.println("Entered string is a palindrome.");
		} else {

			System.out.println("Entered string isn't a palindrome.");
		}
	}
}
