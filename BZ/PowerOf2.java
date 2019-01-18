
public class PowerOfTwo {



	boolean isPowerOfTwo(int num) {		// O(n)

		if (num == 0) {

			return false;

		}



		while (num!=1) {

			if (num%2 != 0)

				return false;

			num = num /2;

		}

		return true; // Return true if the number is 1 or if it is an integral power of 2.

		}



	boolean isPowerOf2(int num) {

		if (num == 0) {

			return false;

		}

		double d = Math.log(num)/Math.log(2); // O(logn)

		return (d - (int)d == 0);



	}



	boolean isPowerOfTwoBitwise(int x)

	{

	    return (x != 0) && ((x & (x - 1)) == 0); //O(1)

	}



	public static void main(String args[]) {

		PowerOfTwo pT = new PowerOfTwo();

		System.out.println("Basic approach "+pT.isPowerOfTwo(16));

		System.out.println("Log approach "+pT.isPowerOf2(16));

		System.out.println("Bitwise approach "+pT.isPowerOfTwoBitwise(3));

		System.out.println("Bitwise ???  "+ (4 & 1));

	}



}
