package com.sort.sortingalgorithms;

public class SelectionSort {
	public static void sort(int[] arr) {
		sort(arr, 0);
	}

	private static void sort(int[] arr, int index) {
		if (index == arr.length) return;
		int minIndex = index;
		for (int i = index + 1; i < arr.length; i++) {
			if (arr[i] < arr[minIndex]) minIndex = i;
		}
		swap(arr, index, minIndex);
		sort(arr, index + 1);
	}

	private static void swap(int[] arr, int idx1, int idx2) {
		int temp = arr[idx1];
		arr[idx1] = arr[idx2];
		arr[idx2] = temp;
	}
}
