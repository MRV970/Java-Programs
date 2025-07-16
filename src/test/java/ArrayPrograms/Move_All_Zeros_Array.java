package ArrayPrograms;

import java.util.Arrays;

import org.testng.annotations.Test;

public class Move_All_Zeros_Array {
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
	public void moveZeros_First() {
		int a[]={1,0,2,0,4,0,3};
        int n=a.length-1;
        for(int i=a.length-1;i>=0;i--){
            if(a[i]!=0){
                 a[n--]=a[i];
            }}
        for(int j=0;j<=n;j++){
            a[j]=0;
        }
        System.out.println(Arrays.toString(a));
	}
	@Test
	public void moveZeros_end() {
		int a[]= {1,0,2,0,4,0,3,0};
		int n=0;
		for(int i=0;i<=a.length-1;i++) {
			if(a[i]!=0) {
				a[n++]=a[i];
				}
		}
		for(int j=n;j<=a.length-1;j++) {
			a[j]=0;
		}
		System.out.println(Arrays.toString(a));
	}
}
