package com.assignmentthree;

import java.util.Scanner;

public class Occurrence {

	public static void main(String args[]) {

		Scanner character = new Scanner(System.in);

		String n = character.next();

		character.close();

		char string[] = n.toCharArray();
		int count = 1;

		for (int i = 0; i < n.length(); i++) {

			count = 1;
			for (int j = i + 1; j < n.length(); j++) {

				if (string[i] == string[j]) {

					count++;
				}
			}
			System.out.println("Occurence of " + string[i] + " is: " + count);
		}

	}
}