package stack;

public class Main {
	public static void main(String[] args) {
		Stack stack = new Stack(5);

		stack.push(4);
		stack.push(1);
		System.out.println(stack.pop());
		stack.printStack();
		stack.getHeight();
		stack.getTop();
	}
}
