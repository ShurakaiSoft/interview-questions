package sorting;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestUtils {

	@Test
	public void testSwap() {
		int[] array = new int[2];
		
		array[0] = 17;
		array[1] = 31;
		Utils.swap(array, 0, 1);
		assertTrue(array[0] == 31);
		assertTrue(array[1] == 17);
	}
	
	@Test
	public void testShuffle() {
		final int MAX_SIZE = 100;
		int[] array = new int[MAX_SIZE];
		
		for (int i = 0; i < array.length; i++) {
			array[i] = i;
		}
		Utils.shuffle(array);
		for (int i = 0; i < array.length; i++) {
			if (array[i] != i) {
				return;
			}
		}
		fail("all values were originals and not shuffled");
	}

	@Test
	public void testDeepCopy() {
		int[] original = new int[3];
		int[] copy = null;

		original[0] = 13;
		original[1] = 31;
		original[2] = 23;
		copy = Utils.deepCopy(original);
		assertTrue(copy[0] == 13);
		assertTrue(copy[1] == 31);
		assertTrue(copy[2] == 23);
	}

	
	@Test
	public void testAscending() {
		int[] ascending = new int[3];
		
		ascending[0] = 1;
		ascending[1] = 11;
		ascending[2] = 31;
		assertTrue(Utils.isAscendingSorted(ascending));
		ascending[2] = 11;
		assertTrue(Utils.isAscendingSorted(ascending));
		ascending[2] = 5;
		assertTrue(Utils.isAscendingSorted(ascending) == false);
	}

	@Test
	public void testDescending() {
		int[] descending = new int[3];
		
		descending[0] = 31;
		descending[1] = 17;
		descending[2] = 5;
		assertTrue(Utils.isDescendingSorted(descending));
		descending[2] = 17;
		assertTrue(Utils.isDescendingSorted(descending));
		descending[2] = 51;
		assertTrue(Utils.isDescendingSorted(descending) == false);
	}

	@Test
	public void testRandomArrayCreation() {
		int size = 10;
		int[] randomArray = Utils.createRandomArray(size);
		
		assertTrue(randomArray.length == size);
		assertTrue(Utils.isDescendingSorted(randomArray) == false);
		assertTrue(Utils.isAscendingSorted(randomArray) == false);
	}
	
	
	@Test
	public void testCompareOrder() {
		assertTrue(Utils.compareOrder(1, 2, true));
		assertTrue(Utils.compareOrder(3, 2, true) == false);
		assertTrue(Utils.compareOrder(4, 2, false));
		assertTrue(Utils.compareOrder(5, 7, false) == false);
	}
	
	
}
