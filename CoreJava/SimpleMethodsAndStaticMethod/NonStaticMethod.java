package SimpleMethodsAndStaticMethod;

public class NonStaticMethod {

	void Method1(){                                            //Non-Static Method
		System.out.println("my name is vivek");
		
	}
	
	void Method2(){                                           //Non-Static Method
		System.out.println("i am software engineer");
		
	}
	public static void main(String[] args) {
		
		NonStaticMethod obj = new NonStaticMethod();
		obj.Method1();                                        // Non-Static Method can be call by Object
		obj.Method2();
		StaticMethod.Method3();                             // Static Method of another class can be call by their class name
		StaticMethod.Method4();
	}

}
