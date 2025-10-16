package String_Programs;

import org.testng.annotations.Test;

public class Count_Upper_Lower_SpecialChar_String {
	
	@Test
	public void  count_U_L_S_N() {
		String s1="JAva #&PRograMs@123";
		int U=0,L=0,S=0,N=0;
		for(int i=0;i<=s1.length()-1;i++) {
			if(s1.charAt(i)>='A'&&s1.charAt(i)<='Z') {
				U++;
			}
			else if(s1.charAt(i)>='a'&& s1.charAt(i)<='z') {
				L++;
				}
			else if(s1.charAt(i)>='0'&& s1.charAt(i)<='9'){
				N++;
				}
			else {
				S++;
				}
		}
		System.out.println("Uppercase:"+U);
		System.out.println("Lowercase:"+L);
		System.out.println("Numbers:"+N);
		System.out.println("Specialcharacters:"+S);
	}

}
