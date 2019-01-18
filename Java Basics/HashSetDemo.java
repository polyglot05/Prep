package JavaBasics;

import java.util.ArrayList;

import java.util.HashMap;

import java.util.HashSet;

import java.util.LinkedList;

import java.util.List;



public class HashSetDemo {

	// Collection(1.2 v) --> Set(1.2v) --> Hash Set(1.2v) --> LinkedHashSet(1.4v)

	// Collection --> Set(1.2v) --> SortedSet(1.2v) --> NavigableSet(1.6v) --> TreeSet(1.2v)



	// Set : Child Interface of Collection

	// Duplicates not allowed

	//  Insertion order not preserved

	// Set doesn't define any new methods, so we have to use only Collection Interface methods.





	// HashSet:

	// Underlying DS: HashTable

	// Duplicates not allowed, if we add a duplicate, no compile time or run time exception, but add method returns false.

	// Insertion order not preserved but all objects will be inserted based on hash code of objects.

	// Heterogeneous allowed

	// null allowed

	// Implements serializable and cloneable but not RandomAccess

	// If search is the frequently used operation , hash set is the best bet.



	public static void main(String args[]) {

		HashSet h =  new HashSet();

		HashSet h1 =  new HashSet(2); // custom Initial capacity

		HashSet h2 =  new HashSet(3, (float) 0.25); // custom Initial capacity, custom load factor

		// 		HashSet h =  new HashSet(Collection c); // For interconversion between collection objects

		// Initial capacity: 16 and fill ratio or load factor : 0.75 which means once the Hashset is almost 75% complete, it will create a new hashset



		h1.add("A");

		h1.add("Madhuri");

		h1.add(1);

		System.out.println(h1);

		h1.add(null);

		System.out.println(h1.add("A"));

		h2.add("Madhuri");

		h2.add("Yashvi");

		h2.add("Ram");

		System.out.println(h2);



		HashSet<Integer> hSet = new HashSet();

		hSet.add(1);

		hSet.add(1);

		hSet.add(2);

		hSet.add(2);

		hSet.add(3);

		hSet.add(4);

		hSet.add(5);

		System.out.println("hash set "+ hSet.contains(15));



	     LinkedList<Integer> list = new LinkedList<Integer>(hSet);


	     // Displaying ArrayList elements

	     System.out.println("LinkedList contains: "+ list);


	}



}
