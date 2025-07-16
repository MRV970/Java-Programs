package Practice;

import org.testng.annotations.Test;

public class Sum_of_no {
	@Test
	public void sum() {
		String s="1#$2";
		int sum=0;
		String s2=s.replaceAll("[^0-9]","" );
		for(int i=0;i<=s2.length()-1;i++) {
			  sum=sum+Character.getNumericValue(s2.charAt(i));
		}
		System.out.println(sum);
	}

}
