package ClassAndObject;

public class StaticClassAndObject {

	static int a = 10;                                        // this is static variable
	String b = " My Name is Vivek";
	
	public static void main(String[] args) {
		
		StaticClassAndObject obj = new StaticClassAndObject();
		System.out.println(obj.b);                               // simple variable can be call only by Object
        System.out.println(StaticClassAndObject.a);             // static variable can be also call with className without creating object
	}

}
