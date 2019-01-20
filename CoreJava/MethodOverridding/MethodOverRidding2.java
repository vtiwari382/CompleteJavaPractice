package MethodOverridding;

public class MethodOverRidding2 extends MethodOverRidding1{

	public void test1(){
		
		System.out.println("i am from child class");
	}
	public static void main(String[] args) {
		
		MethodOverRidding2 obj = new MethodOverRidding2();  //1. child class is extending parent class
		obj.test1();   //2. by default java call the method of child class, if parent and child have same method
		
	}

}

// NOte: at run time, method will be called based on the class for which we have created object. e.g we have created object for:=
// 1. e.g new MethodOverRidding2();