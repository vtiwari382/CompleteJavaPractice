package Inheritance;

public class ChildClass extends ParentClass{

	int c;
	
	void test3(){
		System.out.println("i am test method of child class");
	}
	public static void main(String[] args) {
		
		ChildClass obj = new ChildClass();
		
		obj.test1();
		obj.test2();
		obj.test3();
		
		System.out.println(obj.a);   // taking the value of A from parent class
		System.out.println(obj.b);   // taking the value of b from parent class
        System.out.println(obj.c);   // printing default value of C.
		
	}

}

/*
//Note: 1. One class extends another class.. (like in case of Inheritance)
        2. one class implements Interface class. (if we make one class interface and other class normal class)
        3. two different types of class implements each other and two same type of class extends each other. (Very IMPORTANT)
 *
 **/
 