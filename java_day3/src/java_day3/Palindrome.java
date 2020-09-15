package java_day3;

public class Palindrome {
	public static boolean palindrome(String str) {
	      int length = str.length();
	      String rev="";

	      for ( int i = length - 1; i >= 0; i-- ) {
	           rev = rev + str.charAt(i);
	      }
	 
	      if (str.equals(rev))
	    	  return true;
	      else
	          return false;
	   }
}
