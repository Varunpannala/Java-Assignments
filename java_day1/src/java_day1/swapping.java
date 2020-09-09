package java_day1;
import java.util.Scanner;


public class swapping {
	public static void main(String[] args) {
    int num1,num2;
	Scanner input= new Scanner(System.in);
	System.out.println("enter values of num1 and num2 :" );
	num1=input.nextInt();
	num2=input.nextInt();
    System.out.println("Before swap");
    System.out.println("Value of x is :" + num1);
    System.out.println("Value of y is :" + num2);
    swap(num1,num2);
	}
 private static void swap(int x, int y){
    	  int temp = x;
    	  x = y;
    	  y=temp;

    System.out.println("After Swapping");
    System.out.println("Value of x is :" + x);
    System.out.println("Value of y is :" + y);		
	}
		
	
}
