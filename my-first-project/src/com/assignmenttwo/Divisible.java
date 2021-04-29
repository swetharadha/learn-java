package com.assignmenttwo;

import java.util.Scanner;

public class Divisible {

	public static void main(String args[]) {

		Scanner divisible = new Scanner(System.in);

		int n = divisible.nextInt();

		divisible.close();

		for (int i = 1; i <= 100; i++) {

			if ((i % 3 == 0) || (i % 5 == 0)) {
				System.out.print(i + " ");

			}

		}

	}

}
