package NewPrograms;

import java.util.HashMap;

import org.testng.annotations.Test;

public class Occurence_Word_HashMap {
	@Test
	public void hashMap() {
		String s = "I will order the pizze and I will order the briynai";
        String[] s2 = s.split(" ");
        HashMap<String, Integer> wC = new HashMap<>();
        for (String w : s2) {
            if (wC.containsKey(w)) {
                wC.put(w, wC.get(w) + 1);
            } 
            else {
                wC.put(w, 1);
            }
        }
        for (String word : wC.keySet()) {
        	System.out.println(word + " = " + wC.get(word));
        	}

	}

}
