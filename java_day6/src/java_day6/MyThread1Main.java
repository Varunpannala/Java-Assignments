package java_day6;

public class MyThread1Main {
	public static void main(String[] args) {

		MyThread1 demoThread1 = new MyThread1();
		Thread t1 = new Thread(demoThread1);
		MyThread1 demoThread2 = new MyThread1();
		Thread t2 = new Thread(demoThread2);
		t1.start();
		t1.setName("Mythread");
		t2.start();

	}

}
