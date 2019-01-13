import java.util.Scanner;

public class ArrayTranspose {

	 private static Scanner s;

	public static void main(String args[] ) throws Exception {

	        s = new Scanner(System.in);

	        int rows = s.nextInt();
			int cols = s.nextInt();
			int[][] arr = new int[rows][cols];


			for(int i = 0;i < rows;i++){
				for(int j = 0;j < cols;j++){
					arr[i][j] = s.nextInt();
				}
			}

			// Transpose
			for(int i = 0;i < cols;i++){
				for(int j = 0;j < rows;j++){
					System.out.print(arr[j][i] + " ");
				}
				System.out.println();
			}


	    }
}
