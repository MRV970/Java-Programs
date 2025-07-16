package NewPrograms;

import org.testng.annotations.Test;

public class Remove_DupliacteWords {
	@Test
    public void removeDuplicateWords() {
  	  String s="Hello Hai Hello";
  	  String  s2[]=s.split(" ");
  	  for(int i=0;i<=s2.length-1;i++) {
  		  int count=0;
  		  for(int j=0;j<=s2.length-1;j++) {
  		  if(s2[i].equals(s2[j])&& i>j) {
  				  break;
  				  
  			  }
  			  if(s2[i].equals(s2[j])) {
  				  count++;
  			  }
  		  }
  		  if(count>=1) {
  			  System.out.print(s2[i]+" ");
  		  }
  	  }
  	  
    }
}
