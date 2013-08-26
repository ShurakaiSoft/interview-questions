package sorting;

import static org.junit.Assert.assertTrue;

public class HeapUtils {

	public static int[] heapSort(int[] array, boolean ascendingOrder) {
		if (array == null || array.length < 2) {
			return array;
		}
		heapArray(array, !ascendingOrder);
		for (int i = array.length - 1; i >= 0; i--) {
			Utils.swap(array, i, 0);
			heapify(array, i, 0, !ascendingOrder);
		}
		return array;
	}
	
	public static int[] heapArray(int[] array, boolean minHeap) {
		for (int i = array.length / 2; i >= 0; i--) {
			heapify(array, i, minHeap);
		}
		return array;
	}
	
	public static void heapify(int[] array, int arraySize, int parentIndex, boolean minHeap) {
		int leftChildIndex = parentIndex * 2 + 1;
		int rightChildIndex = leftChildIndex + 1;
		int maxChildIndex;
		if (leftChildIndex < arraySize) {
			maxChildIndex = leftChildIndex;
		} else {
			return;
		}
		if (rightChildIndex < arraySize) {
			if (Utils.compareOrder(array[rightChildIndex], array[maxChildIndex], minHeap)) {
				maxChildIndex = rightChildIndex;
			}
		}
		if (Utils.compareOrder(array[maxChildIndex], array[parentIndex], minHeap)) {
			Utils.swap(array, maxChildIndex, parentIndex);
			heapify(array, arraySize, maxChildIndex, minHeap);
		}
	}
	
	public static void heapify(int[] array, int parentIndex, boolean minHeap) {
		heapify(array, array.length, parentIndex, minHeap);
	}
	
	/**
	 * Print the given array as a tree.
	 * 
	 * @param array
	 */
	public static void print(int[] array) {
		int i = 0;
		int rowCount = 1;
		int indent = array.length;
		int spaces = 0;
		while (i < array.length) {
			
			indent = (int)Math.floor((float)(indent) / 2.0);
			for (int k = indent; k > 0; k--) {
				System.out.print("  ");
			}
			
			for (int j = rowCount; j > 0 && i < array.length; j--) {
				
				System.out.print(array[i++]);
				
				for (int l = spaces; l > 0; l--) {
					System.out.print("  ");
				}
			}
			
			spaces = indent;
			rowCount *= 2;
			System.out.println();
		}
	}

	
	public static void main(String[] argv) {
		int array[] = { 3, 7, 2, 4, 9, 1, 5, 6 };
		
		HeapUtils.print(array);
		HeapUtils.heapSort(array, true);
		HeapUtils.print(array);
		System.out.println(Utils.isAscendingSorted(array));
	}
	
	
}
