package com.sort.sortingalgorithms;

public class BubbleSort {

	public static int[] sort(int[] arr) {
		boolean swapped = false;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - i - 1; j++){
				if (arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					swapped = true;
				}
			}
			if (!swapped) break;
		}
		return arr;
	}

	public static int[] sortRecursively(int[] arr, int size) {
		if (size == 1) {
			return arr;
		}
		for (int i = 0; i < size - 1; i++) {
			if (arr[i] > arr[i + 1]) {
				int temp = arr[i];
				arr[i] = arr[i + 1];
				arr[i + 1] = temp;
			}
		}
		return sortRecursively(arr, size - 1);
	}

}
