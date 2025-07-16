package All_Programs;

import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeSet;

import org.testng.annotations.Test;

public class String_All_Programs {
	@Test
	public void anagram() {
		String s1="race";
		String s2="care";
		 char ch[]=s1.toCharArray();
		 char ch2[]=s2.toCharArray();
		 Arrays.sort(ch);
		Arrays.sort(ch2);
		
		if(Arrays.toString(ch).equals(Arrays.toString(ch2))) {
			System.out.println(s1+"is Anagram");
		}
		else {
			System.out.println(s1+" not an Anagram");
		}
	}
	@Test
	public void ascii() {
		String s="Testing";
		for(int i=0;i<=s.length()-1;i++) {
			System.out.println(s.codePointAt(i));
		}//codePointAt method gives ascii values
	}
	@Test
	public void evenAscii() {
		String s1="JavaPrograms";
		String s2="";
		
		for(int i=0;i<=s1.length()-1;i++) {
			int n=s1.codePointAt(i);
			//System.out.println(n);
			if(s1.charAt(i)%2==0) {
				s2=s2+" "+s1.charAt(i)+n;
				
			}
		}
		System.out.println(s2);    //" "  ascii value =32
	}
	@Test
	public void oddAscii() {
		String s1="JavaPrograms";
		String s2="";
		
		for(int i=0;i<=s1.length()-1;i++) {
			int n=s1.codePointAt(i);
			//System.out.println(n);
			if(s1.charAt(i)%2!=0) {
				s2=s2+" "+s1.charAt(i)+n;
				
			}
		}
		System.out.println(s2);
	}
	@Test
	 public void capsChar() {
		 String s="JaVa ProGrams";
		 String s2="";
		 for(int i=0;i<=s.length()-1;i++) {
			 if(s.charAt(i)>='A'&&s.charAt(i)<='Z') {
				 s2=s2+s.charAt(i);
			 
			 }}
		 System.out.println(s2);

	}
	 @Test
	 public void smallchar() {
		 String s="JaVa ProGrams";
		 String s2="";
		 for(int i=0;i<=s.length()-1;i++) {
			 if(s.charAt(i)>='a'&&s.charAt(i)<='z') {
				 s2=s2+s.charAt(i);
			 }
		 }
		 System.out.println(s2);
	 }
	 @Test
		public void compareStrings() {
			String s="Java";
			String s1="Programs";
			boolean flag=s.equals(s1);
			System.out.println(flag);
		}
	 @Test
		public void counting_spaces() {
			String s="Ja va PRo Gram s";
			
			int count=0;
			for(int i=0;i<=s.length()-1;i++) {
				if(s.charAt(i)==' ') {
					count++;
					}
			}
				System.out.println(count);
			
		}
	 @Test
		public void  count_U_L_S_N() {
			String s1="JAva #&PRograMs@123";
			String s2="";
			int U=0,L=0,S=0,N=0;
			for(int i=0;i<=s1.length()-1;i++) {
				if(s1.charAt(i)>='A'&&s1.charAt(i)<='Z') {
					U++;
				}
				else if(s1.charAt(i)>='a'&& s1.charAt(i)<='z') {
					L++;
					}
				else if(s1.charAt(i)>='0'&& s1.charAt(i)<='9'){
					N++;
					}
				else {
					S++;
					}
			}
			System.out.println("Uppercase:"+U);
			System.out.println("Lowercase:"+L);
			System.out.println("Numbers:"+N);
			System.out.println("Specialcharasters:"+S);
		}
        
	 @Test
		public void largest() {
		String s="Java is a Programming Language";
		   String[] s2=s.split(" ");
		String max=s2[0];
		for(int i=0;i<=s2.length-1;i++) {
			if(s2[i].length()>max.length()){
				max=s2[i];
				}
			}
		System.out.println(max);
		}
	 @Test
		public void length() {
			 String s="Testing";
			 System.out.println(s.length());
			 
		}
	 @Test
		public void longPalindrome() {
			String s="mam madam avava nananan";
			
			String s1[]=s.split(" ");
			String maxPal=s1[0];
			for(String s2:s1) {
			
			String reverse= new StringBuilder(s2).reverse().toString();
			
			if(s2.equals(reverse)&& reverse.length()<maxPal.length()) {
				maxPal=reverse;
			}
			}
			
			System.out.println(maxPal);
			//if the length of the palindrome is same it will taking first palindrome
		}
		
		@Test
		public void smallestPalindrome() {
			String s="ava madam nananan";
	        String s1[]=s.split(" ");
	        String minPal=s1[0];
	        for(String s2:s1){
	            String rev=new StringBuilder(s2).reverse().toString();
	            if(s2.equals(rev)&& rev.length()<minPal.length()){
	                minPal=rev;
	            }
	        }
	        System.out.println(minPal);

		}
		@Test
		public void reversechar () {
			String s="java";
			String reverse=new StringBuffer(s).reverse().toString();
			System.out.println(reverse);
		}
		@Test
		public void occurenceofWord() {
		
		String s="Java is a Java is a Programing Language Programing";
		 
		String sp[]=s.split(" ");
		HashSet<String> hs=new HashSet<String>();
		
		for(int i=0;i<=sp.length-1;i++) {
			hs.add(sp[i]);
			
		}
		for(String word:hs) {
			int count=0;
			for(int i=0;i<=sp.length-1;i++) {
				if(word.equals(sp[i])) {
					count++;
				}
			}
			System.out.println(word+" "+count);
			
		}
		

	}
		@Test
		public void repeat() {
			String s="Java is a Java is a Programing Language Language";
			 
			String s1[]=s.split(" ");
			for(int i=0;i<s1.length;i++) {
				int count=0;
				for(int j=0;j<s1.length;j++) {
					if(s1[i].equals(s1[j])&& i>j) {
						break;
					}
					if(s1[i].equals(s1[j])){
						count++;
					}
				}
				if(count>=1) {
					System.out.println(s1[i]+" "+count);
				}
				}
		     }
		@Test
		public void sub() {
			String s="javapisprogrammingsdgfg";
			for(int i=0;i<=s.length()-1;i++) {
		System.out.println(s.charAt(i)+""+i);
			
		}
		}
		@Test
		public void occurence() {
		String s="JavaPrograms";
		for(int i=0;i<=s.length()-1;i++) {
			int count=0;
			for(int j=0;j<=s.length()-1;j++) {
				if(s.charAt(i)==s.charAt(j)&&i>j) {
					break;
					}
				if(s.charAt(i)==s.charAt(j)) {
					count++;
				}
			}
	          if(count>0) {
				System.out.println(s.charAt(i)+" "+count);
			}
		}
		}
		@Test
		public void occuenceChar() {
			String s="JavaPrograms";
			 
			TreeSet<Character> ts=new TreeSet<Character>();
			for(int i=0;i<=s.length()-1;i++) {
				ts.add(s.charAt(i));
				
			}
			for(char ch:ts) {
				int count=0;
				for(int j=0;j<=s.length()-1;j++) {
					if(ch==s.charAt(j)) {
						count++;
					}
				}
				if(count>=1) {
					System.out.println(ch+" "+count);
				}
				
			
		}}
		
		@Test
		public void occurenceChar() {
			String s="JavaPrograms";
			String s1=s.toLowerCase();
			char ch[]=s1.toCharArray();
			for(char ch1='a';ch1<='z';ch1++) {
				int count=0;
				for(int i=0;i<ch.length-1;i++) {
				if(ch1==ch[i]) {
					count++;
				}
				
			}
				if(count>0) {
				System.out.println(ch1+" "+count);
				}
		}
		
		}
		@Test
		public void palindome() {
			String s="madam";
			String s2="";
			for(int i=s.length()-1;i>=0;i--) {
				s2=s2+s.charAt(i);
			}
			if(s.equals(s2)) {
				System.out.println("Palindrome-->> "+s);
			}
			else {
				System.out.println("not a Palindrome"+s);
			}
		}
			@Test
			public void printSpecialChar() {
				String s1="java@Prog^rams*p#&";
				String s2="";
				for(int i=0;i<=s1.length()-1;i++) {
					char ch=s1.charAt(i);
					if(!(ch>='a'&&ch<='z')&&!(ch>='A'&&ch<='Z')&&!(ch>='0'&&ch<='9')) {
						s2=s2+ch;
					}
				}
				System.out.println(s2);
			}
			@Test
			public void printingvowels() {
				String s="Java Programs";
				String s2="";
				for(int i=0;i<=s.length()-1;i++) {
					char ch =s.charAt(i);
					if(ch=='A'||ch=='a'||ch=='E'||ch=='e'||ch=='I'||ch=='i'||
							ch=='O'||ch=='o'||ch=='U'||ch=='u') {
						System.out.println(ch);
						s2=s2+ch;
					}
				}
				System.out.println(s2);
			}
			
			@Test
			public void printingConsonants() {
				String s="Java Programs";
				String s2="";
				for(int i=0;i<=s.length()-1;i++) {
					char ch =s.charAt(i);
					if(!(ch=='A'||ch=='a'||ch=='E'||ch=='e'||ch=='I'||ch=='i'||
							ch=='O'||ch=='o'||ch=='U'||ch=='u')) {
						//System.out.println(ch);
						s2=s2+ch;
					}
				}
				System.out.println(s2);
			}
			@Test
			public void read1standlast() {
				String s="Testing";
				System.out.println(s.charAt(0));
				System.out.println(s.charAt(s.length()-1));
			}
			@Test
			public void readCharacterrReverse() {
				String s="Testing";
				String s2="";
				for(int i=s.length()-1;i>=0;i--) {
					s2=s2+s.charAt(i);
					}
				System.out.println(s2);
				}
			@Test
			public void readcharacters() {
				String s="Testing";
				for(int i=0;i<=s.length()-1;i++) {
					System.out.println(s.charAt(i));
				}
			}
			@Test
		      public void removeduplicates() {
		    	  String s="JavaPrograms";
		        TreeSet ts=new TreeSet();
		        //LinkedHashSet ls=new LinkedHashSet();
		    	 for(int i=0;i<=s.length()-1;i++) 
		    	 {
		    		 ts.add((s.charAt(i)));
		    	 }
		    	 System.out.println(ts);
		      }
		      
		      @Test
		      public void removingDuplicates() {
		    	  String s="JavaPrograms";
		    	  for(int i=0;i<=s.length()-1;i++) {
		    		  int count=0;
		    		  for(int j=0;j<=s.length()-1;j++) {
		    			  if(s.charAt(i)==s.charAt(j)) {
		    				  count++;
		    			  }
		    		  }
		    		  if(count==1) {
		    			  System.out.print(s.charAt(i));
		    			  
		    		  }
		    	  }
		      }
		      @Test
		  	public void removinngSpaces() {
		  		String s="Ja va Pro grams";
		  		
		  		String s2= s.replaceAll(" ", "");
		  		
		  		System.out.println(s2);
		  		
		  	}
		      @Test
		  	public void replacingchar() {
		  	String s="Java is a Programming Language";
		  	
		  	String s2=s.replace('a', '*');
		  	System.out.println(s2);
		  	    

		  	}
		      @Test
		      public void replacevowels_Spaces() {
		      	String s="JavaPrograms";
		      	
		      		System.out.println(s.replaceAll("[^aeiouAEIOU]",""));
		    System.out.println(s.replaceAll("[aeiouAEIOU]", " "));
		      	}   
		      
		      @Test
		      public void vowels2() {
		      	String s="javaprograms";
		      	String s2=s.replaceAll("[^aeiouAEIOU]", "");
		      	for(int i=0;i<=s2.length()-1;i++) {
		      		int count=0;
		      		for(int j=0;j<=s2.length()-1;j++) {
		      			if(s2.charAt(i)==s2.charAt(j)) {
		      				count++;
		      			}
		      			if(i>j) {
		      				break;
		      			}
		      		}
		      		if(count>1) {
		      			System.out.println(s2.charAt(i)+" "+count);
		      		}
		      	}
		      }
		      @Test
		      public void reversing() {
		      	String s="JavaPro";
		      	for(int i=s.length()-1;i>=0;i--) {
		      	
		      	System.out.print(s.charAt(i));
		      	 
		      }}
		          @Test
		          public  void reverse1() {
		          	String s="java cool";
		          	String s1[]=s.split(" ");
		          	
		          	for(int i=s1.length-1;i>=0;i--) {
		          		System.out.print(s1[i]+" ");
		          	}
		          	
		          	}
		          @Test
		      	public void reverseword() {
		      		String s = "Java is a Programming language";
		      		String rev = "";
		      		String[] s2 = s.split(" ");
		      		for (int i = 0; i <= s2.length - 1; i++) {
		      			rev = s2[i] + " " + rev;
		      		}

		      		System.out.println(rev);
		      	}

		      	@Test
		      	public void reverse2() {
		      		String s = "Java is a Programming";
		      		String s1 = "";
		      		String s2[] = s.split(" ");
		      		for (String w : s2) {

		      			String n = "";
		      			for (int j = w.length() - 1; j >= 0; j--) {
		      				n = n + w.charAt(j);
		                               }
		      			s1 = s1 + " " + n;
		      		}
		      		System.out.println(s1);

		      	}

		      	@Test
		      	public void life() {
		      		String s = "life is beautiful";
		      		String s1 = "life";
		      		String s2 = "is beautiful";
		      		String reverse = "";
		      		String result = "";
		      		for (int i = s1.length() - 1; i >= 0; i--) {
		      			reverse = s1.charAt(i) + "";
		      			// result=reverse;
		      			System.out.print(reverse + s2);

		      		}
		      		// System.out.print(reverse+s2);

		      	}
		      	@Test
		    	public void smallestword() {
		    		String s="Java is a Robust";
		    		String s2[]=s.split(" ");
		    		String min=s2[0];
		    		for(int i=0;i<=s2.length-1;i++) {
		    			if(s2[i].length()<min.length() ) {
		    				min=s2[i];
		    				}
		    		}
		    		System.out.println("Smallest word :"+min);
		    	}
		      	@Test
		    	public void uppercase() {
		    	String s="Testing";
		    	System.out.println(s.toUpperCase());
		    	}
		    	
		    	@Test
		    	public void  lowercase() {
		    		String s= "TEsting";
		    		
		    		System.out.println(s.toLowerCase());
		    		
		    	}
		    	@Test
		    	public void swapping() {
		    		String s = "Java is Good";
		    		String s1[] = s.split(" ");

		    		String temp = "";
		    		temp = s1[s1.length - 1];
		    		s1[s1.length - 1] = s1[0];
		    		s1[0] = temp;

		    		System.out.println(Arrays.toString(s1));

		    	}
		    	@Test
		    	public void swappingStrings() {
		    		  // Initial strings
		            String a = "hello";
		            String b = "world";

		            // Swapping
		            a = a + b;        // Concatenate both strings
		            b = a.substring(0, a.length() - b.length()); // Extract the original 'a'
		            a = a.substring(b.length());  // Extract the original 'b'

		            // Output the results
		            System.out.println("a: " + a);  // Output: a: world
		            System.out.println("b: " + b);  // Output: b: hello

		    	 
		    	}
		    	@Test
		    	public void swap() {
		    	String	s1="hello";
		    	String	s2="world";
		    	s1=s1+s2;
		    	s2=s1.replaceAll(s2,"");
		    	s1=s1.replaceAll(s2, "");
		    	System.out.println(s1);
		    	System.out.println(s2);
		    	}
		    	@Test
		    	public void wordPrresent() {
		    	String s="JAva is a programming language";
		    	 
		    	String s2="is";
		    	 if(s.contains(s2)) {
		    		 System.out.println(s2+"<--is present");
		    	 }
		    	 else {
		    		 System.out.println(s2+"<--is not present");
		    	 }
		    	

		    }
		        @Test
		        public void substring() {
		        	String s="Java class";
		        	System.out.println(s.substring(2));
		        }
		        @Test
		    	public void charandNum() {
		    		
		    	
		    	String s="$9#7A";
		    	String n=s.replaceAll("[^0-9]", "");
		    	String ch=s.replaceAll("[^A-Z]", "");
		    	int sum=0;
		    	System.out.println(n);
//		    	System.out.println(ch);
		    	for(int i=0;i<n.length();i++) {
		    		sum+=Character.getNumericValue(n.charAt(i));
		    		
		    	}
		    	System.out.println(ch+sum);
		    	

		    }
		        
		        @Test
		    	public void charwithNo()
		    	{
		    		String s="a3b2c1";
		    		for(int i=0;i<=s.length()-1;i+=2) {
		    			int n=Character.getNumericValue(s.charAt(i+1));
		    			for(int j=1;j<=n;j++) {
		    				System.out.print(s.charAt(i));
		    			}
		    		}
		    	}
		        @Test
		    	public void characters() {
		    		String s="aaabbc";
		    		int c=1;
		    		for(int i=0;i<s.length()-1;i++) {
		    			if(s.charAt(i)==s.charAt(i+1)) {
		    				c++;
		    			}else {
		    				System.out.print(s.charAt(i)+""+c);
		    				c=1;
		    			}
		    		}
		    		System.out.print(s.charAt(s.length()-1)+""+c);
		    	}

		    	@Test
		    	public  void occurence1() {
		    		String s="AAABBCCCCDD";
		    		String s1="";
		    		for(int i=0;i<s.length();i++){
		    		  int count=0;
		    		    if(!s1.contains(s.charAt(i)+"")){
		    			s1=s1+s.charAt(i);
		    		 		for(int j=0;j<s.length();j++){
		    		   		  if(s.charAt(i)==s.charAt(j)){
		    					count++;
		    					}
		    				}
		    		System.out.print(count+""+s.charAt(i))	;
		    		}

		    		}
		    	}
		    	@Test
		    	public void charAndNo() {
		    		String s="$#28!33AB#C";
		    		String[] n=s.split("[^0-9]");
		    		String []ch=s.split("[^A-Za-z]");
		    		
		    		for(int i=n.length-1;i>0;i--) {
		    			if(n[i]!="") 
		    				System.out.print(n[i]+" ");
		    			
		    			
		    		}
		    		for(int i=0;i<ch.length;i++) {
		    			if(ch[i]!="") 
		    				System.out.print(ch[i]+" ");
		    				
		    			
		    		}
		    	//System.out.println(n+ch);
		    		
		    		
		    	}
		    	@Test
		    	public void reverse() {
		    		String s="I Love Java";
		    		String r=s.replaceAll(" ", "");
		    		int l=r.length()-1;
		    		for(int i=0;i<s.length();i++) {
		    			if(s.charAt(i)==' ') {
		    				System.out.print(s.charAt(i));
		    			}
		    			else {
		    				System.out.print(r.charAt(l--));
		    			}
		    		}
		    		
		    	}
		    	@Test
		    	public void sample() {
		    		String s = "raghavamma";

		    		for (int i = 0; i <= s.length() - 1; i++) {
		    			if (i % 2 == 0) {

		    				//System.out.print(s.toUpperCase().charAt(i));
		    				char m=(char) (s.charAt(i)-32);
		    				System.out.print(m);
		    				

		    			} else {
		    				//System.out.print(s.toLowerCase().charAt(i));
		    			}

		    		}
		    	}
		    	@Test
		    	public void vowels() {
		    		String s="Raghavamma";
		    	String s1="aeiouAEIOU";
		    	
		    		for(int i=0;i<s.length();i++) {
		    			//char ch=s.charAt(i);
		           if(s1.contains(s.charAt(i)+"")) {
		    			System.out.println(s.charAt(i));
//		    			}
		           }
		    		}
		    		}
		    @Test
		    public void vowelscon() {
		    	String s="javaprogramming";
		    	for(char c:s.toCharArray()) {
		    		if("aeiouAEIOU".contains(String.valueOf(c))) {
		    		System.out.println(c+" ");
		    		}
		    		
		    	}
		    }
		    	
		    	
		    	@Test
		    	public void sum() {
		    		String s="a2b3c4";
		    		String s1=s.replaceAll("[^0-9]", "");
		    		
		    		int sum=0;
		    		for(int i=0;i<=s1.length()-1;i++) {
		    			
		    			sum=sum+Character.getNumericValue(s1.charAt(i));
		    		}
		    		
		    		System.out.println(sum);
		    	}
		    	@Test
		    	public void sumOfNo() {
		    		String s="a2b3c4";
		    	    int res=0;
		    	    for(char c:s.toCharArray()){
		    	        if(Character.isDigit(c)){
		    	            res+=Character.getNumericValue(c);
		    	        }
		    	    }
		    	    System.out.println(res);
		    	}
		    	
		    	@Test
		    	public void multiply() {
		    		int n=1;
		    		int m=10;
		    		while(true) {
		    		n=n*2+1;
		    		System.out.print(n+" ");
		    		}
		    		
		    	}
		    	@Test
		    	public void multiple() {
		    		int n=1;;
		    		for(int i=0;i<=10;i++) {
		    			System.out.print(n+" ");
		    			n=n*2+1;
		    		}
		    	}
		    	@Test
		    	public void mm() {
		    		int n=1;
		    		int m=1;
		    		while(m<=10) {
		    			System.out.print(n+" ");
		    			n=n*2+1;
		    			m++;
		    		}
		    	}
//		    	12345
//		    	2345
//		    	345
//		    	45
//		    	5
		    	
		    	@Test
		    	public void pattern() {
		    		int n=5;
		    		for(int i=1;i<=n;i++) {
		    			for(int j=1;j<=n;j++) {
		    				if(i<=j ) {
		    					System.out.print(j);
		    				}
		    				else {
		    					System.out.print("");
		    				}
		    			}

		    		System.out.println();
		    		}
		    	}
}
