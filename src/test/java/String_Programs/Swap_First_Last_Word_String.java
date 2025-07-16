package String_Programs;

import java.util.Arrays;

import org.testng.annotations.Test;

public class Swap_First_Last_Word_String {
	@Test
	public void swapping() {
		String s = "Java is Good";
		String s1[] = s.split(" ");

		String temp = s1[s1.length - 1];
		s1[s1.length - 1] = s1[0];
		s1[0] = temp;
		for(String s2:s1) {
			System.out.print(s2+" ");
		}

	//	System.out.println(Arrays.toString(s1));

	}
}
