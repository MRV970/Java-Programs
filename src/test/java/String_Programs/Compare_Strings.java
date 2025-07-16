package String_Programs;

import org.testng.annotations.Test;

public class Compare_Strings {
	@Test
	public void compareStrings() {
		String s="Java";
		String s1="Programs";
		boolean flag=s.equals(s1);
		System.out.println(flag);
	}

}
