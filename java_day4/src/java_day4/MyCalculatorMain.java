package java_day4;
import java.util.Scanner;

public class MyCalculatorMain {
public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		MyCalculator myCalculator=new MyCalculator();
		System.out.println("Enter the Number");
		int n=scanner.nextInt();
		System.out.println("Sum of Divisors is :"+ myCalculator.divisor_sum(n));

	}
	

}
