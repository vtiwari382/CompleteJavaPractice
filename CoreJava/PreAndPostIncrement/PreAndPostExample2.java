package PreAndPostIncrement;

public class PreAndPostExample2 {

	public static void main(String[] args) {
		int i = 0;
		int j = 0;
		
		System.out.println("Value of i is: " +i);   // at this step i and j have default value (0,0)
		System.out.println("Value of j is: " +j);
		

		System.out.println("Pre-increment Value of i is: " + ++i); // at this step i and j have Pre-incremented value (1,1)
		System.out.println("Pre-Increment Value of j is: " + ++j); 

		
		System.out.println("Post-increment Value of i is: " + i++); // at this step i and j have previous value (1,1), this will increase later
		System.out.println("Post-Increment Value of j is: " + j++); 
		

		System.out.println("New Incremented Value of i is: " +i);  // after previous post-increment value of i and j will increase (2,2)
		System.out.println("New Incremented Value of j is: " +j);
		
	}

}
