package AccessModifier;

public class TestAccessModifiers2 extends TestAccessModifiers1{

	public static void main(String[] args) {
		
		TestAccessModifiers2 obj = new TestAccessModifiers2(); // or TestAccessModifiers1 obj = new TestAccessModifiers1();
		obj.test1();
		obj.test2();
		obj.test4();
  //    Note: test3 is private so it's not accessible in this class using obj.test3();
	}

}
