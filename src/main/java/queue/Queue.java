package queue;

public class Queue {

	class Node {
		int value;
		Node next;

		Node(int value) {
			this.value = value;
		}
	}

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

	public void enqueue(int value) {
		Node newNode = new Node(value);

		if (length == 0) {
			first = newNode;
			last = newNode;
		} else {
			last.next = newNode;
			last = newNode;
			length++;
		}
		length++;
	}

	public Node dequeue() {
		if (length == 0)
			return null;
		Node tmp = first;
		if (length == 1) {
			first = null;
			last = null;
		} else {
			first = first.next;
			tmp.next = null;
		}

		length--;
		return tmp;
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
