package Exception;

public class ThrowKeyword {

	// In java throw keyword is use to explicitly Throw an Exception.
	// we can throw either checked or unchecked exception in java by Throw Keyword.
	// the Throw Keyword is use to throw custom exception.
	
	public static void testThrow(int age){
		if (age<10)
			throw new ArithmeticException("not valid");
		else
			System.out.println("it's valid");
		
	}
	
	public static void testThrow_1(int sum){
		if (sum > 100)
			throw new NumberFormatException("this number is wrong");
		else
			System.out.println("Number is Right");
		
	}
	
	public static void main(String[] args) {
		testThrow(19);
		testThrow_1(90);

	}

}
