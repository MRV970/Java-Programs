package NewPrograms;

import org.testng.annotations.Test;

public class SeleniumPattern {
	
	@Test
	    public  void printPattern() {
	        String S = "selenium";

	        for (int i = 1; i <= S.length(); i++) {
	            System.out.println(S.substring(0, i));
	        }
	    }
	
	
	@Test
	  public  void pattern() {
        String S = "selenium";
        String S2 = "";

        for (int i = 0; i < S.length(); i++) {
        	//System.out.println(S.charAt(i));
            S2 =S2+ S.charAt(i);  // Append one character at a time
            System.out.println(S2); 
        }
        
    }
	
	}



