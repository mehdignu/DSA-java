package hashtable;

public class HashTable {
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
