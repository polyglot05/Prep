package JavaBasics;



public class DataTypes {

	// Java is strongly typed PL



	// Every variable and experession has some type

	// Each and every data type is clearly defined

	// Every assignment should be checked by compiler for type compatibility

	// Bcoz of above, we can conclude, java is strongly typed PL

	// Java is not pure OOL because several OOP features are not satisfied by Java like operator overlading, multiple inheritance etc.,

	// Moreover, we are depending on primitive data types which are not objects

	// Primitive Data types:  Numeric and Non-numeric:

	// 		1) numeric data types : Integral(Without decimal) : byte,short,int,long  and Floating point(with decimal): float, double  -- Signed Data types

	// 		2) Non-numeric data types: char and boolean - unsigned





	// Negative numbers represented by 2s complemented : byte : -128 to 127 is the range

	// MSB: most significant bit represents the sign

	// Positive number represented directly in the memory



	// Streams: Character and byte streams

	// File or network supported form : byte

	// short is rarely used in java : 2 bytes(16 bits) : range: -32768 to 32767

	// int: Most commonly used is int: 4 bytes: -2147483648vto 2147483647 (- 2 Pow 31 to 2 pow 31)

	public static void main(String args[]) {

		 byte b =127;



		// Compiler throws error in following cases

		// byte b = 128; // Cannot convert int to byte bcoz of the range

		// byte b = 10.5;

		// byte b = true;

		// byte b = "madhu";

		// short s = 32768;

		// short s = 10.5;

		  // int x = 2147483648; // The literal is out of range



		 // int x = 2147483648L; // Cannot convert long to int

		 // int x = true;// Cannot convert boolean to int



//		 System.out.println(x);

		System.out.println(Math.pow(2, 4));

	}





}
