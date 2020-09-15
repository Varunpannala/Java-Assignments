package java_day3;

import java.util.Scanner;

public class SearchMain {
	

    public static void main(String[] args) {      
          
    	Scanner in = new Scanner(System.in);
	      System.out.println("Enter the no of elements: ");  
	      int arr_size = in.nextInt();
	      int arr[] = new int[arr_size];
	      System.out.println("Enter the Elements of array : ");  
	      for(int idx = 0; idx <= arr_size - 1; idx++)
	      {
	         arr[idx] = in.nextInt();
	      }	
	      System.out.println("Enter the Element to be searched : ");  
	      int number = in.nextInt();

	      Search obj=new Search();
	      if(obj.search(arr,number)){
		      System.out.println("Element is present ");  

	      }
	      else {
		      System.out.println("Element is not present ");  

	      }
 }
}
