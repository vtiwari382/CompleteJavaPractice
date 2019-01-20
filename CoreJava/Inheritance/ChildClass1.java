package Inheritance;

public class ChildClass1 extends ParentClass1 {

	int k = 90;
	static int m = 70;
	
	void test4(){
		System.out.println("i am from child class test4");
	}
	
	static void test5(){
		System.out.println("i am from child class test5");
	}
	
	public static void main(String[] args) {
		ChildClass1 obj = new ChildClass1();
		obj.test1();
		obj.test2();
		test3();       // test3 is static and static are class member so we can call them directly without using object
		obj.test4();
		test5();
		
		System.out.println(obj.a);  // non static member can only be call by object
		System.out.println(obj.b);  // non static member can only be call by object
		System.out.println(c);     // c is static member and static are class member so we can call them directly without using object
		System.out.println(d);      // d is static type and static are class member so we can call them directly without using object
		System.out.println(obj.k);  // non static member can only be call by object
		System.out.println(m);      // m is static type and static are class member so we can call them directly without using object  

	}

}
