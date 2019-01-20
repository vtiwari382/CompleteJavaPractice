package ArrayList;

import java.util.ArrayList;
import java.util.List;   // this package have all collection/Class and Interface

public class ArrayListDefination {
/*   these are the Array List methods example
	public boolean add(Object element), is used to insert an element in this collection.
	public boolean addAll(Collection c), is used to insert the specified collection element in the invoking collection.
	public boolean remove(Object element), is used to delete an element from this collection.
	public boolean removeAll(Collection c), is used to delete all the element of specified collection from the invoking collection.
	public boolean retainAll(Collection c), is used to delete all the element of invoking collection except the specified collection.
	public int size(), return the total number of elements in the collection.
	public void clear(), removes the total number of element from collection.
	public boolean contains(Object element), is used to search an element.
	public boolean containsAll(Collection c), is used to search the specified collection in this collection.
	public Iterator iterator(), returns an iterator.
	public Object[] to Array(), converts collection into Array.
	public boolean isEmpty(),  checks if collection is empty.
	public boolean equals(Object element), matches two collection.
	public int hashCode(), returns the hashcode number for collection.
	
	*/
	public static void main(String[] args) {
		
		// "List" is the interface so we can't create object of the List. but "ArrayList<>" is class so we can create object of it

		// NOte: below are the example of array list.
		//1. we can store any variable type in Array List using same method.
		//2. we can store "N" number of data as size is not defined in Array List.
		
		List array = new ArrayList<>();    // nothing is define in "List<>" so we can store any data.
		array.add(5); // OR array.add(Integer.valueOf(6));
		array.add("string");   // adding string
		array.add(true);   // or array.add(Boolean.valueOf(true));     "adding boolean value".
		
		
		// Note: below are the examples of the "ARRAY". we can store the variable which is defined while initialize. (int[])
		
		int[] array1 = new int[4];   // "int[4]" means array will create 4 Index in memory (0,1,2,3) to save data.
		array1[0] = 4; 
		array1[1] = 3;
		array1[2] = 5;
		array1[3] = 6;
	//	array1[4] = 7;  // this line will through "arrayIndexOutOfBound" error as index [4] is not available in memory.
		
		
		System.out.println(array);
		

	}

}
