package Others;

import org.testng.annotations.Test;

public class I_Love_Java_reverse {
	@Test
	public void reverse() {
		String s="I Love Java";
		String r=s.replaceAll(" ", "");
		//System.out.println(r);
		int l=r.length()-1;
		//System.out.println(l);
		for(int i=0;i<s.length();i++) {
 //If the current character in the ch string is a space, print it as-is.
			if(s.charAt(i)==' ') {
				System.out.print(s.charAt(i));
			}
			else {
		//If it's not a space, print the character from r (which has no spaces) 
				//from the end (reversed) and move backward (l--).
				System.out.print(r.charAt(l--));
				//(r = "ILoveJava"
				//Index from back → 8 7 6 5 4 3 2 1 0

				//Characters used in order: a v a J e v o L I)
			}
		}
		
	}
	@Test
	
	public void ReverseWithoutCollections() {
	     
	        String S = "i am selenium";
	        char[] ch = S.toCharArray();
	        char[] r = new char[ch.length];

	        int j = ch.length - 1;

	        // Fill r array with reversed characters (skipping spaces)
	        for (int i = 0; i < ch.length; i++) {
	            if (ch[i] == ' ') {
	                r[i] = ' '; // Keep space at same position
	            } else {
	                // Find next non-space character from the end
	                while (ch[j] == ' ') {
	                    j--;
	                }
	                r[i] = ch[j];
	                j--;
	            }
	        }

	        // Print r
	        System.out.println(new String(r));
	    }
	}



