package String_Programs;

import org.testng.annotations.Test;

public class Smallest_Word_String {
	@Test
	public void smallestword() {
		String s="Java is a Robust";
		String s2[]=s.split(" ");
		String min=s2[0];
		for(int i=0;i<=s2.length-1;i++) {
			if(s2[i].length()<min.length() ) {
				min=s2[i];
				}
		}
		System.out.println("Smallest word :"+min);
	}

}
