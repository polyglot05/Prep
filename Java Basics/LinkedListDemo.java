package JavaBasics;



import java.util.LinkedList;



public class LinkedListDemo {

	// Underlying datastructure is Doubly linked list

	// Insertion order is preserved

	// Duplcaites are allowed

	// Heterogeneous elements are allowed

	// null elements are allowed.

	// Linkedlist implements serializable and cloneable but not RandomAccess inte

	// It is best choice if freq operation is insertion or deletion

	// Worst choice if freq opration is retrieval.



	// ArrayList vs LinkedList:

	// 1. AL is great if frq operation is retrieval whereas LL is best if freq operation is insertion or deletion in the middle

	// 2. AL is worst  if freq operation is insertion or deletion in the middle and LL is worst choice if frq operation is retrieval

	// 3. AL: underying DS is resizeable or growable array whereas LL os based on Double LL

	// 4. AL implements RandomAccess interface but not LL



public static void main(String args[]) {

	LinkedList l1 = new LinkedList();

	l1.add("First Element");

	l1.add(null);

	System.out.println("LL elts "+l1);



	l1.addFirst("Madhu");

	System.out.println("Addfirst Madhu "+l1);

	l1.set(0, "1st"); // Replaces 0th element

	l1.addFirst("Madhu");

	System.out.println("Replace 0 index with 1st as string "+l1);

	System.out.println("Get element 0 "+l1.get(0));

}

}
