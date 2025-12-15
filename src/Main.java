public class Main {
	public static void main(String[] args) {
		DoublyLinkedList dll = new DoublyLinkedList(7);
		dll.append(2);
		dll.append(3);

		dll.prepend(60);
		dll.prepend(8);
		dll.removeFirst();
		dll.removeFirst();

		System.out.println(dll.Get(0).value);

	}
}
