package com.assignmentFour;

public class AboutTiger {

	public static void main(String[] args) {

		String aboutTiger = "The tiger is listed as Endangered on the IUCN Red List.";

		aboutTiger = aboutTiger.replace("IUCN", "");

		aboutTiger = aboutTiger.concat(
				"The tiger is among the most recognisable and popular of the world's charismatic megafauna. As of 2015, the global wild tiger population was estimated to number between 3,062.");

		aboutTiger = aboutTiger.concat("The generic name Panthera is derived from the Latin word panthera");

		aboutTiger = aboutTiger.replace("tiger", "Lion");

		aboutTiger = aboutTiger.toLowerCase();

		System.out.println(aboutTiger);
	}

}
