package Interface;

public class TestInterfaceExample3 implements TestInterfaceExample1, TestInterfaceExample2   {

	@Override
	public void subtract() {
		System.out.println("subtraction of j and i is: " +(j-i));
		
	}

	@Override
	public void sum() {
		System.out.println("addition of j and i is: " +(j+i));
		
	}

	@Override
	public void multiply() {
		System.out.println("multiplication of j and i: " +(j*i));
		
	}
	
public static void main(String[] args) {
		
	TestInterfaceExample3 obj = new TestInterfaceExample3();
	
	obj.subtract();
	obj.sum();
	obj.multiply();
	
	System.out.println("----------------------");
	
	System.out.println(TestInterfaceExample1.i);  // we can directly call variable by class name.
	System.out.println(TestInterfaceExample1.j);
	System.out.println(TestInterfaceExample2.k);
		

	}

}
