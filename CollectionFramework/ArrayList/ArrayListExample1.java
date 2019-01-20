package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample1 {

	public static void main(String[] args) {
			
		List<Integer> array1 = new ArrayList<Integer>();    
		array1.add(4);
		array1.add(4);
		array1.add(5);
		array1.add(9);
		
		System.out.println(array1); 
		
		List<Integer> array2 = new ArrayList<Integer>();    
		array2.add(4);
		array2.add(40);
		array2.add(50);
		array2.add(9);
		
//		System.out.println(array2);  		
//		System.out.println(array1.size());   // to print the size of array		
//		array1.retainAll(array2);  // it will retain common name of Array2 and Array3  (test,test3)
//		array1.addAll(array2);     // AddAll will add all the data of array2 in array1
//		array1.add(2, 600);       // this Add method will take Index position and data as input. and add the data at that index
		array1.removeAll(array2);  // this method will compare (array1 & array2)  and remove the common data in array1
//		array1.remove(3);    // this line will remove the data at 3rd index
		System.out.println(array1);
		

	}

}
/*
Note: 1. ArrayList maintains the Insertion Order.
2. It can stores the duplicate value also.
3. It extends the List Interface.

*/