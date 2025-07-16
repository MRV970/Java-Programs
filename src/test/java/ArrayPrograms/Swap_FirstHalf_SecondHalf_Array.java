package ArrayPrograms;

import java.util.Arrays;

import org.testng.annotations.Test;

public class Swap_FirstHalf_SecondHalf_Array {
	@Test
	public void swap() {
		int a[]= {1,2,3,4,5,6};
		int b=a.length;
		int k=b/2;
		for(int i=0;i<k;i++) {
			int temp=a[i];
			a[i]=a[k+i];
			a[k+i]=temp;
		}
		System.out.println(Arrays.toString(a));
	}
	
}
