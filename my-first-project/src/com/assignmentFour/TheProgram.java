package com.assignmentFour;

import java.util.Scanner;

public class TheProgram {

	public static void main(String args[]) {

		Scanner number = new Scanner(System.in);

		System.out.println("Please enter a number:");

		int n = number.nextInt();

		while (n != 5) {

			System.out.println("Please re-enter a number:");

			n = number.nextInt();

		}

		System.out.println("You are exited from the program");

		number.close();
	}

}
