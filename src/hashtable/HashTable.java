package hashtable;

public class HashTable {
	private int size = 7;
	private Node[] dataMap;

	public HashTable() {
		dataMap = new Node[size];
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
