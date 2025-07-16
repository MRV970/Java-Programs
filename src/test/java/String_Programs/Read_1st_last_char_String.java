package String_Programs;

import org.testng.annotations.Test;

public class Read_1st_last_char_String {
   
	@Test
	public void read1standlast() {
		String s="Testing";
		System.out.println(s.charAt(0));
		System.out.println(s.charAt(s.length()-1));
	}
}
