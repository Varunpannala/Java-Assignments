//Write a Java method to display the middle character of a string. 
// a) If the length of the string is odd there will be two middle characters.
// b) If the length of the string is even there will be one middle character.

package java_day2;
import java_day2.Middlechar;
import java.util.Scanner;

public class Middlecharmain {
	  public static void main(String[] args) {

	 Scanner in = new Scanner(System.in);
     System.out.print("Input a string: ");
     String str = in.nextLine();
     System.out.print("The middle character in the string: " + Middlechar.middlechar(str));

   }
}
