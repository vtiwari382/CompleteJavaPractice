package LinkedList;

import java.util.LinkedList;
import java.util.List;

public class LinkedListInJava2 {

	public static void main(String[] args) {
		List<String> linkedList = new LinkedList<String>();
		linkedList.add("50");
		linkedList.add("50");
		linkedList.add("Test");
		linkedList.add("100");
		linkedList.add("true");
		linkedList.add("50");
		
		List<String> linkedList1 = new LinkedList<String>();
		linkedList1.add("500");
		linkedList1.add("50");

		System.out.println(linkedList);
		
		//linkedList.addAll(linkedList1);           // AddAll will add all the data of linkedList1 in linkedList
		//linkedList.add(3, "9000");                // this Add method will take Index position and data as input. and add the data at that index
		//linkedList.retainAll(linkedList1);      // it will retain common elements of linkedList and linkedList1 in linkedList.
		//linkedList.removeAll(linkedList1);      // this method will compare (linkedList & linkedList1)  and remove the common data in linkedList
		//System.out.println(linkedList.get(2));  // this get method use index to find data at 2nd position
		//System.out.println(linkedList);
		
		//System.out.println(linkedList.contains("Test"));   // this method will return "boolean" if data is found or not.
		
		//System.out.println(linkedList.contains("Test123"));
		
		//System.out.println(linkedList.containsAll(linkedList1));   // this method will return "boolean" if all data is found or not.
		
		System.out.println(linkedList.size());    // to print the size of array
	}

}
