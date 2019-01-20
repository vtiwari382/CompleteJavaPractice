package MethodOverloading;

public class MethodOverloading2 {

	public void add(int p, int m){     
		System.out.println("i am method with integer type argument");
		System.out.println(p+m);
	}
	
	public void add(double p, double m){
		System.out.println("i am method with double type argument");
		System.out.println(p+m);
	}
	
	public void add(float p, float m){               // "void" means no return type
		System.out.println("i am methoad with float type argument");
		System.out.println(p+m);
	}
	
	public float add(int i, long p){          // using "float" in place of void means having float type return, as float is greater than long
		System.out.println("i am from method with integer and long type argument");
		return p;
	}
	
	public boolean add(boolean a, boolean b){     // "boolean returns " either true or false
		System.out.println("i am from method where return type is boolean");
	   return true;
	}
	
	public static void main(String[] args) {
		MethodOverloading2 obj = new MethodOverloading2();
		obj.add(20.98, 50.20);
		obj.add(20, 50);
		obj.add(20f, 50f);
		obj.add(20, 50L);
		obj.add(false, true);

	}

}

//Note: we can not overload the method by changing return type, method can be over load by changing arguement
