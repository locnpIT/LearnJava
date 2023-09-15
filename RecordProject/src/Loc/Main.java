package Loc;

public class Main {

	public static void main(String[] args) {
		for(int i = 1; i <= 5; i++) {
			LPAStudent s = new LPAStudent("S92300" + i, 
					switch(i) {
					case 1 -> "Mary";
					case 2 -> "Loc";
					case 3 -> "Ngan";
					case 4 -> "Cac";
					case 5 -> "Me";
					default -> "Anonymous";
					},
					"30/01/2004", 
					"Java Master Class");
			System.out.println(s);
		}
		Student pojoStudent = new Student("s923006", "Loooc", "30/02/2004",
				"Java Master Class");
		LPAStudent recordStudent = new LPAStudent("s923007", "Thinh", "19/04/2000",
				"Python Master Class");
		System.out.println(pojoStudent);
		System.out.println(recordStudent);
		System.out.println("============");
		pojoStudent.setClassList(pojoStudent.getClassList() + " Java OCP EXAM 829");
		System.out.println(pojoStudent.getName() + " is talking about " + pojoStudent.getClassList());
		System.out.println(recordStudent.name() + " is talking about " + recordStudent.classList()); 

	}

}
