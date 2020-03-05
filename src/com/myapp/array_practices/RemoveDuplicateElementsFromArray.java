package com.myapp.array_practices;

public class RemoveDuplicateElementsFromArray {

	public static int[] removeDuplicateSorted(int[] arr) {
		int[] arraySet = new int[arr.length];
		int count = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i + 1] != arr[i]) {
				arraySet[count] = arr[i];
				count++;
			}

		}
		arraySet[count] = arr[arr.length - 1];
		return arraySet;
	}

	public static int[] removeDuplicateWithoutSecondArray(int[] arr) {
		// int[] arraySet = new int[arr.length];
		int count = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] != arr[i + 1]) {
				arr[count] = arr[i];
				count++;
			}
		}
		arr[count] = arr[arr.length - 1];
		return arr;
	}

	public static int[] removeDuplicateUnsorted(int[] arr) {
		int[] arraySet = new int[arr.length];

		return arraySet;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 2, 3, 4, 5, 5, 6, 7, 7, 7, 8, 8, 9 };
		for (int i : removeDuplicateSorted(arr)) {
			System.out.println(i);
		}
	}

}
