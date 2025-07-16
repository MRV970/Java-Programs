package Patterns;

import org.testng.annotations.Test;

public class Right_triangle {
	
	
//	*    
//	**   
//	***  
//	**** 
//	*****
   
	@Test
	public void righttri() {
		int n=5;
		for(int i=1;i<=n;i++) {                    
			for(int j=1;j<=n;j++) {
				if(i>=j) {
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
