package ArrayPrograms;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import org.testng.annotations.Test;

public class Right_Shift_Array {
	@Test
	public void rightshift() {
	int a[]= {1,2,3,4};
	
	int temp=a[a.length-1];
	for(int i=a.length-1;i>0;i--) {
		a[i]=a[i-1];
		
	}
	a[0]=temp;
	
		System.out.print(Arrays.toString(a));
	    }
	
	
	@Test
	public void user_right_shift() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no.of  times");
		int n=sc.nextInt();
		int a[]= {35,34,67,89,76};
		for(int i=1;i<=n;i++) {
			int temp=a[a.length-1];
			for(int j=a.length-1;j>0;j--) {
				a[j]=a[j-1];
			}
			a[0]=temp;
		}
		for(int k :a) {
			System.out.print(k+" ");
		}
		
		}
     @Test
     public void rightShiftWithColl() {
    	 Integer a[]= {1,2,3,4,5};
    	 List<Integer> list=Arrays.asList(a);
    	
    	 Collections.rotate(list, 1);
    	 System.out.println(Arrays.toString(a));
     }
}
