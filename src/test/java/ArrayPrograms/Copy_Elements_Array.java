package ArrayPrograms;

import java.util.Arrays;
import org.testng.annotations.Test;

public class Copy_Elements_Array {
	@Test
	public void copyelementsreverse() {
		
		int a[]= {35,98,76,90,23};
		int b[]= new int [a.length];
		int index=0;
		for(int i=a.length-1;i>=0;i--) {
			
			 b[index]=a[i];
			 index++;
		}
	
		System.out.print(Arrays.toString(b));
		}
	
	@Test
	public void copyelementsreverse1() {
		
		int a[]= {35,98,76,90,23};
		int b[]= new int [a.length];
		
		for(int i=a.length-1;i>=0;i--) {
			b[a.length-1-i]=a[i];
			// b[i]=a[i];
		}
	
		System.out.print(Arrays.toString(b));
		}
	
	
}
