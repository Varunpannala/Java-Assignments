//write a Java program to sort an integer array of 10 elements in ascending.
package java_day3;
import java_day3.Sort;

import java.util.Scanner;


public class SortMain {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	      int arr_size = in.nextInt();
	      int arr[] = new int[arr_size];
	      for(int idx = 0; idx <= arr_size - 1; idx++)
	      {
	         arr[idx] = in.nextInt();
	      }	
	      Sort c=new Sort();
	      c.ascending(arr);   
     
}  
	}

