package Strings;

public class StringExample8 {

	public static void main(String[] args) {
		String s1 = "vivek";
		String s2 = "VIVEK";
		String s3 = "    vivek        ";
		
		System.out.println(s1.toLowerCase());
		System.out.println(s2.toLowerCase());
		System.out.println(s1.toUpperCase());
		
		System.out.println("------------------");
		
    System.out.println(s3.trim());  //Trim() will remove the space from string either in starting or in end but not in between string
		

	}

}
