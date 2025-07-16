package NewPrograms;

import org.testng.annotations.Test;

public class GetNoFromBrackets {

	@Test
	public void getNo() {
		String s="My age is 18 Not (17)";
		int start = s.indexOf('(');
        int end = s.indexOf(')');
      String numberInBrackets = s.substring(start + 1, end);

        System.out.println("Number inside brackets: " + numberInBrackets);
    }
	
	@Test
	public void GetNo() {
		String s="My age is 18 not (17)";
		String n=s.split("\\(")[1].split("\\)")[0];
		System.out.println(n);
		
	}
	}


