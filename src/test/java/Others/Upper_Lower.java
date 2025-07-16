package Others;

import org.testng.annotations.Test;

public class Upper_Lower {
	@Test
	public void sample() {
		String s = "raghavamma";

		for (int i = 0; i <= s.length() - 1; i++) {
			if (i % 2 == 0) {

			System.out.print(s.toUpperCase().charAt(i));
				//char m=(char) (s.charAt(i)-32);
				//System.out.print(m);
				
			} else {
				System.out.print(s.toLowerCase().charAt(i));
			}

		}
	}

}
