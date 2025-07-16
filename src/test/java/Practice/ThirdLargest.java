package Practice;

import org.testng.annotations.Test;

public class ThirdLargest {
@Test
public void sample() {
	int a[]= {-1,4,-9,-2,-3};
	int f=Integer.MIN_VALUE;
	int s=Integer.MIN_VALUE;
	int t=Integer.MIN_VALUE;
	for(int i=0;i<=a.length-1;i++) {
		if(a[i]>f) {
			t=s;
			s=f;
			f=a[i];
		}
		else if(a[i]>s&&a[i]!=f) {
			t=s;
			s=a[i];
			
		}
		else if(a[i]>t&&a[i]!=s) {
			t=a[i];
		}
	}
	System.out.println(f+"\t"+s+"\t"+t);


}
}
