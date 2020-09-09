package javaday4;
	
import java.util.Scanner;

public class Linearsearchmain {

	  public static void main(String[] args) {
			Scanner scanner=new Scanner(System.in);
		    System.out.println("Enter a String");
	        String inputString = scanner. nextLine();
	        char c = scanner.next().charAt(0);
	        System.out.println("occurance is"+linearsearch.search(inputString,c));


  }
}