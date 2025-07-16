package ArrayPrograms;

import org.testng.annotations.Test;

public class Count_Of_EachDigit_Array {
	@Test
	public void count() {
		int a[]= {23,456,78899};
		for(int i:a) {
			int i1=i;
			int count=0;
			while(i>0) {
				int rem=i%10;
				count++;
				i=i/10;
			}
		
		System.out.println(count+"->count of digits->"+i1);
	}}

}
