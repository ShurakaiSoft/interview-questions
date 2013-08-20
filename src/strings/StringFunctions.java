package strings;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;

/**
 * A collection of stand alone (static) string manipulation functions.
 * 
 * @author steve
 *
 */
public class StringFunctions {

	/**
	 * find the first nonrepeated character in the given string.
	 * 
	 * @param input string to search
	 * @return first non repeated character, or null if all characters are
	 * repeated.
	 */
	public static Character firstNonRepeat(String input) {
		Map<Character, Boolean> charHash = new HashMap<Character, Boolean>();
		
		// build a character hash table
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			Boolean getChar = charHash.get(ch);
			
			if (getChar == null) {
				charHash.put(ch, Boolean.TRUE);
			} else if (getChar == Boolean.TRUE) {
				charHash.put(ch, Boolean.FALSE);
			}
		}
		
		// scan string
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (charHash.get(ch) == true) {
				return ch;
			}
		}
		return null;
	}
	
	/**
	 * Deletes characters from a given string.
	 * 
	 * @param str original string
	 * @param remove characters to remove
	 * @return new modified string.
	 */
	public static String removeChars(String str, String remove) {
		StringBuffer result = new StringBuffer(str.length());
		
		// build efficient search data structure
		Set<Character> removeChars = new HashSet<Character>();
		for (int i = 0; i < remove.length(); i++) {
			removeChars.add(remove.charAt(i));
		}
		
		// process string
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (removeChars.contains(ch) == false) {
				result.append(ch);
			}
		}
		
		return result.toString();
	}
	
	/**
	 * Reverses the words in a string. A space is used to reverse words.
	 * 
	 * @param input String to reverse words in
	 * @return new String with words in reverse order
	 */
	public static String reverseWords(String input) {
		Scanner scanner = new Scanner(input);
		StringBuilder  result = new StringBuilder(input.length());
		Stack<String> stack = new Stack<String>();
		
		while (scanner.hasNext()) {
			stack.push(scanner.next());
		}
		String spacer = "";
		while (stack.size() > 0) {
			result.append(spacer);
			spacer = " ";
			result.append(stack.pop());
		}
		scanner.close();
		return result.toString();
	}
	
	
	/**
	 * Convert a number into it's string representation.
	 * 
	 * @param number integer including negatives.
	 * @return string representation of number
	 */
	public static String int2Str(int number) {
		final int MAX_DIGITS = 10;
		boolean negative = false;
		int index = 0;
		char[] temp = new char[MAX_DIGITS];
		StringBuffer result = new StringBuffer(MAX_DIGITS + 1); // includes equals sign

		// get digits
		if (number < 0) {
			negative = true;
			number = -number;
		}
		do {
			temp[index++] = (char)(number % 10 + '0');
			number /= 10;
		} while (number != 0);

		// create string
		if (negative) {
			result.append('-');
		}
		while (index > 0) {
			result.append(temp[--index]);
		}
		return new String(result);
	}
	
	/**
	 * convert a string representation of a number into an integer. Strings are
	 * base 10 and may or may not have a minus sign.
	 * 
	 * @param number
	 * @return
	 */
	public static int str2int(String number) {
		int result = 0;
		boolean negative = (number.charAt(0) == '-');
		int i = negative ? 1 : 0;
		
		while (i < number.length()) {
			int digit = number.charAt(i) - '0';
			result = result * 10 + digit;
			i++;
		}
		if (negative) {
			result = -result;
		}
		return result;
	}
	
}
