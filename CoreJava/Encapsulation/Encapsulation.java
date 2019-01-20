package Encapsulation;

public class Encapsulation {
	// for encapsulation you must have private data variable
	private int age;
	private String name;
	private int number;
	

	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getNumber() {
		return number;
	}


	public void setNumber(int number) {
		this.number = number;
	}


	public static void main(String[] args) {
		Encapsulation test = new Encapsulation();
		test.setAge(29);
		test.setName("vivek");
		test.setNumber(955527589);
		
		System.out.println(test.getAge());
		System.out.println(test.getName());
		System.out.println(test.getNumber());

	}

}

/*
Note: 
	1. data variable should be private, so that they can't be accessed from outside the class.
	2. right click and go to source and select getter and setter option.
	3. create the object and call setter and pass the value.
	4. print the getter value now.
	5. setter and getter is used to set and get the values of the field.
*/      
