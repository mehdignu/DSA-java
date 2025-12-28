package heap;

import java.util.ArrayList;
import java.util.List;

public class Heap {

	private List<Integer> heap;

	public Heap() {
		this.heap = new ArrayList<>();
	}

	public List<Integer> getHeap() {
		return new ArrayList<>(heap);
	}

	private int leftChild(int index) {
		return (index * 2) + 1;
	}

	private int richtChild(int index) {
		return (index * 2) + 2;
	}

	private int getParent(int index) {
		return (index - 1) / 2;
	}

	private void swap(int index1, int index2) {
		int tmp = heap.get(index1);
		heap.set(index1, heap.get(index2));
		heap.set(index2, tmp);
	}

	public void insert(int value) {
		heap.add(value);
		int current = heap.size() - 1;
		while ((current > 0) && (heap.get(current) > heap.get(getParent(current)))) {
			swap(current, getParent(current));
			current = getParent(current);
		}
	}
}
