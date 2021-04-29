package com.assignmentthree;

import java.util.Scanner;

public class DuplicateCharacter {

	public static void main(String args[]) {

		Scanner character = new Scanner(System.in);

		String n = character.next();

		character.close();

		char string[] = n.toCharArray();

		System.out.println("Duplicate Characters are:");

		for (int i = 0; i < n.length(); i++) {

			for (int j = i + 1; j < n.length(); j++) {

				if (string[i] == string[j]) {

					System.out.println(string[j]);

					break;
				}

			}
		}
	}
}