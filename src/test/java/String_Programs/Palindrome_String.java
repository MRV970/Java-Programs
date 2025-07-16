package String_Programs;

import org.testng.annotations.Test;

public class Palindrome_String {
	@Test
	public void palindome() {
		String s="madam";
		String s2="";
		for(int i=s.length()-1;i>=0;i--) {
			s2=s2+s.charAt(i);
		}
		if(s.equals(s2)) {
			System.out.println("Palindrome-->> "+s);
		}
		else {
			System.out.println("not a Palindrome"+s);
		}
	}
//	 @Test
//	  	public void remove() {
//	  		String s="madam";
//	  		String res="";
//	  		for(int i=0;i<=s.length()-1;i++) {
//	  		String	s1=s.charAt(i)+" ";
//	  			if(!(res.contains(s1))) {
//	  				res=s1;
//	  			}
//	  		}
//	  			//System.out.println(res);
//	  		
//	  		System.out.print(res);
//	  		if(res.equals(s)) {
//	  			System.out.println("Palindrome String :"+s);
//	  		}
//	  		else {
//	  			System.out.println("Not a Palindrome String :"+s);
//	  		}
//	  		
//	  	}

}
