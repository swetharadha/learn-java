package com.assignmenttwo;

public class PrintName {

	void printname(String name) {

		for (int i = name.length() - 1; i >= 0; i--) {
			System.out.print(name.charAt(i));
		}

		System.out.println();

		for (int i = 0; i < name.length(); i++) {
			System.out.print(name.charAt(i));
		}
	}
}
