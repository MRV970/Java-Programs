package ArrayPrograms;

import org.testng.annotations.Test;

public class Max_Frequency_Ele_Array {
  
	@Test
	public void maxFreqEle() {
		int a[]= {2,4,5,2,9,2,9,2};
		int m_count=0;
		int mf_ele=0;
		for(int i=0;i<=a.length-1;i++) {
			int count=0;
			for(int j=0;j<=a.length-1;j++) {
				if(a[i]==a[j]) {
					count++;
				}
			}
			if(count>m_count) {
				m_count=count;
				mf_ele=a[i];
			}
		}
			System.out.println(mf_ele+" maximum frequency is"+m_count);
		
	}
}
