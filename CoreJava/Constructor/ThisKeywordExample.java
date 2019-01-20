package Constructor;

public class ThisKeywordExample {
	int a;
	int b;
	int c;
	static int d;

	ThisKeywordExample(){
		System.out.println("i am default constructor");
	}
	
	
	ThisKeywordExample(int a, int b){
		this();        // this keyword will call default constructor having no argument
		this.a = a;
		this.b = b;
		System.out.println("i am Parametrized constructor with 2 argument");
	}
	
    ThisKeywordExample(int a, int b, int c){
		this(a,b);    // this keyword will call constructor having two argument...(we can write any integer value also)
		this.c = c;
		System.out.println("i am Parametrized constructor with 3 argument");
	}
	
	void display(){
		System.out.println("value of a, b, c is :" +a+ "," +b+ "," +c);
		
	}
	public static void main(String[] args) {
		
		ThisKeywordExample obj = new ThisKeywordExample(2,3,4);
		obj.display();

	}

}
