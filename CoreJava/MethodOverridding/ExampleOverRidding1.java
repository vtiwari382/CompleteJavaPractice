package MethodOverridding;

public class ExampleOverRidding1 {

	public void sum(int a, int b){
		int c = a+b;
		System.out.println("sum is from parent class with 2 Argument:-" +c);
	}
	
	public void sum(int a, int b, int c){
		int d = a+b+c;
		System.out.println("sum is from parent class with 3 argument:-" +d);
	}
	
	public void multiply(int a, int b){
		int c = a*b;
		System.out.println("Muliply is from parent class with 2 arguement:-" +c);
	}
	
	public static void main(String[] args) {
		

	}

}

// Note: Method overriding have same method name with same arguement type in parent and child class.