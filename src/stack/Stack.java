package stack;

class Node {
	int value;
	Node next;

	Node(int value) {
		this.value = value;
	}

}

public class Stack {

	private Node top;
	private int height;

	public Stack(int value) {
		Node node = new Node(value);
		this.top = node;
		this.height = 1;
	}
}
