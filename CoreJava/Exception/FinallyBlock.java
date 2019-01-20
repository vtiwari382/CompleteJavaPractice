package Exception;

public class FinallyBlock {

	public static void testFinallyBlock(){
		try{
			
		}catch(Exception e){
			
		} finally {    // finally block always execute either their is exception or not.
			System.out.println("i am from finally block testFinallyBlock");		
		}
	}
	
	public static void testFinallyBlock1(){
		try{
			int a = 9/0;
		} finally{   // finally block always execute either their is exception or not.
			System.out.println("i am from finally block testFinallyBlock1");
		}
	}
	
	public static void testFinallyBlock2(){
		try{
			int data = 25/0;    // this line will get Arithmatic Exception as 25/0 is not possible
			System.out.println(data);  // because of upper line exception, this line will not execute.
		} catch(NullPointerException e){
			System.out.println(e);
		} finally {       // finally block always execute either their is exception or not.
			System.out.println("finally block always executed testFinallyBlock2");
		}
		System.out.println("rest of the code....");
		
	}
	
	
	public static void main(String[] args) {
		FinallyBlock.testFinallyBlock();
		FinallyBlock.testFinallyBlock1();
		FinallyBlock.testFinallyBlock2();

	}

}
