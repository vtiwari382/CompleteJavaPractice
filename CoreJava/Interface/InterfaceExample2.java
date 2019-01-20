package Interface;

public class InterfaceExample2 implements InterfaceExample1, InterfaceExample3 {

	@Override // this the method of Interface Example 1 class
	public void test1() {
		// TODO Auto-generated method stub

	}

	@Override // this the method of Interface Example 1 class
	public void test2() {
		// TODO Auto-generated method stub

	}

	@Override // this the method of Interface Example 1 class
	public void test3() {
		// TODO Auto-generated method stub

	}

	@Override // this the method of Interface Example 1 class
	public void test5() {
		// TODO Auto-generated method stub

	}

	@Override // this the method of Interface Example 3 class
	public void test4() {
		// TODO Auto-generated method stub

	}

	@Override // this the method of Interface Example 3 class
	public void test6() {
		// TODO Auto-generated method stub

	}

	@Override // this the method of Interface Example 3 class
	public void test7() {
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) {

           // InterfaceExample1 obj = new InterfaceExample1();  // we can't create referance of interface class
		
	}

}


// Note: we can't extend interface parent class, we can call them by implements'.
// ALL methods in interface must be call in child class otherwise it will show error.