package PreAndPostIncrement;

public class PreAndPostExample3 {

	public static void main(String[] args) {
		int j = 0;
		int k = 0;
		
	int	m = j++;     // m will get 0 value as this is Post increment and value will increase after first execution
	int n = ++k;    // n will get increased value (1) as this is Pre-Increment, initially value will store in memory then execute
	
System.out.println("value of m is: " +m);    // m will have 0
System.out.println("value of n is: " +n);   // n will have 1
System.out.println("value of j is: " +j);  // J=1 in memory,coz after "m" excution value of j will become 1 in memory(post-increment)

	}

}
