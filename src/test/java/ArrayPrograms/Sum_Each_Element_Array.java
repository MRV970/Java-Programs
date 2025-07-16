package ArrayPrograms;

import org.testng.annotations.Test;

public class Sum_Each_Element_Array {
	@Test
	public void sumofEach() {
		int a[]= {11,22,33,44,55};
		for(int i:a) {
			int sum=0;
			int i1=i;
			while(i>0) {
				int rem=i%10;
				sum=sum+rem;
				i=i/10;
				
			}
		
			System.out.println(sum+"<-each number"+i1);
		
	}}
	

}
