package Number_Programs;

import java.util.Scanner;

import org.testng.annotations.Test;

public class PrimeNumbers_m_n {
	
	@Test
	public void primenumbers() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter m value");
		int m=sc.nextInt();
		System.out.println("enter n value");
		int n=sc.nextInt();
		for(int j=m;j<=n;j++) {
				int count=0;
				
		for(int i=1;i<=j;i++) {
			if(j%i==0) {
				count++;
			}
			
		}
		if(count==2) {
			System.out.println("prime number"+j);
		}
//		else {
//			System.out.println("Not a Prime number"+j);
//		}
	}
	}
}
