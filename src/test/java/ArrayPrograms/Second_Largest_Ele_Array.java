package ArrayPrograms;

import java.util.Arrays;

import org.testng.annotations.Test;

public class Second_Largest_Ele_Array {
	@Test
	public void seconglargest() {
		int a[]= {9,56,43,3,34};
		Arrays.sort(a);
		for(int i:a) {
			System.out.print(i+" ");
			
		}
		System.out.println();
		System.out.println(a[a.length-2]);
	
	}
	@Test
	public void secondlargestlogic() {
		int a[]= {9,56,43,3,34};
		int f=a[0];
		int s=a[1];
		for(int i=0;i<=a.length-1;i++) {
			if(a[i]>f) {
				s=f;
				f=a[i];
			}
			else if(a[i]>s&&a[i]!=f) {
				s=a[i];
			}
		}
		System.out.println(f);
		System.out.println(s);
	}
}
