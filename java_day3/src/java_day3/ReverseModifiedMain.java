package java_day3;
import java.util.*;
import java_day3.ReverseModified;


public class ReverseModifiedMain {
public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter input String");
		String string=scanner.nextLine();
		StringBuilder sb = new StringBuilder(string);
		System.out.println("Enter input character");
		char character=scanner.nextLine().charAt(0);
		System.out.println("Modified reverse String   "+ReverseModified.getString(sb, character));

	}
	
	
}
