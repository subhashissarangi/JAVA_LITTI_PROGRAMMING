package com.myapp.array_practices;

public class KadeneAlgorithim {

	public static int totalSumArray(int[] arr) {
		int max_so_far = Integer.MIN_VALUE; // 1 6 10 11
		int max_ending_here = 0;// 1 6 4 10 6 2 0 11 
		for (int i = 0; i < arr.length; i++) { // 1, 5, -2, 6, -4, -9, 11

			max_ending_here = max_ending_here +  arr[i];
			//System.out.print(max_ending_here + " max _ending here ");
			//System.out.print(" max so far " + max_so_far + " ");

			if (max_so_far < max_ending_here) {

				max_so_far = max_ending_here;

			}
			if (max_ending_here < 0) {

				max_ending_here = 0;
			}

		}
		return max_so_far;
	}

	public static void main(String[] args) {
		int[] arr = { 4,-2, 6 };// 2 4 3
		System.out.println(totalSumArray(arr));

	}

}
