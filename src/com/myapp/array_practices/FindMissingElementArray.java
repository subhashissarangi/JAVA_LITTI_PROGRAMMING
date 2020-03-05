package com.myapp.array_practices;

public class FindMissingElementArray {

	public static int findMissingElement(int[] arr) {
		int expected_sum = arr.length + 1;
		int total_sum = (expected_sum * (expected_sum + 1)) / 2;
		int arr_sum = 0;
		for (int i = 0; i < arr.length; i++) {
			arr_sum = arr_sum + arr[i];
		}

		return total_sum - arr_sum;
	}

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 6 };
		System.out.println(findMissingElement(arr));

	}

}
