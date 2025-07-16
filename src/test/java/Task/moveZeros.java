package Task;

import java.util.Arrays;

import org.testng.annotations.Test;

public class moveZeros {
	@Test
	public void zeros() {
		int a[]={1,0,4,0,3};
        int c=0;
        for(int i=0;i<=a.length-1;i++){
            if(a[i]==0){
             
                 int temp=a[i];
                 a[i]=a[c];
                 a[c]=temp;
                c++;
                 
             }   
            }
            System.out.println(Arrays.toString(a));
            
        
	}

}
