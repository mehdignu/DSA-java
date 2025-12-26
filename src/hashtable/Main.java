package hashtable;

public class Main {
	public static void main(String[] args) {
		HashTable ht = new HashTable();
		ht.set("nails", 1000);
		ht.set("tile", 50);
		ht.set("bolts", 200);
		ht.set("screws", 140);

		ht.printTable();

		System.out.println(ht.keys());
	}

}
