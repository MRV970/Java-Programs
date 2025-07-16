package ArrayPrograms;

import org.testng.annotations.Test;

public class Transpose_Of_Matrix {
	
     @Test
	public void transpose() {
		int a[][]= {{2,4,7},{3,5,4},{6,7,8}};
		int b[][]=new int[a.length][a.length];
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				b[i][j]=a[j][i];
			System.out.print(b[i][j]+" ");
		     }
			System.out.println();
		    }
	            }
            }
