package javacls_day3;
import javacls_day3.Sort;

import java.util.Scanner;


public class SortMain {
	public static void main(String[] args) {      
        
    	Scanner in = new Scanner(System.in);
	      int arr_size = in.nextInt();
	      System.out.println("Enter the Size :");
          int arr[] = new int[arr_size];
	      System.out.println("Enter the array elements : ");
	      for(int idx = 0; idx <= arr_size - 1; idx++)
	      {
	         arr[idx] = in.nextInt();
	      }	
	      Sort obj=new Sort();
	      obj.ascending(arr);   
       
}  

}
