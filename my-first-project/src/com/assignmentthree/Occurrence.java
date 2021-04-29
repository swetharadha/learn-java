package com.assignmentthree;

import java.util.Scanner;

public class Occurrence {

	public static void main(String args[]) {

		Scanner character = new Scanner(System.in);

		String n = character.next();

		character.close();

		for (int i = 0; i < n.length(); i++) {

			System.out.println("Occurrence of a:" + n.length());

		}

	}
}