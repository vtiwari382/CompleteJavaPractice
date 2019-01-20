package AbstractClass;

public class AbstractExample3 extends AbstractExample1{

	@Override
	public void rateOfInterest() {
		System.out.println("HDFC gives 10%");
		
	}
	public static void main(String[] args) {
		AbstractExample3 obj = new AbstractExample3();
		obj.OpenAccount();
		obj.rateOfInterest();

	}

	

}
