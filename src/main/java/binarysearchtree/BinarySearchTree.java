package binarysearchtree;

public class BinarySearchTree {

	class Node {
		int value;
		Node left;
		Node right;

		Node(int value) {
			this.value = value;
		}
	}

	Node root;

	private boolean rContains(Node currentNode, int value) {
		if (currentNode == null)
			return false;
		if (currentNode.value == value)
			return true;

		if (value < currentNode.value) {
			return rContains(currentNode.left, value);
		} else {
			return rContains(currentNode.right, value);
		}
	}

	public boolean rContains(int value) {
		return rContains(root, value);
	}

	public boolean contains(int value) {

		Node tmp = root;

		while (tmp != null) {
			if (tmp.value < value) {
				tmp = tmp.right;
			} else if (tmp.value > value) {
				tmp = tmp.left;
			} else {
				return true;
			}
		}

		return false;
	}

	public boolean insert(int value) {
		Node newNode = new Node(value);
		if (root == null) {
			root = newNode;
			return true;
		}
		Node tmp = root;

		while (true) {
			if (tmp.value == value)
				return false;

			if (value > tmp.value) {
				if (tmp.right == null) {
					tmp.right = newNode;
					return true;
				}
				tmp = tmp.right;
			} else {
				if (tmp.left == null) {
					tmp.left = newNode;
					return true;
				}

				tmp = tmp.left;
			}

		}

	}
}
