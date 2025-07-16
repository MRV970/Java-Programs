package String_Programs;

import org.testng.annotations.Test;

public class Replace_Char_AnotherChar_String {
	
	@Test
	public void replacingchar() {
	String s="Java is a Programming Language";
	
	String s2=s.replace('a', '*');
	System.out.println(s2);
	    }
   }
