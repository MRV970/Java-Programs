package Practice;

import org.testng.annotations.Test;

public class Right_Pattern {
	
	@Test
	public void right() {
		int n=5;
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=n;j++) {
				if(i+j==(n+1)||j==1&& i>=(n+1)/2) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
	}

}
