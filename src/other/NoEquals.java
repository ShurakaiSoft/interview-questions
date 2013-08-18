package other;

import java.util.ArrayList;
import java.util.List;

/**
 * How to do equals with out using equals sign.
 * 
 * @author steve
 *
 */
public class NoEquals {

	/**
	 * tests equality without using the equals operator.
	 * 
	 */
	public static boolean noEquals(int a, int b) {
		List<Boolean> answer = new ArrayList<Boolean>(1);
		answer.add(0, Boolean.TRUE);
		
		try {
			return answer.get(a ^ b);
		} catch (IndexOutOfBoundsException e) {
			return false;
		}
	}
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println(noEquals(1,1));	// true
		System.out.println(noEquals(1,2));	// false
	}

	
	
	
	
}
