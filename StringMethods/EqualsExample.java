package StringMethods;

public class EqualsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 String s = "Vivek";
 String s1 = "Tiwari";
 String s2 = "Vivek";
 String s3 = "VIVEK";
 String s4 = new String("VIVEK");
 
 System.out.println(s.equals(s1));
 System.out.println(s.equals(s2));
 System.out.println(s.equals(s3));
 System.out.println(s.equals(s4));
 
 System.out.println("now we are using == operator");
 
 System.out.println(s==s1);
 System.out.println(s==s2);
 System.out.println(s==s3);
 System.out.println(s==s4);
	}

}
