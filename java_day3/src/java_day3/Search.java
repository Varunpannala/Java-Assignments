package java_day3;

public class Search {
	
	public boolean search(int[] arr,int number) {
		int count=0;
	
        for (int i = 0; i < arr.length; i++) { 
        	if(arr[i]==number) {
        		count+=1;
        		
        	}
        }
        
        if(count>0) {
        	return true;
        
        }
        else {
        	return false;
        }
        
        	
        }

}
