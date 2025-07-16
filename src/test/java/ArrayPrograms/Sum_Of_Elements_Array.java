package ArrayPrograms;

import org.testng.annotations.Test;

public class Sum_Of_Elements_Array {
	
	@Test
	public void sum() {
		int a[]= {1,2,3,4,5,6};
		int sum=0;
		for(int i=0;i<=a.length-1;i++) {
			sum=sum+a[i];
		}
		System.out.println(sum);
	}
	@Test
	public void sum_Even() {
		int a[]= {1,2,3,4,5,6};
		int sum=0;
		for(int i=0;i<=a.length-1;i++) {
			if(a[i]%2==0) {
				sum=sum+a[i];
			}
		}
			System.out.println(sum);
		
	}
	@Test
	public void sum_Odd() {
		int a[]= {1,2,3,4,5,6};
		int sum=0;
		for(int i=0;i<=a.length-1;i++) {
			if(a[i]%2!=0) {
				sum=sum+a[i];
			}
		}
			System.out.println(sum);
		
	}
	

}
