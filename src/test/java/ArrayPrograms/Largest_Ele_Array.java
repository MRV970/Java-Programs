package ArrayPrograms;

import java.util.Arrays;

import org.testng.annotations.Test;

public class Largest_Ele_Array {
	@Test
	public void largestele() {
	int a[]= {32,54,98,67,90};
	Arrays.sort(a);
	
  System.out.println(a[a.length-1]);
	}
	
	@Test
	public void largesteleLogic() {
		int a[]= {32,54,98,67,90};
		int large=0;
		for(int i=0;i<=a.length-1;i++) {
			if(a[i]>=large) {
				large=a[i];
			}}
	System.out.println(large);
	}}
