package sorting;

public class QuickSort {

	public static int[] sort(int[] array, boolean ascendingOrder) {
		if (array != null) {
			sortPartition(array, 0, array.length - 1, ascendingOrder);
		}
		return array;
	}
	
	public static void sortPartition(int[] array, int startIndex, int endIndex, boolean ascendingOrder) {
		if (array != null && (endIndex - startIndex) > 1) {
			int pivot = chooseRandomPivotValue(array, startIndex, endIndex);
			int i = startIndex;
			int j = endIndex;
			
			while (true) {
				while (Utils.compareOrder(array[i], pivot, ascendingOrder) && i < j) {
					i++;
				}
				while (Utils.compareOrder(array[j], pivot, !ascendingOrder) && i < j) {
					j--;
				}
				if (i == j) {
					sortPartition(array, startIndex, i--, ascendingOrder);
					sortPartition(array, j++, endIndex, ascendingOrder);
					return;
				} else {
					Utils.swap(array, i, j);
				}
			}
		}
	}
	
	private static int chooseRandomPivotValue(int[] array, int startIndex, int endIndex) {
		return array[startIndex + ((int) Math.floor(Math.random() * (endIndex - startIndex)))];
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
		
		sort(array, true);
		
	}

}
