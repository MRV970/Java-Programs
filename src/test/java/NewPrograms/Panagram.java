package NewPrograms;

import org.testng.annotations.Test;

public class Panagram {
	
	@Test
	public void PanagramStringOrNot() {

	  String S = "Qwertyuiop asdfghjkL ZxcvbnM";
      S = S.toUpperCase();

      int count = 0;

      for (char ch = 'A'; ch <= 'Z'; ch++) {
          if (S.contains(String.valueOf(ch))) {
              count++;
          }
      }

      if (count == 26) {
          System.out.println("It is a Pangram->"+S);
      } else {
          System.out.println("It is NOT a Pangram->"+S);
      }
}
}