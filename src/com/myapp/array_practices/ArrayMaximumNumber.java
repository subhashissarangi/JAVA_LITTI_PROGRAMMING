package com.myapp.array_practices;

public class ArrayMaximumNumber {
	
	public static int max;
	
	public static int maxNumberArray(int []arr) {
		max=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		return max;
	}
	
	public static void main(String[] args) {
		int []arr= {1,5,7,3,2,11,9,15};
		
		System.out.println(maxNumberArray(arr));
	}

}
