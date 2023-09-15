package Loc;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main {

	public static void main(String[] args) {
//		LinkedList<String> placesToVisit = new LinkedList<>();
		var placesToVisit = new LinkedList<String>();
		placesToVisit.add("Sydney");
//		.add(index, value);
		placesToVisit.add(0, "Caribean");
		System.out.println(placesToVisit);
		addMoreElements(placesToVisit);
		System.out.println(placesToVisit);
		
//		removeElements(placesToVisit);
//		System.out.println(placesToVisit);
		gettingElements(placesToVisit);
		
		
//		printItinerary(placesToVisit);
		
//		printItinerary2(placesToVisit);
	
//		printItinerary3(placesToVisit);
		testIterator(placesToVisit);
	}
	
	private static void addMoreElements(LinkedList<String> list) {
		
		list.addFirst("Darwin");
		list.addLast("Hobart");
//		queue methods 
		list.offer("Melbourne"); // add last
		list.offerFirst("Brisbane");
		list.offerLast("Toowoomba");
//		Stack methods
		list.push("Alice Spring"); // add first
	}
	
	private static void removeElements(LinkedList<String> list) {
		list.remove(4);
		list.remove("Hobart");
		
		System.out.println(list);
		String s1 = list.remove(); // remove first element
		System.out.println(s1 + " Was remove");
		
		String s2 = list.removeFirst(); // remove first element
		System.out.println(s2 + " Was remove");
		
		String s3 = list.removeLast();
		System.out.println(s3 + " Was remove");
		
//		Queue/Deque poll methods
		String p1 = list.poll(); // remove first element
		System.out.println(p1 + " Was remove");
		
		String p2 = list.pollFirst(); // remove first element
		System.out.println(p2 + " Was remove");
		
		String p3 = list.pollLast(); // remove last element
		System.out.println(p3 + " Was Remove");
		
		list.push("Quang Nam");
		list.push("Quang Ngai");
		list.push("Quang Tri");
		String p4 = list.pop(); // remove first elements
		System.out.println(p4 + " Was remove");	
	}
	
	private static void gettingElements(LinkedList<String> list) {
		System.out.println("Retrived Element = " +list.get(4));
		
		System.out.println("First Element = " + list.getFirst());
		System.out.println("Last Element = " + list.getLast());
		
		System.out.println("Darwin is at position " + list.indexOf("Darwin"));
		System.out.println("Melbourne is at position " + list.lastIndexOf("Melbourne"));
		/*
		 * lastIndexOf trả về vị trí cuối cùng của phần tử, vd có 2 phần từ giống nhau thì
		 * nó sẽ trả về vị trí phần tử thứ 2 vì nó là cuối
		 * */		
//		Queue retrieval method
		System.out.println("Element from element() = " + list.element()); // get first
//		Stack retrieval methods
		System.out.println("Element from peek() = " + list.peek()); // get first
		System.out.println("Element from peekFirst() = " + list.peekFirst()); // get first
		System.out.println("Element from peekLast() = " + list.peekLast()); //get last
	
	}
	
	public static void printItinerary(LinkedList<String> list) {
		System.out.println("Trip starts at " + list.getFirst());
		for(int i = 0; i < list.size() - 1; i++) {
			System.out.println("--> From: " + list.get(i) + " to " + list.get(i+1));
		}
		System.out.println("Trip end at " + list.getLast());
	}
	
	public static void printItinerary2(LinkedList<String> list) {
		System.out.println("Trip starts at " + list.getFirst());
		String previousTown = list.getFirst();
		for (String town : list) {
			System.out.println("-->From " + previousTown + " to " + town);
			previousTown = town;
		}
		System.out.println("Trip end at " + list.getLast());
	}
	
	public static void printItinerary3(LinkedList<String> list) {
		System.out.println("Trip starts at " + list.getFirst());
		String previousTown = list.getFirst();
		ListIterator<String> iterator = list.listIterator(1); 
		while(iterator.hasNext()) {
			
			var town = iterator.next();
			System.out.println("-->From: " + previousTown + " to " + town);
			previousTown = town;
			
			
		}
		
		System.out.println("Trip end at " + list.getLast());
		
	}
	
	
	/*
	 *  iterator thì ko có add, chỉ có remove thuiii 
	 *  listIterator thì có add và set và remove
	 * */
	
	private static void testIterator(LinkedList<String> list) {
		var iterator = list.listIterator();
		while(iterator.hasNext()) {
//			System.out.println(iterator.next() + "-");
			if(iterator.next().equals("Brisbane")) {
				iterator.add("Lake Wivenhoe");
			}
		}
		while(iterator.hasPrevious()) {
			System.out.println(iterator.previous());
		}
		System.out.println(list);
		
//		cách đặt vị trí con trỏ
		var iterator2 = list.listIterator(3);
		System.out.println(iterator2.next());
		
	}
	
	
}
