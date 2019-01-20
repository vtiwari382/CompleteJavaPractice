package Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class IteratorsInJava {

	public static void main(String[] args) {
		List<Object> arrayList = new ArrayList<Object>();
		arrayList.add(4);
		arrayList.add(4);
		arrayList.add(true);
		arrayList.add(8.9);
		System.out.println("Here we are printing the arraylist object " +arrayList);
		
		Iterator<Object> itr = arrayList.iterator();
		
		while(itr.hasNext()){                   // hasNext() will check the object in collection and move the pointer to next objects
			System.out.println("Here we are Printing the values using iterator " +itr.next());      // itr.next() will return next element
			itr.remove();           // remove(); will remove object from collection of objects
		}
		
		System.out.println("Here we are printing after using the itr.remove method " +arrayList);
		
		System.out.println("-----------------");
		List<Object> linkedList1 = new LinkedList<Object>();
		linkedList1.add(50);
		linkedList1.add(50);
		linkedList1.add(9.8);
		linkedList1.add(100);
		linkedList1.add(true);
		linkedList1.add(50);
		
		ListIterator<Object> itr1 = linkedList1.listIterator();
		
		while(itr1.hasNext()){         // hasNext() will check the object in collection and move the pointer to next objects
			System.out.println("Here we are printing LinkedList data " +itr1.next());     // itr1.next() will return next element
		}
		
		while(itr1.hasPrevious()){    // hasPrevious() will check the previous object from current point and move the Pointer to previous
			System.out.println("Here we are printing the previous value of linked list using iterator " +itr1.previous());      // itr.previous() will return previous element
		}

	}

}
/*
Note: 
1. listIterator() will give list of ListIterator
2. Iterator will iterate over the collection and return the total element stored in it.
3. Iterator have 3 methods: HasNext, Next, Remove Method
4. ListIterator have 4 method: 	HasNext, HasPrevious, Next, Remove Method
5. In ListIterator we can't use HasPrevious method before the HasNext Method.		
*/