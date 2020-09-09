package java_day1;

public class Sumofevendigits {
	public static int sumOfSquaresOfEvenDigits(int num) {
		int sum=0;
		while(num>0) {
			int n;
			n=num%10;
			if(n%2==0) {
				sum+=(n*n);
			}
			num=num/10;
		}
		return sum;
	}

}
