package Patterns;

import org.testng.annotations.Test;

public class Left_Triangle {
	@Test
	public void leftTri() {
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i+j>=(n+1)) {
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
