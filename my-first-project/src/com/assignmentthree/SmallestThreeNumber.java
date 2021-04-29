package com.assignmentthree;

import java.util.Scanner;

public class SmallestThreeNumber {

	public static void main(String args[]) {

		int x, y, z;

		Scanner number = new Scanner(System.in);

		System.out.print("Enter the first number:");
		x = number.nextInt();

		System.out.print("Enter the second number:");
		y = number.nextInt();

		System.out.print("Enter the thrid number:");
		z = number.nextInt();

		number.close();

		if (x < y && x < z) {

			System.out.print("Smallest number is-" + x);

		}

		else if (y < z)

		{

			System.out.print("Smallest number is-" + y);
		} else

		{

			System.out.print("Smallest number is-" + z);
		}
	}

}
