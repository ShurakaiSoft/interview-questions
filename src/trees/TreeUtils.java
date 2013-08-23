package trees;

import java.util.Random;

public class TreeUtils {

	/**
	 * Creates and fill an array of the requested size with two digit integers.
	 * 
	 * @param size of array to create
	 * @return the array, initialised and populated with random values.
	 */
	public static Object[] generateArray(int size) {
		Object[] array = new Object[size];
		Random random = new Random();
		
		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(89) + 10;
		}
		return array;
	}
	
	
	
	
	/**
	 * Print the given array as a tree.
	 * @param array
	 */
	public static void print(Object[] array) {
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
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Object[] array = generateArray(7);
		
		print(array);

	}

}
