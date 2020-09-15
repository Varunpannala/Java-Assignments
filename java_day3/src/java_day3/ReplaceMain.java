//Write a Java program to replace all the 'd' occurrence characters with ‘h’ characters in each string.
package java_day3;
import java.util.*;
import java_day3.Replace;
public class ReplaceMain {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("please enter the String");
		String str = input.nextLine();
        StringBuilder strb  = new StringBuilder(str);
		System.out.println("Enter the character to replace");
		char ch = input.next().charAt(0);
		System.out.println("Enter the new character to replace");
		char newCh = input.next().charAt(0);
		System.out.println("The new String is : "+Replace.replace(str,ch,newCh));


  }
}	
