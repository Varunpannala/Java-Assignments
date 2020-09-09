package java_day1;

public class Fizz {
	public static void main(String[] args) {
  for(int i=1;i<100;i++) {
	  if((i%5==0)&&(i%3==0)){
			System.out.println(i +" fizz buzz");
			continue;
	  }
		  
	  if(i%3==0) {
			System.out.println(i +" fizz");

	  }
	  else {
		  if(i%5==0){
			System.out.println(i +" buzz");
		 }
  }
	}
 }
}
