package HashSet;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetTest_3 {

	public static void main(String[] args) {
		Set<Object> hash = new HashSet<>();     // to store any type of data use "Object", because it's super class of all
		hash.add(7);
		hash.add(9);
		hash.add("test");
		hash.add(8);
		hash.add(false);
		hash.add(null);
		
		System.out.println("Output of hash set is::" +hash);
		
		
		Set<Object> linked=new LinkedHashSet<>();    // to store any type of data use "Object", because it's super class of all
		linked.add(7);
		linked.add(9);
		linked.add("test");
		linked.add(8);
		linked.add(false);
		linked.add(null);
		
		System.out.println("Output of Linked hash set is::" +linked);
		
		
		
		TreeSet<Object> tree = new TreeSet<>();           // to store any type of data use "Object", because it's super class of all
		tree.add(7);
		tree.add(9);
//		tree.add("test");  // we can't store the String type data in "Tree Hash Set",to use String data write "String" in place of Object
		tree.add(8);
//		tree.add(false);   // we can't store the Boolean type data in "Tree Hash Set",to use Boolean data write "Boolean" in place of Object
//		tree.add(null);
		
		System.out.println("Output of Tree hash set is::" +tree);

	}

}

/*
Note:0. Hash Set Not stores the duplicate data
	1. Hash Set not maintain the insertion order.
	2. Hash set can store the Null data.
	
	3. Linked Hash Set maintains the insertion order.
	4. Linked Hash set can store the Null data.
	
	5. Tree Set maintains the data in ascending order.
	6. Tree set can not store the Null data.
	
	
*/