package Exception;

import java.io.IOException;

public class ThrowsKeyword {

	// In Java Throws Keyword is use to declare an Exception.
	// Exception can be Propagated (forwarded in call stack)
	// it provides information to the caller of the method about the exception
	
	
	public void test1() throws IOException{
		throw new IOException("IOException error");
	}
	
	public void test2() throws IOException{
		test1(); // test1 method have exception that will come in test2 also after calling, so either we have to handle the exception or throw the exception,that's why we should use exception again.
		System.out.println("i am running test2");
	}
	
	void test3(){
		try{
			test2(); //test2 have exception,so either we have to through the exception or handle the exception.here we are handling exception.
		} catch (Exception e){
			System.out.println("Exception is Handled");
		}
		System.out.println("Test is running");
	}
	
	
	public static void main(String[] args) throws IOException {
		
		/*ThrowsKeyword obj = new ThrowsKeyword();
		obj.test3();
		System.out.println("---------------------");
		obj.test2();  // test 2 is not handling exception so here we have to through exception with main method.
		*/
		
		ThrowsKeyword1 obj = new ThrowsKeyword1();  // calling method of different class using that class reference and object.
		obj.test5();
	}

}
