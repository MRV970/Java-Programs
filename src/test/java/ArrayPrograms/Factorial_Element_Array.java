package ArrayPrograms;

import org.testng.annotations.Test;

public class Factorial_Element_Array {
	@Test
	public void factorial() {
		int a[]= {1,2,3,4,5};
		int fact=1;
		for(int i=0;i<=a.length-1;i++) {
			fact=fact*a[i];
			System.out.println(a[i]+"-Factorial->"+fact);
	}
	}
}
