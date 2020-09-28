//You are required to compute the power of a number by implementing a calculator. Create a class MyCalculator which consists of a single method long power(int, int). This method takes two integers, and , as parameters and finds . If either or is negative, then the method must throw an exception which says "". Also, if both and are zero, then the method must throw an exception which says ""
package java_day5;
import java.util.*;
import java.lang.Exception;
public class MyCalculatorMain {
	public static void main(String[] args) {
			
		Scanner input = new Scanner(System.in);
		int number, power;
		MyCalculator myCalculator = new MyCalculator();
		System.out.println("Enter a number ");
		number = input.nextInt();
		System.out.println("Enter a power ");
		power = input.nextInt();
		try {
			if (number <= 0 || power <= 0) {
				throw new Exception("Both values must be greater than zero");
			} else {
				System.out.println(myCalculator.power(number, power));
			}
		} catch (Exception exception) {
			System.out.println(exception);
		}

	}

}
