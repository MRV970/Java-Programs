package Number_Programs;

import org.testng.annotations.Test;

public class Swap_Nos_Without_Variable {
	@Test
	public void swapping() {
		int a=3;
		int b=2;
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(a);
		System.out.println(b);
	}

}
