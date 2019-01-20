package LinkedHashMap;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class LinkedHashMapTest {

	public static void main(String[] args) {
		Map<String, String> linkedhash = new LinkedHashMap<String, String>();
		
		linkedhash.put("1", "Test1");
		linkedhash.put("2", "Test2");
		linkedhash.put("3", "Test3");
		linkedhash.put("4", "Test4");
		linkedhash.put("5", "Test5");
		
		System.out.println(linkedhash);
		
		
		// To print Either key or values.
	Set<Entry<String,String>> li = linkedhash.entrySet();
	Iterator<Entry<String, String>> itr = li.iterator();
	while(itr.hasNext()) {
		System.out.println("either Key or Value is ::" +itr.next().getKey());
	}
	
	
	// To Print all key and values both at same time.
	
	for( Entry<String, String> e : linkedhash.entrySet()) {
		System.out.println(e.getKey() +"--" +e.getValue());
	}
		

	}

}

/*
Note: the Only Difference between LinkedHashMap and HashMap is:
1.LinkedHAshMAp maintain the insertion order but HashMap Not. e.g while printing the data it will show them in order they were inserted.
*/