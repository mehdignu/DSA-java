public class DoublyLinkedList {

	private DLLNode head;
	private DLLNode tail;
	private int length;

	public DoublyLinkedList(int value) {
		DLLNode node = new DLLNode(value);
		head = node;
		tail = node;
		length = 1;
	}

	public void getLength() {
		System.out.print(this.length);
	}

	public void append(int value) {
		DLLNode dllNode = new DLLNode(value);

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

	public DLLNode removeLast() {
		if (length == 0) {
			return null;
		}

		if (length == 1) {
			DLLNode tmp = head;
			head = null;
			tail = null;
			length--;
			return tmp;
		}

		DLLNode tmp = tail;
		tail = tmp.prev;
		tail.next = null;
		tmp.prev = null;
		length--;
		return tmp;
	}

	public void prepend(int value) {
		DLLNode newNode = new DLLNode(value);

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

	public DLLNode removeFirst() {
		if (length == 0) {
			return null;
		}
		DLLNode tmp = head;
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

	public DLLNode Get(int index) {
		if (index >= length || index < 0) {
			return null;
		}

		DLLNode tmp = head;
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
		DLLNode tmp = Get(index);
		if (tmp != null) {
			tmp.value = value;
			return true;
		} else {
			return false;
		}
	}

	public void printList() {
		for (int i = 0; i < length; i++) {
			System.out.println(head.value);
			head = head.next;
		}
	}

}
