package JavaBasics;



public class Arrays {

// Arrays : Collection of fixed no of homeogenous data elements using single variable. Once arrays are created, we cannot increase or decrease the size.

	// Size should be known in advance

	// Declaration

	public static void main(String args[]) {

		Arrays arrayDemo = new Arrays();



	//All the following declarations are valid

	// 1D array



	int[] arr1; // Most recommended bcoz name is clearly separated from type

	// int[6] arr4; // Not a valid syntax bcoz we cannot specify size while declaration and will lead to compiler error

	int arr2[] = new int[2]; // Declaration and initialization



	// 2D array

	int [][] arr3 = new int[3][2];



	// All of the following are valid

	// int [][]x;

	// int x[][];

	//int[] []x;

	// int[] x[];

	// int []x[];



	// The following are valid 2D array declarations

	// int[] a,b; // Both are 1D

	// int[] a[],b;// a is 2D and b is 1D

	// int[] a[],b[]; // a,b both are 2D

	// int[] []a,b; //  a and b are 2D since [] is in front of both a and b

	// int[] []a,b[]; // ais 2 and b is 3;



	// This will throw an exception



	// int[] []a,[]b; This is not valid declaration because if u eant to declare dimension before varaibale, it is possible only for the 1st variable



	// Array creation



	arr1 = new int[4];

	int[] arr = new int['a']; // Is valid bcoz byte,short and char have lesser size than int range, so they can fit in but it is not possible to use long, double float etc for size which is expected to be an integer

	byte b = 10;

	int[] arrbyte = new int[b];

	short s = 2;

	int[] arrshort = new int[s];

//	int[] arrNeg = new int[-300]; // No compiler error but will result in runtime exception. : Exception in thread "main" java.lang.NegativeArraySizeException



	// long l = 300;

	// int[] arrLong = new int[l]; // Compilation Error: cannot convert long to int

	// The maximum allowed array size in java is the max range of int : ie., 2147483647 but if sufficient heap memory is not available compiler might throw error when the size is around the max range

	//



	// Array of Arrays is used in Java instead of matrix approach to help with memory utilization.

	// Example:

	int[][] x = new int[2][]; // Leaving the second param size empty because it can be specified as a part of the next step

	x[0] = new int[2];

	x[1] = new int[3];



	// Example 2

	int[][][] x1 = new int[2][][];

	x1[0] = new int[3][];

	x1[0][0] = new int[1];

	x1[0][1] = new int[2];

	x1[0][2] = new int[3];

	x1[1] = new int[2][2]; // and so on as needed



	// System.out.println(arr1); // Prints address : [I@33909752 which means it is an array of integers with classname: [I and 33909752 represents hashcode in hexaecimal form.

//	System.out.println("element "+ arr1[5]); Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 5

	// System.out.println("element "+ arr1[3]); // Initially all elements are assigned 0;

//	System.out.println(x); // [[I@33909752

//	System.out.println("x[0] "+x[0]); // [I@55f96302

//	System.out.println("x[0][0] "+x[0][0]);

//

//	int[][] xInit = new int[2][];

//	System.out.println(xInit); // [[I@33909752

//	System.out.println("xInit[0] "+xInit[0]); //null



	// Array initialization

	int[] data = {10,20,30,40,50,60,71,80,90,91};

//	for (int item:data) {

//		System.out.println(item);

//	}

	int[][] twoDArr = {{1,2},{3,4,5}};

	int[][][] threeDArr = {

			{{1,2},{3,4,5}},

			{{6,7,8}}

			};

	// Length of array (property not method)

//	System.out.println(twoDArr[1].length);



	// length vs length()

	// length variable applicable or arrays not strings

	// length() is a final method for String objects and it returns the no of characters present in the string

//	String s1 = "Madhuri";

//	System.out.println("str len "+s1.length());

	// Anonymous arrays:

	arrayDemo.sum(new int[] {10,20,30,40} ); // This is anonymous array where it doesnt have a name and it is used only once.. so need to create a new array.



	// Throws an error if we create new int[3] {10,20,30,40}

	// While creating anonymous arrays, we cant specify the size else , we will get a compile time error..

	// we can create multi dimensional anonymous arrays.

	// Based on the requirement,, we can give the name to the anonymous array , then it is no longer anonymous.



	// Object arrays

	// In case of object type arrays, as array elements, we can provide either declared type objects or its child class objects

	// Following is valid because

	Object[] oa = new Object[10];

	oa[0] = new Object();

	oa[1] = new String("Madhu");

	oa[2] = new Integer(10);



	// Example 2 // Number is an abstract class

	Number[] n = new Number[10];

	n[0] = new Integer(10);

	// n[1] = new String("Madhuri"); // Will throw error : cannot convert String to Number



	// Example 3

	// For interface type arrays, as array elements, its implementation class objects are allowed.

	Runnable[] r = new Runnable[10]; // Interface type array object

	r[0] = new Thread();

	// r[1] = new String("Madhu"); // Cannot convert String to Runnable





	char[] ch = {'a','b','c','d'};

	// int[] c = ch; // cannot convert char[] to int[]: Element level promotions are not applicable at array level

	char c = 'a';

	int i = c; // Valid char element can be promoted to in but not the array.

	}



public void sum(int[] x) {

	int total =  0;

	for (int i:x) {

		total = total + i;

	}

	System.out.println("The sum is "+total);

}



}
