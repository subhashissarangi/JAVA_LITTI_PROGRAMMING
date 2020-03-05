package com.myapp.array_practices;

import java.util.ArrayList;
import java.util.List;

public class EvenOddArray {

	public static List<Integer> findEvenOdd(int[] arr) {
		List<Integer> even = new ArrayList<Integer>();
		List<Integer> odd = new ArrayList<Integer>();

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				even.add(arr[i]);
			} else {
				odd.add(arr[i]);
			}
		}
		return odd;
	}

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
		System.out.println(findEvenOdd(arr));

	}

}
