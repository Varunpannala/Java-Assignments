//Write a Java method to count all vowels in a string. 
package java_day2;
import java.util.Scanner;
import java_day2.Vowel;

public class vowelmain {
	

	   public static void main(String[] args) {
	      // declare variables
	      Scanner scan = null;
	      String str = null;
	      int countVowel = 0;

	      // create Scanner class object
	      scan = new Scanner(System.in);

	      // read input
	      System.out.print("Enter String:: ");
	      str = scan.nextLine();

	      // convert string to upperCase
	      str = str.toUpperCase();

	      // check each character
	      for(int i=0; i < str.length(); i++) {
	         if(Vowel.isVowel(str.charAt(i))) {
	            countVowel++;
	      }
	     }
	      System.out.println("Number of vowels:: "+ countVowel);

	   }

}
