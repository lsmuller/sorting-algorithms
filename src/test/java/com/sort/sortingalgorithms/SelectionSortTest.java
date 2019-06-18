package com.sort.sortingalgorithms;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class SelectionSortTest {

	@Test
	public void shourOrderTheArray() {
		int[] arr = {9, 8, 7, 6, 5, 4, 3, 2, 1};

		int[] expArr = {1, 2, 3, 4, 5, 6, 7, 8, 9};

		SelectionSort.sort(arr);

		Assert.assertEquals(Arrays.toString(expArr), Arrays.toString(arr));
	}
}
