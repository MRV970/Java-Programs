package ArrayPrograms;

import org.testng.annotations.Test;

public class Print_Prime_Ele_Array {
	@Test
	public void printprime() {
		int a[]= {2,4,8,7,9,91};
		for(int i:a) {
		int count=0;
		for(int j=1;j<=i;j++) {
			
			if(i%j==0) {
				count++;
			}
			
		}
		if(count==2) {
			System.out.println(i+"prime");
		}
	}}

}
