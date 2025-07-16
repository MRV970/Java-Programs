package String_Programs;



import java.util.Map;
import java.util.Stack;
import java.util.TreeSet;

import org.testng.annotations.Test;

public class Remove_Duplicates_String {
      @Test
      public void removeduplicates() {
    	  String s="JavaPrograms";
        TreeSet<Character> ts=new TreeSet<Character>();
        //LinkedHashSet ls=new LinkedHashSet();
    	 for(int i=0;i<=s.length()-1;i++) {
    		 ts.add((s.charAt(i)));
    	 }
    	 System.out.println(ts);
      }
      
      @Test
      public void removingDuplicates() {
    	  String s="JavaPrograms";
    	  for(int i=0;i<=s.length()-1;i++) {
    		  int count=0;
    		  for(int j=0;j<=s.length()-1;j++) {
    			  if(s.charAt(i)==s.charAt(j)) {
    				  count++;
    			  }
    		  }
    		  if(count==1) {
    			  System.out.print(s.charAt(i));
    			  
    		  }
    	  }
      }
     
      
      
      
}
