package JavaBasics;



import java.util.LinkedHashSet;



public class LinkedHashSetDemo {

// Hashset doesn't preserve the order of insertion, so if we need a data structure where duplicates are not allowed and the order must be preserved,

	// we should go for LinkedHashSet

	// Where to use: Ex: cache based application



	public static void main(String args[]) {

		LinkedHashSet lhs = new LinkedHashSet<String>();

		lhs.add("A");

		lhs.add("B");

		lhs.add(10);

		lhs.add("C");

		lhs.add("D");

		lhs.add("E");

		System.out.println(lhs.add("A"));

		System.out.println(lhs);

	}

}
