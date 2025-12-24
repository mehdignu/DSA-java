package doublylinkedlist;

public class Node {
	int value;
	Node next;
	Node prev;

	Node(int value) {
		this.value = value;
	}

	public int getValue() {
		return this.value;
	}
}
