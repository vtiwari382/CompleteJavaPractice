package AbstractClass;

public abstract class AbstractExample1 {

	public void test1(){
		System.out.println("i am from test1");
	}
	
	public void OpenAccount(){   // Open account process is same for all bank, so define it here and call it directly in other class
		System.out.println("please collect form");
	}
	
	public abstract void rateOfInterest();  //rate of interest is different for all bank,so make it abstract and define in class where it needs.
	
	public static void main(String[] args) {
		
		
	}

}
