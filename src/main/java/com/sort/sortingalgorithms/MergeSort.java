package com.sort.sortingalgorithms;

import java.util.Arrays;

public class MergeSort {
	public static void sort(int[] arr) {
		sort(arr, new int[arr.length], 0, arr.length - 1);
	}

	public static void sort(int[] arr, int[] tempAarr, int left, int right) {
		if (left < right) {
			int midle = (left + right) / 2;
			sort(arr, tempAarr, left, midle);
			sort(arr, tempAarr, midle + 1, right);
			merge(arr, tempAarr, left, right);
		}
	}

	private static void merge(int[] arr, int[] tempArr, int leftStart, int rightEnd) {
		int leftEnd = (leftStart + rightEnd) / 2;
		int rightStart = leftEnd + 1;
		int size = rightEnd - leftStart + 1;

		int left = leftStart;
		int right = rightStart;
		int index = leftStart;

		while (left <= leftEnd && right <= rightEnd) {
			if (arr[left] <= arr[right]) {
				tempArr[index] = arr[left];
				left++;
			}
			else {
				tempArr[index] = arr[right];
				right++;
			}
			index++;
		}
		System.arraycopy(arr, left, tempArr, index, leftEnd - left + 1);
		System.arraycopy(arr, right, tempArr, index, rightEnd - right + 1);
		System.arraycopy(tempArr, leftStart, arr, leftStart, size);
	}

	public static void main(String[] args) {
		int[] arr = new int[]{3 ,7, 5, 4, 2, 9, 8, 1, 6};
		System.out.println(Arrays.toString(arr));
		MergeSort.sort(arr);
		System.out.println(Arrays.toString(arr));
	}
}
