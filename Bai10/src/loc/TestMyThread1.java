package loc;

public class TestMyThread1 {

	public static void main(String[] args) {
		MyThread1 th1 = new MyThread1();
		th1.setName("Tiến trình 1");
		th1.start(); //kích hoạt tiến trình (gọi là tiểu trình)
	
		MyThread1 th2 = new MyThread1();
		th2.setName("Tiến trình 2");
		th2.start();
	
	}

}
