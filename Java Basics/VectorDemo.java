package JavaBasics;



import java.util.Vector;



public class VectorDemo {

	// underlying DS is resizable/growable array

	// Duplicates allowed

	//  Insertion order preserved

	// heterogeneous objects are allowed

	// null is allowed

	// implements serializable and cloneable

	// Also implements RandomAccess interface .

	// Most methods present in vector are synchronized so it is thread safe

	// Best suited for if freq operation is retrieval type



	public static void main(String args[]) {

		Vector v = new Vector();

		v.addElement("madhu");

		v.addElement("ram");

		v.addElement("yashvi");

		v.addElement("someX");

		System.out.println(v);

		v.removeElement("someX"); // Remove element

		System.out.println("After removing element "+v);

		v.addElement("someX");

		v.removeElementAt(3); // remove element at index

		System.out.println("After removal at index "+v);

//		v.removeAllElements(); // remove all elements, similar to clear in arraylist

//		System.out.println("After removal of all elements "+v);



		// To retrieve elements:

		System.out.println("Element at index 0 is "+ v.elementAt(0));

		System.out.println("FirstElement is "+ v.firstElement());

		System.out.println("Last element is "+ v.lastElement());

		System.out.println("Size of vector is "+ v.size());

		System.out.println("Capacity of vector is "+ v.capacity());



		// Once vector reaches max capacity, new vector will be created with capacity 2*CC, default capacity is 10

		// For arraylist , default capacity is 10 and then new arraylist will be created with capacity (c *3/2)+1;



		// Creating vector  specifying capacity, if known upfront

		Vector vect = new Vector(1000);

		// We can also specify the capacity for the next vector to be created once the current vector reaches its max as follows:

		}





}
