package TreeMap;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapJava {

	public static void main(String[] args) {
		
		TreeMap<String, String> tree = new TreeMap<String, String>();
		tree.put("1", "Test1");
		tree.put("2", "Test2");
		tree.put("3", "Test3");
		tree.put("4", "Test4");
		tree.put("5", "Test5");
		tree.put("1", "Test5");
		
		System.out.println(tree);
		
		 Set<Entry<String, String>> en = tree.entrySet();
		 Iterator<Entry<String, String>> itr = en.iterator();
		while(itr.hasNext()) {
			System.out.println("Value of key are::" +itr.next().getValue());
		}
		
		for(Entry<String,String> en1:tree.entrySet()){
			System.out.println("result of key and value pair is " +en1.getKey()+ " & " +en1.getValue());
			
		}

	}

}

/*
Note:
1. A tree map contains values based on the key.
2. it contains only unique elements.
3. it can't have null key but have multiple null values.
4. it's same as hash map but it's maintaining insertion order in ascending order liked "Linked HashMap".
	
*/