package com.myapp.array_practices;

import java.util.HashSet;
import java.util.Set;

public class LongestSubSequenceArray {

	public static int longestSubSet(int[] arr) {
		Set<Integer> aSet = new HashSet<Integer>();
		int longest_length = 0;
		for (int i = 0; i < arr.length; i++) {
			aSet.add(arr[i]);
		}
		for (int i = 0; i < arr.length; i++) {
			if (!aSet.contains(arr[i] - 1)) {
				int no = arr[i];
				while (aSet.contains(no)) {
					no++;
				}
				if (longest_length < no - arr[i]) {
					longest_length = no - arr[i];
				}
			}
		}

		return longest_length;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 4, 6, 2, 12, 3, 9, 8 };
		System.out.println(longestSubSet(arr));

	}

}
