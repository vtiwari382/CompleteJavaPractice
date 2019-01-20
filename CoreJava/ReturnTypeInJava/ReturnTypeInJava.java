package ReturnTypeInJava;

public class ReturnTypeInJava {

	void test1() {
		System.out.println("i have void return type");

	}

	int test2(int a) {
		System.out.println("i am returning integer type value");
		return a;
	}

	boolean test3() {
		System.out.println("i am returning boolean type value");
		return true;
	}

	ReturnTypeInJava test4() {
		return this;
	}

	char test5() {
		return 'c';
	}

	double test6(int a, int b) {
		return a+b;
	}

	public static void main(String[] args) {

		ReturnTypeInJava obj = new ReturnTypeInJava();
		obj.test1();
		obj.test2(7);   // or int c = obj.test2(7);             note: store the value in their return type data types (integer)
		obj.test3();    // or boolean d = obj.test3();          note: store the value in their return type data types (boolean)
		obj.test6(5, 6);
	}

}
