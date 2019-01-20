package LinkedList;

import java.util.LinkedList;
import java.util.List;

public class LinkedListInJava3 {

	public static void main(String[] args) {
		List<String> linkedList = new LinkedList<String>();
		linkedList.add("50");
		linkedList.add("50");
		linkedList.add("Test");
		linkedList.add("100");
		linkedList.add("true");
		linkedList.add("50");
		System.out.println(linkedList);
		//linkedList.clear();               // clear method will remove all the data from the linked list
		System.out.println(linkedList);
		
		System.out.println(linkedList.isEmpty());    // this Empty method will return boolean if no data is found in linked list.
		
		LinkedList<String> linkedList1 = new LinkedList<String>();
		linkedList1.add("50");
		linkedList1.add("50");
		linkedList1.add("Test");
		linkedList1.add("100");
		linkedList1.add("true");
		linkedList1.add(null);
		
		System.out.println(linkedList1);
	}

}
