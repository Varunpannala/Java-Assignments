package java_day2;

import java.util.Scanner;

public class Addition {
	
	public static void main(String[] args) {
		int  numbers,sum;
		Scanner input= new Scanner(System.in);
	    System.out.println("enter total no of numbers");
	    numbers=input.nextInt();
	    int  array[]=new int[numbers];
	    for(int i=0;i<array.length;i++) {
			  
        array[i]=input.nextInt();		  
	  }
	    add(array,numbers);
}	    

	
	  public static void add(int[] a,int n) {
		  int s=0;
		  int  b[]=new int[n];
		  for(int i=0;i<a.length;i++) {
			  
		     s+=a[i];
		     b[i]=s;
		     
		  
	  }
	  for(int i=0;i<b.length;i++) {
			 System.out.println("Addition of numbers"+b[i]);

			}	    
  }

}

