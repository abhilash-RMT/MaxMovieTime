package com.raremile.training.utils;

public class MyInsertionSort {

	public static void printNumbers(int[] input) {

		for (int i = 0; i < input.length; i++) {
			System.out.print(input[i] + ", ");
		}
		System.out.println("\n");
	}

	public static void insertionSort(int endTime[], int startTime[]) {
		int n = endTime.length;
		for (int j = 1; j < n; j++) {
			int key1 = endTime[j];
			int key2 = startTime[j];
			int i = j - 1;
			while ((i > -1) && (endTime[i] > key1)) {
				endTime[i + 1] = endTime[i];
				startTime[i + 1] = startTime[i];
				i--;
			}
			endTime[i + 1] = key1;
			startTime[i + 1] = key2;
		}
	}
}
