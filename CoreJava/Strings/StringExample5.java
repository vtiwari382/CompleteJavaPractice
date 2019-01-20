package Strings;

public class StringExample5 {

	public static void main(String[] args) {
		
		String p1 = "vivek";
		String p2 = "VIVEK";
		
		System.out.println(p1.equals(p2));  // false, because p1 is in lower case and p2 is in upper case.
		System.out.println(p1.equalsIgnoreCase(p2));   // true, because it will ignore the upper/lower case alphabet and check content
		
		String p3 = "test";
		String p4 = "test";
		
		System.out.println(p3.equals(p4));  // true, because p3 and p4 are in lower case.
		System.out.println(p3.equalsIgnoreCase(p4));   // true,

	}

}
