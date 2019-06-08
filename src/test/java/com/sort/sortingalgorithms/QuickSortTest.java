package com.sort.sortingalgorithms;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class QuickSortTest {

	@Test
	public void sortShouldOrderArray() {
		int[] arr1 = {9, 8, 7, 6, 5, 4, 3, 2, 1};
		int[] arr2 = {9, 8, 7, 6, 5, 4, 3, 2, 1};

		int[] expArr = {1, 2, 3, 4, 5, 6, 7, 8, 9};

		QuickSort.sort1(arr1, 0, arr1.length - 1);
		QuickSort.sort2(arr2, 0, arr2.length - 1);


		Assert.assertEquals(Arrays.toString(expArr), Arrays.toString(arr1));
		Assert.assertEquals(Arrays.toString(expArr), Arrays.toString(arr2));
	}

}
