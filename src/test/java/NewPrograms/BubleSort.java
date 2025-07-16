package NewPrograms;

import org.testng.annotations.Test;

public class BubleSort {
	@Test
	public void bubblesort() {
		int a[]= {20,30,2,40,50,30};
		for (int i = 0; i < a.length; i++) 
		{
            for (int j = i+1; j < a.length; j++) 
            {
                if (a[i] > a[j]) 
                {
             int temp = a[i];
                    a[i] = a[j];
                   a[j]=temp;
                }
            }
            System.out.print(a[i]+" ");		}
	}
}
