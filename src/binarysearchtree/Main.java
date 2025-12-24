package binarysearchtree;

public class Main {
	public static void main(String[] args) {

		BinarySearchTree BST = new BinarySearchTree();
		BST.insert(47);
		BST.insert(21);
		BST.insert(76);
		BST.insert(18);
		BST.insert(52);
		BST.insert(82);
		BST.insert(27);

		System.out.println(BST.root.left.right.value);
		System.out.println(BST.contains(76));

	}
}
