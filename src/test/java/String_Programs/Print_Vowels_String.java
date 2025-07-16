package String_Programs;

import org.testng.annotations.Test;

public class Print_Vowels_String {
	@Test
	public void printingvowels() {
		String s="Java Programs";
		String s2="";
		for(int i=0;i<=s.length()-1;i++) {
			char ch =s.charAt(i);
			if(ch=='A'||ch=='a'||ch=='E'||ch=='e'||ch=='I'||ch=='i'||
					ch=='O'||ch=='o'||ch=='U'||ch=='u') {
				System.out.println(ch);
				s2=s2+ch;
			}
		}
		System.out.println(s2);
	}
	
	@Test
	public void printingConsonants() {
		String s="Java Programs";
		String s2="";
		for(int i=0;i<=s.length()-1;i++) {
			char ch =s.charAt(i);
			if(!(ch=='A'||ch=='a'||ch=='E'||ch=='e'||ch=='I'||ch=='i'||
					ch=='O'||ch=='o'||ch=='U'||ch=='u')) {
				//System.out.println(ch);
				s2=s2+ch;
			}
		}
		System.out.println(s2);
	}
   @Test
   public void vowels() {
	   String s = "programming";
	   
	   // Replace all non-vowel characters with empty string
       String s2 = s.replaceAll("[^aeiouAEIOU]", "");

       // Print each vowel
       for (int i = 0; i < s2.length(); i++) {
           System.out.print(s2.charAt(i) + " ");
       }
   
	   
   }
}
