package ArrayPrograms;

import java.util.ArrayList;

import org.testng.annotations.Test;

public class Print_Duplicate_Elements_Array {
	@Test
	public void printingDuplicates() {
		int a[]= {10,2,5,3,6,5,10,2,5,3,1,6,6};
		for(int i=0;i<=a.length-1;i++) {
			int count=0;
			for(int j=0;j<=i;j++) {
				if(a[i]==a[j]) {
				count++;
				
			}}
			if(count==2) {
				System.out.println("duplicate elements:"+a[i]);
			}
		}}
		@Test
		public void printingduplicates1() {
			int a[]= {10,2,3,4,2,3,10,3,4,10,5};
			ArrayList<Integer> hs=new ArrayList<Integer>();
			for(int i=0;i<=a.length-1;i++) {
				hs.add(a[i]);
			
			}			
			System.out.println(hs);
			for(Integer k:hs) {
				int count=0;
				for(int j=0;j<=a.length-1;j++) {
					if(k.equals(a[j])) {
						count++;
					}
				}
				if(count==2)
				System.out.println(k);
			}
			
				
			}
		@Test
		public void printingDupl() {
			int a[]={1,2,1,4,3,1,2,4,3,5};
		       for(int i=0;i<=a.length-1;i++){
		           int count=0;
		           for(int j=0;j<=a.length-1;j++){
		              if(a[i]==a[j]&& i>j){
		                  break;
		              }
		               if(a[i]==a[j]){
		                   count++;
		               }
		           }
		           if(count>1){
		               System.out.println(a[i]+"--> "+count);
		           }
		       }
		}
		}
	


