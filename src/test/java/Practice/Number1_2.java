package Practice;

import org.testng.annotations.Test;

public class Number1_2 {
	@Test
	public void no1_2() {
		
		String s="#1$2";
		String s1=s.replaceAll("[^0-9]", "");
		
		for(int i=0;i<=s.length()-1;i++) {
	String s2= new StringBuilder(s1).reverse().toString();
		
		 System.out.print(Character.getNumericValue(s2.charAt(i)));
		
        }
		
		}
	@Test
	public void sum() {
		String s="1#$2";
		
	}

}
