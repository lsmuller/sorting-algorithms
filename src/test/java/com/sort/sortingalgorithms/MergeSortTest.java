package com.sort.sortingalgorithms;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class MergeSortTest {
	@Test
	public void sortShouldOrderArray() {
		int[] arr = {9, 8, 7, 6, 5, 4, 3, 2, 1};
		int[] expArr = {1, 2, 3, 4, 5, 6, 7, 8, 9};

		MergeSort.sort(arr);

		Assert.assertEquals(Arrays.toString(expArr), Arrays.toString(arr));
	}
}
