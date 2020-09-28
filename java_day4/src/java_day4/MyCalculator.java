/*You need to write a class called MyCalculator which implements the interface.
divisorSum function just takes an integer as input and return the sum of all its divisors.*/ 

package java_day4;

public class MyCalculator implements AdvancedArithmetic {

	
	public int divisor_sum(int number) {
		int sum=0;
		for(int i=1;i<=number;i++)
		{
		  if(number%i==0)
		  {
			  sum=sum+i;
		  }
		}
		return sum;
	}

}