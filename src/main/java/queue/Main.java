package queue;

public class Main {
	public static void main(String[] args) {

		Queue queue = new Queue(5);

		queue.printFirst();
		queue.printLast();
		queue.printLength();
	}
}
