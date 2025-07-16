package String_Programs;

import org.testng.annotations.Test;

public class Count_Spaces {
	@Test
	public void counting_spaces() {
		String s="Ja va PRo Gram s";
		int count=0;
		for(int i=0;i<=s.length()-1;i++) {
			if(s.charAt(i)==' ') {
				count++;
				}
		}
			System.out.println(count);
		
	}

}
