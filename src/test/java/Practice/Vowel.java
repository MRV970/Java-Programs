package Practice;

import org.testng.annotations.Test;

public class Vowel {
	@Test
	public void vowels() {
		String s="Raghavamma";
	String s1="aeiouAEIOU";
	
		for(int i=0;i<s.length();i++) {
			//char ch=s.charAt(i);
       if(s1.contains(s.charAt(i)+"")) {
			System.out.println(s.charAt(i));
//			}
       }
		}
		}
@Test
public void vowelscon() {
	String s="javaprogramming";
	for(char c:s.toCharArray()) {
		if("aeiouAEIOU".contains(String.valueOf(c))) {
		System.out.println(c+" ");
		}
		
	}
}
	
	
	@Test
	public void sum() {
		String s="a2b3c4";
		String s1=s.replaceAll("[^0-9]", "");
		
		int sum=0;
		for(int i=0;i<=s1.length()-1;i++) {
			
			sum=sum+Character.getNumericValue(s1.charAt(i));
		}
		
		System.out.println(sum);
	}
	@Test
	public void sumOfNo() {
		String s="a2b3c4";
	    int res=0;
	    for(char c:s.toCharArray()){
	        if(Character.isDigit(c)){
	            res+=Character.getNumericValue(c);
	        }
	    }
	    System.out.println(res);
	}
	
	@Test
	public void multiply() {
		int n=1;
		int m=10;
		//for(int i=0;i<=m;i++) {
		while(true) {
		
		n=n*2+1;
		System.out.print(n+" ");
		}
		
	}
	@Test
	public void multiple() {
		int n=1;;
		for(int i=0;i<=10;i++) {
			System.out.print(n+" ");
			n=n*2+1;
		}
	}
	@Test
	public void mm() {
		int n=1;
		int m=1;
		while(m<=10) {
			System.out.print(n+" ");
			n=n*2+1;
			m++;
		}
	}
//	12345
//	2345
//	345
//	45
//	5
	
	@Test
	public void pattern() {
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i<=j ) {
					System.out.print(j);
				}
				else {
					System.out.print("");
				}
			}

		System.out.println();
		}
	}
}
