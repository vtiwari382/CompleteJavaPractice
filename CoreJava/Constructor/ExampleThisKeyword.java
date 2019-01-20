package Constructor;

public class ExampleThisKeyword {

	int a;
	int b;

	void test1(int a, int b){
		this.a = a;
		this.b= b;
	
	}
	
	void test2(int p, int h){
		this.a = p;
		this.b= h;
	
	}
	void display(){
		
		System.out.println("sum of a,b is :: " +(a+b));
	}
	public static void main(String[] args) {
		
		ExampleThisKeyword obj = new ExampleThisKeyword();
		obj.test1(4,5);
		obj.display();

	}

}
