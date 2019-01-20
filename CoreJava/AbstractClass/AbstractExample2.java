package AbstractClass;

public class AbstractExample2 extends AbstractExample1{

	
	@Override
	public void rateOfInterest() {
	System.out.println("sbi gives 8%");
		
	}

	public static void main(String[] args) {

		AbstractExample2 obj = new AbstractExample2();
		obj.OpenAccount();
		obj.rateOfInterest();

	}

}
