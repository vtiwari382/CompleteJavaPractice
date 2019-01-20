package Strings;

public class StringExample2 {
	
	public static void main(String[] args) {
      
		String s1 = "My";
		String s2 = "My Name is";
		String s3 = "My Name is vivek";
		
		// Convert Char Array into String
		char ch[] = {'T', 'E', 'S', 'T'};
		String s4 = new String(ch);
	
		char ch1[] = {'T', 'E', 'S', 'T', '1'};
		String s5 = new String(ch1);
		
		char ch2[] = {'T', 'E', 'S', 'T', '2'};
		String s6 = new String(ch2);
		
		char ch3[] = {'T', 'E', 'S', 'T', '3'};
		String s7 = new String(ch3);
		
		// creating java string object by new keyword
		String s8 = new String();
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
		System.out.println(s6);
		System.out.println(s7);
		System.out.println(s8);
		
	}

}
