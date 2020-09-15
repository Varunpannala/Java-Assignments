package java_day3;

public class Sort {
		int temp;
		public  void ascending(int[] arr) {
		        for (int i = 0; i < arr.length; i++) {   
		            for (int j = i+1; j < arr.length; j++) {   
		               if(arr[i] > arr[j]) {  
		                   temp = arr[i];  
		                   arr[i] = arr[j];  
		                   arr[j] = temp;  
		               }   
		            }   
		        }

		        
		          
		        System.out.println("Elements of array sorted in ascending order: ");  
		        for (int i = 0; i < arr.length; i++) {   
		            System.out.print(arr[i] + " ");  
		        }  
		    }  
		}  


