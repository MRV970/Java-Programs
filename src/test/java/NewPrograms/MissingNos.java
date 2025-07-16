package NewPrograms;

import org.testng.annotations.Test;

public class MissingNos {
	@Test
	
	 public void missNo(){
	        int[] arr = {1, 6, 8};

	        for (int i = 1; i <= 10; i++) {
	            boolean found = false;

	            // Check if i is present in the array
	            for (int j = 0; j < arr.length; j++) {
	                if (arr[j] == i) {
	                    found = true;
	                    break;
	                }
	            }

	            // If not found, print it
	            if (!found) {
	                System.out.print(i + " ");
	            }
	        }
	    }
	
	@Test
	public void Nos() {
		int[] a = {1, 6, 8};

        for (int i = 1; i <= 10; i++) {
            int count = 0;

            // Count how many times i appears in the array
            for (int j = 0; j < a.length; j++) {
                if (a[j] == i) {
                    count++;
                }
            }

            // If count is 0, the number is missing
            if (count == 0) {
                System.out.print(i + " ");
            }
        }
	}
	
	@Test
	public void NumbersMissing() {
		 int[] arr = {1, 6, 8};

	        // Create a frequency array from 1 to 10
	        int[] freq = new int[11]; // Index 0 unused

	        // Mark existing numbers
	        for (int i = 0; i < arr.length; i++) {
	            freq[arr[i]] = 1;
	        }

	        // Print numbers not marked
	        for (int i = 1; i <= 10; i++) {
	            if (freq[i] == 0) {
	                System.out.print(i + " ");
	            }
	        }
	}

}
