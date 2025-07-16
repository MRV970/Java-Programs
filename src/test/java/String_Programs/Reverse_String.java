package String_Programs;


import org.testng.annotations.Test;

public class Reverse_String {
@Test
public void reversing() {
	String s="JavaPro";
	for(int i=s.length()-1;i>=0;i--) {
	
	System.out.print(s.charAt(i));
	 
}}
    @Test
    public  void reverse() {
    	String s="java cool";
    	String s1[]=s.split(" ");
    	
    	for(int i=s1.length-1;i>=0;i--) {
    		System.out.print(s1[i]+" ");
    	}
    	
    	}
     }

