package binarysearchtree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

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

	public ArrayList<Integer> BFS() {
		Node currentNode = root;
		Queue<Node> queue = new LinkedList<>();
		ArrayList<Integer> results = new ArrayList<>();
		queue.add(currentNode);
		while (queue.size() > 0) {
			currentNode = queue.remove();
			results.add(currentNode.value);
			if (currentNode.left != null) {
				queue.add(currentNode.left);
			}
			if (currentNode.right != null) {
				queue.add(currentNode.right);
			}
		}
		return results;
	}

	public ArrayList<Integer> DFSPreOrder() {
		ArrayList<Integer> results = new ArrayList<>();

		class Traverse {
			Traverse(Node currentNode) {
				results.add(currentNode.value);
				if (currentNode.left != null) {
					new Traverse(currentNode.left);
				}
				if (currentNode.right != null) {
					new Traverse(currentNode.right);
				}
			}
		}
		new Traverse(root);
		return results;
	}

	public ArrayList<Integer> DFSInOrder() {
		ArrayList<Integer> results = new ArrayList<>();

		class Traverse {
			Traverse(Node currentNode) {

				if (currentNode.left != null) {
					new Traverse(currentNode.left);
				}
				results.add(currentNode.value);
				if (currentNode.right != null) {
					new Traverse(currentNode.right);
				}
			}
		}
		new Traverse(root);
		return results;
	}

	public ArrayList<Integer> DFSPostOrder() {
		ArrayList<Integer> results = new ArrayList<>();

		class Traverse {
			Traverse(Node currentNode) {
				if (currentNode.left != null) {
					new Traverse(currentNode.left);
				}
				if (currentNode.right != null) {
					new Traverse(currentNode.right);
				}
				results.add(currentNode.value);
			}
		}
		new Traverse(root);
		return results;
	}

	private Node rInsert(Node currentNode, int value) {
		if (currentNode == null)
			return new Node(value);

		if (value < currentNode.value) {
			currentNode.left = rInsert(currentNode.left, value);
		} else {
			currentNode.right = rInsert(currentNode.right, value);
		}

		return currentNode;
	}

	public void rInsert(int value) {
		if (root == null)
			root = new Node(value);
		rInsert(root, value);
	}

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
