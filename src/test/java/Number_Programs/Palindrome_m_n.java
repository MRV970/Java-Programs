package Number_Programs;

import java.util.Scanner;

import org.testng.annotations.Test;

public class Palindrome_m_n {
	@Test
	public void palindrome() {
		Scanner sc=new Scanner(System.in);
		
		//System.out.println("enter the m value");
		
		//int m=sc.nextInt();
		
		System.out.println("enter the n value");
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			System.out.println(i);
			int rev=0;
			int i1=n;
			int i2=i1;
			while(n>0) {
				int rem=n%10;
				rev=rev*10+rem;
				n=n/10;
				System.out.println(rev);
			
			}
			if(rev==i2) {
				System.out.println("Palindrome number"+i2);
			}
			else {
				System.out.println("Not a Palindrome"+i2);
			}
		
	}}

}
