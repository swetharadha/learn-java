package com.assignmenttwo;

import java.util.Scanner;

public class Multiplication {

	public static void main(String args[]) {

		Scanner mulitiplication = new Scanner(System.in);

		int n = mulitiplication.nextInt();

		mulitiplication.close();

		for (int i = 1; i <= 10; i++) {

			System.out.println(n + "*" + i + "=" + n * i);

		}

	}

}
