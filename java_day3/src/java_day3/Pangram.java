package java_day3;

public class Pangram {

	public static boolean pangram(String str) {
		boolean[] alphaList = new boolean[26];
	      int index = 0;
	      int flag = 1;
	      for (int i = 0; i < str.length(); i++) {
	         if ( str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
	            index = str.charAt(i) - 'A';
	         }else if( str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
	            index = str.charAt(i) - 'a';
	      }
	      alphaList[index] = true;
	   }
	   for (int i = 0; i <= 25; i++) {
	      if (alphaList[i] == false)
	      flag = 0;
	   }

		if(flag==1) {
			
			return true;
		}
		
		else
			return false;
		
   }
}	
