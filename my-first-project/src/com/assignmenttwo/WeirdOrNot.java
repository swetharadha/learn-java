package com.assignmenttwo;

import java.util.Scanner;

public class WeirdOrNot {

	public static void main(String args[]) {

		Scanner weirdornot = new Scanner(System.in);

		int n = weirdornot.nextInt();

		weirdornot.close();

		if (n % 2 != 0) {
			System.out.println("it is weird");

		} else if (n % 2 == 0) {

			if (n >= 10 && n <= 20) {

				System.out.println("it is not weird");
			}
		} else if (n >= 30 && n <= 100) {
			System.out.println("it is weird");

		} else if (n > 100) {
			System.out.println("it is not weird");

		}

	}

}
