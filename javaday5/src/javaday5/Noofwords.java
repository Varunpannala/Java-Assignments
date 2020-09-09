package javaday5;

public class Noofwords {
	
	public static  int noOfWords(String s) {
		String[]words=s.split(" ");
        int k=words.length;
    	System.out.println(k);
        
    	return k;
  
 }
}
