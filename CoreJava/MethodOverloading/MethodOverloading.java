package MethodOverloading;

public class MethodOverloading {
	int a;
	float b;
	double d;

	void Test1() {
		System.out.println("i am method with no argument");
	}

	void Test1(int a) {

		System.out.println("i am method with one argument");
	}

	void Test1(int a, int b) {

		System.out.println("i am method with two argument");
	}

	void Test1(MethodOverloading a) {
		System.out.println("i am method with class type argument");

	}

	void Test1(MethodOverloading a, MethodOverloading b) {

		System.out.println("i am method with two class type argument");
	}

	void Test1(int a, double d) {

		System.out.println("i am method with two argument having double");
	}

	public static void main(String[] args) {
		MethodOverloading obj = new MethodOverloading();
        obj.Test1();
        obj.Test1(5);
        obj.Test1(obj);
        obj.Test1(obj, obj);
	}

}



// NOte: Method Overloading means Same method but different arguments are supplied.
//Note: we can not overload the method by changing return type, method can be over load by changing arguement
