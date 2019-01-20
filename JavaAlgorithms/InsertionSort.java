/*
Class	Sorting algorithm
Data structure	Array
Worst-case performance	О(n2) comparisons and swaps
Best-case performance	O(n) comparisons, O(1) swaps
Average performance	О(n2) comparisons and swaps
Worst-case space complexity
*/

/*
 * Insertion sort is a simple sorting algorithm, it builds the final sorted array one item at a time. It is much less efficient on large lists than other sort algorithms.

Advantages of Insertion Sort:

1) It is very simple.
2) It is very efficient for small data sets.
3) It is stable; i.e., it does not change the relative order of elements with equal keys.
4) In-place; i.e., only requires a constant amount O(1) of additional memory space.
 */


import java.util.Arrays;

import java.util.Arrays;

import java.util.Arrays;

class InsertionSort
{
	// Function to perform insertion sort on arr[]
	public static void insertionSort(int[] arr)
	{
		// Start from the second element
		// (element at index 0 is already sorted)
		for (int i = 1; i < arr.length; i++)
		{
			int value = arr[i];
			int j = i;

			// Find the index j within the sorted subset arr[0..i-1]
			// where element arr[i] belongs
			while (j > 0 && arr[j - 1] > value)
			{
				arr[j] = arr[j - 1];
				j--;
			}

			// Note that sub-array arr[j..i-1] is shifted to
			// the right by one position i.e. arr[j+1..i]

			arr[j] = value;
		}
	}

	public static void main(String[] args)
	{
		int[] arr = { 3, 8, 5, 4, 1, 9, -2 };

		insertionSort(arr);

		// print the sorted array
		System.out.println(Arrays.toString(arr));
	}
}
