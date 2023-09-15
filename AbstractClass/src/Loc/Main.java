package Loc;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Dog dog = new Dog("Wolf", "Big", 150);
		dog.makeNoise();
		doAnimalStuff(dog);
		
		System.out.println("-".repeat(30));
		ArrayList<Animals> animals = new ArrayList<>();
		animals.add(dog);
		animals.add(new Dog("German Shepard", "big", 120));
		animals.add(new Fish("Goldfish", "small", 2));
		animals.add(new Fish("Megalodon", "big", 9000));
		animals.add(new Dog("Pug", "small", 8));
		animals.add(new Horse("Black Horse", "Big", 200));
		
		for (Animals animal : animals) {
			doAnimalStuff(animal);
		}
		
	}
	
	private static void doAnimalStuff(Animals animal) {
		animal.makeNoise();
		animal.move("slow");
		if(animal instanceof Mammal currentMammal) {
			currentMammal.shedHair();
		}
		
	}

}
