package Strings;

public class StringExample6 {
	
/*	Suppose s1 and s2 are two string variables. if
	     s1 == s2     :0
	     s1>s2        :positive value
	     s1<s2        : Negative Value
*/
	public static void main(String[] args) {
		String s1 = "vivek";  
		String s2 = "vivek";
		String s3 = "tiwari";
		
		System.out.println(s1.compareTo(s2)); // 0, will come as both have same character, upper and lower case are also same.
		System.out.println(s1.compareTo(s3)); // 2, will come as s1 start with "v" and s3 with "t" and difference is 2 coz (s1>s3)
		System.out.println(s3.compareTo(s1)); // -2, will come as s1 start with "v" and s3 with "t" and difference is -2 coz (s3<s1)
		

	}

}
