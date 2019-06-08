package com.sort.sortingalgorithms;

public class QuickSort {

	//Pivot = last element
	public static void sort1(int[] arr, int left, int right) {
		if (left > right) {
			return;
		}
		int pivot = arr[right];
		int index = partition1(arr, left, right, pivot);
		sort1(arr, left, index - 1);
		sort1(arr, index + 1, right);

	}

	private static int partition1(int[] arr, int left, int right, int pivot) {
		int i = (left-1); // index of smaller element
		for (int j = left; j < right; j++) {
			if (arr[j] <= pivot) {
				i++;
				swap(arr, i, j);
			}
		}
		swap(arr, i + 1, right);
		return i + 1;
	}

	//Pivot = middle element
	public static void sort2(int[] arr, int left, int right) {
		if (left > right) {
			return;
		}
		int pivot = arr[right/2];
		int index = partition2(arr, left, right, pivot);
		sort2(arr, left, index - 1);
		sort2(arr, index + 1, right);
	}

	private static int partition2(int[] arr, int left, int right, int pivot) {
		while (left < right) {
			while (arr[left] < pivot) {
				left++;
			}
			while (arr[right] > pivot) {
				right--;
			}
			if (left < right) {
				swap(arr, left, right);
				left++;
				right--;
			}
		}
		return left;
	}

	private static void swap(int[] arr, int left, int right) {
		int temp =  arr[left];
		arr[left] = arr[right];
		arr[right] = temp;
	}

}
