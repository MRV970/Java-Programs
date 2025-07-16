package String_Programs;

import java.util.Stack;

import org.testng.annotations.Test;

public class Read_Characters_Reverse_String {
	
	@Test
	public void readCharacterReverse() {
		String s="Testing";
		String s2="";
		for(int i=s.length()-1;i>=0;i--) {
			s2=s2+s.charAt(i);
			}
		System.out.println(s2);
		}
	
	
     }
