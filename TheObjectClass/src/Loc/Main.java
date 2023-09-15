package Loc;

public class Main extends Object{

	public static void main(String[] args) {
		Student loc = new Student("Loc", 19);
		System.out.println(loc.toString());
		
		primarySchoolStudent jimmy = new primarySchoolStudent("Jimmy", 13, "Carole");
		System.out.println(jimmy);
	}

}

class Student {
	private String name;
	private int age;
	
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
//	@Override
//	public String toString() {
//		return super.toString();
//	}
	@Override
	public String toString() {
		return "Student[ " + "name='" + name + ", age = " + age + "]";
	}
}
class primarySchoolStudent extends Student{
	private String parentName;
	
	
	public primarySchoolStudent(String name, int age, String parentName) {
		super(name, age);
		this.parentName = parentName;
		
	}
	@Override
	public String toString() {
		
		return parentName + "'s kid, " + super.toString();
	}

	
	
}
