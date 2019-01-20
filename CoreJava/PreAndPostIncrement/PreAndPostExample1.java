package PreAndPostIncrement;

public class PreAndPostExample1 {
	
	public static void main(String[] args) {
		int a = 0;
		int b = 0;
		
		int c = 0;
		int d = 0;
		
		System.out.println("pre-Increment of a is: " + ++a);   // in Pre-increment case first increase the value then print "a".
		System.out.println("pre-Increment of b is: " + ++b);   // in Pre-increment case first increase the value then print "a"
		
		System.out.println("post-Increment of c is: " + c++);  // in Post-Increment first Print the "C" then increase the value.
		System.out.println("post-Increment of d is: " + d++);  // in Post-Increment first Print the "d" then increase the value.
		
		
		System.out.println("c value is : " +c);   // again printing same value after post-increment will show 1 for "c" in result.
		System.out.println("d value is : " +d);  // again printing same value after post-increment will show 1 for "c" in result.
	}

}
