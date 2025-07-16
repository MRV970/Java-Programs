package ArrayPrograms;

import java.util.ArrayList;


import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import org.testng.annotations.Test;

public class Left_Shift_Array1 {
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
	public void user_left_shift(){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no.of times");
		int n=sc.nextInt();
		int a[]= {34,45,67,23,98};
		for(int i=1;i<=n;i++) {
			int temp=a[0];
			for(int j=0;j<a.length-1;j++) {
				
					a[j]=a[j+1];
			}
		a[a.length-1]=temp;
		
		}
		for(int k:a) 
			System.out.print(k+" ");
		
		
	}
	@Test
	public void rightleftwithColl() {
		Integer array[] = {1, 2, 3, 4, 5};

       List<Integer> list =Arrays.asList(array);
       

        // Perform the right shift using Collections.rotate()
        Collections.rotate(list, -1); // The second argument is the number of positions to shift

        System.out.println(Arrays.toString(array));
	}
	
	

}
