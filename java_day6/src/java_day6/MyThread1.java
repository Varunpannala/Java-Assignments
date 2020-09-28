package java_day6;
import java.time.LocalTime;

public class MyThread1 extends Thread{
	
	public void run() {
		System.out.println("\n current thread = "+Thread.currentThread());
		try {
			Thread.sleep(10000);
		}
		catch(InterruptedException interruptedException) {
			System.out.println(interruptedException);
		}
		LocalTime time = LocalTime.now();
		System.out.printf("time after execution of a thread %d(hours)-%d(minutes)-%d(seconds)",time.getHour(),time.getMinute(),time.getSecond());
	
	}
	
}