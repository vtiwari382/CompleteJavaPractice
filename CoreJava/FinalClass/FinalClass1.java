package FinalClass;

public class FinalClass1 extends FinalClass{
  
	/*
	// final method can't be override
	void add(){
	System.out.println("i am Add method of child class");
	}
	*/
	void add2(){    // same name method is in parent class but it will not throw error as it's not defined final class and we can override that method.
		System.out.println("i am add2 method of FinalClass1 class");
	}
	
	public static void main(String[] args) {
		
		FinalClass1 obj = new FinalClass1();   // "finalclass1 obj is reference class" and "new finalCLass1 is Object making class".
		obj.add2();    // this will call Add2 method of child class because we have make the reference of child class.
		obj.add();
	}

}

/*
// Note: if we make reference of parent class and make the object of child class then we call any method using reference variable
  then first it will check in child class if it's not found then it will check in parent class
  e.g (reference of parent class) FinalClass obj = new FinalClass1(); (object of child class)
  
  */