package Number_Programs;

import org.testng.annotations.Test;

public class Reverse_Number {
	@Test
	public void reverse() {
		int n=1234;
		int rev=0;
		while(n>0) {
			int rem=n%10;
			 rev=rem;
			n=n/10;
		
		System.out.print(rev);
	}}

}
