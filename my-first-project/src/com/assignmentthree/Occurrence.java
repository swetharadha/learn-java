package com.assignmentthree;

import java.util.Scanner;

public class Occurrence {

	public static void main(String args[]) {

		Scanner character = new Scanner(System.in);

		String n = character.next();

		character.close();

		char string[] = n.toCharArray();
		int count;

		for (int i = 0; i < n.length(); i++) {

			count = 0;
			for (int j = 0; j < n.length(); j++) {

				if (string[i] == string[j]) {

					count++;
				}
			}
			System.out.println("Occurence of " + string[i] + " is: " + count);
		}

	}
}