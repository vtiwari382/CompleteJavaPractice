package HashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {

	public static void main(String[] args) {
	Map<Integer, String> hashMap = new HashMap<Integer, String>();     
	hashMap.put(1, "Test1");
	hashMap.put(2, "Test2");
	hashMap.put(3, "Test3");
	hashMap.put(4, "Test3");
	hashMap.put(null, "Test4");
	hashMap.put(1, "Test5");
	
	System.out.println(hashMap.get(2));
	
	System.out.println(hashMap);
	
	
	}

}

/*
Note: 1. hashMap stores the data in key and value format.
2. In hashmap key can't be duplicate but values can be.
3. Hashmap returns the latest key value if it's found 2 values have same key.
4. Hash Map not maintains the insertion order while storing the data. e.g while printing the data it will not show them in order they were inserted.
5. HashMap is class and Map is interface.
6. It can store the Null key also.
7. HashMap not maintains the insertion order.
*/