package ArrayPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import org.testng.annotations.Test;

public class Merging_Two_Arrays {
	@Test
	public void merging() {
		int a[]= {5,9,65,7};
		int b[]= {8,4,6,2};
		int c[]=new int[a.length+b.length];
		int n=a.length;
		for(int i=0;i<=a.length-1;i++) {
			c[i]=a[i];
			}
		for(int j=0;j<=b.length-1;j++) {
			c[n]=b[j];
			n++;
		}
	for(int k:c) {
		System.out.print(k+" ");
	}
	}
	@Test
	public void collemerge() {
		int a[]= {5,9,65,7};
		int b[]= {8,4,6,2};
		int c[]=new int[a.length+b.length];
		System.arraycopy(a, 0, c, 0, a.length);
		System.arraycopy(b, 0, c, a.length, b.length);
		System.out.println(Arrays.toString(c));
	}
	@Test
	public void collemergeZigzag() {
		int a[]= {5,9,65,7};
		int b[]= {8,4,6,2};
		ArrayList<Integer> c=new ArrayList<Integer>();
		for(int i=0,j=0;i<=a.length-1&&j<=a.length-1;i++,j++) {
			c.add(a[i]);
			c.add(b[j]);
		}
		System.out.println(c);
	}
	@Test
	public void collemerge2() {
		int a[]= {5,9,65,7};
		int b[]= {8,4,6,2};
		ArrayList<Integer> c=new ArrayList<Integer>();
		for(int i=0;i<=a.length-1;i++) {
			c.add(a[i]);
		}
			for(int j=0;j<=a.length-1;j++) {
				
			c.add(b[j]);
		
		}
		System.out.println(c);
	}
	@Test
	public void mergewithfor() {
		int a[]= {1,2,3,4};
		int b[]= {5,6,7,8};
		int c[]=new int[a.length+b.length];
		for(int i=0;i<=c.length-1;i++) {
			if(i<a.length) {
				c[i]=a[i];
			}
			else {
				c[i]=b[i-a.length];
			}
		}
		System.out.println(Arrays.toString(c));
	}
    	  @Test
    	  public void zigzag() {
    		  int a[]= {1,2,3,4};
    			int b[]= {5,6,7,8};
    			int c[]=new int[a.length+b.length];
    			int d=0;
    			for(int i=0;i<c.length;i++) {
    				
    				c[i]=a[d];
    				c[++i]=b[d];
    				d++;
    			}
    			System.out.println(Arrays.toString(c));
    	  }
}
