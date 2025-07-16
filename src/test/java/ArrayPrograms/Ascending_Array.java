package ArrayPrograms;

import java.util.Arrays;

import org.testng.annotations.Test;

public class Ascending_Array {
	@Test
	public void ascending() {
		int a[]= {35,46,24,9,87};
		Arrays.sort(a);
		for(int i:a) {
			System.out.println(i);
		}
	}
	@Test
	public void ascendinglogic() {
		int a[]= {35,49,54,5,2,90};
		
		for(int  i=0;i<=a.length-1;i++) {
			for(int j=i+1;j<=a.length-1;j++) {
			
				if(a[i]>a[j]) {
					//35>49 F,35>54F,35>5T
			
					 int temp=a[j];//5
					a[j]=a[i];//35
					a[i]=temp;//5
				}
			}
			System.out.println(a[i]);
		}
		
	}
	
}
