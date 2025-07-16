package Practice;

import org.testng.annotations.Test;

public class Pattern1_0 {
	@Test
	public void pattern() {
		int n=7;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i>=j) {
					int rem=j%2;
					System.out.print(rem);
				}
				else  {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
