package NewPrograms;

import java.util.HashMap;

import org.testng.annotations.Test;

public class PrintOnlyParticularLikeA_b {
	@Test
	public void printa_b() {
		
		String a[]= {"aab","aba","adab","daba"};
		
		for(int i=0;i<=a.length-1;i++) {
			int count=0;
			String b=a[i];
			for(int j=0;j<b.length();j++) {
				if(!(b.charAt(j)=='a' || b.charAt(j)=='b')) {
					count++;
				}
			}
			if(count==0) {
				System.out.println(b);
			}
		}
	}
	
	@Test
	public void printonly_a_b() {
		
		String a[]= {"aab","aba","adab","daba"};
		
		
		for(int i=0;i<=a.length-1;i++) {
			char ch[]=a[i].toCharArray();
			boolean re=true;
			for(int j=0;j<=ch.length-1;j++) {
				if(ch[j]=='a'||ch[j]=='b') {
					re=true;
					
				}
				else {
					re=false;
					break;
				}
			}
			if(re) {
				System.out.println(a[i]);
			}
		}
	}

	@Test
	public void printing_a_b_HashMap(){
		String[] words = {"ab", "bd", "aaab", "baa", "badab"};
        String allowed = "ab";

        HashMap<Character, Integer> map = new HashMap<Character, Integer>();

       for (int k = 0; k < allowed.length(); k++) {
            map.put(allowed.charAt(k), 1);
       }
       for(int i=0;i<words.length;i++) {
    	   boolean flag=true;
    	   
    	   String word=words[i];
    	   
    	   for(int j=0;j<word.length();j++) {
    		   if(!map.containsKey(word.charAt(j))) {
    			   flag=false;
    		   }
    	   }
    	   if(flag) {
    		   System.out.println(words[i]);
    	   }
       }
		
	}

}
