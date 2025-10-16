package String_Programs;

import org.testng.annotations.Test;

public class Caps_Small_Char_String {
 @Test
 public void capsChar() {
	 String s="JaVa ProGrams";
	 String s2="";
	 for(int i=0;i<=s.length()-1;i++) {
		 if(s.charAt(i)>='A'&&s.charAt(i)<='Z') {
			 s2		=s2+s.charAt(i);
		 
		 }}
	 System.out.println(s2);

}
 @Test
 public void smallchar() {
	 String s="JaVa ProGrams";
	 String s2="";
	 for(int i=0;i<=s.length()-1;i++) {
		 if(s.charAt(i)>='a'&&s.charAt(i)<='z') {
			 s2=s2+s.charAt(i);
		 }
	 }
	 System.out.println(s2);
 }
}
