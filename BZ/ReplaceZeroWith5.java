
public class ReplaceZerowith5 {



	public int replaceZerosWith5(int num) {

		ReverseNumber rev = new ReverseNumber();

		int digit = 0;

		while (num !=0) {



			int rem = num % 10;

				if (rem == 0)

					digit = digit * 10 + 5;

				else

					digit = digit * 10 + rem;

			num = num /10;

		}



		return rev.reverse(digit);

	}

	public static void main(String args[]) {

		Replace0with5Amazon replacedDigit = new Replace0with5Amazon();

		System.out.println("Replace is " + replacedDigit.replaceZerosWith5(10204000));

	}



}
