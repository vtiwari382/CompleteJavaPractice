package Polymorphism;

public class PolymorphismTest {
	
	

	public static void main(String[] args) {
		
	// Static polymorphism OR compile-time Polymorphism 	
		Honda obj = new Honda();
		obj.color();
		obj.Model();
		obj.Start();
		obj.Gear();
		obj.Stop();
		
	   System.out.println("*********************");
	   
	   Bike obj1 = new Bike();
	   obj1.Gear();
	   obj1.Start();
	   obj1.Stop();
	   
		
	   System.out.println("********Printing the RUntime Polymorphism*************");
	 
// Dynamic Polymorphism OR RunTime Polymorphism. (here we are doing TOP CASTING)	   
	  Bike obj2 = new Honda(); // child class object can be reffered by parent class reference object called Dynamic Polymorphism.
	  obj2.Start();
	  obj2.Stop();
	  obj2.Gear();
	  
	
	  
	// down casting	  
	Honda obj3 = (Honda) new Bike();    // class cast exception occur at runtime, coz down casting is not allowed.

	}

}

/*Note:
	1. In Dynamic/runtime time Polymorphism you can access only common method and methods which are available in parent class.
	2. For Dynamic/runtime time Polymorphism you have to create the parent class reference object for child class.
	3. In Static/compiletime Polymorphism you can call the methods of parent and child class by creating object of child class. (if child extends parents class)
	4. in static/compiletime polymorphism if child and parent class have same method then you can call by parent class method by creating parent class object.
	*/