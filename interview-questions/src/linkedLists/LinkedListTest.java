package linkedLists;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class LinkedListTest {
	private LinkedList emptyList = null;
	private LinkedList nonEmptyList = null;

	@Before
	public void setUp() throws Exception {
		emptyList = new LinkedList();
		nonEmptyList = new LinkedList();
		
		nonEmptyList.append(new Integer(7));
		nonEmptyList.append(new Integer(11));
		nonEmptyList.append(new Integer(17));
	}

	@Test
	public void testSize() {
		assertTrue(emptyList.size() == 0);
		assertTrue(nonEmptyList.size() == 3);
	}
	
	@Test
	public void testFindIsFirst() {
		assertTrue(nonEmptyList.find(new Integer(7)) == 0);
	}
	
	@Test
	public void testFindOnEmptyList() {
		assertTrue(emptyList.find(new Integer(11)) == -1);
	}
	
	@Test
	public void testFindIsLast() {
		assertTrue(nonEmptyList.find(new Integer(17)) == 2);
	}
	
	@Test
	public void testGetDataAtIndexOf() {
		assertTrue(nonEmptyList.getData(1).equals(new Integer(11)));
	}
	
	@Test
	public void testGetDataEmpty() {
		assertTrue(emptyList.getData(5) == null);
	}
	
	@Test
	public void testGetDataAtIndexOfStart() {
		assertTrue(nonEmptyList.getData(0).equals(new Integer(7)));
	}
	
	@Test
	public void testGetDataAtIndexOfEnd() {
		assertTrue(nonEmptyList.getData(2).equals(new Integer(17)));
	}

	@Test
	public void testAppendData() {
		Integer data = new Integer(31);
		nonEmptyList.append(data);
		assertTrue(nonEmptyList.size() == 4);
		assertTrue(data.equals(nonEmptyList.getData(3)));
	}
	
	@Test
	public void testRemoveEmpty() {
		assertTrue(emptyList.remove(0) == null);
	}
	
	@Test
	public void testRemoveHead() {
		int size = nonEmptyList.size();
		Object removedData = nonEmptyList.remove(0);
		assertTrue(nonEmptyList.size() == size - 1);
		assertTrue((new Integer(7)).equals(removedData));
	}
	
	@Test
	public void testRemoveMiddle() {
		int size = nonEmptyList.size();
		Object removedData = nonEmptyList.remove(1);
		assertTrue(nonEmptyList.size() == size - 1);
		assertTrue((new Integer(7)).equals(removedData) == false);
		assertTrue((new Integer(17)).equals(removedData) == false);
		assertTrue((new Integer(11)).equals(removedData));
	}
	
	@Test
	public void testRemoveTail() {
		int size = nonEmptyList.size();
		Object removedData = nonEmptyList.remove(2);
		assertTrue(nonEmptyList.size() == size - 1);
		assertTrue((new Integer(7)).equals(removedData) == false);
		assertTrue((new Integer(11)).equals(removedData) == false);
		assertTrue((new Integer(17)).equals(removedData));
	}
	
	@Test
	public void testStressLinkedList() {
		Integer data = new Integer(13);
		emptyList.append(new Integer(1));
		emptyList.remove(0);
		emptyList.append(new Integer(1));
		emptyList.append(new Integer(2));
		emptyList.remove(1);
		emptyList.append(new Integer(3));
		emptyList.append(new Integer(5));
		emptyList.remove(2);
		emptyList.append(data);
		assertTrue(emptyList.size() == 3);
		assertTrue(data.equals(emptyList.getData(2)));
	}
	
}
