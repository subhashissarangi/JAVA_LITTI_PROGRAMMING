package com.myapp.array_practices;

public class InsertElementIntoArray {

	public static int[] insertElementInPosition(int[] arr, int index_pos, int element) {

		for (int i = arr.length - 1; i > index_pos; i--) {
			arr[i] = arr[i - 1];
		}
		arr[index_pos] = element;
		return arr;
	}

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };
		//int[] arr1 = insertElementInPosition(arr, 3, 60);
		for (int i : insertElementInPosition(arr, 3, 60)) {
			System.out.print(i + " ");
		}

	}

}
