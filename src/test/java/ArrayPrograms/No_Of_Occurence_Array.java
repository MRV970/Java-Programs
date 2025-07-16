package ArrayPrograms;

import java.util.TreeSet;

import org.testng.annotations.Test;

public class No_Of_Occurence_Array {
	@Test
	public void occurence() {
	 int a[]= {2,3,6,6,5,4,3,3,2,2};
	 TreeSet<Integer> ts=new TreeSet<Integer>();
	 
	 for(int i=0;i<=a.length-1;i++) {
		 ts.add(a[i]);
	 }
	 for(Integer k:ts) {
		 int count=0;
		 for(int i=0;i<=a.length-1;i++) {
			 if(k.equals(a[i])) {
				 count++;
			 }
		 }
			System.out.println(k+"==="+count); 
		 }
	 }
	@Test
	public void occurenceEle() {
		 int a[]= {2,3,6,6,5,4,3,3,2,2};
		 for(int i=0;i<=a.length-1;i++) {
			 int count=0;
			 for(int j=0;j<a.length;j++) {
				 if(a[i]==a[j]&&i>j) {
					 break;
				 }
				 if(a[i]==a[j]) {
					 count++;
				 }
			 }
			 if(count>0) {
				 System.out.println(a[i]+" "+count);
			 }
			 
		 }
	}


}
