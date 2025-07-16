package Others;

import org.testng.annotations.Test;

public class ABC3328 {
	@Test
	public void charAndNo() {
		String s="$#28!33AB#C";
		String[] n=s.split("[^0-9]");
		String []ch=s.split("[^A-Za-z]");
		
		for(int i=n.length-1;i>0;i--) {
			if(n[i]!="") 
				System.out.print(n[i]+" ");
			}
		for(int i=0;i<ch.length;i++) {
			if(ch[i]!="") 
				System.out.print(ch[i]+" ");
				
			
		}
	//System.out.println(n+ch);
		
		
	}
	@Test
	public void NoAndChar() {
		String s="$#28!33Ab#C";
		String s1=s.replaceAll("[^0-9]", "");
		String s2=s.replaceAll("[^A-Za-z]", "");
		System.out.print(s2+"");
		System.out.println(s1+"");
	}

}
