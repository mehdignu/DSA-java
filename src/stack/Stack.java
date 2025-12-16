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

	public void push(int value) {
		Node stackNode = new Node(value);

		if (height == 0) {
			top = stackNode;
			height++;
		} else {
			stackNode.next = top;
			top = stackNode;
			height++;
		}

	}

	public void printStack() {
		Node tmp = top;
		for (int i = 0; i <= height - 1; i++) {
			System.out.println(tmp.value);
			tmp = tmp.next;
		}
	}

	public void getTop() {
		System.out.println("Top: " + this.top.value);
	}

	public void getHeight() {
		System.out.println("Height: " + this.height);
	}

}
