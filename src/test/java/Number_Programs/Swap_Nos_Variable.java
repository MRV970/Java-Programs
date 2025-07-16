package Number_Programs;

import org.testng.annotations.Test;

public class Swap_Nos_Variable {

	@Test
	public void swapnos() {
		int a=2;
		int b=3;
		int temp=a;
		
		a=b;
		b=temp;
		System.out.println(a);
		System.out.println(b);
		
		
	}
	
}
