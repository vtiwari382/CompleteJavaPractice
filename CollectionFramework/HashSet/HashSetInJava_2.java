package HashSet;

import java.util.HashSet;

public class HashSetInJava_2 {

	public static void main(String[] args) {
		HashSet<Integer> hashSet2 = new HashSet<Integer>();
		hashSet2.add(21);
		hashSet2.add(20);
		hashSet2.add(3);
		hashSet2.add(2);
		
		HashSet<Integer> hashSet1 = new HashSet<Integer>();
		hashSet1.add(211);
		hashSet1.add(200);
		hashSet1.add(30);
		hashSet1.add(20);

		
		System.out.println(hashSet2);
		
		//hashSet2.addAll(hashSet1);
		//hashSet2.removeAll(hashSet1);     //Remove all method will remove the matched data of both class. 
		//hashSet2.retainAll(hashSet1);    // this RetainAll method will return the same data of both class.
		//System.out.println(hashSet2.contains(20));   // Contains method will return boolean form if input data is found.
		
		//System.out.println(hashSet2.containsAll(hashSet1));  // ContainsAll method will return boolean form if all data of HashSet1 is found in HashSet2.
		
		System.out.println(hashSet2.size());
		//System.out.println(hashSet2);

	}

}

/*   
Note:0. Hash Set Not stores the duplicate data
1. Hash Set not maintain the insertion order.
2. Hash set can store the Null data.
3. Hash Set does't stores the data in index form.
*/