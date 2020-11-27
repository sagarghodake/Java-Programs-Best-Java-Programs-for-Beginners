/*
 * Here's your coding interview problem for today.

This problem was asked by Uber.

Given an array of integers, return a new array such that each element
 at index i of the new array is the product 
of all the numbers in the original array except the one at i.

For example, if our input was [1, 2, 3, 4, 5], 
the expected output would be [120, 60, 40, 30, 24]. 
If our input was [3, 2, 1], the expected output would be [2, 3, 6].

Follow-up: what if you can't use division?*/

package LockDownProgram;

public class UberProgram {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5};
		int newArray[]=UberProgram.resultantArray(arr);
		System.out.println(("Resultant array is: "));
		for (int j = 0; j < newArray.length; j++) {
			System.out.print(newArray[j]+" ");
			
		}
	}

	public static int[] resultantArray(int arr[]) {
		int newArray[] = new int[arr.length];

		int i = 0, j = 0, multi = 1, current = 0;
		for (i = 0; i < arr.length; i++) {
			current = arr[i];

			for (j = 0; j < arr.length; j++) {
				if (arr[j] == current) {
					continue;
				} else {
					multi = multi * arr[j];
				}
			}
			//System.out.print(multi + " ");
			newArray[i] = multi;
			multi = 1;
		}
		return newArray;
	}
}