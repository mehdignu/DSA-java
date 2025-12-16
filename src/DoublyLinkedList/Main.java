package doublylinkedlist;

public class Main {
	public static void main(String[] args) {
		DoublyLinkedList dll = new DoublyLinkedList(7);
		dll.append(2);
		dll.append(3);
		dll.append(60);
		dll.append(8);
		dll.remove(2);
		dll.printList();
	}
}
