package ArrayPrograms;

import java.util.LinkedHashSet;

import java.util.TreeSet;

import org.testng.annotations.Test;

public class Removing_Duplicates_Array {
	@Test
	public void removeDuplicates() {
		
		TreeSet<Integer> t=new TreeSet<Integer>();
		//LinkedHashSet<Integer> t=new LinkedHashSet<Integer>();
		int a[]= {2,3,5,4,6,5,4,3};
		   for(int i:a) {
			  t.add(i);
		   }
		   System.out.println(t);
	}
	@Test
	public void removeDuplicates1() {
		
			int a[]= {10,2,5,3,6,5,10,2,5,3};
			for(int i=0;i<=a.length-1;i++) {
				int count=0;
				for(int j=0;j<i;j++) {
					if(a[i]==a[j]) {
					count++;
				}}
				if(count<1) {
					System.out.println(a[i]);
				}
			}
		}
	@Test
	public void removing() {
		int a[]= {10,2,5,3,6,5,10,2,5,3};
		for(int i=0;i<=a.length-1;i++) {
			int count=0;
			for(int j=0;j<=a.length-1;j++) {
				if(a[i]==a[j]&&i>j) {
					break;
				}
				if(a[i]==a[j]) {
					count++;
				}
				}
			if(count>=1) {
				System.out.println(a[i]);
			}
		}
	}
		
	}


