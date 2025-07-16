package All_Programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

import org.testng.annotations.Test;

public class Array_All_Programs {
	@Test
	public void addingmatrices() {
		int a[][]= {{1,2},{3,4}};
		int b[][]= {{3,4},{4,5}};
		int c[][]=new int[2][2];
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				c[i][j]=a[i][j]+b[i][j];
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
	}
	@Test
	public void ascending() {
		int a[]= {35,46,24,9,87};
		Arrays.sort(a);
		for(int i:a) {
			System.out.println(i);
		}
	}
	@Test
	public void ascendinglogic() {
		int a[]= {35,49,54,5,2,90};
		
		for(int  i=0;i<=a.length-1;i++) {
			for(int j=i+1;j<=a.length-1;j++) {
			
				if(a[i]>a[j]) {
					
					
					 int temp=a[j];//
					a[j]=a[i];//
					a[i]=temp;//
				}
			}
			System.out.println(a[i]);
		}
		
	}
	@Test
	public void average() {
		int sum=0;
		int a[]= {2,3,5,7,3};
		for(int i=0;i<=a.length-1;i++) {
			sum=sum+a[i];
			}
		System.out.println(sum/a.length);
	   }
	
	@Test
	public void copyelementsreverse() {
		
		int a[]= {35,98,76,90,23};
		int b[]= new int [a.length];
		int index=0;
		for(int i=a.length-1;i>=0;i--) {
			 b[index]=a[i];
			 index++;
		}
	
		System.out.print(Arrays.toString(b));
		}
	
	@Test
	public void copyelementsreverse1() {
		
		int a[]= {35,98,76,90,23};
		int b[]= new int [a.length];
		
		for(int i=a.length-1;i>=0;i--) {
			b[a.length-1-i]=a[i];
			// b[i]=a[i];
		}
	
		System.out.print(Arrays.toString(b));
		}
	@Test
	public void count() {
		int a[]= {23,456,78899};
		for(int i:a) {
			int i1=i;
			int count=0;
			while(i>0) {
				int rem=i%10;
				count++;
				i=i/10;
			}
		
		System.out.println(count+"count of digits"+i1);
	}}
	@Test
	public void descending() {
		int a[]= {34,89,78,56,43};
		Arrays.sort(a);
		for(int i=a.length-1;i>=0;i--) {
			System.out.println(a[i]);
		}
	}
   @Test
   public void descendinglogic() {
	   int a[]= {35,49,54,5,2,90};
		for(int  i=0;i<=a.length-1;i++) {
			for(int j=i+1;j<=a.length-1;j++) {
				if(a[i]<a[j]) {
					 int temp=a[j];
					a[j]=a[i];
					a[i]=temp;
				}
			}
			System.out.println(a[i]);
		}
		
   }
   @Test
	public void elementPresentLogic(){
		
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the n value");
	int n=sc.nextInt();
		int a[]= {35,23,66,78,98,32};
		 boolean flag=false;
		for(int temp:a) {
			
			if(temp==n) {
				flag=true;
				break;
				
				}
		}
		
		System.out.println(flag?"present":"not present");
			}
	
     @Test
     public void elementPresent() {
   	  Integer a[]= {23,56,45,32};
   	   int ele=55;
   	   //asList method is used to store the array into list
   	  List<Integer> list=Arrays.asList(a);
   	  if(list.contains(ele)) {
   		  System.out.println("element is present:"+ele);
   	  }
   	  else {
   		  System.out.println("element is not present:"+ele);
   	  }
   	  }
      
     
    @Test
    public void elePresent() {
   	 int a[]= {1,2,3,4,5};
   	 int ele=2;
   	 
   	 //binarysearch method is used return the index of
   	 //searched element if it is found otherwise it returns negative value.
   	 int index=Arrays.binarySearch(a, ele);
   	 if(index>=0) {
   		 System.out.println("element is present:"+ele);
   	 }
   	 else {
   		 System.out.println("element is not present:"+ele);
   	 }
    }
    @Test
	public void factorial() {
		int a[]= {1,2,3,4,5};
		int fact=1;
		for(int i=0;i<=a.length-1;i++) {
			fact=fact*a[i];
			System.out.println(fact);
	}
	}
    @Test
	public void largestele() {
	int a[]= {32,54,98,67,90};
	Arrays.sort(a);
	
	for(int i:a) {
		
	}
	System.out.println(a[a.length-1]);
	}
	@Test
	public void largesteleLogic() {
		int a[]= {32,54,98,67,90};
		int large=0;
		for(int i=0;i<=a.length-1;i++) {
			if(a[i]>=large) {
				large=a[i];
			}
		}
		System.out.println(large);
	}
	@Test
	public void rightshift() {
	int a[]= {1,2,3,4};
	
	int temp=a[a.length-1];
	for(int i=a.length-1;i>0;i--) {
		a[i]=a[i-1];
		}
	a[0]=temp;
	
		System.out.print(Arrays.toString(a));
	    }
	
	
	@Test
	public void user_right_shift() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no.of  times");
		int n=sc.nextInt();
		int a[]= {35,34,67,89,76};
		for(int i=1;i<=n;i++) {
			int temp=a[a.length-1];
			for(int j=a.length-1;j>0;j--) {
				a[j]=a[j-1];
			}
			a[0]=temp;
		}
		for(int k :a) {
			System.out.print(k+" ");
		}
		
		}
     @Test
     public void rightShiftWithColl() {
    	 Integer a[]= {1,2,3,4,5};
    	 List<Integer> list=Arrays.asList(a);
    	 //System.out.println(list);
    	 Collections.rotate(list, 1);
    	 System.out.println(Arrays.toString(a));
      }
     @Test
 	public void length() {
 		int a[]= {12,21,3,5,7};
 		System.out.println(a.length);
 	}
     @Test
 	public void maxFreqEle() {
 		int a[]= {2,4,5,2,9,2,9};
 		int m_count=0;
 		int mf_ele=0;
 		for(int i=0;i<a.length-1;i++) {
 			int count=0;
 			for(int j=0;j<=i;j++) {
 				if(a[i]==a[j]) {
 					count++;
 				}
 			}
 			if(count>m_count) {
 				m_count=count;
 				mf_ele=a[i];
 			}
 		}
 			System.out.println(mf_ele+" maximum frequency is"+m_count);
 		
 	}
     @Test
 	public void merging() {
 		int a[]= {5,9,65,7};
 		int b[]= {8,4,6,2,7};
 		int c[]=new int[a.length+b.length];
 		int n=a.length;
 		for(int i=0;i<=a.length-1;i++) {
 			c[i]=a[i];
 			
 		}
 		for(int j=0;j<=b.length-1;j++) {
 			c[n++]=b[j];
 			//n++;
 		}
 	for(int k:c) {
 		System.out.println(k);
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
	public void missingNo() {
		int[] arr={1,9,3,5,6,7,8,2};
		int n=arr.length+1;
		//n=9
		int sum=(n*(n+1)/2);//9*(10)/2=45
		for(int i=0; i<arr.length; i++){
			//0<8
			sum=sum-arr[i];
			//45-1=44
			
			
		}
System.out.println("missing no is "+sum);
	}
 	
 	
 	@Test
 	public void moveZerosToEnd() {
 		int a[]={1,0,2,0,4,0,3};
        int n=0;
        for(int i=0;i<=a.length-1;i++){
            if(a[i]!=0){
                 a[n++]=a[i];
            }
           }
        for(int j=n;j<=a.length-1;j++){
            a[j]=0;
        }
        System.out.println(Arrays.toString(a));
 		
 	}
 	@Test
	public void movingZeros() {
		int a[]= {0,1,0,2,0,3,4};
		int c=0;//1/2/3
		for(int i=0;i<=a.length-1;i++) {
			if(a[i]!=0) {
				int temp=a[i];//1/2/3/4
				a[i]=a[c];//0/1/2/3
				a[c]=temp;//1/2/3/4
				c++;
			}
		}
		System.out.println(Arrays.toString(a));
	}
 	@Test
 	public void moveZerosToFirst() {
 		int a[]={1,0,2,0,4,0,3};
        int n=a.length-1;
        for(int i=a.length-1;i>=0;i--){
            if(a[i]!=0){
                 a[n--]=a[i];
            }
           
        }
        for(int j=0;j<=n;j++){
            a[j]=0;
        }
        System.out.println(Arrays.toString(a));

 	}

	
	@Test
	public void movingZerosFirst() {
		int a[]= {0,1,0,2,0,3,4};
		int c=0;
		for(int i=0;i<=a.length-1;i++) {
			if(a[i]==0) {
				int temp=a[i];
				a[i]=a[c];
				a[c]=temp;
				c++;
			}
		}
		System.out.println(Arrays.toString(a));
	}
	@Test
	public void multiply() {
		int a[][]= {{2,3},{4,5}};
		int b[][]= {{2,3},{4,5}};
		int k=2;
		int c[][]= new int[k][k];
		
		for(int i=0;i<k;i++) {
			for(int j=0;j<k;j++) {
				c[i][j]=a[i][j]*b[i][j];
				System.out.print(c[i][j]+" ");
				
			}
		
		System.out.println();
	}}
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
	@Test
	public void printingDuplicates() {
		int a[]= {10,2,5,3,6,5,10,2,5,3,6};
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
		@Test
		public void printingelements() {
			int a[]= {56,45,99,32};
			for(int i:a) {
				System.out.println(i);
			}
			
		}
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
		public void odd_Ele_Array() {
			int a[]= {34,78,98,67,54,45};
			for(int i=0;i<=a.length-1;i++) {
				if(a[i]%2!=0) {
					System.out.println(a[i]);
				}
			}
		}
		@Test
		public void printprime() {
			int a[]= {2,4,8,7,9,91};
			for(int i:a) {
			int count=0;
			for(int j=1;j<=i;j++) {
				
              if(i%j==0) {
					count++;
				}
				}
			if(count==2) {
				System.out.println(i+"prime");
			}
		}}
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
		@Test
		public void  reverse_each() {
			int a[]= {23,45,67,98};
			for(int i:a) {
				int rev=0;
				int i1=i;
				while(i>0) {
					int rem=i%10;
					rev=rev*10+rem;
					i=i/10;
				}
				System.out.println(rev+" is reverse of an element "+i1);
			}
		}
		@Test
		public void leftshift() {
		int a[]= {1,2,3,4};
		int temp=a[0];
		for(int i=0;i<a.length-1;i++) {
			a[i]=a[i+1];
			
		}
		a[a.length-1]=temp;
			for(int i:a) {
				System.out.print(i+" ");
			
		}
		}
		@Test
		
		public void user_left_shift() {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the no.of times");
			int n=sc.nextInt();
			int a[]= {34,45,67,23,98};
			for(int i=1;i<=n;i++) {
				int temp=a[0];
				for(int j=0;j<a.length-1;j++) 
					
						a[j]=a[j+1];
				
			a[a.length-1]=temp;
			
			}
			for(int k:a) 
				System.out.print(k+" ");
			
			}
		@Test
		public void rightleftwithColl() {
			Integer array[] = {1, 2, 3, 4, 5};

	       List<Integer> list =Arrays.asList(array);
	       
	       
	      // System.out.println(list.add(array));

	        // Perform the right shift using Collections.rotate()
	        Collections.rotate(list, -1); // The second argument is the number of positions to shift

	        System.out.println(Arrays.toString(array));
		}
		@Test
		public void seconglargest() {
			int a[]= {9,56,43,3,34};
			Arrays.sort(a);
			for(int i:a) {
				System.out.print(i+" ");
				
			}
			System.out.println();
			System.out.println(a[a.length-2]);
		
		}
		@Test
		public void secondlargestlogic() {
			int a[]= {9,56,43,3,34};
			int f=a[0];
			int s=a[1];
			for(int i=0;i<=a.length-1;i++) {
				if(a[i]>f) {
					s=f;
					f=a[i];
				}
				else if(a[i]>s&&a[i]!=f) {
					s=a[i];
				}
			}
			System.out.println(f);
			System.out.println(s);
		}
		@Test
		public void secondsmallest() {
			int a[]= {78,54,67,32,9};
			Arrays.sort(a);
			for(int k:a) {
				
			}
			System.out.println(a[1]);
			
		}
		@Test
		public void secondsmallestlogic() {
			int a[]= {78,54,67,32,9};
			int small=a[0];
			int sec=a[1];
			for(int i=0;i<=a.length-1;i++) {
				if(a[i]<small) {
					sec=small;
					small=a[i];
				}
				else if(a[i]<sec&&a[i]!=small) {
					sec=a[i];
				}
			}
			System.out.println(sec);
		}
		@Test
		public void smallest() {
			int a[]= {45,32,2,78,9};
			Arrays.sort(a);
			for(int i:a) {
				
			}
			System.out.println(a[0]);
		}
	     
		@Test
		public void smallestLogic() {
			int a[]= {45,32,2,78,9};
			int small=a[0];
			for(int i=0;i<=a.length-1;i++) {
				if(a[i]<small) {
					//System.out.println(a[i]);
					small=a[i];
				}
			}
				System.out.println(small);
			
		}
		@Test
		public void sumofEach() {
			int a[]= {11,22,33,44,55};
			for(int i:a) {
				int sum=0;
				int i1=i;
				while(i>0) {
					int rem=i%10;
					sum=sum+rem;
					i=i/10;
					
				}
			
				System.out.println(sum+"each number"+i1);
			
		}}
		@Test
		public void sum() {
			int a[]= {1,2,3,4,5,6};
			int sum=0;
			for(int i=0;i<=a.length-1;i++) {
				sum=sum+a[i];
			}
			System.out.println(sum);
		}
		@Test
		public void sum_Even() {
			int a[]= {1,2,3,4,5,6};
			int sum=0;
			for(int i=0;i<=a.length-1;i++) {
				if(a[i]%2==0) {
					sum=sum+a[i];
				}
			}
				System.out.println(sum);
			
		}
		@Test
		public void sum_Odd() {
			int a[]= {1,2,3,4,5,6};
			int sum=0;
			for(int i=0;i<=a.length-1;i++) {
				if(a[i]%2!=0) {
					sum=sum+a[i];
				}
			}
				System.out.println(sum);
			
		}
		@Test
		public void swap() {
			int a[]= {1,2,3,4,5,6};
			int b=a.length;
			int k=b/2;
			for(int i=0;i<k;i++) {
				int temp=a[i];
				a[i]=a[k+i];
				a[k+i]=temp;
			}
			System.out.println(Arrays.toString(a));
		}
		@Test
		public void transpose() {
			int a[][]= {{2,4,7},{3,5,4},{6,7,8}};
			int b[][]=new int[a.length][a.length];
			for(int i=0;i<a.length;i++) {
				for(int j=0;j<a[i].length;j++) {
					b[i][j]=a[j][i];
				
				System.out.print(b[i][j]+" ");
			}
				System.out.println();
			}
		}
		
}
