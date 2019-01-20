package AbstractClass;

public class AbstractClass1 extends AbstractClass{
	

	@Override
	public void test2() {
		System.out.println("i am test2 method of AbstractClass1");
		
	}

	@Override
	public void test3() {
		System.out.println("i am test3 method of AbstractClass1");
		
	}
	
	public void test1(){       // this is concrete method means normal method
		System.out.println("i am test1 method of AbstractClass1");
	}
	
	public static void main(String[] args) {
       
		AbstractClass1 obj = new AbstractClass1();
		obj.test1();
		obj.test2();
		System.out.println(obj.a);

	}

	
	

}
