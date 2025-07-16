package Others;

import org.testng.annotations.Test;

public class a3b2c1 {
	@Test
	public void charwithNo()
	{
		String s="a3b2c1";
		for(int i=0;i<=s.length()-1;i+=2) {//i=0,i=1 &&i=2,i=3 && i=4,i=5
			int n=Character.getNumericValue(s.charAt(i+1));//s(1)=3,s(3)=2,s(5)=1
			//System.out.print(n);
			for(int j=1;j<=n;j++) {
				System.out.print(s.charAt(i));
			}
		}
	}
}
