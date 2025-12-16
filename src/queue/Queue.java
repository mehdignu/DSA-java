package queue;

class Node {
	int value;
	Node next;

	Node(int value) {
		this.value = value;
	}
}

public class Queue {

	Node first;
	Node last;
	private int length;

	public Queue(int value) {
		Node node = new Node(value);
		first = node;
		last = node;
		length = 1;
	}

	public void printQueue() {
		Node tmp = first;

		while (tmp != null) {
			System.out.println(tmp.value);
			tmp = tmp.next;
		}
	}

	public void printFirst() {
		System.out.println("First: " + this.first.value);
	}

	public void printLast() {
		System.out.println("Last: " + this.last.value);
	}

	public void printLength() {
		System.out.println("Length: " + this.length);
	}

}
