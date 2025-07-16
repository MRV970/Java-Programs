package ArrayPrograms;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import org.testng.annotations.Test;

public class Element_Present_Array2 {
	
	@Test
	public void elementPresentLogic(){
		
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the n value");
	int n=sc.nextInt();
		int a[]= {35,23,66,78,98,32};
		 boolean flag=false;
		for(int i:a) {
			
			if(i==n) {
				flag=true;
				break;
				
				}
		}
		
		System.out.println(flag?"present":"not present");
			}
	
      @Test
      public void elementPresent() {
    	  Integer a[]= {23,56,45,32};
    	   int ele=52;
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
    	 int a[]= {1,2,5,4,7};
    	 int ele=7;
    	
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
}

