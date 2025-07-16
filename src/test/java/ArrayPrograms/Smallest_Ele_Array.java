package ArrayPrograms;

import java.util.Arrays;

import org.testng.annotations.Test;

public class Smallest_Ele_Array {
	
	@Test
	public void smallest() {
		int a[]= {45,32,2,78,9};
		Arrays.sort(a);
		for(int i:a) {
			
		}
		System.out.println(a[0]);
	}
     
	@Test
	public void smallestLogic() {
		int a[]= {45,32,2,78,9};
		int small=a[0];
		for(int i=0;i<=a.length-1;i++) {
			if(a[i]<small) {
				//System.out.println(a[i]);
				small=a[i];
			}
		}
			System.out.println(small);
		
	}
}
