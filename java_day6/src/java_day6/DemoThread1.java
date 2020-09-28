package java_day6;

public class DemoThread1 implements Runnable{
	
	public void run() {
		System.out.println("running child Thread in loop :");
		for(int i=1;i<=10;i++) {
			System.out.println(i);
			try {
				Thread.sleep(2000);
			}
			catch(InterruptedException interruptedException) {
				System.out.println(interruptedException);
			}
		}
	}
	
}