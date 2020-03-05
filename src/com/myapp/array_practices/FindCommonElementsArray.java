package com.myapp.array_practices;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindCommonElementsArray {

	public static Set<Integer> findCommonElements(int[] arr1, int[] arr2) {
		Set<Integer> common_elements = new HashSet<Integer>();

		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
					common_elements.add(arr1[i]);
				}
			}
		}
		return common_elements;
	}

	public static void main(String[] args) {

		int[] arr1 = { 1, 4, 6, 8, 3, 0 };
		int[] arr2 = { 2, 3, 8, 6, 3, 5 };
		System.out.println(findCommonElements(arr1, arr2));

	}

}
