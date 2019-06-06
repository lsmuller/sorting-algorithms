package com.sort.sortingalgorithms;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class BubbleSortTest {

	@Test
	public void runNormalShouldOrderArray() {
		int[] arr = {9, 8, 7, 6, 5, 4, 3, 2, 1};
		int[] expArr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		Assert.assertEquals(Arrays.toString(expArr), Arrays.toString(BubbleSort.runNormal(arr)));
	}

	@Test
	public void runRecursivelyShouldOrderArray() {
		int[] arr = {9, 7, 8, 6, 1, 4, 2, 3, 5};
		int[] expArr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		Assert.assertEquals(Arrays.toString(expArr), Arrays.toString(BubbleSort.runRecursively(arr, arr.length)));
	}
}
