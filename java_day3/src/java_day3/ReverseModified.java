package java_day3;

public class ReverseModified {
   
	public static StringBuilder getString(StringBuilder string,char character)
	{
	   StringBuilder resultString=new StringBuilder("");
	 
	   for(int i=string.length()-1;i>=0;i--)
	   {   
		   resultString.append(string.charAt(i));
           if(i!=0)
		   resultString.append(character);
		   
	   }
	return resultString;
	}
	
}
