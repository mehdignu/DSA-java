package binarysearchtree;

public class BinarySearchTree {
	Node root;

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
