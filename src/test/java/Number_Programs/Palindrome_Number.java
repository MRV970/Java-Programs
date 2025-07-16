package Number_Programs;

import java.util.Scanner;

import org.testng.annotations.Test;

public class Palindrome_Number {
	
	@Test
	public void palindrome() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the m value");
		int m=sc.nextInt();
		System.out.println("enter the k value ");
		int k=sc.nextInt();
		for(int i=m;i<=k;i++) {
		int n=i;
		int n1=n;
		int rev=0;
		while(n>0) {
			int rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		if(rev==n1) {
			System.out.println("Palindrome number :"+n1);
		}
		else {
			System.out.println("Not a palindrome number"+n1);
		}
	}

}}
