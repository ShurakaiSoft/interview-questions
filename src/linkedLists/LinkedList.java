package linkedLists;

public class LinkedList {
	private class Node {
		public Object data;
		public Node next;
		public Node(Object data) {
			this.data = data;
			this.next = null;
		}
	}
	
	private Node head;
	private Node tail;
	private int size;

	public LinkedList() {
		head = null;
		tail = null;
		size = 0;
	}
	
	/**
	 * Adds data to the end of the list.
	 * 
	 * @param data
	 */
	public void append(Object data) {
		Node newNode = new Node(data);

		if (tail == null) {
			head = newNode;
			tail = newNode;
		} else {
			tail.next = newNode;
			tail = newNode;
		}
		size++;
	}
	
	/**
	 * 
	 * 
	 * @param index of data to return.
	 * @return null if it doesn't exist, or data at given index.
	 */
	public Object remove(int index) {
		if (index >= size) {
			return null;
		}
		Node requestedIndex = null;
		
		if (index == 0) {
			requestedIndex = head;
			head = head.next;
			if (tail == requestedIndex) {
				tail = null;
			}
			size--;
			return requestedIndex.data;
		} else {
			Node cursor = head;
			index--;
			int count = 0;
			
			while (count < index) {
				cursor = cursor.next;
				count++;
			}
			requestedIndex = cursor.next;
			cursor.next = requestedIndex.next;
			if (cursor.next == null) {
				tail = cursor;
			}
			size--;
			return requestedIndex.data;
		}
		
	}
	
	
	/**
	 * Return the number of elements in the list.
	 * 
	 * @return number of elements.
	 */
	public int size() {
		return size;
	}
	
	
	/**
	 * Return the first index of the data in this list.
	 * @param data to look for
	 * @return zero based index, or -1 if it doesn't exist.
	 */
	public int find(Object data) {
		Node cursor =  head;
		int index = 0;
		while (cursor != null) {
			if (cursor.data.equals(data)) {
				return index;
			}
			cursor = cursor.next;
			index++;
		}
		return -1;
	}
	
	/**
	 * returns the data stored at the requested index.
	 * 
	 * @param index location of data to retreive
	 * @return data requested or null if error.
	 */
	public Object getData(int index) {
		if (index >= size) {
			return null;
		}
		if (index == size - 1) {
			return tail.data;
		}
		Node cursor = head;
		for (int i = 0; i < index; i++) {
			cursor = cursor.next;
		}
		return cursor.data;
	}
	
}
