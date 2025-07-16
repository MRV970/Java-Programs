package ArrayPrograms;

import org.testng.annotations.Test;

public class Average_Elements_array {
	@Test
	public void average() {
		int sum=0;
		int a[]= {2,3,5,7,3};
		for(int i=0;i<=a.length-1;i++) {
			sum=sum+a[i];
			
		}
		System.out.println(sum/a.length);
	}

}
