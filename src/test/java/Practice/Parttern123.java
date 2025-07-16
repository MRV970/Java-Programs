package Practice;

import org.testng.annotations.Test;

public class Parttern123 {
	@Test
	public void no_pattern() {
		int n1=1;
		
		int n=5;
		int n2=(n+1)/2;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<n;j++) {
				if(j==(n+1)/2 ) {
				System.out.print(n1);
				n1++;
				
				}
//				else if(i==(n+1)/2) {
//					System.out.print(j);
//					n1++;
//				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
