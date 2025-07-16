package Number_Programs;

import org.testng.annotations.Test;

public class Factorial_Number {
	
	@Test
	public void factorialNo() {
		int n=5;
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact=fact*i;
		}
		System.out.println(fact);
	}

}
