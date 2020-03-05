package com.myapp.array_practices;

public class MergeTwoArray {

	public static int[] mergeArrays(int[] arr1, int[] arr2) {
		int[] finalArr = new int[arr1.length + arr2.length];

		for (int i = 0; i < arr1.length; i++) {
			finalArr[i] = arr1[i];
		}
		for (int j = 0; j < arr2.length; j++) {
			finalArr[(arr1.length) + j] = arr2[j];
		}

		return finalArr;
	}

	public static void main(String[] args) {
		int[] arr1 = { 10, 20, 30,40 };
		int[] arr2 = { 50, 60, 70, 80 };
		for (int i : mergeArrays(arr1, arr2)) {
			System.out.println(i);
		}
	}

}
