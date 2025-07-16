package ArrayPrograms;

import org.testng.annotations.Test;

public class Multiply_Two_Matrices_Array {
	@Test
	public void multiply() {
		int a[][]= {{2,3},{4,5}};
		int b[][]= {{2,3},{4,5}};
		int k=2;
		int c[][]= new int[k][k];
		
		for(int i=0;i<k;i++) {
			for(int j=0;j<k;j++) {
				c[i][j]=a[i][j]*b[i][j];
				System.out.print(c[i][j]+" ");
				
			}
		
		System.out.println();
	}}

}
