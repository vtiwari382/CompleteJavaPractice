package Constructor;

public class ConstructorExample {
  
	int a;                                         // these are global variable
    int b;
    int c; 
  
  
	ConstructorExample()
	{
	
		System.out.println("i am default constructor");
	}
	
	ConstructorExample(int a)                            //int a is local variable
	{
	this.a =a;
	
		System.out.println("i am integer constructor with 1 argument");
	}
	
	ConstructorExample(String a)                           //String a is local variable
	{
	
		System.out.println("i am String constructor with 1 argument");
	}
	
	ConstructorExample(int a, int b, int c)
	{
	this.a=a;
	this.b=b;
	this.c=c;
		System.out.println("i am parameterized constructor with 3 argument");
	}
	
	void display()
	{
	   System.out.println("value of a, b, c is: " + a + "," + b + "," + c );	
	}
	
	
	
	public static void main(String[] args) {
		
		ConstructorExample obj = new ConstructorExample();
		ConstructorExample obj1 = new ConstructorExample(5);
		ConstructorExample obj2 = new ConstructorExample("vivek tiwari");
		ConstructorExample obj3 = new ConstructorExample(2, 3, 4);
		obj3.display();
        
	}

}
