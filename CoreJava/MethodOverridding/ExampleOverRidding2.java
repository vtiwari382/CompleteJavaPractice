package MethodOverridding;

public class ExampleOverRidding2 extends ExampleOverRidding1 {

	public void sum(int a, int b){
		int c = a+b;
		System.out.println("sum is from Child class with 2 Argument:-" +c);
	}
	
	public void sum(int a, int b, int c){
		int d = a+b+c;
		System.out.println("sum is from Child class with 3 argument:-" +d);
	}
	
	void test4(){
		System.out.println("i am from child class with default argument");
	}
	public static void main(String[] args) {
	
		ExampleOverRidding1 obj = new ExampleOverRidding1(); // making reference of parent class(e.g ExampleOverRidding1 Obj), so we can access only parent class methods
 		obj.sum(4, 5);   // we can access only parent class methods not child class method, as we have created parent class object.
		obj.sum(4, 5, 6); 
		obj.multiply(5, 6);

		
		ExampleOverRidding2 obj1 = new ExampleOverRidding2(); //// making reference of Child class(e.g ExampleOverRidding2 Obj)
		obj1.sum(5, 5);
		obj1.sum(5, 6, 7);
		obj1.multiply(4, 5);
		obj1.test4();
		
		
	}

}

//Note:  for method overridding both child class and parent class method return type, method name and method argument should be same
