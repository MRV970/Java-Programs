package Number_Programs;

import org.testng.annotations.Test;

public class Fibonocci_Series {
      @Test
      public void fibonacci() {
    	  int f1=0,f2=1;
    	  int f3;
    	  for(int i=0;i<=10;i++) {
    		  f3=f1+f2;    		
    		  f1=f2;
    		  f2=f3;
    		  System.out.println(f3);
    		  
    	  }
    	  
      }
}
