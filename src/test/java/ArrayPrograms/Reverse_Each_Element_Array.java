package ArrayPrograms;

import org.testng.annotations.Test;

public class Reverse_Each_Element_Array {

	@Test
	public void  reverse_each() {
		int a[]= {23,45,67,98};
		for(int i:a) {
			int rev=0;
			int i1=i;
			while(i>0) {
				int rem=i%10;
				rev=rev*10+rem;
				i=i/10;
			}
			System.out.println(rev+" is reverse of an element "+i1);
		}
	}
	
	
}
