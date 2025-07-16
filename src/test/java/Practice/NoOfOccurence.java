package Practice;

import org.testng.annotations.Test;

public class NoOfOccurence {
	@Test
	public void occurence() {
		String s="AAABBCCCCDD";
		String s1="";
		for(int i=0;i<s.length();i++){
		  int count=0;
		    if(!s1.contains(s.charAt(i)+"")){
			s1=s1+s.charAt(i);
		 		for(int j=0;j<s.length();j++){
		   		  if(s.charAt(i)==s.charAt(j)){
					count++;
					}
				}
		System.out.print(count+""+s.charAt(i));	
		}
}
		}
	

}
