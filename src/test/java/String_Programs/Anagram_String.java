package String_Programs;

import java.util.Arrays;

import org.testng.annotations.Test;

public class Anagram_String {
	//Anagram means containing same characters and same length
	
	@Test
	public void anagram() {
		String s1="race";
		String s2="care";
		 char ch[]=s1.toCharArray();
		 char ch2[]=s2.toCharArray();
		 Arrays.sort(ch);
	Arrays.sort(ch2);
		
		if(Arrays.toString(ch).equals(Arrays.toString(ch2))) {
			System.out.println(s1+" is Anagram");
		}
		else {
			System.out.println(s1+" not an Anagram");
		}
	}
			
}
