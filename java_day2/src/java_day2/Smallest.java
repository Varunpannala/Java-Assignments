//Write a Java method to find the smallest number among three numbers.
package java_day2;

import java.util.Scanner;

public class Smallest {
	
	public static void main(String args[]){
		  int min;
	      Scanner in = new Scanner(System.in);
	      System.out.println("enter the array size");
	      int arr_size = in.nextInt();
	       int arr[] = new int[arr_size];
	       System.out.println("enter the elements of array");

	      for(int idx = 0; idx <= arr_size - 1; idx++)
	      {
	         arr[idx] = in.nextInt();
	      }
	      min=arr[0];
	      for(int idx = 0; idx <= arr_size-1 ; idx++)
	      {
	    	  if(arr[idx]<min) {
	    		  min=arr[idx];
	    	  }
	      }
	         System.out.println(min);

	} 

}
