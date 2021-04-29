package com.assignmenttwo;

import java.util.Scanner;

public class Numbers {

	public static void main(String args[]) {

		Scanner numbers = new Scanner(System.in);

		int i = numbers.nextInt();

		numbers.close();

		for (i = 0; i <= 100; i++) {

			if (i % 2 == 0) {
				System.out.println(i + "- Even");

			} else if (i % 2 != 0) {
				System.out.println(i + "- Odd");

			}

		}
	}
}