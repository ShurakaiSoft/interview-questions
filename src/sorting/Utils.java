package sorting;
/**
 * Some static utility functions to help with testing sorting routines on 
 * integer arrays.
 * 
 * @author steve
 *
 */
public class Utils {

	/**
	 * Verifies if the array sorted in ascending order.
	 * @param array to test
	 * @return true if elements are in ascending order, false otherwise.
	 */
	public static boolean isAscendingSorted(int[] array) {
		if (array == null) {
			return false;
		}
		if (array.length == 1) {
			return true;
		}
		for (int i = 1; i < array.length; i++) {
			if (array[i - 1] > array[i]) {
				return false;
			}
		}
		return true;
	}
	
	/**
	 * Verifies if the array is sorted in descending order
	 * 
	 * @param array to test
	 * @return true if elements are in descending order, false otherwise.
	 */
	public static boolean isDescendingSorted(int[] array) {
		if (array == null) {
			return false;
		}
		if (array.length == 1) {
			return true;
		}
		for (int i = 1; i < array.length; i++) {
			if (array[i - 1] < array[i]) {
				return false;
			}
		}
		return true;
	}
	
	/**
	 * Create a new array of the same size and initialize all elements to the
	 * given array. (XXX wording)
	 * 
	 * @param array to copy
	 * @return new array with identical values.
	 */
	public static int[] deepCopy(int[] array) {
		int[] copy = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			copy[i] = array[i];
		}
		return copy;
	}
	
	/**
	 * Shuffle all elements in the given array.
	 * 
	 * @param array array to shuffle
	 * @return same array after shuffling. 
	 */
	public static int[] shuffle(int[] array) {
		for (int i = 0; i < array.length; i++) {
			int j = (int) (Math.floor(Math.random() * array.length));
			swap(array, i, j);
		}
		return array;
	}
	
	/**
	 * Swaps two elements in an integer array.<br>
	 * 
	 * Note: it doesn't do any bounds checking.
	 * 
	 * @param array
	 * @param a
	 * @param b
	 */
	public static void swap(int[] array, int a, int b) {
		int temp = array[a];
		array[a] = array[b];
		array[b] = temp;
	}

	/**
	 * Compares a relative to b with respect to ascendingOrder. If ascending
	 * order is true and a is less than b it return true or if ascendingOrder
	 * is false and a is greater than b it returns true. Otherwise it returns
	 * false.
	 * 
	 * @param a lhs argument
	 * @param b rhs argument
	 * @param ascendingOrder true uses less than [<], false uses greater than [>]. 
	 * @return true when argument a and b match ascendingOrder flag.
	 */
	public static boolean compareOrder(int a, int b, boolean ascendingOrder) {
		if (ascendingOrder) {
			return a < b;
		} else {
			return a > b;
		}
	}
	
	
	public static int[] createRandomArray(int size) {
		 int[] array = new int[size];
		 
		 for (int i = 0; i < array.length; i++) {
			 array[i] = i;
		 }
		 return shuffle(array);
	}

	
	public static void printArray(int[] array) {
		String spacer = "";
		for (int i = 0; i < array.length; i++) {
			System.out.format("%s%d", spacer, array[i]);
			spacer = " ";
		}
		System.out.println();
	}

}
