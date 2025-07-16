package String_Programs;

import java.util.Arrays;

import org.testng.annotations.Test;

public class Reverse_Words_String {

//	@Test
//	public void revesingwordsWithincharacters() {
//		String s = "Java is a Programing language";
//          
//		String res = "";
//		for (int i = 0; i <= s.length() - 1; i++) {
//          res = res + s.charAt(i);
//          }
//		System.out.println(res);
//}

	@Test
	public void reverse() {
		String s = "Java is a Programming language";
		String rev = "";
		String[] s2 = s.split(" ");
		for (int i = 0; i <= s2.length - 1; i++) {
			rev = s2[i] + " " + rev;
		}

		System.out.println(rev);
	}

	@Test
	public void reverse2() {
		String s = "Java is a Programming";
		String s1 = "";
		String s2[] = s.split(" ");
		for (String w : s2) {

			String n = "";
			for (int j = w.length() - 1; j >= 0; j--) {
				n = n + w.charAt(j);
                         }
			s1 = s1 + " " + n;
		}
		System.out.println(s1);

}

//	@Test
//	public void life() {
//		String s = "life is beautiful";
//		String s1 = "life";
//		String s2 = "is beautiful";
//		String reverse = "";
//		String result = "";
//		for (int i = s1.length() - 1; i >= 0; i--) {
//			reverse = s1.charAt(i) + "";
//			// result=reverse;
//			System.out.print(reverse + s2);

	//	}
		// System.out.print(reverse+s2);

	//}

}
