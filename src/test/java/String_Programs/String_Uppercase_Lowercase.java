package String_Programs;

import java.util.Locale;

import org.testng.annotations.Test;

public class String_Uppercase_Lowercase {
	@Test
	public void uppercase() {
	String s="Testing";
	System.out.println(s.toUpperCase());
	}
	
	@Test
	public void  lowercase() {
		String s= "TEstIng";
		
		System.out.println(s.toLowerCase());
		
	}

}
