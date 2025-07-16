package ArrayPrograms;

import java.util.Arrays;

import org.testng.annotations.Test;

public class Descending_Array {
	@Test
	public void descending() {
		int a[]= {34,89,78,56,43};
		Arrays.sort(a);
		for(int i=a.length-1;i>=0;i--) {
			System.out.println(a[i]);
		}
	}
   @Test
   public void descendinglogic() {
	   int a[]= {35,49,54,5,2,90};
		
		for(int  i=0;i<=a.length-1;i++) {
			for(int j=i+1;j<=a.length-1;j++) {
				if(a[i]<a[j]) {
					 int temp=a[j];
					a[j]=a[i];
					a[i]=temp;
				}
			}
			System.out.println(a[i]);
		}
		
   }
}
