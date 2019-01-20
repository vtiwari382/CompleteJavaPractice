package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDefination1 {

	public static void main(String[] args) {
		
		List<Integer> array = new ArrayList<Integer>();  // "List<Integer>" stores only Integer type data.
		array.add(6);  // this data is store at index 0 position.
		array.add(7);  // // this data is store at index 1 position.
//		array.add(true);  // this line will get error because we had define to store only integer type value and this is boolean type
		
//		System.out.println(array);  //  (6,7 will show)
//		System.out.println(array.get(1));   // to get the data at position 1.
//		System.out.println(array.get(0));   // to get the data at position 0.
		
		List<Integer> array1 = new ArrayList<Integer>();
		array1.add(10);
		array1.add(40);
//		System.out.println("array1 contains:----"  +array1);   //(10,40) will print
		
		array.addAll(array1); // this will add the all data of "array1" into "array". first "Array" data show the Array1 data(6,7,10,40)
//		System.out.println("array contains:----"  +array); // (6,7,10,40) will print
		
		array1.addAll(array); // now initially data stores in "Array1" will add in "Array" data.
		System.out.println("array1 contains:----"  +array1); //  (10,40,6,7,10,40) will show
		
		//Using the remove method
		
//		array1.remove(3);   // removing the data at index 3rd (e.g 7)	
		System.out.println("array1 contains:----"  +array1);
		
   System.out.println(array1.contains(10));  // this will check the 10 is present in list or not and it's return type is boolean.
   System.out.println(array1.containsAll(array)); // False because Array1 will check the all variable of array in array1 but 7 is missing
		
		
	}

}
