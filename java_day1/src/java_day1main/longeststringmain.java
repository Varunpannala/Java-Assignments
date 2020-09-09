package java_day1main;
import java.util.Scanner;
import java_day1.UserMainCode;
public class longeststringmain {

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
    	System.out.println("Enter a string");

        String inputString = sc. nextLine();
        
        //UserMainCode obj=new UserMainCode();
     	System.out.println( "longest string  "+ UserMainCode.getLongestWord(inputString));
	
	}

}
