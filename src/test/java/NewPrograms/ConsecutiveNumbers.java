package NewPrograms;

import org.testng.annotations.Test;

public class ConsecutiveNumbers {
	  
	    @Test
	    public void cosecutive()
	    {
	    	int[] a = {1, 0, 1, 1, 0, 7, 7, 7, 7,7, 0, 1, 9, 9, 9, 9, 4, 3, 2, 7};
	    	int count=1;
	    	
	    	for(int i=0;i<a.length-1;i++) {
	    		
	       if(a[i]==a[i+1]) {
	    			count++;
	    			
	    			}
	    		else {
	    			
	    			if(count>2) {
	        			
	    	    		System.out.println(a[i]+"->"+count);
	    	    		}
	    			
	               count=1;
	    	}
	    	
	    		

	    	}
	    }
}



