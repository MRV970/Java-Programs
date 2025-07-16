package Others;

import org.testng.annotations.Test;

public class aaabbcc {
	@Test
	public void characters() {
		String s="aaabbc";
		int count=1;
		for(int i=0;i<s.length()-1;i++) {
			if(s.charAt(i)==s.charAt(i+1)) {
				count++;
			}else {
				System.out.print(s.charAt(i)+""+count);
				count=1;
			}
		}
		System.out.print(s.charAt(s.length()-1)+""+count);
	}

	@Test
	public  void occurence() {
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
		System.out.print(count+""+s.charAt(i))	;
		}

		}
	}
	@Test
	public void Occcure() {
String	s="aaaabbbcc";
for(int i=0;i<=s.length()-1;i++) {
	int count=0;
	for( int j=0;j<s.length();j++) {
		if(s.charAt(i)==s.charAt(j)&& i>j) {
		break;
	}
	if(s.charAt(i)==s.charAt(j)) {
		count++;
	}}
	if(count>0) {
		System.out.print(s.charAt(i)+""+count);
	
         }}
	   }
        }
