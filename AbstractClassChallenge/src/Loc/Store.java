package Loc;

import java.util.ArrayList;

record OrderItem(int qty, ProducForSale product) {}

public class Store {
	
	private static ArrayList<ProducForSale> storeProducts = new ArrayList<>();
	
	public static void main(String[] args) {
		storeProducts.add(new ArtObject("Oil Painting", 1350, 
				"Impressionistic work by ABF painted in 2010"));
		storeProducts.add(new ArtObject("Sculpture", 2000, 
				"Bronze work by JKF, produce in 1950"));
		storeProducts.add(new ArtObject("Trường bú buồi", 200, "Trường bú buồi 1000 "
				+ "anh bách khoa"));
		storeProducts.add(new Furniture("Desk", 500, "Mahogany Desk"));
		storeProducts.add(new Furniture("Chair", 100, "Lazy chair"));
		listProducts();
		System.out.println("\nOrder 1");
		var order1 = new ArrayList<OrderItem>();
		addItemToOrder(order1, 1, 2);
		addItemToOrder(order1, 0, 1);
		addItemToOrder(order1, 2, 4);
		addItemToOrder(order1, 3, 3);
		addItemToOrder(order1, 4, 2);
		printOrder(order1);
		
		
		System.out.println("\norder2");
		var order2 = new ArrayList<OrderItem>();
		addItemToOrder(order2, 4, 2);
		printOrder(order2);
		
		
	}
	
	public static void listProducts() {
		for (ProducForSale item : storeProducts) {
			System.out.println("-".repeat(30));
			item.showDetails();
		}
	}
	
	public static void addItemToOrder(ArrayList<OrderItem> order, int orderIndex, int qty) {
		order.add(new OrderItem(qty, storeProducts.get(orderIndex)));
	}
	public static void printOrder(ArrayList<OrderItem> order) {
		double salesTotal = 0;
		for (OrderItem item : order) {
			item.product().printPricedItem(item.qty());
			salesTotal += item.product().getSalesPrice(item.qty());
		}
		System.out.printf("Sale Total = $%6.2f %n", salesTotal);
	}

}
