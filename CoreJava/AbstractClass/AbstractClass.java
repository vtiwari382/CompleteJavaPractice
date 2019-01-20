package AbstractClass;

public abstract class AbstractClass {
/*
	1. A class that is declared with Abstract keyword is known as abstract class in java.
	2. it can have abstract and non-abstract method (method with body and without body).
	3. it can't be instantiated.
	4. A method that is declared as abstract and does not have implementation is known as abstract method.
	5. in java you can't create an instance of the abstract class using new keyword, its compiler error. though abstraction class 
	   can have a constructor.
	6. abstract is keyword in java, which can be used with both class and method. 
	7. A class automatically becomes abstract class when any of it's method declared as abstract.
	8. Abstract method does't have method body.
	9. In java, a variable can not be made abstract, it's only class or method which would be abstract.
	10.If a class extends an abstract class or interface it has to provide implementation to all it's abstract method to be a 
	    concrete class. 
	    
	
*/
	
	int a = 10;
	public void test1(){       // this is concrete method means normal method
		System.out.println("i am test1");
	}
	
	public abstract void test2();  // abstract method
	
	public abstract void test3();
	
	public static void main(String[] args) {
		

	}

}
