package other;

/**
 * count the numbers from 1 to 100
 * 
 * @author steve
 *
 */
public class Counter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int total = 0;
		for (int i = 1; i <= 100; i++) {
			total += i;
		}
		System.out.format("%d", total);
	}

}
