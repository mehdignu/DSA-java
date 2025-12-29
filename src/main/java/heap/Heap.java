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

	private int rightChild(int index) {
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

	public Integer remove() {
		if (heap.size() == 0)
			return null;
		if (heap.size() == 1)
			return heap.remove(0);
		int maxItem = heap.get(0);
		heap.set(0, heap.get(heap.size() - 1));
		sinkDown(0);
		return maxItem;

	}

	public void sinkDown(int index) {
		if (heap.size() == 1)
			return;
		int maxIndex = index;
		while (true) {
			int rightIndex = rightChild(index);
			int leftIndex = leftChild(index);
			if (leftIndex < heap.size() && heap.get(leftIndex) > heap.get(maxIndex)) {
				maxIndex = leftIndex;
			}
			if (rightIndex < heap.size() && heap.get(rightIndex) > heap.get(maxIndex)) {
				maxIndex = rightIndex;
			}

			if (maxIndex != index) {
				swap(index, maxIndex);
				index = maxIndex;
			} else {
				return;
			}
		}
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
