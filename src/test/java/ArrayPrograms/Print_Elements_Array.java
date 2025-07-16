package ArrayPrograms;

import java.util.Arrays;

import org.testng.annotations.Test;

public class Print_Elements_Array {
	@Test
	public void ptintingelements() {
		int a[]= {34,78,98,67,54};
		for(int i=0;i<=a.length-1;i++) {
				System.out.println(a[i]);
		}
	}
	@Test
	public void even_Ele_Array() {
		int a[]= {34,78,98,67,54,45};
		for(int i=0;i<=a.length-1;i++) {
			if(a[i]%2==0) {
				System.out.println(a[i]);
			}
		}
	}
	@Test
	public void ReverseEle() {
		int a[]= {34,78,98,67,54,45};
		for(int i=a.length-1;i>0;i--) {
			System.out.println(a[i]);
			
		}
		
	}
	@Test
	public void odd_Ele_Array() {
		int a[]= {34,78,98,67,54,45};
		for(int i=0;i<=a.length-1;i++) {
			if(a[i]%2!=0) {
				System.out.println(a[i]);
			}
		}
	}
	@Test
	public void printingelements() {
		int a[]= {56,45,99,32};
		for(int i:a) {
			System.out.println(i);
		}
		
	}
}
