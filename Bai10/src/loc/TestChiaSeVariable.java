package loc;

public class TestChiaSeVariable {

	public static void main(String[] args) {
		MyThread2 mt = new MyThread2();
		
		Thread th1 = new Thread(mt);
		th1.setName("Tiến trình 1");
		th1.start();
		
		Thread th2 = new Thread(mt);
		th2.setName("Tiến trình 2");
		th2.start();
		
		Thread th3 = new Thread(mt);
		th3.setName("Tiến trình 3");
		th3.start();
		
		System.out.println("x hiện tại lấy ra 	= " + mt.getX());

	}

}
