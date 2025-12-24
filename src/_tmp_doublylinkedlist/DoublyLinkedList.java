package doublylinkedlist;

public class DoublyLinkedList {

	private Node head;
	private Node tail;
	private int length;

	public DoublyLinkedList(int value) {
		Node node = new Node(value);
		head = node;
		tail = node;
		length = 1;
	}

	public void getLength() {
		System.out.print(this.length);
	}

	public void append(int value) {
		Node dllNode = new Node(value);

		if (length == 0) {
			head = dllNode;
			tail = dllNode;
		} else {
			tail.next = dllNode;
			dllNode.prev = tail;
			tail = dllNode;

		}
		length++;
	}

	public Node removeLast() {
		if (length == 0) {
			return null;
		}

		if (length == 1) {
			Node tmp = head;
			head = null;
			tail = null;
			length--;
			return tmp;
		}

		Node tmp = tail;
		tail = tmp.prev;
		tail.next = null;
		tmp.prev = null;
		length--;
		return tmp;
	}

	public void prepend(int value) {
		Node newNode = new Node(value);

		if (length == 0) {
			head = newNode;
			tail = newNode;

		} else {

			newNode.next = head;
			head.prev = newNode;
			head = newNode;
		}
		length++;
	}

	public Node removeFirst() {
		if (length == 0) {
			return null;
		}
		Node tmp = head;
		if (length == 1) {
			head = null;
			tail = null;
			length--;
			return tmp;
		}

		head = tmp.next;
		head.prev = null;
		tmp.next = null;
		length--;
		return tmp;
	}

	public Node Get(int index) {
		if (index >= length || index < 0) {
			return null;
		}

		Node tmp = head;
		if (index / 2 < length) {
			for (int i = 0; i < index; i++) {
				tmp = tmp.next;
			}

		} else {
			tmp = tail;
			for (int i = length - 1; i > index; i--) {
				tmp = tmp.prev;
			}
		}

		return tmp;

	}

	public boolean Set(int index, int value) {
		Node tmp = Get(index);
		if (tmp != null) {
			tmp.value = value;
			return true;
		} else {
			return false;
		}
	}

	public boolean Insert(int index, int value) {
		if (index > length || index < 0) {
			return false;
		}

		if (index == length) {
			append(value);
			return true;
		}

		if (index == 0) {
			prepend(value);
			return true;
		}

		Node newNode = new Node(value);
		Node before = Get(index - 1);
		Node after = before.next;

		before.next = newNode;
		newNode.prev = before;

		after.prev = newNode;
		newNode.next = after;
		length++;
		return true;

	}

	public Node remove(int index) {
		if (index < 0 || index >= length) {
			return null;
		}

		Node node = Get(index);

		if (index == 0) {
			return removeFirst();
		}

		if (index == length - 1) {
			return removeLast();
		}
		node.next.prev = node.prev;
		node.prev.next = node.next;
		node.next = null;
		node.prev = null;
		length--;
		return node;

	}

	public void printList() {
		for (int i = 0; i < length; i++) {
			System.out.println(head.value);
			head = head.next;
		}
	}

}
