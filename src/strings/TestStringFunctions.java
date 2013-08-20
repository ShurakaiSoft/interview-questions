package strings;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestStringFunctions {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		assertTrue(StringFunctions.firstNonRepeat("total").equals('t') == false);
		assertTrue(StringFunctions.firstNonRepeat("total").equals('o'));
		assertTrue(StringFunctions.firstNonRepeat("teeter").equals('r'));
	}
	
	@Test
	public void testRemoveChars() {
		String input = "Battle of the Vowels: Hawaii vs. Grozny";
		String output = "Bttl f th Vwls: Hw vs. Grzny";
		assertTrue(output.equals(StringFunctions.removeChars(input, "aeiou")));
	}
	
	@Test
	public void testReverseWords() {
		String input = "Do or do not, there is no try.";
		String output = "try. no is there not, do or Do";
		assertTrue(output.equals(StringFunctions.reverseWords(input)));
	}

	@Test
	public void testStr2Int() {
		assertTrue(StringFunctions.str2int("127") == 127);
		assertTrue(StringFunctions.str2int("1") == 1);
		assertTrue(StringFunctions.str2int("0") == 0);
		assertTrue(StringFunctions.str2int("-1") == -1);
	}
	
	@Test
	public void testInt2Str() {
		assertTrue("732".equals(StringFunctions.int2Str(732)));
		assertTrue("1".equals(StringFunctions.int2Str(1)));
		assertTrue("0".equals(StringFunctions.int2Str(0)));
		assertTrue("-1".equals(StringFunctions.int2Str(-1)));
		assertTrue("2000000000".equals(StringFunctions.int2Str(2000000000)));
		assertTrue("-2000000000".equals(StringFunctions.int2Str(-2000000000)));
	}
	
}
