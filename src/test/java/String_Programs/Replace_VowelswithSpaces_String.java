package String_Programs;

import org.testng.annotations.Test;

public class Replace_VowelswithSpaces_String {
    @Test
    public void replacevowels_Spaces() {
    	String s="JavaPrograms";
    	
    	//	System.out.println(s.replaceAll("[^aeiouAEIOU]"," "));
  System.out.println(s.replaceAll("[aeiouAEIOU]", " "));
    	}   
    
    @Test
    public void vowels() {
    	String s="javaprograms";
    	String s2=s.replaceAll("[^aeiouAEIOU]", "");
    	for(int i=0;i<=s2.length()-1;i++) {
    		int count=0;
    		for(int j=0;j<=s2.length()-1;j++) {
    			if(s2.charAt(i)==s2.charAt(j)) {
    				count++;
    			}
    			if(i>j) {
    				break;
    			}
    		}
    		if(count>1) {
    			System.out.println(s2.charAt(i)+" "+count);
    		}
    	}
    }
}
