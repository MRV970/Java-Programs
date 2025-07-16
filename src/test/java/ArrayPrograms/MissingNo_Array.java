package ArrayPrograms;

import java.util.Arrays;

import org.testng.annotations.Test;

public class MissingNo_Array {
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
	public void missing() {
		int a[]= {1,56,98,5,90,45,9,15};
		boolean status=true;
		for(int i=1;i<=100;i++) {
			for(int j=0;j<=a.length-1;j++) {
				if(i==a[j]) {
					status=false;
					break;
				}
			}
		
			if(status==true) {
				System.out.println(i);
			}
		
			status=true;
			
		}}

}
