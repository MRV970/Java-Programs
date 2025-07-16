package NewPrograms;

import java.util.Arrays;

import org.testng.annotations.Test;

public class Merge_Occurence {
	@ Test
	public void MergeOcc() {
		int a []= {1,2,3,4,5,6};
		int b[]= {2,3,4,5,7,9};
		int c[]=new int[a.length+b.length];
		
		for(int i=0;i<c.length;i++) {
			if(i<a.length) {
				c[i]=a[i];
			}
			else {
			c[i]=b[i-a.length];
			}
			
		}
		//System.out.println(Arrays.toString(c));	
		
		for(int i=0;i<c.length;i++) {
			int count=0;
			for(int j=0;j<c.length;j++) {
				if(c[i]==c[j]&&i>j) {
					break;
				}
				if(c[i]==c[j]) {
					count++;
				}
			}
			if(count>=1) {
				System.out.println(c[i]+"->"+count);
			}
		}
		
	}

}
