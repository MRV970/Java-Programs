package String_Programs;

import org.testng.annotations.Test;

public class Remove_White_Spaces_String {
	@Test
	public void removinngSpaces() {
		String s="Ja va Pro grams";
		
		String s2= s.replaceAll(" ", "");
		
		System.out.println(s2);
		
	}

}
