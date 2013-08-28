package sorting;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestHeapSort {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testMaxHeapifyRightChild() {
		int array[] = new int[3];

		array[0] = 4;
		array[1] = 6;
		array[2] = 1;
		HeapSort.heapify(array, 0, false);
		assertTrue(array[0] == 6);
		assertTrue(array[1] == 4);
	}
	
	@Test
	public void testMaxHeapifyLeftchild() {
		int array[] = new int[3];

		array[0] = 4;
		array[1] = 1;
		array[2] = 6;
		HeapSort.heapify(array, 0, false);
		assertTrue(array[0] == 6);
		assertTrue(array[2] == 4);
	}

	@Test
	public void testMaxHeapifyNoSwap() {
		int array[] = new int[3];

		array[0] = 6;
		array[1] = 4;
		array[2] = 1;
		HeapSort.heapify(array, 0, false);
		assertTrue(array[0] == 6);
		assertTrue(array[1] == 4);
		assertTrue(array[2] == 1);
	}
	
	@Test
	public void testHeapifyArray() {
		int array[] = {3,7,2,4,9,1,5,6};
		
		HeapSort.heapArray(array, false);
		assertTrue(array[0] == 9);
		assertTrue(array[1] == 7);
		assertTrue(array[2] == 5);
		assertTrue(array[3] == 6);
		assertTrue(array[4] == 3);
		assertTrue(array[5] == 1);
		assertTrue(array[6] == 2);
		assertTrue(array[7] == 4);
	}

	@Test
	public void testHeapSort() {
		int array[] = {3,7,2,4,9,1,5,6};
		
		HeapSort.print(array);
		HeapSort.heapSort(array, true);
		HeapSort.print(array);
		assertTrue(Utils.isAscendingSorted(array));
	}
}
