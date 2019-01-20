package InnerClass;

public class LocalInnerClass { // outer class

	private int data = 80;
	
	void display(){      // outer method
		class Local{     // this is local Inner class. (Class within a method is call Local inner class)
			void message(){     // inner method
				System.out.println(data);
			}
		}
		Local l = new Local();   //creating the method of local inner class
		l.message();  // calling the local method
	}
	
	
	public static void main(String[] args) {
		
		LocalInnerClass obj = new LocalInnerClass();    // creating the object of outer class	
		obj.display();

	}

}
