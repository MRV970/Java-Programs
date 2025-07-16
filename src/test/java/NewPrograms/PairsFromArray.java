package NewPrograms;

import java.util.ArrayList;

import org.testng.annotations.Test;

public class PairsFromArray {
	@Test
	public void Pairs() {
		  int a[] = {5, 6, 9, 11, 17, 20, 21};
	        String r = "";

	        for (int i = 0; i < a.length - 1; i += 2) {
	            r =r+ a[i] + "," + a[i + 1] + "\n";
	        }
           System.out.println(r);
	}
	
	@Test
	public void TwoNo() {
	     int[] a = {5, 6, 9, 11, 17, 20, 21};
	        ArrayList<String> pairs = new ArrayList<>();

	        for (int i = 0; i < a.length - 1; i += 2) {
	            String pair = a[i] + "," + a[i + 1];
	            pairs.add(pair);
	        }

	        // Join the pairs with " and "
	        String result = String.join(" ", pairs);
	        System.out.println(result);
	}

	@Test
	public void Sum_Of_Pairs() {
		int a[]= {5,6,7,8,3,4,8};
		int maxSum = 0;
       // int first = 0, second = 0;

        for (int i = 0; i < a.length - 1; i += 2) {
            int f = a[i];
            int s = a[i + 1];
            int sum = f + s;

      System.out.println(f + "," + s + " = " + sum);

            if (sum > maxSum) {
                maxSum = sum;
//                first = f;
//                second = s;
            }
        }

        System.out.println("Maximum Sum: " + maxSum);
    }
}
