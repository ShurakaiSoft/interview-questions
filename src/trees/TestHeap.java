package trees;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestHeap {
	Heap<Integer> emptyHeap = null;

	@Before
	public void setUp() throws Exception {
		emptyHeap = new Heap<Integer>(7, false);
	}

	
	@Test
	public void findWithEmptyHeap() {
		assertTrue(emptyHeap.find() == null);
	}
	
	@Test
	public void insertOne() {
		emptyHeap.insert(new Integer(5));
		assertTrue((new Integer(5)).equals(emptyHeap.find()));
	}
	
	@Test
	public void insertOutOfOrder() {
		emptyHeap.insert(new Integer(30));
		emptyHeap.insert(new Integer(45));
		assertTrue((new Integer(45)).equals(emptyHeap.find()));
	}

	@Test
	public void insertInOrder() {
		emptyHeap.insert(new Integer(40));
		assertTrue((new Integer(40)).equals(emptyHeap.find()));
		emptyHeap.insert(new Integer(30));
		assertTrue((new Integer(40)).equals(emptyHeap.find()));
		emptyHeap.insert(new Integer(20));
		assertTrue((new Integer(40)).equals(emptyHeap.find()));
	}
	
	@Test
	public void insertDeepOutOfOrder() {
		emptyHeap.insert(new Integer(30));
		assertTrue((new Integer(30)).equals(emptyHeap.find()));
		emptyHeap.insert(new Integer(25));
		assertTrue((new Integer(30)).equals(emptyHeap.find()));
		emptyHeap.insert(new Integer(20));
		assertTrue((new Integer(30)).equals(emptyHeap.find()));
		emptyHeap.insert(new Integer(50));
		assertTrue((new Integer(50)).equals(emptyHeap.find()));
	}

	@Test
	public void insertDeepOutOfOrderRightSide() {
		emptyHeap.insert(new Integer(30));
		assertTrue((new Integer(30)).equals(emptyHeap.find()));
		emptyHeap.insert(new Integer(25));
		assertTrue((new Integer(30)).equals(emptyHeap.find()));
		emptyHeap.insert(new Integer(20));
		assertTrue((new Integer(30)).equals(emptyHeap.find()));
		emptyHeap.insert(new Integer(15));
		assertTrue((new Integer(30)).equals(emptyHeap.find()));
		emptyHeap.insert(new Integer(50));
		assertTrue((new Integer(50)).equals(emptyHeap.find()));
	}
	
	@Test
	public void removeFromEmpty() {
		assertTrue(emptyHeap.remove() == null);
	}
	
	@Test
	public void removeFromOne() {
		emptyHeap.insert(new Integer(1));
		assertTrue(emptyHeap.find().equals(new Integer(1)));
		assertTrue(emptyHeap.remove().equals(new Integer(1)));
	}

	@Test
	public void removeFromTwo() {
		emptyHeap.insert(new Integer(1));
		emptyHeap.insert(new Integer(2));
		assertTrue(emptyHeap.find().equals(new Integer(2)));
		assertTrue(emptyHeap.remove().equals(new Integer(2)));
		assertTrue(emptyHeap.find().equals(new Integer(1)));
	}
	
	@Test
	public void removeRightChildGreater() {
		emptyHeap.insert(new Integer(40));
		emptyHeap.insert(new Integer(20));
		emptyHeap.insert(new Integer(30));
		assertTrue(emptyHeap.remove().equals(new Integer(40)));
		assertTrue(emptyHeap.find().equals(new Integer(30)));
	}
	
	@Test
	public void removeMultipleElements() {
		emptyHeap.insert(new Integer(10));
		emptyHeap.insert(new Integer(20));
		emptyHeap.insert(new Integer(40));
		emptyHeap.insert(new Integer(70));
		emptyHeap.insert(new Integer(35));
		emptyHeap.insert(new Integer(57));
		emptyHeap.insert(new Integer(13));
		assertTrue(emptyHeap.remove().equals(new Integer(70)));
		assertTrue(emptyHeap.remove().equals(new Integer(57)));
		assertTrue(emptyHeap.remove().equals(new Integer(40)));
		assertTrue(emptyHeap.remove().equals(new Integer(35)));
		assertTrue(emptyHeap.remove().equals(new Integer(20)));
		assertTrue(emptyHeap.remove().equals(new Integer(13)));
		assertTrue(emptyHeap.remove().equals(new Integer(10)));
	}
	
}
