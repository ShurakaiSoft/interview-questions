package other;

public class FuzzBuzz {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			if (i % 15 == 0) {
				System.out.println("FuzzBuzz");
			} else if (i % 5 == 0) {
				System.out.println("Fuzz");
			} else if (i % 3 == 0) {
				System.out.println("Buzz");
			} else {
				System.out.println(i);
			}
		}
	}
	
}
