package Practice;

import org.testng.annotations.Test;

public class No_Of_Occurence_Array {
	@Test
	public  void occurenceofNo() {
		int a[]= {2,5,6,2,5,6,2,9,7};
		int count =0;
		for(int i:a) {
			for(int j=0;j<=a.length-1;j++) {
				if(a[j]==i) {
					count++;
				}
			}
		
		if(count>=1) {
			System.out.println(i+"=="+count);
		}}
	}
	@Test
	public void occurenceNo() {
		int a[]= {2,5,6,2,5,6,2,9,7};
		for(int i=0;i<=a.length-1;i++) {
			int count=0;
			for(int j=0;j<i;j++) {
				if(a[j]==a[i]) {
					count++;
				}
			}
			if(count>=1) {
				System.out.println(a[i]+"-->>"+count);
			}
		}
	}

}
