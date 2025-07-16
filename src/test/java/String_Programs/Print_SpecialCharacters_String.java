package String_Programs;

import org.testng.annotations.Test;

public class Print_SpecialCharacters_String {
	@Test
	public void printSpecialChar() {
		String s1="java@Prog^rams*p#&";
		String s2="";
		for(int i=0;i<=s1.length()-1;i++) {
			char ch=s1.charAt(i);
			if(!(ch>='a'&&ch<='z')&&!(ch>='A'&&ch<='Z')&&!(ch>='0'&&ch<='9')) {
				s2=s2+ch;
			}
		}
		System.out.println(s2);
	}
   }
