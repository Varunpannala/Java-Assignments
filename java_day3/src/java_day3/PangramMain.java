package java_day3;
import java_day3.Pangram;
import java.util.Scanner;


public class PangramMain {
	public static void main(String args[]) {

	   
  String string;
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter a string:");
  string = sc.nextLine();
  if(Pangram.pangram(string)) {
		System.out.println("Given string Pangram");

  }
  else {
		System.out.println("Given string isNot Pangram");
  }

  

   }
}
	
