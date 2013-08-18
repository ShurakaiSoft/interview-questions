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

}
