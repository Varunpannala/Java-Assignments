package java_day3;

import java.util.Scanner;

public class StringWithoutMain {


	public static void main(String args[])
	   {
	      String string;
	      Scanner sc = new Scanner(System.in);
	 
	      System.out.println("Enter a string:");
	      string = sc.nextLine();
	     //   StringWithout.stringWithout(string);
	      System.out.println("Enter a string: "+StringWithout.getString(string));

	

	   }
}