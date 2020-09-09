package java_day1;

public  class UserMainCode {
	public static  String getLongestWord(String s) {
		String[]words=s.split(" ");
		String r=words[0];
		int max=words[0].length();
        int k=words.length;
    	System.out.println(k);

		for(int i=0;i<words.length;i++) {
			
			if(words[i].length()>max) {
			max=words[i].length();
			r=words[i];

				
			}
		}
		 return r;
		
	}

}
