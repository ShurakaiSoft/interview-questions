package sorting;

public class SortingAlgorithms {

	public static int[] selectionSort(int[] array, boolean ascendingOrder) {
		if (array != null && array.length > 1) {
			int lengthLessOne = array.length - 1;
			int minValue;
			int minIndex;
			
			for (int i = 0; i < lengthLessOne; i++) {
				minValue = array[i];
				minIndex = i;
				for (int j = i + 1; j < array.length; j++) {
					if (Utils.compareOrder(minValue, array[j], ascendingOrder) == false) {
						minValue = array[j];
						minIndex = j;
					}
				}
				if (minIndex != i) {
					Utils.swap(array, i, minIndex);
				}
			}
		}
		return array;
	}
	
	public static int[] selectionSortAscending(int[] array) {
		return selectionSort(array, true);
	}
	
	public static int[] selectionSortDescending(int[] array) {
		return selectionSort(array, false);
	}

	public static int[] insertionSort(int[] array, boolean ascendingOrder) {
		if (array != null && array.length > 1) {
			for (int i = 1; i < array.length; i++) {
				for (int j = i; j >= 1; j--) {
					if (Utils.compareOrder(array[j], array[j - 1], ascendingOrder)) {
						Utils.swap(array, j, j - 1);
					} else {
						break;
					}
				}
			}
		}
		return array;
	}
	
	public static int[] insertionSortAscending(int[] array) {
		return insertionSort(array, true);
	}
	
	public static int[] insertionSortDescending(int[] array) {
		return insertionSort(array, false);
	}

	public static int[] bubbleSort(int[] array, boolean ascendingOrder) {
		if (array == null || array.length <= 1) {
			return array;
		}
		for (int i = 1; i < array.length; i++) {
			for (int j = 0; j < array.length - i; j++) {
				if (Utils.compareOrder(array[j], array[j + 1], ascendingOrder) == false) {
					Utils.swap(array, j, j + 1);
				}
			}
		}
		return array;
	}
	
	public static int[] bubbleSortAscending(int[] array) {
		return bubbleSort(array, true);
	}
	
	public static int[] bubbleSortDescending(int[] array) {
		return bubbleSort(array, false);
	}
	
	public static int[] heapSortAscending(int[] array) {
		return HeapUtils.heapSort(array, true);
	}
	public static int[] heapSortDescending(int[] array) {
		return HeapUtils.heapSort(array, false);
	}

	public static int[] quickSortAscending(int[] array) {
		return QuickSort.sort(array, true);
	}
	
	public static int[] quickSortDescending(int[] array) {
		return QuickSort.sort(array, false);
	}
	
	
	
	
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] array = Utils.createRandomArray(10);

		Utils.printArray(array);
		bubbleSortDescending(array);
		Utils.printArray(array);
	}
	

}
