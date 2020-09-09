package javaday4;

public class linearsearch {
   public  static int search(String s,char searchelement) {
	   int i,c=0;
	   for(i=0;i<s.length();i++) {
		   if(searchelement==s.charAt(i)){
			   c+=1;
		   }
	   }
	   
	   return c;
   }
	
	
}
