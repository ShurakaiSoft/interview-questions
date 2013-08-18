package strings;

import java.util.HashMap;
import java.util.Map;
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
	
	
	
	
}
