package java_day1main;
import java_day1.Oddsum;
import java.util.Scanner;

public class checksummain {
	public static void main(String[] args) {
    int num1,result;
	System.out.println("enter a number");
	Scanner input= new Scanner(System.in);
    num1=input.nextInt();
    result=Oddsum.checkSum(num1);

    if(result==1) {
    	System.out.println("Sum of odd digits is odd.");
    }
    else {
    	System.out.println("Sum of odd digits is even.");

    }
    	
    }

}
