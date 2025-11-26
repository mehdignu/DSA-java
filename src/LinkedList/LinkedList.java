package LinkedList;

public class LinkedList {

    private Node head;
    private Node tail;
    private int length;

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public LinkedList(int value) {
        Node newNode = new Node(value);
        this.head = newNode;
        this.tail = newNode;
        this.length = 1;
    }

    public Node removeLast() {
        Node tmp = this.head;

        if (this.length == 0) return tmp;

        if (this.length == 1) {
            this.head = null;
            this.tail = null;
            this.length -= 1;
            return tmp;
        }

        while (tmp.next != this.tail) {
            tmp = tmp.next;
        }
        Node res = this.tail;
        this.tail = tmp;
        tail.next = null;
        this.length -= 1;
        return res;
    }

    public void append(int value) {
        Node newNode = new Node(value);

        if (this.length == 0){
            this.head = newNode;
            this.tail = newNode;
        } else {
            this.tail.next = newNode;
            this.tail = newNode;
        }
        length++;
    }

    public void printList() {
        Node tmp = this.head;

        while (tmp != null) {
            System.out.println(tmp.value);
            tmp = tmp.next;
        }
    }

}
