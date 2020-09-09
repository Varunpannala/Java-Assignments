package java_day1;

public class Oddsum {
	public static int checkSum(int num) {
	    int n,sum=0;

		while(num>0) {
			n=num%10;
			if(n%2!=0) {
				sum+=n;
			}
			num=num/10;
			
					
		}
		if(sum%2!=0) {
          return 1;
		
	   }
		else {
			return -1;
		}
		 
}
}
