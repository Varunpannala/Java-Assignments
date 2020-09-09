package java_day1main;
import java_day1.Prime;
import java.util.Scanner;


public class primemain {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter number - ");
	    int num = sc.nextInt();
	    Prime obj=new Prime();
	    if(num==1) {
		  System.out.println(num + " is a neither prime number nor composite number");
          System.exit(0);
	    }
	    if(obj.isNumberPrime(num)){
	      System.out.println(num + " is a prime number");
	    }else{
	      System.out.println(num + " is not a prime number");
	    }

 }
}