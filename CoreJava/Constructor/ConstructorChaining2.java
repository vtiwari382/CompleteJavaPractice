package Constructor;

public class ConstructorChaining2 extends ConstructorChaining1 {

	ConstructorChaining2() {
		super(5); // 3. super keyword holding the integer type value, so it will call integer constructor of parent class
		System.out.println("I am default constructor of Child class");

	}

	ConstructorChaining2(int a, int b) {
		this(); // 2. this keyword have no value so it will call default constructor
		System.out.println("i am double int Prametrized constructor of child class");
	}

	ConstructorChaining2(int a) {
		this(4, 5); // 2. this keyword have two integer value so it will call constructor having two
					// integer in arguement.
		System.out.println("i am single int Prametrized constructor of child class");
	}

	public static void main(String[] args) {

		ConstructorChaining2 obj = new ConstructorChaining2(5); // 1. this will call the parameterized constructor

	}

}
/*
 Note:
  1. super is used to call the constructor of another/parent class
  2. this keyword is used to call the constructor/variable of same class
  3. Default constructor will run automatically with the class, either we call that or not.
 Most Imp: when you have parameterized constructor in parent class then it's mandatory to invoke that constructor in child class using "Super" keyword
 No need to invoke default constructor of parent class in child class, as child class by default automatically call default constructor.
*/