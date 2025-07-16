package String_Programs;

import org.testng.annotations.Test;

public class Ascii_values_String {
	
	@Test
	public void ascii() {
		String s="Testing";
		for(int i=0;i<=s.length()-1;i++) {
			System.out.println(s.codePointAt(i));
		}//codePointAt method gives ascii values
	}
	@Test
	public void evenAscii() {
		String s1="JavaPrograms";
		String s2="";
		
		for(int i=0;i<=s1.length()-1;i++) {
			int n=s1.codePointAt(i);
			//System.out.println(n);
			if(s1.charAt(i)%2==0) {
				s2=s2+" "+s1.charAt(i)+n;
				
			}
		}
		System.out.println(s2);    //" "  ascii value =32
	}
	@Test
	public void oddAscii() {
		String s1="JavaPrograms";
		String s2="";
		
		for(int i=0;i<=s1.length()-1;i++) {
			int n=s1.codePointAt(i);
			//System.out.println(n);
			if(s1.charAt(i)%2!=0) {
				s2=s2+" "+s1.charAt(i)+n;
				
			}
		}
		System.out.println(s2);
	}

}
