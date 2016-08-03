package com.raremile.training.service;

import java.util.ArrayList;
import java.util.List;

import com.raremile.training.utils.MyInsertionSort;

public class MaxMovieTime {
	public static int[] startTime, endTime;
	List<Integer> resStartTime, resEndTime;

	public int[] getStartTime() {
		return startTime;
	}

	public void setStartTime(int[] startTime) {
		this.startTime = startTime;
	}

	public int[] getEndTime() {
		return endTime;
	}

	public void setEndTime(int[] endTime) {
		this.endTime = endTime;
	}

	public MaxMovieTime(int startTime[], int endTime[]) {
		this.startTime = startTime;
		this.endTime = endTime;
		resStartTime = new ArrayList<>();
		resEndTime = new ArrayList<>();
	}

	public int findMin(int start, int end, int[] array) {
		int minIndex = start;
		for (int i = start + 1; i < end; i++) {
			if (array[i] < array[minIndex])
				minIndex = i;
		}
		return minIndex;
	}

	public void getMaxMovieTime() {
		int prevStart = 0, prevEnd = 0;
		// MyInsertionSort.printNumbers(startTime);
		// MyInsertionSort.printNumbers(endTime);

		MyInsertionSort.insertionSort(endTime, startTime);

		// MyInsertionSort.printNumbers(startTime);
		// MyInsertionSort.printNumbers(endTime);

		resStartTime.add(startTime[0]);
		resEndTime.add(endTime[0]);

		for (int i = 1; i < startTime.length; i++) {

			if (startTime[i] >= endTime[prevEnd]) {
				resStartTime.add(startTime[i]);
				resEndTime.add(endTime[i]);
				prevEnd = i;
			}
		}

		for (int i = 0; i < resStartTime.size(); i++) {
			System.out.println(resStartTime.get(i) + " - " + resEndTime.get(i));
		}
	}
}
