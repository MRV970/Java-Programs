package String_Programs;

import org.testng.annotations.Test;

public class Read_Characters_String {
	
	@Test
	public void readcharacters() {
		String s="Testing";
		for(int i=0;i<=s.length()-1;i++) {
			System.out.println(s.charAt(i));
		}
	}

}
