package Practice;

import org.testng.annotations.Test;

public class Special_No {
	
	@Test
	public void no1_2() {
		
		String s="#1$2";
		
		String s2=s.replaceAll("[^0-9]", "");
		for(int i=s2.length()-1;i>=0;i--) {
			//System.out.println(s2);
		int k=	Character.getNumericValue(s2.charAt(i));
		
		System.out.print(k);
		}	
	}
		@Test
		public void no1_2R() {
			
			
		}
		

		
	
	@Test
	public void sum() {
		String s="1#$2";
		int sum=0;
		String s2=s.replaceAll("[^0-9]","" );
		for(int i=0;i<=s2.length()-1;i++) {
			  sum=sum+Character.getNumericValue(s2.charAt(i));
		}
		System.out.println(sum);
	}

	@Test
	public void specialNo() {
		String s="1#2!";
		int k=0;
		String j="";
		String s2=s.replaceAll("[^0-9]","");
		String s3=s.replaceAll("[0-9]", "");
		//System.out.println(s2);
		for(int i=s2.length()-1;i>=0;i--) {
		k=Character.getNumericValue(s2.charAt(i));
		 j=j+k;
		
		}
		System.out.print(j);
		System.out.print(s3);
	}
	@Test
	public void a2b3c1() {
		
		String s="a2b3c1";
		int n=0;
		String s2=s.replaceAll("[^0-9]", "");
		String s3=s.replaceAll("[^a-z]", "");
		//System.out.println(s2);
		//System.out.println(s3);
		for(int i=0;i<=s2.length()-1;i++) {
			 n=Character.getNumericValue(s2.charAt(i));
		
		for(int j=0;j<n;j++) {
			System.out.print(s3.charAt(i));
		}
		
		
		}
		}
		@Test
		public void aabbbbc() {
			String s="aabbbbccd";
			
			for(int i=0;i<=s.length()-1;i++) {
			//char	s1=s.charAt(i);
			int count=0;
				for(int j=0;j<=s.length()-1;j++) {
					if(s.charAt(i)==s.charAt(j)&&i>j) {
					break;
						
					}
					if(s.charAt(i)==s.charAt(j)) {
						count++;
						//System.out.println(count);
					}
				}
				if(count>0) {
			  //System.out.println(count);
				System.out.print(s.charAt(i)+""+count);
			}
			}
		}
	

}
