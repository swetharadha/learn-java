package com.assignmentthree;

import java.util.Scanner;

public class PercentageAndGrade {

	public static void main(String args[]) {
		float avg;
		int a, b, c, d, sum;

		Scanner marks = new Scanner(System.in);

		System.out.print("Enter the science score:");
		a = marks.nextInt();

		System.out.print("Enter the maths score:");
		b = marks.nextInt();

		System.out.print("Enter the english score:");
		c = marks.nextInt();

		System.out.print("Enter the computer score:");
		d = marks.nextInt();

		sum = a + b + c + d;
		System.out.println("Total Marks:" + sum);

		avg = sum / 4;
		System.out.println("Average:" + avg);

		marks.close();

		if (avg <= 50) {
			System.out.println("Grade= F");
		} else {
			System.out.println("Grade= S");
		}

	}

}
