
public class ReverseNumber {



	public int reverse(int num) {

		int digit = 0;

		while (num !=0) {

			int rem = num % 10;

			digit = digit * 10 + rem;

			num = num /10;

		}

		return digit;

	}





	public static void main(String args[]) {

		ReverseNumber reverse = new ReverseNumber();

		System.out.println("Reverse is " + reverse.reverse(124));

	}

}
