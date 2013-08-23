package trees;

import java.util.ArrayList;
import java.util.List;

public class Heap<E extends Comparable<E>> {
	private List<E> heap;
	private boolean minHeap;

	public Heap(int size, boolean minHeap) {
		heap = new ArrayList<E>(size);
		this.minHeap = minHeap;
	}
	
	public E find() {
		if (this.heap.isEmpty()) {
			return null;
		}
		return heap.get(0);
	}
	
	public void insert(E data) {
		int childIndex = heap.size();
		int parentIndex = getParentIndex(childIndex);
		heap.add(data);
		
		
		if (heap.size() > 1) {
			while (heap.get(childIndex).compareTo(heap.get(parentIndex)) > 0) {
				E temp = heap.get(childIndex);
				heap.set(childIndex, heap.get(parentIndex));
				heap.set(parentIndex, temp);
				
				if (parentIndex == 0) {
					break;
				}
				childIndex = parentIndex;
				parentIndex = getParentIndex(childIndex);
			}
		}
	}
	
	public E remove() {
		if (this.heap.isEmpty()) {
			return null;
		}
		if (heap.size() == 1) {
			return heap.remove(0);
		}
		E top = heap.get(0);
		heap.set(0, heap.remove(heap.size() - 1));
		
		shuffleDown(0);
		
		return top;
	}
	
	private void shuffleDown(int parent) {
		
		int leftChild = getLeftChildIndex(parent);
		int rightChild = leftChild + 1;
		
		int maxChild;
		
		if (leftChild < heap.size()) {
			maxChild = leftChild;
		} else {
			return; // no children
		}
		if (rightChild < heap.size() && heap.get(rightChild).compareTo(heap.get(leftChild)) > 0) {
			maxChild = rightChild;
		}

		if (heap.get(maxChild).compareTo(heap.get(parent)) > 0) {
			swap(parent, maxChild);
			shuffleDown(maxChild);
		}
	}
	
	private void swap(int a, int b) {
		E temp = heap.get(a);
		heap.set(a, heap.get(b));
		heap.set(b, temp);
	}
	
	public Object[] toArray() {
		return heap.toArray();
	}

	private int getParentIndex(int childIndex) {
		return (childIndex - 1) / 2;
	}
	
	private int getLeftChildIndex(int parentIndex) {
		return parentIndex * 2 + 1;
	}
	
}
