package java_day3;

public class SubString {

 public static String subString(String s,int start,int end) {
	        String str="";
	        for(int i=start;i<end;i++){
	            str += s.charAt(i);
	        }
	        return(str);
	    }
	}

