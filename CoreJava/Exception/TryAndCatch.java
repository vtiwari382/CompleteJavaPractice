package Exception;

public class TryAndCatch {

	//try block must be follow by either catch block or finally block
	// try block is use for the code that might throw an exception
	
	public void syntex(){
		try{
			
		} catch(Exception e){
			
		}
	}
	
	// catch block is use to handle the exception. it must be used after the try block only
	// we can use multiple catch block with a single try.
	
	public void airthmeticException(){
		int b = 9/0;
	}
	
	/*
	how to handle exception
	*/
	public void airthmeticExceptionHandling(){
		try{
			int b = 9/0;
		} catch(Exception e){
			System.out.println("code is running fine");
			e.printStackTrace();
		}
		System.out.println("This is benifit of handling Exception");
	}
	
	/*
	Example of Multiple catch
	*/
	public void multipleCatchBlock(){
		try{
			int a[] = new int[5];   // here int[5] define the size of array is 5 (0,1,2,3,4) but a[5] stores the value at index 5 which is not available, this will throw ArrayIndexOutOfBoundException
			a[5] = 30/0;           // we can't divide 30 by 0, so in this case arithmetic exception will occur.
		} catch(ArithmeticException e){
			System.out.println("getting Airthmetic Exception");
		} catch(ArrayIndexOutOfBoundsException e){
			System.out.println("getting Array Index out of Bound Exception");
		} catch(Exception e){
			System.out.println("we are done");
			e.printStackTrace();
		}
		System.out.println("rest of the code");
	}
	
	public void multipleCatchBlock_1(){
		try{
			int a[] = new int[5];
			a[5] = 30/0; // this line ArrayIndexOutOfBound Exception will come, coz a[5] stores the data 
			}
		catch(Exception e){    // after using this super class exception we can't declare any other exception type it will give error
			System.out.println("we are done");
			}
		System.out.println("rest of the code");
		}
	
	/*
	Example of multiple Catch block 
	*/
	
	public void multipleCatchBlock_2(){
		try{
			int a[] = new int[5];
			a[5] = 30/0;
			}
		catch(ArithmeticException e){
			System.out.println("Getting Arithmetic Exception");
			}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Getting ArrayIndexOutOfBoundsException ");
		}
		System.out.println("rest of the code");
		}
	
	
	/*
	Example of multiple Catch block 
	*/
	
	public void multipleCatchBlock_3(){
		try{  // this try use to handle the external exception using "Arithmetic Exception and ArrayIndexOutOfBound Exception
		try{  // this try use to handle the internal exception using super class of exception e.g "Exception e"
			int a[] = new int[5];
			a[5] = 30/0;
			}catch(Exception e){
		System.out.println("i am from inner try catch");		
			}
		}
		
		catch(ArithmeticException e){
			System.out.println("Getting Arithmetic Exception");
			}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Getting ArrayIndexOutOfBoundsException ");
		}
		System.out.println("rest of the code");
		}
	
	/*
	Example of multiple Catch block 
	*/
	
	public void multipleCatchBlock_4(){
		try{  // this try use to handle the external exception using "Arithmetic Exception and ArrayIndexOutOfBound Exception
		try{  // this try use to handle the internal exception using super class of exception e.g "Exception e"
			int a[] = new int[5];
			a[5] = 30/0;
			}catch(Exception e){
		System.out.println("i am from inner try catch");
		throw new ArithmeticException("i am inner Arithmetic Exception"); // here we forcefully throwing Arithmetic exception and after executing this line compiler will move to Arithmetic typer exception
			}
		}
		
		catch(ArithmeticException e){
			System.out.println("Getting Arithmetic Exception");
			}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Getting ArrayIndexOutOfBoundsException ");
		}
		System.out.println("rest of the code");
		}
	
	/*
	 Nested Try Example
	*/
	
	public static void nestedTryBlock(){
		try{
			try{
				System.out.println("Going to divide");
				int b = 39/0;
			}catch(ArithmeticException e){
				System.out.println(e);
			}
			try{
				int a[] = new int[5];
				a[5] = 4;
			}catch(ArrayIndexOutOfBoundsException e){
				System.out.println(e);
			}
			System.out.println("other statement");
		}catch(Exception e){
			System.out.println("Handled");
		}
		System.out.println("normal flow");
	}
	
	
	
	public static void main(String[] args) {
		

	}

}
