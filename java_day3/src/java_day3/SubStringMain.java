//Accept a string and two indices(integers),and print the substring consisting of all characters inclusive range from ..to . 
package java_day3;
import java_day3.SubString;
import java.util.Scanner;

public class SubStringMain {
	
	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
		    System.out.println("Enter the String : ");  
	        String S = in.next();
		    System.out.println("Enter the start of substring ");  
	        int start = in.nextInt();
		    System.out.println("Enter the end of substring: ");  
	        int end = in.nextInt();
	        String str="";
	        for(int i=start;i<end;i++){
	            str += S.charAt(i);
	        }
		     System.out.println("SubString is : "+SubString.subString(S,start,end));  

	    }
	}


