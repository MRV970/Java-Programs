package ArrayPrograms;

import org.testng.annotations.Test;

public class Add_Two_Matrices {
	@Test
	public void addingmatrices() {
		int a[][]= {{1,2},{3,4}};
		int b[][]= {{3,3},{4,5}};
		int c[][]=new int[2][2];
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				c[i][j]=a[i][j]+b[i][j];
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
	}

}
