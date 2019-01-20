package Exception;

import java.io.IOException;

public class ThrowsKeyword2 {

	public void test() throws IOException{
		System.out.println("no exception");
	}
	
	public void test1() throws IOException{
		System.out.println("it has exception");
		throw new IOException("Exception Occured");
	}
	
	public static void main(String[] args) throws IOException {
		ThrowsKeyword2 obj = new ThrowsKeyword2();
		
		obj.test();
		System.out.println("i am running after test");// this message will print as test1 not have throw keyword/ not implemented after throw.
		
	/*	obj.test1();    // test1 method will call and execute line by line.
		System.out.println("i am running after test1"); // this message will not print as it is implemented after throw exception. 
*/
	}

}
