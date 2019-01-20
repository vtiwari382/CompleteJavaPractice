package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		
		List<Integer> array = new ArrayList<Integer>();   // this will store integer type value only
		array.add(4);
//		array.add(true);
//		array.add("Vivek");
		
		List array2 = new ArrayList<>();    // this will store any value
		array2.add(4);
		array2.add(true);
		array2.add("test");
		array2.add("test3");
		
		List<String> array3 = new ArrayList<String>();  // this will store String type values
		array3.add("test");
		array3.add("test");
		array3.add("test1");
		array3.add("test2");
		array3.add("test3");
		array3.add("test");
		array3.add(null);
		System.out.println(array3);  
		
		System.out.println(array3.size());   // to print the size of array
		
		array3.retainAll(array2);  // it will retain common name of Array2 and Array3  (test,test3)
		System.out.println(array3);
		

	}

}
/*
Note: 1. ArrayList maintains the Insertion Order.
2. It can stores the duplicate value also.
3. It extends the List Interface.
4. ArrayList can store the Null data.

*/