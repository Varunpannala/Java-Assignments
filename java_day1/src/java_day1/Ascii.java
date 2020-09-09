package java_day1;
import java.util.Scanner;

public class Ascii {
	 
	public static void main(String[] args)   
	{  
	Scanner input= new Scanner(System.in);
	char ch1 = input.next().charAt(0);  
	char ch2 = input.next().charAt(0); 
 
	int asciivalue1 = ch1;  
	int asciivalue2 = ch2;  
	System.out.println("The ASCII value of " + ch1 + " is: " + asciivalue1);  
	System.out.println("The ASCII value of " + ch2 + " is: " + asciivalue2);  
	}  
	}  


