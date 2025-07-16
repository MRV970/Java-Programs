
package String_Programs;

import org.testng.annotations.Test;

public class Largest_Word_String {
	@Test
	public void largest() {
		
	String s="Java is a Programming Language";
	   String[] s2=s.split(" ");
	String max=s2[0];
	for(int i=0;i<=s2.length-1;i++) {
		if(s2[i].length()>max.length()){
			max=s2[i];
			   }}
	System.out.println(max);
	   }}

