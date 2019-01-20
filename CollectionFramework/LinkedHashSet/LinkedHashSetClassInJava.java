package LinkedHashSet;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetClassInJava {

	public static void main(String[] args) {
		HashSet<Integer> hashSet1 = new HashSet<Integer>();
		hashSet1.add(211);
		hashSet1.add(200);
		hashSet1.add(30);
		hashSet1.add(20000);
		hashSet1.add(20000);
		hashSet1.add(20000);
		hashSet1.add(20000);
		System.out.println(hashSet1);
/*
Note:0. Hash Set Not stores the duplicate data
1. Hash Set not maintain the insertion order.
2. Hash Set does't stores the data in index form. 		
		*/
		
		LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<Integer>();
		linkedHashSet.add(211);
		linkedHashSet.add(200);
		linkedHashSet.add(30);
		linkedHashSet.add(20000);
		linkedHashSet.add(20000);
		linkedHashSet.add(20000);
		System.out.println(linkedHashSet);
		
		Set<Integer> linkedHashSet1 = new LinkedHashSet<Integer>();
		linkedHashSet1.add(211);
		linkedHashSet1.add(200);
		linkedHashSet1.add(30);
		linkedHashSet1.add(20000);
		linkedHashSet1.add(20000);
		linkedHashSet1.add(20000);
		
		System.out.println(linkedHashSet1);

	}

}

/*
Note: Hash Set Not stores the duplicate data
1. LinkedHash Set maintain the insertion order.
2. LinkedHash set not stores the duplicate data.
3. Linked hashSet can store the NULL data.
		
		*/
