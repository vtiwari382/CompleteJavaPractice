package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample2 {

	public static void main(String[] args) {
			
		List<Object> array = new ArrayList<Object>();    // TO store all type of data use "Object", it's superclass of all class
		array.add(4);
		array.add(4);
		array.add(true);
		array.add(8.9);
		
		System.out.println(array); 
		
		List<Object> array1 = new ArrayList<Object>();    
		array1.add(3);
		array1.add(4);
		array1.add(6);
		array1.add(8);
		
	
//		System.out.println(array.size());   // to print the size of array		
//		array.retainAll(array2);  // it will retain common name of Array and Array1  (e.g 4)
//      System.out.println(array.get(3));    // this get method use index to find data at 3rd position
        System.out.println(array.contains(4));     // this method will return "boolean" if data is found or not.
        System.out.println(array.containsAll(array1));   // this method will return boolean if all data of array1 is present in array or not (true/false)

	}

}
/*
Note: 1. ArrayList maintains the Insertion Order.
2. It can stores the duplicate value also.
3. It extends the List Interface.
4. it will grow automatically when we stores the data
*/