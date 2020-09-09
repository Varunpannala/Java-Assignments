package java_day1;

public class Prime {
	
	public  boolean isNumberPrime(int num){
	    boolean flag = true;
	    for(int i = 2; i < num/2; i++){
	      // No remainder means completely divides 
	      if(num % i == 0){
	        flag = false;
	        break;
	      }
	    }
	    return flag;
	  }

}
