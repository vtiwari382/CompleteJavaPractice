package HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapTest1 {

	public static void main(String[] args) {
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		hashMap.put(1, "Test2");
		hashMap.put(2, "Test2");
		hashMap.put(3, "Test3");
		hashMap.put(4, "Test3");
		hashMap.put(null, "Test4");
		
		
		//  below codes are use to get the value of either "Key or Value" stored in Hash Map.
		
		Set<Entry<Integer, String>> entry = hashMap.entrySet();   // entry will store the key and value pair
		Iterator<Entry<Integer, String>> itr = entry.iterator();  // this line will perform iteration over "entry" one by one.
		
		while(itr.hasNext()) {
			
			System.out.println("data of Key and Value are:: " +itr.next().getKey());   // or use itr.next().getValue(); to find Value
			
		}
		
		
		// below codes are user to get the value of "Key and Value" stored in Hash Map.
		
		for(Entry<Integer, String> entry1:hashMap.entrySet()) {
		System.out.println(entry1.getKey()+"--"+entry1.getValue());
			
		}

		
	}

}
