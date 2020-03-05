package com.myapp.array_practices;

public class DeleteElementArray {

	public static int[] deleteElement(int[] arr, int element) {
		for (int i = 0; i < arr.length; i++) {
			if (element == arr[i]) {
				arr[i] = arr[i + 1];
				/*
				 * for (int j = i; j < arr.length; j++) { arr[j] = arr[j + 1]; }
				 */

			}
			
		}arr[arr.length-1] = 0;
		return arr;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4 };
		for (int i : deleteElement(arr, 4)) {
			System.out.println(i);
		}

	}

}
