package java_day3;
import com.hcl.Calculator;
import java.util.Scanner;

public class AdditionMain {
	public static void main(String args[])
	   {
	      int num1,num2;
	      Scanner sc = new Scanner(System.in);
	 
	      System.out.println("Enter num1 :");
	      num1 = sc.nextInt();
	      System.out.println("Enter num2 :");
	      num2 = sc.nextInt();
	      Calculator obj=new Calculator();
	      System.out.println("Sum of numbers is "+obj.add(num1, num2));



	
  }
}