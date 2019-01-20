package Strings;

public class StringExample3 {

	public static void main(String[] args) {
		
	 String  s = "vivek";    //Case1:
	 s = s.concat("tiwari"); // this step will save the "vivek tiwari" in S reference and in memory,which was previously holding only "vivek"
	 System.out.println(s);
	 
	 String  s1 = "vivek";      // Case2:
	 s1.concat("tiwari"); // this step create the new object in memory for "tiwari", it will not save the vivek tiwari for s1 in memory 
	 System.out.println(s1);
	 
	 String  s2 = "Test";       // Case3:
	 s2 = s2.concat("method");
	 System.out.println(s2);

	}

}


/*//in this case tiwari will not print with vivek as we are not storing "tiwari" in new reference of s1 (like case:1)
  
*/