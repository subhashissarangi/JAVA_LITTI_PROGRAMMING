package com.myapp.array_practices;

public class FindDuplicateArray {

	// BruteForce method

	public static int findDuplicateBruteForce(int[] arr) {
		int temp = 0;
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j] && (i != j)) {
					temp = arr[j];
				}

			}
		}
		return temp;
	}

	public static void main(String[] args) {

	}

}
