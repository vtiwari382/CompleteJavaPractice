package Constructor;

public class ConstructorChaining1 {

	ConstructorChaining1() {

		System.out.println("I am default constructor of parent class");

	}

	ConstructorChaining1(int a) {
		System.out.println("i am Integer type Prametrized constructor of parent class");
	}

	ConstructorChaining1(String c) {
		System.out.println("i am String type argument constructor of parent class");
	}
}
