package com.assignmentthree;

import java.util.Scanner;

public class SumOfnNumbers {

	public static void main(String args[]) {
		int sum = 0;
		Scanner number = new Scanner(System.in);

		int n = number.nextInt();

		number.close();

		for (int i = 1; i <= n; i++) {

			sum = sum + i;
		}
		System.out.print("sum of n-" + sum);
	}
}
