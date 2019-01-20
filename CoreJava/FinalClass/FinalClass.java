package FinalClass;

 public class FinalClass {    // if class name is final it can't extend by other class  "public final class FinalClass"

// final class can't be extended by any other class, it means that the class structure can't be modified by any external.
// making a class, method or variable final in java helps to improve performance because jvm gets an opportunity to make assumption and optimization.
// All Variable declared inside java interface are implicitly final.
// As per java code convention final variables are treated as constant.
// so many java standard library classes are final, such as "java.lang.system" and "java.lang.String" 
	
	final void add(){
		System.out.println("i am add method of final class");
	}
	
	void add2(){
		System.out.println("i am add2 method of parent class");
	}
	
	public static void main(String[] args) {
		

	}

}
