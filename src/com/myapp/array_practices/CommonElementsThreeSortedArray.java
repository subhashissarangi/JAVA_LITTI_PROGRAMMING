package com.myapp.array_practices;

import java.util.HashSet;
import java.util.Set;

public class CommonElementsThreeSortedArray {

	public static Set<Integer> commonElementThreeSortedArray(int[] arr1, int[] arr2, int[] arr3) {
		Set<Integer> aSet = new HashSet<Integer>();
		int x = 0;
		int y = 0;
		int z = 0;
		while (x < arr1.length && y < arr2.length && z < arr3.length) {
			if (arr1[x] == arr2[y] && arr2[y] == arr3[z]) {
				aSet.add(arr1[x]);
				x++;
				y++;
				z++;

			} else if (arr1[x] < arr2[y]) {
				x++;

			} else if (arr1[y] < arr2[z]) {
				y++;

			} else {
				z++;
			}
		}

		return aSet;
	}

	public static void main(String[] args) {
		int[] arr1 = { 1, 3, 4, 6, 8 };
		int[] arr2 = { 1, 4, 6, 8 };
		int[] arr3 = { 1, 3, 4, 8 };
		System.out.println(commonElementThreeSortedArray(arr1, arr2, arr3));

	}

}
