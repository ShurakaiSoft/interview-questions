package sorting;

public class QuickSort {

	public static int[] sort(int[] array, boolean ascendingOrder) {
		if (array != null && array.length > 1) {
			quickSort(array, 0, array.length - 1, ascendingOrder);
		}
		return array;
	}
	
	private static void quickSort(int[] array, int startIndex, int endIndex, boolean ascendingOrder) {
		
		if (startIndex < endIndex) {
			int pivotIndex = getRandomPivotIndex(startIndex, endIndex);
			pivotIndex = partition(array, startIndex, pivotIndex, endIndex, ascendingOrder);
			quickSort(array, startIndex, pivotIndex - 1, ascendingOrder);
			quickSort(array, pivotIndex + 1, endIndex, ascendingOrder);
		}
	}
	
	
	private static int partition(int[] array, int startIndex, int pivotIndex, int endIndex, boolean ascendingOrder) {
		int pivot = array[pivotIndex];
		
		Utils.swap(array, pivotIndex, endIndex);
		int storeIndex = startIndex;
		for (int i = startIndex; i < endIndex; i++) {
			if (Utils.compareOrder(array[i], pivot, ascendingOrder)) {
				Utils.swap(array,  i, storeIndex);
				storeIndex++;
			}
		}
		Utils.swap(array, storeIndex, endIndex);
		return storeIndex;
	}
	
	
	private static int getRandomPivotIndex(int startIndex, int endIndex) {
		return startIndex + ((int) Math.floor(Math.random() * (endIndex - startIndex)));
	}
	
	private static void printArray(String msg, int[] array, int startIndex, int endIndex, int pivot) {
		System.out.format("%s %d %d %d: ", msg, startIndex, endIndex, pivot);
		for (int i = 0; i < array.length; i++) {
			System.out.format(" %d", array[i]);
		}
		System.out.println();
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] array = Utils.createRandomArray(9);
		
		printArray("Randomized: ", array, 0, array.length - 1, array.length - 1); 
		sort(array, true);
		printArray("finished: ", array, 0, 0, 0); 
		
	}

}
