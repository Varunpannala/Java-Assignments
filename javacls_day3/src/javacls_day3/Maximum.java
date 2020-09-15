package javacls_day3;

import java.util.Scanner;

public class Maximum {
	public static void main(String args[]){
		  int max;
	      Scanner in = new Scanner(System.in);
	      int arr_size = in.nextInt();
	      System.out.println("Enter the Size :");
	      int arr[] = new int[arr_size];
	      System.out.println("Enter the array elements : ");
	      for(int idx = 0; idx <= arr_size - 1; idx++)
	      {
	         arr[idx] = in.nextInt();
	      }
	      max=arr[0];
	      for(int idx = 0; idx <= arr_size-1 ; idx++)
	      {
	    	  if(arr[idx]>max) {
	    		  max=arr[idx];
	    	  }
	      }
	         System.out.println(max);

	
	
	}
}