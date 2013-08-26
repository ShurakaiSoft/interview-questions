package sorting;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestSortingAlgorithms {
	
	@Test
	public void testSelectionSortAscending() {
		int size = 100;
		int[] array = Utils.createRandomArray(size);
		assertTrue(Utils.isAscendingSorted(array) == false);
		SortingAlgorithms.selectionSortAscending(array);
		assertTrue(Utils.isAscendingSorted(array));
	}
	
	@Test
	public void testSelectionSortDescending() {
		int size = 100;
		int[] array = Utils.createRandomArray(size);
		assertTrue(Utils.isDescendingSorted(array) == false);
		SortingAlgorithms.selectionSortDescending(array);
		assertTrue(Utils.isDescendingSorted(array));
	}

	@Test
	public void testInsertionSortAscending() {
		int size = 100;
		int[] array = Utils.createRandomArray(size);
		assertTrue(Utils.isAscendingSorted(array) == false);
		SortingAlgorithms.insertionSortAscending(array);
		assertTrue(Utils.isAscendingSorted(array));
	}
	
	@Test
	public void testInsertionSortDescending() {
		int size = 100;
		int[] array = Utils.createRandomArray(size);
		assertTrue(Utils.isDescendingSorted(array) == false);
		SortingAlgorithms.insertionSortDescending(array);
		assertTrue(Utils.isDescendingSorted(array));
	}
	
	@Test
	public void testInsertionSortBoundaries() {
		assertTrue(SortingAlgorithms.insertionSortDescending(null) == null);
		int[] array = new int[1];
		SortingAlgorithms.insertionSortDescending(array);
		array[0] = 1;
		SortingAlgorithms.insertionSortDescending(array);
	}
	
	@Test
	public void testBubbleSort() {
		assertTrue(SortingAlgorithms.bubbleSortAscending(null) == null);
		int[] array = new int[1];
		SortingAlgorithms.bubbleSortDescending(array);
		array[0] = 1;
		SortingAlgorithms.bubbleSortDescending(array);
		array = Utils.createRandomArray(100);
		assertTrue(Utils.isDescendingSorted(array) == false);
		SortingAlgorithms.bubbleSortDescending(array);
		assertTrue(Utils.isDescendingSorted(array));
		array = Utils.createRandomArray(100);
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
		array = Utils.createRandomArray(100);
		assertTrue(Utils.isDescendingSorted(array) == false);
		SortingAlgorithms.heapSortDescending(array);
		assertTrue(Utils.isDescendingSorted(array));
		array = Utils.createRandomArray(100);
		assertTrue(Utils.isAscendingSorted(array) == false);
		SortingAlgorithms.heapSortAscending(array);
		assertTrue(Utils.isAscendingSorted(array));
		
	}
	
	
	
}
