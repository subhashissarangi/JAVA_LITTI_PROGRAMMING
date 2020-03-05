package com.myapp.array_practices;

public class SecondHighestValueArray {

	public static int thirdHighestNumberArray(int[] arr) {
		int temp = arr[0];
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		temp = arr[2];
		return temp;
	}

	public static int secondLargetValueArray(int[] arr) {
		int largest = Integer.MIN_VALUE;
		int second_largest = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > largest) {
				second_largest = largest;
				largest = arr[i];
			} else if (arr[i] > second_largest && arr[i] != largest) {
				second_largest = arr[i];
			}
		}

		return second_largest;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 5, 3, 2, 10,10, 11, 12, 13, 14, 15, 16,17, 17, 18,18 };
		System.out.println(thirdHighestNumberArray(arr));
		System.out.println(secondLargetValueArray(arr));

	}

}
