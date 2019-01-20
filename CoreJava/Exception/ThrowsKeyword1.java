package Exception;

import java.io.IOError;
import java.io.IOException;

public class ThrowsKeyword1 {

	public void test5() throws IOException{
		throw new IOException("i am from ThrowsKeyword1");	
	}
	
	public void test6(){
		try{
			throw new IOException("I am try catch of ThrowsKeyword1");
		} catch(IOException e){
			System.out.println("i am handled");
		}
		System.out.println("remaining code");
	}
	
	public static void main(String[] args) throws IOException {
		
		ThrowsKeyword1 obj = new ThrowsKeyword1();
//		 obj.test6();
          obj.test5();  // test5 have exception and it's not handled so we have to declare exception with main method.
	}

}
