package Number_Programs;

import org.testng.annotations.Test;

public class Tribonacci_Series {
	@Test
	public void tribonocci() {
		int f1=0,f2=1,f3=1,f4;
		for(int i=0;i<=10;i++) {
			f4=f1+f2+f3;
			f1=f2;
			f2=f3;
			f3=f4;
			System.out.println(f4);
		}
	}

}
