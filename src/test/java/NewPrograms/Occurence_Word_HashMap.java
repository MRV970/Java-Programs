package NewPrograms;

import java.util.HashMap;

import org.testng.annotations.Test;

public class Occurence_Word_HashMap {
	@Test
	public void hashMap() {
		String s = "I will order the pizze and I will order the briynai";
        String[] s2 = s.split(" ");
        HashMap<String, Integer> wCount = new HashMap<>();
        for (String w : s2) {
            if (wCount.containsKey(w)) {
                wCount.put(w, wCount.get(w) + 1);
            } 
            else {
                wCount.put(w, 1);
            }
        }
        for (String word : wCount.keySet()) {
        	System.out.println(word + " = " + wCount.get(word));
        	}

	}

}
