package String_Programs;

import java.util.HashSet;

import org.testng.annotations.Test;

public class No_Of_Occurence_EachWord {
	@Test
	public void occurenceofWord() {
	
	String s="Java is a Java is a Programing Language Programing";
	 
	String sp[]=s.split(" ");
	HashSet<String> hs=new HashSet<String>();
	
	for(int i=0;i<=sp.length-1;i++) {
		hs.add(sp[i]);
		
	}
	for(String word:hs) {
		int count=0;
		for(int i=0;i<=sp.length-1;i++) {
			if(word.equals(sp[i])) {
				count++;
			}
		}
		System.out.println(word+" "+count);
		
	}
	

}
	@Test
	public void repeat() {
		String s="Java is a Java is a Programing Language Language";
		 
		String s1[]=s.split(" ");
		for(int i=0;i<s1.length;i++) {
			int count=0;
			for(int j=0;j<s1.length;j++) {
				if(s1[i].equals(s1[j])&& i>j) {
					break;
				}
				if(s1[i].equals(s1[j])){
					count++;
				}
			}
			if(count>=1) {
				System.out.println(s1[i]+" "+count);
			}
			}
	     }
	@Test
	public void sub() {
		String s="javapisprogrammingsdgfg";
		for(int i=0;i<=s.length()-1;i++) {
	System.out.println(s.charAt(i)+""+i);
		
	}
	}
}
