package InnerClass;

public class InnerClass2 {   // this is the outer class
	
	int a = 800;

	public void test2(){    // this is outer class method
		System.out.println("i am from outer class");
	}
	
	class Inner{    // this is inner class
	
		public void test1(){    // this is the method of inner class
			System.out.println("i am from inner classs");
		
			test2(); // we can access the method of outer class directly, which is possible only in inner class.
			
		}
		
		public void ShowData(){   // creating 2nd method of Inner class
			System.out.println(a);
		}
	}
	
	public static void main(String[] args) {
		
		InnerClass2 obj = new InnerClass2();  // first make the object of outer class to call the inner class or inner class method
		InnerClass2.Inner obj1 = obj.new Inner();   // then make the object of inner class and call the method
		obj1.test1();
		obj1.ShowData();
		
		

	}

}
