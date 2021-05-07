package com.assignmentFour;

public class WildAnimals {

	public static void main(String[] args) {

		String[] animals = { "Caiman", "Caiman Lizard", "Cairn Terrier", "Camel", "Camel Spider", "Canaan Dog",
				"Canadian Eskimo Dog", "Capybara", "Caracal", "Carolina Dog", "Carp", "Cassowary", "Cat", "Caterpillar",
				"Catfish", "Cavador", "Cavalier King Charles Spaniel", "Cavapoo", "Centipede", "Cesky Fousek",
				"Cesky Terrier", "Chameleon", "Chamois", "Cheagle", "Cheetah", "Chesapeake Bay Retriever", "Chicken",
				"Chihuahua", "Chimaera", "Chimpanzee", "Chinchilla", "Chinese Crested Dog", "Chinese Paddlefish",
				"Chinook", "Chinstrap Penguin", "Chipmunk", "Chipoo" };

		animals[1] = "Bear";
		int i = 1;

		for (String animal : animals) {

			System.out.println(i + ". " + animal);
			i++;
		}

	}
}
