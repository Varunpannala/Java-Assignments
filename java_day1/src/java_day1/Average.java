package java_day1;
import java.util.Scanner;



public class Average {

	public static void main(String[] args) {
		int countofnumbers,sum=0,average;
		Scanner input= new Scanner(System.in);
	    System.out.println("enter total no of numbers");
	    countofnumbers=input.nextInt();
	    int  numbers[]=new int[countofnumbers];
	    for(int i=0;i<countofnumbers;i++) {
		    numbers[i]=input.nextInt();
		    sum=sum+numbers[i];

	    }
	    average=sum/countofnumbers;
	    System.out.println("Average is :"+average);


		 



	}

}
