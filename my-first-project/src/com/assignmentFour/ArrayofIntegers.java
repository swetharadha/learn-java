package com.assignmentFour;

import java.util.Scanner;

public class ArrayofIntegers {

	public static void main(String args[]) {

		Scanner value = new Scanner(System.in);

		int n = value.nextInt();

		value.close();

		int[] scores = { 99, 4, 23, 67, 89, 10, 67, 9, 23, 88, 45, 9, 37, 8, 12, 2, 100 };

		scores[2] = 100;
		boolean isAtleastOneMatchFound = false;

		for (int i = 0; i < scores.length; i++) {

			if (n == scores[i]) {

				System.out.println("-" + i);
				isAtleastOneMatchFound = true;

			}
		}

		if (isAtleastOneMatchFound == false) {
			System.out.println("Sorry Not Found");
		}
	}
}