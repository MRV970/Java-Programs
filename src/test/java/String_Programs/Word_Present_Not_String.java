package String_Programs;

import org.testng.annotations.Test;

public class Word_Present_Not_String {
	@Test
	public void wordPrresent() {
	String s="JAva is a programming language";
	 String s2="is";
	 if(s.contains(s2)) {
		 System.out.println(s2+"<--is present");
	 }
	 else {
		 System.out.println(s2+"<--is not present");
	 }
	}
    @Test
    public void substring() {
    	String s="Java class";
    	System.out.println(s.substring(2));
    }


}
