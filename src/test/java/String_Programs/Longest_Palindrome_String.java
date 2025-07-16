package String_Programs;

import org.testng.annotations.Test;

public class Longest_Palindrome_String {
	@Test
	public void longPalindrome() {
		String s="mam madam avava nananan";
		
		String s1[]=s.split(" ");
		String maxPal=s1[0];
		for(String s2:s1) {
		
		String reverse= new StringBuilder(s2).reverse().toString();
		
		if(s2.equals(reverse)&& reverse.length()>maxPal.length()) {
			maxPal=reverse;
		}
		}
		
		System.out.println(maxPal);
		//if the length of the palindrome is same it will taking first palindrome
	}
	
	@Test
	public void smallestPalindrome() {
		String s="ava madam nananan";
        String s1[]=s.split(" ");
        String minPal=s1[0];
        for(String s2:s1){
            String rev=new StringBuilder(s2).reverse().toString();
            if(s2.equals(rev)&& rev.length()<minPal.length()){
                minPal=rev;
            }
        }
        System.out.println(minPal);
}
	@Test
	public void reverse() {
		String s="java";
		String reverse=new StringBuffer(s).reverse().toString();
		System.out.println(reverse);
	}
 
}
