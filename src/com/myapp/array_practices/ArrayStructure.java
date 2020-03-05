package com.myapp.array_practices;

import org.omg.CORBA.portable.ValueInputStream;

public class ArrayStructure {

	int[] theArray = new int[50];

	private int arraySize = 10;

	public void generateRandomArray() {
		for (int i = 0; i < arraySize; i++) {
			theArray[i] = (int) (Math.random() * 10) + 10;
		}
	}

	public void printArray() {
		System.out.println("_________");
		for (int i = 0; i < arraySize; i++) {
			System.out.print("|" + i + "|");
			System.out.println(theArray[i] + "|");
			System.out.println("___________");
		}

	}

	public int getValueByIndex(int index) {
		if (index < arraySize)
			return theArray[index];
		return 0;
	}

	public void deleteIndex(int index) {
		if (index < arraySize) {
			for (int i = index; i < arraySize - 1; i++) {
				theArray[i] = theArray[i + 1];
			}
			arraySize--;
		}
	}

	public void insertValue(int value) {
		if (arraySize < 50) {
			theArray[arraySize] = value;
			arraySize++;
		}
	}

	public String linearSearchForValue(int value) {
		boolean valueInArray = Boolean.FALSE;
		String indexWithValue = "";
		System.out.print("In Linear_Search the value is found in indexes:");
		for (int i = 0; i < arraySize; i++) {
			if (theArray[i] == value) {
				valueInArray = Boolean.TRUE;
				System.out.print(" "+ i);
				indexWithValue = i + " ";
			}
		}
		if (!valueInArray) {
			indexWithValue = "None";
			System.out.println(indexWithValue);

		}
		System.out.println();
		return indexWithValue;
	}

	public boolean doesArrayContainThisValue(int searchValue) {
		boolean valueOnArray = Boolean.FALSE;

		for (int i = 0; i < arraySize; i++) {
			if (searchValue == theArray[i])
				valueOnArray = Boolean.TRUE;
		}
		return valueOnArray;
	}

	public void bubbleSort() {
		for (int i = arraySize - 1; i > 1; i--) {
			for (int j = 0; j < i; j++) {
				if (theArray[j] > theArray[j + 1]) {
					swapValues(j, j + 1);
					printHorzArray(i, j);
				}

			}

		}

	}

	private void printHorzArray(int i, int j) {

	}

	private void swapValues(int indexOne, int indexTwo) {
		int temp = theArray[indexOne];
		theArray[indexOne] = theArray[indexTwo];
		theArray[indexTwo] = temp;
	}

	public static void main(String[] args) {

		ArrayStructure newArray = new ArrayStructure();
		newArray.generateRandomArray();
		newArray.printArray();
		newArray.insertValue(11);
		newArray.insertValue(11);
		newArray.insertValue(11);
		newArray.insertValue(11);
		newArray.insertValue(11);
		newArray.printArray();
		System.out.println("in 3rd index the value is:  " + newArray.getValueByIndex(3));
		System.out.print("LinearSearch  for value 11 found in indexes " + newArray.linearSearchForValue(11));
	}

}
