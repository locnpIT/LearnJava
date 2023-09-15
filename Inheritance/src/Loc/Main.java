package Loc;

public class Main {

	public static void main(String[] args) {
		Animals animal = new Animals("Generic animal", "Huge", 450);
		doAnimalStuff(animal, "slow");
		
		Dog dog = new Dog();
		doAnimalStuff(dog, "fast");
		
		Dog yorkie = new Dog("Yorkie", 15);
		doAnimalStuff(yorkie, "fast");
		
		Dog retriever = new Dog("Retriever", 65,
				"Floppy", "Swimmer");
		doAnimalStuff(retriever, "Slow");
		
		Dog wolf = new Dog("wolf", 40);
		doAnimalStuff(wolf, "fast");
		
		Fish goldie = new Fish("Gold fish", 0.25, 2, 3);
		doAnimalStuff(goldie, "fast");
		
	}
	
	public static void doAnimalStuff(Animals animal, String speed) {
		animal.makeNoise();
		animal.move(speed);
		System.out.println(animal);
		System.out.println("_ _ _ _ _ _ _");
		
	}

}
