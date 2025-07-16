package NewPrograms;

import org.testng.annotations.Test;

public class Swap_Second_third_word {
	@Test
	public void swapsecondThird() {
	String s="Java is Programmimg Language";
	String s2 []=s.split(" ");
	
	String temp=s2[s2.length-2];
	s2[s2.length-2]=s2[1];
	s2[1]=temp;
	for(String s3:s2) {
		System.out.print(s3+" ");
	}
	}
}
