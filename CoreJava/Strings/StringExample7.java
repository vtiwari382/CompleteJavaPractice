package Strings;

public class StringExample7 {

	public static void main(String[] args) {
		
		String s1 = "vivek";
		
		// CharAt, it has character return type
		
		System.out.println(s1.charAt(3)); // it will return the character at 3rd position
		System.out.println(s1.charAt(0)); // it will return the character at 0 position
		System.out.println("------------------");
		
		//Contains has boolean return type
		
		System.out.println(s1.contains("v")); // true will come , as in string "v" is available
		System.out.println(s1.contains("ek")); // true will come, as in string "ek" is available in series without gap.
		System.out.println(s1.contains("ke"));// false will come, as in string "ke" not available in series.
		System.out.println("--------------");
		
		// Concat use to add the two string
		
		System.out.println(s1.concat(" tiwari"));
		System.out.println(s1.concat(" tester"));
		System.out.println("-------------------");
		
		// Split return type is array of String, it will return value in index 0,1,2,3 etc 
		String s2 = "vivek tiwari tester";
		String[] Split = s2.split(" ");
		System.out.println(Split[0]);
		System.out.println(Split[1]);
		System.out.println(Split[2]);
		System.out.println("--------------------");
		
		String s3 = "vivek tiwari tester";
		String[] Split1 = s3.split(" tiwari "); // in this case string before "tiwari" and after "tiwari" will print e.g vivek & tester
		System.out.println(Split1[0]); // vivek will print
		System.out.println(Split1[1]); // tester will print
		//System.out.println(Split1[2]); // if you use this statement then error will come, as we have only 2 array to print

	}

}
