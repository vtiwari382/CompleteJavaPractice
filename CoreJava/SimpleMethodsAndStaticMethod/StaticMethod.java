package SimpleMethodsAndStaticMethod;

public class StaticMethod {

	static void Method3(){                                        // Static Method
		System.out.println("i live in indirapuram");
		
	}
	
    static void Method4(){                                       // Static Method
		System.out.println("i love to play cricket");
		
	}
	
	public static void main(String[] args) {
		
		StaticMethod.Method3();                                  //Static Method can be only call by class name
		StaticMethod.Method4();
		
	}

}
