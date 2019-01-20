package Strings;

public class StringExample4 {

	public static void main(String[] args) {
		String s1 = "vivek";
		String s2 = "vivek";
		String s3 = new String("vivek");
		String s4 = "tiwari";
		
		// the String equals() method compares the original content of String
		
		System.out.println(s1.equals(s2));     //true
		System.out.println(s1.equals(s3));    // true
		System.out.println(s1.equals(s4));    // false
		System.out.println("-----------------");
		
		// the String == operator compares the reference of the String
		
		String s5 = "vivek";  
		String s6 = "vivek";   
		String s7 = new String ("vivek");  
		
		System.out.println(s5 == s6);  // True, because both reference to same instance
		System.out.println(s5 == s7);  // false, because s7 refer to instance created in non pool
		System.out.println(s6 == s7);    // false
		
		// the String "equals operator" only check the content if they are same.
		
		System.out.println("-------------------");
		System.out.println(s5.equals(s7));  // true, because equals method check the content only.
		System.out.println(s6.equals(s7));  // true, because content is same.
		System.out.println("-------------------");
		
		

	}

}
