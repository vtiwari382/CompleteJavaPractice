package Interface;

public interface InterfaceExample1 {

	int i = 20;
	int j = 10;
	
	void test1();    // we can't make un-implemented method as static. e.g static test1()
	void test2();
	void test3();
/*	void test4() {
		
	}*/
	void test5();
}


/*
 Note:
  1. interface is mechanism by which we can achieve 100% abstraction, means method has no body e.g "void test1".
  2. interface has static constants and abstract methods only.
  3. interface members are by default public. (variable and Method)
  4. interface variables are by default public/static/final, e.g public Static final int a = 10;
  5. interface support multiple inheritance.   (we can call method of two different class into one class using interface)
  6. when any other class implements interface class, it has to implement all methods of interface.
  7. We can't create object of interface. e.g interface obj = new interface(), coz interface not allow to
      implement method body so making object is useless it can't perform any action.
  
  
  
  
  
  
  
  
  */