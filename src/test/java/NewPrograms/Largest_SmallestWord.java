package NewPrograms;

import org.testng.annotations.Test;

public class Largest_SmallestWord {
	@Test
	public void Large_small(){
		String s="Java is a Programming Language";
		String s2[]=s.split(" ");
		String max=s2[0];
		String min=s2[0];
		for(int i=0;i<=s2.length-1;i++) {
			if(s2[i].length()>max.length()) {
				max=s2[i];
			}
			 if(s2[i].length()<min.length()) {
				min=s2[i];
			}
		}
		System.out.println(max);
		System.out.println(min);
		
		
	}

}
