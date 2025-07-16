package ArrayPrograms;

import java.util.Scanner;

import org.testng.annotations.Test;

public class Element_Present_Array {
	@Test
	public  void elementPresent() {
		
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the n value");
	int n=sc.nextInt();
		int a[]= {35,23,66,78,98,32};
		
		for(int i=0;i<=a.length-1;i++) {
		// System.out.println(i);
		
			if(a[i]==n) {
				System.out.println("given element is present"+n);
				return;
			}
		}
		
				System.out.println("given element is not present "+n);
				
			
		}	
	

}
