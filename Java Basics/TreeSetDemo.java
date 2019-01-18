package JavaBasics;



import java.util.Comparator;

import java.util.TreeSet;



public class TreeSetDemo {

// Treeset:

	// Underlying DS is Balanced tree

	// Duplicates not allowed

	// Insertion order not applicable

	// All elements will be inserted based on default natural sorting order

	// default natural sorting order : number -->  ascending, strings --> alphabetical

	// Heterogeneous objects are not allowed : run time exception(ClassCastException). TreeMap also doesn't allow heterogeneous objects

	// Nulls are allowed but only once when the treeset is empty // Only until java 1.6, now null is NOT ALLOWED



	public static void main(String args[]) {

		// Constructors



		TreeSet<String> t1 = new TreeSet<String>(); // default natural sorting order : Objects should be homogeneous and comparable

		// If the corresponsding class implements Comparable Interface, then the objects are said to be comparable

		// Ex: Strings are comparable but not StringBuffer objects



		t1.add("A");

		t1.add("a");

		t1.add("B");

		t1.add("b");

		t1.add("c");

		t1.add("D");

//		System.out.println(t1.add("D"));

		// t1.add(null); falseException in thread "main" java.lang.NullPointerException





		// t1.add(5); // Heterogeneous not allowed: Exception in thread "main" java.lang.ClassCastException: java.lang.String cannot be cast to java.lang.Integer



		System.out.println(t1); // [A, B, D, a, b, c] since a is 97 and A is 65

//		TreeSet t11 = new TreeSet();

//		t11.add(new StringBuffer("A"));

//		t11.add(new StringBuffer("B"));

//		t11.add(new StringBuffer("Z"));

//		t11.add(new StringBuffer("L"));

//		System.out.println(t11); //ClassCastException because StringBuffer objects are not comparable : java.lang.ClassCastException: java.lang.StringBuffer cannot be cast to java.lang.Comparable





		// Comparable Interface : in java.lang package and contains only one method: compareTo()

		// obj1.compareTo(obj2);

//		TreeSet t2 = new TreeSet(Comparator c); // Customized sorting order described by Comparator object

//		TreeSet t3 = new TreeSet(Collection c); // Pass any collection object

//		TreeSet t4 = new TreeSet(SortedSet s); // Pass any Sorted Set

	}



}
