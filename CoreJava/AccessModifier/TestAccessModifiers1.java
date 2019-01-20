package AccessModifier;

public class TestAccessModifiers1 {
	
	public int a;
	int b;
	private int c;
	protected int d;

	public void test1(){   // public type access modifier can be access from any class and any package using inheritance.
		System.out.println("i have public access");
	}
	
	void test2(){    //default type access modifier can be access from any class and within same package using inheritance.
		System.out.println("i have default access");
	}
	
	private void test3(){  // private type access modifier can be only access within the class, it can't access from other/same package,
		System.out.println("i have private access");
	}
	
	protected void test4(){ // protected type access modifier can be access from any class and from diff. package using inheritance
		System.out.println("i have protected access");
	}
	public static void main(String[] args) {
		TestAccessModifiers1 obj = new TestAccessModifiers1();
		obj.test1();
		obj.test2();
		obj.test3();
		obj.test4();

	}

}
