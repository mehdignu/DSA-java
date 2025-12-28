package hashtable;

import java.util.ArrayList;

// dealing with HasTable is O(1) under the assumption that we have a hash function that randomizes the insert
// and a big hashtable with indexes
public class HashTable {

	class Node {
		public String key;
		public int value;
		public Node next;

		public Node(String key, int value) {
			this.key = key;
			this.value = value;
		}

	}

	private int size = 7;
	private Node[] dataMap;

	public HashTable() {
		dataMap = new Node[size];
	}

	private int hash(String key) {

		int hash = 0;

		char[] charArray = key.toCharArray();

		for (int i = 0; i < charArray.length; i++) {
			int asciiValue = charArray[i];

			// 23 is a prime number so that we get a more random number
			hash = (hash + asciiValue * 23) % dataMap.length;
		}
		return hash;
	}

	public void set(String key, int value) {
		int index = hash(key);
		Node node = new Node(key, value);
		if (dataMap[index] == null) {
			dataMap[index] = node;
		} else {
			Node tmp = dataMap[index];
			while (tmp.next != null) {
				tmp = tmp.next;
			}
			tmp.next = node;
		}
	}

	public int get(String key) {
		int index = hash(key);
		if (dataMap[index] == null) {
			return 0;
		} else {
			Node tmp = dataMap[index];
			while (tmp != null) {
				if (tmp.key == key) {
					return tmp.value;
				}
				tmp = tmp.next;
			}
		}
		return 0;
	}

	public ArrayList keys() {
		ArrayList<String> al = new ArrayList<>();
		for (int i = 0; i < dataMap.length; i++) {
			Node tmp = dataMap[i];
			while (tmp != null) {
				al.add(tmp.key);
				tmp = tmp.next;
			}
		}

		return al;
	}

	public void printTable() {
		for (int i = 0; i < dataMap.length; i++) {
			System.out.println(i + " :");
			Node tmp = dataMap[i];
			while (tmp != null) {
				System.out.println("{ " + tmp.key + " = " + tmp.value + " }");
				tmp = tmp.next;
			}
		}
	}
}
