package com.myapp.array_practices;

public class KidaneAlgorithimMultiplication {

	public static int maxIntegerMultiplication(int[] arr) {
		int max_multiplied_number = 0;
		int temp_multiplied = 1;
		int index1 = 0;
		int index2 = 0;
		for (int i = 0; i < arr.length; i++) {
			index1++;
			for (int j = 1; j < arr.length; j++) {
				index2++;
					temp_multiplied = arr[i] * arr[j];
				if (temp_multiplied > 0 && max_multiplied_number < temp_multiplied) {
					max_multiplied_number = temp_multiplied;
				}
				if (temp_multiplied == 0) {
					temp_multiplied = 1;
				}
			}
		}

		return max_multiplied_number;
	}

	public static void main(String[] args) {
		int[] arr = { 4, -2, 6, -3 };// -8 24 -12 -12 6 -18
		System.out.println(maxIntegerMultiplication(arr));
	}

}
