//hWrite a Java program to convert all the characters in a string to lowercase.
package java_day3;
import java.util.Scanner;
public class Lower {
 
	public static void main(String args[]) 
    { 
        String string;
        Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the string: ");    
        string=sc.nextLine();
	    String convertedstring = string.toLowerCase();
	    System.out.println("convertedstring is: "+convertedstring);    
	} 
}


