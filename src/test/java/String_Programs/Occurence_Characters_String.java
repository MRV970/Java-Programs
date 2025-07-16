package String_Programs;

import java.util.Arrays;
import java.util.TreeSet;

import org.testng.annotations.Test;

public class Occurence_Characters_String {
	@Test
	public void occurence() {
	String s="JavaPrograms";
	for(int i=0;i<=s.length()-1;i++) {
		int count=0;
		for(int j=0;j<=s.length()-1;j++) {
			if(s.charAt(i)==s.charAt(j)&&i>j) {
				break;
				}
			if(s.charAt(i)==s.charAt(j)) {
				count++;
			}
		}
            if(count>0) {
             	 System.out.println(s.charAt(i)+" "+count);
          }
	}
	}
	
	@Test
	public void occuenceChar() {
		String s="JavaPrograms";
		 
		TreeSet<Character> ts=new TreeSet<Character>();
		for(int i=0;i<=s.length()-1;i++) {
			ts.add(s.charAt(i));
			
		}
		for(char ch:ts) {
			int count=0;
			for(int j=0;j<=s.length()-1;j++) {
				if(ch==s.charAt(j)) {
					count++;
					int a=count;
				}
			}
			if(count>=1) {
				
			}
			
		
	}}
	
	@Test
	public void occurenceChar() {
		String s="JavaPrograms";
		String s1=s.toLowerCase();
		char ch[]=s1.toCharArray();
		for(char ch1='a';ch1<='z';ch1++) {
			int count=0;
			
			for(int i=0;i<ch.length-1;i++) {
			if(ch1==ch[i]) {
				
				count++;
				
			}
			}
		if(count>0) {
			
			System.out.println(ch1+" "+count);
			
			} 
			}
	
	}
	
	@Test
	public void occurenceEle() {
		 int a[]= {2,3,6,6,5,4,3,3,2,2};
		 for(int i=0;i<=a.length-1;i++) {
			 int count=0;
			 for(int j=0;j<a.length;j++) {
				 if(a[i]==a[j]&&i>j) {
					 break;
				 }
				 if(a[i]==a[j]) {
					 count++;
				 }
			 }
			 if(count>0) {
				 System.out.println(a[i]+" "+count);
			 }
			 
		 }
	}

@Test
public void CharactersDescending() {
	String s="hello";
//	for(char ch=s)
}

}
