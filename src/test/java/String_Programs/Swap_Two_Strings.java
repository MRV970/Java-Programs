package String_Programs;

import org.testng.annotations.Test;

public class Swap_Two_Strings {
	@Test
	public void swappingStrings() {
		  // Initial strings
        String a = "hello";
        String b = "world";

        // Swapping
        a = a + b;        // helloworld
        b = a.substring(0, a.length() - b.length()); // a.substring(0,5) //hello
        a = a.substring(b.length());  // a=a.substring(5) means from 5th index // world

        // Output the results
        System.out.println("a= " + a);  // Output: a: world
        System.out.println("b= " + b);  // Output: b: hello
         }
	@Test
	public void swap() {
	String	s1="hello";
	String	s2="world";
	s1=s1+s2;
	s2=s1.replaceAll(s2,"");
	s1=s1.replaceAll(s2, "");
	System.out.println(s1);
	System.out.println(s2);
	}	
}
