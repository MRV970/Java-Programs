package Practice;

import org.testng.annotations.Test;

public class NumberPattern {
	@Test
	public void pattern() {
		    int size = 5;
		    int num = 1;
		    // upside pyramid
		    for (int i = 1; i <= size; i++) {
		      // printing spaces
		      for (int j = size; j > i; j--) {
		        System.out.print(" ");
		      }
		      // printing number
		      for (int k = 0; k < i * 2 - 1; k++) {
		        System.out.print(num++);
		      }
		      // set the number to 1
		      num = 1;
		      System.out.println();
		    }
		    // downside pyramid
		    for (int i = 1; i <= size - 1; i++) {
		      // printing spaces
		      for (int j = 0; j < i; j++) {
		        System.out.print(" ");
		      }
		      // printing number
		      for (int k = (size - i) * 2 - 1; k > 0; k--) {
		        System.out.print(num++);
		      }
		      // set num to 1
		      num = 1;
		      System.out.println();
		    }
		  }
		}


