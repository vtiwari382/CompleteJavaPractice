package PreAndPostIncrement;

public class PreAndPostDecrement {

	public static void main(String[] args) {
		
		int i = 2;
		
	int	j = --i;     // j will get 1 value (2-1) as this is Pre Decrement and value will decrease first
	int k =  i--;    // n will get 1 because after "j" execution 1 will store in memory and post- Decrement action will perform after that.
	
System.out.println("value of j is: " +j);    // j will have 1
System.out.println("value of k is: " +k);   // k will have 1

	}

}
