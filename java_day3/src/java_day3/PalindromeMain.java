//Given a string , print ‘Yes’ if it is a palindrome, print ‘No’ otherwise. 
package java_day3;
import java_day3.Palindrome;
import java.util.Scanner;


public class PalindromeMain {
	
	public static void main(String args[])
	   {
	      String string;
	      Scanner sc = new Scanner(System.in);
	 
	      System.out.println("Enter a string:");
	      string = sc.nextLine();
	      if(Palindrome.palindrome(string)) {
	  		System.out.println("Given string Palindrome ");

	      }
	      else
	  		System.out.println("Given string isNot Palindrome");



  }
}
