package Loc;

public class Main {

	public static void main(String[] args) {
//		Item coke = new Item("drink", "Coke", 1.50);
//		coke.printItem();
//		coke.setSize("LARGE");
//		coke.printItem();
//		
//		Item avocado = new Item("Topping", "Avocado", 1.50);
//		avocado.printItem();
//		
//		System.out.println("=====-----=====-----=====");
//		Burger burger = new Burger("regular", 4.00);
//		burger.addToppings("BACON", "CHEESE", "MAYO");
//		burger.printItem();
		
//		MealOrder regularMeal = new MealOrder();
//		regularMeal.addBurgerTopping("BACON", "CHEESE", "SALAMI");
//		regularMeal.setSizeDrink("LARGE");
//		regularMeal.printItemizedList();
		 
		MealOrder deluxeMeal = new MealOrder("deluxe", "7-up", "chili");
		deluxeMeal.addBurgerTopping("AVOCADO", "BACON", "LETTUCE",
				"CHEESE", "MAYO");
		deluxeMeal.setSizeDrink("SMALL");
		deluxeMeal.printItemizedList();
		
		
		

	}

}
