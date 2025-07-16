package ArrayPrograms;

import java.util.Arrays;

import org.testng.annotations.Test;

public class Second_Smallest_Ele_Array {
	@Test
	public void secondsmallest() {
		int a[]= {78,54,67,32,9};
		Arrays.sort(a);
		for(int k:a) {
			
		}
		System.out.println(a[1]);
		
	}
	@Test
	public void secondsmallestlogic() {
		int a[]= {78,54,67,32,9};
		int small=a[0];
		int sec=a[1];
		for(int i=0;i<=a.length-1;i++) {
			if(a[i]<small) {
				sec=small;
				small=a[i];
			}
			else if(a[i]<sec&&a[i]!=small) {
				sec=a[i];
			}
		}
		System.out.println(sec);
	}
}
