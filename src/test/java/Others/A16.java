package Others;

import org.testng.annotations.Test;

public class A16 {
	@Test
	public void charAndNum() {
		
	
	String s="$9#7A";
	String n=s.replaceAll("[^0-9]", "");//n=97
	String ch=s.replaceAll("[^A-Z]", "");//ch=A
	int sum=0;
	
	for(int i=0;i<n.length();i++) {
		sum+=Character.getNumericValue(n.charAt(i));
		
	}
	System.out.println(ch+sum);
	

}}
