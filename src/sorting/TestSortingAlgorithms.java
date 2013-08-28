package sorting;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestSortingAlgorithms {
	static final int SIZE = 100000;
	
	@Test
	public void testSelectionSort() {
		assertTrue(SortingAlgorithms.selectionSortAscending(null) == null);
		int[] array = new int[1];
		SortingAlgorithms.selectionSortDescending(array);
		array[0] = 1;
		SortingAlgorithms.selectionSortDescending(array);
		array = Utils.createRandomArray(SIZE);
		assertTrue(Utils.isDescendingSorted(array) == false);
		SortingAlgorithms.selectionSortDescending(array);
		assertTrue(Utils.isDescendingSorted(array));
		array = Utils.createRandomArray(SIZE);
		assertTrue(Utils.isAscendingSorted(array) == false);
		SortingAlgorithms.selectionSortAscending(array);
		assertTrue(Utils.isAscendingSorted(array));
	}

	@Test
	public void testInsertionSort() {
		assertTrue(SortingAlgorithms.insertionSortAscending(null) == null);
		int[] array = new int[1];
		SortingAlgorithms.insertionSortDescending(array);
		array[0] = 1;
		SortingAlgorithms.insertionSortDescending(array);
		array = Utils.createRandomArray(SIZE);
		assertTrue(Utils.isDescendingSorted(array) == false);
		SortingAlgorithms.insertionSortDescending(array);
		assertTrue(Utils.isDescendingSorted(array));
		array = Utils.createRandomArray(SIZE);
		assertTrue(Utils.isAscendingSorted(array) == false);
		SortingAlgorithms.insertionSortAscending(array);
		assertTrue(Utils.isAscendingSorted(array));
	}
	
	@Test
	public void testBubbleSort() {
		assertTrue(SortingAlgorithms.bubbleSortAscending(null) == null);
		int[] array = new int[1];
		SortingAlgorithms.bubbleSortDescending(array);
		array[0] = 1;
		SortingAlgorithms.bubbleSortDescending(array);
		array = Utils.createRandomArray(SIZE);
		assertTrue(Utils.isDescendingSorted(array) == false);
		SortingAlgorithms.bubbleSortDescending(array);
		assertTrue(Utils.isDescendingSorted(array));
		array = Utils.createRandomArray(SIZE);
		assertTrue(Utils.isAscendingSorted(array) == false);
		SortingAlgorithms.bubbleSortAscending(array);
		assertTrue(Utils.isAscendingSorted(array));
	}
	
	@Test
	public void testHeapSort() {
		assertTrue(SortingAlgorithms.heapSortAscending(null) == null);
		int[] array = new int[1];
		SortingAlgorithms.heapSortDescending(array);
		array[0] = 1;
		SortingAlgorithms.heapSortDescending(array);
		array = Utils.createRandomArray(SIZE);
		assertTrue(Utils.isDescendingSorted(array) == false);
		SortingAlgorithms.heapSortDescending(array);
		assertTrue(Utils.isDescendingSorted(array));
		array = Utils.createRandomArray(SIZE);
		assertTrue(Utils.isAscendingSorted(array) == false);
		SortingAlgorithms.heapSortAscending(array);
		assertTrue(Utils.isAscendingSorted(array));
	}
	
	@Test
	public void testQuickSort() {
		assertTrue(SortingAlgorithms.quickSortAscending(null) == null);
		int[] array = new int[1];
		SortingAlgorithms.quickSortDescending(array);
		array[0] = 1;
		SortingAlgorithms.quickSortDescending(array);
		array = Utils.createRandomArray(SIZE);
		assertTrue(Utils.isDescendingSorted(array) == false);
		SortingAlgorithms.quickSortDescending(array);
		assertTrue(Utils.isDescendingSorted(array));
		array = Utils.createRandomArray(SIZE);
		assertTrue(Utils.isAscendingSorted(array) == false);
		SortingAlgorithms.quickSortAscending(array);
		assertTrue(Utils.isAscendingSorted(array));
	}
	
}
