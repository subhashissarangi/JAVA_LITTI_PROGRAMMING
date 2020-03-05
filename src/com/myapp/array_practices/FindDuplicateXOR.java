package com.myapp.array_practices;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicateXOR {
	public static Set<Integer> findDuplicate(int[] arr) {
		int value = arr[0];
		Set<Integer> values = new HashSet<Integer>();
		for (int i = 1; i < arr.length; i++) {
			value = value ^ arr[i];
			values.add(value);
		}
		return values;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 2, 3, 2, 4 };
		System.out.println(findDuplicate(arr));
	}

}
