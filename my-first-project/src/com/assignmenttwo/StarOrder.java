package com.assignmenttwo;

import java.util.Scanner;

public class StarOrder {

	public static void main(String args[]) {

		Scanner starOrder = new Scanner(System.in);

		int n = starOrder.nextInt();

		starOrder.close();

		switch (n) {

		case 1:
			for (int i = 1; i < 5; i++) {

				for (int j = 1; j <= 5; j++) {
					System.out.print("*");
				}
				System.out.println("");

			}

			break;
		case 2:
			for (int i = 1; i < 5; i++) {

				for (int j = 1; j <= i; j++) {
					System.out.print("*");
				}
				System.out.println("");
			}
			break;

		case 3:

			for (int i = 1; i < 5; i++) {

				for (int k = 4; k > i; k--) {
					System.out.print(" ");
				}
				for (int j = 1; j <= i; j++) {
					System.out.print("*");

				}
				System.out.println("");
			}

			break;

		case 4:

			for (int i = 1; i < 6; i++) {

				for (int j = 5; j > i; j--) {
					System.out.print(" ");
				}

				for (int k = 1; k <= i; k++) {

					System.out.print("*");

				}

				for (int l = 2; l <= i; l++) {
					System.out.print("*");

				}

				System.out.println("");
			}

			break;

		case 5:

			int number = 1;

			for (int i = 0; i < 5; i++) {
				for (int j = 5; j > i; j--) {
					System.out.print(" ");
				}
				for (int k = 1; k <= i; k++) {
					System.out.print(number);
				}
				for (int l = 0; l <= i; l++) {
					System.out.print(number);
				}
				number++;
				System.out.println();
			}
			break;

		case 6:

			int numberToPrint = 1;
			int numberOfLines = 4;

			for (int i = 1; i <= numberOfLines; i++) {

				for (int j = numberOfLines - 1; j >= i; j--) {
					System.out.print(" ");
				}

				numberToPrint = i;
				for (int k = 1; k <= i; k++) {

					System.out.print(numberToPrint);

					if (numberToPrint > 1) {
						numberToPrint--;
					}

				}

				numberToPrint = 2;
				for (int l = 1; l < i; l++) {

					if (l > 1) {
						numberToPrint++;
					}
					System.out.print(numberToPrint);

				}

				System.out.println();
			}
			break;
		}

	}

}
